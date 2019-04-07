package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysExcelAttachService;
import com.company.project.biz.CsysExcelAttachBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysExcelAttach;
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
public class CsysExcelAttachBizImpl  implements CsysExcelAttachBiz {
    @Resource
    private CsysExcelAttachService csysExcelAttachService;
	@Resource
    private CommonService commonService;
    
	public CsysExcelAttach getDataSettings(String id){
	
		CsysExcelAttach csysExcelAttach = new CsysExcelAttach();
		csysExcelAttach.setCsysExcelAttachId(id);
   		csysExcelAttach.setCsysExcelAttachIsDelete("0");
		 
		return csysExcelAttachService.selectOne(csysExcelAttach);
		
	
	}
	public List<CsysExcelAttach> getDataSettingsByCondition(CsysExcelAttach csysExcelAttach){
	
		 
   		csysExcelAttach.setCsysExcelAttachIsDelete("0");
		return csysExcelAttachService.select(csysExcelAttach);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysExcelAttach> list = csysExcelAttachService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysExcelAttach csysExcelAttach){
	
		PageHelper.startPage(page, size);
		csysExcelAttach.setCsysExcelAttachIsDelete("0");
        List<CsysExcelAttach> list = csysExcelAttachService.select(csysExcelAttach);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysExcelAttach csysExcelAttach){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysExcelAttach");
		csysExcelAttach.setCsysExcelAttachId(sequence);
		csysExcelAttach.setCsysExcelAttachCreateTime(DateUtils.newTimestamp());
		csysExcelAttach.setCsysExcelAttachCreateUser(baseUserView.getCsysUserId());
		csysExcelAttach.setCsysExcelAttachModifyTime(DateUtils.newTimestamp());
		csysExcelAttach.setCsysExcelAttachModifyUser(baseUserView.getCsysUserId());
		csysExcelAttach.setCsysExcelAttachIsDelete("0");
		csysExcelAttachService.save(csysExcelAttach);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysExcelAttach csysExcelAttach){
		csysExcelAttach.setCsysExcelAttachModifyTime(DateUtils.newTimestamp());
		csysExcelAttach.setCsysExcelAttachModifyUser(baseUserView.getCsysUserId());
		csysExcelAttachService.update(csysExcelAttach);
	
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
		
		csysExcelAttachService.deleteByIds(newids);
	
	}

	
}
