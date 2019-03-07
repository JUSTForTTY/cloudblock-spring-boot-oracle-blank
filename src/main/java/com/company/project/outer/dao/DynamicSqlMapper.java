package com.company.project.outer.dao;

import com.company.project.core.bean.DynamicSql;
import com.company.project.core.mapper.CommonMapper;

public interface DynamicSqlMapper extends CommonMapper<DynamicSql> {
	void insertData(DynamicSql dynamicSql);
}
