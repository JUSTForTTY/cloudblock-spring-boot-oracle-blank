package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu04weight0020002Service;
import com.company.project.biz.CySysBlockSucu04weight0020002Biz;
import com.company.project.model.CySysBlockSucu04weight0020002;
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
public class CySysBlockSucu04weight0020002BizImpl  implements CySysBlockSucu04weight0020002Biz {
    @Resource
    private CySysBlockSucu04weight0020002Service cySysBlockSucu04weight0020002Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu04weight0020002 getDataSettings(String id){
	
		CySysBlockSucu04weight0020002 cySysBlockSucu04weight0020002 = new CySysBlockSucu04weight0020002();
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002Id(id);
   		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002IsDelete("0");
		 
		return cySysBlockSucu04weight0020002Service.selectOne(cySysBlockSucu04weight0020002);
		
	
	}
	public List<CySysBlockSucu04weight0020002> getDataSettingsByCondition(CySysBlockSucu04weight0020002 cySysBlockSucu04weight0020002){
	
		 
   		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002IsDelete("0");
		return cySysBlockSucu04weight0020002Service.select(cySysBlockSucu04weight0020002);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu04weight0020002> list = cySysBlockSucu04weight0020002Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0020002 cySysBlockSucu04weight0020002){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002IsDelete("0");
        List<CySysBlockSucu04weight0020002> list = cySysBlockSucu04weight0020002Service.select(cySysBlockSucu04weight0020002);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0020002 cySysBlockSucu04weight0020002){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu04weight0020002");
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002Id(sequence);
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002IsDelete("0");
		cySysBlockSucu04weight0020002Service.save(cySysBlockSucu04weight0020002);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0020002 cySysBlockSucu04weight0020002){
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu04weight0020002.setCySysBlockSucu04weight0020002ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu04weight0020002Service.update(cySysBlockSucu04weight0020002);
	
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
		
		cySysBlockSucu04weight0020002Service.deleteByIds(newids);
	
	}

	
}
