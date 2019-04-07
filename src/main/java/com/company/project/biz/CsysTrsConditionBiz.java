package com.company.project.biz;
import com.company.project.model.CsysTrsCondition;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysTrsConditionBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsCondition
	 * @return
	 */
	public CsysTrsCondition getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsCondition
	 * @return
	 */
	 public List<CsysTrsCondition> getDataSettingsByCondition(CsysTrsCondition csysTrsCondition);
	/**
	 * 获取数据分页
	 * @param CsysTrsCondition
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsCondition
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsCondition csysTrsCondition);
	/**
	 * 新增数据
	 * @param CsysTrsCondition
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsCondition csysTrsCondition);
	/**
	 * 更新
	 * @param CsysTrsCondition
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsCondition csysTrsCondition);
	
	/**
	 * 删除
	 * @param CsysTrsCondition
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
