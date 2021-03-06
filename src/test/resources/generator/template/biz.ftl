package ${basePackage}.biz;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.model.CsysUserView;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Biz  {

	/**
	 * 获取数据
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public ${modelNameUpperCamel} getDataSettings(String id);
	/**
	 * 获取条件数据
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	 public List<${modelNameUpperCamel}> getDataSettingsByCondition(${modelNameUpperCamel} ${modelNameLowerCamel});
	/**
	 * 获取数据分页
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public PageInfo getPageDataSettings(Integer page,Integer size);
	/**
	 * 根据条件获取数据分页
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView csysUserView,${modelNameUpperCamel} ${modelNameLowerCamel});
	/**
	 * 新增数据
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public String insertDataSettings(CsysUserView csysUserView,${modelNameUpperCamel} ${modelNameLowerCamel});
	/**
	 * 更新
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public void updateDataSettings(CsysUserView csysUserView,${modelNameUpperCamel} ${modelNameLowerCamel});

	/**
	 * 删除
	 * @param ${modelNameUpperCamel}
	 * @return
	 */
	public void deleteDataSettings(String ids);

}
