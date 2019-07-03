package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotGroupService;
import com.company.project.biz.CsysPotGroupBiz;
import com.company.project.model.CsysPotGroup;
import com.company.project.model.CsysPotGroupExample;
import com.company.project.model.CsysPotPublic;
import com.company.project.model.CsysPotPublicExample;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysPotGroupMapper;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Component
@Transactional
public class CsysPotGroupBizImpl  implements CsysPotGroupBiz {
    @Resource
    private CsysPotGroupService csysPotGroupService;
	@Resource
    private CommonService commonService;
	@Resource
    private CsysPotGroupMapper csysPotGroupMapper;
    
	public CsysPotGroup getDataSettings(String id){
	
		CsysPotGroup csysPotGroup = new CsysPotGroup();
		csysPotGroup.setCsysPotGroupId(id);
   		csysPotGroup.setCsysPotGroupIsDelete("0");
		 
		return csysPotGroupService.selectOne(csysPotGroup);
		
	
	}
	public List<CsysPotGroup> getDataSettingsByCondition(CsysPotGroup csysPotGroup){
	
		 
   		csysPotGroup.setCsysPotGroupIsDelete("0");
		return csysPotGroupService.select(csysPotGroup);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotGroup> list = csysPotGroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGroup csysPotGroup){
	
		PageHelper.startPage(page, size);
		csysPotGroup.setCsysPotGroupIsDelete("0");
        List<CsysPotGroup> list = csysPotGroupService.select(csysPotGroup);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGroup csysPotGroup){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotGroup");
		csysPotGroup.setCsysPotGroupId(sequence);
		csysPotGroup.setCsysPotGroupCreateTime(DateUtils.newTimestamp());
		csysPotGroup.setCsysPotGroupCreateUser(csysUserView.getCsysUserId());
		csysPotGroup.setCsysPotGroupModifyTime(DateUtils.newTimestamp());
		csysPotGroup.setCsysPotGroupModifyUser(csysUserView.getCsysUserId());
		csysPotGroup.setCsysPotGroupIsDelete("0");
		csysPotGroupService.save(csysPotGroup);
		
		return csysPotGroup.getCsysPotGroupId();
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGroup csysPotGroup){
		csysPotGroup.setCsysPotGroupModifyTime(DateUtils.newTimestamp());
		csysPotGroup.setCsysPotGroupModifyUser(csysUserView.getCsysUserId());
		csysPotGroupService.update(csysPotGroup);
	
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
		
		csysPotGroupService.deleteByIds(newids);
	
	}
	@Override
	public PageInfo getSearchPageDataSettingsByCondition(Integer page, Integer size, CsysUserView csysUserView,
			CsysPotGroup csysPotGroup) {
		
		PageHelper.startPage(page, size);
		 
		CsysPotGroupExample example=new CsysPotGroupExample();
		
		example.setOrderByClause("CSYS_POT_GROUP_MODIFY_TIME DESC");
		
		CsysPotGroupExample.Criteria criteria =example.createCriteria();
		if(null!=csysPotGroup.getCsysPotGroupName()) {
			criteria.andCsysPotGroupNameLike("%"+csysPotGroup.getCsysPotGroupName()+"%");
		}
		if(null!=csysPotGroup.getCsysPotGroupDesc()) {
			criteria.andCsysPotGroupDescLike("%"+csysPotGroup.getCsysPotGroupDesc()+"%");
		}
		criteria.andCsysPotGroupIsDeleteEqualTo("0");
		 
		List<CsysPotGroup> list = csysPotGroupMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
		 
	}

	
}
