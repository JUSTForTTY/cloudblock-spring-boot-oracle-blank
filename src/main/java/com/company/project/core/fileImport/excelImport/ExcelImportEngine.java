package com.company.project.core.fileImport.excelImport;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.core.fileImport.engine.interfaces.ExcelImportInterface;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.model.CsysUserView;

/**
 * 
 * @author sxs
 * @add tty
 * @说明 模板导入引擎
 *
 */
@RestController
@RequestMapping("/import")
public class ExcelImportEngine {

	@Resource
	private AuthUtils authUtils;

	@Resource
	private AuthLoginBiz authloginBiz;

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private ExcelImportInterface excelImportInterface;

	/*
	 * 导入excle
	 * 
	 */
	@RequestMapping(value = "/excel", method = RequestMethod.POST)
	public @ResponseBody Result importExcelFile(MultipartHttpServletRequest request,
			@RequestParam(value = "sysExcelImportId") String sysExcelImportId,
			@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, HttpServletResponse response) {
		logger.info("开始导入excel");

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
			MultipartFile excelFile = null;
			Iterator<String> itr = request.getFileNames();
			while (itr.hasNext()) {
				excelFile = request.getFile(itr.next());
			}

			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserAccessToken(token);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/
			excelImportInterface.importExcelFile(baseUserList.get(0), excelFile, sysExcelImportId);

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