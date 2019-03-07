package com.company.project.biz;
import com.company.project.model.CySysBlock;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockBiz  {

	/**
	 * 获取数据
	 * @param CySysBlock
	 * @return
	 */
	public CySysBlock getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlock
	 * @return
	 */
	 public List<CySysBlock> getDataSettingsByCondition(CySysBlock cySysBlock);
	/**
	 * 获取数据分页
	 * @param CySysBlock
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlock
	 * @return
	 */
	public Map<String, Object> getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlock cySysBlock);
	/**
	 * 新增数据
	 * @param CySysBlock
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlock cySysBlock);
	/**
	 * 更新
	 * @param CySysBlock
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlock cySysBlock);
	
	/**
	 * 删除
	 * @param CySysBlock
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
