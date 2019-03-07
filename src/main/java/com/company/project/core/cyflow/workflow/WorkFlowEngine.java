package com.company.project.core.cyflow.workflow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysWorkflowBiz;
import com.company.project.biz.CsysWorkflowRunBiz;
import com.company.project.core.cyflow.engine.interfaces.WorkflowInterface;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.outer.model.CsysTrsAuthView;
import com.company.project.outer.model.CsysUserView;
import com.company.project.outer.model.CsysWorkflowRun;

/**
 * 
 * @author sxs
 * @说明 工作流引擎
 *
 */
@RestController
@RequestMapping("/workflow")
public class WorkFlowEngine {

	@Resource
	private AuthUtils authUtils;

	@Resource
	private AuthLoginBiz authloginBiz;

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private CsysWorkflowBiz cySysWorkflowBiz;

	@Resource
	private CsysWorkflowRunBiz csysWorkflowRunBiz;

	@Resource
	private WorkflowInterface workFlowInterface;

	/*
	 * 工作流生成实例
	 * 
	 */
	@PostMapping("/onInitRun")
	public Result onInitRun(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysWorkflowRun csysWorkflowRun) {
		logger.debug("工作流生成实例");

		Map<String, String> param = new HashMap<>();
		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			JSONObject data = workFlowInterface.onInitRun(baseUserList, csysWorkflowRun);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);
			}
			return ResultGenerator.genSuccessResult(data, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}
	}

	/*
	 * 克隆工作流
	 */
	@GetMapping("/cloneWorkFlow/{cySysWorkflowId}")
	public Result cloneWorkFlow(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @PathVariable String cySysWorkflowId) {
		logger.info("克隆工作流");

		Map<String, String> param = new HashMap<>();
		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			JSONObject data = workFlowInterface.cloneWorkFlow(baseUserList.get(0), cySysWorkflowId);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);
			}
			return ResultGenerator.genSuccessResult(data, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}
	}

	/*
	 * 获取迁移状态
	 */
	@PostMapping("/getTrsStatus")
	public Result getTransferStatus(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysTrsAuthView csysTrsAuthView) {
		Map<String, String> param = new HashMap<>();
		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			List<CsysTrsAuthView> data = workFlowInterface.getTrsStatus(baseUserList, csysTrsAuthView);
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(data, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	/*
	 * 工作流实例节点迁移
	 */
	@PostMapping("/potStatusTrs")
	public Result potStatusTrs(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysWorkflowRun csysWorkflowRun) {

		Map<String, String> param = new HashMap<>();
		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);
		}

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			JSONObject object = workFlowInterface.potStatusTrs(baseUserList, csysWorkflowRun);
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(object, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}

	}

	/*
	 * 工作流实例节点迁移校验
	 */
	@PostMapping("/potStatusTrsCheck")
	public Result potStatusTrsCheck(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysWorkflowRun csysWorkflowRun) {

		Map<String, String> param = new HashMap<>();
		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);
		}

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			JSONObject object = workFlowInterface.potStatusTrsCheck(baseUserList, csysWorkflowRun);
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(object, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}

	}
}
