package com.company.project.biz;
import com.company.project.model.CySysBaseUser;
import com.company.project.outer.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2018/09/29.
 */
public interface CySysBaseUserBiz  {

	/**
	 * 获取数据
	 * @param CySysBaseUser
	 * @return
	 */
	public CySysBaseUser getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param CySysBaseUser
	 * @return
	 */
	 public List<CySysBaseUser> getDataSettingsByCondition(CySysBaseUser cySysBaseUser);
	/**
	 * 获取数据分页
	 * @param CySysBaseUser
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param CySysBaseUser
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,CySysBaseUser cySysBaseUser);
	/**
	 * 新增数据
	 * @param CySysBaseUser
	 * @return
	 */
	public String insertDataSettings(CsysUserView baseUserView,CySysBaseUser cySysBaseUser);
	/**
	 * 更新
	 * @param CySysBaseUser
	 * @return
	 */
	public void updateDataSettings(CsysUserView baseUserView,CySysBaseUser cySysBaseUser);
	
	/**
	 * 删除
	 * @param CySysBaseUser
	 * @return
	 */
	public void deleteDataSettings(String ids);
	
}
