package com.company.project.core.bean;

import java.util.List;

import javax.persistence.Id;

public class DynamicSql {

	/*
	 * 表名
	 */
	@Id
	private String tableName;

	/*
	 * 字段名
	 */
	private String cloumn;

	/*
	 * 字段值
	 */
	private List valueList;

	/*
	 * 主键名
	 */
	private String primaryName;
	/*
	 * where条件
	 */
	private String whereCondition;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getCloumn() {
		return cloumn;
	}

	public void setCloumn(String cloumn) {
		this.cloumn = cloumn;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}

	public String getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}
	
	public String getWhereCondition() {
		return whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

	@Override
	public String toString() {
		return "DynamicSql [tableName=" + tableName + ", cloumn=" + cloumn + ", valueList=" + valueList
				+ ", primaryName=" + primaryName + ",whereCondition="+whereCondition+"]";
	}

}
