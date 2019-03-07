package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysMenuAuthViewService;
import com.company.project.service.CsysUserRoleService;
import com.company.project.biz.CsysMenuAuthViewBiz;
import com.company.project.outer.dao.CsysMenuAuthViewMapper;
import com.company.project.outer.model.CsysMenuAuthView;
import com.company.project.outer.model.CsysMenuAuthViewExample;
import com.company.project.outer.model.CsysUser;
import com.company.project.outer.model.CsysUserRole;
import com.company.project.outer.model.CsysUserView;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Component
@Transactional
public class CsysMenuAuthViewBizImpl  implements CsysMenuAuthViewBiz {
    @Resource
    private CsysMenuAuthViewService csysMenuAuthViewService;
    @Resource
  	private CsysUserRoleService csysUserRoleService;
    @Resource
	private CsysMenuAuthViewMapper csysMenuAuthViewMapper;
	@Resource
    private CommonService commonService;
    
	public CsysMenuAuthView getDataSettings(String id){
	
		CsysMenuAuthView csysMenuAuthView = new CsysMenuAuthView();
		csysMenuAuthView.setCsysMenuId(id);
   		csysMenuAuthView.setCsysMenuIsDelete("0");
		 
		return csysMenuAuthViewService.selectOne(csysMenuAuthView);
		
	
	}
	public List<CsysMenuAuthView> getDataSettingsByCondition(CsysMenuAuthView csysMenuAuthView){
	
		 
   		csysMenuAuthView.setCsysMenuIsDelete("0");
		return csysMenuAuthViewService.select(csysMenuAuthView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysMenuAuthView> list = csysMenuAuthViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView){
	
		PageHelper.startPage(page, size);
		csysMenuAuthView.setCsysMenuIsDelete("0");
        List<CsysMenuAuthView> list = csysMenuAuthViewService.select(csysMenuAuthView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysMenuAuthView");
		csysMenuAuthView.setCsysMenuId(sequence);
		csysMenuAuthView.setCsysMenuCreateTime(DateUtils.newTimestamp());
		csysMenuAuthView.setCsysMenuCreateUser(baseUserView.getCsysUserId());
		csysMenuAuthView.setCsysMenuModifyTime(DateUtils.newTimestamp());
		csysMenuAuthView.setCsysMenuModifyUser(baseUserView.getCsysUserId());
		csysMenuAuthView.setCsysMenuIsDelete("0");
		csysMenuAuthViewService.save(csysMenuAuthView);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView){
		csysMenuAuthView.setCsysMenuModifyTime(DateUtils.newTimestamp());
		csysMenuAuthView.setCsysMenuModifyUser(baseUserView.getCsysUserId());
		csysMenuAuthViewService.update(csysMenuAuthView);
	
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
		
		csysMenuAuthViewService.deleteByIds(newids);
	
	}
	
	@Override
	public List<CsysMenuAuthView> getDataSettingsTree(CsysUser csysUser) {
		
		//查询用户角色
		List <String> role=new ArrayList<>(); 
		CsysUserRole csysUserRole=new CsysUserRole();
		
		csysUserRole.setCsysUserId(csysUser.getCsysUserId());
		List<CsysUserRole> userRoleList=csysUserRoleService.select(csysUserRole);
		
		for(CsysUserRole csbu:userRoleList) {
			
			role.add(csbu.getCsysRoleId());
			System.out.println(csbu.getCsysRoleId());
			 
		}
		
		List<CsysMenuAuthView> menuList = new ArrayList<>();
	
		CsysMenuAuthViewExample example=new CsysMenuAuthViewExample();
		
		example.setOrderByClause("CSYS_MENU_SORT");
		example.setDistinct(true);
		CsysMenuAuthViewExample.Criteria criteria =example.createCriteria();
	 
		 
		criteria.andCsysRoleIdIn(role);
		criteria.andCsysMenuParentIdEqualTo("-1");
		criteria.andCsysMenuIsDeleteEqualTo("0");
		List<CsysMenuAuthView> parentMenuList = csysMenuAuthViewMapper.selectByExample(example);
 
		
		//菜单去重
		Set<CsysMenuAuthView> ts=new LinkedHashSet<CsysMenuAuthView>();
		ts.addAll(parentMenuList);
		
		List<CsysMenuAuthView> parentDistinctMenuList=new ArrayList<CsysMenuAuthView>(ts);
		// 处理菜单信息
		int count = 0;
		for (CsysMenuAuthView menu : parentDistinctMenuList) {
			System.out.println("菜单编号"+menu.getCsysMenuId());
			CsysMenuAuthView child = recursiveTree(menu, count);
			menuList.add(child);
			count++;
		}

		return menuList;
	}
	
	private CsysMenuAuthView recursiveTree(CsysMenuAuthView menu, int count) {

		 
		CsysMenuAuthViewExample example=new CsysMenuAuthViewExample();
		
		example.setOrderByClause("CSYS_MENU_SORT");
		example.setDistinct(true);
		CsysMenuAuthViewExample.Criteria criteria =example.createCriteria();
		criteria.andCsysMenuParentIdEqualTo(menu.getCsysMenuId());
		criteria.andCsysMenuIsDeleteEqualTo("0");
		
		List<CsysMenuAuthView> childTreeNodes = csysMenuAuthViewMapper.selectByExample(example);
		 
		//菜单去重
		Set<CsysMenuAuthView> ts=new LinkedHashSet<CsysMenuAuthView>();
		ts.addAll(childTreeNodes);
		
		List<CsysMenuAuthView> childDistinctTreeNodes=new ArrayList<CsysMenuAuthView>(ts);
		// 遍历子节点
		if (childTreeNodes.size() > 0) {
			for (CsysMenuAuthView child : childDistinctTreeNodes) {
				CsysMenuAuthView n = recursiveTree(child, -1); // 递归
				menu.getChildren().add(n);
			}
		}
		return menu;
	}

	
}
