package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysLayoutCategoryService;
import com.company.project.biz.CySysLayoutCategoryBiz;
import com.company.project.model.CySysLayoutCategory;
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
 * Created by tty on 2018/08/27.
 */
@Component
@Transactional
public class CySysLayoutCategoryBizImpl  implements CySysLayoutCategoryBiz {
    @Resource
    private CySysLayoutCategoryService cySysLayoutCategoryService;
	@Resource
    private CommonService commonService;
    
	public CySysLayoutCategory getDataSettings(String id){
	
		CySysLayoutCategory cySysLayoutCategory = new CySysLayoutCategory();
		cySysLayoutCategory.setCySysLayoutCategoryId(id);
   		cySysLayoutCategory.setCySysLayoutCategoryIsDelete("0");
		 
		return cySysLayoutCategoryService.selectOne(cySysLayoutCategory);
		
	
	}
	public List<CySysLayoutCategory> getDataSettingsByCondition(CySysLayoutCategory cySysLayoutCategory){
	
		 
   		cySysLayoutCategory.setCySysLayoutCategoryIsDelete("0");
		return cySysLayoutCategoryService.select(cySysLayoutCategory);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysLayoutCategory> list = cySysLayoutCategoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory){
	
		PageHelper.startPage(page, size);
		List<CySysLayoutCategory> layoutCategoryCurrentList = new ArrayList<>();
		cySysLayoutCategory.setCySysLayoutCategoryParentId("-1");
		cySysLayoutCategory.setCySysLayoutCategoryIsDelete("0");
        List<CySysLayoutCategory> layoutCategoryList = cySysLayoutCategoryService.select(cySysLayoutCategory);
        int count=0;
		for (CySysLayoutCategory category : layoutCategoryList) {
			CySysLayoutCategory child = recursiveTree(category.getCySysLayoutCategoryId(),count);

			
			layoutCategoryCurrentList.add(child);
			
			count++;
		}
        PageInfo pageInfo = new PageInfo(layoutCategoryCurrentList);
		
		return pageInfo;
	
	}
	public CySysLayoutCategory recursiveTree(String cid,int count) {
		// 根据cid获取节点对象()
		CySysLayoutCategory layoutCategory = new CySysLayoutCategory();

		layoutCategory.setCySysLayoutCategoryId(cid);
		layoutCategory.setCySysLayoutCategoryIsDelete("0");
		CySysLayoutCategory node = cySysLayoutCategoryService.select(layoutCategory).get(0);
		node.setIndex(count);
		// 查询cid下的所有子节点()
		CySysLayoutCategory layoutCategoryParent = new CySysLayoutCategory();
		layoutCategoryParent.setCySysLayoutCategoryParentId(cid);
		layoutCategoryParent.setCySysLayoutCategoryIsDelete("0");
		List<CySysLayoutCategory> childTreeNodes = cySysLayoutCategoryService.select(layoutCategoryParent);
		// 遍历子节点
		for (CySysLayoutCategory child : childTreeNodes) {
			CySysLayoutCategory n = recursiveTree(child.getCySysLayoutCategoryId(),-1); // 递归
			
			node.getChild().add(n);
		}

		return node;
	}
	public void insertDataSettings(CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysLayoutCategory");
		cySysLayoutCategory.setCySysLayoutCategoryId(sequence);
		cySysLayoutCategory.setCySysLayoutCategoryCreateTime(DateUtils.newTimestamp());
		cySysLayoutCategory.setCySysLayoutCategoryCreateUser(baseUserView.getCsysUserId());
		cySysLayoutCategory.setCySysLayoutCategoryModifyTime(DateUtils.newTimestamp());
		cySysLayoutCategory.setCySysLayoutCategoryModifyUser(baseUserView.getCsysUserId());
		cySysLayoutCategory.setCySysLayoutCategoryIsDelete("0");
		cySysLayoutCategoryService.save(cySysLayoutCategory);
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory){
		cySysLayoutCategory.setCySysLayoutCategoryModifyTime(DateUtils.newTimestamp());
		cySysLayoutCategory.setCySysLayoutCategoryModifyUser(baseUserView.getCsysUserId());
		cySysLayoutCategoryService.update(cySysLayoutCategory);
	
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
		
		cySysLayoutCategoryService.deleteByIds(newids);
	
	}

	
}
