package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysUserViewService;
import com.company.project.biz.CsysUserViewBiz;
import com.company.project.outer.model.CsysUserView;
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
public class CsysUserViewBizImpl  implements CsysUserViewBiz {
    @Resource
    private CsysUserViewService csysUserViewService;
	@Resource
    private CommonService commonService;
    
	public CsysUserView getDataSettings(String id){
	
		CsysUserView csysUserView = new CsysUserView();
		csysUserView.setCsysUserRoleId(id);
   		csysUserView.setCsysUserIsDelete("0");
   		csysUserView.setCsysUserRoleIsDelete("0");
		 
		return csysUserViewService.selectOne(csysUserView);
		
	
	}
	public List<CsysUserView> getDataSettingsByCondition(CsysUserView csysUserView){
	
		 
		csysUserView.setCsysUserIsDelete("0");
   		csysUserView.setCsysUserRoleIsDelete("0");
		return csysUserViewService.select(csysUserView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysUserView> list = csysUserViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserView csysUserView){
	
		PageHelper.startPage(page, size);
		csysUserView.setCsysUserIsDelete("0");
   		csysUserView.setCsysUserRoleIsDelete("0");
        List<CsysUserView> list = csysUserViewService.select(csysUserView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysUserView csysUserView){
		
		//获取sequence
//		String sequence=commonService.getSequence("CsysUserView");
//		csysUserView.setCsysUserViewId(sequence);
//		csysUserView.setCsysUserViewCreateTime(DateUtils.newTimestamp());
//		csysUserView.setCsysUserViewCreateUser(baseUserView.getCsysUserId());
//		csysUserView.setCsysUserViewModifyTime(DateUtils.newTimestamp());
//		csysUserView.setCsysUserViewModifyUser(baseUserView.getCsysUserId());
//		csysUserView.setCsysUserViewIsDelete("0");
//		csysUserViewService.save(csysUserView);
		
		return "";
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysUserView csysUserView){
		csysUserView.setCsysUserModifyTime(DateUtils.newTimestamp());
		csysUserView.setCsysUserModifyUser(baseUserView.getCsysUserId());
		csysUserViewService.update(csysUserView);
	
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
		
		csysUserViewService.deleteByIds(newids);
	
	}

	
}
