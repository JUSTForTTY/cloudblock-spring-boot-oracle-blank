package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CySysBlockSucu08searchweiget0030003Service;
import com.company.project.biz.CySysBlockSucu08searchweiget0030003Biz;
import com.company.project.model.CySysBlockSucu08searchweiget0030003;
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
public class CySysBlockSucu08searchweiget0030003BizImpl  implements CySysBlockSucu08searchweiget0030003Biz {
    @Resource
    private CySysBlockSucu08searchweiget0030003Service cySysBlockSucu08searchweiget0030003Service;
	@Resource
    private CommonService commonService;
    
	public CySysBlockSucu08searchweiget0030003 getDataSettings(String id){
	
		CySysBlockSucu08searchweiget0030003 cySysBlockSucu08searchweiget0030003 = new CySysBlockSucu08searchweiget0030003();
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003Id(id);
   		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003IsDelete("0");
		 
		return cySysBlockSucu08searchweiget0030003Service.selectOne(cySysBlockSucu08searchweiget0030003);
		
	
	}
	public List<CySysBlockSucu08searchweiget0030003> getDataSettingsByCondition(CySysBlockSucu08searchweiget0030003 cySysBlockSucu08searchweiget0030003){
	
		 
   		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003IsDelete("0");
		return cySysBlockSucu08searchweiget0030003Service.select(cySysBlockSucu08searchweiget0030003);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CySysBlockSucu08searchweiget0030003> list = cySysBlockSucu08searchweiget0030003Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu08searchweiget0030003 cySysBlockSucu08searchweiget0030003){
	
		PageHelper.startPage(page, size);
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003IsDelete("0");
        List<CySysBlockSucu08searchweiget0030003> list = cySysBlockSucu08searchweiget0030003Service.select(cySysBlockSucu08searchweiget0030003);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0030003 cySysBlockSucu08searchweiget0030003){
		
		//获取sequence
		String sequence=commonService.getSequence("CySysBlockSucu08searchweiget0030003");
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003Id(sequence);
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003CreateTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003CreateUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003IsDelete("0");
		cySysBlockSucu08searchweiget0030003Service.save(cySysBlockSucu08searchweiget0030003);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0030003 cySysBlockSucu08searchweiget0030003){
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003ModifyTime(DateUtils.newTimestamp());
		cySysBlockSucu08searchweiget0030003.setCySysBlockSucu08searchweiget0030003ModifyUser(baseUserView.getCsysUserId());
		cySysBlockSucu08searchweiget0030003Service.update(cySysBlockSucu08searchweiget0030003);
	
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
		
		cySysBlockSucu08searchweiget0030003Service.deleteByIds(newids);
	
	}

	
}
