package com.company.project.biz;

import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/08/22.
 */
public interface AuthLoginBiz {

	/**
	 * 获取数据
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public CsysUserView getDataSettings(String id);

	/**
	 * 获取条件数据
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public List<CsysUserView> login(CsysUserView CsysUserView);

	/**
	 * 获取条件数据
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public List<CsysUserView> getDataSettingsByCondition(CsysUserView CsysUserView);

	/**
	 * 获取数据分页
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page, Integer size);

	/**
	 * 新增数据
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public void insertDataSettings(CsysUserView CsysUserView);

	/**
	 * 更新
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView, CsysUserView CsysUserView);

	/**
	 * 删除
	 * 
	 * @param CsysUserView
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
