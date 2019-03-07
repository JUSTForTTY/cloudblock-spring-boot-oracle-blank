package com.company.project.biz;
import com.company.project.outer.model.CsysTrsAuthView;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/26.
 */
public interface CsysTrsAuthViewBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsAuthView
	 * @return
	 */
	public CsysTrsAuthView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsAuthView
	 * @return
	 */
	 public List<CsysTrsAuthView> getDataSettingsByCondition(CsysTrsAuthView csysTrsAuthView);
	/**
	 * 获取数据分页
	 * @param CsysTrsAuthView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsAuthView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView);
	/**
	 * 新增数据
	 * @param CsysTrsAuthView
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView);
	/**
	 * 更新
	 * @param CsysTrsAuthView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsAuthView csysTrsAuthView);
	
	/**
	 * 删除
	 * @param CsysTrsAuthView
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
