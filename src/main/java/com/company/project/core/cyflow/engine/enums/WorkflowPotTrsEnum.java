package com.company.project.core.cyflow.engine.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WorkflowPotTrsEnum {

	/*
	 * 开发者每次调用接口时，可能获得正确或错误的返回码，实施者可以根据返回码信息调试接口，排查错误。 全局返回码说明如下：
	 */

	PotTrsOverTime("3002", "该实例工作流迁移当前节点已超时"),

	PotTrsIsNotEnough("3003", "该实例工作流迁移最少时间不足");

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

	WorkflowPotTrsEnum(String code, String describtion) {
		this.code = code;// 数字
		this.describtion = describtion;// 描述
	}

	public boolean equals(String code) {
		if (this.code.equals(code)) {
			return true;
		}
		return false;
	}

	public static List<WorkflowPotTrsEnum> toList() {
		List<WorkflowPotTrsEnum> result = new ArrayList<WorkflowPotTrsEnum>();
		for (WorkflowPotTrsEnum institution : values()) {
			result.add(institution);
		}
		return result;
	}

	public static Map<String, String> toMap() {
		Map<String, String> enumDataMap = new HashMap<String, String>();
		for (WorkflowPotTrsEnum e : WorkflowPotTrsEnum.values()) {
			enumDataMap.put(String.valueOf(e.getCode()), e.getDescribtion());
		}
		return enumDataMap;
	}
}
