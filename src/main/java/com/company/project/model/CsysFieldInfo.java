package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_FIELD_INFO")
public class CsysFieldInfo {
    @Id
    @Column(name = "CSYS_FIELD_INFO_ID")
    private String csysFieldInfoId;

    @Column(name = "CSYS_FIELD_INFO_NAME")
    private String csysFieldInfoName;

    @Column(name = "CSYS_FIELD_INFO_RELNAME")
    private String csysFieldInfoRelname;

    @Column(name = "CSYS_FIELD_INFO_ALIASNAME")
    private String csysFieldInfoAliasname;

    @Column(name = "CSYS_FIELD_INFO_REGION")
    private String csysFieldInfoRegion;

    @Column(name = "CSYS_FIELD_INFO_ATTRIBUTE")
    private String csysFieldInfoAttribute;

    @Column(name = "CSYS_FIELD_INFO_TYPE")
    private String csysFieldInfoType;

    @Column(name = "CSYS_FIELD_INFO_IS_NULL")
    private String csysFieldInfoIsNull;

    @Column(name = "CSYS_FIELD_INFO_DEFAULT")
    private String csysFieldInfoDefault;

    @Column(name = "CSYS_FIELD_INFO_REMARK")
    private String csysFieldInfoRemark;

    @Column(name = "CSYS_FIELD_INFO_IS_ENCRYPT")
    private String csysFieldInfoIsEncrypt;

    @Column(name = "CSYS_FIELD_INFO_ENCRYPT_TYPE")
    private String csysFieldInfoEncryptType;

    @Column(name = "CSYS_FIELD_INFO_LENGTH")
    private String csysFieldInfoLength;

    @Column(name = "CSYS_FIELD_INFO_EXISTS_KEY")
    private String csysFieldInfoExistsKey;

    @Column(name = "CSYS_FIELD_INFO_EXISTS_OUTKEYS")
    private String csysFieldInfoExistsOutkeys;

    @Column(name = "CSYS_FIELD_INFO_FOREIGN_REGION")
    private String csysFieldInfoForeignRegion;

    @Column(name = "CSYS_FIELD_INFO_CREATE_TIME")
    private Date csysFieldInfoCreateTime;

    @Column(name = "CSYS_FIELD_INFO_CREATE_USER")
    private String csysFieldInfoCreateUser;

    @Column(name = "CSYS_FIELD_INFO_MODIFY_TIME")
    private Date csysFieldInfoModifyTime;

    @Column(name = "CSYS_FIELD_INFO_MODIFY_USER")
    private String csysFieldInfoModifyUser;

    @Column(name = "CSYS_FIELD_INFO_IS_DELETE")
    private String csysFieldInfoIsDelete;

    @Column(name = "CSYS_FIELD_INFO_TIME")
    private Date csysFieldInfoTime;

    @Column(name = "CSYS_FIELD_INFO_DATE")
    private Date csysFieldInfoDate;

    /**
     * @return CSYS_FIELD_INFO_ID
     */
    public String getCsysFieldInfoId() {
        return csysFieldInfoId;
    }

    /**
     * @param csysFieldInfoId
     */
    public void setCsysFieldInfoId(String csysFieldInfoId) {
        this.csysFieldInfoId = csysFieldInfoId;
    }

    /**
     * @return CSYS_FIELD_INFO_NAME
     */
    public String getCsysFieldInfoName() {
        return csysFieldInfoName;
    }

    /**
     * @param csysFieldInfoName
     */
    public void setCsysFieldInfoName(String csysFieldInfoName) {
        this.csysFieldInfoName = csysFieldInfoName;
    }

    /**
     * @return CSYS_FIELD_INFO_RELNAME
     */
    public String getCsysFieldInfoRelname() {
        return csysFieldInfoRelname;
    }

    /**
     * @param csysFieldInfoRelname
     */
    public void setCsysFieldInfoRelname(String csysFieldInfoRelname) {
        this.csysFieldInfoRelname = csysFieldInfoRelname;
    }

    /**
     * @return CSYS_FIELD_INFO_ALIASNAME
     */
    public String getCsysFieldInfoAliasname() {
        return csysFieldInfoAliasname;
    }

    /**
     * @param csysFieldInfoAliasname
     */
    public void setCsysFieldInfoAliasname(String csysFieldInfoAliasname) {
        this.csysFieldInfoAliasname = csysFieldInfoAliasname;
    }

    /**
     * @return CSYS_FIELD_INFO_REGION
     */
    public String getCsysFieldInfoRegion() {
        return csysFieldInfoRegion;
    }

    /**
     * @param csysFieldInfoRegion
     */
    public void setCsysFieldInfoRegion(String csysFieldInfoRegion) {
        this.csysFieldInfoRegion = csysFieldInfoRegion;
    }

    /**
     * @return CSYS_FIELD_INFO_ATTRIBUTE
     */
    public String getCsysFieldInfoAttribute() {
        return csysFieldInfoAttribute;
    }

    /**
     * @param csysFieldInfoAttribute
     */
    public void setCsysFieldInfoAttribute(String csysFieldInfoAttribute) {
        this.csysFieldInfoAttribute = csysFieldInfoAttribute;
    }

    /**
     * @return CSYS_FIELD_INFO_TYPE
     */
    public String getCsysFieldInfoType() {
        return csysFieldInfoType;
    }

    /**
     * @param csysFieldInfoType
     */
    public void setCsysFieldInfoType(String csysFieldInfoType) {
        this.csysFieldInfoType = csysFieldInfoType;
    }

    /**
     * @return CSYS_FIELD_INFO_IS_NULL
     */
    public String getCsysFieldInfoIsNull() {
        return csysFieldInfoIsNull;
    }

    /**
     * @param csysFieldInfoIsNull
     */
    public void setCsysFieldInfoIsNull(String csysFieldInfoIsNull) {
        this.csysFieldInfoIsNull = csysFieldInfoIsNull;
    }

    /**
     * @return CSYS_FIELD_INFO_DEFAULT
     */
    public String getCsysFieldInfoDefault() {
        return csysFieldInfoDefault;
    }

    /**
     * @param csysFieldInfoDefault
     */
    public void setCsysFieldInfoDefault(String csysFieldInfoDefault) {
        this.csysFieldInfoDefault = csysFieldInfoDefault;
    }

    /**
     * @return CSYS_FIELD_INFO_REMARK
     */
    public String getCsysFieldInfoRemark() {
        return csysFieldInfoRemark;
    }

    /**
     * @param csysFieldInfoRemark
     */
    public void setCsysFieldInfoRemark(String csysFieldInfoRemark) {
        this.csysFieldInfoRemark = csysFieldInfoRemark;
    }

    /**
     * @return CSYS_FIELD_INFO_IS_ENCRYPT
     */
    public String getCsysFieldInfoIsEncrypt() {
        return csysFieldInfoIsEncrypt;
    }

    /**
     * @param csysFieldInfoIsEncrypt
     */
    public void setCsysFieldInfoIsEncrypt(String csysFieldInfoIsEncrypt) {
        this.csysFieldInfoIsEncrypt = csysFieldInfoIsEncrypt;
    }

    /**
     * @return CSYS_FIELD_INFO_ENCRYPT_TYPE
     */
    public String getCsysFieldInfoEncryptType() {
        return csysFieldInfoEncryptType;
    }

    /**
     * @param csysFieldInfoEncryptType
     */
    public void setCsysFieldInfoEncryptType(String csysFieldInfoEncryptType) {
        this.csysFieldInfoEncryptType = csysFieldInfoEncryptType;
    }

    /**
     * @return CSYS_FIELD_INFO_LENGTH
     */
    public String getCsysFieldInfoLength() {
        return csysFieldInfoLength;
    }

    /**
     * @param csysFieldInfoLength
     */
    public void setCsysFieldInfoLength(String csysFieldInfoLength) {
        this.csysFieldInfoLength = csysFieldInfoLength;
    }

    /**
     * @return CSYS_FIELD_INFO_EXISTS_KEY
     */
    public String getCsysFieldInfoExistsKey() {
        return csysFieldInfoExistsKey;
    }

    /**
     * @param csysFieldInfoExistsKey
     */
    public void setCsysFieldInfoExistsKey(String csysFieldInfoExistsKey) {
        this.csysFieldInfoExistsKey = csysFieldInfoExistsKey;
    }

    /**
     * @return CSYS_FIELD_INFO_EXISTS_OUTKEYS
     */
    public String getCsysFieldInfoExistsOutkeys() {
        return csysFieldInfoExistsOutkeys;
    }

    /**
     * @param csysFieldInfoExistsOutkeys
     */
    public void setCsysFieldInfoExistsOutkeys(String csysFieldInfoExistsOutkeys) {
        this.csysFieldInfoExistsOutkeys = csysFieldInfoExistsOutkeys;
    }

    /**
     * @return CSYS_FIELD_INFO_FOREIGN_REGION
     */
    public String getCsysFieldInfoForeignRegion() {
        return csysFieldInfoForeignRegion;
    }

    /**
     * @param csysFieldInfoForeignRegion
     */
    public void setCsysFieldInfoForeignRegion(String csysFieldInfoForeignRegion) {
        this.csysFieldInfoForeignRegion = csysFieldInfoForeignRegion;
    }

    /**
     * @return CSYS_FIELD_INFO_CREATE_TIME
     */
    public Date getCsysFieldInfoCreateTime() {
        return csysFieldInfoCreateTime;
    }

    /**
     * @param csysFieldInfoCreateTime
     */
    public void setCsysFieldInfoCreateTime(Date csysFieldInfoCreateTime) {
        this.csysFieldInfoCreateTime = csysFieldInfoCreateTime;
    }

    /**
     * @return CSYS_FIELD_INFO_CREATE_USER
     */
    public String getCsysFieldInfoCreateUser() {
        return csysFieldInfoCreateUser;
    }

    /**
     * @param csysFieldInfoCreateUser
     */
    public void setCsysFieldInfoCreateUser(String csysFieldInfoCreateUser) {
        this.csysFieldInfoCreateUser = csysFieldInfoCreateUser;
    }

    /**
     * @return CSYS_FIELD_INFO_MODIFY_TIME
     */
    public Date getCsysFieldInfoModifyTime() {
        return csysFieldInfoModifyTime;
    }

    /**
     * @param csysFieldInfoModifyTime
     */
    public void setCsysFieldInfoModifyTime(Date csysFieldInfoModifyTime) {
        this.csysFieldInfoModifyTime = csysFieldInfoModifyTime;
    }

    /**
     * @return CSYS_FIELD_INFO_MODIFY_USER
     */
    public String getCsysFieldInfoModifyUser() {
        return csysFieldInfoModifyUser;
    }

    /**
     * @param csysFieldInfoModifyUser
     */
    public void setCsysFieldInfoModifyUser(String csysFieldInfoModifyUser) {
        this.csysFieldInfoModifyUser = csysFieldInfoModifyUser;
    }

    /**
     * @return CSYS_FIELD_INFO_IS_DELETE
     */
    public String getCsysFieldInfoIsDelete() {
        return csysFieldInfoIsDelete;
    }

    /**
     * @param csysFieldInfoIsDelete
     */
    public void setCsysFieldInfoIsDelete(String csysFieldInfoIsDelete) {
        this.csysFieldInfoIsDelete = csysFieldInfoIsDelete;
    }

    /**
     * @return CSYS_FIELD_INFO_TIME
     */
    public Date getCsysFieldInfoTime() {
        return csysFieldInfoTime;
    }

    /**
     * @param csysFieldInfoTime
     */
    public void setCsysFieldInfoTime(Date csysFieldInfoTime) {
        this.csysFieldInfoTime = csysFieldInfoTime;
    }

    /**
     * @return CSYS_FIELD_INFO_DATE
     */
    public Date getCsysFieldInfoDate() {
        return csysFieldInfoDate;
    }

    /**
     * @param csysFieldInfoDate
     */
    public void setCsysFieldInfoDate(Date csysFieldInfoDate) {
        this.csysFieldInfoDate = csysFieldInfoDate;
    }
}