package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_WORKFLOW_RUN")
public class CsysWorkflowRun {
    @Id
    @Column(name = "CSYS_WORKFLOW_RUN_ID")
    private String csysWorkflowRunId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_WORKFLOW_RUN_PARENT_ID")
    private String csysWorkflowRunParentId;

    @Column(name = "CSYS_POT_TRS_ID")
    private String csysPotTrsId;

    @Column(name = "CY_SYS_BLOCK_ID")
    private String cySysBlockId;

    @Column(name = "CY_SYS_BLOCK_RUNTIME_ID")
    private String cySysBlockRuntimeId;

    @Column(name = "CSYS_WORKFLOW_RUN_TABLE")
    private String csysWorkflowRunTable;

    @Column(name = "CSYS_WORKFLOW_RUN_TABLE_VAL")
    private String csysWorkflowRunTableVal;

    @Column(name = "CSYS_POT_ID")
    private String csysPotId;

    @Column(name = "CSYS_POT_NAME")
    private String csysPotName;

    @Column(name = "CSYS_WORKFLOW_RUN_STATE")
    private String csysWorkflowRunState;

    @Column(name = "CSYS_WORKFLOW_RUN_NUMBE")
    private String csysWorkflowRunNumbe;

    @Column(name = "CSYS_WORKFLOW_RUN_START_TIME")
    private Date csysWorkflowRunStartTime;

    @Column(name = "CSYS_WORKFLOW_RUN_CLOSE_TIME")
    private Date csysWorkflowRunCloseTime;

    @Column(name = "CSYS_WORKFLOW_RUN_END_TIME")
    private Date csysWorkflowRunEndTime;

    @Column(name = "CSYS_WORKFLOW_RUN_FREEZE_TIME")
    private Date csysWorkflowRunFreezeTime;

    @Column(name = "CSYS_WORKFLOW_RUN_DESC")
    private String csysWorkflowRunDesc;

    @Column(name = "CSYS_WORKFLOW_RUN_CREATE_TIME")
    private Date csysWorkflowRunCreateTime;

    @Column(name = "CSYS_WORKFLOW_RUN_MODIFY_TIME")
    private Date csysWorkflowRunModifyTime;

    @Column(name = "CSYS_WORKFLOW_RUN_CREATE_USER")
    private String csysWorkflowRunCreateUser;

    @Column(name = "CSYS_WORKFLOW_RUN_MODIFY_USER")
    private String csysWorkflowRunModifyUser;

    @Column(name = "CSYS_WORKFLOW_RUN_IS_DELETE")
    private String csysWorkflowRunIsDelete;

    @Column(name = "CSYS_WORKFLOW_RUN_TIME")
    private Date csysWorkflowRunTime;

    @Column(name = "CSYS_WORKFLOW_RUN_DATE")
    private Date csysWorkflowRunDate;

    @Column(name = "CSYS_WORKFLOW_RUN_PSTART_TIME")
    private Date csysWorkflowRunPstartTime;

    @Column(name = "CSYS_WORKFLOW_RUN_PCLOSE_TIME")
    private Date csysWorkflowRunPcloseTime;

    @Column(name = "CSYS_WORKFLOW_RUN_PEND_TIME")
    private Date csysWorkflowRunPendTime;

    @Column(name = "CSYS_WORKFLOW_RUN_PFREEZE_TIME")
    private Date csysWorkflowRunPfreezeTime;

    @Column(name = "CSYS_WORKFLOW_RUN_PLEAST_TIME")
    private Date csysWorkflowRunPleastTime;

    /**
     * @return CSYS_WORKFLOW_RUN_ID
     */
    public String getCsysWorkflowRunId() {
        return csysWorkflowRunId;
    }

    /**
     * @param csysWorkflowRunId
     */
    public void setCsysWorkflowRunId(String csysWorkflowRunId) {
        this.csysWorkflowRunId = csysWorkflowRunId;
    }

    /**
     * @return CSYS_WORKFLOW_ID
     */
    public String getCsysWorkflowId() {
        return csysWorkflowId;
    }

    /**
     * @param csysWorkflowId
     */
    public void setCsysWorkflowId(String csysWorkflowId) {
        this.csysWorkflowId = csysWorkflowId;
    }

    /**
     * @return CSYS_WORKFLOW_NAME
     */
    public String getCsysWorkflowName() {
        return csysWorkflowName;
    }

    /**
     * @param csysWorkflowName
     */
    public void setCsysWorkflowName(String csysWorkflowName) {
        this.csysWorkflowName = csysWorkflowName;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PARENT_ID
     */
    public String getCsysWorkflowRunParentId() {
        return csysWorkflowRunParentId;
    }

    /**
     * @param csysWorkflowRunParentId
     */
    public void setCsysWorkflowRunParentId(String csysWorkflowRunParentId) {
        this.csysWorkflowRunParentId = csysWorkflowRunParentId;
    }

    /**
     * @return CSYS_POT_TRS_ID
     */
    public String getCsysPotTrsId() {
        return csysPotTrsId;
    }

    /**
     * @param csysPotTrsId
     */
    public void setCsysPotTrsId(String csysPotTrsId) {
        this.csysPotTrsId = csysPotTrsId;
    }

    /**
     * @return CY_SYS_BLOCK_ID
     */
    public String getCySysBlockId() {
        return cySysBlockId;
    }

    /**
     * @param cySysBlockId
     */
    public void setCySysBlockId(String cySysBlockId) {
        this.cySysBlockId = cySysBlockId;
    }

    /**
     * @return CY_SYS_BLOCK_RUNTIME_ID
     */
    public String getCySysBlockRuntimeId() {
        return cySysBlockRuntimeId;
    }

    /**
     * @param cySysBlockRuntimeId
     */
    public void setCySysBlockRuntimeId(String cySysBlockRuntimeId) {
        this.cySysBlockRuntimeId = cySysBlockRuntimeId;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_TABLE
     */
    public String getCsysWorkflowRunTable() {
        return csysWorkflowRunTable;
    }

    /**
     * @param csysWorkflowRunTable
     */
    public void setCsysWorkflowRunTable(String csysWorkflowRunTable) {
        this.csysWorkflowRunTable = csysWorkflowRunTable;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_TABLE_VAL
     */
    public String getCsysWorkflowRunTableVal() {
        return csysWorkflowRunTableVal;
    }

    /**
     * @param csysWorkflowRunTableVal
     */
    public void setCsysWorkflowRunTableVal(String csysWorkflowRunTableVal) {
        this.csysWorkflowRunTableVal = csysWorkflowRunTableVal;
    }

    /**
     * @return CSYS_POT_ID
     */
    public String getCsysPotId() {
        return csysPotId;
    }

    /**
     * @param csysPotId
     */
    public void setCsysPotId(String csysPotId) {
        this.csysPotId = csysPotId;
    }

    /**
     * @return CSYS_POT_NAME
     */
    public String getCsysPotName() {
        return csysPotName;
    }

    /**
     * @param csysPotName
     */
    public void setCsysPotName(String csysPotName) {
        this.csysPotName = csysPotName;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_STATE
     */
    public String getCsysWorkflowRunState() {
        return csysWorkflowRunState;
    }

    /**
     * @param csysWorkflowRunState
     */
    public void setCsysWorkflowRunState(String csysWorkflowRunState) {
        this.csysWorkflowRunState = csysWorkflowRunState;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_NUMBE
     */
    public String getCsysWorkflowRunNumbe() {
        return csysWorkflowRunNumbe;
    }

    /**
     * @param csysWorkflowRunNumbe
     */
    public void setCsysWorkflowRunNumbe(String csysWorkflowRunNumbe) {
        this.csysWorkflowRunNumbe = csysWorkflowRunNumbe;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_START_TIME
     */
    public Date getCsysWorkflowRunStartTime() {
        return csysWorkflowRunStartTime;
    }

    /**
     * @param csysWorkflowRunStartTime
     */
    public void setCsysWorkflowRunStartTime(Date csysWorkflowRunStartTime) {
        this.csysWorkflowRunStartTime = csysWorkflowRunStartTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_CLOSE_TIME
     */
    public Date getCsysWorkflowRunCloseTime() {
        return csysWorkflowRunCloseTime;
    }

    /**
     * @param csysWorkflowRunCloseTime
     */
    public void setCsysWorkflowRunCloseTime(Date csysWorkflowRunCloseTime) {
        this.csysWorkflowRunCloseTime = csysWorkflowRunCloseTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_END_TIME
     */
    public Date getCsysWorkflowRunEndTime() {
        return csysWorkflowRunEndTime;
    }

    /**
     * @param csysWorkflowRunEndTime
     */
    public void setCsysWorkflowRunEndTime(Date csysWorkflowRunEndTime) {
        this.csysWorkflowRunEndTime = csysWorkflowRunEndTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_FREEZE_TIME
     */
    public Date getCsysWorkflowRunFreezeTime() {
        return csysWorkflowRunFreezeTime;
    }

    /**
     * @param csysWorkflowRunFreezeTime
     */
    public void setCsysWorkflowRunFreezeTime(Date csysWorkflowRunFreezeTime) {
        this.csysWorkflowRunFreezeTime = csysWorkflowRunFreezeTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_DESC
     */
    public String getCsysWorkflowRunDesc() {
        return csysWorkflowRunDesc;
    }

    /**
     * @param csysWorkflowRunDesc
     */
    public void setCsysWorkflowRunDesc(String csysWorkflowRunDesc) {
        this.csysWorkflowRunDesc = csysWorkflowRunDesc;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_CREATE_TIME
     */
    public Date getCsysWorkflowRunCreateTime() {
        return csysWorkflowRunCreateTime;
    }

    /**
     * @param csysWorkflowRunCreateTime
     */
    public void setCsysWorkflowRunCreateTime(Date csysWorkflowRunCreateTime) {
        this.csysWorkflowRunCreateTime = csysWorkflowRunCreateTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_MODIFY_TIME
     */
    public Date getCsysWorkflowRunModifyTime() {
        return csysWorkflowRunModifyTime;
    }

    /**
     * @param csysWorkflowRunModifyTime
     */
    public void setCsysWorkflowRunModifyTime(Date csysWorkflowRunModifyTime) {
        this.csysWorkflowRunModifyTime = csysWorkflowRunModifyTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_CREATE_USER
     */
    public String getCsysWorkflowRunCreateUser() {
        return csysWorkflowRunCreateUser;
    }

    /**
     * @param csysWorkflowRunCreateUser
     */
    public void setCsysWorkflowRunCreateUser(String csysWorkflowRunCreateUser) {
        this.csysWorkflowRunCreateUser = csysWorkflowRunCreateUser;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_MODIFY_USER
     */
    public String getCsysWorkflowRunModifyUser() {
        return csysWorkflowRunModifyUser;
    }

    /**
     * @param csysWorkflowRunModifyUser
     */
    public void setCsysWorkflowRunModifyUser(String csysWorkflowRunModifyUser) {
        this.csysWorkflowRunModifyUser = csysWorkflowRunModifyUser;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_IS_DELETE
     */
    public String getCsysWorkflowRunIsDelete() {
        return csysWorkflowRunIsDelete;
    }

    /**
     * @param csysWorkflowRunIsDelete
     */
    public void setCsysWorkflowRunIsDelete(String csysWorkflowRunIsDelete) {
        this.csysWorkflowRunIsDelete = csysWorkflowRunIsDelete;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_TIME
     */
    public Date getCsysWorkflowRunTime() {
        return csysWorkflowRunTime;
    }

    /**
     * @param csysWorkflowRunTime
     */
    public void setCsysWorkflowRunTime(Date csysWorkflowRunTime) {
        this.csysWorkflowRunTime = csysWorkflowRunTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_DATE
     */
    public Date getCsysWorkflowRunDate() {
        return csysWorkflowRunDate;
    }

    /**
     * @param csysWorkflowRunDate
     */
    public void setCsysWorkflowRunDate(Date csysWorkflowRunDate) {
        this.csysWorkflowRunDate = csysWorkflowRunDate;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PSTART_TIME
     */
    public Date getCsysWorkflowRunPstartTime() {
        return csysWorkflowRunPstartTime;
    }

    /**
     * @param csysWorkflowRunPstartTime
     */
    public void setCsysWorkflowRunPstartTime(Date csysWorkflowRunPstartTime) {
        this.csysWorkflowRunPstartTime = csysWorkflowRunPstartTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PCLOSE_TIME
     */
    public Date getCsysWorkflowRunPcloseTime() {
        return csysWorkflowRunPcloseTime;
    }

    /**
     * @param csysWorkflowRunPcloseTime
     */
    public void setCsysWorkflowRunPcloseTime(Date csysWorkflowRunPcloseTime) {
        this.csysWorkflowRunPcloseTime = csysWorkflowRunPcloseTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PEND_TIME
     */
    public Date getCsysWorkflowRunPendTime() {
        return csysWorkflowRunPendTime;
    }

    /**
     * @param csysWorkflowRunPendTime
     */
    public void setCsysWorkflowRunPendTime(Date csysWorkflowRunPendTime) {
        this.csysWorkflowRunPendTime = csysWorkflowRunPendTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PFREEZE_TIME
     */
    public Date getCsysWorkflowRunPfreezeTime() {
        return csysWorkflowRunPfreezeTime;
    }

    /**
     * @param csysWorkflowRunPfreezeTime
     */
    public void setCsysWorkflowRunPfreezeTime(Date csysWorkflowRunPfreezeTime) {
        this.csysWorkflowRunPfreezeTime = csysWorkflowRunPfreezeTime;
    }

    /**
     * @return CSYS_WORKFLOW_RUN_PLEAST_TIME
     */
    public Date getCsysWorkflowRunPleastTime() {
        return csysWorkflowRunPleastTime;
    }

    /**
     * @param csysWorkflowRunPleastTime
     */
    public void setCsysWorkflowRunPleastTime(Date csysWorkflowRunPleastTime) {
        this.csysWorkflowRunPleastTime = csysWorkflowRunPleastTime;
    }
}