package com.company.project.biz;
import com.company.project.outer.model.CsysPbAssoc;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPbAssocBiz  {

	/**
	 * 获取数据
	 * @param CsysPbAssoc
	 * @return
	 */
	public CsysPbAssoc getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPbAssoc
	 * @return
	 */
	 public List<CsysPbAssoc> getDataSettingsByCondition(CsysPbAssoc csysPbAssoc);
	/**
	 * 获取数据分页
	 * @param CsysPbAssoc
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPbAssoc
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPbAssoc csysPbAssoc);
	/**
	 * 新增数据
	 * @param CsysPbAssoc
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPbAssoc csysPbAssoc);
	/**
	 * 更新
	 * @param CsysPbAssoc
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPbAssoc csysPbAssoc);
	
	/**
	 * 删除
	 * @param CsysPbAssoc
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
