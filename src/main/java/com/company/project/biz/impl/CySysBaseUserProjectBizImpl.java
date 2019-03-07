package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBaseUserProjectService;
import com.company.project.biz.CySysBaseUserProjectBiz;
import com.company.project.model.CySysBaseUserProject;
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
public class CySysBaseUserProjectBizImpl  implements CySysBaseUserProjectBiz {
    @Resource
    private CySysBaseUserProjectService cySysBaseUserProjectService;
	@Resource
    private CommonService commonService;
    
	public CySysBaseUserProject getDataSettings(String id){
	
		CySysBaseUserProject cySysBaseUserProject = new CySysBaseUserProject();
		cySysBaseUserProject.setCySysBaseUserProjectId(id);
   		cySysBaseUserProject.setCySysBaseUserProjectIsDelete("0");
		 
		return cySysBaseUserProjectService.selectOne(cySysBaseUserProject);
		
	
	}
	public List<CySysBaseUserProject> getDataSettingsByCondition(CySysBaseUserProject cySysBaseUserProject){
	
		 
   		cySysBaseUserProject.setCySysBaseUserProjectIsDelete("0");
		return cySysBaseUserProjectService.select(cySysBaseUserProject);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBaseUserProject> list = cySysBaseUserProjectService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject){
	
		PageHelper.startPage(page, size);
		
		cySysBaseUserProject.setCySysBaseUserProjectIsDelete("0");
        List<CySysBaseUserProject> list = cySysBaseUserProjectService.select(cySysBaseUserProject);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public void insertDataSettings(CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBaseUserProject");
		cySysBaseUserProject.setCySysBaseUserProjectId(sequence);
		cySysBaseUserProject.setCySysBaseUserProjectCreateTime(DateUtils.newTimestamp());
		cySysBaseUserProject.setCySysBaseUserProjectCreateUser(baseUserView.getCsysUserId());
		cySysBaseUserProject.setCySysBaseUserProjectModifyTime(DateUtils.newTimestamp());
		cySysBaseUserProject.setCySysBaseUserProjectModifyUser(baseUserView.getCsysUserId());
		cySysBaseUserProject.setCySysBaseUserProjectIsDelete("0");
		cySysBaseUserProjectService.save(cySysBaseUserProject);
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject){
		cySysBaseUserProject.setCySysBaseUserProjectModifyTime(DateUtils.newTimestamp());
		cySysBaseUserProject.setCySysBaseUserProjectModifyUser(baseUserView.getCsysUserId());
		cySysBaseUserProjectService.update(cySysBaseUserProject);
	
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
		cySysBaseUserProjectService.deleteByIds(newids);
	
	}

	
}
