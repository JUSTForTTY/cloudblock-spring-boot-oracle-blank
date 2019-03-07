package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysMenuService;
import com.company.project.biz.CsysMenuBiz;
import com.company.project.outer.model.CsysMenu;
import com.company.project.outer.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysMenuBizImpl  implements CsysMenuBiz {
    @Resource
    private CsysMenuService csysMenuService;
	@Resource
    private CommonService commonService;
    
	public CsysMenu getDataSettings(String id){
	
		CsysMenu csysMenu = new CsysMenu();
		csysMenu.setCsysMenuId(id);
   		csysMenu.setCsysMenuIsDelete("0");
		 
		return csysMenuService.selectOne(csysMenu);
		
	
	}
	public List<CsysMenu> getDataSettingsByCondition(CsysMenu csysMenu){
	
		 
   		csysMenu.setCsysMenuIsDelete("0");
		return csysMenuService.select(csysMenu);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysMenu> list = csysMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenu csysMenu){
	
		PageHelper.startPage(page, size);
		csysMenu.setCsysMenuIsDelete("0");
        List<CsysMenu> list = csysMenuService.select(csysMenu);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysMenu csysMenu){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysMenu");
		csysMenu.setCsysMenuId(sequence);
		csysMenu.setCsysMenuCreateTime(DateUtils.newTimestamp());
		csysMenu.setCsysMenuCreateUser(baseUserView.getCsysUserId());
		csysMenu.setCsysMenuModifyTime(DateUtils.newTimestamp());
		csysMenu.setCsysMenuModifyUser(baseUserView.getCsysUserId());
		csysMenu.setCsysMenuIsDelete("0");
		csysMenuService.save(csysMenu);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysMenu csysMenu){
		csysMenu.setCsysMenuModifyTime(DateUtils.newTimestamp());
		csysMenu.setCsysMenuModifyUser(baseUserView.getCsysUserId());
		csysMenuService.update(csysMenu);
	
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
		
		csysMenuService.deleteByIds(newids);
	
	}

	@Override
	public List<CsysMenu> getDataSettingsTree(CsysMenu cySysMenu) {

		List<CsysMenu> menuList = new ArrayList<>();
		cySysMenu.setCsysMenuParentId("-1");
		cySysMenu.setCsysMenuIsDelete("0");

		List<CsysMenu> parentMenuList = csysMenuService.select(cySysMenu);

		// 处理菜单信息
		int count = 0;
		for (CsysMenu menu : parentMenuList) {
			CsysMenu child = recursiveTree(menu, count);
			menuList.add(child);
			count++;
		}

		return menuList;
	}
	
	private CsysMenu recursiveTree(CsysMenu menu, int count) {

		menu.setTitle(menu.getCsysMenuName());
		menu.setKey(menu.getCsysMenuId());
		menu.setIndex(count);
		menu.setDisabled(false);
		menu.setChecked(false);
		menu.setShowoptionbtn(false);
		menu.setExpanded(true);
		CsysMenu parentMenu = new CsysMenu();
		parentMenu.setCsysMenuParentId(menu.getCsysMenuId());
		parentMenu.setCsysMenuIsDelete("0");
		List<CsysMenu> childTreeNodes = csysMenuService.select(parentMenu);
		// 遍历子节点
		if (childTreeNodes.size() > 0) {
			for (CsysMenu child : childTreeNodes) {
				CsysMenu n = recursiveTree(child, -1); // 递归
				menu.getChildren().add(n);
			}
		} else {
			menu.setIsLeaf("true");
		}
		return menu;
	}
	
}
