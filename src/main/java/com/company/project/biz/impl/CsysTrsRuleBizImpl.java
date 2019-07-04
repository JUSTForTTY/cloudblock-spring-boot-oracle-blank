package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsRuleService;
import com.company.project.biz.CsysTrsRuleBiz;
import com.company.project.model.CsysTrsRule;
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
public class CsysTrsRuleBizImpl  implements CsysTrsRuleBiz {
    @Resource
    private CsysTrsRuleService csysTrsRuleService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsRule getDataSettings(String id){
	
		CsysTrsRule csysTrsRule = new CsysTrsRule();
		csysTrsRule.setCsysTrsRuleId(id);
   		csysTrsRule.setCsysTrsRuleIsDelete("0");
		 
		return csysTrsRuleService.selectOne(csysTrsRule);
		
	
	}
	public List<CsysTrsRule> getDataSettingsByCondition(CsysTrsRule csysTrsRule){
	
		 
   		csysTrsRule.setCsysTrsRuleIsDelete("0");
		return csysTrsRuleService.select(csysTrsRule);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsRule> list = csysTrsRuleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRule csysTrsRule){
	
		PageHelper.startPage(page, size);
		csysTrsRule.setCsysTrsRuleIsDelete("0");
        List<CsysTrsRule> list = csysTrsRuleService.select(csysTrsRule);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRule csysTrsRule){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsRule");
		csysTrsRule.setCsysTrsRuleId(sequence);
		csysTrsRule.setCsysTrsRuleCreateTime(DateUtils.newTimestamp());
		csysTrsRule.setCsysTrsRuleCreateUser(csysUserView.getCsysUserId());
		csysTrsRule.setCsysTrsRuleModifyTime(DateUtils.newTimestamp());
		csysTrsRule.setCsysTrsRuleModifyUser(csysUserView.getCsysUserId());
		csysTrsRule.setCsysTrsRuleIsDelete("0");
		csysTrsRuleService.save(csysTrsRule);
		
		return csysTrsRule.getCsysTrsRuleId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRule csysTrsRule){
		csysTrsRule.setCsysTrsRuleModifyTime(DateUtils.newTimestamp());
		csysTrsRule.setCsysTrsRuleModifyUser(csysUserView.getCsysUserId());
		csysTrsRuleService.update(csysTrsRule);
	
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
		
		csysTrsRuleService.deleteByIds(newids);
	
	}

	
}
