package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsLogService;
import com.company.project.biz.CsysTrsLogBiz;
import com.company.project.outer.model.CsysTrsLog;
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
 * Created by tty on 2019/01/24.
 */
@Component
@Transactional
public class CsysTrsLogBizImpl  implements CsysTrsLogBiz {
    @Resource
    private CsysTrsLogService csysTrsLogService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsLog getDataSettings(String id){
	
		CsysTrsLog csysTrsLog = new CsysTrsLog();
		csysTrsLog.setCsysTrsLogId(id);
   		csysTrsLog.setCsysTrsLogIsDelete("0");
		 
		return csysTrsLogService.selectOne(csysTrsLog);
		
	
	}
	public List<CsysTrsLog> getDataSettingsByCondition(CsysTrsLog csysTrsLog){
	
		 
   		csysTrsLog.setCsysTrsLogIsDelete("0");
		return csysTrsLogService.select(csysTrsLog);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsLog> list = csysTrsLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsLog csysTrsLog){
	
		PageHelper.startPage(page, size);
		csysTrsLog.setCsysTrsLogIsDelete("0");
        List<CsysTrsLog> list = csysTrsLogService.select(csysTrsLog);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsLog csysTrsLog){
		
		//获取sequence
		String sequence=commonService.getOracleSequence("CsysTrsLog");
		csysTrsLog.setCsysTrsLogId(sequence);
		csysTrsLog.setCsysTrsLogCreateTime(DateUtils.newTimestamp());
		csysTrsLog.setCsysTrsLogCreateUser(baseUserView.getCsysUserId());
		csysTrsLog.setCsysTrsLogModifyTime(DateUtils.newTimestamp());
		csysTrsLog.setCsysTrsLogModifyUser(baseUserView.getCsysUserId());
		csysTrsLog.setCsysTrsLogIsDelete("0");
		csysTrsLogService.save(csysTrsLog);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsLog csysTrsLog){
		csysTrsLog.setCsysTrsLogModifyTime(DateUtils.newTimestamp());
		csysTrsLog.setCsysTrsLogModifyUser(baseUserView.getCsysUserId());
		csysTrsLogService.update(csysTrsLog);
	
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
		
		csysTrsLogService.deleteByIds(newids);
	
	}

	
}
