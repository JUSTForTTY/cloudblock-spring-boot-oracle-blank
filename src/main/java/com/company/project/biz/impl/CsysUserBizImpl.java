package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysUserService;
import com.company.project.biz.CsysUserBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysUser;
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
public class CsysUserBizImpl  implements CsysUserBiz {
    @Resource
    private CsysUserService csysUserService;
	@Resource
    private CommonService commonService;
    
	public CsysUser getDataSettings(String id){
	
		CsysUser csysUser = new CsysUser();
		csysUser.setCsysUserId(id);
   		csysUser.setCsysUserIsDelete("0");
		 
		return csysUserService.selectOne(csysUser);
		
	
	}
	public List<CsysUser> getDataSettingsByCondition(CsysUser csysUser){
	
		 
   		csysUser.setCsysUserIsDelete("0");
		return csysUserService.select(csysUser);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysUser> list = csysUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUser csysUser){
	
		PageHelper.startPage(page, size);
		csysUser.setCsysUserIsDelete("0");
        List<CsysUser> list = csysUserService.select(csysUser);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysUser csysUser){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysUser");
		csysUser.setCsysUserId(sequence);
		csysUser.setCsysUserCreateTime(DateUtils.newTimestamp());
		csysUser.setCsysUserCreateUser(baseUserView.getCsysUserId());
		csysUser.setCsysUserModifyTime(DateUtils.newTimestamp());
		csysUser.setCsysUserModifyUser(baseUserView.getCsysUserId());
		csysUser.setCsysUserIsDelete("0");
		csysUserService.save(csysUser);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysUser csysUser){
		csysUser.setCsysUserModifyTime(DateUtils.newTimestamp());
		csysUser.setCsysUserModifyUser(baseUserView.getCsysUserId());
		csysUserService.update(csysUser);
	
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
		
		csysUserService.deleteByIds(newids);
	
	}

	
}
