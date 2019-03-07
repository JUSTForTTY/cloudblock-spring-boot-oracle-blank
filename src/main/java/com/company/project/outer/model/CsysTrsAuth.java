package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_AUTH")
public class CsysTrsAuth {
    @Id
    @Column(name = "CSYS_TRS_AUTH_ID")
    private String csysTrsAuthId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_POINT_TRS_ID")
    private String csysPointTrsId;

    @Column(name = "CSYS_TRS_AUTH_TYPE")
    private String csysTrsAuthType;

    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_TRS_AUTH_DESC")
    private String csysTrsAuthDesc;

    @Column(name = "CSYS_TRS_AUTH_CREATE_TIME")
    private Date csysTrsAuthCreateTime;

    @Column(name = "CSYS_TRS_AUTH_MODIFY_TIME")
    private Date csysTrsAuthModifyTime;

    @Column(name = "CSYS_TRS_AUTH_CREATE_USER")
    private String csysTrsAuthCreateUser;

    @Column(name = "CSYS_TRS_AUTH_MODIFY_USER")
    private String csysTrsAuthModifyUser;

    @Column(name = "CSYS_TRS_AUTH_IS_DELETE")
    private String csysTrsAuthIsDelete;

    @Column(name = "CSYS_TRS_AUTH_TIME")
    private Date csysTrsAuthTime;

    @Column(name = "CSYS_TRS_AUTH_DATE")
    private Date csysTrsAuthDate;

    /**
     * @return CSYS_TRS_AUTH_ID
     */
    public String getCsysTrsAuthId() {
        return csysTrsAuthId;
    }

    /**
     * @param csysTrsAuthId
     */
    public void setCsysTrsAuthId(String csysTrsAuthId) {
        this.csysTrsAuthId = csysTrsAuthId;
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
     * @return CSYS_TRS_AUTH_TYPE
     */
    public String getCsysTrsAuthType() {
        return csysTrsAuthType;
    }

    /**
     * @param csysTrsAuthType
     */
    public void setCsysTrsAuthType(String csysTrsAuthType) {
        this.csysTrsAuthType = csysTrsAuthType;
    }

    /**
     * @return CSYS_ROLE_ID
     */
    public String getCsysRoleId() {
        return csysRoleId;
    }

    /**
     * @param csysRoleId
     */
    public void setCsysRoleId(String csysRoleId) {
        this.csysRoleId = csysRoleId;
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
     * @return CSYS_TRS_AUTH_DESC
     */
    public String getCsysTrsAuthDesc() {
        return csysTrsAuthDesc;
    }

    /**
     * @param csysTrsAuthDesc
     */
    public void setCsysTrsAuthDesc(String csysTrsAuthDesc) {
        this.csysTrsAuthDesc = csysTrsAuthDesc;
    }

    /**
     * @return CSYS_TRS_AUTH_CREATE_TIME
     */
    public Date getCsysTrsAuthCreateTime() {
        return csysTrsAuthCreateTime;
    }

    /**
     * @param csysTrsAuthCreateTime
     */
    public void setCsysTrsAuthCreateTime(Date csysTrsAuthCreateTime) {
        this.csysTrsAuthCreateTime = csysTrsAuthCreateTime;
    }

    /**
     * @return CSYS_TRS_AUTH_MODIFY_TIME
     */
    public Date getCsysTrsAuthModifyTime() {
        return csysTrsAuthModifyTime;
    }

    /**
     * @param csysTrsAuthModifyTime
     */
    public void setCsysTrsAuthModifyTime(Date csysTrsAuthModifyTime) {
        this.csysTrsAuthModifyTime = csysTrsAuthModifyTime;
    }

    /**
     * @return CSYS_TRS_AUTH_CREATE_USER
     */
    public String getCsysTrsAuthCreateUser() {
        return csysTrsAuthCreateUser;
    }

    /**
     * @param csysTrsAuthCreateUser
     */
    public void setCsysTrsAuthCreateUser(String csysTrsAuthCreateUser) {
        this.csysTrsAuthCreateUser = csysTrsAuthCreateUser;
    }

    /**
     * @return CSYS_TRS_AUTH_MODIFY_USER
     */
    public String getCsysTrsAuthModifyUser() {
        return csysTrsAuthModifyUser;
    }

    /**
     * @param csysTrsAuthModifyUser
     */
    public void setCsysTrsAuthModifyUser(String csysTrsAuthModifyUser) {
        this.csysTrsAuthModifyUser = csysTrsAuthModifyUser;
    }

    /**
     * @return CSYS_TRS_AUTH_IS_DELETE
     */
    public String getCsysTrsAuthIsDelete() {
        return csysTrsAuthIsDelete;
    }

    /**
     * @param csysTrsAuthIsDelete
     */
    public void setCsysTrsAuthIsDelete(String csysTrsAuthIsDelete) {
        this.csysTrsAuthIsDelete = csysTrsAuthIsDelete;
    }

    /**
     * @return CSYS_TRS_AUTH_TIME
     */
    public Date getCsysTrsAuthTime() {
        return csysTrsAuthTime;
    }

    /**
     * @param csysTrsAuthTime
     */
    public void setCsysTrsAuthTime(Date csysTrsAuthTime) {
        this.csysTrsAuthTime = csysTrsAuthTime;
    }

    /**
     * @return CSYS_TRS_AUTH_DATE
     */
    public Date getCsysTrsAuthDate() {
        return csysTrsAuthDate;
    }

    /**
     * @param csysTrsAuthDate
     */
    public void setCsysTrsAuthDate(Date csysTrsAuthDate) {
        this.csysTrsAuthDate = csysTrsAuthDate;
    }
}