package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu03charts0020001Service;
import com.company.project.biz.CySysBlockSucu03charts0020001Biz;
import com.company.project.model.CySysBlockSucu03charts0020001;
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
public class CySysBlockSucu03charts0020001BizImpl  implements CySysBlockSucu03charts0020001Biz {
    @Resource
    private CySysBlockSucu03charts0020001Service cySysBlockSucu03charts0020001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu03charts0020001 getDataSettings(String id){
	
		CySysBlockSucu03charts0020001 cySysBlockSucu03charts0020001 = new CySysBlockSucu03charts0020001();
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001Id(id);
   		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001IsDelete("0");
		 
		return cySysBlockSucu03charts0020001Service.selectOne(cySysBlockSucu03charts0020001);
		
	
	}
	public List<CySysBlockSucu03charts0020001> getDataSettingsByCondition(CySysBlockSucu03charts0020001 cySysBlockSucu03charts0020001){
	
		 
   		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001IsDelete("0");
		return cySysBlockSucu03charts0020001Service.select(cySysBlockSucu03charts0020001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu03charts0020001> list = cySysBlockSucu03charts0020001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu03charts0020001 cySysBlockSucu03charts0020001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001IsDelete("0");
        List<CySysBlockSucu03charts0020001> list = cySysBlockSucu03charts0020001Service.select(cySysBlockSucu03charts0020001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0020001 cySysBlockSucu03charts0020001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu03charts0020001");
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001Id(sequence);
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001IsDelete("0");
		cySysBlockSucu03charts0020001Service.save(cySysBlockSucu03charts0020001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0020001 cySysBlockSucu03charts0020001){
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0020001.setCySysBlockSucu03charts0020001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0020001Service.update(cySysBlockSucu03charts0020001);
	
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
		
		cySysBlockSucu03charts0020001Service.deleteByIds(newids);
	
	}

	
}
