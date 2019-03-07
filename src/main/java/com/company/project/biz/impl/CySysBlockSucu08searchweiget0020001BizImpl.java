package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu08searchweiget0020001Service;
import com.company.project.biz.CySysBlockSucu08searchweiget0020001Biz;
import com.company.project.model.CySysBlockSucu08searchweiget0020001;
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
public class CySysBlockSucu08searchweiget0020001BizImpl  implements CySysBlockSucu08searchweiget0020001Biz {
    @Resource
    private CySysBlockSucu08searchweiget0020001Service cySysBlockSucu08searchweiget0020001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu08searchweiget0020001 getDataSettings(String id){
	
		CySysBlockSucu08searchweiget0020001 cySysBlockSucu08searchweiget0020001 = new CySysBlockSucu08searchweiget0020001();
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001Id(id);
   		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001IsDelete("0");
		 
		return cySysBlockSucu08searchweiget0020001Service.selectOne(cySysBlockSucu08searchweiget0020001);
		
	
	}
	public List<CySysBlockSucu08searchweiget0020001> getDataSettingsByCondition(CySysBlockSucu08searchweiget0020001 cySysBlockSucu08searchweiget0020001){
	
		 
   		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001IsDelete("0");
		return cySysBlockSucu08searchweiget0020001Service.select(cySysBlockSucu08searchweiget0020001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu08searchweiget0020001> list = cySysBlockSucu08searchweiget0020001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu08searchweiget0020001 cySysBlockSucu08searchweiget0020001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001IsDelete("0");
        List<CySysBlockSucu08searchweiget0020001> list = cySysBlockSucu08searchweiget0020001Service.select(cySysBlockSucu08searchweiget0020001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0020001 cySysBlockSucu08searchweiget0020001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu08searchweiget0020001");
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001Id(sequence);
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001IsDelete("0");
		cySysBlockSucu08searchweiget0020001Service.save(cySysBlockSucu08searchweiget0020001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0020001 cySysBlockSucu08searchweiget0020001){
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0020001.setCySysBlockSucu08searchweiget0020001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0020001Service.update(cySysBlockSucu08searchweiget0020001);
	
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
		
		cySysBlockSucu08searchweiget0020001Service.deleteByIds(newids);
	
	}

	
}
