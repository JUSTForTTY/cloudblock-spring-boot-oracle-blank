package com.company.project.biz;
import com.company.project.outer.model.CsysPageBlock;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/01/23.
 */
public interface CsysPageBlockBiz  {

	/**
	 * 获取数据
	 * @param CsysPageBlock
	 * @return
	 */
	public CsysPageBlock getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CsysPageBlock
	 * @return
	 */
	 public List<CsysPageBlock> getDataSettingsByCondition(CsysPageBlock csysPageBlock);
	/**
	 * 获取数据分页
	 * @param CsysPageBlock
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CsysPageBlock
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CsysPageBlock csysPageBlock);
	/**
	 * 新增数据
	 * @param CsysPageBlock
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CsysPageBlock csysPageBlock);
	/**
	 * 更新
	 * @param CsysPageBlock
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CsysPageBlock csysPageBlock);
	
	/**
	 * 删除
	 * @param CsysPageBlock
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
