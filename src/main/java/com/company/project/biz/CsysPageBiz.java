package com.company.project.biz;
import com.company.project.outer.model.CsysPage;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPageBiz  {

	/**
	 * 获取数据
	 * @param CsysPage
	 * @return
	 */
	public CsysPage getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPage
	 * @return
	 */
	 public List<CsysPage> getDataSettingsByCondition(CsysPage csysPage);
	/**
	 * 获取数据分页
	 * @param CsysPage
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPage
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPage csysPage);
	/**
	 * 新增数据
	 * @param CsysPage
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPage csysPage);
	/**
	 * 更新
	 * @param CsysPage
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPage csysPage);
	
	/**
	 * 删除
	 * @param CsysPage
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
