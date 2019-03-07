package com.company.project.outer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.company.project.core.bean.CascaderResultBean;

public interface SystemMapper {

	public List selectPublicItemList(@Param(value = "sqlStr") String sqlStr);
	
	public  Integer insertReturnKey(@Param(value = "sqlStr") String sqlStr);
	
	public void insertPublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public void updatePublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public void deletePublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public List<Map<String, Object>> doProcedure(@Param(value = "sqlStr") String sqlStr);
	
	public List<CascaderResultBean> selectCascaderItemList(@Param(value = "sqlStr") String sqlStr);
	
	public String selectLastId(@Param(value = "sqlStr") String sqlStr);
	
	
}
