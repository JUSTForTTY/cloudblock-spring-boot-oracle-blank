package com.company.project.biz;
import com.company.project.model.CySysProjectPublish;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/11/20.
 */
public interface CySysProjectPublishBiz  {

	/**
	 * 获取数据
	 * @param CySysProjectPublish
	 * @return
	 */
	public CySysProjectPublish getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysProjectPublish
	 * @return
	 */
	 public List<CySysProjectPublish> getDataSettingsByCondition(CySysProjectPublish cySysProjectPublish);
	/**
	 * 获取数据分页
	 * @param CySysProjectPublish
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysProjectPublish
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish);
	/**
	 * 新增数据
	 * @param CySysProjectPublish
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish);
	/**
	 * 更新
	 * @param CySysProjectPublish
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysProjectPublish cySysProjectPublish);
	
	/**
	 * 删除
	 * @param CySysProjectPublish
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
