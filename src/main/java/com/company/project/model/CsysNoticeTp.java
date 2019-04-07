package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_NOTICE_TP")
public class CsysNoticeTp {
    @Id
    @Column(name = "CSYS_NOTICE_TP_ID")
    private String csysNoticeTpId;

    @Column(name = "CSYS_NOTICE_TP_NAME")
    private String csysNoticeTpName;

    @Column(name = "CSYS_NOTICE_TP_TYPE")
    private String csysNoticeTpType;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_POINT_TRS_ID")
    private String csysPointTrsId;

    @Column(name = "CSYS_POINT_TRS_CATEGORY")
    private String csysPointTrsCategory;

    @Column(name = "CSYS_NOTICE_TP_CYCLE")
    private String csysNoticeTpCycle;

    @Column(name = "CSYS_NOTICE_TP_EXECUTE")
    private Date csysNoticeTpExecute;

    @Column(name = "CSYS_NOTICE_TP_YEAR")
    private String csysNoticeTpYear;

    @Column(name = "CSYS_NOTICE_TP_MONTH")
    private String csysNoticeTpMonth;

    @Column(name = "CSYS_NOTICE_TP_MANY_DAY")
    private String csysNoticeTpManyDay;

    @Column(name = "CSYS_NOTICE_TP_QUARTERS")
    private String csysNoticeTpQuarters;

    @Column(name = "CSYS_NOTICE_TP_WEEK")
    private String csysNoticeTpWeek;

    @Column(name = "CSYS_NOTICE_TP_CTIME")
    private String csysNoticeTpCtime;

    @Column(name = "CSYS_NOTICE_TP_ST_TIME")
    private Date csysNoticeTpStTime;

    @Column(name = "CSYS_NOTICE_TP_END_TIME")
    private Date csysNoticeTpEndTime;

    @Column(name = "CSYS_NOTICE_TP_ENABLED")
    private String csysNoticeTpEnabled;

    @Column(name = "CSYS_NOTICE_TP_CREATE_TIME")
    private Date csysNoticeTpCreateTime;

    @Column(name = "CSYS_NOTICE_TP_MODIFY_TIME")
    private Date csysNoticeTpModifyTime;

    @Column(name = "CSYS_NOTICE_TP_CREATE_USER")
    private String csysNoticeTpCreateUser;

    @Column(name = "CSYS_NOTICE_TP_MODIFY_USER")
    private String csysNoticeTpModifyUser;

    @Column(name = "CSYS_NOTICE_TP_IS_DELETE")
    private String csysNoticeTpIsDelete;

    @Column(name = "CSYS_NOTICE_TP_TIME")
    private Date csysNoticeTpTime;

    @Column(name = "CSYS_NOTICE_TP_DATE")
    private Date csysNoticeTpDate;

    @Column(name = "CSYS_NOTICE_TP_CONTENT")
    private String csysNoticeTpContent;

    /**
     * @return CSYS_NOTICE_TP_ID
     */
    public String getCsysNoticeTpId() {
        return csysNoticeTpId;
    }

    /**
     * @param csysNoticeTpId
     */
    public void setCsysNoticeTpId(String csysNoticeTpId) {
        this.csysNoticeTpId = csysNoticeTpId;
    }

    /**
     * @return CSYS_NOTICE_TP_NAME
     */
    public String getCsysNoticeTpName() {
        return csysNoticeTpName;
    }

    /**
     * @param csysNoticeTpName
     */
    public void setCsysNoticeTpName(String csysNoticeTpName) {
        this.csysNoticeTpName = csysNoticeTpName;
    }

    /**
     * @return CSYS_NOTICE_TP_TYPE
     */
    public String getCsysNoticeTpType() {
        return csysNoticeTpType;
    }

    /**
     * @param csysNoticeTpType
     */
    public void setCsysNoticeTpType(String csysNoticeTpType) {
        this.csysNoticeTpType = csysNoticeTpType;
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
     * @return CSYS_POINT_TRS_CATEGORY
     */
    public String getCsysPointTrsCategory() {
        return csysPointTrsCategory;
    }

    /**
     * @param csysPointTrsCategory
     */
    public void setCsysPointTrsCategory(String csysPointTrsCategory) {
        this.csysPointTrsCategory = csysPointTrsCategory;
    }

    /**
     * @return CSYS_NOTICE_TP_CYCLE
     */
    public String getCsysNoticeTpCycle() {
        return csysNoticeTpCycle;
    }

    /**
     * @param csysNoticeTpCycle
     */
    public void setCsysNoticeTpCycle(String csysNoticeTpCycle) {
        this.csysNoticeTpCycle = csysNoticeTpCycle;
    }

    /**
     * @return CSYS_NOTICE_TP_EXECUTE
     */
    public Date getCsysNoticeTpExecute() {
        return csysNoticeTpExecute;
    }

    /**
     * @param csysNoticeTpExecute
     */
    public void setCsysNoticeTpExecute(Date csysNoticeTpExecute) {
        this.csysNoticeTpExecute = csysNoticeTpExecute;
    }

    /**
     * @return CSYS_NOTICE_TP_YEAR
     */
    public String getCsysNoticeTpYear() {
        return csysNoticeTpYear;
    }

    /**
     * @param csysNoticeTpYear
     */
    public void setCsysNoticeTpYear(String csysNoticeTpYear) {
        this.csysNoticeTpYear = csysNoticeTpYear;
    }

    /**
     * @return CSYS_NOTICE_TP_MONTH
     */
    public String getCsysNoticeTpMonth() {
        return csysNoticeTpMonth;
    }

    /**
     * @param csysNoticeTpMonth
     */
    public void setCsysNoticeTpMonth(String csysNoticeTpMonth) {
        this.csysNoticeTpMonth = csysNoticeTpMonth;
    }

    /**
     * @return CSYS_NOTICE_TP_MANY_DAY
     */
    public String getCsysNoticeTpManyDay() {
        return csysNoticeTpManyDay;
    }

    /**
     * @param csysNoticeTpManyDay
     */
    public void setCsysNoticeTpManyDay(String csysNoticeTpManyDay) {
        this.csysNoticeTpManyDay = csysNoticeTpManyDay;
    }

    /**
     * @return CSYS_NOTICE_TP_QUARTERS
     */
    public String getCsysNoticeTpQuarters() {
        return csysNoticeTpQuarters;
    }

    /**
     * @param csysNoticeTpQuarters
     */
    public void setCsysNoticeTpQuarters(String csysNoticeTpQuarters) {
        this.csysNoticeTpQuarters = csysNoticeTpQuarters;
    }

    /**
     * @return CSYS_NOTICE_TP_WEEK
     */
    public String getCsysNoticeTpWeek() {
        return csysNoticeTpWeek;
    }

    /**
     * @param csysNoticeTpWeek
     */
    public void setCsysNoticeTpWeek(String csysNoticeTpWeek) {
        this.csysNoticeTpWeek = csysNoticeTpWeek;
    }

    /**
     * @return CSYS_NOTICE_TP_CTIME
     */
    public String getCsysNoticeTpCtime() {
        return csysNoticeTpCtime;
    }

    /**
     * @param csysNoticeTpCtime
     */
    public void setCsysNoticeTpCtime(String csysNoticeTpCtime) {
        this.csysNoticeTpCtime = csysNoticeTpCtime;
    }

    /**
     * @return CSYS_NOTICE_TP_ST_TIME
     */
    public Date getCsysNoticeTpStTime() {
        return csysNoticeTpStTime;
    }

    /**
     * @param csysNoticeTpStTime
     */
    public void setCsysNoticeTpStTime(Date csysNoticeTpStTime) {
        this.csysNoticeTpStTime = csysNoticeTpStTime;
    }

    /**
     * @return CSYS_NOTICE_TP_END_TIME
     */
    public Date getCsysNoticeTpEndTime() {
        return csysNoticeTpEndTime;
    }

    /**
     * @param csysNoticeTpEndTime
     */
    public void setCsysNoticeTpEndTime(Date csysNoticeTpEndTime) {
        this.csysNoticeTpEndTime = csysNoticeTpEndTime;
    }

    /**
     * @return CSYS_NOTICE_TP_ENABLED
     */
    public String getCsysNoticeTpEnabled() {
        return csysNoticeTpEnabled;
    }

    /**
     * @param csysNoticeTpEnabled
     */
    public void setCsysNoticeTpEnabled(String csysNoticeTpEnabled) {
        this.csysNoticeTpEnabled = csysNoticeTpEnabled;
    }

    /**
     * @return CSYS_NOTICE_TP_CREATE_TIME
     */
    public Date getCsysNoticeTpCreateTime() {
        return csysNoticeTpCreateTime;
    }

    /**
     * @param csysNoticeTpCreateTime
     */
    public void setCsysNoticeTpCreateTime(Date csysNoticeTpCreateTime) {
        this.csysNoticeTpCreateTime = csysNoticeTpCreateTime;
    }

    /**
     * @return CSYS_NOTICE_TP_MODIFY_TIME
     */
    public Date getCsysNoticeTpModifyTime() {
        return csysNoticeTpModifyTime;
    }

    /**
     * @param csysNoticeTpModifyTime
     */
    public void setCsysNoticeTpModifyTime(Date csysNoticeTpModifyTime) {
        this.csysNoticeTpModifyTime = csysNoticeTpModifyTime;
    }

    /**
     * @return CSYS_NOTICE_TP_CREATE_USER
     */
    public String getCsysNoticeTpCreateUser() {
        return csysNoticeTpCreateUser;
    }

    /**
     * @param csysNoticeTpCreateUser
     */
    public void setCsysNoticeTpCreateUser(String csysNoticeTpCreateUser) {
        this.csysNoticeTpCreateUser = csysNoticeTpCreateUser;
    }

    /**
     * @return CSYS_NOTICE_TP_MODIFY_USER
     */
    public String getCsysNoticeTpModifyUser() {
        return csysNoticeTpModifyUser;
    }

    /**
     * @param csysNoticeTpModifyUser
     */
    public void setCsysNoticeTpModifyUser(String csysNoticeTpModifyUser) {
        this.csysNoticeTpModifyUser = csysNoticeTpModifyUser;
    }

    /**
     * @return CSYS_NOTICE_TP_IS_DELETE
     */
    public String getCsysNoticeTpIsDelete() {
        return csysNoticeTpIsDelete;
    }

    /**
     * @param csysNoticeTpIsDelete
     */
    public void setCsysNoticeTpIsDelete(String csysNoticeTpIsDelete) {
        this.csysNoticeTpIsDelete = csysNoticeTpIsDelete;
    }

    /**
     * @return CSYS_NOTICE_TP_TIME
     */
    public Date getCsysNoticeTpTime() {
        return csysNoticeTpTime;
    }

    /**
     * @param csysNoticeTpTime
     */
    public void setCsysNoticeTpTime(Date csysNoticeTpTime) {
        this.csysNoticeTpTime = csysNoticeTpTime;
    }

    /**
     * @return CSYS_NOTICE_TP_DATE
     */
    public Date getCsysNoticeTpDate() {
        return csysNoticeTpDate;
    }

    /**
     * @param csysNoticeTpDate
     */
    public void setCsysNoticeTpDate(Date csysNoticeTpDate) {
        this.csysNoticeTpDate = csysNoticeTpDate;
    }

    /**
     * @return CSYS_NOTICE_TP_CONTENT
     */
    public String getCsysNoticeTpContent() {
        return csysNoticeTpContent;
    }

    /**
     * @param csysNoticeTpContent
     */
    public void setCsysNoticeTpContent(String csysNoticeTpContent) {
        this.csysNoticeTpContent = csysNoticeTpContent;
    }
}