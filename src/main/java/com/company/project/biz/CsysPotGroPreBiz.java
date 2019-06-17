package com.company.project.biz;
import com.company.project.model.CsysPotGroPre;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/14.
 */
public interface CsysPotGroPreBiz  {

	/**
	 * 获取数据
	 * @param CsysPotGroPre
	 * @return
	 */
	public CsysPotGroPre getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotGroPre
	 * @return
	 */
	 public List<CsysPotGroPre> getDataSettingsByCondition(CsysPotGroPre csysPotGroPre);
	/**
	 * 获取数据分页
	 * @param CsysPotGroPre
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotGroPre
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotGroPre csysPotGroPre);
	/**
	 * 新增数据
	 * @param CsysPotGroPre
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPotGroPre csysPotGroPre);
	/**
	 * 更新
	 * @param CsysPotGroPre
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPotGroPre csysPotGroPre);

	/**
	 * 删除
	 * @param CsysPotGroPre
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
