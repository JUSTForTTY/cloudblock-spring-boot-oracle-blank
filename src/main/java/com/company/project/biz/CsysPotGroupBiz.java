package com.company.project.biz;
import com.company.project.model.CsysPotGroup;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/14.
 */
public interface CsysPotGroupBiz  {

	/**
	 * 获取数据
	 * @param CsysPotGroup
	 * @return
	 */
	public CsysPotGroup getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotGroup
	 * @return
	 */
	 public List<CsysPotGroup> getDataSettingsByCondition(CsysPotGroup csysPotGroup);
	/**
	 * 获取数据分页
	 * @param CsysPotGroup
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotGroup
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGroup csysPotGroup);
	/**
	 * 新增数据
	 * @param CsysPotGroup
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGroup csysPotGroup);
	/**
	 * 更新
	 * @param CsysPotGroup
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGroup csysPotGroup);

	/**
	 * 删除
	 * @param CsysPotGroup
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
