package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysUserViewService;
import com.company.project.service.CySysBaseUserRoleService;
import com.company.project.service.CySysBaseUserService;
import com.company.project.service.CsysUserViewService;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.model.CySysBaseUser;
import com.company.project.model.CySysBaseUserRole;
import com.company.project.outer.model.CsysUserView;
import com.company.project.outer.model.CsysUserView;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.core.utils.Md5Encrypt;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/22.
 */
@Component
@Transactional
public class AuthLoginBizImpl  implements AuthLoginBiz {
    @Resource
    private CsysUserViewService CsysUserViewService;
    @Resource
    private CySysBaseUserService cySysBaseUserService;
    @Resource
    private CySysBaseUserRoleService cySysBaseUserRoleService;
    @Resource
    private CommonService commonService;
	public CsysUserView getDataSettings(String id){
	
		CsysUserView CsysUserView=new CsysUserView();
		CsysUserView.setCsysUserId(id);
   		CsysUserView.setCsysUserIsDelete("0");
		Condition condition=new Condition(CsysUserView.getClass());
		return CsysUserViewService.findByCondition(condition).get(0);
		
	
	}
	public List<CsysUserView> getDataSettingsByCondition(CsysUserView CsysUserView){
	
		 
   		CsysUserView.setCsysUserIsDelete("0");
		 
		return CsysUserViewService.select(CsysUserView);
	
	
	}
	public List<CsysUserView> login(CsysUserView CsysUserView){
		if(null!=CsysUserView.getCsysUserPassword()&&!"".equals(CsysUserView.getCsysUserPassword())) {
			CsysUserView.setCsysUserPassword(Md5Encrypt.md5(CsysUserView.getCsysUserPassword()));	
		}
		 
   		CsysUserView.setCsysUserIsDelete("0");
		 
		return CsysUserViewService.select(CsysUserView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysUserView> list = CsysUserViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public void insertDataSettings(CsysUserView CsysUserView){
		
//		CySysBaseUser user =new CySysBaseUser();
//		System.out.println("步骤一");
//		//获取sequence
//		String sequence=commonService.getSequence("CySysBaseUser");
//		user.setCySysBaseUserId(sequence);
//		user.setCySysBaseUserUsername(CsysUserView.getCySysBaseUserUsername());
//		user.setCySysBaseUserPassword(Md5Encrypt.md5(CsysUserView.getCySysBaseUserPassword()));
//		user.setCySysBaseUserMobile(CsysUserView.getCySysBaseUserMobile());
//		user.setCySysBaseUserCreateTime(DateUtils.newTimestamp());
//		user.setCySysBaseUserCreateUser(sequence);
//		user.setCySysBaseUserModifyTime(DateUtils.newTimestamp());
//		user.setCySysBaseUserModifyUser(sequence);
//		user.setCySysBaseUserIsDelete("0");
//		cySysBaseUserService.save(user);
//		
//		//新增用户角色关系信息
//		CySysBaseUserRole userrole=new CySysBaseUserRole();
//		String sequence2=commonService.getSequence("CySysBaseUserRole");
//		userrole.setCySysBaseUserRoleId(sequence2);
//		userrole.setCySysBaseUserId(sequence);
//		userrole.setCySysRoleId("1");
//		userrole.setCySysDepartmentId("1");
//		userrole.setCySysBaseUserRoleCreateTime(DateUtils.newTimestamp());
//		userrole.setCySysBaseUserRoleModifyTime(DateUtils.newTimestamp());
//		userrole.setCySysBaseUserRoleCreateUser(sequence);
//		userrole.setCySysBaseUserRoleModifyUser(sequence);;
//		userrole.setCySysBaseUserRoleIsDelete("0");
		
		//cySysBaseUserRoleService.save(userrole);
		
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysUserView CsysUserView){
//		CsysUserView.setCySysBaseUserModifyTime(DateUtils.newTimestamp());
//		CsysUserView.setCySysBaseUserModifyUser(baseUserView.getCsysUserId());
//		CsysUserViewService.update(CsysUserView);
	
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
		CsysUserViewService.deleteByIds(newids);
	
	}

	
}
