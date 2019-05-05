package com.company.project.web;
/**
 * Created by sxs on 2019/03/18.
 */

import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.ReadLogFileBiz;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.model.CsysUserView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/readLogFile")
public class ReadLogFileController {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthLoginBiz authloginBiz;

	@Resource
	private AuthUtils authUtils;

	@Resource
	private ReadLogFileBiz readLogFileBiz;

	/*
	 * 读取sn log文件
	 *
	 */
	@RequestMapping(value = "/sn", method = RequestMethod.POST)
	public @ResponseBody
    Result readSNLogFile(MultipartHttpServletRequest request,
                         @RequestHeader(value = "access_token") String access_token,
                         @RequestHeader(value = "refresh_token") String refresh_token, HttpServletResponse response) {
		logger.info("开始读取txt");
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

			MultipartFile snLogFile = null;
			Iterator<String> itr = request.getFileNames();
			while (itr.hasNext()) {
				snLogFile = request.getFile(itr.next());
			}

			readLogFileBiz.readSNLogFile(baseUserList.get(0), snLogFile);
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);
			}
			return ResultGenerator.genSuccessResult("", param);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}
	}
}
