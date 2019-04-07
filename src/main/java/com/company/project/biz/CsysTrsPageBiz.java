package com.company.project.biz;
import com.company.project.model.CsysTrsPage;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysTrsPageBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsPage
	 * @return
	 */
	public CsysTrsPage getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsPage
	 * @return
	 */
	 public List<CsysTrsPage> getDataSettingsByCondition(CsysTrsPage csysTrsPage);
	/**
	 * 获取数据分页
	 * @param CsysTrsPage
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsPage
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsPage csysTrsPage);
	/**
	 * 新增数据
	 * @param CsysTrsPage
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsPage csysTrsPage);
	/**
	 * 更新
	 * @param CsysTrsPage
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsPage csysTrsPage);
	
	/**
	 * 删除
	 * @param CsysTrsPage
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
