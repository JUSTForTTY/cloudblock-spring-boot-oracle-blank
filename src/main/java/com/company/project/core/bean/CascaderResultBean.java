package com.company.project.core.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

public class CascaderResultBean {

	
	private String value;
	
	private String label;
	
	
   	private List children = new ArrayList();


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public List getChildren() {
		return children;
	}


	public void setChildren(List children) {
		this.children = children;
	}
   	
   	
   	
}
