package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_OPERATELOG")
public class CsysOperatelog {
	@Id
    @Column(name = "CSYS_OPERATELOG_ID")
    private String csysOperatelogId;

    @Column(name = "CSYS_OPERATELOG_NAME")
    private String csysOperatelogName;

    @Column(name = "CSYS_OPERATELOG_TYPE")
    private String csysOperatelogType;

    @Column(name = "CSYS_OPERATELOG_RESOURCE")
    private String csysOperatelogResource;

    @Column(name = "CSYS_OPERATELOG_RESOURCE_ID")
    private String csysOperatelogResourceId;

    @Column(name = "CSYS_OPERATELOG_STATUS")
    private String csysOperatelogStatus;

    @Column(name = "CSYS_OPERATELOG_OPERATOR")
    private String csysOperatelogOperator;

    @Column(name = "CSYS_OPERATELOG_DESC")
    private String csysOperatelogDesc;

    @Column(name = "CSYS_OPERATELOG_CREATE_TIME")
    private Date csysOperatelogCreateTime;

    @Column(name = "CSYS_OPERATELOG_CREATE_USER")
    private String csysOperatelogCreateUser;

    @Column(name = "CSYS_OPERATELOG_MODIFY_TIME")
    private Date csysOperatelogModifyTime;

    @Column(name = "CSYS_OPERATELOG_MODIFY_USER")
    private String csysOperatelogModifyUser;

    @Column(name = "CSYS_OPERATELOG_IS_DELETE")
    private String csysOperatelogIsDelete;

    @Column(name = "CSYS_OPERATELOG_TIME")
    private Date csysOperatelogTime;

    @Column(name = "CSYS_OPERATELOG_DATE")
    private Date csysOperatelogDate;

    /**
     * @return CSYS_OPERATELOG_ID
     */
    public String getCsysOperatelogId() {
        return csysOperatelogId;
    }

    /**
     * @param csysOperatelogId
     */
    public void setCsysOperatelogId(String csysOperatelogId) {
        this.csysOperatelogId = csysOperatelogId;
    }

    /**
     * @return CSYS_OPERATELOG_NAME
     */
    public String getCsysOperatelogName() {
        return csysOperatelogName;
    }

    /**
     * @param csysOperatelogName
     */
    public void setCsysOperatelogName(String csysOperatelogName) {
        this.csysOperatelogName = csysOperatelogName;
    }

    /**
     * @return CSYS_OPERATELOG_TYPE
     */
    public String getCsysOperatelogType() {
        return csysOperatelogType;
    }

    /**
     * @param csysOperatelogType
     */
    public void setCsysOperatelogType(String csysOperatelogType) {
        this.csysOperatelogType = csysOperatelogType;
    }

    /**
     * @return CSYS_OPERATELOG_RESOURCE
     */
    public String getCsysOperatelogResource() {
        return csysOperatelogResource;
    }

    /**
     * @param csysOperatelogResource
     */
    public void setCsysOperatelogResource(String csysOperatelogResource) {
        this.csysOperatelogResource = csysOperatelogResource;
    }

    /**
     * @return CSYS_OPERATELOG_RESOURCE_ID
     */
    public String getCsysOperatelogResourceId() {
        return csysOperatelogResourceId;
    }

    /**
     * @param csysOperatelogResourceId
     */
    public void setCsysOperatelogResourceId(String csysOperatelogResourceId) {
        this.csysOperatelogResourceId = csysOperatelogResourceId;
    }

    /**
     * @return CSYS_OPERATELOG_STATUS
     */
    public String getCsysOperatelogStatus() {
        return csysOperatelogStatus;
    }

    /**
     * @param csysOperatelogStatus
     */
    public void setCsysOperatelogStatus(String csysOperatelogStatus) {
        this.csysOperatelogStatus = csysOperatelogStatus;
    }

    /**
     * @return CSYS_OPERATELOG_OPERATOR
     */
    public String getCsysOperatelogOperator() {
        return csysOperatelogOperator;
    }

    /**
     * @param csysOperatelogOperator
     */
    public void setCsysOperatelogOperator(String csysOperatelogOperator) {
        this.csysOperatelogOperator = csysOperatelogOperator;
    }

    /**
     * @return CSYS_OPERATELOG_DESC
     */
    public String getCsysOperatelogDesc() {
        return csysOperatelogDesc;
    }

    /**
     * @param csysOperatelogDesc
     */
    public void setCsysOperatelogDesc(String csysOperatelogDesc) {
        this.csysOperatelogDesc = csysOperatelogDesc;
    }

    /**
     * @return CSYS_OPERATELOG_CREATE_TIME
     */
    public Date getCsysOperatelogCreateTime() {
        return csysOperatelogCreateTime;
    }

    /**
     * @param csysOperatelogCreateTime
     */
    public void setCsysOperatelogCreateTime(Date csysOperatelogCreateTime) {
        this.csysOperatelogCreateTime = csysOperatelogCreateTime;
    }

    /**
     * @return CSYS_OPERATELOG_CREATE_USER
     */
    public String getCsysOperatelogCreateUser() {
        return csysOperatelogCreateUser;
    }

    /**
     * @param csysOperatelogCreateUser
     */
    public void setCsysOperatelogCreateUser(String csysOperatelogCreateUser) {
        this.csysOperatelogCreateUser = csysOperatelogCreateUser;
    }

    /**
     * @return CSYS_OPERATELOG_MODIFY_TIME
     */
    public Date getCsysOperatelogModifyTime() {
        return csysOperatelogModifyTime;
    }

    /**
     * @param csysOperatelogModifyTime
     */
    public void setCsysOperatelogModifyTime(Date csysOperatelogModifyTime) {
        this.csysOperatelogModifyTime = csysOperatelogModifyTime;
    }

    /**
     * @return CSYS_OPERATELOG_MODIFY_USER
     */
    public String getCsysOperatelogModifyUser() {
        return csysOperatelogModifyUser;
    }

    /**
     * @param csysOperatelogModifyUser
     */
    public void setCsysOperatelogModifyUser(String csysOperatelogModifyUser) {
        this.csysOperatelogModifyUser = csysOperatelogModifyUser;
    }

    /**
     * @return CSYS_OPERATELOG_IS_DELETE
     */
    public String getCsysOperatelogIsDelete() {
        return csysOperatelogIsDelete;
    }

    /**
     * @param csysOperatelogIsDelete
     */
    public void setCsysOperatelogIsDelete(String csysOperatelogIsDelete) {
        this.csysOperatelogIsDelete = csysOperatelogIsDelete;
    }

    /**
     * @return CSYS_OPERATELOG_TIME
     */
    public Date getCsysOperatelogTime() {
        return csysOperatelogTime;
    }

    /**
     * @param csysOperatelogTime
     */
    public void setCsysOperatelogTime(Date csysOperatelogTime) {
        this.csysOperatelogTime = csysOperatelogTime;
    }

    /**
     * @return CSYS_OPERATELOG_DATE
     */
    public Date getCsysOperatelogDate() {
        return csysOperatelogDate;
    }

    /**
     * @param csysOperatelogDate
     */
    public void setCsysOperatelogDate(Date csysOperatelogDate) {
        this.csysOperatelogDate = csysOperatelogDate;
    }
}