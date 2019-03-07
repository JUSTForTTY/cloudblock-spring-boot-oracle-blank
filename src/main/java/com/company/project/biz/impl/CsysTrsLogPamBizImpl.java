package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsLogPamService;
import com.company.project.biz.CsysTrsLogPamBiz;
import com.company.project.outer.model.CsysTrsLogPam;
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
public class CsysTrsLogPamBizImpl  implements CsysTrsLogPamBiz {
    @Resource
    private CsysTrsLogPamService csysTrsLogPamService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsLogPam getDataSettings(String id){
	
		CsysTrsLogPam csysTrsLogPam = new CsysTrsLogPam();
		csysTrsLogPam.setCsysTrsLogPamId(id);
   		csysTrsLogPam.setCsysTrsLogPamIsDelete("0");
		 
		return csysTrsLogPamService.selectOne(csysTrsLogPam);
		
	
	}
	public List<CsysTrsLogPam> getDataSettingsByCondition(CsysTrsLogPam csysTrsLogPam){
	
		 
   		csysTrsLogPam.setCsysTrsLogPamIsDelete("0");
		return csysTrsLogPamService.select(csysTrsLogPam);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsLogPam> list = csysTrsLogPamService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam){
	
		PageHelper.startPage(page, size);
		csysTrsLogPam.setCsysTrsLogPamIsDelete("0");
        List<CsysTrsLogPam> list = csysTrsLogPamService.select(csysTrsLogPam);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsLogPam");
		csysTrsLogPam.setCsysTrsLogPamId(sequence);
		csysTrsLogPam.setCsysTrsLogPamCreateTime(DateUtils.newTimestamp());
		csysTrsLogPam.setCsysTrsLogPamCreateUser(baseUserView.getCsysUserId());
		csysTrsLogPam.setCsysTrsLogPamModifyTime(DateUtils.newTimestamp());
		csysTrsLogPam.setCsysTrsLogPamModifyUser(baseUserView.getCsysUserId());
		csysTrsLogPam.setCsysTrsLogPamIsDelete("0");
		csysTrsLogPamService.save(csysTrsLogPam);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam){
		csysTrsLogPam.setCsysTrsLogPamModifyTime(DateUtils.newTimestamp());
		csysTrsLogPam.setCsysTrsLogPamModifyUser(baseUserView.getCsysUserId());
		csysTrsLogPamService.update(csysTrsLogPam);
	
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
		
		csysTrsLogPamService.deleteByIds(newids);
	
	}

	
}
