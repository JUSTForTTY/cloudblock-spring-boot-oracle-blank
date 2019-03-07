package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu03charts0030003Service;
import com.company.project.biz.CySysBlockSucu03charts0030003Biz;
import com.company.project.model.CySysBlockSucu03charts0030003;
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
public class CySysBlockSucu03charts0030003BizImpl  implements CySysBlockSucu03charts0030003Biz {
    @Resource
    private CySysBlockSucu03charts0030003Service cySysBlockSucu03charts0030003Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu03charts0030003 getDataSettings(String id){
	
		CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003 = new CySysBlockSucu03charts0030003();
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003Id(id);
   		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003IsDelete("0");
		 
		return cySysBlockSucu03charts0030003Service.selectOne(cySysBlockSucu03charts0030003);
		
	
	}
	public List<CySysBlockSucu03charts0030003> getDataSettingsByCondition(CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003){
	
		 
   		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003IsDelete("0");
		return cySysBlockSucu03charts0030003Service.select(cySysBlockSucu03charts0030003);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu03charts0030003> list = cySysBlockSucu03charts0030003Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003IsDelete("0");
        List<CySysBlockSucu03charts0030003> list = cySysBlockSucu03charts0030003Service.select(cySysBlockSucu03charts0030003);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu03charts0030003");
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003Id(sequence);
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003IsDelete("0");
		cySysBlockSucu03charts0030003Service.save(cySysBlockSucu03charts0030003);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003){
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0030003.setCySysBlockSucu03charts0030003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0030003Service.update(cySysBlockSucu03charts0030003);
	
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
		
		cySysBlockSucu03charts0030003Service.deleteByIds(newids);
	
	}

	
}
