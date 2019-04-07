package com.company.project.core.cyflow.engine.interfaces;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.company.project.model.CsysPot;
import com.company.project.model.CsysPotTrs;
import com.company.project.model.CsysTrsAuthView;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflow;
import com.company.project.model.CsysWorkflowRun;

public interface WorkflowInterface {

	/*
	 * 验证工作流是否合法
	 */
	public Boolean workFlowIsLegal(String cySysWorkflowId);

	/*
	 * 初始化工作流实例
	 */
	public JSONObject onInitRun(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) throws Exception;

	/*
	 * 新增工作流实例
	 */
	String insertCsysWorkflowRun(CsysUserView baseUserView, CsysWorkflowRun csysWorkflowRun, CsysWorkflow cySysWorkflow,
			CsysPot csysPot, CsysPotTrs csysPotTrs) throws Exception;

	/*
	 * 获取工作流实例迁移状态
	 */
	public List<CsysTrsAuthView> getTrsStatus(List<CsysUserView> baseUserList, CsysTrsAuthView csysTrsAuthView);

	/*
	 * 检查当前工作流实例状态
	 */
	public JSONObject checkRunStatus(CsysWorkflowRun workflowRun);

	/*
	 * 工作流实例状态迁移
	 */
	public JSONObject potStatusTrs(List<CsysUserView> CsysUserViewList, CsysWorkflowRun csysWorkflowRun)
			throws Exception;

	/*
	 * 克隆工作流
	 */
	public JSONObject cloneWorkFlow(CsysUserView CsysUserView, String cySysWorkflowId);

	/*
	 * 工作流实例状态迁移校验
	 */
	public JSONObject potStatusTrsCheck(List<CsysUserView> baseUserList, CsysWorkflowRun csysWorkflowRun);

}
