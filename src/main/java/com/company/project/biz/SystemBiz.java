package com.company.project.biz;

import java.util.List;
import java.util.Map;


import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.DeleteDataBean;
import com.company.project.core.bean.DynamicJsonBean;
import com.company.project.core.bean.ResultBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.core.bean.ValidationBean;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;

public interface SystemBiz {

	/**
	 * 获取数据
	 * 
	 * @param TableDataBean
	 * @return
	 */
	public ResultBean getTableData(CsysUserView baseUserView, TableDataBean tableDataBean);

	/**
	 * 更新数据
	 * 
	 * @param TableDataBean
	 * @return
	 */
	public ResultBean updateTableData(TableDataBean tableDataBean,List<CsysUserView> baseUserList);

	/**
	 * 删除数据
	 * 
	 * @param tableName
	 * @param deleteFlag
	 * @param primaryMap
	 * @return
	 */
	public ResultBean logicalDeleteData(DeleteDataBean deleteDataBean,CsysUserView CsysUserView);

	/**
	 * 物理删除
	 * 
	 * @param tableName
	 * @param primaryMap
	 */
	public ResultBean physicalDeleteData(DeleteDataBean deleteDataBean,CsysUserView CsysUserView);

	/**
	 * 动态sql查询
	 * 
	 * @param dynamicSql
	 * @param paramMap
	 * @param tableSort
	 * @param searchMap
	 * @param page
	 * @return
	 */
	public PageInfo getDynamicSql(DynamicJsonBean dynamicJsonBean, CsysUserView CsysUserView);

	/**
	 * 动态存储过程执行
	 * 
	 * @param dynamicSql
	 * @param paramMap
	 * @param tableSort
	 * @param searchMap
	 * @param page
	 * @return
	 */
	public List<Map<String, Object>> dynamicProcedure(DynamicJsonBean dynamicJsonBean,
			CsysUserView CsysUserView);

	/**
	 * 获取图表数据
	 * 
	 * @param ChartDataBean
	 * @return
	 */
	public PageInfo getChartData(ChartDataBean chartDataBean);

	/**
	 * 获取联级数据
	 * 
	 * @param ChartDataBean
	 * @return
	 */
	public List<Map<String, Object>> getCascaderData(CascaderBean cascaderBean);

	/**
	 * 存储数据
	 * 
	 * @param tableSaveBean
	 * @param CsysUserView
	 * @return
	 */
	public ResultBean saveTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView);

	/**
	 * 更新数据
	 * 
	 * @param tableSaveBean
	 * @param CsysUserView
	 * @return
	 */
	public ResultBean updateTableData(TableSaveBean tableSaveBean, CsysUserView CsysUserView);

	/**
	 * 预查询数据
	 * 
	 * @param tableDataList
	 * @return
	 */
	public Map<String, List<Map<String, Object>>> preSearchTableData(List<TableDataBean> tableDataList);

	/**
	 * 表单校验
	 * 
	 * @param validationData
	 * @return
	 */
	public boolean validationData(ValidationBean validationBean,CsysUserView CsysUserView);
}
