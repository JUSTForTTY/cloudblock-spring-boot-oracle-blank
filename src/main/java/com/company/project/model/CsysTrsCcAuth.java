package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_CC_AUTH")
public class CsysTrsCcAuth {
    @Id
    @Column(name = "CSYS_TRS_CC_AUTH_ID")
    private String csysTrsCcAuthId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_TRS_TRANSFER_ID")
    private String csysTrsTransferId;

    @Column(name = "CSYS_TRS_CC_AUTH_TYPE")
    private String csysTrsCcAuthType;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_TRS_CC_AUTH_DESC")
    private String csysTrsCcAuthDesc;

    @Column(name = "CSYS_TRS_CC_AUTH_CREATE_TIME")
    private Date csysTrsCcAuthCreateTime;

    @Column(name = "CSYS_TRS_CC_AUTH_MODIFY_TIME")
    private Date csysTrsCcAuthModifyTime;

    @Column(name = "CSYS_TRS_CC_AUTH_CREATE_USER")
    private String csysTrsCcAuthCreateUser;

    @Column(name = "CSYS_TRS_CC_AUTH_MODIFY_USER")
    private String csysTrsCcAuthModifyUser;

    @Column(name = "CSYS_TRS_CC_AUTH_IS_DELETE")
    private String csysTrsCcAuthIsDelete;

    @Column(name = "CSYS_TRS_CC_AUTH_DATE")
    private Date csysTrsCcAuthDate;

    @Column(name = "CSYS_TRS_CC_AUTH_TIME")
    private Date csysTrsCcAuthTime;

    /**
     * @return CSYS_TRS_CC_AUTH_ID
     */
    public String getCsysTrsCcAuthId() {
        return csysTrsCcAuthId;
    }

    /**
     * @param csysTrsCcAuthId
     */
    public void setCsysTrsCcAuthId(String csysTrsCcAuthId) {
        this.csysTrsCcAuthId = csysTrsCcAuthId;
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
     * @return CSYS_TRS_TRANSFER_ID
     */
    public String getCsysTrsTransferId() {
        return csysTrsTransferId;
    }

    /**
     * @param csysTrsTransferId
     */
    public void setCsysTrsTransferId(String csysTrsTransferId) {
        this.csysTrsTransferId = csysTrsTransferId;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_TYPE
     */
    public String getCsysTrsCcAuthType() {
        return csysTrsCcAuthType;
    }

    /**
     * @param csysTrsCcAuthType
     */
    public void setCsysTrsCcAuthType(String csysTrsCcAuthType) {
        this.csysTrsCcAuthType = csysTrsCcAuthType;
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
     * @return CSYS_TRS_CC_AUTH_DESC
     */
    public String getCsysTrsCcAuthDesc() {
        return csysTrsCcAuthDesc;
    }

    /**
     * @param csysTrsCcAuthDesc
     */
    public void setCsysTrsCcAuthDesc(String csysTrsCcAuthDesc) {
        this.csysTrsCcAuthDesc = csysTrsCcAuthDesc;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_CREATE_TIME
     */
    public Date getCsysTrsCcAuthCreateTime() {
        return csysTrsCcAuthCreateTime;
    }

    /**
     * @param csysTrsCcAuthCreateTime
     */
    public void setCsysTrsCcAuthCreateTime(Date csysTrsCcAuthCreateTime) {
        this.csysTrsCcAuthCreateTime = csysTrsCcAuthCreateTime;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_MODIFY_TIME
     */
    public Date getCsysTrsCcAuthModifyTime() {
        return csysTrsCcAuthModifyTime;
    }

    /**
     * @param csysTrsCcAuthModifyTime
     */
    public void setCsysTrsCcAuthModifyTime(Date csysTrsCcAuthModifyTime) {
        this.csysTrsCcAuthModifyTime = csysTrsCcAuthModifyTime;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_CREATE_USER
     */
    public String getCsysTrsCcAuthCreateUser() {
        return csysTrsCcAuthCreateUser;
    }

    /**
     * @param csysTrsCcAuthCreateUser
     */
    public void setCsysTrsCcAuthCreateUser(String csysTrsCcAuthCreateUser) {
        this.csysTrsCcAuthCreateUser = csysTrsCcAuthCreateUser;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_MODIFY_USER
     */
    public String getCsysTrsCcAuthModifyUser() {
        return csysTrsCcAuthModifyUser;
    }

    /**
     * @param csysTrsCcAuthModifyUser
     */
    public void setCsysTrsCcAuthModifyUser(String csysTrsCcAuthModifyUser) {
        this.csysTrsCcAuthModifyUser = csysTrsCcAuthModifyUser;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_IS_DELETE
     */
    public String getCsysTrsCcAuthIsDelete() {
        return csysTrsCcAuthIsDelete;
    }

    /**
     * @param csysTrsCcAuthIsDelete
     */
    public void setCsysTrsCcAuthIsDelete(String csysTrsCcAuthIsDelete) {
        this.csysTrsCcAuthIsDelete = csysTrsCcAuthIsDelete;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_DATE
     */
    public Date getCsysTrsCcAuthDate() {
        return csysTrsCcAuthDate;
    }

    /**
     * @param csysTrsCcAuthDate
     */
    public void setCsysTrsCcAuthDate(Date csysTrsCcAuthDate) {
        this.csysTrsCcAuthDate = csysTrsCcAuthDate;
    }

    /**
     * @return CSYS_TRS_CC_AUTH_TIME
     */
    public Date getCsysTrsCcAuthTime() {
        return csysTrsCcAuthTime;
    }

    /**
     * @param csysTrsCcAuthTime
     */
    public void setCsysTrsCcAuthTime(Date csysTrsCcAuthTime) {
        this.csysTrsCcAuthTime = csysTrsCcAuthTime;
    }
}