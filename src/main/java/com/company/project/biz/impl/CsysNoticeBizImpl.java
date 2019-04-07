package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysNoticeService;
import com.company.project.biz.CsysNoticeBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysNotice;
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
public class CsysNoticeBizImpl  implements CsysNoticeBiz {
    @Resource
    private CsysNoticeService csysNoticeService;
	@Resource
    private CommonService commonService;
    
	public CsysNotice getDataSettings(String id){
	
		CsysNotice csysNotice = new CsysNotice();
		csysNotice.setCsysNoticeId(id);
   		csysNotice.setCsysNoticeIsDelete("0");
		 
		return csysNoticeService.selectOne(csysNotice);
		
	
	}
	public List<CsysNotice> getDataSettingsByCondition(CsysNotice csysNotice){
	
		 
   		csysNotice.setCsysNoticeIsDelete("0");
		return csysNoticeService.select(csysNotice);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysNotice> list = csysNoticeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysNotice csysNotice){
	
		PageHelper.startPage(page, size);
		csysNotice.setCsysNoticeIsDelete("0");
        List<CsysNotice> list = csysNoticeService.select(csysNotice);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysNotice csysNotice){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysNotice");
		csysNotice.setCsysNoticeId(sequence);
		csysNotice.setCsysNoticeCreateTime(DateUtils.newTimestamp());
		csysNotice.setCsysNoticeCreateUser(baseUserView.getCsysUserId());
		csysNotice.setCsysNoticeModifyTime(DateUtils.newTimestamp());
		csysNotice.setCsysNoticeModifyUser(baseUserView.getCsysUserId());
		csysNotice.setCsysNoticeIsDelete("0");
		csysNoticeService.save(csysNotice);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysNotice csysNotice){
		csysNotice.setCsysNoticeModifyTime(DateUtils.newTimestamp());
		csysNotice.setCsysNoticeModifyUser(baseUserView.getCsysUserId());
		csysNoticeService.update(csysNotice);
	
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
		
		csysNoticeService.deleteByIds(newids);
	
	}

	
}
