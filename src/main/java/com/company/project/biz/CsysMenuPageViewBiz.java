package com.company.project.biz;
import com.company.project.outer.model.CsysMenuPageView;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysMenuPageViewBiz  {

	/**
	 * 获取数据
	 * @param CsysMenuPageView
	 * @return
	 */
	public CsysMenuPageView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysMenuPageView
	 * @return
	 */
	 public List<CsysMenuPageView> getDataSettingsByCondition(CsysMenuPageView csysMenuPageView);
	/**
	 * 获取数据分页
	 * @param CsysMenuPageView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysMenuPageView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuPageView csysMenuPageView);
	/**
	 * 新增数据
	 * @param CsysMenuPageView
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuPageView csysMenuPageView);
	/**
	 * 更新
	 * @param CsysMenuPageView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuPageView csysMenuPageView);
	
	/**
	 * 删除
	 * @param CsysMenuPageView
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
