package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysProjectPublishService;
import com.company.project.biz.CySysProjectPublishBiz;
import com.company.project.model.CySysProjectPublish;
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
 * Created by tty on 2018/11/20.
 */
@Component
@Transactional
public class CySysProjectPublishBizImpl  implements CySysProjectPublishBiz {
    @Resource
    private CySysProjectPublishService cySysProjectPublishService;
	@Resource
    private CommonService commonService;
    
	public CySysProjectPublish getDataSettings(String id){
	
		CySysProjectPublish cySysProjectPublish = new CySysProjectPublish();
		cySysProjectPublish.setCySysProjectPublishId(id);
   		cySysProjectPublish.setCySysProjectPublishIsDelete("0");
		 
		return cySysProjectPublishService.selectOne(cySysProjectPublish);
		
	
	}
	public List<CySysProjectPublish> getDataSettingsByCondition(CySysProjectPublish cySysProjectPublish){
	
		 
   		cySysProjectPublish.setCySysProjectPublishIsDelete("0");
		return cySysProjectPublishService.select(cySysProjectPublish);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysProjectPublish> list = cySysProjectPublishService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish){
	
		PageHelper.startPage(page, size);
		cySysProjectPublish.setCySysProjectPublishIsDelete("0");
        List<CySysProjectPublish> list = cySysProjectPublishService.select(cySysProjectPublish);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysProjectPublish");
		cySysProjectPublish.setCySysProjectPublishId(sequence);
		cySysProjectPublish.setCySysProjectPublishCreateTime(DateUtils.newTimestamp());
		cySysProjectPublish.setCySysProjectPublishCreateUser(baseUserView.getCsysUserId());
		cySysProjectPublish.setCySysProjectPublishModifyTime(DateUtils.newTimestamp());
		cySysProjectPublish.setCySysProjectPublishModifyUser(baseUserView.getCsysUserId());
		cySysProjectPublish.setCySysProjectPublishIsDelete("0");
		cySysProjectPublishService.save(cySysProjectPublish);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish){
		cySysProjectPublish.setCySysProjectPublishModifyTime(DateUtils.newTimestamp());
		cySysProjectPublish.setCySysProjectPublishModifyUser(baseUserView.getCsysUserId());
		cySysProjectPublishService.update(cySysProjectPublish);
	
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
		
		cySysProjectPublishService.deleteByIds(newids);
	
	}

	
}
