package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysUserNoticeService;
import com.company.project.biz.CsysUserNoticeBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysUserNotice;
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
public class CsysUserNoticeBizImpl  implements CsysUserNoticeBiz {
    @Resource
    private CsysUserNoticeService csysUserNoticeService;
	@Resource
    private CommonService commonService;
    
	public CsysUserNotice getDataSettings(String id){
	
		CsysUserNotice csysUserNotice = new CsysUserNotice();
		csysUserNotice.setCsysUserNoticeId(id);
   		csysUserNotice.setCsysUserNoticeIsDelete("0");
		 
		return csysUserNoticeService.selectOne(csysUserNotice);
		
	
	}
	public List<CsysUserNotice> getDataSettingsByCondition(CsysUserNotice csysUserNotice){
	
		 
   		csysUserNotice.setCsysUserNoticeIsDelete("0");
		return csysUserNoticeService.select(csysUserNotice);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysUserNotice> list = csysUserNoticeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserNotice csysUserNotice){
	
		PageHelper.startPage(page, size);
		csysUserNotice.setCsysUserNoticeIsDelete("0");
        List<CsysUserNotice> list = csysUserNoticeService.select(csysUserNotice);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysUserNotice csysUserNotice){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysUserNotice");
		csysUserNotice.setCsysUserNoticeId(sequence);
		csysUserNotice.setCsysUserNoticeCreateTime(DateUtils.newTimestamp());
		csysUserNotice.setCsysUserNoticeCreateUser(baseUserView.getCsysUserId());
		csysUserNotice.setCsysUserNoticeModifyTime(DateUtils.newTimestamp());
		csysUserNotice.setCsysUserNoticeModifyUser(baseUserView.getCsysUserId());
		csysUserNotice.setCsysUserNoticeIsDelete("0");
		csysUserNoticeService.save(csysUserNotice);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysUserNotice csysUserNotice){
		csysUserNotice.setCsysUserNoticeModifyTime(DateUtils.newTimestamp());
		csysUserNotice.setCsysUserNoticeModifyUser(baseUserView.getCsysUserId());
		csysUserNoticeService.update(csysUserNotice);
	
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
		
		csysUserNoticeService.deleteByIds(newids);
	
	}

	
}
