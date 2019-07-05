package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_RULESQL")
public class CsysTrsRulesql {
    @Id
    @Column(name = "CSYS_TRS_RULESQL_ID")
    private String csysTrsRulesqlId;

    @Column(name = "CSYS_TRS_RULESQL_RAW_DATA")
    private String csysTrsRulesqlRawData;

    @Column(name = "CSYS_TRS_RULESQL_METHOD")
    private String csysTrsRulesqlMethod;

    @Column(name = "CSYS_TRS_RULESQL_CONTRAST_DATA")
    private String csysTrsRulesqlContrastData;

    @Column(name = "CSYS_TRS_RULESQL_INFO")
    private String csysTrsRulesqlInfo;

    @Column(name = "CSYS_TRS_RULESQL_CREATE_TIME")
    private Date csysTrsRulesqlCreateTime;

    @Column(name = "CSYS_TRS_RULESQL_CREATE_USER")
    private String csysTrsRulesqlCreateUser;

    @Column(name = "CSYS_TRS_RULESQL_MODIFY_TIME")
    private Date csysTrsRulesqlModifyTime;

    @Column(name = "CSYS_TRS_RULESQL_MODIFY_USER")
    private String csysTrsRulesqlModifyUser;

    @Column(name = "CSYS_TRS_RULESQL_IS_DELETE")
    private String csysTrsRulesqlIsDelete;

    @Column(name = "CSYS_TRS_RULESQL_TIME")
    private Date csysTrsRulesqlTime;

    @Column(name = "CSYS_TRS_RULESQL_DATE")
    private Date csysTrsRulesqlDate;

    @Column(name = "CSYS_TRS_RULESQL_DEC")
    private String csysTrsRulesqlDec;

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

    /**
     * @return CSYS_TRS_RULESQL_RAW_DATA
     */
    public String getCsysTrsRulesqlRawData() {
        return csysTrsRulesqlRawData;
    }

    /**
     * @param csysTrsRulesqlRawData
     */
    public void setCsysTrsRulesqlRawData(String csysTrsRulesqlRawData) {
        this.csysTrsRulesqlRawData = csysTrsRulesqlRawData;
    }

    /**
     * @return CSYS_TRS_RULESQL_METHOD
     */
    public String getCsysTrsRulesqlMethod() {
        return csysTrsRulesqlMethod;
    }

    /**
     * @param csysTrsRulesqlMethod
     */
    public void setCsysTrsRulesqlMethod(String csysTrsRulesqlMethod) {
        this.csysTrsRulesqlMethod = csysTrsRulesqlMethod;
    }

    /**
     * @return CSYS_TRS_RULESQL_CONTRAST_DATA
     */
    public String getCsysTrsRulesqlContrastData() {
        return csysTrsRulesqlContrastData;
    }

    /**
     * @param csysTrsRulesqlContrastData
     */
    public void setCsysTrsRulesqlContrastData(String csysTrsRulesqlContrastData) {
        this.csysTrsRulesqlContrastData = csysTrsRulesqlContrastData;
    }

    /**
     * @return CSYS_TRS_RULESQL_INFO
     */
    public String getCsysTrsRulesqlInfo() {
        return csysTrsRulesqlInfo;
    }

    /**
     * @param csysTrsRulesqlInfo
     */
    public void setCsysTrsRulesqlInfo(String csysTrsRulesqlInfo) {
        this.csysTrsRulesqlInfo = csysTrsRulesqlInfo;
    }

    /**
     * @return CSYS_TRS_RULESQL_CREATE_TIME
     */
    public Date getCsysTrsRulesqlCreateTime() {
        return csysTrsRulesqlCreateTime;
    }

    /**
     * @param csysTrsRulesqlCreateTime
     */
    public void setCsysTrsRulesqlCreateTime(Date csysTrsRulesqlCreateTime) {
        this.csysTrsRulesqlCreateTime = csysTrsRulesqlCreateTime;
    }

    /**
     * @return CSYS_TRS_RULESQL_CREATE_USER
     */
    public String getCsysTrsRulesqlCreateUser() {
        return csysTrsRulesqlCreateUser;
    }

    /**
     * @param csysTrsRulesqlCreateUser
     */
    public void setCsysTrsRulesqlCreateUser(String csysTrsRulesqlCreateUser) {
        this.csysTrsRulesqlCreateUser = csysTrsRulesqlCreateUser;
    }

    /**
     * @return CSYS_TRS_RULESQL_MODIFY_TIME
     */
    public Date getCsysTrsRulesqlModifyTime() {
        return csysTrsRulesqlModifyTime;
    }

    /**
     * @param csysTrsRulesqlModifyTime
     */
    public void setCsysTrsRulesqlModifyTime(Date csysTrsRulesqlModifyTime) {
        this.csysTrsRulesqlModifyTime = csysTrsRulesqlModifyTime;
    }

    /**
     * @return CSYS_TRS_RULESQL_MODIFY_USER
     */
    public String getCsysTrsRulesqlModifyUser() {
        return csysTrsRulesqlModifyUser;
    }

    /**
     * @param csysTrsRulesqlModifyUser
     */
    public void setCsysTrsRulesqlModifyUser(String csysTrsRulesqlModifyUser) {
        this.csysTrsRulesqlModifyUser = csysTrsRulesqlModifyUser;
    }

    /**
     * @return CSYS_TRS_RULESQL_IS_DELETE
     */
    public String getCsysTrsRulesqlIsDelete() {
        return csysTrsRulesqlIsDelete;
    }

    /**
     * @param csysTrsRulesqlIsDelete
     */
    public void setCsysTrsRulesqlIsDelete(String csysTrsRulesqlIsDelete) {
        this.csysTrsRulesqlIsDelete = csysTrsRulesqlIsDelete;
    }

    /**
     * @return CSYS_TRS_RULESQL_TIME
     */
    public Date getCsysTrsRulesqlTime() {
        return csysTrsRulesqlTime;
    }

    /**
     * @param csysTrsRulesqlTime
     */
    public void setCsysTrsRulesqlTime(Date csysTrsRulesqlTime) {
        this.csysTrsRulesqlTime = csysTrsRulesqlTime;
    }

    /**
     * @return CSYS_TRS_RULESQL_DATE
     */
    public Date getCsysTrsRulesqlDate() {
        return csysTrsRulesqlDate;
    }

    /**
     * @param csysTrsRulesqlDate
     */
    public void setCsysTrsRulesqlDate(Date csysTrsRulesqlDate) {
        this.csysTrsRulesqlDate = csysTrsRulesqlDate;
    }

    /**
     * @return CSYS_TRS_RULESQL_DEC
     */
    public String getCsysTrsRulesqlDec() {
        return csysTrsRulesqlDec;
    }

    /**
     * @param csysTrsRulesqlDec
     */
    public void setCsysTrsRulesqlDec(String csysTrsRulesqlDec) {
        this.csysTrsRulesqlDec = csysTrsRulesqlDec;
    }
}