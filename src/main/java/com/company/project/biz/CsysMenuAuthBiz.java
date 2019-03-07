package com.company.project.biz;
import com.company.project.outer.model.CsysMenuAuth;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/14.
 */
public interface CsysMenuAuthBiz  {

	/**
	 * 获取数据
	 * @param CsysMenuAuth
	 * @return
	 */
	public CsysMenuAuth getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysMenuAuth
	 * @return
	 */
	 public List<CsysMenuAuth> getDataSettingsByCondition(CsysMenuAuth csysMenuAuth);
	/**
	 * 获取数据分页
	 * @param CsysMenuAuth
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysMenuAuth
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysMenuAuth csysMenuAuth);
	/**
	 * 新增数据
	 * @param CsysMenuAuth
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysMenuAuth csysMenuAuth);
	/**
	 * 更新
	 * @param CsysMenuAuth
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysMenuAuth csysMenuAuth);
	
	/**
	 * 删除
	 * @param CsysMenuAuth
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
