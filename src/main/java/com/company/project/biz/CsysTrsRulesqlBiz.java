package com.company.project.biz;
import com.company.project.model.CsysTrsRulesql;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/07/05.
 */
public interface CsysTrsRulesqlBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsRulesql
	 * @return
	 */
	public CsysTrsRulesql getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsRulesql
	 * @return
	 */
	 public List<CsysTrsRulesql> getDataSettingsByCondition(CsysTrsRulesql csysTrsRulesql);
	/**
	 * 获取数据分页
	 * @param CsysTrsRulesql
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsRulesql
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql);
	/**
	 * 新增数据
	 * @param CsysTrsRulesql
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql);
	/**
	 * 更新
	 * @param CsysTrsRulesql
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRulesql csysTrsRulesql);

	/**
	 * 删除
	 * @param CsysTrsRulesql
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
