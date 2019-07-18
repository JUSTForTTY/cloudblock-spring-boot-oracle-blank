package com.company.project.dao;

import com.company.project.core.bean.DynamicSql;
import com.company.project.core.mapper.CommonMapper;

public interface DynamicSqlMapper extends CommonMapper<DynamicSql> {
	void insertData(DynamicSql dynamicSql);
	
	void updateData(DynamicSql dynamicSql);
}
