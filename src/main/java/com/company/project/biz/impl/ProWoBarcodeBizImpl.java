package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.ProWoBarcodeService;
import com.company.project.biz.ProWoBarcodeBiz;
import com.company.project.model.ProWoBarcode;
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
public class ProWoBarcodeBizImpl  implements ProWoBarcodeBiz {
    @Resource
    private ProWoBarcodeService proWoBarcodeService;
	@Resource
    private CommonService commonService;
    
	public ProWoBarcode getDataSettings(String id){
	
		ProWoBarcode proWoBarcode = new ProWoBarcode();
		proWoBarcode.setProWoBarcodeId(id);
   		proWoBarcode.setProWoBarcodeIsDelete("0");
		 
		return proWoBarcodeService.selectOne(proWoBarcode);
		
	
	}
	public List<ProWoBarcode> getDataSettingsByCondition(ProWoBarcode proWoBarcode){
	
		 
   		proWoBarcode.setProWoBarcodeIsDelete("0");
		return proWoBarcodeService.select(proWoBarcode);
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<ProWoBarcode> list = proWoBarcodeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,ProWoBarcode proWoBarcode){
	
		PageHelper.startPage(page, size);
		proWoBarcode.setProWoBarcodeIsDelete("0");
        List<ProWoBarcode> list = proWoBarcodeService.select(proWoBarcode);
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView csysUserView,ProWoBarcode proWoBarcode){
		
		//获取sequence
		String sequence=commonService.getSequence("ProWoBarcode");
		proWoBarcode.setProWoBarcodeId(sequence);
		proWoBarcode.setProWoBarcodeCreateTime(DateUtils.newTimestamp());
		proWoBarcode.setProWoBarcodeCreateUser(csysUserView.getCsysUserId());
		proWoBarcode.setProWoBarcodeModifyTime(DateUtils.newTimestamp());
		proWoBarcode.setProWoBarcodeModifyUser(csysUserView.getCsysUserId());
		proWoBarcode.setProWoBarcodeIsDelete("0");
		proWoBarcodeService.save(proWoBarcode);
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView csysUserView,ProWoBarcode proWoBarcode){
		proWoBarcode.setProWoBarcodeModifyTime(DateUtils.newTimestamp());
		proWoBarcode.setProWoBarcodeModifyUser(csysUserView.getCsysUserId());
		proWoBarcodeService.update(proWoBarcode);
	
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
		
		proWoBarcodeService.deleteByIds(newids);
	
	}

	
}
