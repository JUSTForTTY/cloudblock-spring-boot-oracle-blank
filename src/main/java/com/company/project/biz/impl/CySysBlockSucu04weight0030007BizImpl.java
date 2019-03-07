package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu04weight0030007Service;
import com.company.project.biz.CySysBlockSucu04weight0030007Biz;
import com.company.project.model.CySysBlockSucu04weight0030007;
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
 * Created by tty on 2018/09/03.
 */
@Component
@Transactional
public class CySysBlockSucu04weight0030007BizImpl  implements CySysBlockSucu04weight0030007Biz {
    @Resource
    private CySysBlockSucu04weight0030007Service cySysBlockSucu04weight0030007Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu04weight0030007 getDataSettings(String id){
	
		CySysBlockSucu04weight0030007 cySysBlockSucu04weight0030007 = new CySysBlockSucu04weight0030007();
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007Id(id);
   		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007IsDelete("0");
		 
		return cySysBlockSucu04weight0030007Service.selectOne(cySysBlockSucu04weight0030007);
		
	
	}
	public List<CySysBlockSucu04weight0030007> getDataSettingsByCondition(CySysBlockSucu04weight0030007 cySysBlockSucu04weight0030007){
	
		 
   		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007IsDelete("0");
		return cySysBlockSucu04weight0030007Service.select(cySysBlockSucu04weight0030007);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu04weight0030007> list = cySysBlockSucu04weight0030007Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0030007 cySysBlockSucu04weight0030007){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007IsDelete("0");
        List<CySysBlockSucu04weight0030007> list = cySysBlockSucu04weight0030007Service.select(cySysBlockSucu04weight0030007);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0030007 cySysBlockSucu04weight0030007){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu04weight0030007");
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007Id(sequence);
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007IsDelete("0");
		cySysBlockSucu04weight0030007Service.save(cySysBlockSucu04weight0030007);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0030007 cySysBlockSucu04weight0030007){
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030007.setCySysBlockSucu04weight0030007ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030007Service.update(cySysBlockSucu04weight0030007);
	
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
		
		cySysBlockSucu04weight0030007Service.deleteByIds(newids);
	
	}

	
}
