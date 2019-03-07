package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBaseUserProjectService;
import com.company.project.service.CySysProjectService;
import com.company.project.biz.CySysProjectBiz;
import com.company.project.model.CySysProject;
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
public class CySysProjectBizImpl  implements CySysProjectBiz {
    @Resource
    private CySysProjectService cySysProjectService;
	@Resource
    private CommonService commonService;
	@Resource
	private CySysBaseUserProjectService cySysBaseUserProjectService;
    
	public CySysProject getDataSettings(String id){
	
		CySysProject cySysProject = new CySysProject();
		cySysProject.setCySysProjectId(id);
   		cySysProject.setCySysProjectIsDelete("0");
		 
		return cySysProjectService.selectOne(cySysProject);
		
	
	}
	public List<CySysProject> getDataSettingsByCondition(CySysProject cySysProject){
	
		 
   		cySysProject.setCySysProjectIsDelete("0");
		return cySysProjectService.select(cySysProject);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysProject> list = cySysProjectService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysProject cySysProject){
	
		PageHelper.startPage(page, size);
        List<CySysProject> list = cySysProjectService.select(cySysProject);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public void insertDataSettings(CsysUserView baseUserView,CySysProject cySysProject){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysProject");
		cySysProject.setCySysProjectId(sequence);
		cySysProject.setCySysProjectCreateTime(DateUtils.newTimestamp());
		cySysProject.setCySysProjectCreateUser(baseUserView.getCsysUserId());
		cySysProject.setCySysProjectModifyTime(DateUtils.newTimestamp());
		cySysProject.setCySysProjectModifyUser(baseUserView.getCsysUserId());
		cySysProject.setCySysProjectIsDelete("0");
		cySysProjectService.save(cySysProject);
		
		//新增用户项目表; add by tty 
		CySysBaseUserProject userProject=new CySysBaseUserProject();
		//获取sequence
		String baseProjectSequence=commonService.getSequence("CySysBaseUserProject");
		userProject.setCySysBaseUserProjectId(baseProjectSequence);
		userProject.setCySysBaseUserId(baseUserView.getCsysUserId());
		userProject.setCySysBaseUserName(baseUserView.getCsysUserName());
		userProject.setCySysProjectId(sequence);
		userProject.setCySysProjectName(cySysProject.getCySysProjectName());
		userProject.setCySysBaseUserProjectCreateTime(DateUtils.newTimestamp());
		userProject.setCySysBaseUserProjectCreateUser(baseUserView.getCsysUserId());
		userProject.setCySysBaseUserProjectModifyTime(DateUtils.newTimestamp());
		userProject.setCySysBaseUserProjectModifyUser(baseUserView.getCsysUserId());
		userProject.setCySysBaseUserProjectIsDelete("0");
		cySysBaseUserProjectService.save(userProject);
		
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysProject cySysProject){
		cySysProject.setCySysProjectModifyTime(DateUtils.newTimestamp());
		cySysProject.setCySysProjectModifyUser(baseUserView.getCsysUserId());
		cySysProjectService.update(cySysProject);
	
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
		
		cySysProjectService.deleteByIds(newids);
		 
	
	}

	
}
