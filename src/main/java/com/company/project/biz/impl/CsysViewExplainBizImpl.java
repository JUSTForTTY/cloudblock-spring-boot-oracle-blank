package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysViewExplainService;
import com.company.project.biz.CsysViewExplainBiz;
import com.company.project.outer.model.CsysViewExplain;
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
public class CsysViewExplainBizImpl  implements CsysViewExplainBiz {
    @Resource
    private CsysViewExplainService csysViewExplainService;
	@Resource
    private CommonService commonService;
    
	public CsysViewExplain getDataSettings(String id){
	
		CsysViewExplain csysViewExplain = new CsysViewExplain();
		csysViewExplain.setCsysViewExplainId(id);
   		csysViewExplain.setCsysViewExplainIsDelete("0");
		 
		return csysViewExplainService.selectOne(csysViewExplain);
		
	
	}
	public List<CsysViewExplain> getDataSettingsByCondition(CsysViewExplain csysViewExplain){
	
		 
   		csysViewExplain.setCsysViewExplainIsDelete("0");
		return csysViewExplainService.select(csysViewExplain);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysViewExplain> list = csysViewExplainService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysViewExplain csysViewExplain){
	
		PageHelper.startPage(page, size);
		csysViewExplain.setCsysViewExplainIsDelete("0");
        List<CsysViewExplain> list = csysViewExplainService.select(csysViewExplain);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysViewExplain csysViewExplain){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysViewExplain");
		csysViewExplain.setCsysViewExplainId(sequence);
		csysViewExplain.setCsysViewExplainCreateTime(DateUtils.newTimestamp());
		csysViewExplain.setCsysViewExplainCreateUser(baseUserView.getCsysUserId());
		csysViewExplain.setCsysViewExplainModifyTime(DateUtils.newTimestamp());
		csysViewExplain.setCsysViewExplainModifyUser(baseUserView.getCsysUserId());
		csysViewExplain.setCsysViewExplainIsDelete("0");
		csysViewExplainService.save(csysViewExplain);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysViewExplain csysViewExplain){
		csysViewExplain.setCsysViewExplainModifyTime(DateUtils.newTimestamp());
		csysViewExplain.setCsysViewExplainModifyUser(baseUserView.getCsysUserId());
		csysViewExplainService.update(csysViewExplain);
	
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
		
		csysViewExplainService.deleteByIds(newids);
	
	}

	
}
