package com.company.project.web;

import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.core.utils.JWTUtil;
import com.company.project.model.CsysUser;
import com.company.project.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysUserBiz;
import com.github.pagehelper.PageInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2018/08/22.
 */
@RestController
@RequestMapping("/v1")
public class AuthLoginController {
	private final Log logger = LogFactory.getLog(getClass());
	@Resource
	private AuthLoginBiz CsysUserViewBiz;
	@Resource
	private CsysUserBiz cySysBaseUserBiz;
	@Resource
	private AuthUtils authUtils;

	/***
	 * @author tty
	 * @version 1.0
	 * @地址：http://localhost/v1/authlogin
	 * @说明：授权登录，获取token @参数： cySysBaseUserUsername 用户名（必填）； cySysBaseUserPassword
	 * 密码（必填） cySysRoleId 角色（选填） cySysDepartmentId 部门（选填）
	 * 
	 * 
	 * @请求格式：json { "cySysBaseUserUsername":"admin", "cySysBaseUserPassword":"123",
	 *            "cySysRoleId":"", "cySysDepartmentId":"" }
	 * 
	 * @返回信息：
	 * 
	 * 
	 */
	@PostMapping(value = "/authlogin", produces = "text/html;charset=utf-8")
	public Result authlogin(@RequestBody CsysUserView baseUserView,
			@RequestParam(value = "refresh_time", defaultValue = "1440") Integer refresh_time) {

		logger.info("授权登录");

		Map<String,String> param = new HashMap<>();

		 
		List<CsysUserView> baseUserList = CsysUserViewBiz.login(baseUserView);

		logger.info("长度"+baseUserList.size());
		if (baseUserList.size() > 0) {
			CsysUserView currentBaseUserView = baseUserList.get(0);

			logger.info("获取token中......");

			String token, refresh_token;
			try {
				token = JWTUtil.createJWT(currentBaseUserView.getCsysUserOpenId(),
						currentBaseUserView.getCsysUserUsername(), 1000 * 60 * 2);

				logger.info("获取成功，有效时间10分钟，token:" + token);

				// 生成refresh token，单位:分钟
				refresh_token = JWTUtil.createJWT(currentBaseUserView.getCsysUserOpenId(),
						currentBaseUserView.getCsysUserUsername(), 1000 * 60 * refresh_time);

				// 存储token,refresh_token
				CsysUser baseUser = new CsysUser();
				CsysUserView userdata = baseUserList.get(0);
				baseUser.setCsysUserAccessToken(token);
				baseUser.setCsysUserRefreshToken(refresh_token);
				baseUser.setCsysUserId(userdata.getCsysUserId());
				cySysBaseUserBiz.updateDataSettings(currentBaseUserView, baseUser);

				userdata.setCsysUserRefreshToken(refresh_token);
				userdata.setCsysUserAccessToken(token);
				/*
				 * return code: 0 请求成功
				 */
				 
				return ResultGenerator.genSuccessResult(userdata,param);

			} catch (Exception e) {

				logger.info("获取失败" + e);

				e.printStackTrace();
				/*
				 * return code: 10002 获取access_token时，系统异常，授权获取token失败
				 */
				return ResultGenerator.genServerErrorResult(param);

			}

		} else {

			logger.info("登录失败，账号密码不正确！");

			/*
			 * return code: 10001 获取access_token时账号密码错误，授权获取token失败
			 */
			return ResultGenerator.genFailResult("登录失败，账号密码不正确!",param);

		}

	}

	@PostMapping("/register")
	public Result insertSettingsData(
			@RequestBody CsysUserView CsysUserView) {

		Map<String,String> param = new HashMap<>();
		 
		/*---------------------------end 授权验证------------------------*/
		try {
 
			//CsysUserViewBiz.insertDataSettings(CsysUserView);
			

			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {

			logger.info("获取失败" + e);

			e.printStackTrace();
			/*
			 * return code: 10002 获取access_token时，系统异常，授权获取token失败
			 */
			return ResultGenerator.genServerErrorResult(param);

		}
		 

	}

	@DeleteMapping("/{ids}")
	public Result delete(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @PathVariable String ids) {
		
		Map<String,String> param = new HashMap<>();
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

			CsysUserViewBiz.deleteDataSettings(ids);
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

	@PutMapping
	public Result update(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysUserView CsysUserView) {
		
		Map<String,String> param = new HashMap<>();
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

			List<CsysUserView> baseUserList = CsysUserViewBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			CsysUserViewBiz.updateDataSettings(baseUserList.get(0), CsysUserView);
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

	@GetMapping("/{id}")
	public Result detail(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @PathVariable String id) {
		
		Map<String,String> param = new HashMap<>();
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

			CsysUserView CsysUserView = CsysUserViewBiz.getDataSettings(id);
			return ResultGenerator.genSuccessResult(CsysUserView,param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}

	@PostMapping("/Condition")
	public Result detailByCondition(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody CsysUserView CsysUserView) {
		
		Map<String,String> param = new HashMap<>();
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

			List<CsysUserView> CsysUserViewlst = CsysUserViewBiz
					.getDataSettingsByCondition(CsysUserView);
			return ResultGenerator.genSuccessResult(CsysUserViewlst,param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}

	@GetMapping
	public Result list(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
		
		Map<String,String> param = new HashMap<>();
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
			PageInfo pageInfo = CsysUserViewBiz.getPageDataSettings(page, size);

			return ResultGenerator.genSuccessResult(pageInfo,param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}
}
