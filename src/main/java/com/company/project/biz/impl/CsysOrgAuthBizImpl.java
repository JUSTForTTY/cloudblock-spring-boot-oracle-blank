package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysOrgAuthService;
import com.company.project.biz.CsysOrgAuthBiz;
import com.company.project.outer.model.CsysOrgAuth;
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
public class CsysOrgAuthBizImpl  implements CsysOrgAuthBiz {
    @Resource
    private CsysOrgAuthService csysOrgAuthService;
	@Resource
    private CommonService commonService;
    
	public CsysOrgAuth getDataSettings(String id){
	
		CsysOrgAuth csysOrgAuth = new CsysOrgAuth();
		csysOrgAuth.setCsysOrgAuthId(id);
   		csysOrgAuth.setCsysOrgAuthIsDelete("0");
		 
		return csysOrgAuthService.selectOne(csysOrgAuth);
		
	
	}
	public List<CsysOrgAuth> getDataSettingsByCondition(CsysOrgAuth csysOrgAuth){
	
		 
   		csysOrgAuth.setCsysOrgAuthIsDelete("0");
		return csysOrgAuthService.select(csysOrgAuth);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysOrgAuth> list = csysOrgAuthService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgAuth csysOrgAuth){
	
		PageHelper.startPage(page, size);
		csysOrgAuth.setCsysOrgAuthIsDelete("0");
        List<CsysOrgAuth> list = csysOrgAuthService.select(csysOrgAuth);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgAuth csysOrgAuth){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysOrgAuth");
		csysOrgAuth.setCsysOrgAuthId(sequence);
		csysOrgAuth.setCsysOrgAuthCreateTime(DateUtils.newTimestamp());
		csysOrgAuth.setCsysOrgAuthCreateUser(baseUserView.getCsysUserId());
		csysOrgAuth.setCsysOrgAuthModifyTime(DateUtils.newTimestamp());
		csysOrgAuth.setCsysOrgAuthModifyUser(baseUserView.getCsysUserId());
		csysOrgAuth.setCsysOrgAuthIsDelete("0");
		csysOrgAuthService.save(csysOrgAuth);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgAuth csysOrgAuth){
		csysOrgAuth.setCsysOrgAuthModifyTime(DateUtils.newTimestamp());
		csysOrgAuth.setCsysOrgAuthModifyUser(baseUserView.getCsysUserId());
		csysOrgAuthService.update(csysOrgAuth);
	
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
		
		csysOrgAuthService.deleteByIds(newids);
	
	}

	
}
