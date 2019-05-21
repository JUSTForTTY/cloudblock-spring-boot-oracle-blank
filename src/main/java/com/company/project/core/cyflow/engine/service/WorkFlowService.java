package com.company.project.core.cyflow.engine.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.company.project.core.bean.JsonBean;
import netscape.javascript.JSObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.company.project.biz.CsysPotBiz;
import com.company.project.biz.CsysPotTrsBiz;
import com.company.project.biz.CsysPotTrsConBiz;
import com.company.project.biz.CsysTrsLogBiz;
import com.company.project.biz.CsysWorkflowBiz;
import com.company.project.biz.CsysWorkflowRunBiz;
import com.company.project.core.cyflow.engine.enums.WorkflowEnum;
import com.company.project.core.cyflow.engine.enums.WorkflowPotEnum;
import com.company.project.core.cyflow.engine.enums.WorkflowPotTrsAuthEnum;
import com.company.project.core.cyflow.engine.enums.WorkflowPotTrsConEnum;
import com.company.project.core.cyflow.engine.enums.WorkflowRunEnum;
import com.company.project.core.cyflow.engine.interfaces.WorkflowInterface;
import com.company.project.core.result.ResultCode;
import com.company.project.dao.CsysTrsAuthViewMapper;
import com.company.project.dao.SystemMapper;
import com.company.project.model.CsysPot;
import com.company.project.model.CsysPotTrs;
import com.company.project.model.CsysPotTrsCon;
import com.company.project.model.CsysTrsAuthView;
import com.company.project.model.CsysTrsAuthViewExample;
import com.company.project.model.CsysTrsLog;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflow;
import com.company.project.model.CsysWorkflowRun;
import com.company.project.service.CommonService;

@Service
public class WorkFlowService implements WorkflowInterface {

    @Resource
    private CsysWorkflowBiz cySysWorkflowBiz;

    @Resource
    private CsysPotBiz csysPotBiz;

    @Resource
    private CsysWorkflowRunBiz csysWorkflowRunBiz;

    @Resource
    private CsysPotTrsBiz csysPotTrsBiz;

    @Resource
    private CsysTrsAuthViewMapper csysTrsAuthViewMapper;

    @Resource
    private CsysTrsLogBiz csysTrsLogBiz;

    @Resource
    private CommonService commonService;

    @Resource
    private CsysPotTrsConBiz csysPotTrsConBiz;

    @Resource
    private SystemMapper systemMapper;

    private final Log logger = LogFactory.getLog(getClass());

    @Override
    public JSONObject onInitRun(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun)
            throws Exception {
        JSONObject object = new JSONObject();
        CsysUserView csysUserView = baseUserViewList.get(0);
        String[] tableValueArray = csysWorkflowRun.getCsysWorkflowRunTableVal().split(",");
        for (String tableValue : tableValueArray) {
            logger.info("当前主键值：" + tableValue);
            csysWorkflowRun.setCsysWorkflowRunTableVal(tableValue);
            /*
             * 第一步：判断该工作流实例是否已经生成
             */
            String csysWorkflowRunId = judgeRunIsOnInit(csysWorkflowRun);
            if (csysWorkflowRunId == null) {
                CsysWorkflow cySysWorkflow = cySysWorkflowBiz.getDataSettings(csysWorkflowRun.getCsysWorkflowId());
                if (cySysWorkflow != null) {
                    /*
                     * 第二步：根据工作流编号，获取工作流头节点信息
                     */
                    CsysPot csysPot = getWorkFlowHeadPot(csysWorkflowRun.getCsysWorkflowId());

                    if (csysPot != null) {

                        /*
                         * 第三步: 判断当前用户是否拥有初始化权限即初始迁移权限
                         */
                        JSONObject jsonObject = judgeIsTrsAuth(baseUserViewList, csysWorkflowRun.getCsysWorkflowId(),
                                null, csysPot.getCsysPotId());

                        CsysPotTrs csysPotTrs = (CsysPotTrs) jsonObject.get("CsysPotTrs");

                        if (jsonObject.getBoolean("isAutoExe") == true)
                            csysUserView = new CsysUserView();

                        if (csysPotTrs != null) {

                            /*
                             * 第四步： 生成工作流实例
                             */
                            csysWorkflowRun.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
                            csysWorkflowRunId = insertCsysWorkflowRun(csysUserView, csysWorkflowRun, cySysWorkflow,
                                    csysPot, csysPotTrs);

                            csysWorkflowRun.setCsysWorkflowRunId(csysWorkflowRunId);

                            /*
                             * 第五步：生成工作流日志（初始化工作流实例）
                             */
                            insertCsysTrsLog(csysUserView, csysWorkflowRun, csysPotTrs, "0");

                            /*
                             * 第六步：判断自动执行节点
                             */
                            autoExeCsysPot(csysWorkflowRun, csysPot.getCsysPotId());
                            object.put("status", ResultCode.SUCCESS.getMessage());
                            object.put("code", ResultCode.SUCCESS.getCode());
                        } else {
                            // 无实例化权限
                            object.put("status", ResultCode.FAIL.getCode());
                            object.put("code", WorkflowRunEnum.RunOnInitIsNotAuth.getCode());
                            object.put("msg", WorkflowRunEnum.RunOnInitIsNotAuth.getDescribtion());
                        }
                    } else {
                        // 无头结点
                        object.put("status", ResultCode.FAIL.getCode());
                        object.put("code", WorkflowPotEnum.HeadPotIsNotExists.getCode());
                        object.put("msg", WorkflowPotEnum.HeadPotIsNotExists.getDescribtion());
                    }
                } else {
                    // 工作流不存在
                    object.put("status", ResultCode.FAIL.getCode());
                    object.put("code", WorkflowEnum.WorkFlowIsNotExists.getCode());
                    object.put("msg", WorkflowEnum.WorkFlowIsNotExists.getDescribtion());
                }
            } else {
                // 该实例已存在
                object.put("status", ResultCode.FAIL.getCode());
                object.put("code", WorkflowRunEnum.RunIsExists.getCode());
                object.put("msg", WorkflowRunEnum.RunIsExists.getDescribtion());
            }
            object.put("csysWorkflowRunId", csysWorkflowRunId);
        }
        return object;
    }

    private void autoExeCsysPot(CsysWorkflowRun csysWorkflowRun, String csysPotId) throws Exception {
        // TODO Auto-generated method stub
        List<CsysPotTrs> csysPotTrsList = getAutoExeCsysPot(csysWorkflowRun.getCsysWorkflowId(), csysPotId);
        // 若存在自动执行的节点（注意：此处需要注意多向自动执行的情况，即节点并行）
        for (CsysPotTrs csysPotTrs : csysPotTrsList) {
            // 先改变工作流实例状态
            updateCsysWorkflowRunStatus(new CsysUserView(), csysWorkflowRun.getCsysWorkflowRunId(), csysPotTrs);
            // 再生成迁移日志
            insertCsysTrsLog(new CsysUserView(), csysWorkflowRun, csysPotTrs, "1");
            // 再次判断是否存在自动执行
            autoExeCsysPot(csysWorkflowRun, csysPotTrs.getCsysPotTrsPointId());
        }
    }

    private List<CsysPotTrs> getAutoExeCsysPot(String cySysWorkflowId, String csysPotId) {
        // TODO Auto-generated method stub
        CsysPotTrs csysPotTrs = new CsysPotTrs();
        csysPotTrs.setCsysWorkflowId(cySysWorkflowId);
        csysPotTrs.setCsysPotCurrentId(csysPotId);
        // 自动执行标记
        csysPotTrs.setCsysPotTrsAutoExe("1");
        List<CsysPotTrs> csysPotTransferList = csysPotTrsBiz.getDataSettingsByCondition(csysPotTrs);
        return csysPotTransferList;
    }

    @Override
    public Boolean workFlowIsLegal(String cySysWorkflowId) {
        // TODO Auto-generated method stub
        CsysWorkflow cySysWorkflow = new CsysWorkflow();
        cySysWorkflow.setCsysWorkflowId(cySysWorkflowId);
        cySysWorkflowBiz.getDataSettingsByCondition(cySysWorkflow);
        return true;
    }

    private CsysPot getWorkFlowHeadPot(String cySysWorkflowId) {
        // TODO Auto-generated method stub
        CsysPot csysPot = new CsysPot();
        // 头结点标记
        csysPot.setCsysPotType("0");
        csysPot.setCsysWorkflowId(cySysWorkflowId);
        List<CsysPot> list = csysPotBiz.getDataSettingsByCondition(csysPot);
        logger.info("头结点长度：" + list.size());
        if (list.size() > 0)
            return list.get(0);
        return null;
    }

    private String judgeRunIsOnInit(CsysWorkflowRun csysWorkflowRun) {
        // TODO Auto-generated method stub
        CsysWorkflowRun workflowRun = new CsysWorkflowRun();
        workflowRun.setCsysWorkflowId(csysWorkflowRun.getCsysWorkflowId());
        workflowRun.setCsysWorkflowRunTable(csysWorkflowRun.getCsysWorkflowRunTable());
        workflowRun.setCsysWorkflowRunTableVal(csysWorkflowRun.getCsysWorkflowRunTableVal());
        List<CsysWorkflowRun> runList = csysWorkflowRunBiz.getDataSettingsByCondition(workflowRun);
        if (runList.size() > 0) {
            return runList.get(0).getCsysWorkflowRunId();
        }
        return null;
    }

    public String insertCsysWorkflowRun(CsysUserView baseUserView, CsysWorkflowRun csysWorkflowRun,
                                        CsysWorkflow cySysWorkflow, CsysPot csysPot, CsysPotTrs csysPotTrs) throws Exception {
        // TODO Auto-generated method stub
        // 工作流运行实例对象
        // 流程编号
        // 流程名称
        // 积木编号
        // 操作表
        // 操作表主键值（多个以逗号隔开）
        csysWorkflowRun.setCsysPotName(cySysWorkflow.getCsysWorkflowName());
        // 迁移编号
        csysWorkflowRun.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
        // 节点编号
        csysWorkflowRun.setCsysPotId(csysPot.getCsysPotId());
        // 节点名称
        csysWorkflowRun.setCsysPotName(csysPot.getCsysPotName());
        // 状态：执行中
        csysWorkflowRun.setCsysWorkflowRunState("0");
        // 开始时间（总工作流）
        csysWorkflowRun.setCsysWorkflowRunStartTime(new Date());
        // 若迁移节点最低时间不为空则设置 最低时间（当前迁移节点）
        if (csysPotTrs.getCsysPotTrsLeastTime() != null) {
            if (!"0".equals(csysPotTrs.getCsysPotTrsLeastTime().toString())) {
                // 最低时间（当前迁移节点），即用当前时间加上迁移最长时间（单位为时）
                csysWorkflowRun.setCsysWorkflowRunPleastTime(new Date(
                        new Date().getTime() + (int) (csysPotTrs.getCsysPotTrsLeastTime().doubleValue() * 60 * 1000)));
            }
        } else {
            // 设置最小时间
            csysWorkflowRun.setCsysWorkflowRunPleastTime(new SimpleDateFormat("yyyy-MM-dd").parse("0000-00-00"));
        }
        // 若迁移节点最长时间不为空则设置截止时间（当前迁移节点）
        if (csysPotTrs.getCsysPotTrsLongestTime() != null) {
            if (!"0".equals(csysPotTrs.getCsysPotTrsLongestTime().toString())) {
                // 截止时间（当前迁移节点），即用当前时间加上迁移最长时间（单位为时）
                csysWorkflowRun.setCsysWorkflowRunPcloseTime(new Date(
                        new Date().getTime() + (int) (csysPotTrs.getCsysPotTrsLongestTime().doubleValue() * 60 * 1000)));
                logger.info("时间：" + csysPotTrs.getCsysPotTrsLongestTime().doubleValue());
            }
        } else {
            // 设置最大时间
            csysWorkflowRun.setCsysWorkflowRunPcloseTime(new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31"));
        }
        return csysWorkflowRunBiz.insertDataSettings(baseUserView, csysWorkflowRun);
    }

    @Override
    public JSONObject potStatusTrs(List<CsysUserView> baseUserViewList, CsysWorkflowRun workflowRun)
            throws Exception {
        JSONObject obj = new JSONObject();
        CsysUserView CsysUserView = baseUserViewList.get(0);
        /*
         * 第一步：检查工作流实例状态
         */
        JSONObject runObj = checkRunStatus(workflowRun);
        WorkflowRunEnum status = (WorkflowRunEnum) runObj.get("code");
        if (status.getCode().equals("0")) {
            /*
             * 第二步：判断当前用户是否有迁移权限
             */
            JSONObject object = judgeIsTrsAuth(baseUserViewList, null, workflowRun.getCsysPotTrsId(),
                    workflowRun.getCsysPotId());
            CsysPotTrs csysPotTrs = (CsysPotTrs) object.get("CsysPotTrs");
            if (csysPotTrs != null) {
                workflowRun = (CsysWorkflowRun) runObj.get("csysWorkflowRun");
                /*
                 * 第三步：判断是否存在迁移条件
                 */
                JSONObject cobject = judgePotTrsCon(csysPotTrs, workflowRun.getCsysWorkflowRunTableVal());
                if (!cobject.isEmpty()) {
                    return cobject;
                }
                /*
                 * 第四步：修改工作流实例状态
                 */
                CsysWorkflowRun csysWorkflowRun = updateCsysWorkflowRunStatus(CsysUserView,
                        workflowRun.getCsysWorkflowRunId(), csysPotTrs);
                /*
                 * 第五步：生成工作流日志（初始化工作流实例日志）
                 */
                insertCsysTrsLog(CsysUserView, csysWorkflowRun, csysPotTrs, "1");
                /*
                 * 第六步：判断自动执行节点
                 */
                autoExeCsysPot(workflowRun, csysPotTrs.getCsysPotTrsPointId());
                obj.put("status", ResultCode.SUCCESS.getMessage());
                obj.put("code", ResultCode.SUCCESS.getCode());
            } else {
                // 当前用户无迁移权限
                obj.put("status", ResultCode.FAIL.getMessage());
                obj.put("code", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getCode());
                obj.put("msg", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getDescribtion());
            }
        } else {
            // 工作流实例状态错误编码
            obj.put("status", ResultCode.FAIL.getMessage());
            obj.put("code", status.getCode());
            obj.put("msg", status.getDescribtion());
        }
        return obj;
    }


    //根据节点条件自动迁移
    public JSONObject potAutoTrsByCon(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) {
        JSONObject obj = new JSONObject();
        return obj;
    }

    /**
     * 根据节点获取下一个迁移对象以及条件
     */
    public JSONObject getNextTrsConByPot(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun) {
        //根据迁移条件判断当前实例执行哪一条迁移节点，即判断哪一条节点满足条件
        JSONObject object = new JSONObject();
        //获取当前用户所有角色
        List<String> roleList = getUserAllRoles(baseUserViewList);
        //获取当前节点
        String csysPotId = csysWorkflowRun.getCsysPotId();
        //定义迁移条件
        List<CsysPotTrsCon> csysPotTrsConList = new ArrayList<>();
        //定义节点迁移对象：key为迁移节点
        Map<String, CsysPotTrs> trsMap = new HashMap<>();
        /*
         * 第一步：根据工作流节点和权限获取迁移节点
         */
        CsysTrsAuthViewExample example = new CsysTrsAuthViewExample();
        // 第一种情况：拥有角色权限
        // 当前节点即为当前实例节点，所有角色
        example.or().andCsysPotCurrentIdEqualTo(csysPotId).andCsysRoleIdIn(roleList);
        // 第二种情况：节点自动执行，当前节点即为当前实例节点
        example.or().andCsysPotCurrentIdEqualTo(csysPotId).andCsysPotTrsAutoExeEqualTo("1");
        List<CsysTrsAuthView> list = csysTrsAuthViewMapper.selectByExample(example);
        /*
         * 第二步：循环所有迁移节点获取所有迁移条件，以及迁移对象
         */
        for (CsysTrsAuthView csysTrsAuthView : list) {
            String potTrsId = csysTrsAuthView.getCsysPotTrsId();
            // 迁移条件
            CsysPotTrsCon csysPotTrsCon = new CsysPotTrsCon();
            csysPotTrsCon.setCsysWorkflowId(csysTrsAuthView.getCsysWorkflowId());
            csysPotTrsCon.setCsysPotTrsId(potTrsId);
            csysPotTrsConList.addAll(csysPotTrsConBiz.getDataSettingsByCondition(csysPotTrsCon));
            // 获取迁移对象
            CsysPotTrs csysPotTrs = csysPotTrsBiz.getDataSettings(potTrsId);
            trsMap.put(potTrsId, csysPotTrs);
        }
        object.put("csysPotTrsConList", csysPotTrsConList);
        object.put("trsMap", trsMap);
        return object;
    }

    private JSONObject judgeIsTrsAuth(List<CsysUserView> baseUserViewList, String cySysWorkflowId,
                                      String csysPotTrsId, String csysPotId) {
        JSONObject jsonObject = new JSONObject();
        List<String> roleList = getUserAllRoles(baseUserViewList);
        Boolean isAutoExe = false;
        CsysTrsAuthViewExample example = new CsysTrsAuthViewExample();
        if (csysPotTrsId != null) {
            /* 节点迁移 */
            CsysTrsAuthViewExample.Criteria criteria = example.createCriteria();
            criteria.andCsysPotTrsIdEqualTo(csysPotTrsId);
            criteria.andCsysPotCurrentIdEqualTo(csysPotId);
            criteria.andCsysRoleIdIn(roleList);
        } else {
            /* 工作流实例化 */
            // 第一种情况：判断是否拥有角色权限
            // 当前节点为空，所有角色，目标节点即为当前实例节点
            example.or().andCsysPotCurrentIdIsNull().andCsysRoleIdIn(roleList).andCsysPotTrsPointIdEqualTo(csysPotId);
            // 第二种情况：头节点自动执行，当前节点为空，目标节点即为当前实例节点，自动执行标记
            example.or().andCsysPotCurrentIdIsNull().andCsysPotTrsPointIdEqualTo(csysPotId)
                    .andCsysPotTrsAutoExeEqualTo("1");
        }
        List<CsysTrsAuthView> list = csysTrsAuthViewMapper.selectByExample(example);
        if (list.size() > 0) {
            csysPotTrsId = list.get(0).getCsysPotTrsId();
            // 判断是否为自动执行
            if ("1".equals(list.get(0).getCsysPotTrsAutoExe())) {
                isAutoExe = true;
            }
        } else {
            csysPotTrsId = null;
        }
        jsonObject.put("CsysPotTrs", csysPotTrsId != null ? csysPotTrsBiz.getDataSettings(csysPotTrsId) : null);
        jsonObject.put("isAutoExe", isAutoExe);
        return jsonObject;
    }

    //获取所有角色
    public List<String> getUserAllRoles(List<CsysUserView> baseUserViewList) {
        List<String> roleList = new ArrayList<>();
        for (CsysUserView baseUserView : baseUserViewList) {
            roleList.add(baseUserView.getCsysRoleId());
        }
        return roleList;
    }

    private void insertCsysTrsLog(CsysUserView baseUserView, CsysWorkflowRun csysWorkflowRun,
                                  CsysPotTrs csysPotTrs, String type) {
        // TODO Auto-generated method stub
        CsysTrsLog csysTrsLog = new CsysTrsLog();
        csysTrsLog.setCsysWorkflowId(csysWorkflowRun.getCsysWorkflowId());
        // 节点迁移标记
        csysTrsLog.setCsysTrsLogType(type);
        csysTrsLog.setCsysUserId(baseUserView.getCsysUserId());
        csysTrsLog.setCsysTrsLogTable(csysWorkflowRun.getCsysWorkflowRunTable());
        csysTrsLog.setCsysTrsLogTableVal(csysWorkflowRun.getCsysWorkflowRunTableVal());
        csysTrsLog.setCsysWorkflowRunId(csysWorkflowRun.getCsysWorkflowRunId());
        csysTrsLog.setCsysPointTrsId(csysPotTrs.getCsysPotTrsId());
        csysTrsLog.setCsysTrsLogLastId(csysPotTrs.getCsysPotCurrentId());
        csysTrsLog.setCsysTrsLogLastName(csysPotTrs.getCsysPotCurrentName());
        csysTrsLog.setCsysTrsLogCurrentId(csysPotTrs.getCsysPotTrsPointId());
        csysTrsLog.setCsysTrsLogCurrentName(csysPotTrs.getCsysPotTrsPointName());
        csysTrsLog.setCsysTrsLogStartTime(csysWorkflowRun.getCsysWorkflowRunStartTime());
        csysTrsLog.setCsysTrsLogCloseTime(csysWorkflowRun.getCsysWorkflowRunCloseTime());
        csysTrsLog.setCsysTrsLogEndTime(csysWorkflowRun.getCsysWorkflowRunEndTime());
        csysTrsLogBiz.insertDataSettings(baseUserView, csysTrsLog);
    }

    private CsysWorkflowRun updateCsysWorkflowRunStatus(CsysUserView baseUserView, String csysWorkflowRunId,
                                                        CsysPotTrs csysPotTrs) throws Exception {
        // TODO Auto-generated method stub
        CsysWorkflowRun csysWorkflowRun = new CsysWorkflowRun();
        csysWorkflowRun.setCsysWorkflowRunId(csysWorkflowRunId);
        csysWorkflowRun.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
        csysWorkflowRun.setCsysPotId(csysPotTrs.getCsysPotTrsPointId());
        csysWorkflowRun.setCsysPotName(csysPotTrs.getCsysPotTrsPointName());
        // 开始时间（当前迁移节点）
        csysWorkflowRun.setCsysWorkflowRunPstartTime(new Date());
        // 若迁移节点最低时间不为空则设置 最低时间（当前迁移节点）
        if (csysPotTrs.getCsysPotTrsLeastTime() != null) {
            if (!"0".equals(csysPotTrs.getCsysPotTrsLeastTime().toString())) {
                // 最低时间（当前迁移节点），即用当前时间加上迁移最长时间（单位为时）
                csysWorkflowRun.setCsysWorkflowRunPleastTime(new Date(
                        new Date().getTime() + (int) (csysPotTrs.getCsysPotTrsLeastTime().doubleValue() * 60 * 1000)));
            }
        } else {
            // 设置最小时间
            csysWorkflowRun.setCsysWorkflowRunPleastTime(new SimpleDateFormat("yyyy-MM-dd").parse("0000-00-00"));
        }
        // 若迁移节点最长时间不为空则设置截止时间（当前迁移节点）
        if (csysPotTrs.getCsysPotTrsLongestTime() != null) {
            if (!"0".equals(csysPotTrs.getCsysPotTrsLongestTime().toString())) {
                // 截止时间（当前迁移节点），即用当前时间加上迁移最长时间（单位为时）
                csysWorkflowRun.setCsysWorkflowRunPcloseTime(new Date(
                        new Date().getTime() + (int) (csysPotTrs.getCsysPotTrsLongestTime().doubleValue() * 60 * 1000)));
                logger.info("时间：" + csysPotTrs.getCsysPotTrsLongestTime().doubleValue());
            }
        } else {
            // 设置最大时间
            csysWorkflowRun.setCsysWorkflowRunPcloseTime(new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31"));
        }
        csysWorkflowRunBiz.updateDataSettings(baseUserView, csysWorkflowRun);
        return csysWorkflowRunBiz.getDataSettings(csysWorkflowRunId);
    }

    @Override
    public List<CsysTrsAuthView> getTrsStatus(List<CsysUserView> baseUserViewList,
                                              CsysTrsAuthView csysTrsAuthView) {
        List<String> roleList = getUserAllRoles(baseUserViewList);
        CsysTrsAuthViewExample example = new CsysTrsAuthViewExample();
        CsysTrsAuthViewExample.Criteria criteria = example.createCriteria();
        criteria.andCsysRoleIdIn(roleList);
        criteria.andCsysWorkflowIdEqualTo(csysTrsAuthView.getCsysWorkflowId());
        criteria.andCsysPotCurrentIdEqualTo(csysTrsAuthView.getCsysPotCurrentId());
        // 当前用户角色
        return csysTrsAuthViewMapper.selectByExample(example);
    }

    public List<CsysPotTrs> getTransferStatusWithOutRole(String cySysWorkflowId, String CsysPotId) {
        // TODO Auto-generated method stub
        CsysPotTrs csysPotTrs = new CsysPotTrs();
        csysPotTrs.setCsysWorkflowId(cySysWorkflowId);
        csysPotTrs.setCsysPotTrsId(cySysWorkflowId);
        return csysPotTrsBiz.getDataSettingsByCondition(csysPotTrs);
    }

    @Override
    public JSONObject checkRunStatus(CsysWorkflowRun workflowRun) {
        JSONObject object = new JSONObject();
        // 工作流实例状态返回码
        WorkflowRunEnum code = null;
        CsysWorkflowRun csysWorkflowRun = csysWorkflowRunBiz.getDataSettings(workflowRun.getCsysWorkflowRunId());
        if (csysWorkflowRun != null) {
            String state = csysWorkflowRun.getCsysWorkflowRunState();
            // 判断查询的工作流实例状态和传过来的工作流实例状态是否相同，若状态没有改变则继续进行
            if (csysWorkflowRun.getCsysPotId().equals(workflowRun.getCsysPotId())) {
                // 检查工作流实例状态是否正常运行
                switch (state) {
                    // 1：执行中
                    case "0":
                        code = WorkflowRunEnum.RunStatusIsExecuting;
                        // 判断最少时间是否为空
                        if (csysWorkflowRun.getCsysWorkflowRunPleastTime() != null
                                && !"".equals(csysWorkflowRun.getCsysWorkflowRunPleastTime())) {
                            // 判断是否满足最少时间
                            if (csysWorkflowRun.getCsysWorkflowRunPleastTime().getTime() > new Date().getTime()) {
                                // 最少时间大于当前时间则时间不足
                                code = WorkflowRunEnum.PotTrsIsNotEnough;
                            }
                        }
                        // 判断最长时间是否为空
                        if (csysWorkflowRun.getCsysWorkflowRunPcloseTime() != null
                                && !"".equals(csysWorkflowRun.getCsysWorkflowRunPcloseTime())) {
                            // 判断最长时间是否已经超时
                            if (csysWorkflowRun.getCsysWorkflowRunPcloseTime().getTime() < new Date().getTime()) {
                                // 最长时间小于于当前时间则时间超时
                                code = WorkflowRunEnum.PotTrsOverTime;
                            }
                        }
                        break;
                    // 1：已完结（流程)
                    case "8006":
                        code = WorkflowRunEnum.RunWorkflowStatusIsEnd;
                        break;
                    // 2：已完结（节点)
                    case "8007":
                        code = WorkflowRunEnum.RunPotStatusIsEnd;
                        break;
                    // 3：已冻结（流程)
                    case "8008":
                        code = WorkflowRunEnum.RunWorkflowStatusIsFreeze;
                        break;
                    // 4:已冻结（节点）
                    case "8009":
                        code = WorkflowRunEnum.RunPotStatusIsFreeze;
                        break;
                    // 5：已过期（流程）
                    case "8010":
                        code = WorkflowRunEnum.RunWorkflowStatusIsClose;
                        break;
                    // 5：已过期（节点）
                    case "8011":
                        code = WorkflowRunEnum.RunPotStatusIsClose;
                        break;
                    default:
                        break;
                }

            } else // 状态已变更
                code = WorkflowRunEnum.RunStatusIsChange;
        } else
            // 该实例已不存在
            code = WorkflowRunEnum.RunIsNotExists;
        object.put("code", code);
        object.put("csysWorkflowRun", csysWorkflowRun);
        return object;
    }

    @Override
    public JSONObject cloneWorkFlow(CsysUserView CsysUserView, String cySysWorkflowId) {
        JSONObject object = new JSONObject();
        // 调用克隆工作流存储过程
        List<Map<String, Object>> list = commonService.cloneWorkFlow(cySysWorkflowId, CsysUserView);
        if (list.size() > 0) {
            // 获取克隆工作流编号
            String workflowId = list.get(0).get("CSYS_WORKFLOW_ID").toString();
            if (!"-1".equals(workflowId)) {
                // 重新获取工作流编号
                cySysWorkflowId = workflowId;
                object.put("status", ResultCode.SUCCESS.getMessage());
                object.put("code", ResultCode.SUCCESS.getCode());
            } else {
                // 克隆工作流失败
                object.put("status", ResultCode.FAIL.getCode());
                object.put("code", WorkflowEnum.CloneWorkFlowFail.getCode());
                object.put("msg", WorkflowEnum.CloneWorkFlowFail.getDescribtion());
            }
        } else {
            // 克隆工作流失败
            object.put("status", ResultCode.FAIL.getCode());
            object.put("code", WorkflowEnum.CloneWorkFlowFail.getCode());
            object.put("msg", WorkflowEnum.CloneWorkFlowFail.getDescribtion());
        }
        object.put("cySysWorkflowId", cySysWorkflowId);
        return object;
    }

    /**
     * 判断迁移条件
     *
     * @param csysPotTrs
     * @return
     */

    public JSONObject judgePotTrsCon(CsysPotTrs csysPotTrs, String tableValue) {
        JSONObject obj = new JSONObject();
        CsysPotTrsCon csysPotTrsCon = new CsysPotTrsCon();
        csysPotTrsCon.setCsysWorkflowId(csysPotTrs.getCsysWorkflowId());
        csysPotTrsCon.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
        List<CsysPotTrsCon> conList = csysPotTrsConBiz.getDataSettingsByCondition(csysPotTrsCon);
        // 条件标记
        Boolean conditionFlag = false;
        String conditionMsg = null;
        try {
            // 循环遍历条件
            for (CsysPotTrsCon trsCon : conList) {
                conditionFlag = false;
                // 源数据sql
                List<Map> dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConRawData()
                        .replaceAll("@id", tableValue));
                if (dataList.size() > 0) {
                    // 源数据值
                    String rawData = (dataList.get(0).get("RAWDATA").toString());
                    // 对比数据
                    String contrastData = null;
                    if (trsCon.getCsysPotTrsConContrastData().indexOf("select") < 0) {
                        // 对比数据为静态值
                        contrastData = trsCon.getCsysPotTrsConContrastData();
                    } else {
                        // 对比数据为动态sql
                        dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConContrastData()
                                .replaceAll("@id", tableValue));
                        if (dataList.size() > 0) {
                            contrastData = dataList.get(0).get("CONTRASTDATA").toString();
                        }
                    }
                    if (contrastData != null) {
                        // 源数据和对比数据进行比较
                        String method = trsCon.getCsysPotTrsConMethod();
                        switch (method) {
                            case "=":
                                if (!rawData.equals(contrastData))
                                    conditionFlag = true;
                                break;
                            case ">":
                                if (Float.parseFloat(rawData) <= Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case ">=":
                                if (Float.parseFloat(rawData) < Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case "<":
                                if (Float.parseFloat(rawData) >= Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case "<=":
                                if (Float.parseFloat(rawData) > Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            default:
                                break;
                        }
                    }
                }
                if (conditionFlag) {
                    // 提示信息
                    conditionMsg = trsCon.getCsysPotTrsConInfo();
                    break;
                }
            }
            if (conditionFlag) {
                obj.put("status", ResultCode.FAIL.getMessage());
                obj.put("code", WorkflowPotTrsConEnum.TrsConDissatisfy.getCode());
                obj.put("msg", conditionMsg != null ? conditionMsg
                        : WorkflowPotTrsConEnum.TrsConDissatisfy.getDescribtion());
                return obj;
            }
        } catch (Exception e) {
            e.printStackTrace();
            obj.put("status", ResultCode.FAIL.getMessage());
            obj.put("code", WorkflowPotTrsConEnum.TrsConException.getCode());
            obj.put("msg", WorkflowPotTrsConEnum.TrsConException.getDescribtion());
            return obj;
        }
        return obj;
    }


    /**
     * 通过实例和迁移条件获取迁移节点
     *
     * @param csysPotTrsConList
     * @param tableValue
     * @return
     */
    public String getPotTrsByCon(List<CsysPotTrsCon> csysPotTrsConList, String tableValue) {
        //根据迁移条件判断当前实例执行哪一条迁移节点，即判断哪一条节点满足条件
        String potTrsId = "";
        JSONObject obj = new JSONObject();
        // 条件标记
        Boolean conditionFlag = false;
        // 循环遍历条件
        for (CsysPotTrsCon trsCon : csysPotTrsConList) {
            try {
                // 源数据sql
                List<Map> dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConRawData()
                        .replaceAll("@id", tableValue));
                if (dataList.size() > 0) {
                    // 源数据值
                    String rawData = (dataList.get(0).get("RAWDATA").toString());
                    // 对比数据
                    String contrastData = null;
                    if (trsCon.getCsysPotTrsConContrastData().indexOf("select") < 0) {
                        // 对比数据为静态值
                        contrastData = trsCon.getCsysPotTrsConContrastData();
                    } else {
                        // 对比数据为动态sql
                        dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConContrastData()
                                .replaceAll("@id", tableValue));
                        if (dataList.size() > 0) {
                            contrastData = dataList.get(0).get("CONTRASTDATA").toString();
                        }
                    }
                    if (contrastData != null) {
                        // 源数据和对比数据进行比较
                        String method = trsCon.getCsysPotTrsConMethod();
                        switch (method) {
                            case "=":
                                if (rawData.equals(contrastData))
                                    conditionFlag = true;
                                break;
                            case ">":
                                if (Float.parseFloat(rawData) > Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case ">=":
                                if (Float.parseFloat(rawData) >= Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case "<":
                                if (Float.parseFloat(rawData) < Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            case "<=":
                                if (Float.parseFloat(rawData) <= Float.parseFloat(contrastData))
                                    conditionFlag = true;
                                break;
                            default:
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (conditionFlag == true) {
                potTrsId = trsCon.getCsysPotTrsId();
                break;
            }
        }
        return potTrsId;
    }

    @Override
    public JSONObject potStatusTrsCheck(List<CsysUserView> baseUserViewList, CsysWorkflowRun workflowRun) {
        JSONObject obj = new JSONObject();
        /*
         * 第一步：检查工作流实例状态
         */
        JSONObject runObj = checkRunStatus(workflowRun);
        WorkflowRunEnum status = (WorkflowRunEnum) runObj.get("code");
        if (status.getCode().equals("0")) {
            /*
             * 第二步：判断当前用户是否有迁移权限
             */
            Map<String, Object> map = judgeIsTrsAuth(baseUserViewList, null, workflowRun.getCsysPotTrsId(),
                    workflowRun.getCsysPotId());
            CsysPotTrs csysPotTrs = (CsysPotTrs) map.get("CsysPotTrs");
            if (csysPotTrs != null) {
                workflowRun = (CsysWorkflowRun) runObj.get("csysWorkflowRun");
                /*
                 * 第三步：判断是否存在迁移条件
                 */
                CsysPotTrsCon csysPotTrsCon = new CsysPotTrsCon();
                csysPotTrsCon.setCsysWorkflowId(csysPotTrs.getCsysWorkflowId());
                csysPotTrsCon.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
                List<CsysPotTrsCon> conList = csysPotTrsConBiz.getDataSettingsByCondition(csysPotTrsCon);
                // 条件标记
                Boolean conditionFlag = false;
                String conditionMsg = null;
                try {
                    // 循环遍历条件
                    for (CsysPotTrsCon trsCon : conList) {
                        conditionFlag = false;
                        // 源数据sql
                        List<Map> dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConRawData()
                                .replaceAll("@id", workflowRun.getCsysWorkflowRunTableVal()));
                        if (dataList.size() > 0) {
                            // 源数据值
                            String rawData = (dataList.get(0).get("RAWDATA").toString());
                            // 对比数据
                            String contrastData = null;
                            if (trsCon.getCsysPotTrsConContrastData().indexOf("select") < 0) {
                                // 对比数据为静态值
                                contrastData = trsCon.getCsysPotTrsConContrastData();
                            } else {
                                // 对比数据为动态sql
                                dataList = systemMapper.selectPublicItemList(trsCon.getCsysPotTrsConContrastData()
                                        .replaceAll("@id", workflowRun.getCsysWorkflowRunTableVal()));
                                if (dataList.size() > 0) {
                                    contrastData = dataList.get(0).get("CONTRASTDATA").toString();
                                }
                            }
                            if (contrastData != null) {
                                // 源数据和对比数据进行比较
                                String method = trsCon.getCsysPotTrsConMethod();
                                switch (method) {
                                    case "=":
                                        if (!rawData.equals(contrastData))
                                            conditionFlag = true;
                                        break;
                                    case ">":
                                        if (Float.parseFloat(rawData) <= Float.parseFloat(contrastData))
                                            conditionFlag = true;
                                        break;
                                    case ">=":
                                        if (Float.parseFloat(rawData) < Float.parseFloat(contrastData))
                                            conditionFlag = true;
                                        break;
                                    case "<":
                                        if (Float.parseFloat(rawData) >= Float.parseFloat(contrastData))
                                            conditionFlag = true;
                                        break;
                                    case "<=":
                                        if (Float.parseFloat(rawData) > Float.parseFloat(contrastData))
                                            conditionFlag = true;
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        if (conditionFlag) {
                            // 提示信息
                            conditionMsg = trsCon.getCsysPotTrsConInfo();
                            break;
                        }
                    }
                    if (conditionFlag) {
                        obj.put("status", ResultCode.FAIL.getMessage());
                        obj.put("code", WorkflowPotTrsConEnum.TrsConDissatisfy.getCode());
                        obj.put("msg", conditionMsg != null ? conditionMsg
                                : WorkflowPotTrsConEnum.TrsConDissatisfy.getDescribtion());
                        return obj;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    obj.put("status", ResultCode.FAIL.getMessage());
                    obj.put("code", WorkflowPotTrsConEnum.TrsConException.getCode());
                    obj.put("msg", WorkflowPotTrsConEnum.TrsConException.getDescribtion());
                    return obj;
                }
                obj.put("code", ResultCode.SUCCESS.getCode());
                obj.put("status", ResultCode.SUCCESS.getMessage());
            } else {
                // 当前用户无迁移权限
                obj.put("status", ResultCode.FAIL.getMessage());
                obj.put("code", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getCode());
                obj.put("msg", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getDescribtion());
            }
        } else {
            // 工作流实例状态错误编码
            obj.put("status", ResultCode.FAIL.getMessage());
            obj.put("code", status.getCode());
            obj.put("msg", status.getDescribtion());
        }
        return obj;
    }

    @Override
    public JSONObject potStatusTrsWithoutCheck(List<CsysUserView> baseUserViewList, CsysWorkflowRun workflowRun, CsysPotTrs csysPotTrs)
            throws Exception {
        JSONObject obj = new JSONObject();
        CsysUserView csysUserView = baseUserViewList.get(0);
        /*
         * 第四步：修改工作流实例状态
         */
        CsysWorkflowRun csysWorkflowRun = updateCsysWorkflowRunStatus(csysUserView,
                workflowRun.getCsysWorkflowRunId(), csysPotTrs);
        /*
         * 第五步：生成工作流日志（初始化工作流实例日志）
         */
        insertCsysTrsLog(csysUserView, csysWorkflowRun, csysPotTrs, "1");
        /*
         * 第六步：判断自动执行节点
         */
        autoExeCsysPot(workflowRun, csysPotTrs.getCsysPotTrsPointId());
        obj.put("status", ResultCode.SUCCESS.getMessage());
        obj.put("code", ResultCode.SUCCESS.getCode());
        return obj;
    }
}
