package com.company.project.biz;
import com.company.project.model.CsysOrgAuth;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysOrgAuthBiz  {

	/**
	 * 获取数据
	 * @param CsysOrgAuth
	 * @return
	 */
	public CsysOrgAuth getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysOrgAuth
	 * @return
	 */
	 public List<CsysOrgAuth> getDataSettingsByCondition(CsysOrgAuth csysOrgAuth);
	/**
	 * 获取数据分页
	 * @param CsysOrgAuth
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysOrgAuth
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgAuth csysOrgAuth);
	/**
	 * 新增数据
	 * @param CsysOrgAuth
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgAuth csysOrgAuth);
	/**
	 * 更新
	 * @param CsysOrgAuth
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgAuth csysOrgAuth);
	
	/**
	 * 删除
	 * @param CsysOrgAuth
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
