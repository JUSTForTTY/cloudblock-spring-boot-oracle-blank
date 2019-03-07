package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysOrgPotService;
import com.company.project.biz.CsysOrgPotBiz;
import com.company.project.outer.model.CsysOrgPot;
import com.company.project.outer.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysOrgPotBizImpl  implements CsysOrgPotBiz {
    @Resource
    private CsysOrgPotService csysOrgPotService;
	@Resource
    private CommonService commonService;
    
	public CsysOrgPot getDataSettings(String id){
	
		CsysOrgPot csysOrgPot = new CsysOrgPot();
		csysOrgPot.setCsysOrgPotId(id);
   		csysOrgPot.setCsysOrgPotIsDelete("0");
		 
		return csysOrgPotService.selectOne(csysOrgPot);
		
	
	}
	public List<CsysOrgPot> getDataSettingsByCondition(CsysOrgPot csysOrgPot){
	
		 
   		csysOrgPot.setCsysOrgPotIsDelete("0");
		return csysOrgPotService.select(csysOrgPot);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysOrgPot> list = csysOrgPotService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgPot csysOrgPot){
	
		PageHelper.startPage(page, size);
		csysOrgPot.setCsysOrgPotIsDelete("0");
        List<CsysOrgPot> list = csysOrgPotService.select(csysOrgPot);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgPot csysOrgPot){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysOrgPot");
		csysOrgPot.setCsysOrgPotId(sequence);
		csysOrgPot.setCsysOrgPotCreateTime(DateUtils.newTimestamp());
		csysOrgPot.setCsysOrgPotCreateUser(baseUserView.getCsysUserId());
		csysOrgPot.setCsysOrgPotModifyTime(DateUtils.newTimestamp());
		csysOrgPot.setCsysOrgPotModifyUser(baseUserView.getCsysUserId());
		csysOrgPot.setCsysOrgPotIsDelete("0");
		csysOrgPotService.save(csysOrgPot);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgPot csysOrgPot){
		csysOrgPot.setCsysOrgPotModifyTime(DateUtils.newTimestamp());
		csysOrgPot.setCsysOrgPotModifyUser(baseUserView.getCsysUserId());
		csysOrgPotService.update(csysOrgPot);
	
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
		
		csysOrgPotService.deleteByIds(newids);
	
	}
	
	public List<CsysOrgPot> getDataSettingsTree(CsysOrgPot csysOrgPot) {

		List<CsysOrgPot> csysOrgPotList = new ArrayList<>();
		csysOrgPot.setCsysOrgPotParentId("-1");
		csysOrgPot.setCsysOrgPotIsDelete("0");

		List<CsysOrgPot> lst = csysOrgPotService
				.select(csysOrgPot);

		// 处理组织架构信息
		int count = 0;
		for (CsysOrgPot point : lst) {

			CsysOrgPot child = recursiveTree(point, count);
			csysOrgPotList.add(child);
			count++;
		}
		return csysOrgPotList;

	}
	
	private CsysOrgPot recursiveTree(CsysOrgPot os, int count) {
		 

		os.setExpanded(true);
		os.setTitle(os.getCsysOrgPotName());
		os.setKey(os.getCsysOrgPotId());

		CsysOrgPot csysOrgPot = new CsysOrgPot();
		csysOrgPot.setCsysOrgPotParentId((os.getCsysOrgPotId()));
		csysOrgPot.setCsysOrgPotIsDelete("0");
		List<CsysOrgPot> childTreeNodes = csysOrgPotService
				.select(csysOrgPot);

		if (childTreeNodes.size() > 0) {
			for (CsysOrgPot child : childTreeNodes) {
				CsysOrgPot n = recursiveTree(child, -1); // 递归
				os.getChildren().add(n);
			}
		}else {
			os.setIsLeaf("true");
		}
		
		
		// 遍历子节点

		return os;
	}

	
}
