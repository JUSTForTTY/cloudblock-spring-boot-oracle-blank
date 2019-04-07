package com.company.project.biz;
import com.company.project.model.CsysOrgStruce;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysOrgStruceBiz  {

	/**
	 * 获取数据
	 * @param CsysOrgStruce
	 * @return
	 */
	public CsysOrgStruce getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysOrgStruce
	 * @return
	 */
	 public List<CsysOrgStruce> getDataSettingsByCondition(CsysOrgStruce csysOrgStruce);
	/**
	 * 获取数据分页
	 * @param CsysOrgStruce
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysOrgStruce
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOrgStruce csysOrgStruce);
	/**
	 * 新增数据
	 * @param CsysOrgStruce
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysOrgStruce csysOrgStruce);
	/**
	 * 更新
	 * @param CsysOrgStruce
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysOrgStruce csysOrgStruce);
	
	/**
	 * 删除
	 * @param CsysOrgStruce
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
