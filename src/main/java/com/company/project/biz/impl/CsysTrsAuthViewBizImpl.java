package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysTrsAuthViewService;
import com.company.project.biz.CsysTrsAuthViewBiz;
import com.company.project.outer.model.CsysTrsAuthView;
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
public class CsysTrsAuthViewBizImpl  implements CsysTrsAuthViewBiz {
    @Resource
    private CsysTrsAuthViewService csysTrsAuthViewService;
	@Resource
    private CommonService commonService;
    
	public CsysTrsAuthView getDataSettings(String id){
	
		CsysTrsAuthView csysTrsAuthView = new CsysTrsAuthView();
		csysTrsAuthView.setCsysTrsAuthId(id);
   		 
		 
		return csysTrsAuthViewService.selectOne(csysTrsAuthView);
		
	
	}
	public List<CsysTrsAuthView> getDataSettingsByCondition(CsysTrsAuthView csysTrsAuthView){
	
		 
   		 
		return csysTrsAuthViewService.select(csysTrsAuthView);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysTrsAuthView> list = csysTrsAuthViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView){
	
		PageHelper.startPage(page, size);
		 
        List<CsysTrsAuthView> list = csysTrsAuthViewService.select(csysTrsAuthView);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysTrsAuthView");
		csysTrsAuthView.setCsysTrsAuthId(sequence);
		 
		csysTrsAuthViewService.save(csysTrsAuthView);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView){
		 
		csysTrsAuthViewService.update(csysTrsAuthView);
	
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
		
		csysTrsAuthViewService.deleteByIds(newids);
	
	}

	
}
