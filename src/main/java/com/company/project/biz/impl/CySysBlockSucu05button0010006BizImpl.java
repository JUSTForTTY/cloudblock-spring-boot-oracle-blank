package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu05button0010006Service;
import com.company.project.biz.CySysBlockSucu05button0010006Biz;
import com.company.project.model.CySysBlockSucu05button0010006;
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
public class CySysBlockSucu05button0010006BizImpl  implements CySysBlockSucu05button0010006Biz {
    @Resource
    private CySysBlockSucu05button0010006Service cySysBlockSucu05button0010006Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu05button0010006 getDataSettings(String id){
	
		CySysBlockSucu05button0010006 cySysBlockSucu05button0010006 = new CySysBlockSucu05button0010006();
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006Id(id);
   		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006IsDelete("0");
		 
		return cySysBlockSucu05button0010006Service.selectOne(cySysBlockSucu05button0010006);
		
	
	}
	public List<CySysBlockSucu05button0010006> getDataSettingsByCondition(CySysBlockSucu05button0010006 cySysBlockSucu05button0010006){
	
		 
   		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006IsDelete("0");
		return cySysBlockSucu05button0010006Service.select(cySysBlockSucu05button0010006);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu05button0010006> list = cySysBlockSucu05button0010006Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0010006 cySysBlockSucu05button0010006){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006IsDelete("0");
        List<CySysBlockSucu05button0010006> list = cySysBlockSucu05button0010006Service.select(cySysBlockSucu05button0010006);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010006 cySysBlockSucu05button0010006){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu05button0010006");
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006Id(sequence);
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006IsDelete("0");
		cySysBlockSucu05button0010006Service.save(cySysBlockSucu05button0010006);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010006 cySysBlockSucu05button0010006){
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010006.setCySysBlockSucu05button0010006ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010006Service.update(cySysBlockSucu05button0010006);
	
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
		
		cySysBlockSucu05button0010006Service.deleteByIds(newids);
	
	}

	
}
