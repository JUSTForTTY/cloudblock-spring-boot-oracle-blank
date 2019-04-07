package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysExcelImportService;
import com.company.project.biz.CsysExcelImportBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysExcelImport;
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
public class CsysExcelImportBizImpl  implements CsysExcelImportBiz {
    @Resource
    private CsysExcelImportService csysExcelImportService;
	@Resource
    private CommonService commonService;
    
	public CsysExcelImport getDataSettings(String id){
	
		CsysExcelImport csysExcelImport = new CsysExcelImport();
		csysExcelImport.setCsysExcelImportId(id);
   		csysExcelImport.setCsysExcelImportIsDelete("0");
		 
		return csysExcelImportService.selectOne(csysExcelImport);
		
	
	}
	public List<CsysExcelImport> getDataSettingsByCondition(CsysExcelImport csysExcelImport){
	
		 
   		csysExcelImport.setCsysExcelImportIsDelete("0");
		return csysExcelImportService.select(csysExcelImport);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysExcelImport> list = csysExcelImportService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysExcelImport csysExcelImport){
	
		PageHelper.startPage(page, size);
		csysExcelImport.setCsysExcelImportIsDelete("0");
        List<CsysExcelImport> list = csysExcelImportService.select(csysExcelImport);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysExcelImport csysExcelImport){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysExcelImport");
		csysExcelImport.setCsysExcelImportId(sequence);
		csysExcelImport.setCsysExcelImportCreateTime(DateUtils.newTimestamp());
		csysExcelImport.setCsysExcelImportCreateUser(baseUserView.getCsysUserId());
		csysExcelImport.setCsysExcelImportModifyTime(DateUtils.newTimestamp());
		csysExcelImport.setCsysExcelImportModifyUser(baseUserView.getCsysUserId());
		csysExcelImport.setCsysExcelImportIsDelete("0");
		csysExcelImportService.save(csysExcelImport);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysExcelImport csysExcelImport){
		csysExcelImport.setCsysExcelImportModifyTime(DateUtils.newTimestamp());
		csysExcelImport.setCsysExcelImportModifyUser(baseUserView.getCsysUserId());
		csysExcelImportService.update(csysExcelImport);
	
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
		
		csysExcelImportService.deleteByIds(newids);
	
	}

	
}
