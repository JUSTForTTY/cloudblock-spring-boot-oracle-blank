package com.company.project.biz;
import com.company.project.model.CySysBlockSucu07innerweiget0030001;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockSucu07innerweiget0030001Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public CySysBlockSucu07innerweiget0030001 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	 public List<CySysBlockSucu07innerweiget0030001> getDataSettingsByCondition(CySysBlockSucu07innerweiget0030001 cySysBlockSucu07innerweiget0030001);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu07innerweiget0030001 cySysBlockSucu07innerweiget0030001);
	/**
	 * 新增数据
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu07innerweiget0030001 cySysBlockSucu07innerweiget0030001);
	/**
	 * 更新
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu07innerweiget0030001 cySysBlockSucu07innerweiget0030001);
	
	/**
	 * 删除
	 * @param CySysBlockSucu07innerweiget0030001
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
