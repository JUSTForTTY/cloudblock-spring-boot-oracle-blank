package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysWorkflowRunService;
import com.company.project.biz.CsysWorkflowRunBiz;
import com.company.project.outer.model.CsysUserView;
import com.company.project.outer.model.CsysWorkflowRun;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Component
@Transactional
public class CsysWorkflowRunBizImpl  implements CsysWorkflowRunBiz {
    @Resource
    private CsysWorkflowRunService csysWorkflowRunService;
	@Resource
    private CommonService commonService;
    
	public CsysWorkflowRun getDataSettings(String id){
	
		CsysWorkflowRun csysWorkflowRun = new CsysWorkflowRun();
		csysWorkflowRun.setCsysWorkflowRunId(id);
   		csysWorkflowRun.setCsysWorkflowRunIsDelete("0");
		 
		return csysWorkflowRunService.selectOne(csysWorkflowRun);
		
	
	}
	public List<CsysWorkflowRun> getDataSettingsByCondition(CsysWorkflowRun csysWorkflowRun){
	
		 
   		csysWorkflowRun.setCsysWorkflowRunIsDelete("0");
		return csysWorkflowRunService.select(csysWorkflowRun);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysWorkflowRun> list = csysWorkflowRunService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun){
	
		PageHelper.startPage(page, size);
		csysWorkflowRun.setCsysWorkflowRunIsDelete("0");
        List<CsysWorkflowRun> list = csysWorkflowRunService.select(csysWorkflowRun);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun){
		
		//获取sequence
		String sequence=commonService.getOracleSequence("CsysWorkflowRun");
		csysWorkflowRun.setCsysWorkflowRunId(sequence);
		csysWorkflowRun.setCsysWorkflowRunCreateTime(DateUtils.newTimestamp());
		csysWorkflowRun.setCsysWorkflowRunCreateUser(baseUserView.getCsysUserId());
		csysWorkflowRun.setCsysWorkflowRunModifyTime(DateUtils.newTimestamp());
		csysWorkflowRun.setCsysWorkflowRunModifyUser(baseUserView.getCsysUserId());
		csysWorkflowRun.setCsysWorkflowRunIsDelete("0");
		csysWorkflowRunService.save(csysWorkflowRun);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun){
		csysWorkflowRun.setCsysWorkflowRunModifyTime(DateUtils.newTimestamp());
		csysWorkflowRun.setCsysWorkflowRunModifyUser(baseUserView.getCsysUserId());
		csysWorkflowRunService.update(csysWorkflowRun);
	
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
		
		csysWorkflowRunService.deleteByIds(newids);
	
	}

	
}
