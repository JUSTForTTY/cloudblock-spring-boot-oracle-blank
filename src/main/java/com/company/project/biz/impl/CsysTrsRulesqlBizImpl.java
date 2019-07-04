package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsRulesqlService;
import com.company.project.biz.CsysTrsRulesqlBiz;
import com.company.project.model.CsysTrsRulesql;
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
public class CsysTrsRulesqlBizImpl  implements CsysTrsRulesqlBiz {
    @Resource
    private CsysTrsRulesqlService csysTrsRulesqlService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsRulesql getDataSettings(String id){
	
		CsysTrsRulesql csysTrsRulesql = new CsysTrsRulesql();
		csysTrsRulesql.setCsysTrsRulesqlId(id);
   		csysTrsRulesql.setCsysTrsRulesqlIsDelete("0");
		 
		return csysTrsRulesqlService.selectOne(csysTrsRulesql);
		
	
	}
	public List<CsysTrsRulesql> getDataSettingsByCondition(CsysTrsRulesql csysTrsRulesql){
	
		 
   		csysTrsRulesql.setCsysTrsRulesqlIsDelete("0");
		return csysTrsRulesqlService.select(csysTrsRulesql);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsRulesql> list = csysTrsRulesqlService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql){
	
		PageHelper.startPage(page, size);
		csysTrsRulesql.setCsysTrsRulesqlIsDelete("0");
        List<CsysTrsRulesql> list = csysTrsRulesqlService.select(csysTrsRulesql);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsRulesql");
		csysTrsRulesql.setCsysTrsRulesqlId(sequence);
		csysTrsRulesql.setCsysTrsRulesqlCreateTime(DateUtils.newTimestamp());
		csysTrsRulesql.setCsysTrsRulesqlCreateUser(csysUserView.getCsysUserId());
		csysTrsRulesql.setCsysTrsRulesqlModifyTime(DateUtils.newTimestamp());
		csysTrsRulesql.setCsysTrsRulesqlModifyUser(csysUserView.getCsysUserId());
		csysTrsRulesql.setCsysTrsRulesqlIsDelete("0");
		csysTrsRulesqlService.save(csysTrsRulesql);
		
		return csysTrsRulesql.getCsysTrsRulesqlId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql){
		csysTrsRulesql.setCsysTrsRulesqlModifyTime(DateUtils.newTimestamp());
		csysTrsRulesql.setCsysTrsRulesqlModifyUser(csysUserView.getCsysUserId());
		csysTrsRulesqlService.update(csysTrsRulesql);
	
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
		
		csysTrsRulesqlService.deleteByIds(newids);
	
	}

	
}
