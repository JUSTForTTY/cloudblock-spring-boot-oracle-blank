package com.company.project.core.cyflow.engine.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WorkflowRunEnum {

    /*
     * 开发者每次调用接口时，可能获得正确或错误的返回码，实施者可以根据返回码信息调试接口，排查错误。 全局返回码说明如下：
     */

    RunIsExists("8001", "该实例已存在"),

    RunIsNotExists("8002", "该实例不存在"),

    RunOnInitIsNotAuth("8003", "当前用户无实例化权限"),

    RunStatusIsChange("8004", "该实例节点状态已改变"),

    RunStatusIsExecuting("0", "执行中"),

    RunWorkflowStatusIsEnd("8006", "该实例工作流状态已完结"),

    RunPotStatusIsEnd("8007", "该实例节点状态已完结"),

    RunWorkflowStatusIsFreeze("8008", "该工作流节点状态已冻结"),

    RunPotStatusIsFreeze("8009", "该实例节点状态已冻结"),

    RunWorkflowStatusIsClose("8010", "该实例工作流状态已过期"),

    RunPotStatusIsClose("8011", "该实例节点状态已过期"),

    PotTrsOverTime("3002", "流转已超时"),

    PotTrsIsNotEnough("3003", "流转时间不足");

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

    WorkflowRunEnum(String code, String describtion) {
        this.code = code;// 数字
        this.describtion = describtion;// 描述
    }

    public boolean equals(String code) {
        if (this.code.equals(code)) {
            return true;
        }
        return false;
    }

    public static List<WorkflowRunEnum> toList() {
        List<WorkflowRunEnum> result = new ArrayList<WorkflowRunEnum>();
        for (WorkflowRunEnum institution : values()) {
            result.add(institution);
        }
        return result;
    }

    public static Map<String, String> toMap() {
        Map<String, String> enumDataMap = new HashMap<String, String>();
        for (WorkflowRunEnum e : WorkflowRunEnum.values()) {
            enumDataMap.put(String.valueOf(e.getCode()), e.getDescribtion());
        }
        return enumDataMap;
    }
}
