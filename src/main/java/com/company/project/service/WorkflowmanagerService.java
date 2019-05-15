package com.company.project.service;
import com.company.project.model.CsysUserView;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.company.project.core.bean.SearchTableBean;

/**
 * Created by sxs on 2019/04/24.
 */
public interface WorkflowmanagerService {

	/**
	 * 获取表格数据信息
	 * 
	 * @param searchTableBean
	 * @param csysUserView
	 * @return
	 */
	 List<Map<String, Object>> getTableData000859(SearchTableBean searchTableBean,CsysUserView csysUserView);

	/**
	 * 删除数据
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void logicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView);

	/**
	 * 物理删除
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void physicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView);


}