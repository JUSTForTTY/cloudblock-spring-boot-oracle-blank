package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsCcAuthService;
import com.company.project.biz.CsysTrsCcAuthBiz;
import com.company.project.outer.model.CsysTrsCcAuth;
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
public class CsysTrsCcAuthBizImpl  implements CsysTrsCcAuthBiz {
    @Resource
    private CsysTrsCcAuthService csysTrsCcAuthService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsCcAuth getDataSettings(String id){
	
		CsysTrsCcAuth csysTrsCcAuth = new CsysTrsCcAuth();
		csysTrsCcAuth.setCsysTrsCcAuthId(id);
   		csysTrsCcAuth.setCsysTrsCcAuthIsDelete("0");
		 
		return csysTrsCcAuthService.selectOne(csysTrsCcAuth);
		
	
	}
	public List<CsysTrsCcAuth> getDataSettingsByCondition(CsysTrsCcAuth csysTrsCcAuth){
	
		 
   		csysTrsCcAuth.setCsysTrsCcAuthIsDelete("0");
		return csysTrsCcAuthService.select(csysTrsCcAuth);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsCcAuth> list = csysTrsCcAuthService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth){
	
		PageHelper.startPage(page, size);
		csysTrsCcAuth.setCsysTrsCcAuthIsDelete("0");
        List<CsysTrsCcAuth> list = csysTrsCcAuthService.select(csysTrsCcAuth);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsCcAuth");
		csysTrsCcAuth.setCsysTrsCcAuthId(sequence);
		csysTrsCcAuth.setCsysTrsCcAuthCreateTime(DateUtils.newTimestamp());
		csysTrsCcAuth.setCsysTrsCcAuthCreateUser(baseUserView.getCsysUserId());
		csysTrsCcAuth.setCsysTrsCcAuthModifyTime(DateUtils.newTimestamp());
		csysTrsCcAuth.setCsysTrsCcAuthModifyUser(baseUserView.getCsysUserId());
		csysTrsCcAuth.setCsysTrsCcAuthIsDelete("0");
		csysTrsCcAuthService.save(csysTrsCcAuth);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth){
		csysTrsCcAuth.setCsysTrsCcAuthModifyTime(DateUtils.newTimestamp());
		csysTrsCcAuth.setCsysTrsCcAuthModifyUser(baseUserView.getCsysUserId());
		csysTrsCcAuthService.update(csysTrsCcAuth);
	
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
		
		csysTrsCcAuthService.deleteByIds(newids);
	
	}

	
}
