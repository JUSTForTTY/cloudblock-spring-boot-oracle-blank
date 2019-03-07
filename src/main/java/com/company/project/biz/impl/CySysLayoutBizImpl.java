package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysLayoutCategoryService;
import com.company.project.service.CySysLayoutService;
import com.company.project.biz.CySysLayoutBiz;
import com.company.project.model.CySysLayout;
import com.company.project.model.CySysLayoutCategory;
import com.company.project.model.CySysLayoutSimple;
import com.company.project.outer.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Component
@Transactional
public class CySysLayoutBizImpl  implements CySysLayoutBiz {
    @Resource
    private CySysLayoutService cySysLayoutService;
	@Resource
    private CommonService commonService;
	@Resource
	private CySysLayoutCategoryService cySysLayoutCategoryService;
    
	public CySysLayout getDataSettings(String id){
	
		CySysLayout cySysLayout = new CySysLayout();
		cySysLayout.setId(id);
   		cySysLayout.setCySysLayoutIsDelete("0");
		 
		return cySysLayoutService.selectOne(cySysLayout);
		
	
	}
	public List<CySysLayout> getDataSettingsByCondition(CySysLayout cySysLayout){
	
		 
   		cySysLayout.setCySysLayoutIsDelete("0");
		return cySysLayoutService.select(cySysLayout);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysLayout> list = cySysLayoutService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public Map<String,Object> getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysLayout cySysLayout){
	
		PageHelper.startPage(page, size);
		
		Map<String,Object> map=new HashMap<>();
		CySysLayoutCategory layoutCategory = new CySysLayoutCategory();
		//查询分类信息
		layoutCategory.setCySysLayoutCategoryIsDelete("0");
		List<CySysLayoutCategory> layoutCategoryList=cySysLayoutCategoryService.select(layoutCategory);
		//查询布局信息
		for(CySysLayoutCategory category:layoutCategoryList) {
			
			
			CySysLayout layout=new CySysLayout();
			layout.setCySysLayoutCategoryId(category.getCySysLayoutCategoryId());
			List<CySysLayout> layoutList=cySysLayoutService.select(layout);
			
			map.put(category.getCySysLayoutCategoryId(), layoutList);
			
		}
		
	 
       
		
		return map;
	
	}
	public void insertDataSettings(CsysUserView baseUserView,CySysLayout cySysLayout){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysLayout");
		cySysLayout.setId(sequence);
		cySysLayout.setCySysLayoutCreateTime(DateUtils.newTimestamp());
		cySysLayout.setCySysLayoutCreateUser(baseUserView.getCsysUserId());
		cySysLayout.setCySysLayoutModifyTime(DateUtils.newTimestamp());
		cySysLayout.setCySysLayoutModifyUser(baseUserView.getCsysUserId());
		cySysLayout.setCySysLayoutIsDelete("0");
		cySysLayoutService.save(cySysLayout);
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysLayout cySysLayout){
		cySysLayout.setCySysLayoutModifyTime(DateUtils.newTimestamp());
		cySysLayout.setCySysLayoutModifyUser(baseUserView.getCsysUserId());
		cySysLayoutService.update(cySysLayout);
	
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
		
		cySysLayoutService.deleteByIds(newids);
	
	}

	
}
