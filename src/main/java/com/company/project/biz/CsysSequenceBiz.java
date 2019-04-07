package com.company.project.biz;
import com.company.project.model.CsysSequence;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysSequenceBiz  {

	/**
	 * 获取数据
	 * @param CsysSequence
	 * @return
	 */
	public CsysSequence getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysSequence
	 * @return
	 */
	 public List<CsysSequence> getDataSettingsByCondition(CsysSequence csysSequence);
	/**
	 * 获取数据分页
	 * @param CsysSequence
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysSequence
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysSequence csysSequence);
	/**
	 * 新增数据
	 * @param CsysSequence
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysSequence csysSequence);
	/**
	 * 更新
	 * @param CsysSequence
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysSequence csysSequence);
	
	/**
	 * 删除
	 * @param CsysSequence
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
