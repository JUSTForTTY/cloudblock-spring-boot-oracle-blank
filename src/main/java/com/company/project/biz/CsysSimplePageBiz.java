package com.company.project.biz;
import com.company.project.model.CsysSimplePage;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/14.
 */
public interface CsysSimplePageBiz  {

	/**
	 * 获取数据
	 * @param CsysSimplePage
	 * @return
	 */
	public CsysSimplePage getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysSimplePage
	 * @return
	 */
	 public List<CsysSimplePage> getDataSettingsByCondition(CsysSimplePage csysPage);
	/**
	 * 获取数据分页
	 * @param CsysSimplePage
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysSimplePage
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysSimplePage csysPage);
	/**
	 * 新增数据
	 * @param CsysSimplePage
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysSimplePage csysPage);
	/**
	 * 更新
	 * @param CsysSimplePage
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysSimplePage csysPage);

	/**
	 * 删除
	 * @param CsysSimplePage
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
