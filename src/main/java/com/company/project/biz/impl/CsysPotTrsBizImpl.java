package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPotTrsService;
import com.company.project.biz.CsysPotBiz;
import com.company.project.biz.CsysPotTrsBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysPotTrsMapper;
import com.company.project.model.CsysMenuAuthView;
import com.company.project.model.CsysMenuAuthViewExample;
import com.company.project.model.CsysPot;
import com.company.project.model.CsysPotTrs;
import com.company.project.model.CsysPotTrsExample;
import com.company.project.model.CsysUserView;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jcraft.jsch.Logger;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Component
@Transactional
public class CsysPotTrsBizImpl  implements CsysPotTrsBiz {
    @Resource
    private CsysPotTrsService csysPotTrsService;
	@Resource
    private CommonService commonService;
	@Resource
    private CsysPotTrsMapper csysPotTrsMapper;
	@Resource
    private CsysPotBiz csysPotBiz;
	
    
	public CsysPotTrs getDataSettings(String id){
	
		CsysPotTrs csysPotTrs = new CsysPotTrs();
		csysPotTrs.setCsysPotTrsId(id);
   		csysPotTrs.setCsysPotTrsIsDelete("0");
		 
		return csysPotTrsService.selectOne(csysPotTrs);
		
	
	}
	public List<CsysPotTrs> getDataSettingsByCondition(CsysPotTrs csysPotTrs){
	
		 
   		csysPotTrs.setCsysPotTrsIsDelete("0");
		return csysPotTrsService.select(csysPotTrs);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPotTrs> list = csysPotTrsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotTrs csysPotTrs){
	
		PageHelper.startPage(page, size);
		csysPotTrs.setCsysPotTrsIsDelete("0");
        List<CsysPotTrs> list = csysPotTrsService.select(csysPotTrs);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPotTrs");
		csysPotTrs.setCsysPotTrsId(sequence);
		csysPotTrs.setCsysPotTrsCreateTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsCreateUser(baseUserView.getCsysUserId());
		csysPotTrs.setCsysPotTrsModifyTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsModifyUser(baseUserView.getCsysUserId());
		csysPotTrs.setCsysPotTrsIsDelete("0");
		csysPotTrsService.save(csysPotTrs);
		
		//更新节点序列
		List<CsysPotTrs> headTrs=getInitDataSettingsByCondition(csysPotTrs);
		short sortNum=0;
		ArrayList potArray = new ArrayList(); 
		potArray.add(headTrs.get(0).getCsysPotTrsPointId());
		recursiveTree(headTrs.get(0),sortNum,potArray,baseUserView);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs){
		csysPotTrs.setCsysPotTrsModifyTime(DateUtils.newTimestamp());
		csysPotTrs.setCsysPotTrsModifyUser(baseUserView.getCsysUserId());
		csysPotTrsService.update(csysPotTrs);
		
		//更新节点序列
		CsysPotTrs csysPotTrsData=new CsysPotTrs();
		csysPotTrsData.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
		CsysPotTrs currentCsysPotTrs=csysPotTrsService.selectOne(csysPotTrsData);
			 
		List<CsysPotTrs> headTrs=getInitDataSettingsByCondition(currentCsysPotTrs);
		short sortNum=0;
		ArrayList potArray = new ArrayList(); 
		potArray.add(headTrs.get(0).getCsysPotTrsPointId());
		System.out.println("检测数据"+headTrs.size());
		recursiveTree(headTrs.get(0),sortNum,potArray,baseUserView);
	
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
		
		csysPotTrsService.deleteByIds(newids);
	
	}
	@Override
	public List<CsysPotTrs> getInitDataSettingsByCondition(CsysPotTrs csysPotTrs) {
		
		CsysPotTrsExample example=new CsysPotTrsExample();
		
		 
		CsysPotTrsExample.Criteria criteria =example.createCriteria();
	 
		criteria.andCsysPotCurrentIdIsNull();
		if(null!=csysPotTrs.getCsysWorkflowId()) {
			criteria.andCsysWorkflowIdEqualTo(csysPotTrs.getCsysWorkflowId());	
		}
		criteria.andCsysPotTrsIsDeleteEqualTo("0");
		 
		List<CsysPotTrs> list = csysPotTrsMapper.selectByExample(example);
		
		return list;
	}
	
	//节点序号排序
	private void recursiveTree(CsysPotTrs csysPotTrs,short sortNum,ArrayList potArray,CsysUserView baseUserView) {

				
				//更新序号
				CsysPot csysPot=new CsysPot();
				csysPot.setCsysPotId(csysPotTrs.getCsysPotTrsPointId());
				csysPot.setCsysPotSort(sortNum);
				csysPotBiz.updateDataSettings(baseUserView, csysPot);
				 
				//查询下一节点，并生成节点序号
				CsysPotTrs nextCsysPotTrs=new CsysPotTrs();
				nextCsysPotTrs.setCsysPotCurrentId(csysPotTrs.getCsysPotTrsPointId());
				nextCsysPotTrs.setCsysWorkflowId(csysPotTrs.getCsysWorkflowId());
				
				List<CsysPotTrs> nextPotTrsList= getDataSettingsByCondition(nextCsysPotTrs);
				sortNum++;
				for(CsysPotTrs cpt:nextPotTrsList) {
					
					//如果已经排序过得节点，不继续操作
					if(!potArray.contains(cpt.getCsysPotTrsPointId())) {
					 
					//如果是维修节点，不进行排序
					
					CsysPot	 targetPot= csysPotBiz.getDataSettings(cpt.getCsysPotTrsPointId());
					if(!"LHCsysPotStyle20190620042709661000002".equals(targetPot.getCsysPotStyleId())) {
						potArray.add(cpt.getCsysPotTrsPointId());
						 
						//更新序号
						nextCsysPotTrs.setCsysPotTrsPointId(cpt.getCsysPotTrsPointId());
						recursiveTree(nextCsysPotTrs,sortNum,potArray,baseUserView);
					}
					
			   }
				
			}
				 
		}

	
}
