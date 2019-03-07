package com.company.project.biz;
import com.company.project.model.CySysBlockSucu06element0020001;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/11/09.
 */
public interface CySysBlockSucu06element0020001Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public CySysBlockSucu06element0020001 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	 public List<CySysBlockSucu06element0020001> getDataSettingsByCondition(CySysBlockSucu06element0020001 cySysBlockSucu06element0020001);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu06element0020001 cySysBlockSucu06element0020001);
	/**
	 * 新增数据
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu06element0020001 cySysBlockSucu06element0020001);
	/**
	 * 更新
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu06element0020001 cySysBlockSucu06element0020001);
	
	/**
	 * 删除
	 * @param CySysBlockSucu06element0020001
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
