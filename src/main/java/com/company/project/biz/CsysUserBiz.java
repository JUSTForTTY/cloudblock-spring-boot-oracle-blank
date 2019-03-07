package com.company.project.biz;
import com.company.project.outer.model.CsysUser;
import com.company.project.outer.model.CsysUserView;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysUserBiz  {

	/**
	 * 获取数据
	 * @param CsysUser
	 * @return
	 */
	public CsysUser getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysUser
	 * @return
	 */
	 public List<CsysUser> getDataSettingsByCondition(CsysUser csysUser);
	/**
	 * 获取数据分页
	 * @param CsysUser
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysUser
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUser csysUser);
	/**
	 * 新增数据
	 * @param CsysUser
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysUser csysUser);
	/**
	 * 更新
	 * @param CsysUser
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysUser csysUser);
	
	/**
	 * 删除
	 * @param CsysUser
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
