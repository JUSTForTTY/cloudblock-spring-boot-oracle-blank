package com.company.project.biz;
import com.company.project.outer.model.CsysOrgPotAuth;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysOrgPotAuthBiz  {

	/**
	 * 获取数据
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public CsysOrgPotAuth getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysOrgPotAuth
	 * @return
	 */
	 public List<CsysOrgPotAuth> getDataSettingsByCondition(CsysOrgPotAuth csysOrgPotAuth);
	/**
	 * 获取数据分页
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth);
	/**
	 * 新增数据
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth);
	/**
	 * 更新
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgPotAuth csysOrgPotAuth);
	
	/**
	 * 删除
	 * @param CsysOrgPotAuth
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
