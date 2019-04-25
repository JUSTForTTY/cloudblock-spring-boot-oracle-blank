package com.company.project.biz.impl;
import com.company.project.service.InsertformService;
import com.company.project.biz.InsertformBiz;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import com.company.project.core.bean.ResultBean;

/**
 * Created by sxs on 2019/04/24.
 */
@Component
public class InsertformBizImpl implements InsertformBiz {

	private final Log logger = LogFactory.getLog(getClass());
	
    @Resource
    private InsertformService insertformService;

	/**
	 * 新增数据
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
	@Override
	public ResultBean saveFormData000515(Map<String, String> map, List<CsysUserView> userViewList) {
		String returnsequence = insertformService.saveFormData000515(map,userViewList);
		ResultBean resultBean=new ResultBean();
		resultBean.setStringData(returnsequence);
		return resultBean;
	}

	/**
	 * 更新表单数据
	 * 
	 * @param map
	 * @param csysUserView
	 */
	@Override
	public void updateFormData000515(Map<String, String> map, CsysUserView csysUserView) {
		insertformService.updateFormData000515(map,csysUserView);
	}

	/**
	 * 新增数据
	 * 
	 * @param map
	 * @param userViewList
	 * @return
	 */
	@Override
	public ResultBean saveFormData000514(Map<String, String> map, List<CsysUserView> userViewList) {
		String returnsequence = insertformService.saveFormData000514(map,userViewList);
		ResultBean resultBean=new ResultBean();
		resultBean.setStringData(returnsequence);
		return resultBean;
	}

	/**
	 * 更新表单数据
	 * 
	 * @param map
	 * @param csysUserView
	 */
	@Override
	public void updateFormData000514(Map<String, String> map, CsysUserView csysUserView) {
		insertformService.updateFormData000514(map,csysUserView);
	}
	
}
