package com.company.project.biz;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflow;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/25.
 */
public interface CsysWorkflowBiz  {

	/**
	 * 获取数据
	 * @param CsysWorkflow
	 * @return
	 */
	public CsysWorkflow getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysWorkflow
	 * @return
	 */
	 public List<CsysWorkflow> getDataSettingsByCondition(CsysWorkflow csysWorkflow);
	/**
	 * 获取数据分页
	 * @param CsysWorkflow
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysWorkflow
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysWorkflow csysWorkflow);
	/**
	 * 新增数据
	 * @param CsysWorkflow
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysWorkflow csysWorkflow);
	/**
	 * 更新
	 * @param CsysWorkflow
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysWorkflow csysWorkflow);
	
	/**
	 * 删除
	 * @param CsysWorkflow
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
