package com.company.project.core.cyflow.engine.service;

import com.alibaba.fastjson.JSONObject;
import com.company.project.biz.*;
import com.company.project.core.cyflow.engine.enums.*;
import com.company.project.core.cyflow.engine.interfaces.WorkflowInterface;
import com.company.project.core.result.ResultCode;
import com.company.project.dao.CsysPotTrsMapper;
import com.company.project.dao.CsysTrsAuthViewMapper;
import com.company.project.dao.CsysTrsLogMapper;
import com.company.project.dao.SystemMapper;
import com.company.project.model.*;
import com.company.project.service.CommonService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Resource
    CsysPotTrsMapper csysPotTrsMapper;

    @Resource
    CsysTrsLogMapper csysTrsLogMapper;

    private final Log logger = LogFactory.getLog(getClass());

    @Override
    public JSONObject onInitRun(List<CsysUserView> baseUserViewList, CsysWorkflowRun csysWorkflowRun)
            throws Exception {
        JSONObject obj = new JSONObject();
        CsysUserView csysUserView = baseUserViewList.get(0);
        String[] tableValueArray = csysWorkflowRun.getCsysWorkflowRunTableVal().split(",");
        for (String tableValue : tableValueArray) {
            logger.info("当前主键值：" + tableValue);
            csysWorkflowRun.setCsysWorkflowRunTableVal(tableValue);
            /*
             * 第一步：判断该工作流实例是否已经生成
             */
            String csysWorkflowRunId = judgeRunIsOnInit(csysWorkflowRun);
            /*
             * 第二步：判断该工作流是否存在
             */
            if (csysWorkflowRunId == null) {
                CsysWorkflow cySysWorkflow = cySysWorkflowBiz.getDataSettings(csysWorkflowRun.getCsysWorkflowId());
                if (cySysWorkflow != null) {
                    /*
                     * 第三步：根据工作流编号，获取工作流头节点信息
                     */
                    CsysPot csysPot = getWorkFlowHeadPot(csysWorkflowRun.getCsysWorkflowId());

                    if (csysPot != null) {
                        /*
                         * 第四步: 判断当前用户是否拥有初始化权限即初始迁移权限
                         */
                        obj = getTrsObj("onInit", baseUserViewList,
                                null, csysPot.getCsysPotId(), csysWorkflowRun.getCsysWorkflowRunTableVal());
                        if (obj.getInteger("code") == ResultCode.SUCCESS.getCode()) {
                            CsysPotTrs csysPotTrs = ((List<CsysPotTrs>) obj.get("csysPotTrsList")).get(0);
                            obj = new JSONObject();
                            /*
                             * 第五步： 生成工作流实例
                             */
                            csysWorkflowRun.setCsysPotTrsId(csysPotTrs.getCsysPotTrsId());
                            csysWorkflowRunId = insertCsysWorkflowRun(csysUserView, csysWorkflowRun, cySysWorkflow,
                                    csysPot, csysPotTrs);

                            csysWorkflowRun.setCsysWorkflowRunId(csysWorkflowRunId);
                            /*
                             * 第六步：生成工作流日志（初始化工作流实例）
                             */
                            insertCsysTrsLog(csysUserView, csysWorkflowRun, csysPotTrs, "0");
                            /*
                             * 第七步：判断自动执行节点
                             */
                            autoExeCsysPot(csysWorkflowRun, csysPot.getCsysPotId());
                            obj.put("status", ResultCode.SUCCESS.getMessage());
                            obj.put("code", ResultCode.SUCCESS.getCode());
                        } else {
                            // 无实例化权限、迁移条件不满足、迁移条件异常
                            return obj;
                        }
                    } else {
                        // 无头结点
                        obj.put("status", ResultCode.FAIL.getCode());
                        obj.put("code", WorkflowPotEnum.HeadPotIsNotExists.getCode());
                        obj.put("msg", WorkflowPotEnum.HeadPotIsNotExists.getDescribtion());
                    }
                } else {
                    // 工作流不存在
                    obj.put("status", ResultCode.FAIL.getCode());
                    obj.put("code", WorkflowEnum.WorkFlowIsNotExists.getCode());
                    obj.put("msg", WorkflowEnum.WorkFlowIsNotExists.getDescribtion());
                }
            } else {
                // 该实例已存在
                obj.put("status", ResultCode.FAIL.getCode());
                obj.put("code", WorkflowRunEnum.RunIsExists.getCode());
                obj.put("msg", WorkflowRunEnum.RunIsExists.getDescribtion());
            }
            obj.put("csysWorkflowRunId", csysWorkflowRunId);
        }
        return obj;
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
    public CsysPot getWorkFlowHeadPot(String cySysWorkflowId) {
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
    public JSONObject getTrsStatus(List<CsysUserView> baseUserViewList,
                                   CsysWorkflowRun csysWorkflowRun) {
        /*
         * 第一步：检查工作流实例状态
         */
        JSONObject obj = checkRunStatus(csysWorkflowRun);
        csysWorkflowRun = (CsysWorkflowRun) obj.get("csysWorkflowRun");
        WorkflowRunEnum status = (WorkflowRunEnum) obj.get("code");
        if (status.getCode().equals("0")) {
            /*
             * 第二步：判断当前用户是否有迁移权限
             */
            obj = getTrsObj("getTrs", baseUserViewList, csysWorkflowRun.getCsysPotTrsId(), csysWorkflowRun.getCsysPotId(), csysWorkflowRun.getCsysWorkflowRunTableVal());
        }
        return obj;
    }

    /**
     * @param baseUserViewList
     * @param workflowRun
     * @return
     * @throws Exception
     */
    @Override
    public JSONObject potStatusTrs(List<CsysUserView> baseUserViewList, CsysWorkflowRun workflowRun)
            throws Exception {
        CsysUserView csysUserView = baseUserViewList.get(0);
        /*
         * 第一步：检查工作流实例状态
         */
        JSONObject obj = checkRunStatus(workflowRun);
        workflowRun = (CsysWorkflowRun) obj.get("csysWorkflowRun");
        WorkflowRunEnum status = (WorkflowRunEnum) obj.get("code");
        if (status.getCode().equals("0")) {
            /*
             * 第二步：判断当前用户是否有迁移权限
             */
            obj = getTrsObj("potTrs", baseUserViewList, workflowRun.getCsysPotTrsId(),
                    workflowRun.getCsysPotId(), workflowRun.getCsysWorkflowRunTableVal());
            if (obj.getInteger("code") == ResultCode.SUCCESS.getCode()) {
                CsysPotTrs csysPotTrs = ((List<CsysPotTrs>) obj.get("csysPotTrsList")).get(0);
                /*
                 * 第三步：节点迁移
                 */
                obj = potStatusTrsWithoutCheck(csysUserView, workflowRun, csysPotTrs);
            } else {
                // 无迁移权限、迁移条件不满足、迁移条件异常
                return obj;
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
    public JSONObject potStatusTrsWithoutCheck(CsysUserView csysUserView, CsysWorkflowRun
            workflowRun, CsysPotTrs csysPotTrs)
            throws Exception {
        JSONObject obj = new JSONObject();
        /*
         * 第一步：修改工作流实例状态
         */
        CsysWorkflowRun csysWorkflowRun = updateCsysWorkflowRunStatus(csysUserView,
                workflowRun.getCsysWorkflowRunId(), csysPotTrs);
        /*
         * 第二步：生成工作流日志（初始化工作流实例日志）
         */
        insertCsysTrsLog(csysUserView, csysWorkflowRun, csysPotTrs, "1");
        /*
         * 第三步：判断自动执行节点
         */
        autoExeCsysPot(workflowRun, csysPotTrs.getCsysPotTrsPointId());
        obj.put("status", ResultCode.SUCCESS.getMessage());
        obj.put("code", ResultCode.SUCCESS.getCode());
        return obj;
    }

    /**
     * 获取迁移对象
     *
     * @param baseUserViewList
     * @param csysPotTrsId
     * @param csysPotId
     * @return
     */
    private JSONObject getTrsObj(String operate, List<CsysUserView> baseUserViewList,
                                 String csysPotTrsId, String csysPotId, String value) {
        JSONObject obj = new JSONObject();
        List<String> trsList = new ArrayList<>();
        List<String> roleList = getUserAllRoles(baseUserViewList);
        CsysTrsAuthViewExample example = new CsysTrsAuthViewExample();
        CsysTrsAuthViewExample.Criteria criteria = example.createCriteria();
        if (operate.equals("getTrs")) {
            /*获取迁移对象 */
            criteria.andCsysRoleIdIn(roleList);
            criteria.andCsysPotCurrentIdEqualTo(csysPotId);
        } else if (operate.equals("potTrs")) {
            /* 节点迁移 */
            criteria.andCsysPotTrsIdEqualTo(csysPotTrsId);
            criteria.andCsysRoleIdIn(roleList);
        } else if (operate.equals("onInit")) {
            /* 工作流实例化 */
            // 第一种情况：判断是否拥有角色权限
            // 当前节点为空，所有角色，目标节点即为当前实例节点
            criteria.andCsysPotCurrentIdIsNull().andCsysRoleIdIn(roleList).andCsysPotTrsPointIdEqualTo(csysPotId);
            // 第二种情况：头节点自动执行，当前节点为空，目标节点即为当前实例节点，自动执行标记
            //example.or().andCsysPotCurrentIdIsNull().andCsysPotTrsPointIdEqualTo(csysPotId).andCsysPotTrsAutoExeEqualTo("1");
        }
        List<CsysTrsAuthView> authViewList = csysTrsAuthViewMapper.selectByExample(example);
        if (authViewList.size() > 0) {
            //取出不同角色下的相同迁移对象
            List<CsysTrsAuthView> newList = new ArrayList();
            Set<String> set = new HashSet();
            for (CsysTrsAuthView csysTrsAuthView : authViewList) {
                String trsId = csysTrsAuthView.getCsysPotTrsId();
                if (!set.contains(trsId)) { //set中不包含重复的
                    set.add(trsId);
                    newList.add(csysTrsAuthView);
                }
            }
            //判断是否存在迁移条件
            for (CsysTrsAuthView authView : newList) {
                JSONObject object = judgePotTrsCon(authView.getCsysPotTrsId(), value);
                if (object.isEmpty()) {
                    //满足迁移条件
                    trsList.add(authView.getCsysPotTrsId());
                } else {
                    //记录不满足迁移条件
                    if (obj.isEmpty()) {
                        obj = object;
                    }
                }
            }
        } else {
            //无迁移权限
            obj.put("status", ResultCode.FAIL.getMessage());
            obj.put("code", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getCode());
            obj.put("msg", WorkflowPotTrsAuthEnum.PotTrsIsNotAuth.getDescribtion());
        }
        if (trsList.size() > 0) {
            obj.put("code", ResultCode.SUCCESS.getCode());
            //获取满足迁移对象
            CsysPotTrsExample trsExample = new CsysPotTrsExample();
            trsExample.createCriteria().andCsysPotTrsIdIn(trsList);
            List<CsysPotTrs> csysPotTrsList = csysPotTrsMapper.selectByExample(trsExample);
            obj.put("csysPotTrsList", csysPotTrsList);
        }
        return obj;
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
     * @param csysPotTrsId
     * @return
     */

    public JSONObject judgePotTrsCon(String csysPotTrsId, String tableValue) {
        JSONObject obj = new JSONObject();
        List<CsysPotTrsCon> conList = getConByTrsId(csysPotTrsId);
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
     * 获取迁移条件
     *
     * @param
     */
    public List<CsysPotTrsCon> getConByTrsId(String csysPotTrsId) {
        CsysPotTrsCon csysPotTrsCon = new CsysPotTrsCon();
        csysPotTrsCon.setCsysPotTrsId(csysPotTrsId);
        return csysPotTrsConBiz.getDataSettingsByCondition(csysPotTrsCon);
    }

    /**
     * 通过日志获取实例上一个节点信息
     */
    @Override
    public CsysTrsLog getRunLastPot(CsysWorkflowRun csysWorkflowRun) {
        CsysTrsLogExample csysTrsLogExample = new CsysTrsLogExample();
        //根据创建时间降序排序
        csysTrsLogExample.setOrderByClause("CSYS_TRS_LOG_CREATE_TIME DESC");
        csysTrsLogExample.createCriteria().
                andCsysTrsLogTableEqualTo(csysWorkflowRun.getCsysWorkflowRunTable()).
                andCsysTrsLogTableValEqualTo(csysWorkflowRun.getCsysWorkflowRunTableVal()).
                andCsysPointTrsIdEqualTo(csysWorkflowRun.getCsysPotTrsId());
        List<CsysTrsLog> csysTrsLogList = csysTrsLogMapper.selectByExample(csysTrsLogExample);
        if (csysTrsLogList.size() > 0) {
            return csysTrsLogList.get(0);
        }
        return null;
    }

    /**
     * 获取下一个站点信息
     */
    @Override
    public CsysPotTrs getNextPot(String workflowId, String potId) {
        CsysPotTrs csysPotTrs = new CsysPotTrs();
        csysPotTrs.setCsysWorkflowId(workflowId);
        csysPotTrs.setCsysPotCurrentId(potId);
        List<CsysPotTrs> csysPotTrsList = csysPotTrsBiz.getDataSettingsByCondition(csysPotTrs);
        if (csysPotTrsList.size() > 0) {
            return csysPotTrsList.get(0);
        }
        return null;
    }

}
