package com.company.project.biz;
import com.company.project.model.CySysBlockSucu05button0020004;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockSucu05button0020004Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public CySysBlockSucu05button0020004 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	 public List<CySysBlockSucu05button0020004> getDataSettingsByCondition(CySysBlockSucu05button0020004 cySysBlockSucu05button0020004);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0020004 cySysBlockSucu05button0020004);
	/**
	 * 新增数据
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0020004 cySysBlockSucu05button0020004);
	/**
	 * 更新
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0020004 cySysBlockSucu05button0020004);
	
	/**
	 * 删除
	 * @param CySysBlockSucu05button0020004
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
