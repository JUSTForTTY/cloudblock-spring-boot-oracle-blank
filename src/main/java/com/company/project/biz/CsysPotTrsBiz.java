package com.company.project.biz;
import com.company.project.outer.model.CsysPotTrs;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/26.
 */
public interface CsysPotTrsBiz  {

	/**
	 * 获取数据
	 * @param CsysPotTrs
	 * @return
	 */
	public CsysPotTrs getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotTrs
	 * @return
	 */
	 public List<CsysPotTrs> getDataSettingsByCondition(CsysPotTrs csysPotTrs);
	/**
	 * 获取数据分页
	 * @param CsysPotTrs
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotTrs
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotTrs csysPotTrs);
	/**
	 * 新增数据
	 * @param CsysPotTrs
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs);
	/**
	 * 更新
	 * @param CsysPotTrs
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPotTrs csysPotTrs);
	
	/**
	 * 删除
	 * @param CsysPotTrs
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
