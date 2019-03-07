package com.company.project.biz;
import com.company.project.model.CySysLayout;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * Created by tty on 2018/08/27.
 */
public interface CySysLayoutBiz  {

	/**
	 * 获取数据
	 * @param CySysLayout
	 * @return
	 */
	public CySysLayout getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysLayout
	 * @return
	 */
	 public List<CySysLayout> getDataSettingsByCondition(CySysLayout cySysLayout);
	/**
	 * 获取数据分页
	 * @param CySysLayout
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysLayout
	 * @return
	 */
	public Map<String,Object> getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysLayout cySysLayout);
	/**
	 * 新增数据
	 * @param CySysLayout
	 * @return
	 */
	public void insertDataSettings(CsysUserView baseUserView,CySysLayout cySysLayout);
	/**
	 * 更新
	 * @param CySysLayout
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysLayout cySysLayout);
	
	/**
	 * 删除
	 * @param CySysLayout
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
