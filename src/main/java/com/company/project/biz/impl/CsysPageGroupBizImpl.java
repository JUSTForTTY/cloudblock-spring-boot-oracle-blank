package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPageGroupService;
import com.company.project.biz.CsysPageGroupBiz;
import com.company.project.model.CsysPageGroup;
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
 * Created by tty on 2019/07/04.
 */
@Component
@Transactional
public class CsysPageGroupBizImpl  implements CsysPageGroupBiz {
    @Resource
    private CsysPageGroupService csysPageGroupService;
	@Resource
    private CommonService commonService;
    
	public CsysPageGroup getDataSettings(String id){
	
		CsysPageGroup csysPageGroup = new CsysPageGroup();
		csysPageGroup.setCsysPageGroupId(id);
   		csysPageGroup.setCsysPageGroupIsDelete("0");
		 
		return csysPageGroupService.selectOne(csysPageGroup);
		
	
	}
	public List<CsysPageGroup> getDataSettingsByCondition(CsysPageGroup csysPageGroup){
	
		 
   		csysPageGroup.setCsysPageGroupIsDelete("0");
		return csysPageGroupService.select(csysPageGroup);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPageGroup> list = csysPageGroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPageGroup csysPageGroup){
	
		PageHelper.startPage(page, size);
		csysPageGroup.setCsysPageGroupIsDelete("0");
        List<CsysPageGroup> list = csysPageGroupService.select(csysPageGroup);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPageGroup csysPageGroup){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPageGroup");
		csysPageGroup.setCsysPageGroupId(sequence);
		csysPageGroup.setCsysPageGroupCreateTime(DateUtils.newTimestamp());
		csysPageGroup.setCsysPageGroupCreateUser(csysUserView.getCsysUserId());
		csysPageGroup.setCsysPageGroupModifyTime(DateUtils.newTimestamp());
		csysPageGroup.setCsysPageGroupModifyUser(csysUserView.getCsysUserId());
		csysPageGroup.setCsysPageGroupIsDelete("0");
		csysPageGroupService.save(csysPageGroup);
		
		return csysPageGroup.getCsysPageGroupId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPageGroup csysPageGroup){
		csysPageGroup.setCsysPageGroupModifyTime(DateUtils.newTimestamp());
		csysPageGroup.setCsysPageGroupModifyUser(csysUserView.getCsysUserId());
		csysPageGroupService.update(csysPageGroup);
	
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
		
		csysPageGroupService.deleteByIds(newids);
	
	}

	
}
