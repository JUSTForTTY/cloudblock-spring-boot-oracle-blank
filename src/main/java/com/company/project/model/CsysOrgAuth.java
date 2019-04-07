package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_ORG_AUTH")
public class CsysOrgAuth {
    @Id
    @Column(name = "CSYS_ORG_AUTH_ID")
    private String csysOrgAuthId;

    @Column(name = "CSYS_ORG_STRUCE_ID")
    private String csysOrgStruceId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PAGE_NAME")
    private String csysPageName;

    @Column(name = "CSYS_ORG_AUTH_CREATE_TIME")
    private Date csysOrgAuthCreateTime;

    @Column(name = "CSYS_ORG_AUTH_CREATE_USER")
    private String csysOrgAuthCreateUser;

    @Column(name = "CSYS_ORG_AUTH_MODIFY_TIME")
    private Date csysOrgAuthModifyTime;

    @Column(name = "CSYS_ORG_AUTH_IS_DELETE")
    private String csysOrgAuthIsDelete;

    @Column(name = "CSYS_ORG_AUTH_TIME")
    private Date csysOrgAuthTime;

    @Column(name = "CSYS_ORG_AUTH_DATE")
    private Date csysOrgAuthDate;

    @Column(name = "CSYS_ORG_AUTH_MODIFY_USER")
    private String csysOrgAuthModifyUser;

    /**
     * @return CSYS_ORG_AUTH_ID
     */
    public String getCsysOrgAuthId() {
        return csysOrgAuthId;
    }

    /**
     * @param csysOrgAuthId
     */
    public void setCsysOrgAuthId(String csysOrgAuthId) {
        this.csysOrgAuthId = csysOrgAuthId;
    }

    /**
     * @return CSYS_ORG_STRUCE_ID
     */
    public String getCsysOrgStruceId() {
        return csysOrgStruceId;
    }

    /**
     * @param csysOrgStruceId
     */
    public void setCsysOrgStruceId(String csysOrgStruceId) {
        this.csysOrgStruceId = csysOrgStruceId;
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
     * @return CSYS_ORG_AUTH_CREATE_TIME
     */
    public Date getCsysOrgAuthCreateTime() {
        return csysOrgAuthCreateTime;
    }

    /**
     * @param csysOrgAuthCreateTime
     */
    public void setCsysOrgAuthCreateTime(Date csysOrgAuthCreateTime) {
        this.csysOrgAuthCreateTime = csysOrgAuthCreateTime;
    }

    /**
     * @return CSYS_ORG_AUTH_CREATE_USER
     */
    public String getCsysOrgAuthCreateUser() {
        return csysOrgAuthCreateUser;
    }

    /**
     * @param csysOrgAuthCreateUser
     */
    public void setCsysOrgAuthCreateUser(String csysOrgAuthCreateUser) {
        this.csysOrgAuthCreateUser = csysOrgAuthCreateUser;
    }

    /**
     * @return CSYS_ORG_AUTH_MODIFY_TIME
     */
    public Date getCsysOrgAuthModifyTime() {
        return csysOrgAuthModifyTime;
    }

    /**
     * @param csysOrgAuthModifyTime
     */
    public void setCsysOrgAuthModifyTime(Date csysOrgAuthModifyTime) {
        this.csysOrgAuthModifyTime = csysOrgAuthModifyTime;
    }

    /**
     * @return CSYS_ORG_AUTH_IS_DELETE
     */
    public String getCsysOrgAuthIsDelete() {
        return csysOrgAuthIsDelete;
    }

    /**
     * @param csysOrgAuthIsDelete
     */
    public void setCsysOrgAuthIsDelete(String csysOrgAuthIsDelete) {
        this.csysOrgAuthIsDelete = csysOrgAuthIsDelete;
    }

    /**
     * @return CSYS_ORG_AUTH_TIME
     */
    public Date getCsysOrgAuthTime() {
        return csysOrgAuthTime;
    }

    /**
     * @param csysOrgAuthTime
     */
    public void setCsysOrgAuthTime(Date csysOrgAuthTime) {
        this.csysOrgAuthTime = csysOrgAuthTime;
    }

    /**
     * @return CSYS_ORG_AUTH_DATE
     */
    public Date getCsysOrgAuthDate() {
        return csysOrgAuthDate;
    }

    /**
     * @param csysOrgAuthDate
     */
    public void setCsysOrgAuthDate(Date csysOrgAuthDate) {
        this.csysOrgAuthDate = csysOrgAuthDate;
    }

    /**
     * @return CSYS_ORG_AUTH_MODIFY_USER
     */
    public String getCsysOrgAuthModifyUser() {
        return csysOrgAuthModifyUser;
    }

    /**
     * @param csysOrgAuthModifyUser
     */
    public void setCsysOrgAuthModifyUser(String csysOrgAuthModifyUser) {
        this.csysOrgAuthModifyUser = csysOrgAuthModifyUser;
    }
}