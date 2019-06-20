package com.company.project.core.result;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 统一API响应结果封装
 */
public class Result {
    private int code;
    private String message;
    private Map<String,String> param;
    private Object data;
    private Object extraData;
    private Map<String, List<Map<String, Object>>> logData; 

    public Result(){
    }

    public Result(ResultCode resultCode,Map<String,String> param) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        this.param=param;
    }

    public Result(ResultCode resultCode,Object data,Map<String,String> param) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        this.data=data;
        this.param=param;
    }
    public Result(ResultCode resultCode,Map<String,String> param,Map<String, List<Map<String, Object>>> logData) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        this.param=param;
        this.logData=logData;
    }
    public Result(ResultCode resultCode,Object data,Object extraData,Map<String,String> param) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        this.data=data;
        this.extraData=extraData;
        this.param=param;
    }
    public Result(ResultCode resultCode,Object data,Object extraData,Map<String,String> param,Map<String, List<Map<String, Object>>> logData) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        this.data=data;
        this.extraData=extraData;
        this.logData=logData;
        this.param=param;
    }


    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message=resultCode.getMessage();
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Map<String,String> getParam() {
		return param;
	}

	public Result setParam(Map<String,String> param) {
		this.param = param;
		return this;
	}

	public Object getExtraData() {
		return extraData;
	}

	public Result setExtraData(Object extraData) {
		this.extraData = extraData;
		return this;
	}
	

	public Map<String, List<Map<String, Object>>> getLogData() {
		return logData;
	}

	public Result setLogData(Map<String, List<Map<String, Object>>> logData) {
		this.logData = logData;
		return this;
	}

	@Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
