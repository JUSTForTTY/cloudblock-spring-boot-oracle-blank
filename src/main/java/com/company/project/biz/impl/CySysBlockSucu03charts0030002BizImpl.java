package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu03charts0030002Service;
import com.company.project.biz.CySysBlockSucu03charts0030002Biz;
import com.company.project.model.CySysBlockSucu03charts0030002;
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
public class CySysBlockSucu03charts0030002BizImpl  implements CySysBlockSucu03charts0030002Biz {
    @Resource
    private CySysBlockSucu03charts0030002Service cySysBlockSucu03charts0030002Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu03charts0030002 getDataSettings(String id){
	
		CySysBlockSucu03charts0030002 cySysBlockSucu03charts0030002 = new CySysBlockSucu03charts0030002();
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002Id(id);
   		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002IsDelete("0");
		 
		return cySysBlockSucu03charts0030002Service.selectOne(cySysBlockSucu03charts0030002);
		
	
	}
	public List<CySysBlockSucu03charts0030002> getDataSettingsByCondition(CySysBlockSucu03charts0030002 cySysBlockSucu03charts0030002){
	
		 
   		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002IsDelete("0");
		return cySysBlockSucu03charts0030002Service.select(cySysBlockSucu03charts0030002);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu03charts0030002> list = cySysBlockSucu03charts0030002Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu03charts0030002 cySysBlockSucu03charts0030002){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002IsDelete("0");
        List<CySysBlockSucu03charts0030002> list = cySysBlockSucu03charts0030002Service.select(cySysBlockSucu03charts0030002);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030002 cySysBlockSucu03charts0030002){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu03charts0030002");
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002Id(sequence);
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002IsDelete("0");
		cySysBlockSucu03charts0030002Service.save(cySysBlockSucu03charts0030002);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030002 cySysBlockSucu03charts0030002){
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030002.setCySysBlockSucu03charts0030002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030002Service.update(cySysBlockSucu03charts0030002);
	
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
		
		cySysBlockSucu03charts0030002Service.deleteByIds(newids);
	
	}

	
}
