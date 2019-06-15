package com.company.project.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.company.project.core.utils.DateUtils;
import com.company.project.core.utils.ProjectUtil;
import com.company.project.dao.CommonOuterUtilsMapper;
import com.company.project.model.CsysUserView;
import com.company.project.service.CommonService;

@Service
@Transactional
public class CommonServiceImpl implements CommonService {

	

	@Resource
	private CommonOuterUtilsMapper commonOuterUtilsMapper;

	@Override
	public String getSequence(String tableName) {

		Map<String, Object> map = new HashMap<String, Object>();
	
		map.put("tableName", tableName);
		map.put("cursor", oracle.jdbc.OracleTypes.CURSOR);
		System.out.println("輸出tableName：" + tableName);
		commonOuterUtilsMapper.updateOracleSequence(map);
		String sequence=commonOuterUtilsMapper.getOracleSequence(map);
//		ArrayList<Map<String, Object>> cursorList = (ArrayList<Map<String, Object>>) map.get("cursor");
//		String str = ProjectUtil.projectIdPrefix + tableName + DateUtils.newSimpleDate() + String.format("%06d",
//				new Object[] { Integer.valueOf(cursorList.get(0).get("CSYS_SEQUENCE_SEQNO").toString()) });
		System.out.println("輸出tableName-sequence：" + sequence);
		return sequence;
		 
	}

	// @Override
	// public String getOuterSequence(String tableName) {
	//
	// CommonBean commonBean = new CommonBean();
	// commonBean.setCode(tableName);
	//
	// String str = ProjectUtil.projectIdPrefix + tableName +
	// DateUtils.newSimpleDate() + String.format("%06d",
	// new Object[] {
	// Integer.valueOf(commonOuterUtilsMapper.selectBySequence(commonBean)) });
	// return str;
	// }

	@Override
	public String getSequenceNumber(String tableName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tableName", tableName);
		map.put("cursor", oracle.jdbc.OracleTypes.CURSOR);
		System.out.println("輸出tableName：" + tableName);
		commonOuterUtilsMapper.getOracleSequence(map);
		ArrayList<Map<String, Object>> cursorList = (ArrayList<Map<String, Object>>) map.get("cursor");
		 
		return cursorList.get(0).get("CSYS_SEQUENCE_SEQNO").toString();
	}

	@Override
	public String getOracleSequence(String tableName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tableName", tableName);
		map.put("cursor", oracle.jdbc.OracleTypes.CURSOR);
		System.out.println("輸出tableName：" + tableName);
		commonOuterUtilsMapper.getOracleSequence(map);
		ArrayList<Map<String, Object>> cursorList = (ArrayList<Map<String, Object>>) map.get("cursor");
		String str = ProjectUtil.projectIdPrefix + tableName + DateUtils.newSimpleDate() + String.format("%06d",
				new Object[] { Integer.valueOf(cursorList.get(0).get("CSYS_SEQUENCE_SEQNO").toString()) });
		return str;
	}

	@Override
	public List<Map<String, Object>> cloneWorkFlow(String workFlowId, CsysUserView baseUserView) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ID", workFlowId);
		map.put("USERID", baseUserView.getCsysUserId());
		map.put("rescur", oracle.jdbc.OracleTypes.CURSOR);
		commonOuterUtilsMapper.cloneWorkFlow(map);
		System.out.println("输出：" + map.get("cursor"));
		ArrayList<Map<String, Object>> cursorList = (ArrayList<Map<String, Object>>) map.get("cursor");
		return cursorList;
	}

	@Override
	public String getOracleSimpleSequence(String tableName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tableName", tableName);
		map.put("cursor", oracle.jdbc.OracleTypes.CURSOR);
		commonOuterUtilsMapper.getOracleSequence(map);
		ArrayList<Map<String, Object>> cursorList = (ArrayList<Map<String, Object>>) map.get("cursor");
		String str =  cursorList.get(0).get("CSYS_SEQUENCE_SEQNO").toString();
		return str;
	}

}
