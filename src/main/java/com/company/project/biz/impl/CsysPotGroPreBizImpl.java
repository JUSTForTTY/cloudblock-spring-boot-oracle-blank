package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotGroPreService;
import com.company.project.biz.CsysPotGroPreBiz;
import com.company.project.model.CsysPotGroPre;
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
 * Created by tty on 2019/06/14.
 */
@Component
@Transactional
public class CsysPotGroPreBizImpl  implements CsysPotGroPreBiz {
    @Resource
    private CsysPotGroPreService csysPotGroPreService;
	@Resource
    private CommonService commonService;
    
	public CsysPotGroPre getDataSettings(String id){
	
		CsysPotGroPre csysPotGroPre = new CsysPotGroPre();
		csysPotGroPre.setCsysPotGroPreId(id);
   		csysPotGroPre.setCsysPotGroPreIsDelete("0");
		 
		return csysPotGroPreService.selectOne(csysPotGroPre);
		
	
	}
	public List<CsysPotGroPre> getDataSettingsByCondition(CsysPotGroPre csysPotGroPre){
	
		 
   		csysPotGroPre.setCsysPotGroPreIsDelete("0");
		return csysPotGroPreService.select(csysPotGroPre);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotGroPre> list = csysPotGroPreService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGroPre csysPotGroPre){
	
		PageHelper.startPage(page, size);
		csysPotGroPre.setCsysPotGroPreIsDelete("0");
        List<CsysPotGroPre> list = csysPotGroPreService.select(csysPotGroPre);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGroPre csysPotGroPre){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotGroPre");
		csysPotGroPre.setCsysPotGroPreId(sequence);
		csysPotGroPre.setCsysPotGroPreCreateTime(DateUtils.newTimestamp());
		csysPotGroPre.setCsysPotGroPreCreateUser(csysUserView.getCsysUserId());
		csysPotGroPre.setCsysPotGroPreModifyTime(DateUtils.newTimestamp());
		csysPotGroPre.setCsysPotGroPreModifyUser(csysUserView.getCsysUserId());
		csysPotGroPre.setCsysPotGroPreIsDelete("0");
		csysPotGroPreService.save(csysPotGroPre);
		
		return csysPotGroPre.getCsysPotGroPreId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGroPre csysPotGroPre){
		csysPotGroPre.setCsysPotGroPreModifyTime(DateUtils.newTimestamp());
		csysPotGroPre.setCsysPotGroPreModifyUser(csysUserView.getCsysUserId());
		csysPotGroPreService.update(csysPotGroPre);
	
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
		
		csysPotGroPreService.deleteByIds(newids);
	
	}

	
}
