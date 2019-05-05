package com.company.project.biz;
import com.company.project.model.BarcodeGroup;
import com.company.project.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by tty on 2019/05/05.
 */
public interface BarcodeGroupBiz  {

	/**
	 * 获取数据
	 * @param BarcodeGroup
	 * @return
	 */
	public BarcodeGroup getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param BarcodeGroup
	 * @return
	 */
	 public List<BarcodeGroup> getDataSettingsByCondition(BarcodeGroup barcodeGroup);
	/**
	 * 获取数据分页
	 * @param BarcodeGroup
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param BarcodeGroup
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,BarcodeGroup barcodeGroup);
	/**
	 * 新增数据
	 * @param BarcodeGroup
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,BarcodeGroup barcodeGroup);
	/**
	 * 更新
	 * @param BarcodeGroup
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,BarcodeGroup barcodeGroup);

	/**
	 * 删除
	 * @param BarcodeGroup
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
