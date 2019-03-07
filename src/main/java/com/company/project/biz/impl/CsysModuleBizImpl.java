package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysModuleService;
import com.company.project.biz.CsysModuleBiz;
import com.company.project.outer.model.CsysModule;
import com.company.project.outer.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/28.
 */
@Component
@Transactional
public class CsysModuleBizImpl  implements CsysModuleBiz {
    @Resource
    private CsysModuleService csysModuleService;
	@Resource
    private CommonService commonService;
    
	public CsysModule getDataSettings(String id){
	
		CsysModule csysModule = new CsysModule();
		csysModule.setCsysModuleId(id);
   		csysModule.setCsysModuleIsDelete("0");
		 
		return csysModuleService.selectOne(csysModule);
		
	
	}
	public List<CsysModule> getDataSettingsByCondition(CsysModule csysModule){
	
		 
   		csysModule.setCsysModuleIsDelete("0");
		return csysModuleService.select(csysModule);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysModule> list = csysModuleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysModule csysModule){
	
		PageHelper.startPage(page, size);
		csysModule.setCsysModuleIsDelete("0");
        List<CsysModule> list = csysModuleService.select(csysModule);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysModule csysModule){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysModule");
		csysModule.setCsysModuleId(sequence);
		csysModule.setCsysModuleCreateTime(DateUtils.newTimestamp());
		csysModule.setCsysModuleCreateUser(baseUserView.getCsysUserId());
		csysModule.setCsysModuleModifyTime(DateUtils.newTimestamp());
		csysModule.setCsysModuleModifyUser(baseUserView.getCsysUserId());
		csysModule.setCsysModuleIsDelete("0");
		csysModuleService.save(csysModule);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysModule csysModule){
		csysModule.setCsysModuleModifyTime(DateUtils.newTimestamp());
		csysModule.setCsysModuleModifyUser(baseUserView.getCsysUserId());
		csysModuleService.update(csysModule);
	
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
		
		csysModuleService.deleteByIds(newids);
	
	}

	
}
