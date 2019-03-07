package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu04weight0010002Service;
import com.company.project.biz.CySysBlockSucu04weight0010002Biz;
import com.company.project.model.CySysBlockSucu04weight0010002;
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
public class CySysBlockSucu04weight0010002BizImpl  implements CySysBlockSucu04weight0010002Biz {
    @Resource
    private CySysBlockSucu04weight0010002Service cySysBlockSucu04weight0010002Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu04weight0010002 getDataSettings(String id){
	
		CySysBlockSucu04weight0010002 cySysBlockSucu04weight0010002 = new CySysBlockSucu04weight0010002();
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002Id(id);
   		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002IsDelete("0");
		 
		return cySysBlockSucu04weight0010002Service.selectOne(cySysBlockSucu04weight0010002);
		
	
	}
	public List<CySysBlockSucu04weight0010002> getDataSettingsByCondition(CySysBlockSucu04weight0010002 cySysBlockSucu04weight0010002){
	
		 
   		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002IsDelete("0");
		return cySysBlockSucu04weight0010002Service.select(cySysBlockSucu04weight0010002);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu04weight0010002> list = cySysBlockSucu04weight0010002Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0010002 cySysBlockSucu04weight0010002){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002IsDelete("0");
        List<CySysBlockSucu04weight0010002> list = cySysBlockSucu04weight0010002Service.select(cySysBlockSucu04weight0010002);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0010002 cySysBlockSucu04weight0010002){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu04weight0010002");
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002Id(sequence);
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002IsDelete("0");
		cySysBlockSucu04weight0010002Service.save(cySysBlockSucu04weight0010002);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0010002 cySysBlockSucu04weight0010002){
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0010002.setCySysBlockSucu04weight0010002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0010002Service.update(cySysBlockSucu04weight0010002);
	
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
		
		cySysBlockSucu04weight0010002Service.deleteByIds(newids);
	
	}

	
}
