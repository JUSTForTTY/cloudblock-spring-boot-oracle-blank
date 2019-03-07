package com.company.project.core.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysMenuAuthBiz;
import com.company.project.biz.CsysMenuPageViewBiz;
import com.company.project.biz.CsysPageBiz;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.outer.model.CsysUserView;
import com.company.project.model.CySysBlockSucu01data0010001;
import com.company.project.outer.model.CsysMenuAuth;
import com.company.project.outer.model.CsysMenuPageView;
import com.company.project.outer.model.CsysPage;
import com.fasterxml.uuid.Logger;

/**
 * 
 * @author tty
 * @version v1.0 前端代码生成-angular版
 *
 */
@RestController
@RequestMapping("/angular")
public class AngularCodeGenerateUtils {
	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthUtils authUtils;

	@Resource
	private CsysPageBiz csysPageBiz;

	@Resource
	private CsysMenuPageViewBiz csysMenuPageViewBiz;

	@Resource
	private CsysMenuAuthBiz csysMenuAuthBiz;

	@Resource
	private AuthLoginBiz authloginBiz;

	@GetMapping("component/{id}")
	public Result buildComponent(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @PathVariable String id) throws Exception {

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

		// 一、查询页面信息
		logger.info("查询页面信息==》");
		CsysPage csysPage = csysPageBiz.getDataSettings(id);
		String pageName = csysPage.getCsysPageId();

		pageName = pageName.toLowerCase();
		// 二、 生成批处理命令创建angular基础文件，如果页面已经发布过，则不用生成
		logger.info("生成批处理文件==》");
		if ("0".equals(csysPage.getCsysPageStatus())) {

			AngularFileBat.BuildCloudBlock(pageName);
		}

		// 修改页面信息
		for (int i = 0;; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			File htmlFile = new File(
					"" + BuildUrlUtils.AngularPackageTestUrl + "\\" + pageName + "\\" + pageName + ".component.html");
			File tsFile = new File(
					"" + BuildUrlUtils.AngularPackageTestUrl + "\\" + pageName + "\\" + pageName + ".component.ts");
			if (htmlFile.exists() && tsFile.exists()) {
				BuildAngularHTML.insertNewLine(pageName, csysPage);
				BuildAngularTS.insertNewLine(pageName, csysPage);
				break; // 直接结束for循环
			}

		}
		// 四、改变页面状态
		logger.info("更改页面状态==》");
		CsysPage updatePage = new CsysPage();
		updatePage.setCsysPageId(csysPage.getCsysPageId());
		updatePage.setCsysPageStatus("2");
		updatePage.setCsysPageGitstatus("1");
		csysPageBiz.updateDataSettings(baseUserList.get(0), updatePage);

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(param);

	}

	@GetMapping("menu")
	public Result buildMenu(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token) {

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

			// 查询菜单
			JSONObject obj = new JSONObject();
			CsysMenuPageView csysMenuPageView = new CsysMenuPageView();
			csysMenuPageView.setCsysPageStatus("2");
			List<CsysMenuPageView> lst = csysMenuPageViewBiz.getDataSettingsByCondition(csysMenuPageView);

			// 处理菜单，赋值权限acl
			for (CsysMenuPageView upv : lst) {
  
				// 查询菜单的角色信息
				CsysMenuAuth csysMenuAuth=new CsysMenuAuth();
				csysMenuAuth.setCsysMenuId(upv.getCsysMenuId());
				List<CsysMenuAuth> userMenuList = csysMenuAuthBiz
						.getDataSettingsByCondition(csysMenuAuth);
				// 将此菜单的角色打包成数组
				ArrayList al = new ArrayList();

				for (CsysMenuAuth um : userMenuList) {
					al.add("'"+um.getCsysRoleId()+"'");

				}
				String acl=StringUtils.join(al.toArray(), ",");
				
				upv.setCsysMenuAcl("["+acl+"]");
			}

			obj.put("data", lst);
 
			System.out.println(obj.toJSONString());

			BuildAngularMenu.insertNewLine(obj.toJSONString());

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
