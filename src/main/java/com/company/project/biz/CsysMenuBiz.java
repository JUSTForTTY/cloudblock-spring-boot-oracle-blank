package com.company.project.biz;
import com.company.project.outer.model.CsysMenu;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysMenuBiz  {

	/**
	 * 获取数据
	 * @param CsysMenu
	 * @return
	 */
	public CsysMenu getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysMenu
	 * @return
	 */
	 public List<CsysMenu> getDataSettingsByCondition(CsysMenu csysMenu);
	/**
	 * 获取数据分页
	 * @param CsysMenu
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysMenu
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenu csysMenu);
	/**
	 * 新增数据
	 * @param CsysMenu
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysMenu csysMenu);
	/**
	 * 更新
	 * @param CsysMenu
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysMenu csysMenu);
	
	/**
	 * 删除
	 * @param CsysMenu
	 * @return
	 */
	public void deleteDataSettings(String ids);
	/**
	 * 获取tree数据
	 * @param CsysMenu
	 * @return
	 */
	 public List<CsysMenu> getDataSettingsTree(CsysMenu csysMenu);
	
}
