package com.company.project.biz;
import com.company.project.model.CySysLayoutCategory;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/27.
 */
public interface CySysLayoutCategoryBiz  {

	/**
	 * 获取数据
	 * @param CySysLayoutCategory
	 * @return
	 */
	public CySysLayoutCategory getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysLayoutCategory
	 * @return
	 */
	 public List<CySysLayoutCategory> getDataSettingsByCondition(CySysLayoutCategory cySysLayoutCategory);
	/**
	 * 获取数据分页
	 * @param CySysLayoutCategory
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysLayoutCategory
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory);
	/**
	 * 新增数据
	 * @param CySysLayoutCategory
	 * @return
	 */
	public void insertDataSettings(CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory);
	/**
	 * 更新
	 * @param CySysLayoutCategory
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysLayoutCategory cySysLayoutCategory);
	
	/**
	 * 删除
	 * @param CySysLayoutCategory
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
