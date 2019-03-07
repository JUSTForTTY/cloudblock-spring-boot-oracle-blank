package com.company.project.core.bean;

import java.util.List;

public class DataTableBean {
private String tableName;//名称

private  String type;//类型

private String utf_comparsion;//字符集

private String utf_comprasion;//字符集比对

private String tableRemark;//备注

private String enGine;


private String format;
public String getFormat() {
	return format;
}

public void setFormat(String format) {
	this.format = format;
}

public String getEnGine() {
	return enGine;
}

public void setEnGine(String enGine) {
	this.enGine = enGine;
}

public List<ColumnBean> getValue() {
	return value;
}

public void setValue(List<ColumnBean> value) {
	this.value = value;
}

private List<ColumnBean> value;
public String getTableName() {
	return tableName;
}


public String getUtf_comparsion() {
	return utf_comparsion;
}

public void setUtf_comparsion(String utf_comparsion) {
	this.utf_comparsion = utf_comparsion;
}

public String getUtf_comprasion() {
	return utf_comprasion;
}

public void setUtf_comprasion(String utf_comprasion) {
	this.utf_comprasion = utf_comprasion;
}



public String getTableRemark() {
	return tableRemark;
}

public void setTableRemark(String tableRemark) {
	this.tableRemark = tableRemark;
}

public void setTableName(String tableName) {
	this.tableName = tableName;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}


}
