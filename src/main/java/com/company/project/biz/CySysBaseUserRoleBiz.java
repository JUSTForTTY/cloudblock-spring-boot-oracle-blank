package com.company.project.biz;
import com.company.project.model.CySysBaseUserRole;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/27.
 */
public interface CySysBaseUserRoleBiz  {

	/**
	 * 获取数据
	 * @param CySysBaseUserRole
	 * @return
	 */
	public CySysBaseUserRole getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBaseUserRole
	 * @return
	 */
	 public List<CySysBaseUserRole> getDataSettingsByCondition(CySysBaseUserRole cySysBaseUserRole);
	/**
	 * 获取数据分页
	 * @param CySysBaseUserRole
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBaseUserRole
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole);
	/**
	 * 新增数据
	 * @param CySysBaseUserRole
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole);
	/**
	 * 更新
	 * @param CySysBaseUserRole
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserRole cySysBaseUserRole);
	
	/**
	 * 删除
	 * @param CySysBaseUserRole
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
