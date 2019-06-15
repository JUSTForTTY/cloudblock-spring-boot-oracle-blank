package com.company.project.biz;
import com.company.project.model.CsysPotGr;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/14.
 */
public interface CsysPotGrBiz  {

	/**
	 * 获取数据
	 * @param CsysPotGr
	 * @return
	 */
	public CsysPotGr getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotGr
	 * @return
	 */
	 public List<CsysPotGr> getDataSettingsByCondition(CsysPotGr csysPotGr);
	/**
	 * 获取数据分页
	 * @param CsysPotGr
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotGr
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGr csysPotGr);
	/**
	 * 新增数据
	 * @param CsysPotGr
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGr csysPotGr);
	/**
	 * 更新
	 * @param CsysPotGr
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGr csysPotGr);

	/**
	 * 删除
	 * @param CsysPotGr
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
