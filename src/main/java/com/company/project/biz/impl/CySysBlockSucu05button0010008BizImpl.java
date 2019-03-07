package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu05button0010008Service;
import com.company.project.biz.CySysBlockSucu05button0010008Biz;
import com.company.project.model.CySysBlockSucu05button0010008;
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
public class CySysBlockSucu05button0010008BizImpl  implements CySysBlockSucu05button0010008Biz {
    @Resource
    private CySysBlockSucu05button0010008Service cySysBlockSucu05button0010008Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu05button0010008 getDataSettings(String id){
	
		CySysBlockSucu05button0010008 cySysBlockSucu05button0010008 = new CySysBlockSucu05button0010008();
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008Id(id);
   		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008IsDelete("0");
		 
		return cySysBlockSucu05button0010008Service.selectOne(cySysBlockSucu05button0010008);
		
	
	}
	public List<CySysBlockSucu05button0010008> getDataSettingsByCondition(CySysBlockSucu05button0010008 cySysBlockSucu05button0010008){
	
		 
   		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008IsDelete("0");
		return cySysBlockSucu05button0010008Service.select(cySysBlockSucu05button0010008);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu05button0010008> list = cySysBlockSucu05button0010008Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0010008 cySysBlockSucu05button0010008){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008IsDelete("0");
        List<CySysBlockSucu05button0010008> list = cySysBlockSucu05button0010008Service.select(cySysBlockSucu05button0010008);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010008 cySysBlockSucu05button0010008){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu05button0010008");
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008Id(sequence);
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008IsDelete("0");
		cySysBlockSucu05button0010008Service.save(cySysBlockSucu05button0010008);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010008 cySysBlockSucu05button0010008){
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010008.setCySysBlockSucu05button0010008ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010008Service.update(cySysBlockSucu05button0010008);
	
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
		
		cySysBlockSucu05button0010008Service.deleteByIds(newids);
	
	}

	
}
