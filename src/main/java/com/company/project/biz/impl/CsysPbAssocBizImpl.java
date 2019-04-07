package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPbAssocService;
import com.company.project.biz.CsysPbAssocBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysPbAssoc;
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
public class CsysPbAssocBizImpl  implements CsysPbAssocBiz {
    @Resource
    private CsysPbAssocService csysPbAssocService;
	@Resource
    private CommonService commonService;
    
	public CsysPbAssoc getDataSettings(String id){
	
		CsysPbAssoc csysPbAssoc = new CsysPbAssoc();
		csysPbAssoc.setCsysPbAssocId(id);
   		csysPbAssoc.setCsysPbAssocIsDelete("0");
		 
		return csysPbAssocService.selectOne(csysPbAssoc);
		
	
	}
	public List<CsysPbAssoc> getDataSettingsByCondition(CsysPbAssoc csysPbAssoc){
	
		 
   		csysPbAssoc.setCsysPbAssocIsDelete("0");
		return csysPbAssocService.select(csysPbAssoc);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPbAssoc> list = csysPbAssocService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPbAssoc csysPbAssoc){
	
		PageHelper.startPage(page, size);
		csysPbAssoc.setCsysPbAssocIsDelete("0");
        List<CsysPbAssoc> list = csysPbAssocService.select(csysPbAssoc);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPbAssoc csysPbAssoc){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPbAssoc");
		csysPbAssoc.setCsysPbAssocId(sequence);
		csysPbAssoc.setCsysPbAssocCreateTime(DateUtils.newTimestamp());
		csysPbAssoc.setCsysPbAssocCreateUser(baseUserView.getCsysUserId());
		csysPbAssoc.setCsysPbAssocModifyTime(DateUtils.newTimestamp());
		csysPbAssoc.setCsysPbAssocModifyUser(baseUserView.getCsysUserId());
		csysPbAssoc.setCsysPbAssocIsDelete("0");
		csysPbAssocService.save(csysPbAssoc);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPbAssoc csysPbAssoc){
		csysPbAssoc.setCsysPbAssocModifyTime(DateUtils.newTimestamp());
		csysPbAssoc.setCsysPbAssocModifyUser(baseUserView.getCsysUserId());
		csysPbAssocService.update(csysPbAssoc);
	
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
		
		csysPbAssocService.deleteByIds(newids);
	
	}

	
}
