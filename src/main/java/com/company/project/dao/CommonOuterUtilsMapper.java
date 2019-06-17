package com.company.project.dao;

import java.util.Map;

import com.company.project.model.CommonBean;

public interface CommonOuterUtilsMapper {

	String selectBySequence(CommonBean commonBean);

	void   updateOracleSequence(Map<String, Object> params);
	
	String getOracleSequence(Map<String, Object> params);

	void cloneWorkFlow(Map<String, Object> map);
	
	void CESHI(Map<String, Object> map);
}
