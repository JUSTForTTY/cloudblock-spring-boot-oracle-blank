package com.company.project.core.bean;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class DataBaseBean {

	/**
	 * 数据库名称
	 */
	private String databaseName;
	/**
	 * 元素名称
	 */
	private String elementName;

	/**
	 * 表格名称
	 */
	private String tableName;

	private String[] tableNameArray;

	/**
	 * type: table 、函数、存储过程、定时器
	 */
	private String type;

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return "DataBaseBean [databaseName=" + databaseName + ", elementName=" + elementName + ", type=" + type + "]";
	}

	public String[] getTableNameArray() {
		return tableNameArray;
	}

	public void setTableNameArray(String[] tableNameArray) {
		this.tableNameArray = tableNameArray;
	}

}
