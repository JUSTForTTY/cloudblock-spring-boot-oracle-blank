package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotPubPageService;
import com.company.project.biz.CsysPotPubPageBiz;
import com.company.project.model.CsysPotPubPage;
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
 * Created by tty on 2019/06/15.
 */
@Component
@Transactional
public class CsysPotPubPageBizImpl  implements CsysPotPubPageBiz {
    @Resource
    private CsysPotPubPageService csysPotPubPageService;
	@Resource
    private CommonService commonService;
    
	public CsysPotPubPage getDataSettings(String id){
	
		CsysPotPubPage csysPotPubPage = new CsysPotPubPage();
		csysPotPubPage.setCsysPotPubPageId(id);
   		csysPotPubPage.setCsysPotPubPageIsDelete("0");
		 
		return csysPotPubPageService.selectOne(csysPotPubPage);
		
	
	}
	public List<CsysPotPubPage> getDataSettingsByCondition(CsysPotPubPage csysPotPubPage){
	
		 
   		csysPotPubPage.setCsysPotPubPageIsDelete("0");
		return csysPotPubPageService.select(csysPotPubPage);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotPubPage> list = csysPotPubPageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotPubPage csysPotPubPage){
	
		PageHelper.startPage(page, size);
		csysPotPubPage.setCsysPotPubPageIsDelete("0");
        List<CsysPotPubPage> list = csysPotPubPageService.select(csysPotPubPage);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotPubPage csysPotPubPage){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotPubPage");
		csysPotPubPage.setCsysPotPubPageId(sequence);
		csysPotPubPage.setCsysPotPubPageCreateTime(DateUtils.newTimestamp());
		csysPotPubPage.setCsysPotPubPageCreateUser(csysUserView.getCsysUserId());
		csysPotPubPage.setCsysPotPubPageModifyTime(DateUtils.newTimestamp());
		csysPotPubPage.setCsysPotPubPageModifyUser(csysUserView.getCsysUserId());
		csysPotPubPage.setCsysPotPubPageIsDelete("0");
		csysPotPubPageService.save(csysPotPubPage);
		
		return csysPotPubPage.getCsysPotPubPageId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotPubPage csysPotPubPage){
		csysPotPubPage.setCsysPotPubPageModifyTime(DateUtils.newTimestamp());
		csysPotPubPage.setCsysPotPubPageModifyUser(csysUserView.getCsysUserId());
		csysPotPubPageService.update(csysPotPubPage);
	
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
		
		csysPotPubPageService.deleteByIds(newids);
	
	}

	
}
