package com.company.project.biz;
import com.company.project.model.CySysBlockSucu03charts0030003;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/03.
 */
public interface CySysBlockSucu03charts0030003Biz  {

	/**
	 * 获取数据
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public CySysBlockSucu03charts0030003 getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	 public List<CySysBlockSucu03charts0030003> getDataSettingsByCondition(CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003);
	/**
	 * 获取数据分页
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003);
	/**
	 * 新增数据
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003);
	/**
	 * 更新
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBlockSucu03charts0030003 cySysBlockSucu03charts0030003);
	
	/**
	 * 删除
	 * @param CySysBlockSucu03charts0030003
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
