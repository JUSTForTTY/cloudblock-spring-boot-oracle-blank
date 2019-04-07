package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_PAGE")
public class CsysTrsPage {
    @Id
    @Column(name = "CSYS_TRS_PAGE_ID")
    private String csysTrsPageId;

    @Column(name = "CSYS_POINT_TRS_ID")
    private String csysPointTrsId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_TRS_PAGE_DESC")
    private String csysTrsPageDesc;

    @Column(name = "CSYS_TRS_PAGE_CREATE_TIME")
    private Date csysTrsPageCreateTime;

    @Column(name = "CSYS_TRS_PAGE_MODIFY_TIME")
    private Date csysTrsPageModifyTime;

    @Column(name = "CSYS_TRS_PAGE_CREATE_USER")
    private String csysTrsPageCreateUser;

    @Column(name = "CSYS_TRS_PAGE_MODIFY_USER")
    private String csysTrsPageModifyUser;

    @Column(name = "CSYS_TRS_PAGE_IS_DELETE")
    private String csysTrsPageIsDelete;

    @Column(name = "CSYS_TRS_PAGE_TIME")
    private Date csysTrsPageTime;

    @Column(name = "CSYS_TRS_PAGE_DATE")
    private Date csysTrsPageDate;

    /**
     * @return CSYS_TRS_PAGE_ID
     */
    public String getCsysTrsPageId() {
        return csysTrsPageId;
    }

    /**
     * @param csysTrsPageId
     */
    public void setCsysTrsPageId(String csysTrsPageId) {
        this.csysTrsPageId = csysTrsPageId;
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
     * @return CSYS_PAGE_ID
     */
    public String getCsysPageId() {
        return csysPageId;
    }

    /**
     * @param csysPageId
     */
    public void setCsysPageId(String csysPageId) {
        this.csysPageId = csysPageId;
    }

    /**
     * @return CSYS_TRS_PAGE_DESC
     */
    public String getCsysTrsPageDesc() {
        return csysTrsPageDesc;
    }

    /**
     * @param csysTrsPageDesc
     */
    public void setCsysTrsPageDesc(String csysTrsPageDesc) {
        this.csysTrsPageDesc = csysTrsPageDesc;
    }

    /**
     * @return CSYS_TRS_PAGE_CREATE_TIME
     */
    public Date getCsysTrsPageCreateTime() {
        return csysTrsPageCreateTime;
    }

    /**
     * @param csysTrsPageCreateTime
     */
    public void setCsysTrsPageCreateTime(Date csysTrsPageCreateTime) {
        this.csysTrsPageCreateTime = csysTrsPageCreateTime;
    }

    /**
     * @return CSYS_TRS_PAGE_MODIFY_TIME
     */
    public Date getCsysTrsPageModifyTime() {
        return csysTrsPageModifyTime;
    }

    /**
     * @param csysTrsPageModifyTime
     */
    public void setCsysTrsPageModifyTime(Date csysTrsPageModifyTime) {
        this.csysTrsPageModifyTime = csysTrsPageModifyTime;
    }

    /**
     * @return CSYS_TRS_PAGE_CREATE_USER
     */
    public String getCsysTrsPageCreateUser() {
        return csysTrsPageCreateUser;
    }

    /**
     * @param csysTrsPageCreateUser
     */
    public void setCsysTrsPageCreateUser(String csysTrsPageCreateUser) {
        this.csysTrsPageCreateUser = csysTrsPageCreateUser;
    }

    /**
     * @return CSYS_TRS_PAGE_MODIFY_USER
     */
    public String getCsysTrsPageModifyUser() {
        return csysTrsPageModifyUser;
    }

    /**
     * @param csysTrsPageModifyUser
     */
    public void setCsysTrsPageModifyUser(String csysTrsPageModifyUser) {
        this.csysTrsPageModifyUser = csysTrsPageModifyUser;
    }

    /**
     * @return CSYS_TRS_PAGE_IS_DELETE
     */
    public String getCsysTrsPageIsDelete() {
        return csysTrsPageIsDelete;
    }

    /**
     * @param csysTrsPageIsDelete
     */
    public void setCsysTrsPageIsDelete(String csysTrsPageIsDelete) {
        this.csysTrsPageIsDelete = csysTrsPageIsDelete;
    }

    /**
     * @return CSYS_TRS_PAGE_TIME
     */
    public Date getCsysTrsPageTime() {
        return csysTrsPageTime;
    }

    /**
     * @param csysTrsPageTime
     */
    public void setCsysTrsPageTime(Date csysTrsPageTime) {
        this.csysTrsPageTime = csysTrsPageTime;
    }

    /**
     * @return CSYS_TRS_PAGE_DATE
     */
    public Date getCsysTrsPageDate() {
        return csysTrsPageDate;
    }

    /**
     * @param csysTrsPageDate
     */
    public void setCsysTrsPageDate(Date csysTrsPageDate) {
        this.csysTrsPageDate = csysTrsPageDate;
    }
}