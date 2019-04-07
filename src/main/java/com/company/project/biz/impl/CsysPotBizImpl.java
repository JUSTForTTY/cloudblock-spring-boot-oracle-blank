package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotService;
import com.company.project.biz.CsysPotBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysPot;
import com.company.project.model.CsysUserView;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysPotBizImpl  implements CsysPotBiz {
    @Resource
    private CsysPotService csysPotService;
	@Resource
    private CommonService commonService;
    
	public CsysPot getDataSettings(String id){
	
		CsysPot csysPot = new CsysPot();
		csysPot.setCsysPotId(id);
   		csysPot.setCsysPotIsDelete("0");
		 
		return csysPotService.selectOne(csysPot);
		
	
	}
	public List<CsysPot> getDataSettingsByCondition(CsysPot csysPot){
	
		 
   		csysPot.setCsysPotIsDelete("0");
		return csysPotService.select(csysPot);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPot> list = csysPotService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPot csysPot){
	
		PageHelper.startPage(page, size);
		csysPot.setCsysPotIsDelete("0");
        List<CsysPot> list = csysPotService.select(csysPot);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPot csysPot){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPot");
		csysPot.setCsysPotId(sequence);
		csysPot.setCsysPotCreateTime(DateUtils.newTimestamp());
		csysPot.setCsysPotCreateUser(baseUserView.getCsysUserId());
		csysPot.setCsysPotModifyTime(DateUtils.newTimestamp());
		csysPot.setCsysPotModifyUser(baseUserView.getCsysUserId());
		csysPot.setCsysPotIsDelete("0");
		csysPotService.save(csysPot);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPot csysPot){
		csysPot.setCsysPotModifyTime(DateUtils.newTimestamp());
		csysPot.setCsysPotModifyUser(baseUserView.getCsysUserId());
		csysPotService.update(csysPot);
	
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
		
		csysPotService.deleteByIds(newids);
	
	}

	
}
