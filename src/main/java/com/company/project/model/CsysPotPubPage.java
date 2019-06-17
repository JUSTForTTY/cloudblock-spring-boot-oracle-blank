package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_PUB_PAGE")
public class CsysPotPubPage {
    @Id
    @Column(name = "CSYS_POT_PUB_PAGE_ID")
    private String csysPotPubPageId;

    @Column(name = "CSYS_POT_PUBLIC_ID")
    private String csysPotPublicId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_POT_PUB_PAGE_DESC")
    private String csysPotPubPageDesc;

    @Column(name = "CSYS_POT_PUB_PAGE_CREATE_TIME")
    private Date csysPotPubPageCreateTime;

    @Column(name = "CSYS_POT_PUB_PAGE_CREATE_USER")
    private String csysPotPubPageCreateUser;

    @Column(name = "CSYS_POT_PUB_PAGE_MODIFY_TIME")
    private Date csysPotPubPageModifyTime;

    @Column(name = "CSYS_POT_PUB_PAGE_MODIFY_USER")
    private String csysPotPubPageModifyUser;

    @Column(name = "CSYS_POT_PUB_PAGE_IS_DELETE")
    private String csysPotPubPageIsDelete;

    @Column(name = "CSYS_POT_PUB_PAGE_TIME")
    private Date csysPotPubPageTime;

    @Column(name = "CSYS_POT_PUB_PAGE_DATE")
    private Date csysPotPubPageDate;

    /**
     * @return CSYS_POT_PUB_PAGE_ID
     */
    public String getCsysPotPubPageId() {
        return csysPotPubPageId;
    }

    /**
     * @param csysPotPubPageId
     */
    public void setCsysPotPubPageId(String csysPotPubPageId) {
        this.csysPotPubPageId = csysPotPubPageId;
    }

    /**
     * @return CSYS_POT_PUBLIC_ID
     */
    public String getCsysPotPublicId() {
        return csysPotPublicId;
    }

    /**
     * @param csysPotPublicId
     */
    public void setCsysPotPublicId(String csysPotPublicId) {
        this.csysPotPublicId = csysPotPublicId;
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
     * @return CSYS_POT_PUB_PAGE_DESC
     */
    public String getCsysPotPubPageDesc() {
        return csysPotPubPageDesc;
    }

    /**
     * @param csysPotPubPageDesc
     */
    public void setCsysPotPubPageDesc(String csysPotPubPageDesc) {
        this.csysPotPubPageDesc = csysPotPubPageDesc;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_CREATE_TIME
     */
    public Date getCsysPotPubPageCreateTime() {
        return csysPotPubPageCreateTime;
    }

    /**
     * @param csysPotPubPageCreateTime
     */
    public void setCsysPotPubPageCreateTime(Date csysPotPubPageCreateTime) {
        this.csysPotPubPageCreateTime = csysPotPubPageCreateTime;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_CREATE_USER
     */
    public String getCsysPotPubPageCreateUser() {
        return csysPotPubPageCreateUser;
    }

    /**
     * @param csysPotPubPageCreateUser
     */
    public void setCsysPotPubPageCreateUser(String csysPotPubPageCreateUser) {
        this.csysPotPubPageCreateUser = csysPotPubPageCreateUser;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_MODIFY_TIME
     */
    public Date getCsysPotPubPageModifyTime() {
        return csysPotPubPageModifyTime;
    }

    /**
     * @param csysPotPubPageModifyTime
     */
    public void setCsysPotPubPageModifyTime(Date csysPotPubPageModifyTime) {
        this.csysPotPubPageModifyTime = csysPotPubPageModifyTime;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_MODIFY_USER
     */
    public String getCsysPotPubPageModifyUser() {
        return csysPotPubPageModifyUser;
    }

    /**
     * @param csysPotPubPageModifyUser
     */
    public void setCsysPotPubPageModifyUser(String csysPotPubPageModifyUser) {
        this.csysPotPubPageModifyUser = csysPotPubPageModifyUser;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_IS_DELETE
     */
    public String getCsysPotPubPageIsDelete() {
        return csysPotPubPageIsDelete;
    }

    /**
     * @param csysPotPubPageIsDelete
     */
    public void setCsysPotPubPageIsDelete(String csysPotPubPageIsDelete) {
        this.csysPotPubPageIsDelete = csysPotPubPageIsDelete;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_TIME
     */
    public Date getCsysPotPubPageTime() {
        return csysPotPubPageTime;
    }

    /**
     * @param csysPotPubPageTime
     */
    public void setCsysPotPubPageTime(Date csysPotPubPageTime) {
        this.csysPotPubPageTime = csysPotPubPageTime;
    }

    /**
     * @return CSYS_POT_PUB_PAGE_DATE
     */
    public Date getCsysPotPubPageDate() {
        return csysPotPubPageDate;
    }

    /**
     * @param csysPotPubPageDate
     */
    public void setCsysPotPubPageDate(Date csysPotPubPageDate) {
        this.csysPotPubPageDate = csysPotPubPageDate;
    }
}