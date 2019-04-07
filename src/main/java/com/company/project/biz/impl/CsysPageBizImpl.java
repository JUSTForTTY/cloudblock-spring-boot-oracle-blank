package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPageService;
import com.company.project.biz.CsysPageBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysPage;
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
public class CsysPageBizImpl  implements CsysPageBiz {
    @Resource
    private CsysPageService csysPageService;
	@Resource
    private CommonService commonService;
    
	public CsysPage getDataSettings(String id){
	
		CsysPage csysPage = new CsysPage();
		csysPage.setCsysPageId(id);
   		csysPage.setCsysPageIsDelete("0");
		 
		return csysPageService.selectOne(csysPage);
		
	
	}
	public List<CsysPage> getDataSettingsByCondition(CsysPage csysPage){
	
		 
   		csysPage.setCsysPageIsDelete("0");
		return csysPageService.select(csysPage);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPage> list = csysPageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPage csysPage){
	
		PageHelper.startPage(page, size);
		csysPage.setCsysPageIsDelete("0");
        List<CsysPage> list = csysPageService.select(csysPage);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPage csysPage){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPage");
		csysPage.setCsysPageId(sequence);
		csysPage.setCsysPageCreateTime(DateUtils.newTimestamp());
		csysPage.setCsysPageCreateUser(baseUserView.getCsysUserId());
		csysPage.setCsysPageModifyTime(DateUtils.newTimestamp());
		csysPage.setCsysPageModifyUser(baseUserView.getCsysUserId());
		csysPage.setCsysPageIsDelete("0");
		csysPageService.save(csysPage);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPage csysPage){
		csysPage.setCsysPageModifyTime(DateUtils.newTimestamp());
		csysPage.setCsysPageModifyUser(baseUserView.getCsysUserId());
		csysPageService.update(csysPage);
	
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
		
		csysPageService.deleteByIds(newids);
	
	}

	
}
