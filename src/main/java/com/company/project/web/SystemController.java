package com.company.project.web;

import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.DeleteDataBean;
import com.company.project.core.bean.DynamicJsonBean;
import com.company.project.core.bean.SmsBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.core.bean.ValidationBean;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.core.utils.Sms;
import com.company.project.outer.model.CsysUserView;
import com.alibaba.fastjson.JSONObject;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.SystemBiz;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tty1 on 2018/08/28.
 */
@RestController
@RequestMapping("/system")
public class SystemController {
	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private SystemBiz systemBiz;

	@Resource
	private AuthLoginBiz authloginBiz;

	@Resource
	private AuthUtils authUtils;

	@Resource
	private Sms sms;

	// 查询表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@PostMapping(value = "/tableData")
	public Result getTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableDataBean tableDataBean) {

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

			PageInfo pageInfo = systemBiz.getTableData(baseUserList.get(0), tableDataBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(pageInfo, param);

		} catch (Exception e) {
			e.printStackTrace();

			return ResultGenerator.genServerErrorResult(param);

		}

	}

	// 更新表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@PutMapping(value = "/tableData")
	public Result putTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableDataBean tableDataBean) {

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

			systemBiz.updateTableData(tableDataBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}

	// 物理删除表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@DeleteMapping(value = "/physicalDeleteData")
	public Result physicalDeleteData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<DeleteDataBean> deleteBeanList) {

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

			for (DeleteDataBean deleteBean : deleteBeanList) {

				systemBiz.physicalDeleteData(deleteBean.getTableName(), deleteBean.getPrimaryMap());
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

	// 逻辑查询表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@PostMapping(value = "/logicalDeleteData")
	public Result logicalDeleteData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<DeleteDataBean> deleteBeanList) {

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

			for (DeleteDataBean deleteBean : deleteBeanList) {

				systemBiz.logicalDeleteData(deleteBean.getTableName(), deleteBean.getDeleteFlag(),
						deleteBean.getPrimaryMap());
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
	 * 
	 * rest风格查询数据接口 post请求 说明: url:http://localhost:8080/v1/system/CommonData 参数:
	 * 
	 */

	@PostMapping(value = "/dynamicSql")
	public Result getDynamicSql(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody DynamicJsonBean dynamicJson) {

		logger.info("查询动态sql信息");
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

		/*--------------start 此段代码可优化成redis-----------------------*/
		CsysUserView baseUserView = new CsysUserView();

		baseUserView.setCsysUserRefreshToken(refreshtoken);

		List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/

		PageInfo pagedata = systemBiz.getDynamicSql(dynamicJson, baseUserList.get(0));

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(pagedata, param);

	}

	/***
	 * 自定义存储过程 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/CommonData 参数:
	 * 
	 */

	@PostMapping(value = "/dynamicProcedure")
	public Result dynamicProcedure(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody DynamicJsonBean dynamicJson) {

		logger.info("执行动态存储过程");
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
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			List<Map<String, Object>> dataList = systemBiz.dynamicProcedure(dynamicJson, baseUserList.get(0));

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(dataList, param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

	/***
	 * 查询图表数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/chartData")
	public Result getChartsData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody ChartDataBean chartDataBean) {

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

			PageInfo pageInfo = systemBiz.getChartData(chartDataBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(pageInfo, param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

	/***
	 * 预查询数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/preSearchData")
	public Result preSearchtableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<TableDataBean> tableDataList) {

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

		Map<String, List<Map<String, Object>>> mapData = systemBiz.preSearchTableData(tableDataList);

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(mapData, param);

	}

	/***
	 * 存储数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/tableSaveData")
	public Result saveTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableSaveBean tableSaveBean) {

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

		String returnsequence = systemBiz.saveTableData(tableSaveBean, baseUserList.get(0));

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(returnsequence, param);

	}

	/***
	 * 批量存储数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/tableBatchSaveData")
	public Result saveBatchTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<TableSaveBean> tableSaveListBean) {

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

			for (TableSaveBean tsBean : tableSaveListBean) {

				String returnsequence = systemBiz.saveTableData(tsBean, baseUserList.get(0));

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
	 * 存储数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/tableUpdateData")
	public Result updateTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableSaveBean tableSaveBean) {

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

		String returnsequence = systemBiz.updateTableData(tableSaveBean, baseUserList.get(0));

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(returnsequence, param);

	}

	/***
	 * 存储数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/tableBatchUpdateData")
	public Result updateBatchTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<TableSaveBean> tableSaveListBean) {

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

			for (TableSaveBean tsBean : tableSaveListBean) {
				String returnsequence = systemBiz.updateTableData(tsBean, baseUserList.get(0));
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
	 * 查询联级数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/cascaderData")
	public Result getCascaderData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody CascaderBean cascaderBean) {

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

		List<Map<String, Object>> list = systemBiz.getCascaderData(cascaderBean);

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);

		}
		return ResultGenerator.genSuccessResult(list, param);

	}

	/***
	 * 表单校验-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口 rest风格查询数据接口 post请求 说明:
	 * url:http://localhost:8080/v1/system/chartData 参数:
	 * 
	 */

	@PostMapping(value = "/validationData")
	public Result validationData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody ValidationBean validationBean) {

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

			boolean flag = systemBiz.validationData(validationBean, baseUserList.get(0));

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(flag, param);
		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

	/***
	 * 自定义存储过程 rest风格发短信接口 post请求 说明: url:http://localhost:8080/v1/system/CommonData
	 * 参数:
	 * 
	 */

	@PostMapping(value = "/postMessage", produces = "text/html;charset=utf-8")
	public Result postMessage(@RequestBody SmsBean smsBean, Model model, HttpServletRequest request,
			HttpServletResponse response) {

		logger.info("调用短信接口");
		Map<String, String> param = new HashMap<>();

		try {

			String code = sms.sendSms(smsBean.getMobile(), smsBean.getContent());

			return ResultGenerator.genSuccessResult(code, param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}
	}

}
