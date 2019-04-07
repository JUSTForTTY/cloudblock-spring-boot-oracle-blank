package com.company.project.biz.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;

import com.company.project.biz.CsysFieldInfoBiz;
import com.company.project.biz.CsysSequenceBiz;
import com.company.project.biz.CsysViewExplainBiz;
import com.company.project.biz.OperateDataBaseBiz;
import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.TableFiled;
import com.company.project.core.bean.updateTableBean;
import com.company.project.dao.CommonOuterUtilsMapper;
import com.company.project.model.CsysFieldInfo;
import com.company.project.model.CsysSequence;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysViewExplain;
import com.company.project.service.OperateDataBaseSerice;
import com.google.common.base.CaseFormat;

@Component
public class OperateDataBaseBizImpl implements OperateDataBaseBiz {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private OperateDataBaseSerice operateDataBaseSerice;

	@Resource
	private CsysFieldInfoBiz csysFieldInfoBiz;

	@Resource
	private CommonOuterUtilsMapper commonOuterUtilsMapper;

	@Resource
	private CsysViewExplainBiz csysViewExplainBiz;

	@Resource
	private CsysSequenceBiz csysSequenceBiz;

	@Override
	public List<T> getAllTableShemel(DataBaseBean dataBaseBean) {

		return operateDataBaseSerice.selectdata(dataBaseBean);
	}

	@Override
	public void createTable(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.createTable(dataTableBean);
	}

	@Override
	public void deleteTable(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.deleteTable(dataTableBean);
	}

	@Override
	public void updateTable(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.updateTable(dataTableBean);
	}

	@Override
	public void updateColumn(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.updateColumn(dataTableBean);
	}

	@Override
	public void deleteColumn(updateTableBean updateTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.deleteColumn(updateTableBean);
	}

	@Override
	public void updateColumnField(updateTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.updateColumnField(dataTableBean);
	}

	@Override
	public List<T> getAllData(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseSerice.selectAlldata(dataBaseBean);
	}

	@Override
	public List<T> getAllColumnData(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseSerice.getAllColumnData(dataBaseBean);
	}

	@Override
	public void updateEngine(DataTableBean dataTableBean) {
		// TODO Auto-generated method stub
		operateDataBaseSerice.updateEngine(dataTableBean);
	}

	@Override
	public List<T> getAllColumnField(DataBaseBean dataBaseBean) {
		// TODO Auto-generated method stub
		return operateDataBaseSerice.getAllColumnField(dataBaseBean);
	}

	@Override
	public void registerOracleTableField(String[] tableNameArray) throws Exception {
		for (String tableName : tableNameArray) {
			// 判断登记表格是否存在
			if (JudgeOracleTableIsExists(tableName)) {
				logger.info("表格存在！");
				// 查询表字段
				List<TableFiled> list = selectOracleTableColumn(tableName);
				logger.info("字段长度：" + list.size());

				// 查询base表中该表的登记信息
				List<CsysFieldInfo> registeredList = getRegisteredField(tableName);
				logger.info("已登记字段长度：" + registeredList.size());
				// 存在标记
				Boolean isExist = false;
				// 循环已登记过的字段，此写法若base表中存在相同的字段，则保留第一个，其他的会被删除
				for (CsysFieldInfo fieldInfo : registeredList) {
					isExist = false;
					// 循环根据表查出的真实字段
					for (int i = 0; i < list.size(); i++) {
						TableFiled tableFiled = list.get(i);
						// 若该表字段存在，则进行更新
						if (tableFiled.getColumnName().equals(fieldInfo.getCsysFieldInfoName())) {
							isExist = true; // 存在标记
							saveOrUpdateOracleField(fieldInfo, tableFiled); // 更新已存在的字段
							list.remove(i);
							break;
						}
					}
					// 若登记过的字段不存在，则将其删除
					if (!isExist) {
						fieldInfo.setCsysFieldInfoIsDelete("1");
						csysFieldInfoBiz.updateDataSettings(new CsysUserView(), fieldInfo);
					}
				}
				// 登记剩余的字段
				for (TableFiled tableFiled : list) {
					// 新增
					saveOrUpdateOracleField(new CsysFieldInfo(), tableFiled);
				}
			} else {
				logger.info("表格不存在！");
			}
		}
	}

	private List<CsysFieldInfo> getRegisteredField(String tablename) {
		// TODO Auto-generated method stub
		CsysFieldInfo csysFieldInfo = new CsysFieldInfo();
		csysFieldInfo.setCsysFieldInfoForeignRegion(tablename);
		return csysFieldInfoBiz.getDataSettingsByCondition(csysFieldInfo);
	}

	private void saveOrUpdateOracleField(CsysFieldInfo csysFieldInfo, TableFiled tableFiled) throws Exception {
		// 表名
		csysFieldInfo.setCsysFieldInfoRegion(tableFiled.getTableName());
		// 字段名
		csysFieldInfo.setCsysFieldInfoName(tableFiled.getColumnName());
		// 真实名称
		csysFieldInfo.setCsysFieldInfoRelname(tableFiled.getComments()); // 字段类型
		csysFieldInfo.setCsysFieldInfoType(tableFiled.getDataType()); // 字段长度
		csysFieldInfo.setCsysFieldInfoLength(tableFiled.getDataLength()); // 是否允许为空（0：否 1：是）
		csysFieldInfo.setCsysFieldInfoIsNull(tableFiled.getNullAble().equals("Y") ? "1" : "0"); // 默认值
		csysFieldInfo.setCsysFieldInfoDefault(tableFiled.getDataDefault());
		if (csysFieldInfo.getCsysFieldInfoId() == null) {
			csysFieldInfoBiz.insertDataSettings(new CsysUserView(), csysFieldInfo);
		} else {
			csysFieldInfoBiz.updateDataSettings(new CsysUserView(), csysFieldInfo);
		}
	}

	public Boolean JudgeOracleTableIsExists(String tableName) {
		List<Map<String, Object>> list = operateDataBaseSerice.selectOracleTable(tableName);
		if ("1".equals(list.get(0).get("LENGTH").toString())) {
			return true;
		}
		return false;
	}

	public List<TableFiled> selectOracleTableColumn(String tableName) {
		return operateDataBaseSerice.selectOracleTableColumn(tableName);
	}

	@Override
	public void registerOracleTable() {
		List<Map<String, String>> tableList = operateDataBaseSerice.getOracleTable();
		logger.info("表格长度：" + tableList.size());
		// 查看已登记表
		List<CsysViewExplain> registeredList = csysViewExplainBiz.getDataSettingsByCondition(new CsysViewExplain());
		for (CsysViewExplain csysViewExplain : registeredList) {
			// 循环根据表查出的真实字段
			for (Map<String, String> map : tableList) {
				// 若该表字段存在，则进行更新
				if (csysViewExplain.getCsysViewExplainName().equals(map.get("TABLE_NAME"))) {
					tableList.remove(map);
					break;
				}
			}
		}
		// 登记剩余的表
		if (tableList.size() > 0) {
			CsysViewExplain csysViewExplain = new CsysViewExplain();
			CsysSequence csysSequence = new CsysSequence();
			for (Map<String, String> map : tableList) {
				// 登记表
				csysViewExplain.setCsysViewExplainName(map.get("TABLE_NAME"));
				csysViewExplainBiz.insertDataSettings(new CsysUserView(), csysViewExplain);
				// 登记sequence
				csysSequence.setCsysSequenceTablename(tableNameConvertUpperCamel(map.get("TABLE_NAME")));
				csysSequenceBiz.insertDataSettings(new CsysUserView(), csysSequence);
			}
		}
	}

	private String tableNameConvertUpperCamel(String tableName) {
		// TODO Auto-generated method stub
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());
	}

	@Override
	public List<Map<String, String>> getOralceTable() {
		// TODO Auto-generated method stub
		return operateDataBaseSerice.getOracleTable();
	}
}
