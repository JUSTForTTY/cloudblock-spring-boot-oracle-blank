package com.company.project.core.bean;

import java.util.ArrayList;
import java.util.List;


public class CascaderBean {

	private String tableName; // 表名

	private String label; // label字段

	private String value; // value字段
	
	private String dynamicCondition;//动态条件

	private String columnName[];
	
	private CascaderChild next; //子集数据

	private CascaderBean child;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	 

	public CascaderChild getNext() {
		return next;
	}

	public void setNext(CascaderChild next) {
		this.next = next;
	}

	public CascaderBean getChild() {
		return child;
	}

	public void setChild(CascaderBean child) {
		this.child = child;
	}

	public String[] getColumnName() {
		return columnName;
	}

	public void setColumnName(String[] columnName) {
		this.columnName = columnName;
	}

	public String getDynamicCondition() {
		return dynamicCondition;
	}

	public void setDynamicCondition(String dynamicCondition) {
		this.dynamicCondition = dynamicCondition;
	}

	 

	
}
