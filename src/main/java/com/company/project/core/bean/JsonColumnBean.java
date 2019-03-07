package com.company.project.core.bean;

public class JsonColumnBean {

	private String name;// 字段名称

	private String value;// 字段值

	private String type;// 字段类型

	/**
	 * 规则，当字段为主键时，规则有autoincrement（自增长）、commonsequence（通用sequence）
	 * 、customsequence（自定义sequence）;当字段为普通字段时，规则有encrypt（加密）
	 */
	private String rule;

	private String procudure;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getProcudure() {
		return procudure;
	}

	public void setProcudure(String procudure) {
		this.procudure = procudure;
	}

}
