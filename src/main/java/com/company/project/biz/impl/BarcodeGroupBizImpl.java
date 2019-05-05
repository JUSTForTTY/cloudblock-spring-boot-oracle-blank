package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.BarcodeGroupService;
import com.company.project.biz.BarcodeGroupBiz;
import com.company.project.model.BarcodeGroup;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/05/05.
 */
@Component
@Transactional
public class BarcodeGroupBizImpl  implements BarcodeGroupBiz {
    @Resource
    private BarcodeGroupService barcodeGroupService;
	@Resource
    private CommonService commonService;
    
	public BarcodeGroup getDataSettings(String id){
	
		BarcodeGroup barcodeGroup = new BarcodeGroup();
		barcodeGroup.setBarcodeGroupId(id);
   		barcodeGroup.setBarcodeGroupIsDelete("0");
		 
		return barcodeGroupService.selectOne(barcodeGroup);
		
	
	}
	public List<BarcodeGroup> getDataSettingsByCondition(BarcodeGroup barcodeGroup){
	
		 
   		barcodeGroup.setBarcodeGroupIsDelete("0");
		return barcodeGroupService.select(barcodeGroup);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<BarcodeGroup> list = barcodeGroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,BarcodeGroup barcodeGroup){
	
		PageHelper.startPage(page, size);
		barcodeGroup.setBarcodeGroupIsDelete("0");
        List<BarcodeGroup> list = barcodeGroupService.select(barcodeGroup);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,BarcodeGroup barcodeGroup){
		
		//获取sequence
		String sequence=commonService.getSequence("BarcodeGroup");
		barcodeGroup.setBarcodeGroupId(sequence);
		barcodeGroup.setBarcodeGroupCreateTime(DateUtils.newTimestamp());
		barcodeGroup.setBarcodeGroupCreateUser(csysUserView.getCsysUserId());
		barcodeGroup.setBarcodeGroupModifyTime(DateUtils.newTimestamp());
		barcodeGroup.setBarcodeGroupModifyUser(csysUserView.getCsysUserId());
		barcodeGroup.setBarcodeGroupIsDelete("0");
		barcodeGroupService.save(barcodeGroup);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,BarcodeGroup barcodeGroup){
		barcodeGroup.setBarcodeGroupModifyTime(DateUtils.newTimestamp());
		barcodeGroup.setBarcodeGroupModifyUser(csysUserView.getCsysUserId());
		barcodeGroupService.update(barcodeGroup);
	
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
		
		barcodeGroupService.deleteByIds(newids);
	
	}

	
}
