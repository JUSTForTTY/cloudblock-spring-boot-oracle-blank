package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotTrsConService;
import com.company.project.biz.CsysPotTrsConBiz;
import com.company.project.outer.model.CsysPotTrsCon;
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
 * Created by tty on 2019/02/26.
 */
@Component
@Transactional
public class CsysPotTrsConBizImpl  implements CsysPotTrsConBiz {
    @Resource
    private CsysPotTrsConService csysPotTrsConService;
	@Resource
    private CommonService commonService;
    
	public CsysPotTrsCon getDataSettings(String id){
	
		CsysPotTrsCon csysPotTrsCon = new CsysPotTrsCon();
		csysPotTrsCon.setCsysPotTrsConId(id);
   		csysPotTrsCon.setCsysPotTrsConIsDelete("0");
		 
		return csysPotTrsConService.selectOne(csysPotTrsCon);
		
	
	}
	public List<CsysPotTrsCon> getDataSettingsByCondition(CsysPotTrsCon csysPotTrsCon){
	
		 
   		csysPotTrsCon.setCsysPotTrsConIsDelete("0");
		return csysPotTrsConService.select(csysPotTrsCon);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotTrsCon> list = csysPotTrsConService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon){
	
		PageHelper.startPage(page, size);
		csysPotTrsCon.setCsysPotTrsConIsDelete("0");
        List<CsysPotTrsCon> list = csysPotTrsConService.select(csysPotTrsCon);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotTrsCon");
		csysPotTrsCon.setCsysPotTrsConId(sequence);
		csysPotTrsCon.setCsysPotTrsConCreateTime(DateUtils.newTimestamp());
		csysPotTrsCon.setCsysPotTrsConCreateUser(baseUserView.getCsysUserId());
		csysPotTrsCon.setCsysPotTrsConModifyTime(DateUtils.newTimestamp());
		csysPotTrsCon.setCsysPotTrsConModifyUser(baseUserView.getCsysUserId());
		csysPotTrsCon.setCsysPotTrsConIsDelete("0");
		csysPotTrsConService.save(csysPotTrsCon);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon){
		csysPotTrsCon.setCsysPotTrsConModifyTime(DateUtils.newTimestamp());
		csysPotTrsCon.setCsysPotTrsConModifyUser(baseUserView.getCsysUserId());
		csysPotTrsConService.update(csysPotTrsCon);
	
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
		
		csysPotTrsConService.deleteByIds(newids);
	
	}

	
}
