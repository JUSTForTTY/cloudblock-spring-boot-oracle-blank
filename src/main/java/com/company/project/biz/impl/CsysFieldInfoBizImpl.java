package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysFieldInfoService;
import com.company.project.biz.CsysFieldInfoBiz;
import com.company.project.outer.model.CsysFieldInfo;
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
public class CsysFieldInfoBizImpl  implements CsysFieldInfoBiz {
    @Resource
    private CsysFieldInfoService csysFieldInfoService;
	@Resource
    private CommonService commonService;
    
	public CsysFieldInfo getDataSettings(String id){
	
		CsysFieldInfo csysFieldInfo = new CsysFieldInfo();
		csysFieldInfo.setCsysFieldInfoId(id);
   		csysFieldInfo.setCsysFieldInfoIsDelete("0");
		 
		return csysFieldInfoService.selectOne(csysFieldInfo);
		
	
	}
	public List<CsysFieldInfo> getDataSettingsByCondition(CsysFieldInfo csysFieldInfo){
	
		 
   		csysFieldInfo.setCsysFieldInfoIsDelete("0");
		return csysFieldInfoService.select(csysFieldInfo);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysFieldInfo> list = csysFieldInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysFieldInfo csysFieldInfo){
	
		PageHelper.startPage(page, size);
		csysFieldInfo.setCsysFieldInfoIsDelete("0");
        List<CsysFieldInfo> list = csysFieldInfoService.select(csysFieldInfo);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysFieldInfo csysFieldInfo){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysFieldInfo");
		csysFieldInfo.setCsysFieldInfoId(sequence);
		csysFieldInfo.setCsysFieldInfoCreateTime(DateUtils.newTimestamp());
		csysFieldInfo.setCsysFieldInfoCreateUser(baseUserView.getCsysUserId());
		csysFieldInfo.setCsysFieldInfoModifyTime(DateUtils.newTimestamp());
		csysFieldInfo.setCsysFieldInfoModifyUser(baseUserView.getCsysUserId());
		csysFieldInfo.setCsysFieldInfoIsDelete("0");
		csysFieldInfoService.save(csysFieldInfo);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysFieldInfo csysFieldInfo){
		csysFieldInfo.setCsysFieldInfoModifyTime(DateUtils.newTimestamp());
		csysFieldInfo.setCsysFieldInfoModifyUser(baseUserView.getCsysUserId());
		csysFieldInfoService.update(csysFieldInfo);
	
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
		
		csysFieldInfoService.deleteByIds(newids);
	
	}

	
}
