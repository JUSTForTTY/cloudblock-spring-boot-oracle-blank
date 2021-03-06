package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysSequenceService;
import com.company.project.biz.CsysSequenceBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysSequence;
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
public class CsysSequenceBizImpl  implements CsysSequenceBiz {
    @Resource
    private CsysSequenceService csysSequenceService;
	@Resource
    private CommonService commonService;
    
	public CsysSequence getDataSettings(String id){
	
		CsysSequence csysSequence = new CsysSequence();
//		csysSequence.setCsysSequenceId(id);
//   		csysSequence.setCsysSequenceIsDelete("0");
		 
		return csysSequenceService.selectOne(csysSequence);
		
	
	}
	public List<CsysSequence> getDataSettingsByCondition(CsysSequence csysSequence){
	
		 
   		//csysSequence.setCsysSequenceIsDelete("0");
		return csysSequenceService.select(csysSequence);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysSequence> list = csysSequenceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysSequence csysSequence){
	
		PageHelper.startPage(page, size);
		//csysSequence.setCsysSequenceIsDelete("0");
        List<CsysSequence> list = csysSequenceService.select(csysSequence);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysSequence csysSequence){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysSequence");
//		csysSequence.setCsysSequenceId(sequence);
//		csysSequence.setCsysSequenceCreateTime(DateUtils.newTimestamp());
//		csysSequence.setCsysSequenceCreateUser(baseUserView.getCsysUserId());
//		csysSequence.setCsysSequenceModifyTime(DateUtils.newTimestamp());
//		csysSequence.setCsysSequenceModifyUser(baseUserView.getCsysUserId());
//		csysSequence.setCsysSequenceIsDelete("0");
		csysSequenceService.save(csysSequence);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysSequence csysSequence){
//		csysSequence.setCsysSequenceModifyTime(DateUtils.newTimestamp());
//		csysSequence.setCsysSequenceModifyUser(baseUserView.getCsysUserId());
		csysSequenceService.update(csysSequence);
	
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
		
		csysSequenceService.deleteByIds(newids);
	
	}

	
}
