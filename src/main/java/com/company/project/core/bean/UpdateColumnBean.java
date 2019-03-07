package com.company.project.core.bean;

public class UpdateColumnBean {

	private String type;
	private String size;
	private String empty;
	private String windowDefault;//是否默认值
	
	private String columnRemark;//备注
	private String primaryKey;//唯一值
	private String foreignKey;//外键
	private String unSigned;//无负号
	private String autoIncrement;//自增长
	private String fieldName;
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getEmpty() {
		return empty;
	}
	public void setEmpty(String empty) {
		this.empty = empty;
	}
	public String getWindowDefault() {
		return windowDefault;
	}
	public void setWindowDefault(String windowDefault) {
		this.windowDefault = windowDefault;
	}
	public String getColumnRemark() {
		return columnRemark;
	}
	public void setColumnRemark(String columnRemark) {
		this.columnRemark = columnRemark;
	}
	public String getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getForeignKey() {
		return foreignKey;
	}
	public void setForeignKey(String foreignKey) {
		this.foreignKey = foreignKey;
	}
	public String getUnSigned() {
		return unSigned;
	}
	public void setUnSigned(String unSigned) {
		this.unSigned = unSigned;
	}
	public String getAutoIncrement() {
		return autoIncrement;
	}
	public void setAutoIncrement(String autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
}
