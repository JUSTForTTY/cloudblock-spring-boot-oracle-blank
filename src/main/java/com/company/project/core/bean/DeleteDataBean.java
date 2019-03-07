package com.company.project.core.bean;

import java.io.Serializable;
import java.util.List;


public class DeleteDataBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555326351585450464L;

	
	public String tableName;
	
	public String deleteFlag;
	
	public List<JsonBean> primaryMap;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<JsonBean> getPrimaryMap() {
		return primaryMap;
	}

	public void setPrimaryMap(List<JsonBean> primaryMap) {
		this.primaryMap = primaryMap;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	

	 
	
}
