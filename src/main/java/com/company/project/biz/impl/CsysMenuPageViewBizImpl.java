package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysMenuPageViewService;
import com.company.project.biz.CsysMenuPageViewBiz;
import com.company.project.outer.model.CsysMenuPageView;
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
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysMenuPageViewBizImpl  implements CsysMenuPageViewBiz {
    @Resource
    private CsysMenuPageViewService csysMenuPageViewService;
	@Resource
    private CommonService commonService;
    
	public CsysMenuPageView getDataSettings(String id){
	
		CsysMenuPageView csysMenuPageView = new CsysMenuPageView();
		csysMenuPageView.setCsysMenuId(id);
   		csysMenuPageView.setCsysMenuIsDelete("0");
   		csysMenuPageView.setCsysPageIsDelete("0");
		 
		return csysMenuPageViewService.selectOne(csysMenuPageView);
		
	
	}
	public List<CsysMenuPageView> getDataSettingsByCondition(CsysMenuPageView csysMenuPageView){
	
		 
		csysMenuPageView.setCsysMenuIsDelete("0");
   		csysMenuPageView.setCsysPageIsDelete("0");
		return csysMenuPageViewService.select(csysMenuPageView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysMenuPageView> list = csysMenuPageViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuPageView csysMenuPageView){
	
		PageHelper.startPage(page, size);
		csysMenuPageView.setCsysMenuIsDelete("0");
   		csysMenuPageView.setCsysPageIsDelete("0");
        List<CsysMenuPageView> list = csysMenuPageViewService.select(csysMenuPageView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuPageView csysMenuPageView){
		
		//获取sequence
//		String sequence=commonService.getSequence("CsysMenuPageView");
//		csysMenuPageView.setCsysMenuPageViewId(sequence);
//		csysMenuPageView.setCsysMenuPageViewCreateTime(DateUtils.newTimestamp());
//		csysMenuPageView.setCsysMenuPageViewCreateUser(baseUserView.getCsysUserId());
//		csysMenuPageView.setCsysMenuPageViewModifyTime(DateUtils.newTimestamp());
//		csysMenuPageView.setCsysMenuPageViewModifyUser(baseUserView.getCsysUserId());
//		csysMenuPageView.setCsysMenuPageViewIsDelete("0");
//		csysMenuPageViewService.save(csysMenuPageView);
		
		return "";
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuPageView csysMenuPageView){
		csysMenuPageView.setCsysMenuModifyTime(DateUtils.newTimestamp());
		csysMenuPageView.setCsysMenuModifyUser(baseUserView.getCsysUserId());
		csysMenuPageViewService.update(csysMenuPageView);
	
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
		
		csysMenuPageViewService.deleteByIds(newids);
	
	}

	
}
