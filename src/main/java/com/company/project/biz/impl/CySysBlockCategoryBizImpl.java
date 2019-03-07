package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockCategoryService;
import com.company.project.biz.CySysBlockCategoryBiz;
import com.company.project.model.CySysBlockCategory;
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
 * Created by tty on 2018/08/28.
 */
@Component
@Transactional
public class CySysBlockCategoryBizImpl  implements CySysBlockCategoryBiz {
    @Resource
    private CySysBlockCategoryService cySysBlockCategoryService;
	@Resource
    private CommonService commonService;
    
	public CySysBlockCategory getDataSettings(String id){
	
		CySysBlockCategory cySysBlockCategory = new CySysBlockCategory();
		cySysBlockCategory.setCySysBlockCategoryId(id);
   		cySysBlockCategory.setCySysBlockCategoryIsDelete("0");
		 
		return cySysBlockCategoryService.selectOne(cySysBlockCategory);
		
	
	}
	public List<CySysBlockCategory> getDataSettingsByCondition(CySysBlockCategory cySysBlockCategory){
	
		 
   		cySysBlockCategory.setCySysBlockCategoryIsDelete("0");
		return cySysBlockCategoryService.select(cySysBlockCategory);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockCategory> list = cySysBlockCategoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory){
	
		PageHelper.startPage(page, size);
		
		List<CySysBlockCategory> blockCategoryList = new ArrayList<>();
 
		cySysBlockCategory.setCySysBlockCategoryParentId("-1");
		cySysBlockCategory.setCySysBlockCategoryIsDelete("0");
        List<CySysBlockCategory> parentBlockCategoryList = cySysBlockCategoryService.select(cySysBlockCategory);
        
        int count = 0;
		for (CySysBlockCategory category : parentBlockCategoryList) {
			CySysBlockCategory childCategory = recursiveTree(category, count);
			blockCategoryList.add(childCategory);
			count++;
		}
        
        PageInfo pageInfo = new PageInfo(blockCategoryList);
		
		return pageInfo;
	
	}
	private CySysBlockCategory recursiveTree(CySysBlockCategory category, int count) {
		
		category.setIndex(count);
		// 查询cid下的所有子节点()
		CySysBlockCategory parentCategory = new CySysBlockCategory();
		parentCategory.setCySysBlockCategoryParentId(category.getCySysBlockCategoryId());
		parentCategory.setCySysBlockCategoryIsDelete("0");
		List<CySysBlockCategory> childTreeNodes = cySysBlockCategoryService.select(parentCategory);
		// 遍历子节点
		for (CySysBlockCategory child : childTreeNodes) {
			CySysBlockCategory n = recursiveTree(child, -1); // 递归
			category.getChild().add(n);
		}
		return category;
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockCategory");
		cySysBlockCategory.setCySysBlockCategoryId(sequence);
		cySysBlockCategory.setCySysBlockCategoryCreateTime(DateUtils.newTimestamp());
		cySysBlockCategory.setCySysBlockCategoryCreateUser(baseUserView.getCsysUserId());
		cySysBlockCategory.setCySysBlockCategoryModifyTime(DateUtils.newTimestamp());
		cySysBlockCategory.setCySysBlockCategoryModifyUser(baseUserView.getCsysUserId());
		cySysBlockCategory.setCySysBlockCategoryIsDelete("0");
		cySysBlockCategoryService.save(cySysBlockCategory);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory){
		cySysBlockCategory.setCySysBlockCategoryModifyTime(DateUtils.newTimestamp());
		cySysBlockCategory.setCySysBlockCategoryModifyUser(baseUserView.getCsysUserId());
		cySysBlockCategoryService.update(cySysBlockCategory);
	
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
		
		cySysBlockCategoryService.deleteByIds(newids);
	
	}

	
}
