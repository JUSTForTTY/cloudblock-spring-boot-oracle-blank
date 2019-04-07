package com.company.project.biz;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysUserViewBiz  {

	/**
	 * 获取数据
	 * @param CsysUserView
	 * @return
	 */
	public CsysUserView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysUserView
	 * @return
	 */
	 public List<CsysUserView> getDataSettingsByCondition(CsysUserView csysUserView);
	/**
	 * 获取数据分页
	 * @param CsysUserView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysUserView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserView csysUserView);
	/**
	 * 新增数据
	 * @param CsysUserView
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysUserView csysUserView);
	/**
	 * 更新
	 * @param CsysUserView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysUserView csysUserView);
	
	/**
	 * 删除
	 * @param CsysUserView
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
