package com.company.project.core.bean;

public class ColumnBean {

	private String columnName;// 字段名
	private String size;// 大小
	private String columnType;// 字段类型
	private String isEmpty;// 是否为空
	private String windowDefault;// 是否默认值
	private String columnRemark;// 备注
	private String primaryKey;// 唯一值
	private String foreignKey;// 外键
	private String unSigned;// 无负号
	private String autoIncrement;// 自增长
	private String tableName;//

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(String autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	public String getUnSigned() {
		return unSigned;
	}

	public void setUnSigned(String unSigned) {
		this.unSigned = unSigned;
	}

	public String getForeignKey() {
		return foreignKey;
	}

	public void setForeignKey(String foreignKey) {
		this.foreignKey = foreignKey;
	}

	public String getColumnName() {
		return columnName;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(String isEmpty) {
		this.isEmpty = isEmpty;
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

}
