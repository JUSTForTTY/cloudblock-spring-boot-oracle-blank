package com.company.project.core.bean;

import java.util.List;

public class JsonBean {

	
	private String name;
	
	
	private String value;
	
	
	private List<JsonBean> compositeValue;


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


	public List<JsonBean> getCompositeValue() {
		return compositeValue;
	}


	public void setCompositeValue(List<JsonBean> compositeValue) {
		this.compositeValue = compositeValue;
	}


	 
	
}
