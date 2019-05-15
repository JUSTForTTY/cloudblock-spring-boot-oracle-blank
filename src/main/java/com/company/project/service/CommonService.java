package com.company.project.service;

import java.util.List;
import java.util.Map;

import com.company.project.model.CsysUserView;

public interface CommonService {

	/**
	 * 获取sequence
	 * 
	 * @param tableName
	 * @return
	 */
	public String getSequence(String tableName);

	/**
	 * 获取outer sequence
	 * 
	 * @param tableName
	 * @return
	 */
	// public String getOuterSequence(String tableName);

	/**
	 * 获取outer sequence
	 * 
	 * @param tableName
	 * @return
	 */
	String getSequenceNumber(String tableName);

	/**
	 * 获取oracle sequence
	 * 
	 * @param tableName
	 * @return
	 */
	public String getOracleSequence(String tableName);

	public List<Map<String, Object>> cloneWorkFlow(String tableName, CsysUserView baseUserView);

	/**
	 * 获取oracle simple sequence
	 *
	 * @param tableName
	 * @return
	 */
	String getOracleSimpleSequence(String tableName);
}
