package com.company.project.biz;
import com.company.project.outer.model.CsysTrsCcAuth;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysTrsCcAuthBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public CsysTrsCcAuth getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsCcAuth
	 * @return
	 */
	 public List<CsysTrsCcAuth> getDataSettingsByCondition(CsysTrsCcAuth csysTrsCcAuth);
	/**
	 * 获取数据分页
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth);
	/**
	 * 新增数据
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth);
	/**
	 * 更新
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsCcAuth csysTrsCcAuth);
	
	/**
	 * 删除
	 * @param CsysTrsCcAuth
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
