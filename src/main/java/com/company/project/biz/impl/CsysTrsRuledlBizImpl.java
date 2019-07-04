package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsRuledlService;
import com.company.project.biz.CsysTrsRuledlBiz;
import com.company.project.model.CsysTrsRuledl;
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
 * Created by tty on 2019/07/04.
 */
@Component
@Transactional
public class CsysTrsRuledlBizImpl  implements CsysTrsRuledlBiz {
    @Resource
    private CsysTrsRuledlService csysTrsRuledlService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsRuledl getDataSettings(String id){
	
		CsysTrsRuledl csysTrsRuledl = new CsysTrsRuledl();
		csysTrsRuledl.setCsysTrsRuledlId(id);
   		csysTrsRuledl.setCsysTrsRuledlIsDelete("0");
		 
		return csysTrsRuledlService.selectOne(csysTrsRuledl);
		
	
	}
	public List<CsysTrsRuledl> getDataSettingsByCondition(CsysTrsRuledl csysTrsRuledl){
	
		 
   		csysTrsRuledl.setCsysTrsRuledlIsDelete("0");
		return csysTrsRuledlService.select(csysTrsRuledl);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsRuledl> list = csysTrsRuledlService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl){
	
		PageHelper.startPage(page, size);
		csysTrsRuledl.setCsysTrsRuledlIsDelete("0");
        List<CsysTrsRuledl> list = csysTrsRuledlService.select(csysTrsRuledl);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsRuledl");
		csysTrsRuledl.setCsysTrsRuledlId(sequence);
		csysTrsRuledl.setCsysTrsRuledlCreateTime(DateUtils.newTimestamp());
		csysTrsRuledl.setCsysTrsRuledlCreateUser(csysUserView.getCsysUserId());
		csysTrsRuledl.setCsysTrsRuledlModifyTime(DateUtils.newTimestamp());
		csysTrsRuledl.setCsysTrsRuledlModifyUser(csysUserView.getCsysUserId());
		csysTrsRuledl.setCsysTrsRuledlIsDelete("0");
		csysTrsRuledlService.save(csysTrsRuledl);
		
		return csysTrsRuledl.getCsysTrsRuledlId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl){
		csysTrsRuledl.setCsysTrsRuledlModifyTime(DateUtils.newTimestamp());
		csysTrsRuledl.setCsysTrsRuledlModifyUser(csysUserView.getCsysUserId());
		csysTrsRuledlService.update(csysTrsRuledl);
	
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
		
		csysTrsRuledlService.deleteByIds(newids);
	
	}

	
}
