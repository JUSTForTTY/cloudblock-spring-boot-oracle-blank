package com.company.project.biz;
import com.company.project.model.CsysTrsLog;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/24.
 */
public interface CsysTrsLogBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsLog
	 * @return
	 */
	public CsysTrsLog getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsLog
	 * @return
	 */
	 public List<CsysTrsLog> getDataSettingsByCondition(CsysTrsLog csysTrsLog);
	/**
	 * 获取数据分页
	 * @param CsysTrsLog
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsLog
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsLog csysTrsLog);
	/**
	 * 新增数据
	 * @param CsysTrsLog
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsLog csysTrsLog);
	/**
	 * 更新
	 * @param CsysTrsLog
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsLog csysTrsLog);
	
	/**
	 * 删除
	 * @param CsysTrsLog
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
