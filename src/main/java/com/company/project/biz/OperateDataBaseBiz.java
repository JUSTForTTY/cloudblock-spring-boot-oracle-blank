package com.company.project.biz;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.updateTableBean;

public interface OperateDataBaseBiz {

	/**
	 * 查询数据库信息
	 * 
	 * @param dataBaseBean
	 * @return
	 */
	public List<T> getAllTableShemel(DataBaseBean dataBaseBean);

	public void createTable(DataTableBean dataTableBean);

	public void deleteTable(DataTableBean dataTableBean);

	public void updateTable(updateTableBean dataTableBean);

	public void updateColumn(updateTableBean dataTableBean);

	public void deleteColumn(updateTableBean updateTableBean);

	public void updateColumnField(updateTableBean dataTableBean);

	public List<T> getAllData(DataBaseBean dataBaseBean);

	public List<T> getAllColumnData(DataBaseBean dataBaseBean);

	public void updateEngine(DataTableBean dataTableBean);

	public List<T> getAllColumnField(DataBaseBean dataBaseBean);

	public void registerOracleTableField(String[] tableNameArray) throws Exception;

	public void registerOracleTable();

	public List<Map<String, String>> getOralceTable();
}
