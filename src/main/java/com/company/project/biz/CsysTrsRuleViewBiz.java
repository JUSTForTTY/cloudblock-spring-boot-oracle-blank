package com.company.project.biz;
import com.company.project.model.CsysTrsRuleView;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/07/04.
 */
public interface CsysTrsRuleViewBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsRuleView
	 * @return
	 */
	public CsysTrsRuleView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsRuleView
	 * @return
	 */
	 public List<CsysTrsRuleView> getDataSettingsByCondition(CsysTrsRuleView csysTrsRuleView);
	/**
	 * 获取数据分页
	 * @param CsysTrsRuleView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsRuleView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView);
	/**
	 * 新增数据
	 * @param CsysTrsRuleView
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView);
	/**
	 * 更新
	 * @param CsysTrsRuleView
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRuleView csysTrsRuleView);

	/**
	 * 删除
	 * @param CsysTrsRuleView
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
