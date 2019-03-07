package com.company.project.biz;
import com.company.project.model.CySysProject;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/27.
 */
public interface CySysProjectBiz  {

	/**
	 * 获取数据
	 * @param CySysProject
	 * @return
	 */
	public CySysProject getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysProject
	 * @return
	 */
	 public List<CySysProject> getDataSettingsByCondition(CySysProject cySysProject);
	/**
	 * 获取数据分页
	 * @param CySysProject
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysProject
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysProject cySysProject);
	/**
	 * 新增数据
	 * @param CySysProject
	 * @return
	 */
	public void insertDataSettings(CsysUserView baseUserView,CySysProject cySysProject);
	/**
	 * 更新
	 * @param CySysProject
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysProject cySysProject);
	
	/**
	 * 删除
	 * @param CySysProject
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
