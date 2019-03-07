package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockCategoryService;
import com.company.project.service.CySysBlockService;
import com.company.project.biz.CySysBlockBiz;
import com.company.project.model.CySysBlock;
import com.company.project.model.CySysBlockCategory;
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
 * Created by tty on 2018/08/28.
 */
@Component
@Transactional
public class CySysBlockBizImpl  implements CySysBlockBiz {
    @Resource
    private CySysBlockService cySysBlockService;
	@Resource
    private CommonService commonService;
	@Resource
    private CySysBlockCategoryService cySysBlockCategoryService;
    
	public CySysBlock getDataSettings(String id){
	
		CySysBlock cySysBlock = new CySysBlock();
		cySysBlock.setId(id);
   		cySysBlock.setCySysBlockIsDelete("0");
		 
		return cySysBlockService.selectOne(cySysBlock);
		
	
	}
	public List<CySysBlock> getDataSettingsByCondition(CySysBlock cySysBlock){
	
		 
   		cySysBlock.setCySysBlockIsDelete("0");
		return cySysBlockService.select(cySysBlock);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlock> list = cySysBlockService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public Map<String, Object> getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlock cySysBlock){
	
		 
		Map<String, Object> map = new HashMap<>();
		//查询分类信息
		CySysBlockCategory cySysBlockCategory=new CySysBlockCategory();
		cySysBlockCategory.setCySysBlockCategoryIsDelete("0");
		List<CySysBlockCategory> blockCategoryList = cySysBlockCategoryService.select(cySysBlockCategory);
		CySysBlock block = new CySysBlock();
		for (CySysBlockCategory category : blockCategoryList) {
			block.setCySysBlockCategoryId(category.getCySysBlockCategoryId());
			block.setCySysBlockIsDelete("0");
			map.put(category.getCySysBlockCategoryId(), cySysBlockService.select(block));
		}
		 
         
		
		return map;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlock cySysBlock){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlock");
		cySysBlock.setId(sequence);
		cySysBlock.setCySysBlockCreateTime(DateUtils.newTimestamp());
		cySysBlock.setCySysBlockCreateUser(baseUserView.getCsysUserId());
		cySysBlock.setCySysBlockModifyTime(DateUtils.newTimestamp());
		cySysBlock.setCySysBlockModifyUser(baseUserView.getCsysUserId());
		cySysBlock.setCySysBlockIsDelete("0");
		cySysBlockService.save(cySysBlock);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlock cySysBlock){
		cySysBlock.setCySysBlockModifyTime(DateUtils.newTimestamp());
		cySysBlock.setCySysBlockModifyUser(baseUserView.getCsysUserId());
		cySysBlockService.update(cySysBlock);
	
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
		
		cySysBlockService.deleteByIds(newids);
	
	}

	
}
