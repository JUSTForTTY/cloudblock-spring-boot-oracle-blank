package com.company.project.core.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class DynamicJsonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555326351585450464L;

	
	public String dynamicSql;
	
	
	public List<JsonBean> paramMap;

	public Integer pageSize;
	
	public List<JsonBean> tableSort;
	
	public Map<String,List<SearchSubJsonBean>>  searchMap;
	
	public Integer nowPage;
	

	public String getDynamicSql() {
		return dynamicSql;
	}


	public void setDynamicSql(String dynamicSql) {
		this.dynamicSql = dynamicSql;
	}


	public List<JsonBean> getParamMap() {
		return paramMap;
	}


	public void setParamMap(List<JsonBean> paramMap) {
		this.paramMap = paramMap;
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


	public Integer getNowPage() {
		return nowPage;
	}


	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	 
	
	

	 
	
}
