package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu09sinnerbutton0010001Service;
import com.company.project.biz.CySysBlockSucu09sinnerbutton0010001Biz;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010001;
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
public class CySysBlockSucu09sinnerbutton0010001BizImpl  implements CySysBlockSucu09sinnerbutton0010001Biz {
    @Resource
    private CySysBlockSucu09sinnerbutton0010001Service cySysBlockSucu09sinnerbutton0010001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu09sinnerbutton0010001 getDataSettings(String id){
	
		CySysBlockSucu09sinnerbutton0010001 cySysBlockSucu09sinnerbutton0010001 = new CySysBlockSucu09sinnerbutton0010001();
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001Id(id);
   		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001IsDelete("0");
		 
		return cySysBlockSucu09sinnerbutton0010001Service.selectOne(cySysBlockSucu09sinnerbutton0010001);
		
	
	}
	public List<CySysBlockSucu09sinnerbutton0010001> getDataSettingsByCondition(CySysBlockSucu09sinnerbutton0010001 cySysBlockSucu09sinnerbutton0010001){
	
		 
   		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001IsDelete("0");
		return cySysBlockSucu09sinnerbutton0010001Service.select(cySysBlockSucu09sinnerbutton0010001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu09sinnerbutton0010001> list = cySysBlockSucu09sinnerbutton0010001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010001 cySysBlockSucu09sinnerbutton0010001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001IsDelete("0");
        List<CySysBlockSucu09sinnerbutton0010001> list = cySysBlockSucu09sinnerbutton0010001Service.select(cySysBlockSucu09sinnerbutton0010001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010001 cySysBlockSucu09sinnerbutton0010001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu09sinnerbutton0010001");
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001Id(sequence);
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001IsDelete("0");
		cySysBlockSucu09sinnerbutton0010001Service.save(cySysBlockSucu09sinnerbutton0010001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010001 cySysBlockSucu09sinnerbutton0010001){
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010001.setCySysBlockSucu09sinnerbutton0010001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010001Service.update(cySysBlockSucu09sinnerbutton0010001);
	
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
		
		cySysBlockSucu09sinnerbutton0010001Service.deleteByIds(newids);
	
	}

	
}
