package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBaseUserRoleService;
import com.company.project.biz.CySysBaseUserRoleBiz;
import com.company.project.model.CySysBaseUserRole;
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
 * Created by tty on 2018/09/27.
 */
@Component
@Transactional
public class CySysBaseUserRoleBizImpl  implements CySysBaseUserRoleBiz {
    @Resource
    private CySysBaseUserRoleService cySysBaseUserRoleService;
	@Resource
    private CommonService commonService;
    
	public CySysBaseUserRole getDataSettings(String id){
	
		CySysBaseUserRole cySysBaseUserRole = new CySysBaseUserRole();
		cySysBaseUserRole.setCySysBaseUserRoleId(id);
   		cySysBaseUserRole.setCySysBaseUserRoleIsDelete("0");
		 
		return cySysBaseUserRoleService.selectOne(cySysBaseUserRole);
		
	
	}
	public List<CySysBaseUserRole> getDataSettingsByCondition(CySysBaseUserRole cySysBaseUserRole){
	
		 
   		cySysBaseUserRole.setCySysBaseUserRoleIsDelete("0");
		return cySysBaseUserRoleService.select(cySysBaseUserRole);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBaseUserRole> list = cySysBaseUserRoleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole){
	
		PageHelper.startPage(page, size);
		cySysBaseUserRole.setCySysBaseUserRoleIsDelete("0");
        List<CySysBaseUserRole> list = cySysBaseUserRoleService.select(cySysBaseUserRole);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBaseUserRole");
		cySysBaseUserRole.setCySysBaseUserRoleId(sequence);
		cySysBaseUserRole.setCySysBaseUserRoleCreateTime(DateUtils.newTimestamp());
		cySysBaseUserRole.setCySysBaseUserRoleCreateUser(baseUserView.getCsysUserId());
		cySysBaseUserRole.setCySysBaseUserRoleModifyTime(DateUtils.newTimestamp());
		cySysBaseUserRole.setCySysBaseUserRoleModifyUser(baseUserView.getCsysUserId());
		cySysBaseUserRole.setCySysBaseUserRoleIsDelete("0");
		cySysBaseUserRoleService.save(cySysBaseUserRole);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole){
		cySysBaseUserRole.setCySysBaseUserRoleModifyTime(DateUtils.newTimestamp());
		cySysBaseUserRole.setCySysBaseUserRoleModifyUser(baseUserView.getCsysUserId());
		cySysBaseUserRoleService.update(cySysBaseUserRole);
	
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
		
		cySysBaseUserRoleService.deleteByIds(newids);
	
	}

	
}
