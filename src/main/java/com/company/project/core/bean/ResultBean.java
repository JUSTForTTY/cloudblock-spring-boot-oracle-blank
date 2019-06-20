package com.company.project.core.bean;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

public class ResultBean {

	
	private  PageInfo data;
	
	private  String StringData;
	
	private  List<Map<String, Object>> extraData;
	
	private  Map<String, List<Map<String, Object>>> logMap;
 
	

	public PageInfo getData() {
		return data;
	}

	public void setData(PageInfo data) {
		this.data = data;
	}

	public List<Map<String, Object>> getExtraData() {
		return extraData;
	}

	public void setExtraData(List<Map<String, Object>> extraData) {
		this.extraData = extraData;
	}

	public String getStringData() {
		return StringData;
	}

	public void setStringData(String stringData) {
		StringData = stringData;
	}

	public Map<String, List<Map<String, Object>>> getLogMap() {
		return logMap;
	}

	public void setLogMap(Map<String, List<Map<String, Object>>> logMap) {
		this.logMap = logMap;
	}

	
	 
	
}
