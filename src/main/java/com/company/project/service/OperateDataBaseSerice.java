package com.company.project.service;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.TableFiled;
import com.company.project.core.bean.updateTableBean;

public interface OperateDataBaseSerice {

	List<T> selectdata(DataBaseBean dataBaseBean);

	void createTable(DataTableBean dataTableBean);

	void deleteTable(DataTableBean dataTableBean);

	void updateTable(updateTableBean dataTableBean);

	void updateColumn(updateTableBean dataTableBean);

	void deleteColumn(updateTableBean updateTableBean);

	void updateColumnField(updateTableBean dataTableBean);

	List<T> selectAlldata(DataBaseBean dataBaseBean);

	List<T> getAllColumnData(DataBaseBean dataBaseBean);

	void updateEngine(DataTableBean dataTableBean);

	List<T> getAllColumnField(DataBaseBean dataBaseBean);

	List<Map<String, Object>> selectOracleTable(String tableName);

	List<TableFiled> selectOracleTableColumn(String tableName);

	List<Map<String, String>> getOracleTable();

}
