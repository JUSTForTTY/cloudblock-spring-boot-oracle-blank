package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PB_ASSOC")
public class CsysPbAssoc {
    @Id
    @Column(name = "CSYS_PB_ASSOC_ID")
    private String csysPbAssocId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PB_ASSOC_RUN_ID1")
    private String csysPbAssocRunId1;

    @Column(name = "CSYS_PB_ASSOC_RUN_ID2")
    private String csysPbAssocRunId2;

    @Column(name = "CSYS_PB_ASSOC_TYPE")
    private String csysPbAssocType;

    @Column(name = "CSYS_PB_ASSOC_KEY1")
    private String csysPbAssocKey1;

    @Column(name = "CSYS_PB_ASSOC_KEY2")
    private String csysPbAssocKey2;

    @Column(name = "CSYS_PB_ASSOC_MODE")
    private String csysPbAssocMode;

    @Column(name = "CSYS_PB_ASSOC_LINK_TYPE")
    private String csysPbAssocLinkType;

    @Column(name = "CSYS_PB_ASSOC_CREATE_TIME")
    private Date csysPbAssocCreateTime;

    @Column(name = "CSYS_PB_ASSOC_MODIFY_TIME")
    private Date csysPbAssocModifyTime;

    @Column(name = "CSYS_PB_ASSOC_CREATE_USER")
    private String csysPbAssocCreateUser;

    @Column(name = "CSYS_PB_ASSOC_MODIFY_USER")
    private String csysPbAssocModifyUser;

    @Column(name = "CSYS_PB_ASSOC_IS_DELETE")
    private String csysPbAssocIsDelete;

    @Column(name = "CSYS_PB_ASSOC_TIME")
    private Date csysPbAssocTime;

    @Column(name = "CSYS_PB_ASSOC_DATE")
    private Date csysPbAssocDate;

    /**
     * @return CSYS_PB_ASSOC_ID
     */
    public String getCsysPbAssocId() {
        return csysPbAssocId;
    }

    /**
     * @param csysPbAssocId
     */
    public void setCsysPbAssocId(String csysPbAssocId) {
        this.csysPbAssocId = csysPbAssocId;
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
     * @return CSYS_PB_ASSOC_RUN_ID1
     */
    public String getCsysPbAssocRunId1() {
        return csysPbAssocRunId1;
    }

    /**
     * @param csysPbAssocRunId1
     */
    public void setCsysPbAssocRunId1(String csysPbAssocRunId1) {
        this.csysPbAssocRunId1 = csysPbAssocRunId1;
    }

    /**
     * @return CSYS_PB_ASSOC_RUN_ID2
     */
    public String getCsysPbAssocRunId2() {
        return csysPbAssocRunId2;
    }

    /**
     * @param csysPbAssocRunId2
     */
    public void setCsysPbAssocRunId2(String csysPbAssocRunId2) {
        this.csysPbAssocRunId2 = csysPbAssocRunId2;
    }

    /**
     * @return CSYS_PB_ASSOC_TYPE
     */
    public String getCsysPbAssocType() {
        return csysPbAssocType;
    }

    /**
     * @param csysPbAssocType
     */
    public void setCsysPbAssocType(String csysPbAssocType) {
        this.csysPbAssocType = csysPbAssocType;
    }

    /**
     * @return CSYS_PB_ASSOC_KEY1
     */
    public String getCsysPbAssocKey1() {
        return csysPbAssocKey1;
    }

    /**
     * @param csysPbAssocKey1
     */
    public void setCsysPbAssocKey1(String csysPbAssocKey1) {
        this.csysPbAssocKey1 = csysPbAssocKey1;
    }

    /**
     * @return CSYS_PB_ASSOC_KEY2
     */
    public String getCsysPbAssocKey2() {
        return csysPbAssocKey2;
    }

    /**
     * @param csysPbAssocKey2
     */
    public void setCsysPbAssocKey2(String csysPbAssocKey2) {
        this.csysPbAssocKey2 = csysPbAssocKey2;
    }

    /**
     * @return CSYS_PB_ASSOC_MODE
     */
    public String getCsysPbAssocMode() {
        return csysPbAssocMode;
    }

    /**
     * @param csysPbAssocMode
     */
    public void setCsysPbAssocMode(String csysPbAssocMode) {
        this.csysPbAssocMode = csysPbAssocMode;
    }

    /**
     * @return CSYS_PB_ASSOC_LINK_TYPE
     */
    public String getCsysPbAssocLinkType() {
        return csysPbAssocLinkType;
    }

    /**
     * @param csysPbAssocLinkType
     */
    public void setCsysPbAssocLinkType(String csysPbAssocLinkType) {
        this.csysPbAssocLinkType = csysPbAssocLinkType;
    }

    /**
     * @return CSYS_PB_ASSOC_CREATE_TIME
     */
    public Date getCsysPbAssocCreateTime() {
        return csysPbAssocCreateTime;
    }

    /**
     * @param csysPbAssocCreateTime
     */
    public void setCsysPbAssocCreateTime(Date csysPbAssocCreateTime) {
        this.csysPbAssocCreateTime = csysPbAssocCreateTime;
    }

    /**
     * @return CSYS_PB_ASSOC_MODIFY_TIME
     */
    public Date getCsysPbAssocModifyTime() {
        return csysPbAssocModifyTime;
    }

    /**
     * @param csysPbAssocModifyTime
     */
    public void setCsysPbAssocModifyTime(Date csysPbAssocModifyTime) {
        this.csysPbAssocModifyTime = csysPbAssocModifyTime;
    }

    /**
     * @return CSYS_PB_ASSOC_CREATE_USER
     */
    public String getCsysPbAssocCreateUser() {
        return csysPbAssocCreateUser;
    }

    /**
     * @param csysPbAssocCreateUser
     */
    public void setCsysPbAssocCreateUser(String csysPbAssocCreateUser) {
        this.csysPbAssocCreateUser = csysPbAssocCreateUser;
    }

    /**
     * @return CSYS_PB_ASSOC_MODIFY_USER
     */
    public String getCsysPbAssocModifyUser() {
        return csysPbAssocModifyUser;
    }

    /**
     * @param csysPbAssocModifyUser
     */
    public void setCsysPbAssocModifyUser(String csysPbAssocModifyUser) {
        this.csysPbAssocModifyUser = csysPbAssocModifyUser;
    }

    /**
     * @return CSYS_PB_ASSOC_IS_DELETE
     */
    public String getCsysPbAssocIsDelete() {
        return csysPbAssocIsDelete;
    }

    /**
     * @param csysPbAssocIsDelete
     */
    public void setCsysPbAssocIsDelete(String csysPbAssocIsDelete) {
        this.csysPbAssocIsDelete = csysPbAssocIsDelete;
    }

    /**
     * @return CSYS_PB_ASSOC_TIME
     */
    public Date getCsysPbAssocTime() {
        return csysPbAssocTime;
    }

    /**
     * @param csysPbAssocTime
     */
    public void setCsysPbAssocTime(Date csysPbAssocTime) {
        this.csysPbAssocTime = csysPbAssocTime;
    }

    /**
     * @return CSYS_PB_ASSOC_DATE
     */
    public Date getCsysPbAssocDate() {
        return csysPbAssocDate;
    }

    /**
     * @param csysPbAssocDate
     */
    public void setCsysPbAssocDate(Date csysPbAssocDate) {
        this.csysPbAssocDate = csysPbAssocDate;
    }
}