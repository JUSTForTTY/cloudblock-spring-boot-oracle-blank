package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotGrService;
import com.company.project.biz.CsysPotGrBiz;
import com.company.project.model.CsysPotGr;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Component
@Transactional
public class CsysPotGrBizImpl  implements CsysPotGrBiz {
    @Resource
    private CsysPotGrService csysPotGrService;
	@Resource
    private CommonService commonService;
    
	public CsysPotGr getDataSettings(String id){
	
		CsysPotGr csysPotGr = new CsysPotGr();
		csysPotGr.setCsysPotGrId(id);
   		csysPotGr.setCsysPotGrIsDelete("0");
		 
		return csysPotGrService.selectOne(csysPotGr);
		
	
	}
	public List<CsysPotGr> getDataSettingsByCondition(CsysPotGr csysPotGr){
	
		 
   		csysPotGr.setCsysPotGrIsDelete("0");
		return csysPotGrService.select(csysPotGr);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotGr> list = csysPotGrService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGr csysPotGr){
	
		PageHelper.startPage(page, size);
		csysPotGr.setCsysPotGrIsDelete("0");
        List<CsysPotGr> list = csysPotGrService.select(csysPotGr);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGr csysPotGr){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotGr");
		csysPotGr.setCsysPotGrId(sequence);
		csysPotGr.setCsysPotGrCreateTime(DateUtils.newTimestamp());
		csysPotGr.setCsysPotGrCreateUser(csysUserView.getCsysUserId());
		csysPotGr.setCsysPotGrModifyTime(DateUtils.newTimestamp());
		csysPotGr.setCsysPotGrModifyUser(csysUserView.getCsysUserId());
		csysPotGr.setCsysPotGrIsDelete("0");
		csysPotGrService.save(csysPotGr);
		
		return csysPotGr.getCsysPotGrId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGr csysPotGr){
		csysPotGr.setCsysPotGrModifyTime(DateUtils.newTimestamp());
		csysPotGr.setCsysPotGrModifyUser(csysUserView.getCsysUserId());
		csysPotGrService.update(csysPotGr);
	
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
		
		csysPotGrService.deleteByIds(newids);
	
	}

	
}
