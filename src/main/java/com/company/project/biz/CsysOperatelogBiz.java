package com.company.project.biz;
import com.company.project.outer.model.CsysOperatelog;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysOperatelogBiz  {

	/**
	 * 获取数据
	 * @param CsysOperatelog
	 * @return
	 */
	public CsysOperatelog getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysOperatelog
	 * @return
	 */
	 public List<CsysOperatelog> getDataSettingsByCondition(CsysOperatelog csysOperatelog);
	/**
	 * 获取数据分页
	 * @param CsysOperatelog
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysOperatelog
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysOperatelog csysOperatelog);
	/**
	 * 新增数据
	 * @param CsysOperatelog
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysOperatelog csysOperatelog);
	/**
	 * 更新
	 * @param CsysOperatelog
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysOperatelog csysOperatelog);
	
	/**
	 * 删除
	 * @param CsysOperatelog
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
