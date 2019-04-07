package com.company.project.biz;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflowRun;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/02/26.
 */
public interface CsysWorkflowRunBiz  {

	/**
	 * 获取数据
	 * @param CsysWorkflowRun
	 * @return
	 */
	public CsysWorkflowRun getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysWorkflowRun
	 * @return
	 */
	 public List<CsysWorkflowRun> getDataSettingsByCondition(CsysWorkflowRun csysWorkflowRun);
	/**
	 * 获取数据分页
	 * @param CsysWorkflowRun
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysWorkflowRun
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun);
	/**
	 * 新增数据
	 * @param CsysWorkflowRun
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun);
	/**
	 * 更新
	 * @param CsysWorkflowRun
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysWorkflowRun csysWorkflowRun);
	
	/**
	 * 删除
	 * @param CsysWorkflowRun
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
