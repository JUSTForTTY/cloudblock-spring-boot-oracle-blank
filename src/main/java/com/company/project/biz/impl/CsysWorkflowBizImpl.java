package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysWorkflowService;
import com.company.project.biz.CsysWorkflowBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysWorkflowMapper;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflow;
import com.company.project.model.CsysWorkflowExample;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/25.
 */
@Component
@Transactional
public class CsysWorkflowBizImpl  implements CsysWorkflowBiz {
    @Resource
    private CsysWorkflowService csysWorkflowService;
	@Resource
    private CommonService commonService;
	@Resource
    private CsysWorkflowMapper csysWorkflowMapper;
    
	public CsysWorkflow getDataSettings(String id){
	
		CsysWorkflow csysWorkflow = new CsysWorkflow();
		csysWorkflow.setCsysWorkflowId(id);
   		csysWorkflow.setCsysWorkflowIsDelete("0");
		 
		return csysWorkflowService.selectOne(csysWorkflow);
		
	
	}
	public List<CsysWorkflow> getDataSettingsByCondition(CsysWorkflow csysWorkflow){
	
		 
   		csysWorkflow.setCsysWorkflowIsDelete("0");
		return csysWorkflowService.select(csysWorkflow);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysWorkflow> list = csysWorkflowService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysWorkflow csysWorkflow){
	
		PageHelper.startPage(page, size);
		csysWorkflow.setCsysWorkflowIsDelete("0");
       List<CsysWorkflow> list = csysWorkflowService.select(csysWorkflow);      
//        CsysWorkflowExample example=new CsysWorkflowExample();
//		
//		example.setOrderByClause("CSYS_WORKFLOW_MODIFY_TIME DESC");
//		
//		CsysWorkflowExample.Criteria criteria =example.createCriteria();
//	 
//		criteria.andCsysWorkflowNameLike(csysWorkflow.getCsysWorkflowName());
//		criteria.andCsysWorkflowIsDeleteEqualTo("0");
//		criteria.andCsysWorkflowTypeEqualTo(csysWorkflow.getCsysWorkflowType());
//		List<CsysWorkflow> list = csysWorkflowMapper.selectByExample(example);
        
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysWorkflow csysWorkflow){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysWorkflow");
		csysWorkflow.setCsysWorkflowId(sequence);
		csysWorkflow.setCsysWorkflowCreateTime(DateUtils.newTimestamp());
		csysWorkflow.setCsysWorkflowCreateUser(baseUserView.getCsysUserId());
		csysWorkflow.setCsysWorkflowModifyTime(DateUtils.newTimestamp());
		csysWorkflow.setCsysWorkflowModifyUser(baseUserView.getCsysUserId());
		csysWorkflow.setCsysWorkflowIsDelete("0");
		csysWorkflowService.save(csysWorkflow);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysWorkflow csysWorkflow){
		csysWorkflow.setCsysWorkflowModifyTime(DateUtils.newTimestamp());
		csysWorkflow.setCsysWorkflowModifyUser(baseUserView.getCsysUserId());
		csysWorkflowService.update(csysWorkflow);
	
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
		
		csysWorkflowService.deleteByIds(newids);
	
	}
	@Override
	public PageInfo getSearchPageDataSettingsByCondition(Integer page, Integer size, CsysUserView baseUserView,
			CsysWorkflow csysWorkflow) {
		
		PageHelper.startPage(page, size);
        CsysWorkflowExample example=new CsysWorkflowExample();
		
		example.setOrderByClause("CSYS_WORKFLOW_MODIFY_TIME DESC");
		
		CsysWorkflowExample.Criteria criteria =example.createCriteria();
		if(null!=csysWorkflow.getCsysWorkflowName()) {
			criteria.andCsysWorkflowNameLike("%"+csysWorkflow.getCsysWorkflowName()+"%");
		}
		if(null!=csysWorkflow.getCsysWorkflowType()) {
			criteria.andCsysWorkflowTypeEqualTo(csysWorkflow.getCsysWorkflowType());
		}
		criteria.andCsysWorkflowIsDeleteEqualTo("0");
		 
		List<CsysWorkflow> list = csysWorkflowMapper.selectByExample(example);
        
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
		 
	}

	
}
