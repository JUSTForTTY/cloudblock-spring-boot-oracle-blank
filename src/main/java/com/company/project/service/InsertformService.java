package com.company.project.service;
import com.company.project.model.CsysUserView;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by sxs on 2019/04/24.
 */
public interface InsertformService {

	/**
	 * 新增表单信息
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
	 String saveFormData000515(Map<String, String> map, List<CsysUserView> userViewList);

	
	/**
	 * 更新表单信息
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void updateFormData000515(Map<String, String> map, CsysUserView csysUserView);

	/**
	 * 新增表单信息
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
	 String saveFormData000514(Map<String, String> map, List<CsysUserView> userViewList);

	
	/**
	 * 更新表单信息
	 * 
	 * @param map
	 * @param csysUserView
	 */
	 void updateFormData000514(Map<String, String> map, CsysUserView csysUserView);

}