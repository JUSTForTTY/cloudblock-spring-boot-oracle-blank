package com.company.project.dao;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.company.project.core.bean.SearchTableBean;

/**
 * Created by sxs on 2019/04/24.
 */
public interface WorkflowmanagerMapper {

    List<Map<String, Object>> getTableData000859(SearchTableBean searchTableBean);

	void logicalDeleteTableData000859(Map<String, String> map);

	void physicalDeleteTableData000859(Map<String, String> map);
	
}
