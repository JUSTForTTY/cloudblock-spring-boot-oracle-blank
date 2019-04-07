package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysOperatelogService;
import com.company.project.biz.CsysOperatelogBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysOperatelog;
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
public class CsysOperatelogBizImpl  implements CsysOperatelogBiz {
    @Resource
    private CsysOperatelogService csysOperatelogService;
	@Resource
    private CommonService commonService;
    
	public CsysOperatelog getDataSettings(String id){
	
		CsysOperatelog csysOperatelog = new CsysOperatelog();
		csysOperatelog.setCsysOperatelogId(id);
   		csysOperatelog.setCsysOperatelogIsDelete("0");
		 
		return csysOperatelogService.selectOne(csysOperatelog);
		
	
	}
	public List<CsysOperatelog> getDataSettingsByCondition(CsysOperatelog csysOperatelog){
	
		 
   		csysOperatelog.setCsysOperatelogIsDelete("0");
		return csysOperatelogService.select(csysOperatelog);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysOperatelog> list = csysOperatelogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOperatelog csysOperatelog){
	
		PageHelper.startPage(page, size);
		csysOperatelog.setCsysOperatelogIsDelete("0");
        List<CsysOperatelog> list = csysOperatelogService.select(csysOperatelog);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysOperatelog csysOperatelog){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysOperatelog");
		csysOperatelog.setCsysOperatelogId(sequence);
		csysOperatelog.setCsysOperatelogCreateTime(DateUtils.newTimestamp());
		csysOperatelog.setCsysOperatelogCreateUser(baseUserView.getCsysUserId());
		csysOperatelog.setCsysOperatelogModifyTime(DateUtils.newTimestamp());
		csysOperatelog.setCsysOperatelogModifyUser(baseUserView.getCsysUserId());
		csysOperatelog.setCsysOperatelogIsDelete("0");
		csysOperatelogService.save(csysOperatelog);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysOperatelog csysOperatelog){
		csysOperatelog.setCsysOperatelogModifyTime(DateUtils.newTimestamp());
		csysOperatelog.setCsysOperatelogModifyUser(baseUserView.getCsysUserId());
		csysOperatelogService.update(csysOperatelog);
	
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
		
		csysOperatelogService.deleteByIds(newids);
	
	}

	
}
