package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotTrsService;
import com.company.project.biz.CsysPotTrsBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysPotTrsMapper;
import com.company.project.model.CsysPotTrs;
import com.company.project.model.CsysPotTrsExample;
import com.company.project.model.CsysUserView;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Component
@Transactional
public class CsysPotTrsBizImpl  implements CsysPotTrsBiz {
    @Resource
    private CsysPotTrsService csysPotTrsService;
	@Resource
    private CommonService commonService;
	@Resource
    private CsysPotTrsMapper csysPotTrsMapper;
    
	public CsysPotTrs getDataSettings(String id){
	
		CsysPotTrs csysPotTrs = new CsysPotTrs();
		csysPotTrs.setCsysPotTrsId(id);
   		csysPotTrs.setCsysPotTrsIsDelete("0");
		 
		return csysPotTrsService.selectOne(csysPotTrs);
		
	
	}
	public List<CsysPotTrs> getDataSettingsByCondition(CsysPotTrs csysPotTrs){
	
		 
   		csysPotTrs.setCsysPotTrsIsDelete("0");
		return csysPotTrsService.select(csysPotTrs);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotTrs> list = csysPotTrsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotTrs csysPotTrs){
	
		PageHelper.startPage(page, size);
		csysPotTrs.setCsysPotTrsIsDelete("0");
        List<CsysPotTrs> list = csysPotTrsService.select(csysPotTrs);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotTrs");
		csysPotTrs.setCsysPotTrsId(sequence);
		csysPotTrs.setCsysPotTrsCreateTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsCreateUser(baseUserView.getCsysUserId());
		csysPotTrs.setCsysPotTrsModifyTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsModifyUser(baseUserView.getCsysUserId());
		csysPotTrs.setCsysPotTrsIsDelete("0");
		csysPotTrsService.save(csysPotTrs);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs){
		csysPotTrs.setCsysPotTrsModifyTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsModifyUser(baseUserView.getCsysUserId());
		csysPotTrsService.update(csysPotTrs);
	
	}
	
	 
	public void deleteDataSettings(String ids){
	
		String [] idsArray=ids.split(",");
		String newids="";
		for(int i=0;i<idsArray.length;i++) {
			
			if(i==idsArray.length-1) {
				newids=newids+"'"+idsArray[i]+"'";
			}else {
				newids=newids+"'"+idsArray[i]+"',";
			}
			 
		}
		
		csysPotTrsService.deleteByIds(newids);
	
	}
	@Override
	public List<CsysPotTrs> getInitDataSettingsByCondition(CsysPotTrs csysPotTrs) {
		
		CsysPotTrsExample example=new CsysPotTrsExample();
		
		 
		CsysPotTrsExample.Criteria criteria =example.createCriteria();
	 
		criteria.andCsysPotCurrentIdIsNull();
		criteria.andCsysWorkflowIdEqualTo(csysPotTrs.getCsysWorkflowId());
		criteria.andCsysPotTrsIsDeleteEqualTo("0");
		 
		List<CsysPotTrs> list = csysPotTrsMapper.selectByExample(example);
		
		return null;
	}

	
}
