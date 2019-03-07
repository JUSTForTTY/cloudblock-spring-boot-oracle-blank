package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu04weight0060001Service;
import com.company.project.biz.CySysBlockSucu04weight0060001Biz;
import com.company.project.model.CySysBlockSucu04weight0060001;
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
public class CySysBlockSucu04weight0060001BizImpl  implements CySysBlockSucu04weight0060001Biz {
    @Resource
    private CySysBlockSucu04weight0060001Service cySysBlockSucu04weight0060001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu04weight0060001 getDataSettings(String id){
	
		CySysBlockSucu04weight0060001 cySysBlockSucu04weight0060001 = new CySysBlockSucu04weight0060001();
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001Id(id);
   		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001IsDelete("0");
		 
		return cySysBlockSucu04weight0060001Service.selectOne(cySysBlockSucu04weight0060001);
		
	
	}
	public List<CySysBlockSucu04weight0060001> getDataSettingsByCondition(CySysBlockSucu04weight0060001 cySysBlockSucu04weight0060001){
	
		 
   		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001IsDelete("0");
		return cySysBlockSucu04weight0060001Service.select(cySysBlockSucu04weight0060001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu04weight0060001> list = cySysBlockSucu04weight0060001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0060001 cySysBlockSucu04weight0060001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001IsDelete("0");
        List<CySysBlockSucu04weight0060001> list = cySysBlockSucu04weight0060001Service.select(cySysBlockSucu04weight0060001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0060001 cySysBlockSucu04weight0060001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu04weight0060001");
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001Id(sequence);
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001IsDelete("0");
		cySysBlockSucu04weight0060001Service.save(cySysBlockSucu04weight0060001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0060001 cySysBlockSucu04weight0060001){
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0060001.setCySysBlockSucu04weight0060001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0060001Service.update(cySysBlockSucu04weight0060001);
	
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
		
		cySysBlockSucu04weight0060001Service.deleteByIds(newids);
	
	}

	
}
