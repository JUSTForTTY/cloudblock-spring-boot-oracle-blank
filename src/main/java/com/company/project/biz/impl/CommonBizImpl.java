package com.company.project.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.biz.CommonBiz;
import com.company.project.service.CommonService;
import com.company.project.service.CsysUserViewService;
import com.google.common.base.CaseFormat;

@Component
@Transactional
public class CommonBizImpl implements CommonBiz {

	 @Resource
	 private CommonService commonService;
	 

	@Override
	public String getOracleSequence(String tableName) {
		
		//转换表名格式
		tableName=tableNameConvertUpperCamel(tableName);
		
		return commonService.getOracleSequence(tableName);
	}
	
	private String tableNameConvertUpperCamel(String tableName) {
		  
		  return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());
	}

	@Override
	public String getOracleSimpleSequence(String tableName) {

		//转换表名格式
		tableName=tableNameConvertUpperCamel(tableName);

		return commonService.getOracleSimpleSequence(tableName);
	}
}
