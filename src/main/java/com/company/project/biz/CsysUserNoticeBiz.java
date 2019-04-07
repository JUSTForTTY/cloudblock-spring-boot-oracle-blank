package com.company.project.biz;
import com.company.project.model.CsysUserNotice;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysUserNoticeBiz  {

	/**
	 * 获取数据
	 * @param CsysUserNotice
	 * @return
	 */
	public CsysUserNotice getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysUserNotice
	 * @return
	 */
	 public List<CsysUserNotice> getDataSettingsByCondition(CsysUserNotice csysUserNotice);
	/**
	 * 获取数据分页
	 * @param CsysUserNotice
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysUserNotice
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysUserNotice csysUserNotice);
	/**
	 * 新增数据
	 * @param CsysUserNotice
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysUserNotice csysUserNotice);
	/**
	 * 更新
	 * @param CsysUserNotice
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysUserNotice csysUserNotice);
	
	/**
	 * 删除
	 * @param CsysUserNotice
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
