package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPageLayoutService;
import com.company.project.biz.CsysPageLayoutBiz;
import com.company.project.outer.model.CsysPageLayout;
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
public class CsysPageLayoutBizImpl  implements CsysPageLayoutBiz {
    @Resource
    private CsysPageLayoutService csysPageLayoutService;
	@Resource
    private CommonService commonService;
    
	public CsysPageLayout getDataSettings(String id){
	
		CsysPageLayout csysPageLayout = new CsysPageLayout();
		csysPageLayout.setCsysPageLayoutId(id);
   		csysPageLayout.setCsysPageLayoutIsDelete("0");
		 
		return csysPageLayoutService.selectOne(csysPageLayout);
		
	
	}
	public List<CsysPageLayout> getDataSettingsByCondition(CsysPageLayout csysPageLayout){
	
		 
   		csysPageLayout.setCsysPageLayoutIsDelete("0");
		return csysPageLayoutService.select(csysPageLayout);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPageLayout> list = csysPageLayoutService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPageLayout csysPageLayout){
	
		PageHelper.startPage(page, size);
		csysPageLayout.setCsysPageLayoutIsDelete("0");
        List<CsysPageLayout> list = csysPageLayoutService.select(csysPageLayout);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPageLayout csysPageLayout){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPageLayout");
		csysPageLayout.setCsysPageLayoutId(sequence);
		csysPageLayout.setCsysPageLayoutCreateTime(DateUtils.newTimestamp());
		csysPageLayout.setCsysPageLayoutCreateUser(baseUserView.getCsysUserId());
		csysPageLayout.setCsysPageLayoutModifyTime(DateUtils.newTimestamp());
		csysPageLayout.setCsysPageLayoutModifyUser(baseUserView.getCsysUserId());
		csysPageLayout.setCsysPageLayoutIsDelete("0");
		csysPageLayoutService.save(csysPageLayout);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPageLayout csysPageLayout){
		csysPageLayout.setCsysPageLayoutModifyTime(DateUtils.newTimestamp());
		csysPageLayout.setCsysPageLayoutModifyUser(baseUserView.getCsysUserId());
		csysPageLayoutService.update(csysPageLayout);
	
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
		
		csysPageLayoutService.deleteByIds(newids);
	
	}

	
}
