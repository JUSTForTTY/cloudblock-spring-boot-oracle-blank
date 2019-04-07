package com.company.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.TableFiled;
import com.company.project.core.bean.updateTableBean;

public interface OperateDataBaseMapper {

	public List<T> selectDatabeseShemel(DataBaseBean dataBaseBean);

	public void createTable(DataTableBean dataTableBean);

	public void deleteTable(DataTableBean dataTableBean);

	public void updateTable(updateTableBean dataTableBean);

	public void updateColumn(updateTableBean dataTableBean);

	public void deleteColumn(updateTableBean updateTableBean);

	public void updateColumnField(updateTableBean dataTableBean);

	public List<T> selectData(DataBaseBean dataBaseBean);

	public List<T> getAllColumnData(DataBaseBean dataBaseBean);

	public void updateEngine(DataTableBean dataTableBean);

	public List<T> getAllColumnField(DataBaseBean dataBaseBean);

	public List<Map<String, Object>> selectOracleTable(String tableName);

	public List<TableFiled> selectOracleTableColumn(String tableName);

	public List<Map<String, String>> getOracleTable();
}
