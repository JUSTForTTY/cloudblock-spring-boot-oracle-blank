package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu04weight0030006Service;
import com.company.project.biz.CySysBlockSucu04weight0030006Biz;
import com.company.project.model.CySysBlockSucu04weight0030006;
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
public class CySysBlockSucu04weight0030006BizImpl  implements CySysBlockSucu04weight0030006Biz {
    @Resource
    private CySysBlockSucu04weight0030006Service cySysBlockSucu04weight0030006Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu04weight0030006 getDataSettings(String id){
	
		CySysBlockSucu04weight0030006 cySysBlockSucu04weight0030006 = new CySysBlockSucu04weight0030006();
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006Id(id);
   		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006IsDelete("0");
		 
		return cySysBlockSucu04weight0030006Service.selectOne(cySysBlockSucu04weight0030006);
		
	
	}
	public List<CySysBlockSucu04weight0030006> getDataSettingsByCondition(CySysBlockSucu04weight0030006 cySysBlockSucu04weight0030006){
	
		 
   		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006IsDelete("0");
		return cySysBlockSucu04weight0030006Service.select(cySysBlockSucu04weight0030006);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu04weight0030006> list = cySysBlockSucu04weight0030006Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0030006 cySysBlockSucu04weight0030006){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006IsDelete("0");
        List<CySysBlockSucu04weight0030006> list = cySysBlockSucu04weight0030006Service.select(cySysBlockSucu04weight0030006);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0030006 cySysBlockSucu04weight0030006){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu04weight0030006");
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006Id(sequence);
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006IsDelete("0");
		cySysBlockSucu04weight0030006Service.save(cySysBlockSucu04weight0030006);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0030006 cySysBlockSucu04weight0030006){
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0030006.setCySysBlockSucu04weight0030006ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0030006Service.update(cySysBlockSucu04weight0030006);
	
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
		
		cySysBlockSucu04weight0030006Service.deleteByIds(newids);
	
	}

	
}
