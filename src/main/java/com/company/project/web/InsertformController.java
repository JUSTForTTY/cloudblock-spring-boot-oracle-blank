package com.company.project.web;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.InsertformBiz;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.company.project.core.bean.ResultBean;

/**
* Created by sxs on 2019/04/24.
*/
@RestController
@RequestMapping("/insertform")
public class InsertformController {

	private final Log logger = LogFactory.getLog(getClass());
			
	@Resource
    private InsertformBiz insertformBiz;
    
    @Resource
	private AuthLoginBiz authloginBiz;
    
    @Resource
	private AuthUtils authUtils;

	/***
	 * 新增表单数据
	 */
	@PostMapping(value = "/saveFormData000515")
	public Result saveFormData000515(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody Map<String, String> map) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/

		ResultBean resultBean = insertformBiz.saveFormData000515(map, baseUserList);

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(resultBean, param);

	}

	/***
	 * 更新表单数据
	 */
	@PutMapping(value = "/formData000515")
	public Result updateFormData000515(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody Map<String, String> map) {

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

			insertformBiz.updateFormData000515(map, baseUserList.get(0));

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
	
	/***
	 * 批量新增表单数据
	 */
	@PostMapping(value = "/batchSaveFormData000515")
	public Result batchSaveFormData000515(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<Map<String, String>> tableSaveList) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/

		try {

			for (Map<String, String> map : tableSaveList) {

				 insertformBiz.saveFormData000515(map, baseUserList);

			}

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}
	
	/***
	 * 批量更新表单数据
	 */	
	@PutMapping(value = "/batchUpdateFormData000515")
	public Result batchUpdateFormData000515(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<Map<String, String>> tableSaveList) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);


		/*--------------end 此段代码可优化成redis-----------------------*/

		try {

			for (Map<String, String> map : tableSaveList) {
				insertformBiz.updateFormData000515(map, baseUserList.get(0));
			}

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}
	


	/***
	 * 新增表单数据
	 */
	@PostMapping(value = "/saveFormData000514")
	public Result saveFormData000514(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody Map<String, String> map) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/

		ResultBean resultBean = insertformBiz.saveFormData000514(map, baseUserList);

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(resultBean, param);

	}

	/***
	 * 更新表单数据
	 */
	@PutMapping(value = "/formData000514")
	public Result updateFormData000514(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody Map<String, String> map) {

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

			insertformBiz.updateFormData000514(map, baseUserList.get(0));

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
	
	/***
	 * 批量新增表单数据
	 */
	@PostMapping(value = "/batchSaveFormData000514")
	public Result batchSaveFormData000514(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<Map<String, String>> tableSaveList) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/

		try {

			for (Map<String, String> map : tableSaveList) {

				 insertformBiz.saveFormData000514(map, baseUserList);

			}

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}
	
	/***
	 * 批量更新表单数据
	 */	
	@PutMapping(value = "/batchUpdateFormData000514")
	public Result batchUpdateFormData000514(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<Map<String, String>> tableSaveList) {

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

		// 获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);


		/*--------------end 此段代码可优化成redis-----------------------*/

		try {

			for (Map<String, String> map : tableSaveList) {
				insertformBiz.updateFormData000514(map, baseUserList.get(0));
			}

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}
	

    
}
