package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu03charts0010003Service;
import com.company.project.biz.CySysBlockSucu03charts0010003Biz;
import com.company.project.model.CySysBlockSucu03charts0010003;
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
public class CySysBlockSucu03charts0010003BizImpl  implements CySysBlockSucu03charts0010003Biz {
    @Resource
    private CySysBlockSucu03charts0010003Service cySysBlockSucu03charts0010003Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu03charts0010003 getDataSettings(String id){
	
		CySysBlockSucu03charts0010003 cySysBlockSucu03charts0010003 = new CySysBlockSucu03charts0010003();
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003Id(id);
   		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003IsDelete("0");
		 
		return cySysBlockSucu03charts0010003Service.selectOne(cySysBlockSucu03charts0010003);
		
	
	}
	public List<CySysBlockSucu03charts0010003> getDataSettingsByCondition(CySysBlockSucu03charts0010003 cySysBlockSucu03charts0010003){
	
		 
   		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003IsDelete("0");
		return cySysBlockSucu03charts0010003Service.select(cySysBlockSucu03charts0010003);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu03charts0010003> list = cySysBlockSucu03charts0010003Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu03charts0010003 cySysBlockSucu03charts0010003){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003IsDelete("0");
        List<CySysBlockSucu03charts0010003> list = cySysBlockSucu03charts0010003Service.select(cySysBlockSucu03charts0010003);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0010003 cySysBlockSucu03charts0010003){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu03charts0010003");
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003Id(sequence);
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003IsDelete("0");
		cySysBlockSucu03charts0010003Service.save(cySysBlockSucu03charts0010003);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0010003 cySysBlockSucu03charts0010003){
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu03charts0010003.setCySysBlockSucu03charts0010003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu03charts0010003Service.update(cySysBlockSucu03charts0010003);
	
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
		
		cySysBlockSucu03charts0010003Service.deleteByIds(newids);
	
	}

	
}
