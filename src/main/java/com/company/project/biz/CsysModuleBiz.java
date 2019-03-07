package com.company.project.biz;
import com.company.project.outer.model.CsysModule;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/28.
 */
public interface CsysModuleBiz  {

	/**
	 * 获取数据
	 * @param CsysModule
	 * @return
	 */
	public CsysModule getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysModule
	 * @return
	 */
	 public List<CsysModule> getDataSettingsByCondition(CsysModule csysModule);
	/**
	 * 获取数据分页
	 * @param CsysModule
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysModule
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysModule csysModule);
	/**
	 * 新增数据
	 * @param CsysModule
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysModule csysModule);
	/**
	 * 更新
	 * @param CsysModule
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysModule csysModule);
	
	/**
	 * 删除
	 * @param CsysModule
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
