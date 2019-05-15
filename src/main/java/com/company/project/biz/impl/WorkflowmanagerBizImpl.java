package com.company.project.biz.impl;
import com.company.project.service.WorkflowmanagerService;
import com.company.project.biz.WorkflowmanagerBiz;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.company.project.core.bean.SearchTableBean;
import com.company.project.core.bean.ResultBean;

/**
 * Created by sxs on 2019/04/24.
 */
@Component
public class WorkflowmanagerBizImpl implements WorkflowmanagerBiz {

	private final Log logger = LogFactory.getLog(getClass());
	
    @Resource
    private WorkflowmanagerService workflowmanagerService;

	@Override
	public ResultBean getTableData000859(CsysUserView baseUserView, SearchTableBean searchTableBean) {
		PageHelper.startPage(searchTableBean.getNowPage(), searchTableBean.getPageSize());

		// 查询数据
		List<Map<String, Object>> list = workflowmanagerService.getTableData000859(searchTableBean,baseUserView);

		PageInfo pageInfo = new PageInfo(list);

		ResultBean resultBean=new ResultBean();
		
		resultBean.setData(pageInfo);
		
		return resultBean;
	}

	@Override
	public void logicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView) {

		workflowmanagerService.logicalDeleteTableData000859(map,csysUserView);
	}

	@Override
	public void physicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView) {

		workflowmanagerService.physicalDeleteTableData000859(map,csysUserView);
	}
	
}
