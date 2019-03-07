package com.company.project.core.cyflow.engine.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WorkflowEnum {

	/*
	 * 开发者每次调用接口时，可能获得正确或错误的返回码，实施者可以根据返回码信息调试接口，排查错误。 全局返回码说明如下：
	 */

	WorkFlowIsNotExists("1001", "该工作流不存在"),

	CloneWorkFlowFail("1002", "克隆工作流失败");

	private String code;

	private String describtion;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	WorkflowEnum(String code, String describtion) {
		this.code = code;// 数字
		this.describtion = describtion;// 描述
	}

	public boolean equals(String code) {
		if (this.code.equals(code)) {
			return true;
		}
		return false;
	}

	public static List<WorkflowEnum> toList() {
		List<WorkflowEnum> result = new ArrayList<WorkflowEnum>();
		for (WorkflowEnum institution : values()) {
			result.add(institution);
		}
		return result;
	}

	public static Map<String, String> toMap() {
		Map<String, String> enumDataMap = new HashMap<String, String>();
		for (WorkflowEnum e : WorkflowEnum.values()) {
			enumDataMap.put(String.valueOf(e.getCode()), e.getDescribtion());
		}
		return enumDataMap;
	}
}
