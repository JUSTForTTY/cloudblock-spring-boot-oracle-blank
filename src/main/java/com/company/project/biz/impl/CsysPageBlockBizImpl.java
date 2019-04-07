package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysPageBlockService;
import com.company.project.biz.CsysPageBlockBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysPageBlock;
import com.company.project.model.CsysUserView;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Component
@Transactional
public class CsysPageBlockBizImpl  implements CsysPageBlockBiz {
    @Resource
    private CsysPageBlockService csysPageBlockService;
	@Resource
    private CommonService commonService;
    
	public CsysPageBlock getDataSettings(String id){
	
		CsysPageBlock csysPageBlock = new CsysPageBlock();
		csysPageBlock.setCsysPageBlockId(id);
   		csysPageBlock.setCsysPageBlockIsDelete("0");
		 
		return csysPageBlockService.selectOne(csysPageBlock);
		
	
	}
	public List<CsysPageBlock> getDataSettingsByCondition(CsysPageBlock csysPageBlock){
	
		 
   		csysPageBlock.setCsysPageBlockIsDelete("0");
		return csysPageBlockService.select(csysPageBlock);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<CsysPageBlock> list = csysPageBlockService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPageBlock csysPageBlock){
	
		PageHelper.startPage(page, size);
		csysPageBlock.setCsysPageBlockIsDelete("0");
        List<CsysPageBlock> list = csysPageBlockService.select(csysPageBlock);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,CsysPageBlock csysPageBlock){
		
		//获取sequence
		String sequence=commonService.getSequence("CsysPageBlock");
		csysPageBlock.setCsysPageBlockId(sequence);
		csysPageBlock.setCsysPageBlockCreateTime(DateUtils.newTimestamp());
		csysPageBlock.setCsysPageBlockCreateUser(baseUserView.getCsysUserId());
		csysPageBlock.setCsysPageBlockModifyTime(DateUtils.newTimestamp());
		csysPageBlock.setCsysPageBlockModifyUser(baseUserView.getCsysUserId());
		csysPageBlock.setCsysPageBlockIsDelete("0");
		csysPageBlockService.save(csysPageBlock);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,CsysPageBlock csysPageBlock){
		csysPageBlock.setCsysPageBlockModifyTime(DateUtils.newTimestamp());
		csysPageBlock.setCsysPageBlockModifyUser(baseUserView.getCsysUserId());
		csysPageBlockService.update(csysPageBlock);
	
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
		
		csysPageBlockService.deleteByIds(newids);
	
	}

	
}
