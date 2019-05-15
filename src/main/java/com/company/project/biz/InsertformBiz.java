package com.company.project.biz;
import com.company.project.model.CsysUserView;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.company.project.core.bean.ResultBean;

/**
 * Created by sxs on 2019/04/24.
 */
public interface InsertformBiz {

	/**
	 * 新增表单数据
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
     ResultBean saveFormData000515(Map<String, String> map, List<CsysUserView> userViewList);

	/**
	 * 更新表单数据
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void updateFormData000515(Map<String, String> map, CsysUserView csysUserView);

	/**
	 * 新增表单数据
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
     ResultBean saveFormData000514(Map<String, String> map, List<CsysUserView> userViewList);

	/**
	 * 更新表单数据
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void updateFormData000514(Map<String, String> map, CsysUserView csysUserView);
	
}
