package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_TRS_CON")
public class CsysPotTrsCon {
    @Id
    @Column(name = "CSYS_POT_TRS_CON_ID")
    private String csysPotTrsConId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_POT_TRS_ID")
    private String csysPotTrsId;

    @Column(name = "CSYS_POT_TRS_CON_RAW_DATA")
    private String csysPotTrsConRawData;

    @Column(name = "CSYS_POT_TRS_CON_METHOD")
    private String csysPotTrsConMethod;

    @Column(name = "CSYS_POT_TRS_CON_CONTRAST_DATA")
    private String csysPotTrsConContrastData;

    @Column(name = "CSYS_POT_TRS_CON_INFO")
    private String csysPotTrsConInfo;

    @Column(name = "CSYS_POT_TRS_CON_DESC")
    private String csysPotTrsConDesc;

    @Column(name = "CSYS_POT_TRS_CON_TIME")
    private Date csysPotTrsConTime;

    @Column(name = "CSYS_POT_TRS_CON_DATE")
    private Date csysPotTrsConDate;

    @Column(name = "CSYS_POT_TRS_CON_CREATE_TIME")
    private Date csysPotTrsConCreateTime;

    @Column(name = "CSYS_POT_TRS_CON_CREATE_USER")
    private String csysPotTrsConCreateUser;

    @Column(name = "CSYS_POT_TRS_CON_MODIFY_TIME")
    private Date csysPotTrsConModifyTime;

    @Column(name = "CSYS_POT_TRS_CON_MODIFY_USER")
    private String csysPotTrsConModifyUser;

    @Column(name = "CSYS_POT_TRS_CON_IS_DELETE")
    private String csysPotTrsConIsDelete;

    @Column(name = "CSYS_POT_TRS_CON_TYPE")
    private String csysPotTrsConType;

    @Column(name = "CSYS_TRS_RULE_ID")
    private String csysTrsRuleId;

    @Column(name = "CSYS_TRS_RULEDL_ID")
    private String csysTrsRuledlId;

    @Column(name = "CSYS_TRS_RULESQL_ID")
    private String csysTrsRulesqlId;

    /**
     * @return CSYS_POT_TRS_CON_ID
     */
    public String getCsysPotTrsConId() {
        return csysPotTrsConId;
    }

    /**
     * @param csysPotTrsConId
     */
    public void setCsysPotTrsConId(String csysPotTrsConId) {
        this.csysPotTrsConId = csysPotTrsConId;
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
     * @return CSYS_POT_TRS_CON_RAW_DATA
     */
    public String getCsysPotTrsConRawData() {
        return csysPotTrsConRawData;
    }

    /**
     * @param csysPotTrsConRawData
     */
    public void setCsysPotTrsConRawData(String csysPotTrsConRawData) {
        this.csysPotTrsConRawData = csysPotTrsConRawData;
    }

    /**
     * @return CSYS_POT_TRS_CON_METHOD
     */
    public String getCsysPotTrsConMethod() {
        return csysPotTrsConMethod;
    }

    /**
     * @param csysPotTrsConMethod
     */
    public void setCsysPotTrsConMethod(String csysPotTrsConMethod) {
        this.csysPotTrsConMethod = csysPotTrsConMethod;
    }

    /**
     * @return CSYS_POT_TRS_CON_CONTRAST_DATA
     */
    public String getCsysPotTrsConContrastData() {
        return csysPotTrsConContrastData;
    }

    /**
     * @param csysPotTrsConContrastData
     */
    public void setCsysPotTrsConContrastData(String csysPotTrsConContrastData) {
        this.csysPotTrsConContrastData = csysPotTrsConContrastData;
    }

    /**
     * @return CSYS_POT_TRS_CON_INFO
     */
    public String getCsysPotTrsConInfo() {
        return csysPotTrsConInfo;
    }

    /**
     * @param csysPotTrsConInfo
     */
    public void setCsysPotTrsConInfo(String csysPotTrsConInfo) {
        this.csysPotTrsConInfo = csysPotTrsConInfo;
    }

    /**
     * @return CSYS_POT_TRS_CON_DESC
     */
    public String getCsysPotTrsConDesc() {
        return csysPotTrsConDesc;
    }

    /**
     * @param csysPotTrsConDesc
     */
    public void setCsysPotTrsConDesc(String csysPotTrsConDesc) {
        this.csysPotTrsConDesc = csysPotTrsConDesc;
    }

    /**
     * @return CSYS_POT_TRS_CON_TIME
     */
    public Date getCsysPotTrsConTime() {
        return csysPotTrsConTime;
    }

    /**
     * @param csysPotTrsConTime
     */
    public void setCsysPotTrsConTime(Date csysPotTrsConTime) {
        this.csysPotTrsConTime = csysPotTrsConTime;
    }

    /**
     * @return CSYS_POT_TRS_CON_DATE
     */
    public Date getCsysPotTrsConDate() {
        return csysPotTrsConDate;
    }

    /**
     * @param csysPotTrsConDate
     */
    public void setCsysPotTrsConDate(Date csysPotTrsConDate) {
        this.csysPotTrsConDate = csysPotTrsConDate;
    }

    /**
     * @return CSYS_POT_TRS_CON_CREATE_TIME
     */
    public Date getCsysPotTrsConCreateTime() {
        return csysPotTrsConCreateTime;
    }

    /**
     * @param csysPotTrsConCreateTime
     */
    public void setCsysPotTrsConCreateTime(Date csysPotTrsConCreateTime) {
        this.csysPotTrsConCreateTime = csysPotTrsConCreateTime;
    }

    /**
     * @return CSYS_POT_TRS_CON_CREATE_USER
     */
    public String getCsysPotTrsConCreateUser() {
        return csysPotTrsConCreateUser;
    }

    /**
     * @param csysPotTrsConCreateUser
     */
    public void setCsysPotTrsConCreateUser(String csysPotTrsConCreateUser) {
        this.csysPotTrsConCreateUser = csysPotTrsConCreateUser;
    }

    /**
     * @return CSYS_POT_TRS_CON_MODIFY_TIME
     */
    public Date getCsysPotTrsConModifyTime() {
        return csysPotTrsConModifyTime;
    }

    /**
     * @param csysPotTrsConModifyTime
     */
    public void setCsysPotTrsConModifyTime(Date csysPotTrsConModifyTime) {
        this.csysPotTrsConModifyTime = csysPotTrsConModifyTime;
    }

    /**
     * @return CSYS_POT_TRS_CON_MODIFY_USER
     */
    public String getCsysPotTrsConModifyUser() {
        return csysPotTrsConModifyUser;
    }

    /**
     * @param csysPotTrsConModifyUser
     */
    public void setCsysPotTrsConModifyUser(String csysPotTrsConModifyUser) {
        this.csysPotTrsConModifyUser = csysPotTrsConModifyUser;
    }

    /**
     * @return CSYS_POT_TRS_CON_IS_DELETE
     */
    public String getCsysPotTrsConIsDelete() {
        return csysPotTrsConIsDelete;
    }

    /**
     * @param csysPotTrsConIsDelete
     */
    public void setCsysPotTrsConIsDelete(String csysPotTrsConIsDelete) {
        this.csysPotTrsConIsDelete = csysPotTrsConIsDelete;
    }

    /**
     * @return CSYS_POT_TRS_CON_TYPE
     */
    public String getCsysPotTrsConType() {
        return csysPotTrsConType;
    }

    /**
     * @param csysPotTrsConType
     */
    public void setCsysPotTrsConType(String csysPotTrsConType) {
        this.csysPotTrsConType = csysPotTrsConType;
    }

    /**
     * @return CSYS_TRS_RULE_ID
     */
    public String getCsysTrsRuleId() {
        return csysTrsRuleId;
    }

    /**
     * @param csysTrsRuleId
     */
    public void setCsysTrsRuleId(String csysTrsRuleId) {
        this.csysTrsRuleId = csysTrsRuleId;
    }

    /**
     * @return CSYS_TRS_RULEDL_ID
     */
    public String getCsysTrsRuledlId() {
        return csysTrsRuledlId;
    }

    /**
     * @param csysTrsRuledlId
     */
    public void setCsysTrsRuledlId(String csysTrsRuledlId) {
        this.csysTrsRuledlId = csysTrsRuledlId;
    }

    /**
     * @return CSYS_TRS_RULESQL_ID
     */
    public String getCsysTrsRulesqlId() {
        return csysTrsRulesqlId;
    }

    /**
     * @param csysTrsRulesqlId
     */
    public void setCsysTrsRulesqlId(String csysTrsRulesqlId) {
        this.csysTrsRulesqlId = csysTrsRulesqlId;
    }
}