package com.company.project.biz;
import com.company.project.model.CySysBaseUserProject;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/27.
 */
public interface CySysBaseUserProjectBiz  {

	/**
	 * 获取数据
	 * @param CySysBaseUserProject
	 * @return
	 */
	public CySysBaseUserProject getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBaseUserProject
	 * @return
	 */
	 public List<CySysBaseUserProject> getDataSettingsByCondition(CySysBaseUserProject cySysBaseUserProject);
	/**
	 * 获取数据分页
	 * @param CySysBaseUserProject
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBaseUserProject
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject);
	/**
	 * 新增数据
	 * @param CySysBaseUserProject
	 * @return
	 */
	public void insertDataSettings(CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject);
	/**
	 * 更新
	 * @param CySysBaseUserProject
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserProject cySysBaseUserProject);
	
	/**
	 * 删除
	 * @param CySysBaseUserProject
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
