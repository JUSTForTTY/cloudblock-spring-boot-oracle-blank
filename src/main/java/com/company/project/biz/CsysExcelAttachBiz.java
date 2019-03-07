package com.company.project.biz;
import com.company.project.outer.model.CsysExcelAttach;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysExcelAttachBiz  {

	/**
	 * 获取数据
	 * @param CsysExcelAttach
	 * @return
	 */
	public CsysExcelAttach getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysExcelAttach
	 * @return
	 */
	 public List<CsysExcelAttach> getDataSettingsByCondition(CsysExcelAttach csysExcelAttach);
	/**
	 * 获取数据分页
	 * @param CsysExcelAttach
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysExcelAttach
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysExcelAttach csysExcelAttach);
	/**
	 * 新增数据
	 * @param CsysExcelAttach
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysExcelAttach csysExcelAttach);
	/**
	 * 更新
	 * @param CsysExcelAttach
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysExcelAttach csysExcelAttach);
	
	/**
	 * 删除
	 * @param CsysExcelAttach
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
