package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysRoleService;
import com.company.project.biz.CsysRoleBiz;
import com.company.project.outer.model.CsysRole;
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
 * Created by tty on 2019/02/12.
 */
@Component
@Transactional
public class CsysRoleBizImpl  implements CsysRoleBiz {
    @Resource
    private CsysRoleService csysRoleService;
	@Resource
    private CommonService commonService;
    
	public CsysRole getDataSettings(String id){
	
		CsysRole csysRole = new CsysRole();
		csysRole.setCsysRoleId(id);
   		csysRole.setCsysRoleIsDelete("0");
		 
		return csysRoleService.selectOne(csysRole);
		
	
	}
	public List<CsysRole> getDataSettingsByCondition(CsysRole csysRole){
	
		 
   		csysRole.setCsysRoleIsDelete("0");
		return csysRoleService.select(csysRole);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysRole> list = csysRoleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysRole csysRole){
	
		PageHelper.startPage(page, size);
		csysRole.setCsysRoleIsDelete("0");
        List<CsysRole> list = csysRoleService.select(csysRole);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysRole csysRole){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysRole");
		csysRole.setCsysRoleId(sequence);
		csysRole.setCsysRoleCreateTime(DateUtils.newTimestamp());
		csysRole.setCsysRoleCreateUser(baseUserView.getCsysUserId());
		csysRole.setCsysRoleModifyTime(DateUtils.newTimestamp());
		csysRole.setCsysRoleModifyUser(baseUserView.getCsysUserId());
		csysRole.setCsysRoleIsDelete("0");
		csysRoleService.save(csysRole);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysRole csysRole){
		csysRole.setCsysRoleModifyTime(DateUtils.newTimestamp());
		csysRole.setCsysRoleModifyUser(baseUserView.getCsysUserId());
		csysRoleService.update(csysRole);
	
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
		
		csysRoleService.deleteByIds(newids);
	
	}

	
}
