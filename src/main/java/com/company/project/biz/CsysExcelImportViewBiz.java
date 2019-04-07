package com.company.project.biz;

import com.company.project.model.CsysExcelImportView;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/03/05.
 */
public interface CsysExcelImportViewBiz {

	/**
	 * 获取数据
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public CsysExcelImportView getDataSettings(String id);

	/**
	 * 获取条件数据
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public List<CsysExcelImportView> getDataSettingsByCondition(CsysExcelImportView csysExcelImportView);

	/**
	 * 获取数据分页
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page, Integer size);

	/**
	 * 根据条件获取数据分页
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page, Integer size, CsysUserView baseUserView,
			CsysExcelImportView csysExcelImportView);

	/**
	 * 新增数据
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView, CsysExcelImportView csysExcelImportView);

	/**
	 * 更新
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView, CsysExcelImportView csysExcelImportView);

	/**
	 * 删除
	 * 
	 * @param CsysExcelImportView
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
