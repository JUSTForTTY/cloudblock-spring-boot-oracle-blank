package com.company.project.core.structure.engine.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.company.project.biz.CsysOrgPotAuthBiz;
import com.company.project.biz.CsysOrgPotBiz;
import com.company.project.core.structure.engine.interfaces.OrganizeInterfaces;
import com.company.project.dao.SystemMapper;
import com.company.project.model.CsysOrgPot;
import com.company.project.model.CsysOrgPotAuth;
import com.company.project.model.CsysUserView;

@Service
public class OrganizeService implements OrganizeInterfaces {

	@Resource
	CsysOrgPotAuthBiz csysOrgPotAuthBiz;

	@Resource
	private CsysOrgPotBiz csysOrgPotBiz;

	@Resource
	private SystemMapper systemMapper;

	private final Log logger = LogFactory.getLog(getClass());

	/*
	 * 获取组织架构数据
	 */
	@Override
	public String getOrgUserSql(CsysUserView CsysUserView, String organizeId) {
		// TODO Auto-generated method stub

		String orgUserSql = null;
		/*
		 * 第一步：根据组织架构编号和用户编号查出当前用户所属组织架构的所有节点以及子节点
		 */
		CsysOrgPotAuth csysOrgPotAuth = new CsysOrgPotAuth();
		if (organizeId != null && !"".equals(organizeId)) {
			csysOrgPotAuth.setCsysOrgStruceId(organizeId);
		}
		csysOrgPotAuth.setCsysUserId(CsysUserView.getCsysUserId());
		// 获取当前用户所属组织架构的所有节点
		List<CsysOrgPotAuth> csysOrgPotAuthList = csysOrgPotAuthBiz.getDataSettingsByCondition(csysOrgPotAuth);
		logger.info("当前用户所有节点长度：" + csysOrgPotAuthList.size());
		// List pointArray = new ArrayList<>();
		StringBuilder allpoint = new StringBuilder();
		// 循环获取每个节点的子节点
		for (CsysOrgPotAuth orgPotAuth : csysOrgPotAuthList) {
			// 获取当前用户组织架构节点子节点
			getChildPoint(organizeId, orgPotAuth.getCsysOrgPotId(), allpoint);
		}
		/*
		 * 第二步：根据节点编号，获取节点用户下的所有用户
		 */
		logger.info("所有节点：" + allpoint.toString());
		orgUserSql = "select distinct CSYS_USER_ID from CSYS_ORG_POT_AUTH where CSYS_ORG_POT_ID in ("
				+ (allpoint.length() > 0 ? allpoint.deleteCharAt(allpoint.length() - 1) : "''")
				// 注意需包含自己
				+ ") or CSYS_USER_ID='" + CsysUserView.getCsysUserId()
				+ "' and CSYS_ORG_POT_AUTH_IS_DELETE = '0' ";
		return orgUserSql;
	}

	/*
	 * 获取用户组织架构节点子节点
	 */
	private StringBuilder getChildPoint(String organizeId, String potId, StringBuilder allpoint) {
		// TODO Auto-generated method stub
		CsysOrgPot point = new CsysOrgPot();
		point.setCsysOrgPotId(organizeId);
		point.setCsysOrgPotParentId(potId);
		List<CsysOrgPot> csysOrgPotList = csysOrgPotBiz.getDataSettingsByCondition(point);
		logger.info("当前子节点长度为：" + csysOrgPotList.size());
		for (CsysOrgPot csysOrgPot : csysOrgPotList) {
			allpoint.append("'" + csysOrgPot.getCsysOrgPotId() + "',");
			// 获取当前节点子节点
			getChildPoint(organizeId, csysOrgPot.getCsysOrgPotId(), allpoint);
		}
		return allpoint;
	}
}
