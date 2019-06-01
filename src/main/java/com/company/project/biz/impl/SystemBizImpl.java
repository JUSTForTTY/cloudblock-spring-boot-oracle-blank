package com.company.project.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.company.project.model.CsysUserView;
import com.company.project.model.CsysWorkflowRun;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.biz.SystemBiz;
import com.company.project.core.bean.CascaderBean;
import com.company.project.core.bean.ChartDataBean;
import com.company.project.core.bean.DeleteDataBean;
import com.company.project.core.bean.DynamicJsonBean;
import com.company.project.core.bean.JsonBean;
import com.company.project.core.bean.JsonCompareBean;
import com.company.project.core.bean.ResultBean;
import com.company.project.core.bean.TableDataBean;
import com.company.project.core.bean.TableSaveBean;
import com.company.project.core.bean.ValidationBean;
import com.company.project.core.cyflow.engine.interfaces.WorkflowInterface;
import com.company.project.service.SystemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Component
public class SystemBizImpl implements SystemBiz {

    private final Log logger = LogFactory.getLog(getClass());

    @Resource
    private SystemService systemService;

    @Resource
    private WorkflowInterface workflowInterface;

    @Override
    @Transactional
    public ResultBean getTableData(List<CsysUserView> baseUserList, TableDataBean tableDataBean) {
        PageHelper.startPage(tableDataBean.getNowPage(), tableDataBean.getPageSize());
        CsysUserView baseUserView = baseUserList.get(0);
        // 查询数据
        List<Map<String, Object>> list = systemService.getTableData(baseUserView, tableDataBean.getTableColumn(),
                tableDataBean.getTableName(), tableDataBean.getTableSort(), tableDataBean.getSearchMap(),
                tableDataBean.getDeleteFlag(), tableDataBean.getEngineMap());

        List<Map<String, Object>> extraData = getEngineData(tableDataBean.getEngineMap(), baseUserList, null);

        PageInfo pageInfo = new PageInfo(list);

        ResultBean resultBean = new ResultBean();

        resultBean.setData(pageInfo);
        resultBean.setExtraData(extraData);

        return resultBean;
    }

    @Override
    public List<Map<String, Object>> getEngineData(Map<String, List<JsonBean>> engineMap, List<CsysUserView> baseUserList, String id) {
        for (Map.Entry<String, List<JsonBean>> entry : engineMap.entrySet()) {
            if ("procedure".equals(entry.getKey())) {
                if (!entry.getValue().isEmpty()) {
                    for (JsonBean jsonBean : entry.getValue()) {
                        // 调用存储过程
                        DynamicJsonBean dynamicJsonBean = new DynamicJsonBean();
                        dynamicJsonBean.setDynamicSql(jsonBean.getName());
                        dynamicJsonBean.setParamMap(jsonBean.getCompositeValue());
                        logger.info("参数尺寸" + jsonBean.getCompositeValue().size());

                        // 替换新增或更新記錄参数值
                        List<JsonBean> params = dynamicJsonBean.getParamMap();

                        logger.info("参数尺寸" + params.size());
                        for (JsonBean param : params) {
                            if ("&id&".equals(param.getName())) {
                                param.setValue(id);
                            }
                        }
                        return dynamicProcedure(dynamicJsonBean, baseUserList);
                    }
                }
            }
        }
        return null;
    }

    @Override
    @Transactional
    public ResultBean updateTableData(TableDataBean tableDataBean, List<CsysUserView> baseUserViewList) {

        String returnsequence = systemService.updateTableData(tableDataBean.getTableName(),
                tableDataBean.getUpdateMap(), tableDataBean.getPrimaryMap());

        List<Map<String, Object>> extraData = getEngineData(tableDataBean.getEngineMap(), baseUserViewList, returnsequence);

        ResultBean resultBean = new ResultBean();

        resultBean.setStringData(returnsequence);

        resultBean.setExtraData(extraData);

        return resultBean;

    }

    @Override
    @Transactional
    public ResultBean logicalDeleteData(DeleteDataBean deleteDataBean, List<CsysUserView> baseUserList) {
        CsysUserView cySysBaseUserView = baseUserList.get(0);
        systemService.logicalDeleteData(deleteDataBean.getTableName(), deleteDataBean.getDeleteFlag(),
                deleteDataBean.getPrimaryMap());

        List<Map<String, Object>> extraData = getEngineData(deleteDataBean.getEngineMap(), baseUserList, null);

        ResultBean resultBean = new ResultBean();

        resultBean.setExtraData(extraData);

        return resultBean;
    }

    @Override
    @Transactional
    public ResultBean physicalDeleteData(DeleteDataBean deleteDataBean, List<CsysUserView> baseUserList) {

        systemService.physicalDeleteData(deleteDataBean.getTableName(), deleteDataBean.getPrimaryMap());

        List<Map<String, Object>> extraData = getEngineData(deleteDataBean.getEngineMap(), baseUserList, null);

        ResultBean resultBean = new ResultBean();

        resultBean.setExtraData(extraData);
        return resultBean;
    }

    @Override
    public PageInfo getDynamicSql(DynamicJsonBean dynamicJsonBean, List<CsysUserView> baseUserList) {
        CsysUserView cySysBaseUserView = baseUserList.get(0);
        PageHelper.startPage(dynamicJsonBean.getNowPage(), dynamicJsonBean.getPageSize());

        String dynamicSql = dynamicJsonBean.getDynamicSql();
        // 替换参数值
        for (JsonBean jsonBean : dynamicJsonBean.getParamMap()) {

            dynamicSql = dynamicSql.replaceAll(jsonBean.getName(), "'" + jsonBean.getValue() + "'");
        }

        dynamicSql = dynamicSql.replaceAll("#", "'");

        dynamicSql = dynamicSql.replaceAll("&userid&", cySysBaseUserView.getCsysUserId()).replaceAll("&roleid&",
                cySysBaseUserView.getCsysRoleId());

        List<Map<String, Object>> list = systemService.getDynamicSql(dynamicSql, dynamicJsonBean.getTableSort(),
                dynamicJsonBean.getSearchMap());

        PageInfo pageInfo = new PageInfo(list);

        return pageInfo;
    }

    @Override
    @Transactional
    public List<Map<String, Object>> dynamicProcedure(DynamicJsonBean dynamicJsonBean,
                                                      List<CsysUserView> baseUserList) {
        CsysUserView cySysBaseUserView = baseUserList.get(0);
        String dynamicSql = dynamicJsonBean.getDynamicSql();

        // 替换参数值
        List<JsonBean> params = dynamicJsonBean.getParamMap();

        logger.info("参数尺寸" + params.size());
        for (JsonBean jsonBean : params) {
            if ("&userid&".equals(jsonBean.getName())) {
                jsonBean.setValue(cySysBaseUserView.getCsysUserId());
            }
        }
        List<Map<String, Object>> list = systemService.dynamicProcedure(dynamicSql, params);

        try {
            // 循环存储过程返回值
            for (Map<String, Object> map : list) {
                logger.info("存储过程返回");
                logger.info(map.get("CSYS_RETURN"));
                if (map.get("CSYS_RETURN") != null) {
                    String csysReturn = map.get("CSYS_RETURN").toString();
                    /*存储过程业务提示标识：1.success：成功；2.fail：失败；3.warning：警告；4.info：信息*/
                    //成功
                    if ("1".equals(csysReturn)) {
                        if (map.get("CSYS_OPERATE") != null) {
                            if ("onInitRun".equals(map.get("CSYS_OPERATE").toString())) {
                                logger.info("实例化操作");
                                CsysWorkflowRun csysWorkflowRun = new CsysWorkflowRun();
                                csysWorkflowRun.setCsysWorkflowId(map.get("CSYS_WORKFLOWID").toString());
                                csysWorkflowRun
                                        .setCsysWorkflowRunTable(map.get("CSYS_TABLENAME").toString());
                                csysWorkflowRun
                                        .setCsysWorkflowRunTableVal(map.get("CSYS_TABLEVALUE").toString());
                                workflowInterface.onInitRun(baseUserList, csysWorkflowRun);
                            }
                        }
                        //失败
                    } else if ("2".equals(csysReturn)) {
                        //判断是否需要回滚
                        if (map.get("CSYS_ROLLBACK") != null) {
                            if ("1".equals(map.get("CSYS_ROLLBACK").toString())) {
                                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); //手动开启事务回滚
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public PageInfo getChartData(ChartDataBean chartDataBean) {
        PageHelper.startPage(chartDataBean.getNowPage(), chartDataBean.getPageSize());

        // 查询数据
        List<Map<String, Object>> list = systemService.getChartData(chartDataBean.getChartColumnList(),
                chartDataBean.getTableName(), chartDataBean.getTableSort(), chartDataBean.getTableGroup(),
                chartDataBean.getSearchMap(), chartDataBean.getDeleteFlag());

        PageInfo pageInfo = new PageInfo(list);

        return pageInfo;
    }

    @Override
    public List<Map<String, Object>> getCascaderData(CascaderBean cascaderBean) {

        return systemService.getCascaderData(cascaderBean);
    }

    @Override
    @Transactional
    public ResultBean saveTableData(TableSaveBean tableSaveBean, List<CsysUserView> baseUserList) {
        CsysUserView cySysBaseUserView = baseUserList.get(0);
        String returnsequence = systemService.saveTableData(tableSaveBean.getTableName(), tableSaveBean.getPrimaryKey(),
                tableSaveBean.getData(), tableSaveBean.getSystemData(), tableSaveBean.getDeleteFlag(),
                cySysBaseUserView);

        List<Map<String, Object>> extraData = getEngineData(tableSaveBean.getEngineMap(), baseUserList, returnsequence);
        ResultBean resultBean = new ResultBean();

        resultBean.setStringData(returnsequence);
        resultBean.setExtraData(extraData);

        return resultBean;
    }

    @Override
    public Map<String, List<Map<String, Object>>> preSearchTableData(List<TableDataBean> tableDataList) {

        /**
         * 循环查询数据，如果数据中存在动态数据，则反查源数据；如果为静态数据，xx
         */
        Map<String, List<Map<String, Object>>> sourceData = new HashMap<>();

        for (TableDataBean td : tableDataList) {

            // 查询出数据源。将数据源进行组装

            List<Map<String, Object>> item = systemService.preSearchTableData(td.getSourceid(), td.getTableColumn(),
                    td.getTableName(), td.getTableSort(), td.getSearchMap(), td.getPrimaryMap(), td.getDeleteFlag(),
                    sourceData);
            sourceData.put(td.getSourceid(), item);

            // 将数据源传入查询方法

        }

        return sourceData;
    }

    @Override
    @Transactional
    public ResultBean updateTableData(TableSaveBean tableSaveBean, List<CsysUserView> baseUserList) {
        CsysUserView cySysBaseUserView = baseUserList.get(0);
        String returnsequence = systemService.updateTableData(tableSaveBean.getTableName(),
                tableSaveBean.getPrimaryKey(), tableSaveBean.getData(), tableSaveBean.getSystemData(),
                tableSaveBean.getDeleteFlag(), cySysBaseUserView);

        List<Map<String, Object>> extraData = getEngineData(tableSaveBean.getEngineMap(), baseUserList, null);
        ResultBean resultBean = new ResultBean();
        resultBean.setStringData(returnsequence);
        resultBean.setExtraData(extraData);
        return resultBean;
    }

    @Override
    public boolean validationData(ValidationBean validationBean, CsysUserView cySysBaseUserView) {

        // 替换sql中系统参数
        for (JsonCompareBean jc : validationBean.getCompareValue()) {
            if ("senior".equals(validationBean.getMode())) {
                jc.setCompareObject(jc.getCompareObject().replaceAll("&userid&", cySysBaseUserView.getCsysUserId())
                        .replaceAll("&roleid&", cySysBaseUserView.getCsysRoleId())
                        .replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
            }
            if (null != jc.getAdditional() && !"".equals(jc.getAdditional())) {
                jc.setAdditional(jc.getAdditional().replaceAll("&userid&", cySysBaseUserView.getCsysUserId())
                        .replaceAll("&roleid&", cySysBaseUserView.getCsysRoleId())
                        .replaceAll("&currentvalue&", validationBean.getCurrentValue().getValue()));
            }
        }

        List<Map<String, Object>> list = systemService.validationData(validationBean.getTableName(),
                validationBean.getMode(), validationBean.getCurrentValue(), validationBean.getCompareValue());

        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

}
