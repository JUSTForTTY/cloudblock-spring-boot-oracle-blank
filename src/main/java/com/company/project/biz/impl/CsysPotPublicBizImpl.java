package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotPublicService;
import com.company.project.biz.CsysPotPublicBiz;
import com.company.project.model.CsysPotPublic;
import com.company.project.model.CsysPotPublicExample;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflow;
import com.company.project.model.CsysWorkflowExample;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysPotPublicMapper;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/15.
 */
@Component
@Transactional
public class CsysPotPublicBizImpl  implements CsysPotPublicBiz {
    @Resource
    private CsysPotPublicService csysPotPublicService;
	@Resource
    private CommonService commonService;
	@Resource
    private CsysPotPublicMapper csysPotPublicMapper;
    
	public CsysPotPublic getDataSettings(String id){
	
		CsysPotPublic csysPotPublic = new CsysPotPublic();
		csysPotPublic.setCsysPotPublicId(id);
   		csysPotPublic.setCsysPotPublicIsDelete("0");
		 
		return csysPotPublicService.selectOne(csysPotPublic);
		
	
	}
	public List<CsysPotPublic> getDataSettingsByCondition(CsysPotPublic csysPotPublic){
	
		 
   		csysPotPublic.setCsysPotPublicIsDelete("0");
		return csysPotPublicService.select(csysPotPublic);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotPublic> list = csysPotPublicService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotPublic csysPotPublic){
	
		PageHelper.startPage(page, size);
		csysPotPublic.setCsysPotPublicIsDelete("0");
        List<CsysPotPublic> list = csysPotPublicService.select(csysPotPublic);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotPublic csysPotPublic){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotPublic");
		csysPotPublic.setCsysPotPublicId(sequence);
		csysPotPublic.setCsysPotPublicCreateTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicCreateUser(csysUserView.getCsysUserId());
		csysPotPublic.setCsysPotPublicModifyTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicModifyUser(csysUserView.getCsysUserId());
		csysPotPublic.setCsysPotPublicIsDelete("0");
		csysPotPublicService.save(csysPotPublic);
		
		return csysPotPublic.getCsysPotPublicId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotPublic csysPotPublic){
		csysPotPublic.setCsysPotPublicModifyTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicModifyUser(csysUserView.getCsysUserId());
		csysPotPublicService.update(csysPotPublic);
	
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
		
		csysPotPublicService.deleteByIds(newids);
	
	}
	@Override
	public PageInfo getSearchPageDataSettingsByCondition(Integer page, Integer size, CsysUserView csysUserView,
			CsysPotPublic csysPotPublic) {
		 
		PageHelper.startPage(page, size);
		 
		CsysPotPublicExample example=new CsysPotPublicExample();
		
		example.setOrderByClause("CSYS_POT_PUBLIC_MODIFY_TIME DESC");
		
		CsysPotPublicExample.Criteria criteria =example.createCriteria();
		if(null!=csysPotPublic.getCsysPotPublicName()) {
			criteria.andCsysPotPublicNameLike("%"+csysPotPublic.getCsysPotPublicName()+"%");
		}
		if(null!=csysPotPublic.getCsysPotPublicDesc()) {
			criteria.andCsysPotPublicDescLike("%"+csysPotPublic.getCsysPotPublicDesc()+"%");
		}
		criteria.andCsysPotPublicIsDeleteEqualTo("0");
		 
		List<CsysPotPublic> list = csysPotPublicMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	}

	
}
