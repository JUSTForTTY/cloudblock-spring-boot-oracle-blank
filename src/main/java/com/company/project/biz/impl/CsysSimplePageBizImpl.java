package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysSimplePageService;
import com.company.project.biz.CsysSimplePageBiz;
import com.company.project.model.CsysSimplePage;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Component
@Transactional
public class CsysSimplePageBizImpl  implements CsysSimplePageBiz {
    @Resource
    private CsysSimplePageService csysPageService;
	@Resource
    private CommonService commonService;
    
	public CsysSimplePage getDataSettings(String id){
	
		CsysSimplePage csysPage = new CsysSimplePage();
		csysPage.setCsysPageId(id);
   		csysPage.setCsysPageIsDelete("0");
		 
		return csysPageService.selectOne(csysPage);
		
	
	}
	public List<CsysSimplePage> getDataSettingsByCondition(CsysSimplePage csysPage){
	
		 
   		csysPage.setCsysPageIsDelete("0");
		return csysPageService.select(csysPage);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysSimplePage> list = csysPageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysSimplePage csysPage){
	
		PageHelper.startPage(page, size);
		csysPage.setCsysPageIsDelete("0");
        List<CsysSimplePage> list = csysPageService.select(csysPage);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysSimplePage csysPage){
		
		//获取sequence
		csysPage.setCsysPageCreateTime(DateUtils.newTimestamp());
		csysPage.setCsysPageCreateUser(csysUserView.getCsysUserId());
		csysPage.setCsysPageModifyTime(DateUtils.newTimestamp());
		csysPage.setCsysPageModifyUser(csysUserView.getCsysUserId());
		csysPage.setCsysPageIsDelete("0");
		csysPageService.save(csysPage);
		
		return csysPage.getCsysPageId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysSimplePage csysPage){
		csysPage.setCsysPageModifyTime(DateUtils.newTimestamp());
		csysPage.setCsysPageModifyUser(csysUserView.getCsysUserId());
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
