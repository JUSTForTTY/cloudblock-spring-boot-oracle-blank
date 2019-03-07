package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysProjectService;
import com.company.project.biz.CsysProjectBiz;
import com.company.project.outer.model.CsysProject;
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
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysProjectBizImpl  implements CsysProjectBiz {
    @Resource
    private CsysProjectService csysProjectService;
	@Resource
    private CommonService commonService;
    
	public CsysProject getDataSettings(String id){
	
		CsysProject csysProject = new CsysProject();
		csysProject.setCsysProjectId(id);
   		csysProject.setCsysProjectIsDelete("0");
		 
		return csysProjectService.selectOne(csysProject);
		
	
	}
	public List<CsysProject> getDataSettingsByCondition(CsysProject csysProject){
	
		 
   		csysProject.setCsysProjectIsDelete("0");
		return csysProjectService.select(csysProject);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysProject> list = csysProjectService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysProject csysProject){
	
		PageHelper.startPage(page, size);
		csysProject.setCsysProjectIsDelete("0");
        List<CsysProject> list = csysProjectService.select(csysProject);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysProject csysProject){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysProject");
		csysProject.setCsysProjectId(sequence);
		csysProject.setCsysProjectCreateTime(DateUtils.newTimestamp());
		csysProject.setCsysProjectCreateUser(baseUserView.getCsysUserId());
		csysProject.setCsysProjectModifyTime(DateUtils.newTimestamp());
		csysProject.setCsysProjectModifyUser(baseUserView.getCsysUserId());
		csysProject.setCsysProjectIsDelete("0");
		csysProjectService.save(csysProject);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysProject csysProject){
		csysProject.setCsysProjectModifyTime(DateUtils.newTimestamp());
		csysProject.setCsysProjectModifyUser(baseUserView.getCsysUserId());
		csysProjectService.update(csysProject);
	
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
		
		csysProjectService.deleteByIds(newids);
	
	}

	
}
