package com.company.project.core.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

public class TableDataBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555326351585450464L;

	private String sourceid;// 数据编号

	private List<JsonColumnBean> tableColumn;

	private String[] tableGroup;

	private String tableName;

	private Integer pageSize;

	private List<JsonBean> tableSort;

	private Map<String, List<SearchSubJsonBean>> searchMap;

	private List<JsonBean> updateMap;

	private List<JsonBean> primaryMap;

	private Integer nowPage;

	private List<JsonBean> deleteFlag;

	private Map<String, List<JsonBean>> engineMap;// 引擎

	public String getSourceid() {
		return sourceid;
	}

	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

	

	public List<JsonColumnBean> getTableColumn() {
		return tableColumn;
	}

	public void setTableColumn(List<JsonColumnBean> tableColumn) {
		this.tableColumn = tableColumn;
	}

	public String[] getTableGroup() {
		return tableGroup;
	}

	public void setTableGroup(String[] tableGroup) {
		this.tableGroup = tableGroup;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<JsonBean> getTableSort() {
		return tableSort;
	}

	public void setTableSort(List<JsonBean> tableSort) {
		this.tableSort = tableSort;
	}

	public Map<String, List<SearchSubJsonBean>> getSearchMap() {
		return searchMap;
	}

	public void setSearchMap(Map<String, List<SearchSubJsonBean>> searchMap) {
		this.searchMap = searchMap;
	}

	public List<JsonBean> getUpdateMap() {
		return updateMap;
	}

	public void setUpdateMap(List<JsonBean> updateMap) {
		this.updateMap = updateMap;
	}

	public List<JsonBean> getPrimaryMap() {
		return primaryMap;
	}

	public void setPrimaryMap(List<JsonBean> primaryMap) {
		this.primaryMap = primaryMap;
	}

	public Integer getNowPage() {
		return nowPage;
	}

	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	public List<JsonBean> getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(List<JsonBean> deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Map<String, List<JsonBean>> getEngineMap() {
		return engineMap;
	}

	public void setEngineMap(Map<String, List<JsonBean>> engineMap) {
		this.engineMap = engineMap;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
