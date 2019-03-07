package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBaseUserProjectViewService;
import com.company.project.biz.CySysBaseUserProjectViewBiz;
import com.company.project.model.CySysBaseUserProjectView;
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
 * Created by tty on 2018/08/27.
 */
@Component
@Transactional
public class CySysBaseUserProjectViewBizImpl  implements CySysBaseUserProjectViewBiz {
    @Resource
    private CySysBaseUserProjectViewService cySysBaseUserProjectViewService;
	@Resource
    private CommonService commonService;
    
	public CySysBaseUserProjectView getDataSettings(String id){
	
		CySysBaseUserProjectView cySysBaseUserProjectView = new CySysBaseUserProjectView();
		cySysBaseUserProjectView.setCySysProjectId(id);
   		cySysBaseUserProjectView.setCySysProjectIsDelete("0");
		 
		return cySysBaseUserProjectViewService.selectOne(cySysBaseUserProjectView);
		
	
	}
	public List<CySysBaseUserProjectView> getDataSettingsByCondition(CySysBaseUserProjectView cySysBaseUserProjectView){
	
		 
   		cySysBaseUserProjectView.setCySysProjectIsDelete("0");
		return cySysBaseUserProjectViewService.select(cySysBaseUserProjectView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBaseUserProjectView> list = cySysBaseUserProjectViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView){
	
		PageHelper.startPage(page, size);
		
		cySysBaseUserProjectView.setCySysBaseUserId(baseUserView.getCsysUserId());
		cySysBaseUserProjectView.setCySysProjectIsDelete("0");
        List<CySysBaseUserProjectView> list = cySysBaseUserProjectViewService.select(cySysBaseUserProjectView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public void insertDataSettings(CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBaseUserProjectView");
		cySysBaseUserProjectView.setCySysProjectId(sequence);
		cySysBaseUserProjectView.setCySysProjectIsDelete("0");
		cySysBaseUserProjectViewService.save(cySysBaseUserProjectView);
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView){
		
		cySysBaseUserProjectViewService.update(cySysBaseUserProjectView);
	
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
		
		cySysBaseUserProjectViewService.deleteByIds(newids);
		 
	
	}

	
}
