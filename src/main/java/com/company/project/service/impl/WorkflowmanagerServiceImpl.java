package com.company.project.service.impl;
import com.company.project.service.CommonService;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.company.project.service.WorkflowmanagerService;
import com.company.project.dao.WorkflowmanagerMapper;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import com.company.project.core.bean.SearchTableBean;
import com.company.project.core.structure.engine.interfaces.OrganizeInterfaces;

/**
 * Created by sxs on 2019/04/24.
 */
@Component
@Transactional
public class WorkflowmanagerServiceImpl implements WorkflowmanagerService {
	
	private final Log logger = LogFactory.getLog(getClass());
	
	@Resource
	private WorkflowmanagerMapper workflowmanagerMapper;

	@Resource
	private OrganizeInterfaces organizeInterfaces;

	@Override
	public List<Map<String, Object>> getTableData000859(SearchTableBean searchTableBean,CsysUserView baseUserView) {
				    searchTableBean.setOrganizePoints(organizeInterfaces.getOrgUserSql(baseUserView, null));
		return workflowmanagerMapper.getTableData000859(searchTableBean);
	}

	@Override
	public void logicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView) {
					map.put("T_TEST001_MODIFY_TIME",DateUtils.newTimestampStr());
					map.put("T_TEST001_MODIFY_USER",csysUserView.getCsysUserId());
		workflowmanagerMapper.logicalDeleteTableData000859(map);
	}

	@Override
	public void physicalDeleteTableData000859(Map<String, String> map, CsysUserView csysUserView) {
		workflowmanagerMapper.physicalDeleteTableData000859(map);
	}

	
}
