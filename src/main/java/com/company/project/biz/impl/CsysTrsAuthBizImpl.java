package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsAuthService;
import com.company.project.biz.CsysTrsAuthBiz;
import com.company.project.outer.model.CsysTrsAuth;
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
public class CsysTrsAuthBizImpl  implements CsysTrsAuthBiz {
    @Resource
    private CsysTrsAuthService csysTrsAuthService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsAuth getDataSettings(String id){
	
		CsysTrsAuth csysTrsAuth = new CsysTrsAuth();
		csysTrsAuth.setCsysTrsAuthId(id);
   		csysTrsAuth.setCsysTrsAuthIsDelete("0");
		 
		return csysTrsAuthService.selectOne(csysTrsAuth);
		
	
	}
	public List<CsysTrsAuth> getDataSettingsByCondition(CsysTrsAuth csysTrsAuth){
	
		 
   		csysTrsAuth.setCsysTrsAuthIsDelete("0");
		return csysTrsAuthService.select(csysTrsAuth);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsAuth> list = csysTrsAuthService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsAuth csysTrsAuth){
	
		PageHelper.startPage(page, size);
		csysTrsAuth.setCsysTrsAuthIsDelete("0");
        List<CsysTrsAuth> list = csysTrsAuthService.select(csysTrsAuth);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsAuth csysTrsAuth){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsAuth");
		csysTrsAuth.setCsysTrsAuthId(sequence);
		csysTrsAuth.setCsysTrsAuthCreateTime(DateUtils.newTimestamp());
		csysTrsAuth.setCsysTrsAuthCreateUser(baseUserView.getCsysUserId());
		csysTrsAuth.setCsysTrsAuthModifyTime(DateUtils.newTimestamp());
		csysTrsAuth.setCsysTrsAuthModifyUser(baseUserView.getCsysUserId());
		csysTrsAuth.setCsysTrsAuthIsDelete("0");
		csysTrsAuthService.save(csysTrsAuth);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsAuth csysTrsAuth){
		csysTrsAuth.setCsysTrsAuthModifyTime(DateUtils.newTimestamp());
		csysTrsAuth.setCsysTrsAuthModifyUser(baseUserView.getCsysUserId());
		csysTrsAuthService.update(csysTrsAuth);
	
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
		
		csysTrsAuthService.deleteByIds(newids);
	
	}

	
}
