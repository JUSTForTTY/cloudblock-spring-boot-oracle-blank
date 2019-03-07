package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysOrgPotAuthService;
import com.company.project.biz.CsysOrgPotAuthBiz;
import com.company.project.outer.model.CsysOrgPotAuth;
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
public class CsysOrgPotAuthBizImpl  implements CsysOrgPotAuthBiz {
    @Resource
    private CsysOrgPotAuthService csysOrgPotAuthService;
	@Resource
    private CommonService commonService;
    
	public CsysOrgPotAuth getDataSettings(String id){
	
		CsysOrgPotAuth csysOrgPotAuth = new CsysOrgPotAuth();
		csysOrgPotAuth.setCsysOrgPotAuthId(id);
   		csysOrgPotAuth.setCsysOrgPotAuthIsDelete("0");
		 
		return csysOrgPotAuthService.selectOne(csysOrgPotAuth);
		
	
	}
	public List<CsysOrgPotAuth> getDataSettingsByCondition(CsysOrgPotAuth csysOrgPotAuth){
	
		 
   		csysOrgPotAuth.setCsysOrgPotAuthIsDelete("0");
		return csysOrgPotAuthService.select(csysOrgPotAuth);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysOrgPotAuth> list = csysOrgPotAuthService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth){
	
		PageHelper.startPage(page, size);
		csysOrgPotAuth.setCsysOrgPotAuthIsDelete("0");
        List<CsysOrgPotAuth> list = csysOrgPotAuthService.select(csysOrgPotAuth);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysOrgPotAuth");
		csysOrgPotAuth.setCsysOrgPotAuthId(sequence);
		csysOrgPotAuth.setCsysOrgPotAuthCreateTime(DateUtils.newTimestamp());
		csysOrgPotAuth.setCsysOrgPotAuthCreateUser(baseUserView.getCsysUserId());
		csysOrgPotAuth.setCsysOrgPotAuthModifyTime(DateUtils.newTimestamp());
		csysOrgPotAuth.setCsysOrgPotAuthModifyUser(baseUserView.getCsysUserId());
		csysOrgPotAuth.setCsysOrgPotAuthIsDelete("0");
		csysOrgPotAuthService.save(csysOrgPotAuth);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth){
		csysOrgPotAuth.setCsysOrgPotAuthModifyTime(DateUtils.newTimestamp());
		csysOrgPotAuth.setCsysOrgPotAuthModifyUser(baseUserView.getCsysUserId());
		csysOrgPotAuthService.update(csysOrgPotAuth);
	
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
		
		csysOrgPotAuthService.deleteByIds(newids);
	
	}

	
}
