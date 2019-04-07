package com.company.project.biz;
import com.company.project.model.CsysPageLayout;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPageLayoutBiz  {

	/**
	 * 获取数据
	 * @param CsysPageLayout
	 * @return
	 */
	public CsysPageLayout getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPageLayout
	 * @return
	 */
	 public List<CsysPageLayout> getDataSettingsByCondition(CsysPageLayout csysPageLayout);
	/**
	 * 获取数据分页
	 * @param CsysPageLayout
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPageLayout
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPageLayout csysPageLayout);
	/**
	 * 新增数据
	 * @param CsysPageLayout
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPageLayout csysPageLayout);
	/**
	 * 更新
	 * @param CsysPageLayout
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPageLayout csysPageLayout);
	
	/**
	 * 删除
	 * @param CsysPageLayout
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
