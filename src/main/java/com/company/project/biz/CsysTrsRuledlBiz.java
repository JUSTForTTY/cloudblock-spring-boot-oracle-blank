package com.company.project.biz;
import com.company.project.model.CsysTrsRuledl;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/07/04.
 */
public interface CsysTrsRuledlBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsRuledl
	 * @return
	 */
	public CsysTrsRuledl getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsRuledl
	 * @return
	 */
	 public List<CsysTrsRuledl> getDataSettingsByCondition(CsysTrsRuledl csysTrsRuledl);
	/**
	 * 获取数据分页
	 * @param CsysTrsRuledl
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsRuledl
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl);
	/**
	 * 新增数据
	 * @param CsysTrsRuledl
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl);
	/**
	 * 更新
	 * @param CsysTrsRuledl
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysTrsRuledl csysTrsRuledl);

	/**
	 * 删除
	 * @param CsysTrsRuledl
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
