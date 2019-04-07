package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_LOG")
public class CsysTrsLog {
    @Id
    @Column(name = "CSYS_TRS_LOG_ID")
    private String csysTrsLogId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_TRS_LOG_TYPE")
    private String csysTrsLogType;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_TRS_LOG_TABLE")
    private String csysTrsLogTable;

    @Column(name = "CSYS_TRS_LOG_TABLE_VAL")
    private String csysTrsLogTableVal;

    @Column(name = "CSYS_WORKFLOW_RUN_ID")
    private String csysWorkflowRunId;

    @Column(name = "CSYS_POINT_TRS_ID")
    private String csysPointTrsId;

    @Column(name = "CSYS_TRS_LOG_LAST_ID")
    private String csysTrsLogLastId;

    @Column(name = "CSYS_TRS_LOG_LAST_NAME")
    private String csysTrsLogLastName;

    @Column(name = "CSYS_TRS_LOG_CURRENT_ID")
    private String csysTrsLogCurrentId;

    @Column(name = "CSYS_TRS_LOG_CURRENT_NAME")
    private String csysTrsLogCurrentName;

    @Column(name = "CSYS_TRS_LOG_START_TIME")
    private Date csysTrsLogStartTime;

    @Column(name = "CSYS_TRS_LOG_CLOSE_TIME")
    private Date csysTrsLogCloseTime;

    @Column(name = "CSYS_TRS_LOG_END_TIME")
    private Date csysTrsLogEndTime;

    @Column(name = "CSYS_TRS_LOG_DESC")
    private String csysTrsLogDesc;

    @Column(name = "CSYS_TRS_LOG_CREATE_TIME")
    private Date csysTrsLogCreateTime;

    @Column(name = "CSYS_TRS_LOG_CREATE_USER")
    private String csysTrsLogCreateUser;

    @Column(name = "CSYS_TRS_LOG_MODIFY_USER")
    private String csysTrsLogModifyUser;

    @Column(name = "CSYS_TRS_LOG_MODIFY_TIME")
    private Date csysTrsLogModifyTime;

    @Column(name = "CSYS_TRS_LOG_IS_DELETE")
    private String csysTrsLogIsDelete;

    @Column(name = "CSYS_TRS_LOG_TIME")
    private Date csysTrsLogTime;

    @Column(name = "CSYS_TRS_LOG_DATE")
    private Date csysTrsLogDate;

    /**
     * @return CSYS_TRS_LOG_ID
     */
    public String getCsysTrsLogId() {
        return csysTrsLogId;
    }

    /**
     * @param csysTrsLogId
     */
    public void setCsysTrsLogId(String csysTrsLogId) {
        this.csysTrsLogId = csysTrsLogId;
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
     * @return CSYS_TRS_LOG_TYPE
     */
    public String getCsysTrsLogType() {
        return csysTrsLogType;
    }

    /**
     * @param csysTrsLogType
     */
    public void setCsysTrsLogType(String csysTrsLogType) {
        this.csysTrsLogType = csysTrsLogType;
    }

    /**
     * @return CSYS_USER_ID
     */
    public String getCsysUserId() {
        return csysUserId;
    }

    /**
     * @param csysUserId
     */
    public void setCsysUserId(String csysUserId) {
        this.csysUserId = csysUserId;
    }

    /**
     * @return CSYS_TRS_LOG_TABLE
     */
    public String getCsysTrsLogTable() {
        return csysTrsLogTable;
    }

    /**
     * @param csysTrsLogTable
     */
    public void setCsysTrsLogTable(String csysTrsLogTable) {
        this.csysTrsLogTable = csysTrsLogTable;
    }

    /**
     * @return CSYS_TRS_LOG_TABLE_VAL
     */
    public String getCsysTrsLogTableVal() {
        return csysTrsLogTableVal;
    }

    /**
     * @param csysTrsLogTableVal
     */
    public void setCsysTrsLogTableVal(String csysTrsLogTableVal) {
        this.csysTrsLogTableVal = csysTrsLogTableVal;
    }

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
     * @return CSYS_POINT_TRS_ID
     */
    public String getCsysPointTrsId() {
        return csysPointTrsId;
    }

    /**
     * @param csysPointTrsId
     */
    public void setCsysPointTrsId(String csysPointTrsId) {
        this.csysPointTrsId = csysPointTrsId;
    }

    /**
     * @return CSYS_TRS_LOG_LAST_ID
     */
    public String getCsysTrsLogLastId() {
        return csysTrsLogLastId;
    }

    /**
     * @param csysTrsLogLastId
     */
    public void setCsysTrsLogLastId(String csysTrsLogLastId) {
        this.csysTrsLogLastId = csysTrsLogLastId;
    }

    /**
     * @return CSYS_TRS_LOG_LAST_NAME
     */
    public String getCsysTrsLogLastName() {
        return csysTrsLogLastName;
    }

    /**
     * @param csysTrsLogLastName
     */
    public void setCsysTrsLogLastName(String csysTrsLogLastName) {
        this.csysTrsLogLastName = csysTrsLogLastName;
    }

    /**
     * @return CSYS_TRS_LOG_CURRENT_ID
     */
    public String getCsysTrsLogCurrentId() {
        return csysTrsLogCurrentId;
    }

    /**
     * @param csysTrsLogCurrentId
     */
    public void setCsysTrsLogCurrentId(String csysTrsLogCurrentId) {
        this.csysTrsLogCurrentId = csysTrsLogCurrentId;
    }

    /**
     * @return CSYS_TRS_LOG_CURRENT_NAME
     */
    public String getCsysTrsLogCurrentName() {
        return csysTrsLogCurrentName;
    }

    /**
     * @param csysTrsLogCurrentName
     */
    public void setCsysTrsLogCurrentName(String csysTrsLogCurrentName) {
        this.csysTrsLogCurrentName = csysTrsLogCurrentName;
    }

    /**
     * @return CSYS_TRS_LOG_START_TIME
     */
    public Date getCsysTrsLogStartTime() {
        return csysTrsLogStartTime;
    }

    /**
     * @param csysTrsLogStartTime
     */
    public void setCsysTrsLogStartTime(Date csysTrsLogStartTime) {
        this.csysTrsLogStartTime = csysTrsLogStartTime;
    }

    /**
     * @return CSYS_TRS_LOG_CLOSE_TIME
     */
    public Date getCsysTrsLogCloseTime() {
        return csysTrsLogCloseTime;
    }

    /**
     * @param csysTrsLogCloseTime
     */
    public void setCsysTrsLogCloseTime(Date csysTrsLogCloseTime) {
        this.csysTrsLogCloseTime = csysTrsLogCloseTime;
    }

    /**
     * @return CSYS_TRS_LOG_END_TIME
     */
    public Date getCsysTrsLogEndTime() {
        return csysTrsLogEndTime;
    }

    /**
     * @param csysTrsLogEndTime
     */
    public void setCsysTrsLogEndTime(Date csysTrsLogEndTime) {
        this.csysTrsLogEndTime = csysTrsLogEndTime;
    }

    /**
     * @return CSYS_TRS_LOG_DESC
     */
    public String getCsysTrsLogDesc() {
        return csysTrsLogDesc;
    }

    /**
     * @param csysTrsLogDesc
     */
    public void setCsysTrsLogDesc(String csysTrsLogDesc) {
        this.csysTrsLogDesc = csysTrsLogDesc;
    }

    /**
     * @return CSYS_TRS_LOG_CREATE_TIME
     */
    public Date getCsysTrsLogCreateTime() {
        return csysTrsLogCreateTime;
    }

    /**
     * @param csysTrsLogCreateTime
     */
    public void setCsysTrsLogCreateTime(Date csysTrsLogCreateTime) {
        this.csysTrsLogCreateTime = csysTrsLogCreateTime;
    }

    /**
     * @return CSYS_TRS_LOG_CREATE_USER
     */
    public String getCsysTrsLogCreateUser() {
        return csysTrsLogCreateUser;
    }

    /**
     * @param csysTrsLogCreateUser
     */
    public void setCsysTrsLogCreateUser(String csysTrsLogCreateUser) {
        this.csysTrsLogCreateUser = csysTrsLogCreateUser;
    }

    /**
     * @return CSYS_TRS_LOG_MODIFY_USER
     */
    public String getCsysTrsLogModifyUser() {
        return csysTrsLogModifyUser;
    }

    /**
     * @param csysTrsLogModifyUser
     */
    public void setCsysTrsLogModifyUser(String csysTrsLogModifyUser) {
        this.csysTrsLogModifyUser = csysTrsLogModifyUser;
    }

    /**
     * @return CSYS_TRS_LOG_MODIFY_TIME
     */
    public Date getCsysTrsLogModifyTime() {
        return csysTrsLogModifyTime;
    }

    /**
     * @param csysTrsLogModifyTime
     */
    public void setCsysTrsLogModifyTime(Date csysTrsLogModifyTime) {
        this.csysTrsLogModifyTime = csysTrsLogModifyTime;
    }

    /**
     * @return CSYS_TRS_LOG_IS_DELETE
     */
    public String getCsysTrsLogIsDelete() {
        return csysTrsLogIsDelete;
    }

    /**
     * @param csysTrsLogIsDelete
     */
    public void setCsysTrsLogIsDelete(String csysTrsLogIsDelete) {
        this.csysTrsLogIsDelete = csysTrsLogIsDelete;
    }

    /**
     * @return CSYS_TRS_LOG_TIME
     */
    public Date getCsysTrsLogTime() {
        return csysTrsLogTime;
    }

    /**
     * @param csysTrsLogTime
     */
    public void setCsysTrsLogTime(Date csysTrsLogTime) {
        this.csysTrsLogTime = csysTrsLogTime;
    }

    /**
     * @return CSYS_TRS_LOG_DATE
     */
    public Date getCsysTrsLogDate() {
        return csysTrsLogDate;
    }

    /**
     * @param csysTrsLogDate
     */
    public void setCsysTrsLogDate(Date csysTrsLogDate) {
        this.csysTrsLogDate = csysTrsLogDate;
    }
}