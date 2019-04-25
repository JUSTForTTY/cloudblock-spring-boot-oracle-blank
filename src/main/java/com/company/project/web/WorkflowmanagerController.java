package com.company.project.web;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.WorkflowmanagerBiz;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.company.project.core.bean.ResultBean;
import com.company.project.core.bean.SearchTableBean;

/**
* Created by sxs on 2019/04/24.
*/
@RestController
@RequestMapping("/workflowmanager")
public class WorkflowmanagerController {

	private final Log logger = LogFactory.getLog(getClass());
			
	@Resource
    private WorkflowmanagerBiz workflowmanagerBiz;

    @Resource
	private AuthLoginBiz authloginBiz;

    @Resource
	private AuthUtils authUtils;

	@PostMapping(value = "/tableData000859")
	public Result getTableData000859(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody SearchTableBean searchTableBean) {

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
		/*---------------------------end 授权验证------------------------*/

		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			ResultBean resultBean = workflowmanagerBiz.getTableData000859(baseUserList.get(0), searchTableBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(resultBean, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}

	}

	// 逻辑删除表格数据
	@PostMapping(value = "/logicalDeleteTableData000859")
	public Result logicalDeleteTableData000859(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,@RequestBody List<Map<String, String>> list) {

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
		/*---------------------------end 授权验证------------------------*/
		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			for (Map<String, String> map : list) {

				workflowmanagerBiz.logicalDeleteTableData000859(map, baseUserList.get(0));
			}
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}

	}

	// 物理删除表格数据
	@DeleteMapping(value = "/physicalDeleteTableData000859")
	public Result physicalDeleteTableData000859(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,@RequestBody List<Map<String, String>> list) {

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
		/*---------------------------end 授权验证------------------------*/

		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			for (Map<String, String> map : list) {

				workflowmanagerBiz.physicalDeleteTableData000859(map, baseUserList.get(0));
			}
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}
	}

    
}
