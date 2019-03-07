package com.company.project.core.structure.organize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.structure.engine.interfaces.OrganizeInterfaces;
import com.company.project.core.utils.AuthUtils;
import com.company.project.outer.model.CsysUserView;

/**
 * 
 * @author sxs
 * @说明 组织架构引擎
 *
 */
@RestController
@RequestMapping("/organize")
public class OrganizeEngine {

	@Resource
	private AuthUtils authUtils;

	@Resource
	private AuthLoginBiz authloginBiz;

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private OrganizeInterfaces organizeInterfaces;

	/*
	 * 组织架构获取数据
	 * 
	 */
	@PostMapping("/getOrgUserSql")
	public Result getOrgUserSql(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestParam String organizeId) {
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
			String id = organizeInterfaces.getOrgUserSql(baseUserList.get(0), organizeId);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);
			}
			return ResultGenerator.genSuccessResult(id, param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);

		}
	}
}
