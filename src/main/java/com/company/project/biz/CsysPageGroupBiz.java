package com.company.project.biz;
import com.company.project.model.CsysPageGroup;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/07/04.
 */
public interface CsysPageGroupBiz  {

	/**
	 * 获取数据
	 * @param CsysPageGroup
	 * @return
	 */
	public CsysPageGroup getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPageGroup
	 * @return
	 */
	 public List<CsysPageGroup> getDataSettingsByCondition(CsysPageGroup csysPageGroup);
	/**
	 * 获取数据分页
	 * @param CsysPageGroup
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPageGroup
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPageGroup csysPageGroup);
	/**
	 * 新增数据
	 * @param CsysPageGroup
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPageGroup csysPageGroup);
	/**
	 * 更新
	 * @param CsysPageGroup
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPageGroup csysPageGroup);

	/**
	 * 删除
	 * @param CsysPageGroup
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
