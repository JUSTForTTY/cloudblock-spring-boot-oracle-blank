package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_CODEMASTER")
public class CsysCodemaster {
    @Id
    @Column(name = "CSYS_CODEMASTER_ID")
    private String csysCodemasterId;

    @Column(name = "CSYS_CODEMASTER_CODE")
    private String csysCodemasterCode;

    @Column(name = "CSYS_CODEMASTER_TYPE")
    private String csysCodemasterType;

    @Column(name = "CSYS_CODEMASTER_DESC")
    private String csysCodemasterDesc;

    @Column(name = "CSYS_CODEMASTER_CREATE_TIME")
    private Date csysCodemasterCreateTime;

    @Column(name = "CSYS_CODEMASTER_MODIFY_TIME")
    private Date csysCodemasterModifyTime;

    @Column(name = "CSYS_CODEMASTER_CREATE_USER")
    private String csysCodemasterCreateUser;

    @Column(name = "CSYS_CODEMASTER_MODIFY_USER")
    private String csysCodemasterModifyUser;

    @Column(name = "CSYS_CODEMASTER_IS_DELETE")
    private String csysCodemasterIsDelete;

    @Column(name = "CSYS_CODEMASTER_TIME")
    private Date csysCodemasterTime;

    @Column(name = "CSYS_CODEMASTER_DATE")
    private Date csysCodemasterDate;

    @Column(name = "CSYS_CODEMASTER_TYPE_DESC")
    private String csysCodemasterTypeDesc;

    /**
     * @return CSYS_CODEMASTER_ID
     */
    public String getCsysCodemasterId() {
        return csysCodemasterId;
    }

    /**
     * @param csysCodemasterId
     */
    public void setCsysCodemasterId(String csysCodemasterId) {
        this.csysCodemasterId = csysCodemasterId;
    }

    /**
     * @return CSYS_CODEMASTER_CODE
     */
    public String getCsysCodemasterCode() {
        return csysCodemasterCode;
    }

    /**
     * @param csysCodemasterCode
     */
    public void setCsysCodemasterCode(String csysCodemasterCode) {
        this.csysCodemasterCode = csysCodemasterCode;
    }

    /**
     * @return CSYS_CODEMASTER_TYPE
     */
    public String getCsysCodemasterType() {
        return csysCodemasterType;
    }

    /**
     * @param csysCodemasterType
     */
    public void setCsysCodemasterType(String csysCodemasterType) {
        this.csysCodemasterType = csysCodemasterType;
    }

    /**
     * @return CSYS_CODEMASTER_DESC
     */
    public String getCsysCodemasterDesc() {
        return csysCodemasterDesc;
    }

    /**
     * @param csysCodemasterDesc
     */
    public void setCsysCodemasterDesc(String csysCodemasterDesc) {
        this.csysCodemasterDesc = csysCodemasterDesc;
    }

    /**
     * @return CSYS_CODEMASTER_CREATE_TIME
     */
    public Date getCsysCodemasterCreateTime() {
        return csysCodemasterCreateTime;
    }

    /**
     * @param csysCodemasterCreateTime
     */
    public void setCsysCodemasterCreateTime(Date csysCodemasterCreateTime) {
        this.csysCodemasterCreateTime = csysCodemasterCreateTime;
    }

    /**
     * @return CSYS_CODEMASTER_MODIFY_TIME
     */
    public Date getCsysCodemasterModifyTime() {
        return csysCodemasterModifyTime;
    }

    /**
     * @param csysCodemasterModifyTime
     */
    public void setCsysCodemasterModifyTime(Date csysCodemasterModifyTime) {
        this.csysCodemasterModifyTime = csysCodemasterModifyTime;
    }

    /**
     * @return CSYS_CODEMASTER_CREATE_USER
     */
    public String getCsysCodemasterCreateUser() {
        return csysCodemasterCreateUser;
    }

    /**
     * @param csysCodemasterCreateUser
     */
    public void setCsysCodemasterCreateUser(String csysCodemasterCreateUser) {
        this.csysCodemasterCreateUser = csysCodemasterCreateUser;
    }

    /**
     * @return CSYS_CODEMASTER_MODIFY_USER
     */
    public String getCsysCodemasterModifyUser() {
        return csysCodemasterModifyUser;
    }

    /**
     * @param csysCodemasterModifyUser
     */
    public void setCsysCodemasterModifyUser(String csysCodemasterModifyUser) {
        this.csysCodemasterModifyUser = csysCodemasterModifyUser;
    }

    /**
     * @return CSYS_CODEMASTER_IS_DELETE
     */
    public String getCsysCodemasterIsDelete() {
        return csysCodemasterIsDelete;
    }

    /**
     * @param csysCodemasterIsDelete
     */
    public void setCsysCodemasterIsDelete(String csysCodemasterIsDelete) {
        this.csysCodemasterIsDelete = csysCodemasterIsDelete;
    }

    /**
     * @return CSYS_CODEMASTER_TIME
     */
    public Date getCsysCodemasterTime() {
        return csysCodemasterTime;
    }

    /**
     * @param csysCodemasterTime
     */
    public void setCsysCodemasterTime(Date csysCodemasterTime) {
        this.csysCodemasterTime = csysCodemasterTime;
    }

    /**
     * @return CSYS_CODEMASTER_DATE
     */
    public Date getCsysCodemasterDate() {
        return csysCodemasterDate;
    }

    /**
     * @param csysCodemasterDate
     */
    public void setCsysCodemasterDate(Date csysCodemasterDate) {
        this.csysCodemasterDate = csysCodemasterDate;
    }

    /**
     * @return CSYS_CODEMASTER_TYPE_DESC
     */
    public String getCsysCodemasterTypeDesc() {
        return csysCodemasterTypeDesc;
    }

    /**
     * @param csysCodemasterTypeDesc
     */
    public void setCsysCodemasterTypeDesc(String csysCodemasterTypeDesc) {
        this.csysCodemasterTypeDesc = csysCodemasterTypeDesc;
    }
}