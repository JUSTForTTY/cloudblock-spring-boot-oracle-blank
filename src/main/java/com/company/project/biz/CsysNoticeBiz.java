package com.company.project.biz;
import com.company.project.model.CsysNotice;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysNoticeBiz  {

	/**
	 * 获取数据
	 * @param CsysNotice
	 * @return
	 */
	public CsysNotice getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysNotice
	 * @return
	 */
	 public List<CsysNotice> getDataSettingsByCondition(CsysNotice csysNotice);
	/**
	 * 获取数据分页
	 * @param CsysNotice
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysNotice
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysNotice csysNotice);
	/**
	 * 新增数据
	 * @param CsysNotice
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysNotice csysNotice);
	/**
	 * 更新
	 * @param CsysNotice
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysNotice csysNotice);
	
	/**
	 * 删除
	 * @param CsysNotice
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
