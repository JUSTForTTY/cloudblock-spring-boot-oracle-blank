package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotPublicService;
import com.company.project.biz.CsysPotPublicBiz;
import com.company.project.outer.model.CsysPotPublic;
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
public class CsysPotPublicBizImpl  implements CsysPotPublicBiz {
    @Resource
    private CsysPotPublicService csysPotPublicService;
	@Resource
    private CommonService commonService;
    
	public CsysPotPublic getDataSettings(String id){
	
		CsysPotPublic csysPotPublic = new CsysPotPublic();
		csysPotPublic.setCsysPotPublicId(id);
   		csysPotPublic.setCsysPotPublicIsDelete("0");
		 
		return csysPotPublicService.selectOne(csysPotPublic);
		
	
	}
	public List<CsysPotPublic> getDataSettingsByCondition(CsysPotPublic csysPotPublic){
	
		 
   		csysPotPublic.setCsysPotPublicIsDelete("0");
		return csysPotPublicService.select(csysPotPublic);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotPublic> list = csysPotPublicService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotPublic csysPotPublic){
	
		PageHelper.startPage(page, size);
		csysPotPublic.setCsysPotPublicIsDelete("0");
        List<CsysPotPublic> list = csysPotPublicService.select(csysPotPublic);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPotPublic csysPotPublic){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotPublic");
		csysPotPublic.setCsysPotPublicId(sequence);
		csysPotPublic.setCsysPotPublicCreateTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicCreateUser(baseUserView.getCsysUserId());
		csysPotPublic.setCsysPotPublicModifyTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicModifyUser(baseUserView.getCsysUserId());
		csysPotPublic.setCsysPotPublicIsDelete("0");
		csysPotPublicService.save(csysPotPublic);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPotPublic csysPotPublic){
		csysPotPublic.setCsysPotPublicModifyTime(DateUtils.newTimestamp());
		csysPotPublic.setCsysPotPublicModifyUser(baseUserView.getCsysUserId());
		csysPotPublicService.update(csysPotPublic);
	
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
		
		csysPotPublicService.deleteByIds(newids);
	
	}

	
}
