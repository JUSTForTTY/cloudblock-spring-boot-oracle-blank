package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysCodemasterService;
import com.company.project.biz.CsysCodemasterBiz;
import com.company.project.model.CsysCodemaster;
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
 * Created by tty on 2019/06/15.
 */
@Component
@Transactional
public class CsysCodemasterBizImpl  implements CsysCodemasterBiz {
    @Resource
    private CsysCodemasterService csysCodemasterService;
	@Resource
    private CommonService commonService;
    
	public CsysCodemaster getDataSettings(String id){
	
		CsysCodemaster csysCodemaster = new CsysCodemaster();
		csysCodemaster.setCsysCodemasterId(id);
   		csysCodemaster.setCsysCodemasterIsDelete("0");
		 
		return csysCodemasterService.selectOne(csysCodemaster);
		
	
	}
	public List<CsysCodemaster> getDataSettingsByCondition(CsysCodemaster csysCodemaster){
	
		 
   		csysCodemaster.setCsysCodemasterIsDelete("0");
		return csysCodemasterService.select(csysCodemaster);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysCodemaster> list = csysCodemasterService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysCodemaster csysCodemaster){
	
		PageHelper.startPage(page, size);
		csysCodemaster.setCsysCodemasterIsDelete("0");
        List<CsysCodemaster> list = csysCodemasterService.select(csysCodemaster);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysCodemaster csysCodemaster){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysCodemaster");
		csysCodemaster.setCsysCodemasterId(sequence);
		csysCodemaster.setCsysCodemasterCreateTime(DateUtils.newTimestamp());
		csysCodemaster.setCsysCodemasterCreateUser(csysUserView.getCsysUserId());
		csysCodemaster.setCsysCodemasterModifyTime(DateUtils.newTimestamp());
		csysCodemaster.setCsysCodemasterModifyUser(csysUserView.getCsysUserId());
		csysCodemaster.setCsysCodemasterIsDelete("0");
		csysCodemasterService.save(csysCodemaster);
		
		return csysCodemaster.getCsysCodemasterId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysCodemaster csysCodemaster){
		csysCodemaster.setCsysCodemasterModifyTime(DateUtils.newTimestamp());
		csysCodemaster.setCsysCodemasterModifyUser(csysUserView.getCsysUserId());
		csysCodemasterService.update(csysCodemaster);
	
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
		
		csysCodemasterService.deleteByIds(newids);
	
	}

	
}
