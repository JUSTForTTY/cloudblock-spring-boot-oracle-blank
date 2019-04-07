package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysNoticeTpService;
import com.company.project.biz.CsysNoticeTpBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysNoticeTp;
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
public class CsysNoticeTpBizImpl  implements CsysNoticeTpBiz {
    @Resource
    private CsysNoticeTpService csysNoticeTpService;
	@Resource
    private CommonService commonService;
    
	public CsysNoticeTp getDataSettings(String id){
	
		CsysNoticeTp csysNoticeTp = new CsysNoticeTp();
		csysNoticeTp.setCsysNoticeTpId(id);
   		csysNoticeTp.setCsysNoticeTpIsDelete("0");
		 
		return csysNoticeTpService.selectOne(csysNoticeTp);
		
	
	}
	public List<CsysNoticeTp> getDataSettingsByCondition(CsysNoticeTp csysNoticeTp){
	
		 
   		csysNoticeTp.setCsysNoticeTpIsDelete("0");
		return csysNoticeTpService.select(csysNoticeTp);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysNoticeTp> list = csysNoticeTpService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysNoticeTp csysNoticeTp){
	
		PageHelper.startPage(page, size);
		csysNoticeTp.setCsysNoticeTpIsDelete("0");
        List<CsysNoticeTp> list = csysNoticeTpService.select(csysNoticeTp);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysNoticeTp csysNoticeTp){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysNoticeTp");
		csysNoticeTp.setCsysNoticeTpId(sequence);
		csysNoticeTp.setCsysNoticeTpCreateTime(DateUtils.newTimestamp());
		csysNoticeTp.setCsysNoticeTpCreateUser(baseUserView.getCsysUserId());
		csysNoticeTp.setCsysNoticeTpModifyTime(DateUtils.newTimestamp());
		csysNoticeTp.setCsysNoticeTpModifyUser(baseUserView.getCsysUserId());
		csysNoticeTp.setCsysNoticeTpIsDelete("0");
		csysNoticeTpService.save(csysNoticeTp);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysNoticeTp csysNoticeTp){
		csysNoticeTp.setCsysNoticeTpModifyTime(DateUtils.newTimestamp());
		csysNoticeTp.setCsysNoticeTpModifyUser(baseUserView.getCsysUserId());
		csysNoticeTpService.update(csysNoticeTp);
	
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
		
		csysNoticeTpService.deleteByIds(newids);
	
	}

	
}
