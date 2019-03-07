package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsPageService;
import com.company.project.biz.CsysTrsPageBiz;
import com.company.project.outer.model.CsysTrsPage;
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
public class CsysTrsPageBizImpl  implements CsysTrsPageBiz {
    @Resource
    private CsysTrsPageService csysTrsPageService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsPage getDataSettings(String id){
	
		CsysTrsPage csysTrsPage = new CsysTrsPage();
		csysTrsPage.setCsysTrsPageId(id);
   		csysTrsPage.setCsysTrsPageIsDelete("0");
		 
		return csysTrsPageService.selectOne(csysTrsPage);
		
	
	}
	public List<CsysTrsPage> getDataSettingsByCondition(CsysTrsPage csysTrsPage){
	
		 
   		csysTrsPage.setCsysTrsPageIsDelete("0");
		return csysTrsPageService.select(csysTrsPage);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsPage> list = csysTrsPageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsPage csysTrsPage){
	
		PageHelper.startPage(page, size);
		csysTrsPage.setCsysTrsPageIsDelete("0");
        List<CsysTrsPage> list = csysTrsPageService.select(csysTrsPage);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsPage csysTrsPage){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsPage");
		csysTrsPage.setCsysTrsPageId(sequence);
		csysTrsPage.setCsysTrsPageCreateTime(DateUtils.newTimestamp());
		csysTrsPage.setCsysTrsPageCreateUser(baseUserView.getCsysUserId());
		csysTrsPage.setCsysTrsPageModifyTime(DateUtils.newTimestamp());
		csysTrsPage.setCsysTrsPageModifyUser(baseUserView.getCsysUserId());
		csysTrsPage.setCsysTrsPageIsDelete("0");
		csysTrsPageService.save(csysTrsPage);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsPage csysTrsPage){
		csysTrsPage.setCsysTrsPageModifyTime(DateUtils.newTimestamp());
		csysTrsPage.setCsysTrsPageModifyUser(baseUserView.getCsysUserId());
		csysTrsPageService.update(csysTrsPage);
	
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
		
		csysTrsPageService.deleteByIds(newids);
	
	}

	
}
