package com.company.project.biz;
import com.company.project.model.CySysBlockSucu05button0010007;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/12.
 */
public interface CySysBlockSucu05button0010007Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public CySysBlockSucu05button0010007 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	 public List<CySysBlockSucu05button0010007> getDataSettingsByCondition(CySysBlockSucu05button0010007 cySysBlockSucu05button0010007);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007);
	/**
	 * 新增数据
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007);
	/**
	 * 更新
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu05button0010007 cySysBlockSucu05button0010007);
	
	/**
	 * 删除
	 * @param CySysBlockSucu05button0010007
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
