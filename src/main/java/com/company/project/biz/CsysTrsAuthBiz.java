package com.company.project.biz;
import com.company.project.model.CsysTrsAuth;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysTrsAuthBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsAuth
	 * @return
	 */
	public CsysTrsAuth getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsAuth
	 * @return
	 */
	 public List<CsysTrsAuth> getDataSettingsByCondition(CsysTrsAuth csysTrsAuth);
	/**
	 * 获取数据分页
	 * @param CsysTrsAuth
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsAuth
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsAuth csysTrsAuth);
	/**
	 * 新增数据
	 * @param CsysTrsAuth
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsAuth csysTrsAuth);
	/**
	 * 更新
	 * @param CsysTrsAuth
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsAuth csysTrsAuth);
	
	/**
	 * 删除
	 * @param CsysTrsAuth
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
