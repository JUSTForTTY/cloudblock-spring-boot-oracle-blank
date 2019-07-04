package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsRuleViewService;
import com.company.project.biz.CsysTrsRuleViewBiz;
import com.company.project.model.CsysTrsRuleView;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Component
@Transactional
public class CsysTrsRuleViewBizImpl  implements CsysTrsRuleViewBiz {
    @Resource
    private CsysTrsRuleViewService csysTrsRuleViewService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsRuleView getDataSettings(String id){
	
		CsysTrsRuleView csysTrsRuleView = new CsysTrsRuleView();
		csysTrsRuleView.setCsysTrsRuleId(id);
   		
		return csysTrsRuleViewService.selectOne(csysTrsRuleView);
		
	
	}
	public List<CsysTrsRuleView> getDataSettingsByCondition(CsysTrsRuleView csysTrsRuleView){
	
		 
   		
		return csysTrsRuleViewService.select(csysTrsRuleView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsRuleView> list = csysTrsRuleViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView){
	
		PageHelper.startPage(page, size);
		
        List<CsysTrsRuleView> list = csysTrsRuleViewService.select(csysTrsRuleView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView){
		
		//获取sequence
	
		 
		csysTrsRuleViewService.save(csysTrsRuleView);
		
		return null;
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView){
		 
		csysTrsRuleViewService.update(csysTrsRuleView);
	
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
		
		csysTrsRuleViewService.deleteByIds(newids);
	
	}

	
}
