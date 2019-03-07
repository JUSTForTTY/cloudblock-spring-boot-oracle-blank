package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBaseUserService;
import com.company.project.biz.CySysBaseUserBiz;
import com.company.project.model.CySysBaseUser;
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
 * Created by tty on 2018/09/29.
 */
@Component
@Transactional
public class CySysBaseUserBizImpl  implements CySysBaseUserBiz {
    @Resource
    private CySysBaseUserService cySysBaseUserService;
	@Resource
    private CommonService commonService;
    
	public CySysBaseUser getDataSettings(String id){
	
		CySysBaseUser cySysBaseUser = new CySysBaseUser();
		cySysBaseUser.setCySysBaseUserId(id);
   		cySysBaseUser.setCySysBaseUserIsDelete("0");
		 
		return cySysBaseUserService.selectOne(cySysBaseUser);
		
	
	}
	public List<CySysBaseUser> getDataSettingsByCondition(CySysBaseUser cySysBaseUser){
	
		 
   		cySysBaseUser.setCySysBaseUserIsDelete("0");
		return cySysBaseUserService.select(cySysBaseUser);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBaseUser> list = cySysBaseUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUser cySysBaseUser){
	
		PageHelper.startPage(page, size);
		cySysBaseUser.setCySysBaseUserIsDelete("0");
        List<CySysBaseUser> list = cySysBaseUserService.select(cySysBaseUser);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBaseUser cySysBaseUser){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBaseUser");
		cySysBaseUser.setCySysBaseUserId(sequence);
		cySysBaseUser.setCySysBaseUserCreateTime(DateUtils.newTimestamp());
		cySysBaseUser.setCySysBaseUserCreateUser(baseUserView.getCsysUserId());
		cySysBaseUser.setCySysBaseUserModifyTime(DateUtils.newTimestamp());
		cySysBaseUser.setCySysBaseUserModifyUser(baseUserView.getCsysUserId());
		cySysBaseUser.setCySysBaseUserIsDelete("0");
		cySysBaseUserService.save(cySysBaseUser);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUser cySysBaseUser){
		cySysBaseUser.setCySysBaseUserModifyTime(DateUtils.newTimestamp());
		cySysBaseUser.setCySysBaseUserModifyUser(baseUserView.getCsysUserId());
		cySysBaseUserService.update(cySysBaseUser);
	
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
		
		cySysBaseUserService.deleteByIds(newids);
	
	}

	
}
