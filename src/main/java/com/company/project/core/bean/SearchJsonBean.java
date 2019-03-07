package com.company.project.core.bean;

import java.util.List;

public class SearchJsonBean {

	
	private String name;
	
	
	private List<SearchSubJsonBean> value;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<SearchSubJsonBean> getValue() {
		return value;
	}


	public void setValue(List<SearchSubJsonBean> value) {
		this.value = value;
	}


	 
	
}
