package com.company.project.core.cyflow.engine.interfaces;

import com.alibaba.fastjson.JSONObject;
import com.company.project.model.*;

import java.util.List;

public interface WorkflowInterface {

    /**
     * 初始化工作流实例
     *
     * @param baseUserViewList
     * @param csysWorkflowRun
     * @return
     * @throws Exception
     */
    JSONObject onInitRun(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) throws Exception;


    /**
     * 获取工作流头结点
     *
     * @param cySysWorkflowId
     * @return
     */
    CsysPot getWorkFlowHeadPot(String cySysWorkflowId);

    /**
     * 新增工作流实例
     *
     * @param baseUserView
     * @param csysWorkflowRun
     * @param cySysWorkflow
     * @param csysPot
     * @param csysPotTrs
     * @return
     * @throws Exception
     */
    String insertCsysWorkflowRun(CsysUserView baseUserView, CsysWorkflowRun csysWorkflowRun, CsysWorkflow cySysWorkflow,
                                 CsysPot csysPot, CsysPotTrs csysPotTrs) throws Exception;

    /**
     * 获取工作流实例迁移状态
     *
     * @param baseUserList
     * @param csysWorkflowRun
     * @return
     */
    JSONObject getTrsStatus(List<CsysUserView> baseUserList, CsysWorkflowRun csysWorkflowRun);


    /**
     * 检查当前工作流实例状态
     *
     * @param workflowRun
     * @return
     */
    JSONObject checkRunStatus(CsysWorkflowRun workflowRun);


    /**
     * 工作流实例状态迁移
     *
     * @param CsysUserViewList
     * @param csysWorkflowRun
     * @return
     * @throws Exception
     */
    JSONObject potStatusTrs(List<CsysUserView> CsysUserViewList, CsysWorkflowRun csysWorkflowRun)
            throws Exception;

    /**
     * 工作流实例状态直接迁移（无检查）
     *
     * @param csysUserView
     * @param workflowRun
     * @param csysPotTrs
     * @return
     * @throws Exception
     */
    JSONObject potStatusTrsWithoutCheck(CsysUserView csysUserView, CsysWorkflowRun
            workflowRun, CsysPotTrs csysPotTrs)
            throws Exception;

    /**
     * 克隆工作流
     *
     * @param CsysUserView
     * @param cySysWorkflowId
     * @return
     */
    JSONObject cloneWorkFlow(CsysUserView CsysUserView, String cySysWorkflowId);

    /**
     * 获取上一个节点
     *
     * @param csysWorkflowRun
     * @return
     */
    CsysTrsLog getRunLastPot(CsysWorkflowRun csysWorkflowRun);

    /**
     * @param workflowId
     * @param potId
     * @return
     */
    CsysPotTrs getNextPot(String workflowId, String potId);
}
