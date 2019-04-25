package com.company.project.service.impl;
import com.company.project.service.CommonService;
import com.company.project.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.company.project.service.InsertformService;
import com.company.project.dao.InsertformMapper;
import com.company.project.dao.SystemMapper;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import com.company.project.biz.CommonBiz;

/**
 * Created by sxs on 2019/04/24.
 */
@Component
@Transactional
public class InsertformServiceImpl implements InsertformService {
	
	private final Log logger = LogFactory.getLog(getClass());
	
	@Resource
	private InsertformMapper insertformMapper;

	@Resource
	private CommonBiz commonBiz;

	@Resource
	private SystemMapper systemMapper;

	/**
	 * 新增表单信息
	 *
	 * @param map
	 * @param userViewList
	 * @return
	 */
	@Override
	public String saveFormData000515(Map<String, String> map, List<CsysUserView> userViewList) {
			CsysUserView  csysUserView = userViewList.get(0);
				  map.put("T_TEST001_CREATE_USER",csysUserView.getCsysUserId());
				  map.put("T_TEST001_CREATE_TIME",DateUtils.newTimestampStr());
				  map.put("T_TEST001_MODIFY_USER",csysUserView.getCsysUserId());
				  map.put("T_TEST001_MODIFY_TIME",DateUtils.newTimestampStr());

				map.put("T_TEST001_FLAG","0");

			insertformMapper.saveFormData000515(map);

				String returnsequence = systemMapper
						.selectLastId("select T_TEST001_SEQ.currval  from T_TEST001 where rownum <=1");
			return returnsequence;
	}

	/**
	 * 更新表单信息
	 *
	 * @param map
	 * @param csysUserView
	 */
	@Override
	public void updateFormData000515(Map<String, String> map, CsysUserView csysUserView) {
					map.put("T_TEST001_MODIFY_USER",csysUserView.getCsysUserId());
					map.put("T_TEST001_MODIFY_TIME",DateUtils.newTimestampStr());
		insertformMapper.updateFormData000515(map);
	}


	/**
	 * 新增表单信息
	 *
	 * @param map
	 * @param userViewList
	 * @return
	 */
	@Override
	public String saveFormData000514(Map<String, String> map, List<CsysUserView> userViewList) {
			CsysUserView  csysUserView = userViewList.get(0);
				/**
				 * 通用sequence,不加时间戳
				 */
				// 取sequence
				String returnsequence = commonBiz.getOracleSimpleSequence("T_TEST001");
				map.put("T_TEST001_ID",returnsequence);
				  map.put("T_TEST001_CREATE_USER",csysUserView.getCsysUserId());
				  map.put("T_TEST001_CREATE_TIME",DateUtils.newTimestampStr());
				  map.put("T_TEST001_MODIFY_USER",csysUserView.getCsysUserId());
				  map.put("T_TEST001_MODIFY_TIME",DateUtils.newTimestampStr());

				map.put("T_TEST001_FLAG","0");

			insertformMapper.saveFormData000514(map);

			return returnsequence;
	}

	/**
	 * 更新表单信息
	 *
	 * @param map
	 * @param csysUserView
	 */
	@Override
	public void updateFormData000514(Map<String, String> map, CsysUserView csysUserView) {
					map.put("T_TEST001_MODIFY_USER",csysUserView.getCsysUserId());
					map.put("T_TEST001_MODIFY_TIME",DateUtils.newTimestampStr());
		insertformMapper.updateFormData000514(map);
	}

	
}
