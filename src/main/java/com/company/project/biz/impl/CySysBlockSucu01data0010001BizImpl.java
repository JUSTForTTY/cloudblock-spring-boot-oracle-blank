package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu01data0010001Service;
import com.company.project.biz.CySysBlockSucu01data0010001Biz;
import com.company.project.model.CySysBlockSucu01data0010001;
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
public class CySysBlockSucu01data0010001BizImpl  implements CySysBlockSucu01data0010001Biz {
    @Resource
    private CySysBlockSucu01data0010001Service cySysBlockSucu01data0010001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu01data0010001 getDataSettings(String id){
	
		CySysBlockSucu01data0010001 cySysBlockSucu01data0010001 = new CySysBlockSucu01data0010001();
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001Id(id);
   		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001IsDelete("0");
		 
		return cySysBlockSucu01data0010001Service.selectOne(cySysBlockSucu01data0010001);
		
	
	}
	public List<CySysBlockSucu01data0010001> getDataSettingsByCondition(CySysBlockSucu01data0010001 cySysBlockSucu01data0010001){
	
		 
   		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001IsDelete("0");
		return cySysBlockSucu01data0010001Service.select(cySysBlockSucu01data0010001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu01data0010001> list = cySysBlockSucu01data0010001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu01data0010001 cySysBlockSucu01data0010001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001IsDelete("0");
        List<CySysBlockSucu01data0010001> list = cySysBlockSucu01data0010001Service.select(cySysBlockSucu01data0010001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu01data0010001 cySysBlockSucu01data0010001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu01data0010001");
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001Id(sequence);
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001IsDelete("0");
		cySysBlockSucu01data0010001Service.save(cySysBlockSucu01data0010001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu01data0010001 cySysBlockSucu01data0010001){
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu01data0010001.setCySysBlockSucu01data0010001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu01data0010001Service.update(cySysBlockSucu01data0010001);
	
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
		
		cySysBlockSucu01data0010001Service.deleteByIds(newids);
	
	}

	
}
