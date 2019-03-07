package com.company.project.biz;
import com.company.project.outer.model.CsysPot;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPotBiz  {

	/**
	 * 获取数据
	 * @param CsysPot
	 * @return
	 */
	public CsysPot getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPot
	 * @return
	 */
	 public List<CsysPot> getDataSettingsByCondition(CsysPot csysPot);
	/**
	 * 获取数据分页
	 * @param CsysPot
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPot
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPot csysPot);
	/**
	 * 新增数据
	 * @param CsysPot
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPot csysPot);
	/**
	 * 更新
	 * @param CsysPot
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPot csysPot);
	
	/**
	 * 删除
	 * @param CsysPot
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
