package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PAGE_LAYOUT")
public class CsysPageLayout {
    @Id
    @Column(name = "CSYS_PAGE_LAYOUT_ID")
    private String csysPageLayoutId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_LAYOUT_ID")
    private String csysLayoutId;

    @Column(name = "CSYS_LAYOUT_NAME")
    private String csysLayoutName;

    @Column(name = "CSYS_PAGE_LAYOUT_SENCE")
    private String csysPageLayoutSence;

    @Column(name = "CSYS_PAGE_LAYOUT_CREATE_TIME")
    private Date csysPageLayoutCreateTime;

    @Column(name = "CSYS_PAGE_LAYOUT_MODIFY_TIME")
    private Date csysPageLayoutModifyTime;

    @Column(name = "CSYS_PAGE_LAYOUT_CREATE_USER")
    private String csysPageLayoutCreateUser;

    @Column(name = "CSYS_PAGE_LAYOUT_MODIFY_USER")
    private String csysPageLayoutModifyUser;

    @Column(name = "CSYS_PAGE_LAYOUT_IS_DELETE")
    private String csysPageLayoutIsDelete;

    @Column(name = "CSYS_PAGE_LAYOUT_TIME")
    private Date csysPageLayoutTime;

    @Column(name = "CSYS_PAGE_LAYOUT_DATE")
    private Date csysPageLayoutDate;

    @Column(name = "CSYS_PAGE_LAYOUT_HTML_CODE")
    private String csysPageLayoutHtmlCode;

    /**
     * @return CSYS_PAGE_LAYOUT_ID
     */
    public String getCsysPageLayoutId() {
        return csysPageLayoutId;
    }

    /**
     * @param csysPageLayoutId
     */
    public void setCsysPageLayoutId(String csysPageLayoutId) {
        this.csysPageLayoutId = csysPageLayoutId;
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
     * @return CSYS_LAYOUT_ID
     */
    public String getCsysLayoutId() {
        return csysLayoutId;
    }

    /**
     * @param csysLayoutId
     */
    public void setCsysLayoutId(String csysLayoutId) {
        this.csysLayoutId = csysLayoutId;
    }

    /**
     * @return CSYS_LAYOUT_NAME
     */
    public String getCsysLayoutName() {
        return csysLayoutName;
    }

    /**
     * @param csysLayoutName
     */
    public void setCsysLayoutName(String csysLayoutName) {
        this.csysLayoutName = csysLayoutName;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_SENCE
     */
    public String getCsysPageLayoutSence() {
        return csysPageLayoutSence;
    }

    /**
     * @param csysPageLayoutSence
     */
    public void setCsysPageLayoutSence(String csysPageLayoutSence) {
        this.csysPageLayoutSence = csysPageLayoutSence;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_CREATE_TIME
     */
    public Date getCsysPageLayoutCreateTime() {
        return csysPageLayoutCreateTime;
    }

    /**
     * @param csysPageLayoutCreateTime
     */
    public void setCsysPageLayoutCreateTime(Date csysPageLayoutCreateTime) {
        this.csysPageLayoutCreateTime = csysPageLayoutCreateTime;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_MODIFY_TIME
     */
    public Date getCsysPageLayoutModifyTime() {
        return csysPageLayoutModifyTime;
    }

    /**
     * @param csysPageLayoutModifyTime
     */
    public void setCsysPageLayoutModifyTime(Date csysPageLayoutModifyTime) {
        this.csysPageLayoutModifyTime = csysPageLayoutModifyTime;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_CREATE_USER
     */
    public String getCsysPageLayoutCreateUser() {
        return csysPageLayoutCreateUser;
    }

    /**
     * @param csysPageLayoutCreateUser
     */
    public void setCsysPageLayoutCreateUser(String csysPageLayoutCreateUser) {
        this.csysPageLayoutCreateUser = csysPageLayoutCreateUser;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_MODIFY_USER
     */
    public String getCsysPageLayoutModifyUser() {
        return csysPageLayoutModifyUser;
    }

    /**
     * @param csysPageLayoutModifyUser
     */
    public void setCsysPageLayoutModifyUser(String csysPageLayoutModifyUser) {
        this.csysPageLayoutModifyUser = csysPageLayoutModifyUser;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_IS_DELETE
     */
    public String getCsysPageLayoutIsDelete() {
        return csysPageLayoutIsDelete;
    }

    /**
     * @param csysPageLayoutIsDelete
     */
    public void setCsysPageLayoutIsDelete(String csysPageLayoutIsDelete) {
        this.csysPageLayoutIsDelete = csysPageLayoutIsDelete;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_TIME
     */
    public Date getCsysPageLayoutTime() {
        return csysPageLayoutTime;
    }

    /**
     * @param csysPageLayoutTime
     */
    public void setCsysPageLayoutTime(Date csysPageLayoutTime) {
        this.csysPageLayoutTime = csysPageLayoutTime;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_DATE
     */
    public Date getCsysPageLayoutDate() {
        return csysPageLayoutDate;
    }

    /**
     * @param csysPageLayoutDate
     */
    public void setCsysPageLayoutDate(Date csysPageLayoutDate) {
        this.csysPageLayoutDate = csysPageLayoutDate;
    }

    /**
     * @return CSYS_PAGE_LAYOUT_HTML_CODE
     */
    public String getCsysPageLayoutHtmlCode() {
        return csysPageLayoutHtmlCode;
    }

    /**
     * @param csysPageLayoutHtmlCode
     */
    public void setCsysPageLayoutHtmlCode(String csysPageLayoutHtmlCode) {
        this.csysPageLayoutHtmlCode = csysPageLayoutHtmlCode;
    }
}