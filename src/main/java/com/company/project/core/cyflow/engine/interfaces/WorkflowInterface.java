package com.company.project.core.cyflow.engine.interfaces;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.company.project.model.*;

public interface WorkflowInterface {

    /*
     * 验证工作流是否合法
     */
    Boolean workFlowIsLegal(String cySysWorkflowId);

    /*
     * 初始化工作流实例
     */
    JSONObject onInitRun(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) throws Exception;

    CsysPot getWorkFlowHeadPot(String cySysWorkflowId);

    /*
     * 新增工作流实例
     */
    String insertCsysWorkflowRun(CsysUserView baseUserView, CsysWorkflowRun csysWorkflowRun, CsysWorkflow cySysWorkflow,
                                 CsysPot csysPot, CsysPotTrs csysPotTrs) throws Exception;

    /*
     * 获取工作流实例迁移状态
     */
    List<CsysTrsAuthView> getTrsStatus(List<CsysUserView> baseUserList, CsysTrsAuthView csysTrsAuthView);

    /*
     * 检查当前工作流实例状态
     */
    JSONObject checkRunStatus(CsysWorkflowRun workflowRun);

    /*
     * 工作流实例状态迁移
     */
    JSONObject potStatusTrs(List<CsysUserView> CsysUserViewList, CsysWorkflowRun csysWorkflowRun)
            throws Exception;

    /*
     * 克隆工作流
     */
    JSONObject cloneWorkFlow(CsysUserView CsysUserView, String cySysWorkflowId);

    /**
     * 通过节点条件自动流转
     */
    JSONObject potAutoTrsByCon(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) throws Exception;

    /**
     * 工作流实例状态迁移校验
     */
    JSONObject potStatusTrsCheck(List<CsysUserView> baseUserList, CsysWorkflowRun csysWorkflowRun);

    /**
     * 根据节点获取下一个迁移对象以及条件
     */
    JSONObject getNextTrsConByPot(List<CsysUserView> baseUserList, CsysWorkflowRun csysWorkflowRun);

    String getPotTrsByCon(List<CsysPotTrsCon> csysPotTrsConList, String snCode);

    /**
     * 节点迁移
     */
    JSONObject potStatusTrsWithoutCheck(List<CsysUserView> baseUserViewList, CsysWorkflowRun workflowRun, CsysPotTrs csysPotTrs) throws Exception;
}
