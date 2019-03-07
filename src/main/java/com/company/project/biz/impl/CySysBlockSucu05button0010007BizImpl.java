package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu05button0010007Service;
import com.company.project.biz.CySysBlockSucu05button0010007Biz;
import com.company.project.model.CySysBlockSucu05button0010007;
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
 * Created by tty on 2018/09/12.
 */
@Component
@Transactional
public class CySysBlockSucu05button0010007BizImpl  implements CySysBlockSucu05button0010007Biz {
    @Resource
    private CySysBlockSucu05button0010007Service cySysBlockSucu05button0010007Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu05button0010007 getDataSettings(String id){
	
		CySysBlockSucu05button0010007 cySysBlockSucu05button0010007 = new CySysBlockSucu05button0010007();
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007Id(id);
   		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007IsDelete("0");
		 
		return cySysBlockSucu05button0010007Service.selectOne(cySysBlockSucu05button0010007);
		
	
	}
	public List<CySysBlockSucu05button0010007> getDataSettingsByCondition(CySysBlockSucu05button0010007 cySysBlockSucu05button0010007){
	
		 
   		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007IsDelete("0");
		return cySysBlockSucu05button0010007Service.select(cySysBlockSucu05button0010007);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu05button0010007> list = cySysBlockSucu05button0010007Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007IsDelete("0");
        List<CySysBlockSucu05button0010007> list = cySysBlockSucu05button0010007Service.select(cySysBlockSucu05button0010007);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu05button0010007");
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007Id(sequence);
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007IsDelete("0");
		cySysBlockSucu05button0010007Service.save(cySysBlockSucu05button0010007);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007){
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010007.setCySysBlockSucu05button0010007ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010007Service.update(cySysBlockSucu05button0010007);
	
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
		
		cySysBlockSucu05button0010007Service.deleteByIds(newids);
	
	}

	
}
