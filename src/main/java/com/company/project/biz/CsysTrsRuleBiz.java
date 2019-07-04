package com.company.project.biz;
import com.company.project.model.CsysTrsRule;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/07/04.
 */
public interface CsysTrsRuleBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsRule
	 * @return
	 */
	public CsysTrsRule getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsRule
	 * @return
	 */
	 public List<CsysTrsRule> getDataSettingsByCondition(CsysTrsRule csysTrsRule);
	/**
	 * 获取数据分页
	 * @param CsysTrsRule
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsRule
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRule csysTrsRule);
	/**
	 * 新增数据
	 * @param CsysTrsRule
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRule csysTrsRule);
	/**
	 * 更新
	 * @param CsysTrsRule
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRule csysTrsRule);

	/**
	 * 删除
	 * @param CsysTrsRule
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
