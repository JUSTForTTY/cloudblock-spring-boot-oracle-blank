package com.company.project.biz;
import com.company.project.model.CsysCodemaster;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/06/15.
 */
public interface CsysCodemasterBiz  {

	/**
	 * 获取数据
	 * @param CsysCodemaster
	 * @return
	 */
	public CsysCodemaster getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysCodemaster
	 * @return
	 */
	 public List<CsysCodemaster> getDataSettingsByCondition(CsysCodemaster csysCodemaster);
	/**
	 * 获取数据分页
	 * @param CsysCodemaster
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysCodemaster
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,CsysCodemaster csysCodemaster);
	/**
	 * 新增数据
	 * @param CsysCodemaster
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,CsysCodemaster csysCodemaster);
	/**
	 * 更新
	 * @param CsysCodemaster
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,CsysCodemaster csysCodemaster);

	/**
	 * 删除
	 * @param CsysCodemaster
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
