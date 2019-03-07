package com.company.project.biz;
import com.company.project.outer.model.CsysMenuAuthView;
import com.company.project.outer.model.CsysUser;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/26.
 */
public interface CsysMenuAuthViewBiz  {

	/**
	 * 获取数据
	 * @param CsysMenuAuthView
	 * @return
	 */
	public CsysMenuAuthView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysMenuAuthView
	 * @return
	 */
	 public List<CsysMenuAuthView> getDataSettingsByCondition(CsysMenuAuthView csysMenuAuthView);
	/**
	 * 获取数据分页
	 * @param CsysMenuAuthView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysMenuAuthView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView);
	/**
	 * 新增数据
	 * @param CsysMenuAuthView
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView);
	/**
	 * 更新
	 * @param CsysMenuAuthView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuAuthView csysMenuAuthView);
	
	/**
	 * 删除
	 * @param CsysMenuAuthView
	 * @return
	 */
	public void deleteDataSettings(String ids);
	/**
	 * 获取树形条件数据
	 * 
	 * @param CsysMenuAuthView
	 * @return
	 */
	public List<CsysMenuAuthView> getDataSettingsTree(CsysUser csysUser);
	
}
