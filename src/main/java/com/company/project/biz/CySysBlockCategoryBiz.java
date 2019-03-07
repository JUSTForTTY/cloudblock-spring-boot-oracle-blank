package com.company.project.biz;
import com.company.project.model.CySysBlockCategory;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockCategoryBiz  {

	/**
	 * 获取数据
	 * @param CySysBlockCategory
	 * @return
	 */
	public CySysBlockCategory getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockCategory
	 * @return
	 */
	 public List<CySysBlockCategory> getDataSettingsByCondition(CySysBlockCategory cySysBlockCategory);
	/**
	 * 获取数据分页
	 * @param CySysBlockCategory
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockCategory
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory);
	/**
	 * 新增数据
	 * @param CySysBlockCategory
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory);
	/**
	 * 更新
	 * @param CySysBlockCategory
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockCategory cySysBlockCategory);
	
	/**
	 * 删除
	 * @param CySysBlockCategory
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
