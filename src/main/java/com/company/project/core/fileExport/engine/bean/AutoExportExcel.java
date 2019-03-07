package com.company.project.core.fileExport.engine.bean;

import com.company.project.core.bean.TableDataBean;

public class AutoExportExcel {

	/*
	 * 数据信息
	 */
	private TableDataBean tableDataBean;

	/*
	 * 导出excel文件名称
	 */
	private String exportExcelName;

	/*
	 * 导出excel中sheet页面名称
	 */
	private String[] sheetNameArray;

	/*
	 * 导出excel头部信息
	 */
	private String[] headerNameArray;

	/*
	 * 导出excel字段名称
	 */
	private String[] columnNameArray;

	public TableDataBean getTableDataBean() {
		return tableDataBean;
	}

	public void setTableDataBean(TableDataBean tableDataBean) {
		this.tableDataBean = tableDataBean;
	}

	public String getExportExcelName() {
		return exportExcelName;
	}

	public void setExportExcelName(String exportExcelName) {
		this.exportExcelName = exportExcelName;
	}

	public String[] getSheetNameArray() {
		return sheetNameArray;
	}

	public void setSheetNameArray(String[] sheetNameArray) {
		this.sheetNameArray = sheetNameArray;
	}

	public String[] getHeaderNameArray() {
		return headerNameArray;
	}

	public void setHeaderNameArray(String[] headerNameArray) {
		this.headerNameArray = headerNameArray;
	}

	public String[] getColumnNameArray() {
		return columnNameArray;
	}

	public void setColumnNameArray(String[] columnNameArray) {
		this.columnNameArray = columnNameArray;
	}

}
