package com.company.project.core.bean;

import java.util.List;

public class ValidationBean {
	/*
	 * 表名
	 */
	private String tableName;
	/**
	 * 模式 normal 普通 ；senior高级(动态sql)
	 */
	private String mode;
	/*
	 * 当前值
	 */
	private JsonBean currentValue;
	/*
	 * 比较值
	 */
	private List<JsonCompareBean> compareValue;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public JsonBean getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(JsonBean currentValue) {
		this.currentValue = currentValue;
	}
	public List<JsonCompareBean> getCompareValue() {
		return compareValue;
	}
	public void setCompareValue(List<JsonCompareBean> compareValue) {
		this.compareValue = compareValue;
	}
	
	
}
