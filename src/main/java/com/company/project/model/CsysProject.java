package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PROJECT")
public class CsysProject {
    @Id
    @Column(name = "CSYS_PROJECT_ID")
    private String csysProjectId;

    @Column(name = "CSYS_PROJECT_NAME")
    private String csysProjectName;

    @Column(name = "CSYS_PROJECT_COMPANY")
    private String csysProjectCompany;

    @Column(name = "CSYS_PROJECT_LOGIN_LOGO")
    private String csysProjectLoginLogo;

    @Column(name = "CSYS_PROJECT_BG")
    private String csysProjectBg;

    @Column(name = "CSYS_PROJECT_LOADING_LOGO")
    private String csysProjectLoadingLogo;

    @Column(name = "CSYS_PROJECT_LOGO_BG")
    private String csysProjectLogoBg;

    @Column(name = "CSYS_PROJECT_TOP_BG")
    private String csysProjectTopBg;

    @Column(name = "CSYS_PROJECT_NAVIGATION_BG")
    private String csysProjectNavigationBg;

    @Column(name = "CSYS_PROJECT_SUSP_COLOR")
    private String csysProjectSuspColor;

    @Column(name = "CSYS_PROJECT_MAIN_MENU_BG")
    private String csysProjectMainMenuBg;

    @Column(name = "CSYS_PROJECT_SUB_MENU_BG")
    private String csysProjectSubMenuBg;

    @Column(name = "CSYS_PROJECT_RECORD_INFO")
    private String csysProjectRecordInfo;

    @Column(name = "CSYS_PROJECT_STYLE")
    private String csysProjectStyle;

    @Column(name = "CSYS_PROJECT_CREATE_TIME")
    private Date csysProjectCreateTime;

    @Column(name = "CSYS_PROJECT_CREATE_USER")
    private String csysProjectCreateUser;

    @Column(name = "CSYS_PROJECT_MODIFY_TIME")
    private Date csysProjectModifyTime;

    @Column(name = "CSYS_PROJECT_MODIFY_USER")
    private String csysProjectModifyUser;

    @Column(name = "CSYS_PROJECT_IS_DELETE")
    private String csysProjectIsDelete;

    @Column(name = "CSYS_PROJECT_TIME")
    private Date csysProjectTime;

    @Column(name = "CSYS_PROJECT_DATE")
    private Date csysProjectDate;

    /**
     * @return CSYS_PROJECT_ID
     */
    public String getCsysProjectId() {
        return csysProjectId;
    }

    /**
     * @param csysProjectId
     */
    public void setCsysProjectId(String csysProjectId) {
        this.csysProjectId = csysProjectId;
    }

    /**
     * @return CSYS_PROJECT_NAME
     */
    public String getCsysProjectName() {
        return csysProjectName;
    }

    /**
     * @param csysProjectName
     */
    public void setCsysProjectName(String csysProjectName) {
        this.csysProjectName = csysProjectName;
    }

    /**
     * @return CSYS_PROJECT_COMPANY
     */
    public String getCsysProjectCompany() {
        return csysProjectCompany;
    }

    /**
     * @param csysProjectCompany
     */
    public void setCsysProjectCompany(String csysProjectCompany) {
        this.csysProjectCompany = csysProjectCompany;
    }

    /**
     * @return CSYS_PROJECT_LOGIN_LOGO
     */
    public String getCsysProjectLoginLogo() {
        return csysProjectLoginLogo;
    }

    /**
     * @param csysProjectLoginLogo
     */
    public void setCsysProjectLoginLogo(String csysProjectLoginLogo) {
        this.csysProjectLoginLogo = csysProjectLoginLogo;
    }

    /**
     * @return CSYS_PROJECT_BG
     */
    public String getCsysProjectBg() {
        return csysProjectBg;
    }

    /**
     * @param csysProjectBg
     */
    public void setCsysProjectBg(String csysProjectBg) {
        this.csysProjectBg = csysProjectBg;
    }

    /**
     * @return CSYS_PROJECT_LOADING_LOGO
     */
    public String getCsysProjectLoadingLogo() {
        return csysProjectLoadingLogo;
    }

    /**
     * @param csysProjectLoadingLogo
     */
    public void setCsysProjectLoadingLogo(String csysProjectLoadingLogo) {
        this.csysProjectLoadingLogo = csysProjectLoadingLogo;
    }

    /**
     * @return CSYS_PROJECT_LOGO_BG
     */
    public String getCsysProjectLogoBg() {
        return csysProjectLogoBg;
    }

    /**
     * @param csysProjectLogoBg
     */
    public void setCsysProjectLogoBg(String csysProjectLogoBg) {
        this.csysProjectLogoBg = csysProjectLogoBg;
    }

    /**
     * @return CSYS_PROJECT_TOP_BG
     */
    public String getCsysProjectTopBg() {
        return csysProjectTopBg;
    }

    /**
     * @param csysProjectTopBg
     */
    public void setCsysProjectTopBg(String csysProjectTopBg) {
        this.csysProjectTopBg = csysProjectTopBg;
    }

    /**
     * @return CSYS_PROJECT_NAVIGATION_BG
     */
    public String getCsysProjectNavigationBg() {
        return csysProjectNavigationBg;
    }

    /**
     * @param csysProjectNavigationBg
     */
    public void setCsysProjectNavigationBg(String csysProjectNavigationBg) {
        this.csysProjectNavigationBg = csysProjectNavigationBg;
    }

    /**
     * @return CSYS_PROJECT_SUSP_COLOR
     */
    public String getCsysProjectSuspColor() {
        return csysProjectSuspColor;
    }

    /**
     * @param csysProjectSuspColor
     */
    public void setCsysProjectSuspColor(String csysProjectSuspColor) {
        this.csysProjectSuspColor = csysProjectSuspColor;
    }

    /**
     * @return CSYS_PROJECT_MAIN_MENU_BG
     */
    public String getCsysProjectMainMenuBg() {
        return csysProjectMainMenuBg;
    }

    /**
     * @param csysProjectMainMenuBg
     */
    public void setCsysProjectMainMenuBg(String csysProjectMainMenuBg) {
        this.csysProjectMainMenuBg = csysProjectMainMenuBg;
    }

    /**
     * @return CSYS_PROJECT_SUB_MENU_BG
     */
    public String getCsysProjectSubMenuBg() {
        return csysProjectSubMenuBg;
    }

    /**
     * @param csysProjectSubMenuBg
     */
    public void setCsysProjectSubMenuBg(String csysProjectSubMenuBg) {
        this.csysProjectSubMenuBg = csysProjectSubMenuBg;
    }

    /**
     * @return CSYS_PROJECT_RECORD_INFO
     */
    public String getCsysProjectRecordInfo() {
        return csysProjectRecordInfo;
    }

    /**
     * @param csysProjectRecordInfo
     */
    public void setCsysProjectRecordInfo(String csysProjectRecordInfo) {
        this.csysProjectRecordInfo = csysProjectRecordInfo;
    }

    /**
     * @return CSYS_PROJECT_STYLE
     */
    public String getCsysProjectStyle() {
        return csysProjectStyle;
    }

    /**
     * @param csysProjectStyle
     */
    public void setCsysProjectStyle(String csysProjectStyle) {
        this.csysProjectStyle = csysProjectStyle;
    }

    /**
     * @return CSYS_PROJECT_CREATE_TIME
     */
    public Date getCsysProjectCreateTime() {
        return csysProjectCreateTime;
    }

    /**
     * @param csysProjectCreateTime
     */
    public void setCsysProjectCreateTime(Date csysProjectCreateTime) {
        this.csysProjectCreateTime = csysProjectCreateTime;
    }

    /**
     * @return CSYS_PROJECT_CREATE_USER
     */
    public String getCsysProjectCreateUser() {
        return csysProjectCreateUser;
    }

    /**
     * @param csysProjectCreateUser
     */
    public void setCsysProjectCreateUser(String csysProjectCreateUser) {
        this.csysProjectCreateUser = csysProjectCreateUser;
    }

    /**
     * @return CSYS_PROJECT_MODIFY_TIME
     */
    public Date getCsysProjectModifyTime() {
        return csysProjectModifyTime;
    }

    /**
     * @param csysProjectModifyTime
     */
    public void setCsysProjectModifyTime(Date csysProjectModifyTime) {
        this.csysProjectModifyTime = csysProjectModifyTime;
    }

    /**
     * @return CSYS_PROJECT_MODIFY_USER
     */
    public String getCsysProjectModifyUser() {
        return csysProjectModifyUser;
    }

    /**
     * @param csysProjectModifyUser
     */
    public void setCsysProjectModifyUser(String csysProjectModifyUser) {
        this.csysProjectModifyUser = csysProjectModifyUser;
    }

    /**
     * @return CSYS_PROJECT_IS_DELETE
     */
    public String getCsysProjectIsDelete() {
        return csysProjectIsDelete;
    }

    /**
     * @param csysProjectIsDelete
     */
    public void setCsysProjectIsDelete(String csysProjectIsDelete) {
        this.csysProjectIsDelete = csysProjectIsDelete;
    }

    /**
     * @return CSYS_PROJECT_TIME
     */
    public Date getCsysProjectTime() {
        return csysProjectTime;
    }

    /**
     * @param csysProjectTime
     */
    public void setCsysProjectTime(Date csysProjectTime) {
        this.csysProjectTime = csysProjectTime;
    }

    /**
     * @return CSYS_PROJECT_DATE
     */
    public Date getCsysProjectDate() {
        return csysProjectDate;
    }

    /**
     * @param csysProjectDate
     */
    public void setCsysProjectDate(Date csysProjectDate) {
        this.csysProjectDate = csysProjectDate;
    }
}