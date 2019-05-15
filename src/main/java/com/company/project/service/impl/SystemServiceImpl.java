package com.company.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.biz.CommonBiz;
import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.CascaderChild;
import com.company.project.core.bean.CascaderChildField;
import com.company.project.core.bean.ChartColumnBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.JsonBean;
import com.company.project.core.bean.JsonColumnBean;
import com.company.project.core.bean.JsonCompareBean;
import com.company.project.core.bean.SearchSubJsonBean;
import com.company.project.core.structure.engine.interfaces.OrganizeInterfaces;
//import com.company.project.core.structure.engine.interfaces.OrganizeInterfaces;
import com.company.project.core.utils.DateUtils;
import com.company.project.core.utils.Md5Encrypt;
import com.company.project.dao.CommonOuterUtilsMapper;
import com.company.project.dao.SystemMapper;
import com.company.project.model.CsysUserView;
import com.company.project.service.SystemService;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SystemServiceImpl implements SystemService {
	@Resource
	private SystemMapper systemMapper;

	@Resource
	private CommonBiz commonBiz;

	@Resource
	private OrganizeInterfaces organizeInterfaces;

	@Override
	public List<Map<String, Object>> getTableData(CsysUserView baseUserView, List<JsonColumnBean> column,
			String tableName, List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap,
			List<JsonBean> deleteFlag, Map<String, List<JsonBean>> engineMap) {
		String columndata = "";

		if (!column.isEmpty()) {
			for (JsonColumnBean entry : column) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					if(entry.getType().indexOf("TIMESTAMP")>-1) {
						columndata += "to_char(" + entry.getName() + ",'yyyy-mm-dd hh24:mi:ss:ff6') as "
								+ entry.getName() + ",";
					}else {
						columndata += entry.getName() + ",";
					}

				} else {

				}
			}

		} else {

			columndata = "*,";
		}

		columndata = columndata.substring(0, columndata.length() - 1);

		String sql = "select " + columndata + " from  " + tableName + " where 1=1";

		// 删除标记暂时支持一个字段
		if (!deleteFlag.isEmpty()) {

			for (JsonBean entry : deleteFlag) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					sql += " and ";

					sql += "" + entry.getName() + " = '" + entry.getValue() + "' ";

				} else {

				}

			}

		}

		// 遍历搜索条件
		if (!searchMap.isEmpty()) {

			sql += " and ";

			for (Map.Entry<String, List<SearchSubJsonBean>> entry : searchMap.entrySet()) {

				sql += "(";
				for (SearchSubJsonBean subentry : entry.getValue()) {

					if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
						if ("dateformat".equals(subentry.getType())) {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_date('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_char('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_number('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "') or";
						} else {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' and  '" + subentry.getValue2() + "') or";
						}

					} else if ("like".equals(subentry.getName())) {

						if ("dateformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
									+ "%' or";
						}

					} else {
						if ("dateformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' or";
						}

					}

				}
				sql = sql.substring(0, sql.length() - 2);

				sql += ")";

				sql += " and";

			}

			sql = sql.substring(0, sql.length() - 3);

		}

		// 引擎
		if (!engineMap.isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : engineMap.entrySet()) {
				for (JsonBean jsonBean : entry.getValue()) {
					// 是否需要组织架构
					if ("organizeField".equals(jsonBean.getName()))
						sql += " and " + jsonBean.getValue() + " in("
								+ organizeInterfaces.getOrgUserSql(baseUserView, null) + ") ";
				}
			}
		}

		if (!tableSort.isEmpty()) {
			sql += " order by ";
			for (JsonBean entry : tableSort) {

				sql += "" + entry.getName() + " " + entry.getValue() + " ,";

			}

			sql = sql.substring(0, sql.length() - 1);

		}

		System.out.println(sql);
		return systemMapper.selectPublicItemList(sql);
	}

	public void updateTableData(String tableName, List<JsonBean> updateMap, List<JsonBean> primaryMap) {
		String sql = "update " + tableName + " ";

		if (!updateMap.isEmpty()) {
			sql += " set ";

			for (JsonBean entry : updateMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' ,";
			}

			sql = sql.substring(0, sql.length() - 1);

		}

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {
			sql += " where 1=2 ";
		}

		systemMapper.updatePublicItem(sql);
	}

	@Override
	public void logicalDeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap) {

		String sql = "update " + tableName + " set " + deleteFlag + " ='1' ";

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {

			sql += " where 1=2 ";
		}
		systemMapper.updatePublicItem(sql);
	}

	@Override
	public void physicalDeleteData(String tableName, List<JsonBean> primaryMap) {
		String sql = "delete from " + tableName + "";

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {
			sql += " where 1=2 ";
		}
		systemMapper.deletePublicItem(sql);

	}

	@Override
	public List<Map<String, Object>> getDynamicSql(String dynamicSql, List<JsonBean> tableSort,
			Map<String, List<SearchSubJsonBean>> searchMap) {
		String sql = dynamicSql;

		// 遍历搜索条件
		if (!searchMap.isEmpty()) {

			sql += " and ";
			for (Map.Entry<String, List<SearchSubJsonBean>> entry : searchMap.entrySet()) {

				sql += "(";
				for (SearchSubJsonBean subentry : entry.getValue()) {

					if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
						if ("dateformat".equals(subentry.getType())) {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_date('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_char('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_number('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "') or";
						} else {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' and  '" + subentry.getValue2() + "') or";
						}

					} else if ("like".equals(subentry.getName())) {

						if ("dateformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
									+ "%' or";
						}

					} else {
						if ("dateformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' or";
						}

					}

				}
				sql = sql.substring(0, sql.length() - 2);

				sql += ")";

				sql += " and";

			}

			sql = sql.substring(0, sql.length() - 3);

		}

		if (!tableSort.isEmpty()) {
			sql += " order by ";
			for (JsonBean entry : tableSort) {

				sql += "" + entry.getName() + " " + entry.getValue() + " ,";

			}

			sql = sql.substring(0, sql.length() - 1);

		}

		System.out.println(sql);

		return systemMapper.selectPublicItemList(sql);
	}

	@Override
	public List<Map<String, Object>> dynamicProcedure(String dynamicSql, List<JsonBean> tableSort,
			Map<String, List<SearchSubJsonBean>> searchMap) {

		System.out.println(dynamicSql);
		return systemMapper.doProcedure(dynamicSql);
	}

	@Override
	public List<Map<String, Object>> getChartData(List<ChartColumnBean> columnList, String tableName,
			List<JsonBean> tableSort, String[] tableGroup, Map<String, List<SearchSubJsonBean>> searchMap,
			List<JsonBean> deleteFlag) {
		String columndata = "";

		for (int i = 0; i < columnList.size(); i++) {

			ChartColumnBean tempColumn = columnList.get(i);

			if (null == tempColumn.getMode() || "".equals(tempColumn.getMode())) {
				columndata += columnList.get(i).getName() + ",";
			} else if ("sum".equals(tempColumn.getMode()) || "avg".equals(tempColumn.getMode())
					|| "count".equals(tempColumn.getMode()) || "max".equals(tempColumn.getMode())
					|| "min".equals(tempColumn.getMode())) {
				columndata += columnList.get(i).getMode() + "(" + columnList.get(i).getName() + ") as "
						+ columnList.get(i).getName() + ",";
			}

		}
		columndata = columndata.substring(0, columndata.length() - 1);

		String sql = "select " + columndata + " from  " + tableName + " where 1=1";

		// 删除标记暂时支持一个字段
		if (!deleteFlag.isEmpty()) {

			for (JsonBean entry : deleteFlag) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					sql += " and ";

					sql += "" + entry.getName() + " = '" + entry.getValue() + "' ";

				} else {

				}

			}

		}

		// 遍历搜索条件
		if (!searchMap.isEmpty()) {

			sql += " and ";

			for (Map.Entry<String, List<SearchSubJsonBean>> entry : searchMap.entrySet()) {

				sql += "(";
				for (SearchSubJsonBean subentry : entry.getValue()) {

					if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
						if ("dateformat".equals(subentry.getType())) {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_date('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_char('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_number('"
									+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
						} else {
							sql += "(" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' and  '" + subentry.getValue2() + "') or";
						}

					} else if ("like".equals(subentry.getName())) {

						if ("dateformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
									+ "%' or";
						}

					} else {
						if ("dateformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("stringformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else if ("numberformat".equals(subentry.getType())) {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
									+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
						} else {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' or";
						}

					}

				}
				sql = sql.substring(0, sql.length() - 2);

				sql += ")";

				sql += " and";

			}

			sql = sql.substring(0, sql.length() - 3);

		}

		if (null != tableGroup && !"".equals(tableGroup)) {
			if (tableGroup.length > 0) {
				sql += " group by ";

				for (int i = 0; i < tableGroup.length; i++) {
					sql += "" + tableGroup[i] + " ,";
				}
				sql = sql.substring(0, sql.length() - 1);
			}
		}

		if (!tableSort.isEmpty()) {
			sql += " order by ";
			for (JsonBean entry : tableSort) {

				sql += "" + entry.getName() + " " + entry.getValue() + " ,";

			}

			sql = sql.substring(0, sql.length() - 1);

		}

		System.out.println(sql);
		return systemMapper.selectPublicItemList(sql);

	}

	@Override
	public List<Map<String, Object>> getCascaderData(CascaderBean cascaderBean) {

		// 循环CascaderBean
		CascaderChild currentCascaderChild = cascaderBean.getNext();
		String column = "";
		if (cascaderBean.getColumnName().length > 0) {

			column += ", ";
			for (int i = 0; i < cascaderBean.getColumnName().length; i++) {
				column += cascaderBean.getColumnName()[i] + " ,";
			}
			column = column.substring(0, column.length() - 1);

		}

		String sql = "select " + cascaderBean.getLabel() + " as label," + cascaderBean.getValue() + " as value "
				+ column + "  from " + cascaderBean.getTableName();

		if (null != cascaderBean.getDynamicCondition() && !"".equals(cascaderBean.getDynamicCondition())) {

			sql += " where " + cascaderBean.getDynamicCondition();
		}

		System.out.println(sql);

		List<Map<String, Object>> cascaderList = new ArrayList<>();

		List<Map<String, Object>> parentList = systemMapper.selectPublicItemList(sql);

		if (null != currentCascaderChild.getMode() && !"".equals(currentCascaderChild.getMode())) {
			for (Map<String, Object> entry : parentList) {

				Map<String, Object> item = recursiveTree(entry, cascaderBean);

				cascaderList.add(item);
			}

		}

		// System.out.println(handlesql);
		return cascaderList;
	}

	private Map<String, Object> recursiveTree(Map<String, Object> entry, CascaderBean cascaderBean) {

		CascaderChild cascaderChild = cascaderBean.getNext();
		String subsql = "";
		if (null != cascaderChild.getMode() && !"".equals(cascaderChild.getMode())) {

			String column = "";
			switch (cascaderChild.getMode()) {
			case "sametable":

				if (cascaderBean.getColumnName().length > 0) {

					column += ", ";
					for (int i = 0; i < cascaderBean.getColumnName().length; i++) {
						column += cascaderBean.getColumnName()[i] + " ,";
					}
					column = column.substring(0, column.length() - 1);

				}
				subsql = "select " + cascaderBean.getLabel() + " as label," + cascaderBean.getValue() + " as value "
						+ column + "  from " + cascaderBean.getTableName() + " where ";
				// 拼接父级编号

				for (CascaderChildField cf : cascaderChild.getParentId()) {

					subsql += cf.getName2() + "= '" + entry.get(cf.getName1()) + "'";

				}

				// 判断是否需要条件拼接
				if (null != cascaderBean.getDynamicCondition() && !"".equals(cascaderBean.getDynamicCondition())) {

					subsql += " and " + cascaderBean.getDynamicCondition();
				}

				System.out.println(subsql);
				List<Map<String, Object>> parentList = systemMapper.selectPublicItemList(subsql);
				if (parentList.size() > 0) {
					List children = new ArrayList();

					for (Map<String, Object> child : parentList) {
						Map<String, Object> n = recursiveTree(child, cascaderBean); // 递归
						children.add(n);
					}
					entry.put("children", children);
				} else {
					entry.put("isLeaf", true);
				}
				break;
			case "crosstable":

				// 处理数据,循环 父类数据进行包装

				if (cascaderBean.getChild().getColumnName().length > 0) {

					column += ", ";
					for (int i = 0; i < cascaderBean.getChild().getColumnName().length; i++) {
						column += cascaderBean.getChild().getColumnName()[i] + " ,";
					}
					column = column.substring(0, column.length() - 1);

				}
				subsql = "select " + cascaderBean.getChild().getLabel() + " as label,"
						+ cascaderBean.getChild().getValue() + " as value " + column + "   from "
						+ cascaderBean.getChild().getTableName() + " where ";

				for (CascaderChildField cf : cascaderChild.getChildField()) {

					subsql += cf.getParentType() + " " + cf.getName2() + cf.getOperation() + " '"
							+ entry.get(cf.getName1()) + "'";

				}

				// 判断是否需要条件拼接
				if (null != cascaderBean.getDynamicCondition() && !"".equals(cascaderBean.getDynamicCondition())) {

					subsql += " and " + cascaderBean.getDynamicCondition();
				}

				System.out.println(subsql);
				List<Map<String, Object>> crosstableList = systemMapper.selectPublicItemList(subsql);

				if (crosstableList.size() > 0) {
					List children = new ArrayList();
					for (Map<String, Object> child : crosstableList) {

						Map<String, Object> n = recursiveTree(child, cascaderBean.getChild()); // 递归

						children.add(n);

					}
					entry.put("children", children);
				} else {
					entry.put("isLeaf", true);
				}
				break;

			default:
				break;
			}

		} else {

			entry.put("isLeaf", true);
		}

		return entry;
	}

	@Override
	public String saveTableData(String tableName, List<JsonColumnBean> primaryKey, List<JsonColumnBean> data,
			List<JsonColumnBean> SystemData, List<JsonColumnBean> deleteFlag, CsysUserView CsysUserView) {

		String sql = "insert into " + tableName + " ";
		
		String columnSql="(";
		
		String valueSql="(";
		
		String returnsequence = "";
		String insertmode = "";

		if (data.size() > 0) {
			for (JsonColumnBean jcpk : primaryKey) {
				insertmode = jcpk.getRule();
				switch (jcpk.getRule()) {
				/**
				 * 自增长
				 */
				case "autoincrement":
					// 啥也不干

					break;
				/**
				 * 通用sequence
				 */
				case "commonsequence":
					// 取sequence
					String commonsequence = commonBiz.getOracleSequence(tableName);
					returnsequence = commonsequence;
					//sql += jcpk.getName() + "='" + commonsequence + "' ,";
					
					columnSql+=jcpk.getName()+",";
					
					valueSql+="'"+commonsequence+"'"+",";
					
					break;
				/**
				 * 自定义sequence
				 */
				case "customsequence":
					// 调用存储过程，获取sequence
					String proceduresql = "call " + jcpk.getProcudure() + "('" + tableName + "')";
					List<Map<String, Object>> customsequence = systemMapper.doProcedure(proceduresql);
					returnsequence = customsequence.get(0).get("seqno").toString();
					//sql += jcpk.getName() + "='" + returnsequence + "' ,";
					
					columnSql+=jcpk.getName()+",";
					
					valueSql+="'"+returnsequence+"'"+",";
					
					break;
				// 默认自增长
				default:
					// 啥也不干
					break;
				}
			}
			// 插入数据字段
			for (JsonColumnBean jcdata : data) {
				switch (jcdata.getRule()) {
				case "encrypt":

					String md5str = Md5Encrypt.md5(jcdata.getValue());

					//sql += jcdata.getName() + "='" + md5str + "' ,";
					
					columnSql+=jcdata.getName()+",";
					
					valueSql+="'"+md5str+"'"+",";

					break;
				default:
					//sql+= jcdata.getName() + "='" + jcdata.getValue() + "' ,";
					
					if ("date".equals(jcdata.getType())) {

						columnSql += jcdata.getName() + ",";

						valueSql += "to_date('" + jcdata.getValue() + "','"+jcdata.getRule()+"')" + ",";
					} else {
						
						columnSql += jcdata.getName() + ",";

						valueSql += "'" + jcdata.getValue().replaceAll("'", "''") + "'" + ",";
					}
					
					break;

				}
			}
			// 插入系统字段
			if (SystemData.size() > 0) {
				for (JsonColumnBean jcsys : SystemData) {
					switch (jcsys.getType()) {
					case "createTime":
						//sql += jcsys.getName() + "='" + DateUtils.newTimestamp() + "' ,";
						
						columnSql+=jcsys.getName()+",";
						
						valueSql += "to_date('" + DateUtils.newTimestampStr() + "','yyyy-mm-dd hh24:mi:ss')" + ",";
						
						break;
					case "createUser":
						//sql += jcsys.getName() + "='" + CsysUserView.getCsysUserId() + "' ,";
						
						columnSql+=jcsys.getName()+",";
						
						valueSql+="'"+CsysUserView.getCsysUserId()+"'"+",";
						
						break;
					case "modifyUser":
						//sql += jcsys.getName() + "='" + CsysUserView.getCsysUserId() + "' ,";
						
						columnSql+=jcsys.getName()+",";
						
						valueSql+="'"+CsysUserView.getCsysUserId()+"'"+",";
						
						break;
					case "modifyTime":
						//sql += jcsys.getName() + "='" + DateUtils.newTimestamp() + "' ,";
						
						columnSql+=jcsys.getName()+",";
						
						valueSql += "to_date('" + DateUtils.newTimestampStr() + "','yyyy-mm-dd hh24:mi:ss')" + ",";
						
						break;

					}

				}

			}
			// 插入删除标记
			if (deleteFlag.size() > 0) {
				for (JsonColumnBean jcdf : deleteFlag) {

					//sql += jcdf.getName() + "='" + jcdf.getValue() + "' ,";
					
					columnSql+=jcdf.getName()+",";
					
					valueSql+="'"+jcdf.getValue()+"'"+",";
				}

			}

			columnSql=columnSql.substring(0, columnSql.length() - 1)+" )";
			
			valueSql=valueSql.substring(0, valueSql.length() - 1)+" )";
			
			sql = sql+columnSql+"values"+valueSql;

			System.out.println(sql);
			if ("autoincrement".equals(insertmode)) {

				/*
				 * 注意，这里仅限测试使用，正式环境请合并为一句
				 */
				systemMapper.insertReturnKey(sql).toString();

				//returnsequence = systemMapper.selectLastId("SELECT LAST_INSERT_ID()");
				
				returnsequence = systemMapper.selectLastId("select "+tableName+"_SEQ.currval  from "+tableName+" where rownum <=1");
				 

			} else {
				systemMapper.insertPublicItem(sql);
			}

		}

		return returnsequence;
	}

	@Override
	public List<Map<String, Object>> preSearchTableData(String sourceid, List<JsonColumnBean> column, String tableName,
			List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap,List<JsonBean> primaryMap, List<JsonBean> deleteFlag,
			Map<String, List<Map<String, Object>>> sourceData) {

		String columndata = "";

		if (!column.isEmpty()) {
			for (JsonColumnBean entry : column) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					switch (entry.getType()) {

					// timestamp类型需要提前转换格式
					case "timestamp":

						columndata += "to_char(" + entry.getName() + ",'yyyy-mm-dd hh24:mi:ss:ff6') as "
								+ entry.getName() + ",";
						break;
					default:
						columndata += entry.getName() + ",";
						break;
					}

				} else {

				}
			}
			if (!primaryMap.isEmpty()) {
				for(JsonBean jb:primaryMap) {
					if (null != jb.getName() && !"".equals(jb.getName())) {
						if(columndata.indexOf(jb.getName())>-1) {
							
						}else {
							columndata += jb.getName() + ",";
						}
						
					}
					
				} 
			}

		} else {

			columndata = "*,";
		}
		columndata = columndata.substring(0, columndata.length() - 1);

		String sql = "select " + columndata + " from  " + tableName + " where 1=1";

		// 删除标记暂时支持一个字段
		if (!deleteFlag.isEmpty()) {

			for (JsonBean entry : deleteFlag) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					sql += " and ";

					sql += "" + entry.getName() + " = '" + entry.getValue() + "' ";

				} else {

				}

			}

		}

		// 遍历搜索条件
		if (!searchMap.isEmpty()) {

			sql += " and ";

			for (Map.Entry<String, List<SearchSubJsonBean>> entry : searchMap.entrySet()) {

				sql += "(";
				for (SearchSubJsonBean subentry : entry.getValue()) {
					switch (subentry.getMode()) {
					case "dynamic":

						if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
							if ("dateformat".equals(subentry.getType())) {
								sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_date('"
										+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
							} else if ("stringformat".equals(subentry.getType())) {
								sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_char('"
										+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
							} else if ("numberformat".equals(subentry.getType())) {
								sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction()
										+ "') and  to_number('" + subentry.getValue2() + "','"
										+ subentry.getInstruction() + "')) or";
							} else {
								sql += "(" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
										+ "' and  '" + subentry.getValue2() + "') or";
							}

						} else if ("like".equals(subentry.getName())) {

							if ("dateformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("stringformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("numberformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
										+ "%' or";
							}

						} else {
							if ("dateformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("stringformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("numberformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else {
								// 动态值,获取与之匹配的数据源及字段。这里的数据源不支持多条记录
								List<Map<String, Object>> sourcedata = sourceData.get(subentry.getSourceid());

								sql += " " + entry.getKey() + " " + subentry.getName() + "  '"
										+ sourcedata.get(0).get(subentry.getSourceColumn()) + "' or";
							}

						}

						break;
					case "static":
						if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
							if ("dateformat".equals(subentry.getType())) {
								sql += " (" + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_date('"
										+ subentry.getValue2() + "','" + subentry.getInstruction() + "')) or";
							} else if ("stringformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') and  to_char('"
										+ subentry.getValue2() + "','" + subentry.getInstruction() + "') or";
							} else if ("numberformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction()
										+ "') and  to_number('" + subentry.getValue2() + "','"
										+ subentry.getInstruction() + "') or";
							} else {
								sql += " (" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
										+ "' and  '" + subentry.getValue2() + "') or";
							}

						} else if ("like".equals(subentry.getName())) {

							if ("dateformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("stringformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("numberformat".equals(subentry.getType())) {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else {
								sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
										+ "%' or";
							}

						} else {
							if ("dateformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_date('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("stringformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_char('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else if ("numberformat".equals(subentry.getType())) {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  to_number('"
										+ subentry.getValue1() + "','" + subentry.getInstruction() + "') or";
							} else {

								sql += " " + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
										+ "' or";
							}

						}

						break;
					default:
						break;
					}

				}
				sql = sql.substring(0, sql.length() - 2);

				sql += ")";

				sql += " and";

			}

			sql = sql.substring(0, sql.length() - 3);

		}

		if (!tableSort.isEmpty()) {
			sql += " order by ";
			for (JsonBean entry : tableSort) {

				sql += "" + entry.getName() + " " + entry.getValue() + " ,";

			}

			sql = sql.substring(0, sql.length() - 1);

		}

		System.out.println(sql);
		return systemMapper.selectPublicItemList(sql);
	}

	@Override
	public String updateTableData(String tableName, List<JsonColumnBean> primaryKey, List<JsonColumnBean> data,
			List<JsonColumnBean> SystemData, List<JsonColumnBean> deleteFlag, CsysUserView CsysUserView) {
		String sql = "update " + tableName + " set ";
		String returnsequence = "";

		if (data.size() > 0) {

			// 插入数据字段
			for (JsonColumnBean jcdata : data) {
				switch (jcdata.getRule()) {
				case "encrypt":

					String md5str = Md5Encrypt.md5(jcdata.getValue());

					sql += jcdata.getName() + "='" + md5str + "' ,";

					break;
				default:
					 
					if ("date".equals(jcdata.getType())) {
		
						sql += jcdata.getName() + "=to_date('" + jcdata.getValue() + "','"+jcdata.getRule()+"') ,";
						
					} else {
						sql += jcdata.getName() + "='" + jcdata.getValue() + "' ,";
					}
					
					break;

				}
			}
			// 插入系统字段
			if (SystemData.size() > 0) {
				for (JsonColumnBean jcsys : SystemData) {
					switch (jcsys.getType()) {
					case "createTime":
						sql += jcsys.getName() + "=to_date('" + DateUtils.newTimestampStr() + "','yyyy-mm-dd hh24:mi:ss') ,";
						break;
					case "createUser":
						sql += jcsys.getName() + "='" + CsysUserView.getCsysUserId() + "' ,";
						break;
					case "modifyUser":
						sql += jcsys.getName() + "='" + CsysUserView.getCsysUserId() + "' ,";
						break;
					case "modifyTime":
						sql += jcsys.getName() + "=to_date('" + DateUtils.newTimestampStr() + "','yyyy-mm-dd hh24:mi:ss') ,";
						break;

					}

				}

			}
			// 插入删除标记
			if (deleteFlag.size() > 0) {
				for (JsonColumnBean jcdf : deleteFlag) {

					sql += jcdf.getName() + "='" + jcdf.getValue() + "' ,";
				}

			}

			sql = sql.substring(0, sql.length() - 1);

			sql += " where 1=1 ";
			for (JsonColumnBean jcpk : primaryKey) {

				sql += " and " + jcpk.getName() + "='" + jcpk.getValue() + "' ,";

			}

			sql = sql.substring(0, sql.length() - 1);

			systemMapper.updatePublicItem(sql);

		}

		return returnsequence;
	}

	@Override
	public List<Map<String, Object>> validationData(String tableName, String mode, JsonBean currentValue,
			List<JsonCompareBean> compareValue) {

		String sql = "";

		switch (mode) {

		case "normal":

			sql += " select " + currentValue.getName() + " from " + tableName + " where 1=1";
			for (JsonCompareBean jc : compareValue) {

				sql += " and " + jc.getCompareObject() + " " + jc.getType() + " '" + currentValue.getValue() + "' ";

				if (null != jc.getAdditional() && !"".equals(jc.getAdditional())) {
					sql += " and " + jc.getAdditional();
				}

			}

			break;

		case "senior":

			for (JsonCompareBean jc : compareValue) {

				sql += jc.getCompareObject();

			}
			break;

		}

		System.out.println(sql);
		return systemMapper.selectPublicItemList(sql);

	}
}
