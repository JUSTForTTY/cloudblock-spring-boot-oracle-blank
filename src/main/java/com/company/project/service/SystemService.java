package com.company.project.service;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartColumnBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.JsonBean;
import com.company.project.core.bean.JsonColumnBean;
import com.company.project.core.bean.JsonCompareBean;
import com.company.project.core.bean.SearchSubJsonBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;

public interface SystemService {
	/**
	 * 获取表格数据信息
	 * 
	 * @param column
	 * @param tableName
	 * @param tableSort
	 * @param searchMap
	 * @param deleteFlag
	 * @return
	 */
	public List<Map<String, Object>> getTableData(CsysUserView baseUserView, List<JsonColumnBean> column, String tableName,
			List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap, List<JsonBean> deleteFlag,
			Map<String, List<JsonBean>> engineMap);

	/**
	 * 更新表格数据信息
	 * 
	 * @param tableName
	 * @param updateMap
	 * @param primaryMap
	 * @return
	 */
	public String updateTableData(String tableName, List<JsonBean> updateMap, List<JsonBean> primaryMap);

	/**
	 * 删除数据
	 * 
	 * @param tableName
	 * @param deleteFlag
	 * @param primaryMap
	 * @return
	 */
	public void logicalDeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap);

	/**
	 * 物理删除
	 * 
	 * @param tableName
	 * @param primaryMap
	 */
	public void physicalDeleteData(String tableName, List<JsonBean> primaryMap);

	/**
	 * 
	 * @param dynamicSql
	 * @return
	 */
	public List<Map<String, Object>> getDynamicSql(String dynamicSql, List<JsonBean> tableSort,
			Map<String, List<SearchSubJsonBean>> searchMap);

	/**
	 * 
	 * @param dynamicProcedure
	 * @return
	 */
	public List<Map<String, Object>> dynamicProcedure(String dynamicSql,List<JsonBean> params);

	/**
	 * 获取图表数据信息
	 * 
	 * @param column
	 * @param tableName
	 * @param tableSort
	 * @param searchMap
	 * @param deleteFlag
	 * @return
	 */
	public List<Map<String, Object>> getChartData(List<ChartColumnBean> columnList, String tableName,
			List<JsonBean> tableSort, String[] tableGroup, Map<String, List<SearchSubJsonBean>> searchMap,
			List<JsonBean> deleteFlag);

	/**
	 * 获取联级数据信息
	 * 
	 * @param cascaderBeanList
	 * @return
	 */
	public List<Map<String, Object>> getCascaderData(CascaderBean cascaderBean);

	/**
	 * 存储信息
	 * 
	 * @param tableName
	 * @param primaryKey
	 * @param data
	 * @param SystemData
	 * @param deleteFlag
	 * @return
	 */
	public String saveTableData(String tableName, List<JsonColumnBean> primaryKey, List<JsonColumnBean> data,
			List<JsonColumnBean> SystemData, List<JsonColumnBean> deleteFlag, CsysUserView CsysUserView);

	/**
	 * 更新信息
	 * 
	 * @param tableName
	 * @param primaryKey
	 * @param data
	 * @param SystemData
	 * @param deleteFlag
	 * @return
	 */
	public String updateTableData(String tableName, List<JsonColumnBean> primaryKey, List<JsonColumnBean> data,
			List<JsonColumnBean> SystemData, List<JsonColumnBean> deleteFlag, CsysUserView CsysUserView);

	/**
	 * 
	 * @param column
	 * @param tableName
	 * @param tableSort
	 * @param searchMap
	 * @param deleteFlag
	 * @return
	 */
	public List<Map<String, Object>> preSearchTableData(String sourceid, List<JsonColumnBean> column, String tableName,
			List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap,List<JsonBean> primaryMap, List<JsonBean> deleteFlag,
			Map<String, List<Map<String, Object>>> sourceData);
	
	/**
	 * 校验
	 * @param tableName
	 * @param currentValue
	 * @param compareValue
	 * @return
	 */
	public List<Map<String, Object>> validationData(String tableName,String mode,JsonBean currentValue, List<JsonCompareBean> compareValue);
	
}
