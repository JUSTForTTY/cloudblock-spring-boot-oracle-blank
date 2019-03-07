package com.company.project.biz;
import com.company.project.outer.model.CsysViewExplain;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysViewExplainBiz  {

	/**
	 * 获取数据
	 * @param CsysViewExplain
	 * @return
	 */
	public CsysViewExplain getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysViewExplain
	 * @return
	 */
	 public List<CsysViewExplain> getDataSettingsByCondition(CsysViewExplain csysViewExplain);
	/**
	 * 获取数据分页
	 * @param CsysViewExplain
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysViewExplain
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysViewExplain csysViewExplain);
	/**
	 * 新增数据
	 * @param CsysViewExplain
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysViewExplain csysViewExplain);
	/**
	 * 更新
	 * @param CsysViewExplain
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysViewExplain csysViewExplain);
	
	/**
	 * 删除
	 * @param CsysViewExplain
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
