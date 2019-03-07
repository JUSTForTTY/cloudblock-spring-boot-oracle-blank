package com.company.project.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.biz.SystemBiz;
import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.DynamicJsonBean;
import com.company.project.core.bean.JsonBean;
import com.company.project.core.bean.JsonCompareBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.core.bean.ValidationBean;
import com.company.project.outer.model.CsysUserView;
import com.company.project.service.SystemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Component
@Transactional
public class SystemBizImpl implements SystemBiz {

	@Resource
	private SystemService systemService;

	@Override
	public PageInfo getTableData(CsysUserView baseUserView, TableDataBean tableDataBean) {
		PageHelper.startPage(tableDataBean.getNowPage(), tableDataBean.getPageSize());

		// 查询数据
		List<Map<String, Object>> list = systemService.getTableData(baseUserView, tableDataBean.getTableColumn(),
				tableDataBean.getTableName(), tableDataBean.getTableSort(), tableDataBean.getSearchMap(),
				tableDataBean.getDeleteFlag(), tableDataBean.getEngineMap());

		
		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;
	}

	@Override
	public void updateTableData(TableDataBean tableDataBean) {

		systemService.updateTableData(tableDataBean.getTableName(), tableDataBean.getUpdateMap(),
				tableDataBean.getPrimaryMap());
	}

	@Override
	public void logicalDeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap) {

		systemService.logicalDeleteData(tableName, deleteFlag, primaryMap);
	}

	@Override
	public void physicalDeleteData(String tableName, List<JsonBean> primaryMap) {

		systemService.physicalDeleteData(tableName, primaryMap);
	}

	@Override
	public PageInfo getDynamicSql(DynamicJsonBean dynamicJsonBean, CsysUserView CsysUserView) {

		PageHelper.startPage(dynamicJsonBean.getNowPage(), dynamicJsonBean.getPageSize());

		String dynamicSql = dynamicJsonBean.getDynamicSql();
		// 替换参数值
		for (JsonBean jsonBean : dynamicJsonBean.getParamMap()) {

			dynamicSql = dynamicSql.replaceAll(jsonBean.getName(), "'" + jsonBean.getValue() + "'");
		}

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

		String dynamicSql = "call " + dynamicJsonBean.getDynamicSql() + " (@id@,&userid&,&roleid&)  ";

		// 替换参数值
		for (JsonBean jsonBean : dynamicJsonBean.getParamMap()) {

			dynamicSql = dynamicSql.replaceAll(jsonBean.getName(), "'" + jsonBean.getValue() + "'");

		}

		dynamicSql = dynamicSql.replaceAll("&userid&", CsysUserView.getCsysUserId()).replaceAll("&roleid&",
				CsysUserView.getCsysRoleId());
		List<Map<String, Object>> list = systemService.dynamicProcedure(dynamicSql, dynamicJsonBean.getTableSort(),
				dynamicJsonBean.getSearchMap());

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
	public String saveTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView) {

		return systemService.saveTableData(tableSaveBean.getTableName(), tableSaveBean.getPrimaryKey(),
				tableSaveBean.getData(), tableSaveBean.getSystemData(), tableSaveBean.getDeleteFlag(),
				CsysUserView);
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
					td.getTableName(), td.getTableSort(), td.getSearchMap(),td.getPrimaryMap(), td.getDeleteFlag(), sourceData);
			sourceData.put(td.getSourceid(), item);

			// 将数据源传入查询方法

		}

		return sourceData;
	}

	@Override
	public String updateTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView) {

		return systemService.updateTableData(tableSaveBean.getTableName(), tableSaveBean.getPrimaryKey(),
				tableSaveBean.getData(), tableSaveBean.getSystemData(), tableSaveBean.getDeleteFlag(),
				CsysUserView);
	}
	
	@Override
	public boolean validationData(ValidationBean validationBean,
			CsysUserView csysUserView) {
		
		//替换sql中系统参数
		for(JsonCompareBean jc:validationBean.getCompareValue()) {
			if("senior".equals(validationBean.getMode())) {
				jc.setCompareObject(jc.getCompareObject().replaceAll("&userid&", csysUserView.getCsysUserId()).replaceAll("&roleid&",
						csysUserView.getCsysRoleId()).replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
			}
			if(null!=jc.getAdditional()&&!"".equals(jc.getAdditional())) {
				jc.setAdditional(jc.getAdditional().replaceAll("&userid&", csysUserView.getCsysUserId()).replaceAll("&roleid&",
						csysUserView.getCsysRoleId()).replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
			}
		}
		
		List<Map<String, Object>> list= systemService.validationData(validationBean.getTableName(), validationBean.getMode(), validationBean.getCurrentValue(), validationBean.getCompareValue());
		 
		if(list.size()>0) {
			return true;
		}else {
			return false;
		}
		 
	}

}
