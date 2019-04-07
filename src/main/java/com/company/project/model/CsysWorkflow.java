package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_WORKFLOW")
public class CsysWorkflow {
    @Id
    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_TYPE")
    private String csysWorkflowType;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_WORKFLOW_COLORTHEME")
    private String csysWorkflowColortheme;

    @Column(name = "CSYS_WORKFLOW_LINESTYLE")
    private String csysWorkflowLinestyle;

    @Column(name = "CSYS_WORKFLOW_ORIENTATION")
    private String csysWorkflowOrientation;

    @Column(name = "CSYS_WORKFLOW_PARENT_ID")
    private String csysWorkflowParentId;

    @Column(name = "CSYS_WORKFLOW_VERSION")
    private String csysWorkflowVersion;

    @Column(name = "CSYS_WORKFLOW_DUE_DATE")
    private BigDecimal csysWorkflowDueDate;

    @Column(name = "CSYS_WORKFLOW_DESC")
    private String csysWorkflowDesc;

    @Column(name = "CSYS_WORKFLOW_CREATE_TIME")
    private Date csysWorkflowCreateTime;

    @Column(name = "CSYS_WORKFLOW_CREATE_USER")
    private String csysWorkflowCreateUser;

    @Column(name = "CSYS_WORKFLOW_MODIFY_USER")
    private String csysWorkflowModifyUser;

    @Column(name = "CSYS_WORKFLOW_MODIFY_TIME")
    private Date csysWorkflowModifyTime;

    @Column(name = "CSYS_WORKFLOW_IS_DELETE")
    private String csysWorkflowIsDelete;

    @Column(name = "CSYS_WORKFLOW_DATE")
    private Date csysWorkflowDate;

    @Column(name = "CSYS_WORKFLOW_TIME")
    private Date csysWorkflowTime;

    @Column(name = "CSYS_WORKFLOW_NODES")
    private String csysWorkflowNodes;

    @Column(name = "CSYS_WORKFLOW_LINKS")
    private String csysWorkflowLinks;

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
     * @return CSYS_WORKFLOW_TYPE
     */
    public String getCsysWorkflowType() {
        return csysWorkflowType;
    }

    /**
     * @param csysWorkflowType
     */
    public void setCsysWorkflowType(String csysWorkflowType) {
        this.csysWorkflowType = csysWorkflowType;
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
     * @return CSYS_WORKFLOW_COLORTHEME
     */
    public String getCsysWorkflowColortheme() {
        return csysWorkflowColortheme;
    }

    /**
     * @param csysWorkflowColortheme
     */
    public void setCsysWorkflowColortheme(String csysWorkflowColortheme) {
        this.csysWorkflowColortheme = csysWorkflowColortheme;
    }

    /**
     * @return CSYS_WORKFLOW_LINESTYLE
     */
    public String getCsysWorkflowLinestyle() {
        return csysWorkflowLinestyle;
    }

    /**
     * @param csysWorkflowLinestyle
     */
    public void setCsysWorkflowLinestyle(String csysWorkflowLinestyle) {
        this.csysWorkflowLinestyle = csysWorkflowLinestyle;
    }

    /**
     * @return CSYS_WORKFLOW_ORIENTATION
     */
    public String getCsysWorkflowOrientation() {
        return csysWorkflowOrientation;
    }

    /**
     * @param csysWorkflowOrientation
     */
    public void setCsysWorkflowOrientation(String csysWorkflowOrientation) {
        this.csysWorkflowOrientation = csysWorkflowOrientation;
    }

    /**
     * @return CSYS_WORKFLOW_PARENT_ID
     */
    public String getCsysWorkflowParentId() {
        return csysWorkflowParentId;
    }

    /**
     * @param csysWorkflowParentId
     */
    public void setCsysWorkflowParentId(String csysWorkflowParentId) {
        this.csysWorkflowParentId = csysWorkflowParentId;
    }

    /**
     * @return CSYS_WORKFLOW_VERSION
     */
    public String getCsysWorkflowVersion() {
        return csysWorkflowVersion;
    }

    /**
     * @param csysWorkflowVersion
     */
    public void setCsysWorkflowVersion(String csysWorkflowVersion) {
        this.csysWorkflowVersion = csysWorkflowVersion;
    }

    /**
     * @return CSYS_WORKFLOW_DUE_DATE
     */
    public BigDecimal getCsysWorkflowDueDate() {
        return csysWorkflowDueDate;
    }

    /**
     * @param csysWorkflowDueDate
     */
    public void setCsysWorkflowDueDate(BigDecimal csysWorkflowDueDate) {
        this.csysWorkflowDueDate = csysWorkflowDueDate;
    }

    /**
     * @return CSYS_WORKFLOW_DESC
     */
    public String getCsysWorkflowDesc() {
        return csysWorkflowDesc;
    }

    /**
     * @param csysWorkflowDesc
     */
    public void setCsysWorkflowDesc(String csysWorkflowDesc) {
        this.csysWorkflowDesc = csysWorkflowDesc;
    }

    /**
     * @return CSYS_WORKFLOW_CREATE_TIME
     */
    public Date getCsysWorkflowCreateTime() {
        return csysWorkflowCreateTime;
    }

    /**
     * @param csysWorkflowCreateTime
     */
    public void setCsysWorkflowCreateTime(Date csysWorkflowCreateTime) {
        this.csysWorkflowCreateTime = csysWorkflowCreateTime;
    }

    /**
     * @return CSYS_WORKFLOW_CREATE_USER
     */
    public String getCsysWorkflowCreateUser() {
        return csysWorkflowCreateUser;
    }

    /**
     * @param csysWorkflowCreateUser
     */
    public void setCsysWorkflowCreateUser(String csysWorkflowCreateUser) {
        this.csysWorkflowCreateUser = csysWorkflowCreateUser;
    }

    /**
     * @return CSYS_WORKFLOW_MODIFY_USER
     */
    public String getCsysWorkflowModifyUser() {
        return csysWorkflowModifyUser;
    }

    /**
     * @param csysWorkflowModifyUser
     */
    public void setCsysWorkflowModifyUser(String csysWorkflowModifyUser) {
        this.csysWorkflowModifyUser = csysWorkflowModifyUser;
    }

    /**
     * @return CSYS_WORKFLOW_MODIFY_TIME
     */
    public Date getCsysWorkflowModifyTime() {
        return csysWorkflowModifyTime;
    }

    /**
     * @param csysWorkflowModifyTime
     */
    public void setCsysWorkflowModifyTime(Date csysWorkflowModifyTime) {
        this.csysWorkflowModifyTime = csysWorkflowModifyTime;
    }

    /**
     * @return CSYS_WORKFLOW_IS_DELETE
     */
    public String getCsysWorkflowIsDelete() {
        return csysWorkflowIsDelete;
    }

    /**
     * @param csysWorkflowIsDelete
     */
    public void setCsysWorkflowIsDelete(String csysWorkflowIsDelete) {
        this.csysWorkflowIsDelete = csysWorkflowIsDelete;
    }

    /**
     * @return CSYS_WORKFLOW_DATE
     */
    public Date getCsysWorkflowDate() {
        return csysWorkflowDate;
    }

    /**
     * @param csysWorkflowDate
     */
    public void setCsysWorkflowDate(Date csysWorkflowDate) {
        this.csysWorkflowDate = csysWorkflowDate;
    }

    /**
     * @return CSYS_WORKFLOW_TIME
     */
    public Date getCsysWorkflowTime() {
        return csysWorkflowTime;
    }

    /**
     * @param csysWorkflowTime
     */
    public void setCsysWorkflowTime(Date csysWorkflowTime) {
        this.csysWorkflowTime = csysWorkflowTime;
    }

    /**
     * @return CSYS_WORKFLOW_NODES
     */
    public String getCsysWorkflowNodes() {
        return csysWorkflowNodes;
    }

    /**
     * @param csysWorkflowNodes
     */
    public void setCsysWorkflowNodes(String csysWorkflowNodes) {
        this.csysWorkflowNodes = csysWorkflowNodes;
    }

    /**
     * @return CSYS_WORKFLOW_LINKS
     */
    public String getCsysWorkflowLinks() {
        return csysWorkflowLinks;
    }

    /**
     * @param csysWorkflowLinks
     */
    public void setCsysWorkflowLinks(String csysWorkflowLinks) {
        this.csysWorkflowLinks = csysWorkflowLinks;
    }
}