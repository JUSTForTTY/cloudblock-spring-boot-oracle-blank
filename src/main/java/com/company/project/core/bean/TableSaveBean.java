package com.company.project.core.bean;

import java.util.List;
import java.util.Map;

public class TableSaveBean {

	private String tableName;

	private List<JsonColumnBean> primaryKey;

	private List<JsonColumnBean> data;

	private List<JsonColumnBean> systemData;

	private List<JsonColumnBean> deleteFlag;
	
	private Map<String, List<JsonBean>> engineMap;// 引擎

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<JsonColumnBean> getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(List<JsonColumnBean> primaryKey) {
		this.primaryKey = primaryKey;
	}

	public List<JsonColumnBean> getData() {
		return data;
	}

	public void setData(List<JsonColumnBean> data) {
		this.data = data;
	}

	 

	public List<JsonColumnBean> getSystemData() {
		return systemData;
	}

	public void setSystemData(List<JsonColumnBean> systemData) {
		this.systemData = systemData;
	}

	public List<JsonColumnBean> getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(List<JsonColumnBean> deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Map<String, List<JsonBean>> getEngineMap() {
		return engineMap;
	}

	public void setEngineMap(Map<String, List<JsonBean>> engineMap) {
		this.engineMap = engineMap;
	}
	
}
