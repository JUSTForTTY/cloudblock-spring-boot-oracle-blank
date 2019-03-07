package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu08searchweiget0040001Service;
import com.company.project.biz.CySysBlockSucu08searchweiget0040001Biz;
import com.company.project.model.CySysBlockSucu08searchweiget0040001;
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
public class CySysBlockSucu08searchweiget0040001BizImpl  implements CySysBlockSucu08searchweiget0040001Biz {
    @Resource
    private CySysBlockSucu08searchweiget0040001Service cySysBlockSucu08searchweiget0040001Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu08searchweiget0040001 getDataSettings(String id){
	
		CySysBlockSucu08searchweiget0040001 cySysBlockSucu08searchweiget0040001 = new CySysBlockSucu08searchweiget0040001();
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001Id(id);
   		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001IsDelete("0");
		 
		return cySysBlockSucu08searchweiget0040001Service.selectOne(cySysBlockSucu08searchweiget0040001);
		
	
	}
	public List<CySysBlockSucu08searchweiget0040001> getDataSettingsByCondition(CySysBlockSucu08searchweiget0040001 cySysBlockSucu08searchweiget0040001){
	
		 
   		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001IsDelete("0");
		return cySysBlockSucu08searchweiget0040001Service.select(cySysBlockSucu08searchweiget0040001);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu08searchweiget0040001> list = cySysBlockSucu08searchweiget0040001Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu08searchweiget0040001 cySysBlockSucu08searchweiget0040001){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001IsDelete("0");
        List<CySysBlockSucu08searchweiget0040001> list = cySysBlockSucu08searchweiget0040001Service.select(cySysBlockSucu08searchweiget0040001);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0040001 cySysBlockSucu08searchweiget0040001){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu08searchweiget0040001");
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001Id(sequence);
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001IsDelete("0");
		cySysBlockSucu08searchweiget0040001Service.save(cySysBlockSucu08searchweiget0040001);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0040001 cySysBlockSucu08searchweiget0040001){
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0040001.setCySysBlockSucu08searchweiget0040001ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0040001Service.update(cySysBlockSucu08searchweiget0040001);
	
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
		
		cySysBlockSucu08searchweiget0040001Service.deleteByIds(newids);
	
	}

	
}
