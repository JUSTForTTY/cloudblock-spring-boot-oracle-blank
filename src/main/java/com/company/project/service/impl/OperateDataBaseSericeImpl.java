package com.company.project.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.TableFiled;
import com.company.project.core.bean.updateTableBean;
import com.company.project.dao.OperateDataBaseMapper;
import com.company.project.service.OperateDataBaseSerice;

@Service
public class OperateDataBaseSericeImpl implements OperateDataBaseSerice {

	@Resource
	private OperateDataBaseMapper operateDataBaseMapper;

	@Override
	public List<T> selectdata(DataBaseBean dataBaseBean) {

		return operateDataBaseMapper.selectDatabeseShemel(dataBaseBean);
	}

	@Override
	public void createTable(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.createTable(dataTableBean);
	}

	@Override
	public void deleteTable(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.deleteTable(dataTableBean);
	}

	@Override
	public void updateTable(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.updateTable(dataTableBean);
	}

	@Override
	public void updateColumn(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.updateColumn(dataTableBean);
	}

	@Override
	public void deleteColumn(updateTableBean updateTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.deleteColumn(updateTableBean);
	}

	@Override
	public void updateColumnField(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.updateColumnField(dataTableBean);
	}

	@Override
	public List<T> selectAlldata(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseMapper.selectData(dataBaseBean);
	}

	@Override
	public List<T> getAllColumnData(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseMapper.getAllColumnData(dataBaseBean);
	}

	@Override
	public void updateEngine(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseMapper.updateEngine(dataTableBean);
	}

	@Override
	public List<T> getAllColumnField(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseMapper.getAllColumnField(dataBaseBean);
	}

	@Override
	public List<Map<String, Object>> selectOracleTable(String tableName) {
		// TODO Auto-generated method stub
		return operateDataBaseMapper.selectOracleTable(tableName);
	}

	@Override
	public List<TableFiled> selectOracleTableColumn(String tableName) {
		// TODO Auto-generated method stub
		return operateDataBaseMapper.selectOracleTableColumn(tableName);
	}

	@Override
	public List<Map<String, String>> getOracleTable() {
		return operateDataBaseMapper.getOracleTable();
	}
}
