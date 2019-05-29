package com.company.project.core.cyflow.engine.interfaces;

import com.alibaba.fastjson.JSONObject;
import com.company.project.model.*;

import java.util.List;

public interface WorkflowInterface {

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
    JSONObject getTrsStatus(List<CsysUserView> baseUserList, CsysWorkflowRun csysWorkflowRun);


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
     * 工作流实例状态直接迁移（无检查）
     */
    JSONObject potStatusTrsWithoutCheck(CsysUserView csysUserView, CsysWorkflowRun
            workflowRun, CsysPotTrs csysPotTrs)
            throws Exception;

    /*
     * 克隆工作流
     */
    JSONObject cloneWorkFlow(CsysUserView CsysUserView, String cySysWorkflowId);

    CsysTrsLog getRunLastPot(CsysWorkflowRun csysWorkflowRun);

    CsysPotTrs getNextPot(String workflowId, String potId);
}
