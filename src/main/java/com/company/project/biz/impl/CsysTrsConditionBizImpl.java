package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsConditionService;
import com.company.project.biz.CsysTrsConditionBiz;
import com.company.project.outer.model.CsysTrsCondition;
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
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysTrsConditionBizImpl  implements CsysTrsConditionBiz {
    @Resource
    private CsysTrsConditionService csysTrsConditionService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsCondition getDataSettings(String id){
	
		CsysTrsCondition csysTrsCondition = new CsysTrsCondition();
		csysTrsCondition.setCsysTrsConditionId(id);
   		csysTrsCondition.setCsysTrsConditionIsDelete("0");
		 
		return csysTrsConditionService.selectOne(csysTrsCondition);
		
	
	}
	public List<CsysTrsCondition> getDataSettingsByCondition(CsysTrsCondition csysTrsCondition){
	
		 
   		csysTrsCondition.setCsysTrsConditionIsDelete("0");
		return csysTrsConditionService.select(csysTrsCondition);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsCondition> list = csysTrsConditionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsCondition csysTrsCondition){
	
		PageHelper.startPage(page, size);
		csysTrsCondition.setCsysTrsConditionIsDelete("0");
        List<CsysTrsCondition> list = csysTrsConditionService.select(csysTrsCondition);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsCondition csysTrsCondition){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsCondition");
		csysTrsCondition.setCsysTrsConditionId(sequence);
		csysTrsCondition.setCsysTrsConditionCreateTime(DateUtils.newTimestamp());
		csysTrsCondition.setCsysTrsConditionCreateUser(baseUserView.getCsysUserId());
		csysTrsCondition.setCsysTrsConditionModifyTime(DateUtils.newTimestamp());
		csysTrsCondition.setCsysTrsConditionModifyUser(baseUserView.getCsysUserId());
		csysTrsCondition.setCsysTrsConditionIsDelete("0");
		csysTrsConditionService.save(csysTrsCondition);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsCondition csysTrsCondition){
		csysTrsCondition.setCsysTrsConditionModifyTime(DateUtils.newTimestamp());
		csysTrsCondition.setCsysTrsConditionModifyUser(baseUserView.getCsysUserId());
		csysTrsConditionService.update(csysTrsCondition);
	
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
		
		csysTrsConditionService.deleteByIds(newids);
	
	}

	
}
