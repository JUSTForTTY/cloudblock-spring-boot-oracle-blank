package com.company.project.biz;
import com.company.project.model.CsysPotTrsCon;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/26.
 */
public interface CsysPotTrsConBiz  {

	/**
	 * 获取数据
	 * @param CsysPotTrsCon
	 * @return
	 */
	public CsysPotTrsCon getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotTrsCon
	 * @return
	 */
	 public List<CsysPotTrsCon> getDataSettingsByCondition(CsysPotTrsCon csysPotTrsCon);
	/**
	 * 获取数据分页
	 * @param CsysPotTrsCon
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotTrsCon
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon);
	/**
	 * 新增数据
	 * @param CsysPotTrsCon
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon);
	/**
	 * 更新
	 * @param CsysPotTrsCon
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPotTrsCon csysPotTrsCon);
	
	/**
	 * 删除
	 * @param CsysPotTrsCon
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
