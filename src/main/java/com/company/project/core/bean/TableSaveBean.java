package com.company.project.core.bean;

import java.util.List;

public class TableSaveBean {

	private String tableName;

	private List<JsonColumnBean> primaryKey;

	private List<JsonColumnBean> data;

	private List<JsonColumnBean> systemData;

	private List<JsonColumnBean> deleteFlag;

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
	
}
