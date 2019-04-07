package com.company.project.biz;
import com.company.project.model.CsysUserRole;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysUserRoleBiz  {

	/**
	 * 获取数据
	 * @param CsysUserRole
	 * @return
	 */
	public CsysUserRole getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysUserRole
	 * @return
	 */
	 public List<CsysUserRole> getDataSettingsByCondition(CsysUserRole csysUserRole);
	/**
	 * 获取数据分页
	 * @param CsysUserRole
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysUserRole
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserRole csysUserRole);
	/**
	 * 新增数据
	 * @param CsysUserRole
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysUserRole csysUserRole);
	/**
	 * 更新
	 * @param CsysUserRole
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysUserRole csysUserRole);
	
	/**
	 * 删除
	 * @param CsysUserRole
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
