package com.company.project.core.bean;

import java.sql.Blob;
import java.sql.SQLException;



public class TableFiled {

	/*
	 * 表名
	 */
	private String tableName;

	/*
	 * 字段名
	 */
	private String columnName;

	/*
	 * 字段长度
	 */
	private String dataLength;

	/*
	 * 字段类型
	 */
	private String dataType;

	/*
	 * 是否允许为空
	 */
	private String nullAble;

	/*
	 * 字段默认值
	 */
	private Blob dataDefault;

	/*
	 * 字段描述
	 */
	private String comments;

	public String getDataDefault() throws SQLException {
		if (this.dataDefault != null) {
			return new String(this.dataDefault.getBytes((long) 1, (int) this.dataDefault.length()));
		} else {
			return null;
		}
	}

	public void setDataDefault(Blob dataDefault) {
		this.dataDefault = dataDefault;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataLength() {
		return dataLength;
	}

	public void setDataLength(String dataLength) {
		this.dataLength = dataLength;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getNullAble() {
		return nullAble;
	}

	public void setNullAble(String nullAble) {
		this.nullAble = nullAble;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
