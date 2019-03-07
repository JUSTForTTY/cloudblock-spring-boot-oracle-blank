package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu05button0010009Service;
import com.company.project.biz.CySysBlockSucu05button0010009Biz;
import com.company.project.model.CySysBlockSucu05button0010009;
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
 * Created by tty on 2018/08/28.
 */
@Component
@Transactional
public class CySysBlockSucu05button0010009BizImpl  implements CySysBlockSucu05button0010009Biz {
    @Resource
    private CySysBlockSucu05button0010009Service cySysBlockSucu05button0010009Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu05button0010009 getDataSettings(String id){
	
		CySysBlockSucu05button0010009 cySysBlockSucu05button0010009 = new CySysBlockSucu05button0010009();
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009Id(id);
   		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009IsDelete("0");
		 
		return cySysBlockSucu05button0010009Service.selectOne(cySysBlockSucu05button0010009);
		
	
	}
	public List<CySysBlockSucu05button0010009> getDataSettingsByCondition(CySysBlockSucu05button0010009 cySysBlockSucu05button0010009){
	
		 
   		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009IsDelete("0");
		return cySysBlockSucu05button0010009Service.select(cySysBlockSucu05button0010009);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu05button0010009> list = cySysBlockSucu05button0010009Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0010009 cySysBlockSucu05button0010009){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009IsDelete("0");
        List<CySysBlockSucu05button0010009> list = cySysBlockSucu05button0010009Service.select(cySysBlockSucu05button0010009);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010009 cySysBlockSucu05button0010009){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu05button0010009");
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009Id(sequence);
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009IsDelete("0");
		cySysBlockSucu05button0010009Service.save(cySysBlockSucu05button0010009);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010009 cySysBlockSucu05button0010009){
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu05button0010009.setCySysBlockSucu05button0010009ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu05button0010009Service.update(cySysBlockSucu05button0010009);
	
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
		
		cySysBlockSucu05button0010009Service.deleteByIds(newids);
	
	}

	
}
