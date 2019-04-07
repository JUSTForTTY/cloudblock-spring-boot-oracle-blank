package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysOrgStruceService;
import com.company.project.biz.CsysOrgStruceBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysOrgStruce;
import com.company.project.model.CsysUserView;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysOrgStruceBizImpl  implements CsysOrgStruceBiz {
    @Resource
    private CsysOrgStruceService csysOrgStruceService;
	@Resource
    private CommonService commonService;
    
	public CsysOrgStruce getDataSettings(String id){
	
		CsysOrgStruce csysOrgStruce = new CsysOrgStruce();
		csysOrgStruce.setCsysOrgStruceId(id);
   		csysOrgStruce.setCsysOrgStruceIsDelete("0");
		 
		return csysOrgStruceService.selectOne(csysOrgStruce);
		
	
	}
	public List<CsysOrgStruce> getDataSettingsByCondition(CsysOrgStruce csysOrgStruce){
	
		 
   		csysOrgStruce.setCsysOrgStruceIsDelete("0");
		return csysOrgStruceService.select(csysOrgStruce);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysOrgStruce> list = csysOrgStruceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgStruce csysOrgStruce){
	
		PageHelper.startPage(page, size);
		csysOrgStruce.setCsysOrgStruceIsDelete("0");
        List<CsysOrgStruce> list = csysOrgStruceService.select(csysOrgStruce);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgStruce csysOrgStruce){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysOrgStruce");
		csysOrgStruce.setCsysOrgStruceId(sequence);
		csysOrgStruce.setCsysOrgStruceCreateTime(DateUtils.newTimestamp());
		csysOrgStruce.setCsysOrgStruceCreateUser(baseUserView.getCsysUserId());
		csysOrgStruce.setCsysOrgStruceModifyTime(DateUtils.newTimestamp());
		csysOrgStruce.setCsysOrgStruceModifyUser(baseUserView.getCsysUserId());
		csysOrgStruce.setCsysOrgStruceIsDelete("0");
		csysOrgStruceService.save(csysOrgStruce);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgStruce csysOrgStruce){
		csysOrgStruce.setCsysOrgStruceModifyTime(DateUtils.newTimestamp());
		csysOrgStruce.setCsysOrgStruceModifyUser(baseUserView.getCsysUserId());
		csysOrgStruceService.update(csysOrgStruce);
	
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
		
		csysOrgStruceService.deleteByIds(newids);
	
	}

	
}
