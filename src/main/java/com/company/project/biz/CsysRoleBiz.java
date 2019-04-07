package com.company.project.biz;
import com.company.project.model.CsysRole;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/12.
 */
public interface CsysRoleBiz  {

	/**
	 * 获取数据
	 * @param CsysRole
	 * @return
	 */
	public CsysRole getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysRole
	 * @return
	 */
	 public List<CsysRole> getDataSettingsByCondition(CsysRole csysRole);
	/**
	 * 获取数据分页
	 * @param CsysRole
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysRole
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysRole csysRole);
	/**
	 * 新增数据
	 * @param CsysRole
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysRole csysRole);
	/**
	 * 更新
	 * @param CsysRole
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysRole csysRole);
	
	/**
	 * 删除
	 * @param CsysRole
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
