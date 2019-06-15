package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotStyleService;
import com.company.project.biz.CsysPotStyleBiz;
import com.company.project.model.CsysPotStyle;
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
public class CsysPotStyleBizImpl  implements CsysPotStyleBiz {
    @Resource
    private CsysPotStyleService csysPotStyleService;
	@Resource
    private CommonService commonService;
    
	public CsysPotStyle getDataSettings(String id){
	
		CsysPotStyle csysPotStyle = new CsysPotStyle();
		csysPotStyle.setCsysPotStyleId(id);
   		csysPotStyle.setCsysPotStyleIsDelete("0");
		 
		return csysPotStyleService.selectOne(csysPotStyle);
		
	
	}
	public List<CsysPotStyle> getDataSettingsByCondition(CsysPotStyle csysPotStyle){
	
		 
   		csysPotStyle.setCsysPotStyleIsDelete("0");
		return csysPotStyleService.select(csysPotStyle);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotStyle> list = csysPotStyleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotStyle csysPotStyle){
	
		PageHelper.startPage(page, size);
		csysPotStyle.setCsysPotStyleIsDelete("0");
        List<CsysPotStyle> list = csysPotStyleService.select(csysPotStyle);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotStyle csysPotStyle){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotStyle");
		csysPotStyle.setCsysPotStyleId(sequence);
		csysPotStyle.setCsysPotStyleCreateTime(DateUtils.newTimestamp());
		csysPotStyle.setCsysPotStyleCreateUser(csysUserView.getCsysUserId());
		csysPotStyle.setCsysPotStyleModifyTime(DateUtils.newTimestamp());
		csysPotStyle.setCsysPotStyleModifyUser(csysUserView.getCsysUserId());
		csysPotStyle.setCsysPotStyleIsDelete("0");
		csysPotStyleService.save(csysPotStyle);
		
		return csysPotStyle.getCsysPotStyleId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotStyle csysPotStyle){
		csysPotStyle.setCsysPotStyleModifyTime(DateUtils.newTimestamp());
		csysPotStyle.setCsysPotStyleModifyUser(csysUserView.getCsysUserId());
		csysPotStyleService.update(csysPotStyle);
	
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
		
		csysPotStyleService.deleteByIds(newids);
	
	}

	
}
