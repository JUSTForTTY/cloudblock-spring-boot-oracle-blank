//package com.company.project.core.utils;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.apache.poi.ss.formula.functions.T;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.company.project.biz.CySysFieldTranslateBaseBiz;
//import com.company.project.biz.CySysSequenceBiz;
//import com.company.project.biz.CySysViewExplainBiz;
//
//import com.company.project.biz.OperateDataBaseBiz;
//import com.company.project.core.bean.DataBaseBean;
//
//import com.company.project.core.result.Result;
//import com.company.project.core.result.ResultGenerator;
//import com.company.project.outer.model.CsysUserView;
//import com.company.project.outer.model.CySysSequence;
//import com.company.project.outer.model.CySysFieldTranslateBase;
//import com.company.project.outer.model.CySysViewExplain;
//
//@RestController
//@RequestMapping("/base")
//public class OprateBaseTable {
//
//	@Resource
//	private OperateDataBaseBiz operateDataBaseBiz;
//
//	@Resource
//	private CySysFieldTranslateBaseBiz cySysFieldTranslateBaseBiz;
//	// 新增到翻译表
//	@Resource
//	private CySysSequenceBiz cySysSequenceBiz;
//	@Resource
//	private CySysViewExplainBiz cySysViewExplainBiz;
//
//	 @Resource
//		private AuthUtils authUtils;
//	@PostMapping
//	public Result selectData(@RequestBody DataBaseBean dataTableBean,@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token) {
//
//		// 1.把所有的用户表查询出来
//
//		Map<String, String> param = new HashMap<>();
//		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
//		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
//		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
//		String token = authMap.get("token").toString();
//		String refreshtoken=authMap.get("refreshtoken").toString();
//
//		if (!tokenFlag) {
//			/*
//			 * return code: 401 access_token无效或已过期
//			 */
//			 return ResultGenerator.genUnauthorizedResult(param);
//
//		}
//		/*---------------------------end 授权验证------------------------*/
//		
//		
//		CsysUserView baseUserView = new CsysUserView();
//		baseUserView.setCsysUserRefreshToken(refreshtoken);
//		//baseUserView.setCySysBaseUserAccessToken(refreshtoken);
//		CySysSequence cscq = new CySysSequence();
//		//try {
//System.out.println(dataTableBean.toString()+"nnnnn");
//			// 查到了所有用户t表
//			List<T> lst = operateDataBaseBiz.getAllTableShemel(dataTableBean);
//		//	List<T> lst = operateDataBaseBiz.getAllColumnField(dataTableBean);
//			// System.out.println(lst.size() + "表数据");
//
//			Iterator it1 = lst.iterator();
//
//			while (it1.hasNext()) {
//				HashMap map = (HashMap) it1.next();
//				DataBaseBean dataBaseBean = new DataBaseBean();
//				dataBaseBean.setElementName(map.get("TABLE_NAME").toString());
//				dataBaseBean.setDatabaseName(dataTableBean.getDatabaseName());	
//				//System.out.println(map.get("TABLE_NAME").toString() + "2222");
//				CySysViewExplain csve = new CySysViewExplain();
//				List<T> lst1 = operateDataBaseBiz.getAllColumnData(dataBaseBean);
//				 //System.out.println(lst1.size()+"ziduan");
//				cscq.setTablename(map.get("TABLE_NAME").toString());
//				List<CySysSequence> cySysSequencelst = cySysSequenceBiz.getDataSettingsByCondition(cscq);
//				cscq.setSeqno(0);
//				// System.out.println(cySysSequencelst.size()+"nibuhao");
//				System.out.println(map.get("TABLE_NAME").toString()+"sequence表名");
//				System.out.println(cscq.getSeqno()+"sequence增长数");
//				if (cySysSequencelst.size()>0) {
//					if (null != map.get("TABLE_NAME") && !"".equals(map.get("TABLE_NAME"))) {
//						cscq.setTablename(map.get("TABLE_NAME").toString());
//					}
//						// System.out.println(map.get("TABLE_NAME").toString()+"zxs");
//						if (null != cscq.getSeqno() && !"".equals(cscq.getSeqno())) {
//							cscq.setSeqno((cscq.getSeqno()));
//					}
//					cySysSequenceBiz.updateDataSettings(baseUserView, cscq);
//				} else {
//					if (null != map.get("TABLE_NAME") && !"".equals(map.get("TABLE_NAME"))) {
//						cscq.setTablename(map.get("TABLE_NAME").toString());
//						// System.out.println(map.get("TABLE_NAME").toString()+"zxs222");
//					}
//					if (null != cscq.getSeqno() && !"".equals(cscq.getSeqno())) {
//						cscq.setSeqno((cscq.getSeqno()));
//						// System.out.println(map.get("TABLE_NAME").toString()+"zxs222");
//					}
//					cySysSequenceBiz.insertDataSettings(baseUserView, cscq);
//				}
//				Iterator it2 = lst1.iterator();
//				csve.setCySysViewExplainName(map.get("TABLE_NAME").toString());
//				csve.setCySysViewExplainType("1");
//				 csve.setCySysViewExplainDesc(map.get("TABLE_COMMENT").toString());
//				// System.out.println(map.get("TABLE_COMMENT").toString()+"表描述");
//				csve.setCySysViewExplainIsDelete("0");
//				// csve.setCySysViewExplainCreateUser("admin");
//				// csve.setCySysViewExplainModifyUser("admin");
//				// 新增描述表
//				List<CySysViewExplain> cySysViewExplainlst = cySysViewExplainBiz.getDataSettingsByCondition(csve);
//				 // System.out.println(cySysViewExplainlst.size()+"翻译描述表");
//				
//				if (cySysViewExplainlst.size() > 0) {
//					if (null != map.get("TABLE_NAME") && !"".equals(map.get("TABLE_NAME"))) {
//						csve.setCySysViewExplainName(map.get("TABLE_NAME").toString());
//						// System.out.println("大小坏蛋"+map.get("TABLE_NAME").toString());
//					}
//					if (null != map.get("TABLE_COMMENT") && !"".equals(map.get("TABLE_COMMENT"))) {
//						csve.setCySysViewExplainDesc(map.get("TABLE_COMMENT").toString());
//						// System.out.println("大坏蛋"+map.get("TABLE_COMMENT").toString());
//					}
//					cySysViewExplainBiz.updateDataSettings(baseUserView, csve);
//
//				} else {
//
//					if (null != map.get("TABLE_NAME") && !"".equals(map.get("TABLE_NAME"))) {
//						csve.setCySysViewExplainName(map.get("TABLE_NAME").toString());
//						// System.out.println(map.get("TABLE_NAME").toString()+"nihao333");
//					}
//					if (null != map.get("TABLE_COMMENT") && !"".equals(map.get("TABLE_COMMENT"))) {
//						csve.setCySysViewExplainDesc(map.get("TABLE_COMMENT").toString());
//					}
//					cySysViewExplainBiz.insertDataSettings(baseUserView, csve);
//				}
//				while (it2.hasNext()) {
//					HashMap map2 = (HashMap) it2.next();
//					CySysFieldTranslateBase cySysFieldTranslateBase = new CySysFieldTranslateBase();
//					// System.out.println(map2.get("TABLE_NAME").toString()+"222字段数据");
//					// System.out.println(map2.get("COLUMN_NAME").toString()+"333字段数据");
//					// 判断这张表字段存不存在
//					cySysFieldTranslateBase.setCySysFieldTranslateBaseRegion(map.get("TABLE_NAME").toString());
//					// System.out.println(map.get("TABLE_NAME").toString()+"你好啊");
//					cySysFieldTranslateBase.setCySysFieldTranslateBaseName(map2.get("COLUMN_NAME").toString());
//					
//					cySysFieldTranslateBase.setCySysFieldTranslateBaseType(map2.get("DATA_TYPE").toString());
//					//cySysFieldTranslateBase.setCySysFieldTranslateBaseLength(map2.get("CHARACTER_MAXIMUM_LENGTH").toString());
//					// System.out.println(map2.get("COLUMN_NAME").toString()+"字段名");
//					List<CySysFieldTranslateBase> cySysFieldTranslateBaselst = cySysFieldTranslateBaseBiz
//							.getDataSettingsByCondition(cySysFieldTranslateBase);
//					// System.out.println("你很好");
//					// System.out.println("表达小"+cySysFieldTranslateBaselst.size());
//					// 更新翻译表数据
//					if (cySysFieldTranslateBaselst.size() > 0) {
//						// while (it2.hasNext()) {
//						// HashMap map3 = (HashMap) it2.next();
//						if (null != map2.get("COLUMN_NAME") && !"".equals(map2.get("COLUMN_NAME"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseName(map2.get("COLUMN_NAME").toString());
//						}
//						if (null != map2.get("COLUMN_COMMENT") && !"".equals(map2.get("COLUMN_COMMENT"))) {
//							cySysFieldTranslateBase
//									.setCySysFieldTranslateBaseRelname(map2.get("COLUMN_COMMENT").toString());
//						}
//						if (null != map2.get("TABLE_NAME") && !"".equals(map2.get("TABLE_NAME"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseRegion(map2.get("TABLE_NAME").toString());
//						}
//						if (null != map2.get("DATA_TYPE") && !"".equals(map2.get("DATA_TYPE"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseType(map2.get("DATA_TYPE").toString());
//						}
//						if (null != map2.get("CHARACTER_MAXIMUM_LENGTH")
//								&& !"".equals(map2.get("CHARACTER_MAXIMUM_LENGTH"))) {
//							cySysFieldTranslateBase
//									.setCySysFieldTranslateBaseLength(map2.get("CHARACTER_MAXIMUM_LENGTH").toString());
//						}
//						cySysFieldTranslateBaseBiz.updateDataSettings(baseUserView, cySysFieldTranslateBase);
//						// System.out.println("11111"+cySysFieldTranslateBase);
//						// 新增翻译表数据
//					} else {
//						if (null != map2.get("COLUMN_NAME") && !"".equals(map2.get("COLUMN_NAME"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseName(map2.get("COLUMN_NAME").toString());
//						}
//						if (null != map2.get("COLUMN_COMMENT") && !"".equals(map2.get("COLUMN_COMMENT"))) {
//							cySysFieldTranslateBase
//									.setCySysFieldTranslateBaseRelname(map2.get("COLUMN_COMMENT").toString());
//						}
//						if (null != map2.get("TABLE_NAME") && !"".equals(map2.get("TABLE_NAME"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseRegion(map2.get("TABLE_NAME").toString());
//						}
//						if (null != map2.get("DATA_TYPE") && !"".equals(map2.get("DATA_TYPE"))) {
//							cySysFieldTranslateBase.setCySysFieldTranslateBaseType(map2.get("DATA_TYPE").toString());
//						}
//						if (null != map2.get("CHARACTER_MAXIMUM_LENGTH")
//								&& !"".equals(map2.get("CHARACTER_MAXIMUM_LENGTH"))) {
//							cySysFieldTranslateBase
//									.setCySysFieldTranslateBaseLength(map2.get("CHARACTER_MAXIMUM_LENGTH").toString());
//						}
//						cySysFieldTranslateBaseBiz.insertDataSettings(baseUserView, cySysFieldTranslateBase);
//					}
//				}
//			}
//			// 2.循环数据表，插入翻译表和登记表
//			return ResultGenerator.genSuccessResult(lst, param);
//		//} catch (Exception e) {
//		//	return ResultGenerator.genServerErrorResult(param);
//		//}
//
//	}
//
//}
