package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_VIEW_EXPLAIN")
public class CsysViewExplain {
    @Id
    @Column(name = "CSYS_VIEW_EXPLAIN_ID")
    private String csysViewExplainId;

    @Column(name = "CSYS_VIEW_EXPLAIN_NAME")
    private String csysViewExplainName;

    @Column(name = "CSYS_VIEW_EXPLAIN_TYPE")
    private String csysViewExplainType;

    @Column(name = "CSYS_VIEW_EXPLAIN_DESC")
    private String csysViewExplainDesc;

    @Column(name = "CSYS_VIEW_EXPLAIN_CREATE_TIME")
    private Date csysViewExplainCreateTime;

    @Column(name = "CSYS_VIEW_EXPLAIN_MODIFY_TIME")
    private Date csysViewExplainModifyTime;

    @Column(name = "CSYS_VIEW_EXPLAIN_CREATE_USER")
    private String csysViewExplainCreateUser;

    @Column(name = "CSYS_VIEW_EXPLAIN_MODIFY_USER")
    private String csysViewExplainModifyUser;

    @Column(name = "CSYS_VIEW_EXPLAIN_IS_DELETE")
    private String csysViewExplainIsDelete;

    @Column(name = "CSYS_VIEW_EXPLAIN_TIME")
    private Date csysViewExplainTime;

    @Column(name = "CSYS_VIEW_EXPLAIN_DATE")
    private Date csysViewExplainDate;

    /**
     * @return CSYS_VIEW_EXPLAIN_ID
     */
    public String getCsysViewExplainId() {
        return csysViewExplainId;
    }

    /**
     * @param csysViewExplainId
     */
    public void setCsysViewExplainId(String csysViewExplainId) {
        this.csysViewExplainId = csysViewExplainId;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_NAME
     */
    public String getCsysViewExplainName() {
        return csysViewExplainName;
    }

    /**
     * @param csysViewExplainName
     */
    public void setCsysViewExplainName(String csysViewExplainName) {
        this.csysViewExplainName = csysViewExplainName;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_TYPE
     */
    public String getCsysViewExplainType() {
        return csysViewExplainType;
    }

    /**
     * @param csysViewExplainType
     */
    public void setCsysViewExplainType(String csysViewExplainType) {
        this.csysViewExplainType = csysViewExplainType;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_DESC
     */
    public String getCsysViewExplainDesc() {
        return csysViewExplainDesc;
    }

    /**
     * @param csysViewExplainDesc
     */
    public void setCsysViewExplainDesc(String csysViewExplainDesc) {
        this.csysViewExplainDesc = csysViewExplainDesc;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_CREATE_TIME
     */
    public Date getCsysViewExplainCreateTime() {
        return csysViewExplainCreateTime;
    }

    /**
     * @param csysViewExplainCreateTime
     */
    public void setCsysViewExplainCreateTime(Date csysViewExplainCreateTime) {
        this.csysViewExplainCreateTime = csysViewExplainCreateTime;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_MODIFY_TIME
     */
    public Date getCsysViewExplainModifyTime() {
        return csysViewExplainModifyTime;
    }

    /**
     * @param csysViewExplainModifyTime
     */
    public void setCsysViewExplainModifyTime(Date csysViewExplainModifyTime) {
        this.csysViewExplainModifyTime = csysViewExplainModifyTime;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_CREATE_USER
     */
    public String getCsysViewExplainCreateUser() {
        return csysViewExplainCreateUser;
    }

    /**
     * @param csysViewExplainCreateUser
     */
    public void setCsysViewExplainCreateUser(String csysViewExplainCreateUser) {
        this.csysViewExplainCreateUser = csysViewExplainCreateUser;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_MODIFY_USER
     */
    public String getCsysViewExplainModifyUser() {
        return csysViewExplainModifyUser;
    }

    /**
     * @param csysViewExplainModifyUser
     */
    public void setCsysViewExplainModifyUser(String csysViewExplainModifyUser) {
        this.csysViewExplainModifyUser = csysViewExplainModifyUser;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_IS_DELETE
     */
    public String getCsysViewExplainIsDelete() {
        return csysViewExplainIsDelete;
    }

    /**
     * @param csysViewExplainIsDelete
     */
    public void setCsysViewExplainIsDelete(String csysViewExplainIsDelete) {
        this.csysViewExplainIsDelete = csysViewExplainIsDelete;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_TIME
     */
    public Date getCsysViewExplainTime() {
        return csysViewExplainTime;
    }

    /**
     * @param csysViewExplainTime
     */
    public void setCsysViewExplainTime(Date csysViewExplainTime) {
        this.csysViewExplainTime = csysViewExplainTime;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_DATE
     */
    public Date getCsysViewExplainDate() {
        return csysViewExplainDate;
    }

    /**
     * @param csysViewExplainDate
     */
    public void setCsysViewExplainDate(Date csysViewExplainDate) {
        this.csysViewExplainDate = csysViewExplainDate;
    }
}