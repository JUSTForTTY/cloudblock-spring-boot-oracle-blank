package com.company.project.biz;
import com.company.project.model.CsysNoticeTp;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysNoticeTpBiz  {

	/**
	 * 获取数据
	 * @param CsysNoticeTp
	 * @return
	 */
	public CsysNoticeTp getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysNoticeTp
	 * @return
	 */
	 public List<CsysNoticeTp> getDataSettingsByCondition(CsysNoticeTp csysNoticeTp);
	/**
	 * 获取数据分页
	 * @param CsysNoticeTp
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysNoticeTp
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysNoticeTp csysNoticeTp);
	/**
	 * 新增数据
	 * @param CsysNoticeTp
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysNoticeTp csysNoticeTp);
	/**
	 * 更新
	 * @param CsysNoticeTp
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysNoticeTp csysNoticeTp);
	
	/**
	 * 删除
	 * @param CsysNoticeTp
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
