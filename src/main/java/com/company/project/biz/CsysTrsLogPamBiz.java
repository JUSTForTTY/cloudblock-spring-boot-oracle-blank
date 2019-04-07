package com.company.project.biz;
import com.company.project.model.CsysTrsLogPam;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysTrsLogPamBiz  {

	/**
	 * 获取数据
	 * @param CsysTrsLogPam
	 * @return
	 */
	public CsysTrsLogPam getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysTrsLogPam
	 * @return
	 */
	 public List<CsysTrsLogPam> getDataSettingsByCondition(CsysTrsLogPam csysTrsLogPam);
	/**
	 * 获取数据分页
	 * @param CsysTrsLogPam
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysTrsLogPam
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam);
	/**
	 * 新增数据
	 * @param CsysTrsLogPam
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam);
	/**
	 * 更新
	 * @param CsysTrsLogPam
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysTrsLogPam csysTrsLogPam);
	
	/**
	 * 删除
	 * @param CsysTrsLogPam
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
