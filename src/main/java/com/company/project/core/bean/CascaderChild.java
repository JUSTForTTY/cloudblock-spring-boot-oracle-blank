package com.company.project.core.bean;

import java.util.List;

public class CascaderChild {

	
	private String mode; // 联级模式

	private List<CascaderChildField> parentId; // 父级字段
	

	private List<CascaderChildField> childField; // 子类关联字段

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	 

	public List<CascaderChildField> getParentId() {
		return parentId;
	}

	public void setParentId(List<CascaderChildField> parentId) {
		this.parentId = parentId;
	}

	 

	public List<CascaderChildField> getChildField() {
		return childField;
	}

	public void setChildField(List<CascaderChildField> childField) {
		this.childField = childField;
	}
	
	
}
