package com.company.project.biz;
import com.company.project.model.ProWoBarcode;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/05/05.
 */
public interface ProWoBarcodeBiz  {

	/**
	 * 获取数据
	 * @param ProWoBarcode
	 * @return
	 */
	public ProWoBarcode getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param ProWoBarcode
	 * @return
	 */
	 public List<ProWoBarcode> getDataSettingsByCondition(ProWoBarcode proWoBarcode);
	/**
	 * 获取数据分页
	 * @param ProWoBarcode
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param ProWoBarcode
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,ProWoBarcode proWoBarcode);
	/**
	 * 新增数据
	 * @param ProWoBarcode
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,ProWoBarcode proWoBarcode);
	/**
	 * 更新
	 * @param ProWoBarcode
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,ProWoBarcode proWoBarcode);

	/**
	 * 删除
	 * @param ProWoBarcode
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
