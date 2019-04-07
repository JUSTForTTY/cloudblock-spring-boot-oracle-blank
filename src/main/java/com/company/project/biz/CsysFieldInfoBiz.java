package com.company.project.biz;
import com.company.project.model.CsysFieldInfo;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysFieldInfoBiz  {

	/**
	 * 获取数据
	 * @param CsysFieldInfo
	 * @return
	 */
	public CsysFieldInfo getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysFieldInfo
	 * @return
	 */
	 public List<CsysFieldInfo> getDataSettingsByCondition(CsysFieldInfo csysFieldInfo);
	/**
	 * 获取数据分页
	 * @param CsysFieldInfo
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysFieldInfo
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysFieldInfo csysFieldInfo);
	/**
	 * 新增数据
	 * @param CsysFieldInfo
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysFieldInfo csysFieldInfo);
	/**
	 * 更新
	 * @param CsysFieldInfo
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysFieldInfo csysFieldInfo);
	
	/**
	 * 删除
	 * @param CsysFieldInfo
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
