package com.company.project.core.bean;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public class ResultBean {


	private PageInfo data;
	
	private  String StringData;
	
	private  List<Map<String, Object>> extraData;
	
	private  List<Map<String, Object>> logData;

	 

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

	public List<Map<String, Object>> getLogData() {
		return logData;
	}

	public void setLogData(List<Map<String, Object>> logData) {
		this.logData = logData;
	}

	 
	
}
