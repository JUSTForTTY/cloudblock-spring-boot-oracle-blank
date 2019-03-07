package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PAGE")
public class CsysPage {
	@Id
    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PAGE_NAME")
    private String csysPageName;

    @Column(name = "CSYS_PAGE_LAYOUT_ID")
    private String csysPageLayoutId;

    @Column(name = "CSYS_PAGE_SORT")
    private Integer csysPageSort;

    @Column(name = "CSYS_PAGE_ROUTH_PATH")
    private String csysPageRouthPath;

    @Column(name = "CSYS_PAGE_SELECTOR")
    private String csysPageSelector;

    @Column(name = "CSYS_PAGE_STATUS")
    private String csysPageStatus;

    @Column(name = "CSYS_PAGE_GITSTATUS")
    private String csysPageGitstatus;

    @Column(name = "CSYS_PAGE_TYPE")
    private String csysPageType;

    @Column(name = "CSYS_PAGE_CREATE_TIME")
    private Date csysPageCreateTime;

    @Column(name = "CSYS_PAGE_MODIFY_TIME")
    private Date csysPageModifyTime;

    @Column(name = "CSYS_PAGE_CREATE_USER")
    private String csysPageCreateUser;

    @Column(name = "CSYS_PAGE_MODIFY_USER")
    private String csysPageModifyUser;

    @Column(name = "CSYS_PAGE_IS_DELETE")
    private String csysPageIsDelete;

    @Column(name = "CSYS_PAGE_CODE_NAME")
    private String csysPageCodeName;

    @Column(name = "CY_SYS_PAGE_TEMP_ID")
    private String cySysPageTempId;

    @Column(name = "CSYS_PAGE_TIME")
    private Date csysPageTime;

    @Column(name = "CSYS_PAGE_DATE")
    private Date csysPageDate;

    @Column(name = "CSYS_PAGE_HTML_CODE")
    private String csysPageHtmlCode;

    @Column(name = "CSYS_PAGE_SETTINGS_JSON")
    private String csysPageSettingsJson;

    @Column(name = "CSYS_PAGE_INFO_JSON")
    private String csysPageInfoJson;

    @Column(name = "CSYS_PAGE_HTML_DROP_CODE")
    private String csysPageHtmlDropCode;

    @Column(name = "CSYS_PAGE_HTML_TS_CODE")
    private String csysPageHtmlTsCode;

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
     * @return CSYS_PAGE_NAME
     */
    public String getCsysPageName() {
        return csysPageName;
    }

    /**
     * @param csysPageName
     */
    public void setCsysPageName(String csysPageName) {
        this.csysPageName = csysPageName;
    }

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
     * @return CSYS_PAGE_SORT
     */
    public Integer getCsysPageSort() {
        return csysPageSort;
    }

    /**
     * @param csysPageSort
     */
    public void setCsysPageSort(Integer csysPageSort) {
        this.csysPageSort = csysPageSort;
    }

    /**
     * @return CSYS_PAGE_ROUTH_PATH
     */
    public String getCsysPageRouthPath() {
        return csysPageRouthPath;
    }

    /**
     * @param csysPageRouthPath
     */
    public void setCsysPageRouthPath(String csysPageRouthPath) {
        this.csysPageRouthPath = csysPageRouthPath;
    }

    /**
     * @return CSYS_PAGE_SELECTOR
     */
    public String getCsysPageSelector() {
        return csysPageSelector;
    }

    /**
     * @param csysPageSelector
     */
    public void setCsysPageSelector(String csysPageSelector) {
        this.csysPageSelector = csysPageSelector;
    }

    /**
     * @return CSYS_PAGE_STATUS
     */
    public String getCsysPageStatus() {
        return csysPageStatus;
    }

    /**
     * @param csysPageStatus
     */
    public void setCsysPageStatus(String csysPageStatus) {
        this.csysPageStatus = csysPageStatus;
    }

    /**
     * @return CSYS_PAGE_GITSTATUS
     */
    public String getCsysPageGitstatus() {
        return csysPageGitstatus;
    }

    /**
     * @param csysPageGitstatus
     */
    public void setCsysPageGitstatus(String csysPageGitstatus) {
        this.csysPageGitstatus = csysPageGitstatus;
    }

    /**
     * @return CSYS_PAGE_TYPE
     */
    public String getCsysPageType() {
        return csysPageType;
    }

    /**
     * @param csysPageType
     */
    public void setCsysPageType(String csysPageType) {
        this.csysPageType = csysPageType;
    }

    /**
     * @return CSYS_PAGE_CREATE_TIME
     */
    public Date getCsysPageCreateTime() {
        return csysPageCreateTime;
    }

    /**
     * @param csysPageCreateTime
     */
    public void setCsysPageCreateTime(Date csysPageCreateTime) {
        this.csysPageCreateTime = csysPageCreateTime;
    }

    /**
     * @return CSYS_PAGE_MODIFY_TIME
     */
    public Date getCsysPageModifyTime() {
        return csysPageModifyTime;
    }

    /**
     * @param csysPageModifyTime
     */
    public void setCsysPageModifyTime(Date csysPageModifyTime) {
        this.csysPageModifyTime = csysPageModifyTime;
    }

    /**
     * @return CSYS_PAGE_CREATE_USER
     */
    public String getCsysPageCreateUser() {
        return csysPageCreateUser;
    }

    /**
     * @param csysPageCreateUser
     */
    public void setCsysPageCreateUser(String csysPageCreateUser) {
        this.csysPageCreateUser = csysPageCreateUser;
    }

    /**
     * @return CSYS_PAGE_MODIFY_USER
     */
    public String getCsysPageModifyUser() {
        return csysPageModifyUser;
    }

    /**
     * @param csysPageModifyUser
     */
    public void setCsysPageModifyUser(String csysPageModifyUser) {
        this.csysPageModifyUser = csysPageModifyUser;
    }

    /**
     * @return CSYS_PAGE_IS_DELETE
     */
    public String getCsysPageIsDelete() {
        return csysPageIsDelete;
    }

    /**
     * @param csysPageIsDelete
     */
    public void setCsysPageIsDelete(String csysPageIsDelete) {
        this.csysPageIsDelete = csysPageIsDelete;
    }

    /**
     * @return CSYS_PAGE_CODE_NAME
     */
    public String getCsysPageCodeName() {
        return csysPageCodeName;
    }

    /**
     * @param csysPageCodeName
     */
    public void setCsysPageCodeName(String csysPageCodeName) {
        this.csysPageCodeName = csysPageCodeName;
    }

    /**
     * @return CY_SYS_PAGE_TEMP_ID
     */
    public String getCySysPageTempId() {
        return cySysPageTempId;
    }

    /**
     * @param cySysPageTempId
     */
    public void setCySysPageTempId(String cySysPageTempId) {
        this.cySysPageTempId = cySysPageTempId;
    }

    /**
     * @return CSYS_PAGE_TIME
     */
    public Date getCsysPageTime() {
        return csysPageTime;
    }

    /**
     * @param csysPageTime
     */
    public void setCsysPageTime(Date csysPageTime) {
        this.csysPageTime = csysPageTime;
    }

    /**
     * @return CSYS_PAGE_DATE
     */
    public Date getCsysPageDate() {
        return csysPageDate;
    }

    /**
     * @param csysPageDate
     */
    public void setCsysPageDate(Date csysPageDate) {
        this.csysPageDate = csysPageDate;
    }

    /**
     * @return CSYS_PAGE_HTML_CODE
     */
    public String getCsysPageHtmlCode() {
        return csysPageHtmlCode;
    }

    /**
     * @param csysPageHtmlCode
     */
    public void setCsysPageHtmlCode(String csysPageHtmlCode) {
        this.csysPageHtmlCode = csysPageHtmlCode;
    }

    /**
     * @return CSYS_PAGE_SETTINGS_JSON
     */
    public String getCsysPageSettingsJson() {
        return csysPageSettingsJson;
    }

    /**
     * @param csysPageSettingsJson
     */
    public void setCsysPageSettingsJson(String csysPageSettingsJson) {
        this.csysPageSettingsJson = csysPageSettingsJson;
    }

    /**
     * @return CSYS_PAGE_INFO_JSON
     */
    public String getCsysPageInfoJson() {
        return csysPageInfoJson;
    }

    /**
     * @param csysPageInfoJson
     */
    public void setCsysPageInfoJson(String csysPageInfoJson) {
        this.csysPageInfoJson = csysPageInfoJson;
    }

    /**
     * @return CSYS_PAGE_HTML_DROP_CODE
     */
    public String getCsysPageHtmlDropCode() {
        return csysPageHtmlDropCode;
    }

    /**
     * @param csysPageHtmlDropCode
     */
    public void setCsysPageHtmlDropCode(String csysPageHtmlDropCode) {
        this.csysPageHtmlDropCode = csysPageHtmlDropCode;
    }

    /**
     * @return CSYS_PAGE_HTML_TS_CODE
     */
    public String getCsysPageHtmlTsCode() {
        return csysPageHtmlTsCode;
    }

    /**
     * @param csysPageHtmlTsCode
     */
    public void setCsysPageHtmlTsCode(String csysPageHtmlTsCode) {
        this.csysPageHtmlTsCode = csysPageHtmlTsCode;
    }
}