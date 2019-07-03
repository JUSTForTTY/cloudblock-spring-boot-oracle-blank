package com.company.project.biz;
import com.company.project.model.CsysPotStyle;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/15.
 */
public interface CsysPotStyleBiz  {

	/**
	 * 获取数据
	 * @param CsysPotStyle
	 * @return
	 */
	public CsysPotStyle getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotStyle
	 * @return
	 */
	 public List<CsysPotStyle> getDataSettingsByCondition(CsysPotStyle csysPotStyle);
	/**
	 * 获取数据分页
	 * @param CsysPotStyle
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotStyle
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotStyle csysPotStyle);
	/**
	 * 根据特殊条件获取数据分页
	 * @param CsysPotStyle
	 * @return
	 */
	public PageInfo getSearchPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotStyle csysPotStyle);
	/**
	 * 新增数据
	 * @param CsysPotStyle
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPotStyle csysPotStyle);
	/**
	 * 更新
	 * @param CsysPotStyle
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPotStyle csysPotStyle);

	/**
	 * 删除
	 * @param CsysPotStyle
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
