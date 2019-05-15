package com.company.project.biz;
import com.company.project.model.CsysUserView;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.company.project.core.bean.SearchTableBean;
import com.company.project.core.bean.ResultBean;

/**
 * Created by sxs on 2019/04/24.
 */
public interface WorkflowmanagerBiz {

	/**
	 * 获取数据
	 *
     * @param csysUserView
     * @param searchTableBean
	 * @return
	 */
	 ResultBean getTableData000859(CsysUserView csysUserView, SearchTableBean searchTableBean);

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
