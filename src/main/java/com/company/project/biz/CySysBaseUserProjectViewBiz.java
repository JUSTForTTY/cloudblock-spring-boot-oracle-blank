package com.company.project.biz;
import com.company.project.model.CySysBaseUserProjectView;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/27.
 */
public interface CySysBaseUserProjectViewBiz  {

	/**
	 * 获取数据
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public CySysBaseUserProjectView getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	 public List<CySysBaseUserProjectView> getDataSettingsByCondition(CySysBaseUserProjectView cySysBaseUserProjectView);
	/**
	 * 获取数据分页
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView);
	/**
	 * 新增数据
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public void insertDataSettings(CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView);
	/**
	 * 更新
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUserProjectView cySysBaseUserProjectView);
	
	/**
	 * 删除
	 * @param CySysBaseUserProjectView
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
