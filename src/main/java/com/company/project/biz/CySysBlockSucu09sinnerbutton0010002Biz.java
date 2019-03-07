package com.company.project.biz;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010002;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockSucu09sinnerbutton0010002Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public CySysBlockSucu09sinnerbutton0010002 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	 public List<CySysBlockSucu09sinnerbutton0010002> getDataSettingsByCondition(CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002);
	/**
	 * 新增数据
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002);
	/**
	 * 更新
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu09sinnerbutton0010002 cySysBlockSucu09sinnerbutton0010002);
	
	/**
	 * 删除
	 * @param CySysBlockSucu09sinnerbutton0010002
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
