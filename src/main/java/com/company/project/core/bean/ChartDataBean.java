package com.company.project.core.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class ChartDataBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8737783700843017950L;
 

	public List<ChartColumnBean> chartColumnList;                                                                                                                        
	
	public String[] tableGroup;
	 
	public String tableName;
	
	public Integer pageSize;
	
	public List<JsonBean> tableSort;
	
	public Map<String,List<SearchSubJsonBean>>  searchMap;
	
	public List<JsonBean> updateMap;
	
	public List<JsonBean> primaryMap;
	
	public Integer nowPage;

	public List<JsonBean>  deleteFlag;
	 

	 
 

	public List<ChartColumnBean> getChartColumnList() {
		return chartColumnList;
	}

	public void setChartColumnList(List<ChartColumnBean> chartColumnList) {
		this.chartColumnList = chartColumnList;
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

	 

	public String[] getTableGroup() {
		return tableGroup;
	}

	public void setTableGroup(String[] tableGroup) {
		this.tableGroup = tableGroup;
	}

	public Map<String, List<SearchSubJsonBean>> getSearchMap() {
		return searchMap;
	}

	public void setSearchMap(Map<String, List<SearchSubJsonBean>> searchMap) {
		this.searchMap = searchMap;
	}

	public List<JsonBean> getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(List<JsonBean> deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	 
	
	
}
