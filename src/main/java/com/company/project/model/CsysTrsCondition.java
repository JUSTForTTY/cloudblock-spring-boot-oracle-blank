package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_CONDITION")
public class CsysTrsCondition {
    @Id
    @Column(name = "CSYS_TRS_CONDITION_ID")
    private String csysTrsConditionId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_POINT_TRS_ID")
    private String csysPointTrsId;

    @Column(name = "CSYS_TRS_CONDITION_COLUMN")
    private String csysTrsConditionColumn;

    @Column(name = "CSYS_TRS_CONDITION_DATA")
    private String csysTrsConditionData;

    @Column(name = "CSYS_TRS_CONDITION_TABLE")
    private String csysTrsConditionTable;

    @Column(name = "CSYS_TRS_CONDITION_METHOD")
    private String csysTrsConditionMethod;

    @Column(name = "CSYS_TRS_CONDITION_CONTARST")
    private String csysTrsConditionContarst;

    @Column(name = "CSYS_TRS_CONDITION_DESC")
    private String csysTrsConditionDesc;

    @Column(name = "CSYS_TRS_CONDITION_CREATE_TIME")
    private Date csysTrsConditionCreateTime;

    @Column(name = "CSYS_TRS_CONDITION_MODIFY_TIME")
    private Date csysTrsConditionModifyTime;

    @Column(name = "CSYS_TRS_CONDITION_CREATE_USER")
    private String csysTrsConditionCreateUser;

    @Column(name = "CSYS_TRS_CONDITION_MODIFY_USER")
    private String csysTrsConditionModifyUser;

    @Column(name = "CSYS_TRS_CONDITION_IS_DELETE")
    private String csysTrsConditionIsDelete;

    @Column(name = "CSYS_TRS_CONDITION_TIME")
    private Date csysTrsConditionTime;

    @Column(name = "CSYS_TRS_CONDITION_DATE")
    private Date csysTrsConditionDate;

    /**
     * @return CSYS_TRS_CONDITION_ID
     */
    public String getCsysTrsConditionId() {
        return csysTrsConditionId;
    }

    /**
     * @param csysTrsConditionId
     */
    public void setCsysTrsConditionId(String csysTrsConditionId) {
        this.csysTrsConditionId = csysTrsConditionId;
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
     * @return CSYS_TRS_CONDITION_COLUMN
     */
    public String getCsysTrsConditionColumn() {
        return csysTrsConditionColumn;
    }

    /**
     * @param csysTrsConditionColumn
     */
    public void setCsysTrsConditionColumn(String csysTrsConditionColumn) {
        this.csysTrsConditionColumn = csysTrsConditionColumn;
    }

    /**
     * @return CSYS_TRS_CONDITION_DATA
     */
    public String getCsysTrsConditionData() {
        return csysTrsConditionData;
    }

    /**
     * @param csysTrsConditionData
     */
    public void setCsysTrsConditionData(String csysTrsConditionData) {
        this.csysTrsConditionData = csysTrsConditionData;
    }

    /**
     * @return CSYS_TRS_CONDITION_TABLE
     */
    public String getCsysTrsConditionTable() {
        return csysTrsConditionTable;
    }

    /**
     * @param csysTrsConditionTable
     */
    public void setCsysTrsConditionTable(String csysTrsConditionTable) {
        this.csysTrsConditionTable = csysTrsConditionTable;
    }

    /**
     * @return CSYS_TRS_CONDITION_METHOD
     */
    public String getCsysTrsConditionMethod() {
        return csysTrsConditionMethod;
    }

    /**
     * @param csysTrsConditionMethod
     */
    public void setCsysTrsConditionMethod(String csysTrsConditionMethod) {
        this.csysTrsConditionMethod = csysTrsConditionMethod;
    }

    /**
     * @return CSYS_TRS_CONDITION_CONTARST
     */
    public String getCsysTrsConditionContarst() {
        return csysTrsConditionContarst;
    }

    /**
     * @param csysTrsConditionContarst
     */
    public void setCsysTrsConditionContarst(String csysTrsConditionContarst) {
        this.csysTrsConditionContarst = csysTrsConditionContarst;
    }

    /**
     * @return CSYS_TRS_CONDITION_DESC
     */
    public String getCsysTrsConditionDesc() {
        return csysTrsConditionDesc;
    }

    /**
     * @param csysTrsConditionDesc
     */
    public void setCsysTrsConditionDesc(String csysTrsConditionDesc) {
        this.csysTrsConditionDesc = csysTrsConditionDesc;
    }

    /**
     * @return CSYS_TRS_CONDITION_CREATE_TIME
     */
    public Date getCsysTrsConditionCreateTime() {
        return csysTrsConditionCreateTime;
    }

    /**
     * @param csysTrsConditionCreateTime
     */
    public void setCsysTrsConditionCreateTime(Date csysTrsConditionCreateTime) {
        this.csysTrsConditionCreateTime = csysTrsConditionCreateTime;
    }

    /**
     * @return CSYS_TRS_CONDITION_MODIFY_TIME
     */
    public Date getCsysTrsConditionModifyTime() {
        return csysTrsConditionModifyTime;
    }

    /**
     * @param csysTrsConditionModifyTime
     */
    public void setCsysTrsConditionModifyTime(Date csysTrsConditionModifyTime) {
        this.csysTrsConditionModifyTime = csysTrsConditionModifyTime;
    }

    /**
     * @return CSYS_TRS_CONDITION_CREATE_USER
     */
    public String getCsysTrsConditionCreateUser() {
        return csysTrsConditionCreateUser;
    }

    /**
     * @param csysTrsConditionCreateUser
     */
    public void setCsysTrsConditionCreateUser(String csysTrsConditionCreateUser) {
        this.csysTrsConditionCreateUser = csysTrsConditionCreateUser;
    }

    /**
     * @return CSYS_TRS_CONDITION_MODIFY_USER
     */
    public String getCsysTrsConditionModifyUser() {
        return csysTrsConditionModifyUser;
    }

    /**
     * @param csysTrsConditionModifyUser
     */
    public void setCsysTrsConditionModifyUser(String csysTrsConditionModifyUser) {
        this.csysTrsConditionModifyUser = csysTrsConditionModifyUser;
    }

    /**
     * @return CSYS_TRS_CONDITION_IS_DELETE
     */
    public String getCsysTrsConditionIsDelete() {
        return csysTrsConditionIsDelete;
    }

    /**
     * @param csysTrsConditionIsDelete
     */
    public void setCsysTrsConditionIsDelete(String csysTrsConditionIsDelete) {
        this.csysTrsConditionIsDelete = csysTrsConditionIsDelete;
    }

    /**
     * @return CSYS_TRS_CONDITION_TIME
     */
    public Date getCsysTrsConditionTime() {
        return csysTrsConditionTime;
    }

    /**
     * @param csysTrsConditionTime
     */
    public void setCsysTrsConditionTime(Date csysTrsConditionTime) {
        this.csysTrsConditionTime = csysTrsConditionTime;
    }

    /**
     * @return CSYS_TRS_CONDITION_DATE
     */
    public Date getCsysTrsConditionDate() {
        return csysTrsConditionDate;
    }

    /**
     * @param csysTrsConditionDate
     */
    public void setCsysTrsConditionDate(Date csysTrsConditionDate) {
        this.csysTrsConditionDate = csysTrsConditionDate;
    }
}