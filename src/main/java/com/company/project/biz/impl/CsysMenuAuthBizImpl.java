package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysMenuAuthService;
import com.company.project.biz.CsysMenuAuthBiz;
import com.company.project.outer.model.CsysMenuAuth;
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
 * Created by tty on 2019/02/14.
 */
@Component
@Transactional
public class CsysMenuAuthBizImpl  implements CsysMenuAuthBiz {
    @Resource
    private CsysMenuAuthService csysMenuAuthService;
	@Resource
    private CommonService commonService;
    
	public CsysMenuAuth getDataSettings(String id){
	
		CsysMenuAuth csysMenuAuth = new CsysMenuAuth();
		csysMenuAuth.setCsysMenuAuthId(id);
   		csysMenuAuth.setCsysMenuAuthIsDelete("0");
		 
		return csysMenuAuthService.selectOne(csysMenuAuth);
		
	
	}
	public List<CsysMenuAuth> getDataSettingsByCondition(CsysMenuAuth csysMenuAuth){
	
		 
   		csysMenuAuth.setCsysMenuAuthIsDelete("0");
		return csysMenuAuthService.select(csysMenuAuth);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysMenuAuth> list = csysMenuAuthService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuAuth csysMenuAuth){
	
		PageHelper.startPage(page, size);
		csysMenuAuth.setCsysMenuAuthIsDelete("0");
        List<CsysMenuAuth> list = csysMenuAuthService.select(csysMenuAuth);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuAuth csysMenuAuth){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysMenuAuth");
		csysMenuAuth.setCsysMenuAuthId(sequence);
		csysMenuAuth.setCsysMenuAuthCreateTime(DateUtils.newTimestamp());
		csysMenuAuth.setCsysMenuAuthCreateUser(baseUserView.getCsysUserId());
		csysMenuAuth.setCsysMenuAuthModifyTime(DateUtils.newTimestamp());
		csysMenuAuth.setCsysMenuAuthModifyUser(baseUserView.getCsysUserId());
		csysMenuAuth.setCsysMenuAuthIsDelete("0");
		csysMenuAuthService.save(csysMenuAuth);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuAuth csysMenuAuth){
		csysMenuAuth.setCsysMenuAuthModifyTime(DateUtils.newTimestamp());
		csysMenuAuth.setCsysMenuAuthModifyUser(baseUserView.getCsysUserId());
		csysMenuAuthService.update(csysMenuAuth);
	
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
		
		csysMenuAuthService.deleteByIds(newids);
	
	}

	
}
