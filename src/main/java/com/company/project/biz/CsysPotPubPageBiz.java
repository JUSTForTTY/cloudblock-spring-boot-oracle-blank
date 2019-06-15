package com.company.project.biz;
import com.company.project.model.CsysPotPubPage;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/15.
 */
public interface CsysPotPubPageBiz  {

	/**
	 * 获取数据
	 * @param CsysPotPubPage
	 * @return
	 */
	public CsysPotPubPage getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotPubPage
	 * @return
	 */
	 public List<CsysPotPubPage> getDataSettingsByCondition(CsysPotPubPage csysPotPubPage);
	/**
	 * 获取数据分页
	 * @param CsysPotPubPage
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotPubPage
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysPotPubPage csysPotPubPage);
	/**
	 * 新增数据
	 * @param CsysPotPubPage
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysPotPubPage csysPotPubPage);
	/**
	 * 更新
	 * @param CsysPotPubPage
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysPotPubPage csysPotPubPage);

	/**
	 * 删除
	 * @param CsysPotPubPage
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
