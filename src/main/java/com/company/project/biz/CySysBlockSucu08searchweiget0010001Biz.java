package com.company.project.biz;
import com.company.project.model.CySysBlockSucu08searchweiget0010001;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/08/28.
 */
public interface CySysBlockSucu08searchweiget0010001Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public CySysBlockSucu08searchweiget0010001 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	 public List<CySysBlockSucu08searchweiget0010001> getDataSettingsByCondition(CySysBlockSucu08searchweiget0010001 cySysBlockSucu08searchweiget0010001);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu08searchweiget0010001 cySysBlockSucu08searchweiget0010001);
	/**
	 * 新增数据
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0010001 cySysBlockSucu08searchweiget0010001);
	/**
	 * 更新
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu08searchweiget0010001 cySysBlockSucu08searchweiget0010001);
	
	/**
	 * 删除
	 * @param CySysBlockSucu08searchweiget0010001
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
