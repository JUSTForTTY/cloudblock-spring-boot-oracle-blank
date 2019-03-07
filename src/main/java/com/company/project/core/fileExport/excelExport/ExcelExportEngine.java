package com.company.project.core.fileExport.excelExport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.core.fileExport.engine.bean.AutoExportExcel;
import com.company.project.core.fileExport.engine.interfaces.ExcelExportInterface;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;

/**
 * 
 * @author sxs
 * @说明 工作流引擎
 *
 */
@RestController
@RequestMapping("/export")
public class ExcelExportEngine {

	@Resource
	private AuthUtils authUtils;

	@Resource
	private AuthLoginBiz authloginBiz;

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private ExcelExportInterface excelExportInterface;

	@PostMapping("/autoexcel")
	public Result autoexcel(HttpServletRequest request, @RequestBody AutoExportExcel autoExportExcel) throws Exception {
		logger.info("开始导出excel");
		Map<String, String> param = new HashMap<>();
		try {
			String filePath = excelExportInterface.autoExcel(request, autoExportExcel);
			return ResultGenerator.genSuccessResult(filePath, param);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}
	}

}