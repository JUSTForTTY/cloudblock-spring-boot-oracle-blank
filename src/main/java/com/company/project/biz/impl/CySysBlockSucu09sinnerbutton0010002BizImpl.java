package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu09sinnerbutton0010002Service;
import com.company.project.biz.CySysBlockSucu09sinnerbutton0010002Biz;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010002;
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
public class CySysBlockSucu09sinnerbutton0010002BizImpl  implements CySysBlockSucu09sinnerbutton0010002Biz {
    @Resource
    private CySysBlockSucu09sinnerbutton0010002Service cySysBlockSucu09sinnerbutton0010002Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu09sinnerbutton0010002 getDataSettings(String id){
	
		CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002 = new CySysBlockSucu09sinnerbutton0010002();
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002Id(id);
   		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002IsDelete("0");
		 
		return cySysBlockSucu09sinnerbutton0010002Service.selectOne(cySysBlockSucu09sinnerbutton0010002);
		
	
	}
	public List<CySysBlockSucu09sinnerbutton0010002> getDataSettingsByCondition(CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002){
	
		 
   		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002IsDelete("0");
		return cySysBlockSucu09sinnerbutton0010002Service.select(cySysBlockSucu09sinnerbutton0010002);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu09sinnerbutton0010002> list = cySysBlockSucu09sinnerbutton0010002Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002IsDelete("0");
        List<CySysBlockSucu09sinnerbutton0010002> list = cySysBlockSucu09sinnerbutton0010002Service.select(cySysBlockSucu09sinnerbutton0010002);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu09sinnerbutton0010002");
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002Id(sequence);
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002IsDelete("0");
		cySysBlockSucu09sinnerbutton0010002Service.save(cySysBlockSucu09sinnerbutton0010002);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002){
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu09sinnerbutton0010002.setCySysBlockSucu09sinnerbutton0010002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu09sinnerbutton0010002Service.update(cySysBlockSucu09sinnerbutton0010002);
	
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
		
		cySysBlockSucu09sinnerbutton0010002Service.deleteByIds(newids);
	
	}

	
}
