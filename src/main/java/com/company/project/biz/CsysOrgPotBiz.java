package com.company.project.biz;
import com.company.project.model.CsysOrgPot;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysOrgPotBiz  {

	/**
	 * 获取数据
	 * @param CsysOrgPot
	 * @return
	 */
	public CsysOrgPot getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysOrgPot
	 * @return
	 */
	 public List<CsysOrgPot> getDataSettingsByCondition(CsysOrgPot csysOrgPot);
	/**
	 * 获取数据分页
	 * @param CsysOrgPot
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysOrgPot
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgPot csysOrgPot);
	/**
	 * 新增数据
	 * @param CsysOrgPot
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgPot csysOrgPot);
	/**
	 * 更新
	 * @param CsysOrgPot
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgPot csysOrgPot);
	
	/**
	 * 删除
	 * @param CsysOrgPot
	 * @return
	 */
	public void deleteDataSettings(String ids);
	/**
	 * 获取树形数据
	 * @param CsysOrgPot
	 * @return
	 */
	 public List<CsysOrgPot> getDataSettingsTree(CsysOrgPot csysOrgPot);
	
}
