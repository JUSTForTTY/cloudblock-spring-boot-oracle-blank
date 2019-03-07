package com.company.project.biz;
import com.company.project.outer.model.CsysPotPublic;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPotPublicBiz  {

	/**
	 * 获取数据
	 * @param CsysPotPublic
	 * @return
	 */
	public CsysPotPublic getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPotPublic
	 * @return
	 */
	 public List<CsysPotPublic> getDataSettingsByCondition(CsysPotPublic csysPotPublic);
	/**
	 * 获取数据分页
	 * @param CsysPotPublic
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPotPublic
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPotPublic csysPotPublic);
	/**
	 * 新增数据
	 * @param CsysPotPublic
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPotPublic csysPotPublic);
	/**
	 * 更新
	 * @param CsysPotPublic
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPotPublic csysPotPublic);
	
	/**
	 * 删除
	 * @param CsysPotPublic
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
