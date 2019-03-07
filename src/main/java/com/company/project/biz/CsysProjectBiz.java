package com.company.project.biz;
import com.company.project.outer.model.CsysProject;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysProjectBiz  {

	/**
	 * 获取数据
	 * @param CsysProject
	 * @return
	 */
	public CsysProject getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysProject
	 * @return
	 */
	 public List<CsysProject> getDataSettingsByCondition(CsysProject csysProject);
	/**
	 * 获取数据分页
	 * @param CsysProject
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysProject
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysProject csysProject);
	/**
	 * 新增数据
	 * @param CsysProject
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysProject csysProject);
	/**
	 * 更新
	 * @param CsysProject
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysProject csysProject);
	
	/**
	 * 删除
	 * @param CsysProject
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
