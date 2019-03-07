package com.company.project.core.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.biz.OperateDataBaseBiz;
import com.company.project.core.bean.DataBaseBean;
import com.company.project.core.bean.DataTableBean;
import com.company.project.core.bean.updateTableBean;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;

/**
 * 
 * 
 * 查询表 新增
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/database")
public class OpreateDataBase {

	@Resource
	private OperateDataBaseBiz operateDataBaseBiz;

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthUtils authUtils;

	@PostMapping
	public Result selectDatebase(@RequestBody DataBaseBean dataBaseBean) {

		Map<String, String> param = new HashMap<>();
		try {
			List<T> lst = operateDataBaseBiz.getAllTableShemel(dataBaseBean);

			return ResultGenerator.genSuccessResult(lst, param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	@RequestMapping("/selectData")
	@PostMapping
	public Result selectDate(@RequestBody DataBaseBean dataBaseBean) {

		Map<String, String> param = new HashMap<>();
		try {
			List<T> lst = operateDataBaseBiz.getAllData(dataBaseBean);

			return ResultGenerator.genSuccessResult(lst, param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	/*
	 * 
	 * 根据数据库名 和表名查询所有字段信息
	 * 
	 * 
	 */
	@RequestMapping("/selectTableColumn")
	@PostMapping
	public Result selectTableColumn(@RequestBody DataBaseBean dataBaseBean) {

		Map<String, String> param = new HashMap<>();
		try {
			List<T> lst = operateDataBaseBiz.getAllColumnData(dataBaseBean);

			return ResultGenerator.genSuccessResult(lst, param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	/**
	 * 
	 * 
	 * 根据数据库名查询 根据表名查询 判断是否需要表名
	 * 
	 * @param dataTableBean
	 * @return
	 */
	@RequestMapping("/selectTableColumnField")
	@PostMapping
	public Result selectTableColumnField(@RequestBody DataBaseBean dataBaseBean) {

		Map<String, String> param = new HashMap<>();
		try {
			List<T> lst = operateDataBaseBiz.getAllColumnField(dataBaseBean);

			return ResultGenerator.genSuccessResult(lst, param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	// 创建表
	@RequestMapping("/create")
	@PostMapping
	public Result createTable(@RequestBody DataTableBean dataTableBean) {

		Map<String, String> param = new HashMap<>();
		try {
			operateDataBaseBiz.createTable(dataTableBean);

			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	// 修改表
	@RequestMapping("/update")
	@PostMapping
	public Result updateTable(@RequestBody updateTableBean dataTableBean) {

		Map<String, String> param = new HashMap<>();
		try {
			operateDataBaseBiz.updateTable(dataTableBean);

			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	// 修改表
	@RequestMapping("/updateColumn")
	@PostMapping
	public Result updateColumn(@RequestBody updateTableBean dataTableBean) {

		Map<String, String> param = new HashMap<>();
		// try {
		operateDataBaseBiz.updateColumn(dataTableBean);

		return ResultGenerator.genSuccessResult(param);
		// } //catch (Exception e) {
		// return ResultGenerator.genServerErrorResult(param);
		// }
	}

	// 修改列类型
	@RequestMapping("/updateColumnField")
	@PostMapping
	public Result updateColumnField(@RequestBody updateTableBean dataTableBean) {

		Map<String, String> param = new HashMap<>();
		// try {
		operateDataBaseBiz.updateColumnField(dataTableBean);

		return ResultGenerator.genSuccessResult(param);
		// } catch (Exception e) {
		// return ResultGenerator.genServerErrorResult(param);
	}

	// }

	// 删除表
	@RequestMapping("/table/{tableName}")
	@DeleteMapping
	public Result deleteTable(@PathVariable String tableName) {

		Map<String, String> param = new HashMap<>();
		DataTableBean dataTableBean = new DataTableBean();
		dataTableBean.setTableName(tableName);
		try {
			operateDataBaseBiz.deleteTable(dataTableBean);

			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}

	}

	// 删除表
	@RequestMapping("/column/{tableName}/{field}")
	@DeleteMapping
	public Result deleteColumn(@PathVariable String tableName, @PathVariable String field) {

		Map<String, String> param = new HashMap<>();
		updateTableBean updateTableBean1 = new updateTableBean();
		updateTableBean1.setOldTableName(tableName);
		updateTableBean1.setField(field);
		try {
			operateDataBaseBiz.deleteColumn(updateTableBean1);

			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}
	}

	// 修改引擎

	@RequestMapping("/updateEngine")
	@PostMapping
	public Result updateEngine(@RequestBody DataTableBean dataTableBean) {

		Map<String, String> param = new HashMap<>();
		// try {
		operateDataBaseBiz.updateEngine(dataTableBean);

		return ResultGenerator.genSuccessResult(param);
		// } catch (Exception e) {
		// return ResultGenerator.genServerErrorResult(param);
	}

	// }

	@GetMapping(value = "/oracle/gettable")
	public Result getOralceTable() throws Exception {
		Map<String, String> param = new HashMap<>();
		try {
			List<Map<String, String>> list = operateDataBaseBiz.getOralceTable();
			return ResultGenerator.genSuccessResult(list, param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}
	}

	@GetMapping(value = "/oracle/registertable")
	public Result registerOracleTable() throws Exception {
		Map<String, String> param = new HashMap<>();
		try {
			operateDataBaseBiz.registerOracleTable();
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}
	}

	@PostMapping(value = "/oracle/tablefield")
	public Result registerOracleTableFieled(@RequestBody DataBaseBean dataBaseBean) throws Exception {
		Map<String, String> param = new HashMap<>();
		try {
			operateDataBaseBiz.registerOracleTableField(dataBaseBean.getTableNameArray());
			return ResultGenerator.genSuccessResult(param);
		} catch (Exception e) {
			return ResultGenerator.genServerErrorResult(param);
		}
	}
}
