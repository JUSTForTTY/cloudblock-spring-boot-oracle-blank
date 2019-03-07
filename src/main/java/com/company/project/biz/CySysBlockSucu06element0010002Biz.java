package com.company.project.biz;
import com.company.project.model.CySysBlockSucu06element0010002;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/18.
 */
public interface CySysBlockSucu06element0010002Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public CySysBlockSucu06element0010002 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	 public List<CySysBlockSucu06element0010002> getDataSettingsByCondition(CySysBlockSucu06element0010002 cySysBlockSucu06element0010002);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu06element0010002 cySysBlockSucu06element0010002);
	/**
	 * 新增数据
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu06element0010002 cySysBlockSucu06element0010002);
	/**
	 * 更新
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu06element0010002 cySysBlockSucu06element0010002);
	
	/**
	 * 删除
	 * @param CySysBlockSucu06element0010002
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
