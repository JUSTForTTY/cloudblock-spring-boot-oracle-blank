package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_ORG_POT_AUTH")
public class CsysOrgPotAuth {
    @Id
    @Column(name = "CSYS_ORG_POT_AUTH_ID")
    private String csysOrgPotAuthId;

    @Column(name = "CSYS_ORG_STRUCE_ID")
    private String csysOrgStruceId;

    @Column(name = "CSYS_ORG_STRUCE_NAME")
    private String csysOrgStruceName;

    @Column(name = "CSYS_ORG_POT_ID")
    private String csysOrgPotId;

    @Column(name = "CSYS_ORG_POT_NAME")
    private String csysOrgPotName;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_ORG_POT_AUTH_TYPE")
    private String csysOrgPotAuthType;

    @Column(name = "CSYS_ORG_POT_AUTH_DESC")
    private String csysOrgPotAuthDesc;

    @Column(name = "CSYS_ORG_POT_AUTH_IS_DELETE")
    private String csysOrgPotAuthIsDelete;

    @Column(name = "CSYS_ORG_POT_AUTH_TIME")
    private Date csysOrgPotAuthTime;

    @Column(name = "CSYS_ORG_POT_AUTH_DATE")
    private Date csysOrgPotAuthDate;

    @Column(name = "CSYS_ORG_POT_AUTH_CREATE_USER")
    private String csysOrgPotAuthCreateUser;

    @Column(name = "CSYS_ORG_POT_AUTH_MODIFY_USER")
    private String csysOrgPotAuthModifyUser;

    @Column(name = "CSYS_ORG_POT_AUTH_CREATE_TIME")
    private Date csysOrgPotAuthCreateTime;

    @Column(name = "CSYS_ORG_POT_AUTH_MODIFY_TIME")
    private Date csysOrgPotAuthModifyTime;

    /**
     * @return CSYS_ORG_POT_AUTH_ID
     */
    public String getCsysOrgPotAuthId() {
        return csysOrgPotAuthId;
    }

    /**
     * @param csysOrgPotAuthId
     */
    public void setCsysOrgPotAuthId(String csysOrgPotAuthId) {
        this.csysOrgPotAuthId = csysOrgPotAuthId;
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
     * @return CSYS_ORG_STRUCE_NAME
     */
    public String getCsysOrgStruceName() {
        return csysOrgStruceName;
    }

    /**
     * @param csysOrgStruceName
     */
    public void setCsysOrgStruceName(String csysOrgStruceName) {
        this.csysOrgStruceName = csysOrgStruceName;
    }

    /**
     * @return CSYS_ORG_POT_ID
     */
    public String getCsysOrgPotId() {
        return csysOrgPotId;
    }

    /**
     * @param csysOrgPotId
     */
    public void setCsysOrgPotId(String csysOrgPotId) {
        this.csysOrgPotId = csysOrgPotId;
    }

    /**
     * @return CSYS_ORG_POT_NAME
     */
    public String getCsysOrgPotName() {
        return csysOrgPotName;
    }

    /**
     * @param csysOrgPotName
     */
    public void setCsysOrgPotName(String csysOrgPotName) {
        this.csysOrgPotName = csysOrgPotName;
    }

    /**
     * @return CSYS_USER_ID
     */
    public String getCsysUserId() {
        return csysUserId;
    }

    /**
     * @param csysUserId
     */
    public void setCsysUserId(String csysUserId) {
        this.csysUserId = csysUserId;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_TYPE
     */
    public String getCsysOrgPotAuthType() {
        return csysOrgPotAuthType;
    }

    /**
     * @param csysOrgPotAuthType
     */
    public void setCsysOrgPotAuthType(String csysOrgPotAuthType) {
        this.csysOrgPotAuthType = csysOrgPotAuthType;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_DESC
     */
    public String getCsysOrgPotAuthDesc() {
        return csysOrgPotAuthDesc;
    }

    /**
     * @param csysOrgPotAuthDesc
     */
    public void setCsysOrgPotAuthDesc(String csysOrgPotAuthDesc) {
        this.csysOrgPotAuthDesc = csysOrgPotAuthDesc;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_IS_DELETE
     */
    public String getCsysOrgPotAuthIsDelete() {
        return csysOrgPotAuthIsDelete;
    }

    /**
     * @param csysOrgPotAuthIsDelete
     */
    public void setCsysOrgPotAuthIsDelete(String csysOrgPotAuthIsDelete) {
        this.csysOrgPotAuthIsDelete = csysOrgPotAuthIsDelete;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_TIME
     */
    public Date getCsysOrgPotAuthTime() {
        return csysOrgPotAuthTime;
    }

    /**
     * @param csysOrgPotAuthTime
     */
    public void setCsysOrgPotAuthTime(Date csysOrgPotAuthTime) {
        this.csysOrgPotAuthTime = csysOrgPotAuthTime;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_DATE
     */
    public Date getCsysOrgPotAuthDate() {
        return csysOrgPotAuthDate;
    }

    /**
     * @param csysOrgPotAuthDate
     */
    public void setCsysOrgPotAuthDate(Date csysOrgPotAuthDate) {
        this.csysOrgPotAuthDate = csysOrgPotAuthDate;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_CREATE_USER
     */
    public String getCsysOrgPotAuthCreateUser() {
        return csysOrgPotAuthCreateUser;
    }

    /**
     * @param csysOrgPotAuthCreateUser
     */
    public void setCsysOrgPotAuthCreateUser(String csysOrgPotAuthCreateUser) {
        this.csysOrgPotAuthCreateUser = csysOrgPotAuthCreateUser;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_MODIFY_USER
     */
    public String getCsysOrgPotAuthModifyUser() {
        return csysOrgPotAuthModifyUser;
    }

    /**
     * @param csysOrgPotAuthModifyUser
     */
    public void setCsysOrgPotAuthModifyUser(String csysOrgPotAuthModifyUser) {
        this.csysOrgPotAuthModifyUser = csysOrgPotAuthModifyUser;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_CREATE_TIME
     */
    public Date getCsysOrgPotAuthCreateTime() {
        return csysOrgPotAuthCreateTime;
    }

    /**
     * @param csysOrgPotAuthCreateTime
     */
    public void setCsysOrgPotAuthCreateTime(Date csysOrgPotAuthCreateTime) {
        this.csysOrgPotAuthCreateTime = csysOrgPotAuthCreateTime;
    }

    /**
     * @return CSYS_ORG_POT_AUTH_MODIFY_TIME
     */
    public Date getCsysOrgPotAuthModifyTime() {
        return csysOrgPotAuthModifyTime;
    }

    /**
     * @param csysOrgPotAuthModifyTime
     */
    public void setCsysOrgPotAuthModifyTime(Date csysOrgPotAuthModifyTime) {
        this.csysOrgPotAuthModifyTime = csysOrgPotAuthModifyTime;
    }
}