package com.company.project.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.biz.SystemBiz;
import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.DeleteDataBean;
import com.company.project.core.bean.DynamicJsonBean;
import com.company.project.core.bean.JsonBean;
import com.company.project.core.bean.JsonCompareBean;
import com.company.project.core.bean.ResultBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.core.bean.ValidationBean;
import com.company.project.core.cyflow.engine.interfaces.WorkflowInterface;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflowRun;
import com.company.project.service.SystemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Component
@Transactional
public class SystemBizImpl implements SystemBiz {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private SystemService systemService;

	@Resource
	private WorkflowInterface workflowInterface;

	@Override
	public ResultBean getTableData(CsysUserView baseUserView, TableDataBean tableDataBean) {
		PageHelper.startPage(tableDataBean.getNowPage(), tableDataBean.getPageSize());

		// 查询数据
		List<Map<String, Object>> list = systemService.getTableData(baseUserView, tableDataBean.getTableColumn(),
				tableDataBean.getTableName(), tableDataBean.getTableSort(), tableDataBean.getSearchMap(),
				tableDataBean.getDeleteFlag(), tableDataBean.getEngineMap());

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!tableDataBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : tableDataBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());
							extraData = dynamicProcedure(dynamicJsonBean, baseUserView);

						}
					}

				}

			}
		}

		PageInfo pageInfo = new PageInfo(list);

		ResultBean resultBean = new ResultBean();

		resultBean.setData(pageInfo);
		resultBean.setExtraData(extraData);

		return resultBean;
	}

	@Override
	public ResultBean updateTableData(TableDataBean tableDataBean, List<CsysUserView> baseUserViewList) {

		String returnsequence = systemService.updateTableData(tableDataBean.getTableName(),
				tableDataBean.getUpdateMap(), tableDataBean.getPrimaryMap());

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!tableDataBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : tableDataBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());

							// 替换新增或更新記錄参数值
							List<JsonBean> params = dynamicJsonBean.getParamMap();

							System.out.println("参数尺寸" + params.size());
							for (JsonBean param : params) {
								if ("&id&".equals(param.getName())) {
									param.setValue(returnsequence);
								}
							}

							extraData = dynamicProcedure(dynamicJsonBean, baseUserViewList.get(0));
							try {
								// 循环存储过程返回值
								for (Map<String, Object> map : extraData) {
									logger.info("输出：" + map.get("csys_return"));
									if (map.get("csys_return") != null) {
										if ("onInitRun".equals(map.get("csys_return").toString())) {
											CsysWorkflowRun csysWorkflowRun = new CsysWorkflowRun();
											csysWorkflowRun.setCsysWorkflowRunId(map.get("csys_return").toString());
											csysWorkflowRun
													.setCsysWorkflowRunTable(map.get("csys_tableName").toString());
											csysWorkflowRun
													.setCsysWorkflowRunTableVal(map.get("csys_tableValue").toString());
											workflowInterface.onInitRun(baseUserViewList, csysWorkflowRun);
										}
									}
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
					}
				}
			}
		}

		ResultBean resultBean = new ResultBean();

		resultBean.setStringData(returnsequence);

		resultBean.setExtraData(extraData);

		return resultBean;

	}

	@Override
	public ResultBean logicalDeleteData(DeleteDataBean deleteDataBean, CsysUserView CsysUserView) {

		systemService.logicalDeleteData(deleteDataBean.getTableName(), deleteDataBean.getDeleteFlag(),
				deleteDataBean.getPrimaryMap());

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!deleteDataBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : deleteDataBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());
							extraData = dynamicProcedure(dynamicJsonBean, CsysUserView);

						}
					}

				}

			}
		}

		ResultBean resultBean = new ResultBean();

		resultBean.setExtraData(extraData);

		return resultBean;
	}

	@Override
	public ResultBean physicalDeleteData(DeleteDataBean deleteDataBean, CsysUserView CsysUserView) {

		systemService.physicalDeleteData(deleteDataBean.getTableName(), deleteDataBean.getPrimaryMap());

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!deleteDataBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : deleteDataBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());
							extraData = dynamicProcedure(dynamicJsonBean, CsysUserView);

						}
					}

				}

			}
		}

		ResultBean resultBean = new ResultBean();

		resultBean.setExtraData(extraData);
		return resultBean;
	}

	@Override
	public PageInfo getDynamicSql(DynamicJsonBean dynamicJsonBean, CsysUserView CsysUserView) {

		PageHelper.startPage(dynamicJsonBean.getNowPage(), dynamicJsonBean.getPageSize());

		String dynamicSql = dynamicJsonBean.getDynamicSql();
		// 替换参数值
		for (JsonBean jsonBean : dynamicJsonBean.getParamMap()) {

			dynamicSql = dynamicSql.replaceAll(jsonBean.getName(), "'" + jsonBean.getValue() + "'");
		}

		dynamicSql = dynamicSql.replaceAll("#", "'");

		dynamicSql = dynamicSql.replaceAll("&userid&", CsysUserView.getCsysUserId()).replaceAll("&roleid&",
				CsysUserView.getCsysRoleId());

		List<Map<String, Object>> list = systemService.getDynamicSql(dynamicSql, dynamicJsonBean.getTableSort(),
				dynamicJsonBean.getSearchMap());

		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;
	}

	@Override
	public List<Map<String, Object>> dynamicProcedure(DynamicJsonBean dynamicJsonBean,
			CsysUserView CsysUserView) {

		String dynamicSql = dynamicJsonBean.getDynamicSql();

		// 替换参数值
		List<JsonBean> params = dynamicJsonBean.getParamMap();

		System.out.println("参数尺寸" + params.size());
		for (JsonBean jsonBean : params) {
			if ("&userid&".equals(jsonBean.getName())) {
				jsonBean.setValue(CsysUserView.getCsysUserId());
			}
		}

		List<Map<String, Object>> list = systemService.dynamicProcedure(dynamicSql, params);

		return list;
	}

	@Override
	public PageInfo getChartData(ChartDataBean chartDataBean) {
		PageHelper.startPage(chartDataBean.getNowPage(), chartDataBean.getPageSize());

		// 查询数据
		List<Map<String, Object>> list = systemService.getChartData(chartDataBean.getChartColumnList(),
				chartDataBean.getTableName(), chartDataBean.getTableSort(), chartDataBean.getTableGroup(),
				chartDataBean.getSearchMap(), chartDataBean.getDeleteFlag());

		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;
	}

	@Override
	public List<Map<String, Object>> getCascaderData(CascaderBean cascaderBean) {

		return systemService.getCascaderData(cascaderBean);
	}

	@Override
	public ResultBean saveTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView) {

		String returnsequence = systemService.saveTableData(tableSaveBean.getTableName(), tableSaveBean.getPrimaryKey(),
				tableSaveBean.getData(), tableSaveBean.getSystemData(), tableSaveBean.getDeleteFlag(),
				CsysUserView);

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!tableSaveBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : tableSaveBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());
							// 替换新增或更新記錄参数值
							List<JsonBean> params = dynamicJsonBean.getParamMap();

							System.out.println("参数尺寸" + params.size());
							for (JsonBean param : params) {
								if ("&id&".equals(param.getName())) {
									param.setValue(returnsequence);
								}
							}
							extraData = dynamicProcedure(dynamicJsonBean, CsysUserView);

						}
					}

				}

			}
		}
		ResultBean resultBean = new ResultBean();

		resultBean.setStringData(returnsequence);
		resultBean.setExtraData(extraData);

		return resultBean;
	}

	@Override
	public Map<String, List<Map<String, Object>>> preSearchTableData(List<TableDataBean> tableDataList) {

		/**
		 * 循环查询数据，如果数据中存在动态数据，则反查源数据；如果为静态数据，xx
		 */
		Map<String, List<Map<String, Object>>> sourceData = new HashMap<>();

		for (TableDataBean td : tableDataList) {

			// 查询出数据源。将数据源进行组装

			List<Map<String, Object>> item = systemService.preSearchTableData(td.getSourceid(), td.getTableColumn(),
					td.getTableName(), td.getTableSort(), td.getSearchMap(), td.getPrimaryMap(), td.getDeleteFlag(),
					sourceData);
			sourceData.put(td.getSourceid(), item);

			// 将数据源传入查询方法

		}

		return sourceData;
	}

	@Override
	public ResultBean updateTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView) {

		String returnsequence = systemService.updateTableData(tableSaveBean.getTableName(),
				tableSaveBean.getPrimaryKey(), tableSaveBean.getData(), tableSaveBean.getSystemData(),
				tableSaveBean.getDeleteFlag(), CsysUserView);

		List<Map<String, Object>> extraData = null;
		// 引擎
		if (!tableSaveBean.getEngineMap().isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : tableSaveBean.getEngineMap().entrySet()) {
				if ("procedure".equals(entry.getKey())) {
					if (!entry.getValue().isEmpty()) {
						for (JsonBean jsonBean : entry.getValue()) {
							// 调用存储过程

							DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
							dynamicJsonBean.setDynamicSql(jsonBean.getName());
							dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
							System.out.println("参数尺寸" + jsonBean.getCompositeValue().size());
							// 替换新增或更新記錄参数值
							List<JsonBean> params = dynamicJsonBean.getParamMap();

							System.out.println("参数尺寸" + params.size());
							for (JsonBean param : params) {
								if ("&id&".equals(param.getName())) {
									param.setValue(returnsequence);
								}
							}
							extraData = dynamicProcedure(dynamicJsonBean, CsysUserView);

						}
					}

				}

			}
		}
		ResultBean resultBean = new ResultBean();

		resultBean.setStringData(returnsequence);
		resultBean.setExtraData(extraData);

		return resultBean;
	}

	@Override
	public boolean validationData(ValidationBean validationBean, CsysUserView CsysUserView) {

		// 替换sql中系统参数
		for (JsonCompareBean jc : validationBean.getCompareValue()) {
			if ("senior".equals(validationBean.getMode())) {
				jc.setCompareObject(jc.getCompareObject().replaceAll("&userid&", CsysUserView.getCsysUserId())
						.replaceAll("&roleid&", CsysUserView.getCsysRoleId())
						.replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
			}
			if (null != jc.getAdditional() && !"".equals(jc.getAdditional())) {
				jc.setAdditional(jc.getAdditional().replaceAll("&userid&", CsysUserView.getCsysUserId())
						.replaceAll("&roleid&", CsysUserView.getCsysRoleId())
						.replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
			}
		}

		List<Map<String, Object>> list = systemService.validationData(validationBean.getTableName(),
				validationBean.getMode(), validationBean.getCurrentValue(), validationBean.getCompareValue());

		if (list.size() > 0) {
			return true;
		} else {
			return false;
		}

	}

}
