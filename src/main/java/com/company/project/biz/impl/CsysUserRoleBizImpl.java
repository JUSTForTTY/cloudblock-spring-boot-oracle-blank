package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysUserRoleService;
import com.company.project.biz.CsysUserRoleBiz;
import com.company.project.outer.model.CsysUserRole;
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
public class CsysUserRoleBizImpl  implements CsysUserRoleBiz {
    @Resource
    private CsysUserRoleService csysUserRoleService;
	@Resource
    private CommonService commonService;
    
	public CsysUserRole getDataSettings(String id){
	
		CsysUserRole csysUserRole = new CsysUserRole();
		csysUserRole.setCsysUserRoleId(id);
   		csysUserRole.setCsysUserRoleIsDelete("0");
		 
		return csysUserRoleService.selectOne(csysUserRole);
		
	
	}
	public List<CsysUserRole> getDataSettingsByCondition(CsysUserRole csysUserRole){
	
		 
   		csysUserRole.setCsysUserRoleIsDelete("0");
		return csysUserRoleService.select(csysUserRole);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysUserRole> list = csysUserRoleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserRole csysUserRole){
	
		PageHelper.startPage(page, size);
		csysUserRole.setCsysUserRoleIsDelete("0");
        List<CsysUserRole> list = csysUserRoleService.select(csysUserRole);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysUserRole csysUserRole){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysUserRole");
		csysUserRole.setCsysUserRoleId(sequence);
		csysUserRole.setCsysUserRoleCreateTime(DateUtils.newTimestamp());
		csysUserRole.setCsysUserRoleCreateUser(baseUserView.getCsysUserId());
		csysUserRole.setCsysUserRoleModifyTime(DateUtils.newTimestamp());
		csysUserRole.setCsysUserRoleModifyUser(baseUserView.getCsysUserId());
		csysUserRole.setCsysUserRoleIsDelete("0");
		csysUserRoleService.save(csysUserRole);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysUserRole csysUserRole){
		csysUserRole.setCsysUserRoleModifyTime(DateUtils.newTimestamp());
		csysUserRole.setCsysUserRoleModifyUser(baseUserView.getCsysUserId());
		csysUserRoleService.update(csysUserRole);
	
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
		
		csysUserRoleService.deleteByIds(newids);
	
	}

	
}
