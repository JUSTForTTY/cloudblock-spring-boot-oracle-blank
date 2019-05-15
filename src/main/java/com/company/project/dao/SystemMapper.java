package com.company.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.company.project.core.bean.CascaderResultBean;
import com.company.project.core.bean.JsonBean;

public interface SystemMapper {

	public List selectPublicItemList(@Param(value = "sqlStr") String sqlStr);
	
	public  Integer insertReturnKey(@Param(value = "sqlStr") String sqlStr);
	
	public void insertPublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public void updatePublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public void deletePublicItem(@Param(value = "sqlStr") String sqlStr);
	
	public void doProcedure(@Param(value = "procudure") Map<String, Object> procudure,@Param(value = "params") List<JsonBean> params);
	
	public List<CascaderResultBean> selectCascaderItemList(@Param(value = "sqlStr") String sqlStr);
	
	public String selectLastId(@Param(value = "sqlStr") String sqlStr);
	
	
}
