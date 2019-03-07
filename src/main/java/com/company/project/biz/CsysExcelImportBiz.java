package com.company.project.biz;
import com.company.project.outer.model.CsysExcelImport;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysExcelImportBiz  {

	/**
	 * 获取数据
	 * @param CsysExcelImport
	 * @return
	 */
	public CsysExcelImport getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysExcelImport
	 * @return
	 */
	 public List<CsysExcelImport> getDataSettingsByCondition(CsysExcelImport csysExcelImport);
	/**
	 * 获取数据分页
	 * @param CsysExcelImport
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysExcelImport
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysExcelImport csysExcelImport);
	/**
	 * 新增数据
	 * @param CsysExcelImport
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysExcelImport csysExcelImport);
	/**
	 * 更新
	 * @param CsysExcelImport
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysExcelImport csysExcelImport);
	
	/**
	 * 删除
	 * @param CsysExcelImport
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
