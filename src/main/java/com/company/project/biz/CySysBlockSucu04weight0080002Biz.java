package com.company.project.biz;
import com.company.project.model.CySysBlockSucu04weight0080002;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/03.
 */
public interface CySysBlockSucu04weight0080002Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public CySysBlockSucu04weight0080002 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	 public List<CySysBlockSucu04weight0080002> getDataSettingsByCondition(CySysBlockSucu04weight0080002 cySysBlockSucu04weight0080002);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu04weight0080002 cySysBlockSucu04weight0080002);
	/**
	 * 新增数据
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0080002 cySysBlockSucu04weight0080002);
	/**
	 * 更新
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu04weight0080002 cySysBlockSucu04weight0080002);
	
	/**
	 * 删除
	 * @param CySysBlockSucu04weight0080002
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
