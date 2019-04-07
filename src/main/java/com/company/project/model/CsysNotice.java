package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_NOTICE")
public class CsysNotice {
    @Id
    @Column(name = "CSYS_NOTICE_ID")
    private String csysNoticeId;

    @Column(name = "CSYS_NOTICE_TEMPLATE_ID")
    private String csysNoticeTemplateId;

    @Column(name = "CSYS_NOTICE_TABLE_NAME")
    private String csysNoticeTableName;

    @Column(name = "CSYS_NOTICE_TABLE_VALUE")
    private String csysNoticeTableValue;

    @Column(name = "CSYS_NOTICE_USER_ID")
    private String csysNoticeUserId;

    @Column(name = "CSYS_NOTICE_USER_NAME")
    private String csysNoticeUserName;

    @Column(name = "CSYS_NOTICE_HANDLE_USER_ID")
    private String csysNoticeHandleUserId;

    @Column(name = "CSYS_NOTICE_HANDLE_USER_NAME")
    private String csysNoticeHandleUserName;

    @Column(name = "CSYS_NOTICE_HANDLE_MOBILE")
    private String csysNoticeHandleMobile;

    @Column(name = "CSYS_NOTICE_HANDLE_EMAIL")
    private String csysNoticeHandleEmail;

    @Column(name = "CSYS_NOTICE_TYPE")
    private String csysNoticeType;

    @Column(name = "CSYS_POINT_TRS_RECORD_ID")
    private String csysPointTrsRecordId;

    @Column(name = "CSYS_NOTICE_URL")
    private String csysNoticeUrl;

    @Column(name = "CSYS_NOTICE_LEVEL")
    private String csysNoticeLevel;

    @Column(name = "CSYS_NOTICE_OPERTATE_TYPE")
    private String csysNoticeOpertateType;

    @Column(name = "CSYS_NOTICE_MODE")
    private String csysNoticeMode;

    @Column(name = "CSYS_NOTICE_IS_SUCCESS")
    private String csysNoticeIsSuccess;

    @Column(name = "CSYS_NOTICE_FAIL_REASON")
    private String csysNoticeFailReason;

    @Column(name = "CSYS_NOTICE_DESC")
    private String csysNoticeDesc;

    @Column(name = "CSYS_NOTICE_CREATE_TIME")
    private Date csysNoticeCreateTime;

    @Column(name = "CSYS_NOTICE_CREATE_USER")
    private String csysNoticeCreateUser;

    @Column(name = "CSYS_NOTICE_MODIFY_TIME")
    private Date csysNoticeModifyTime;

    @Column(name = "CSYS_NOTICE_MODIFY_USER")
    private String csysNoticeModifyUser;

    @Column(name = "CSYS_NOTICE_IS_DELETE")
    private String csysNoticeIsDelete;

    @Column(name = "CSYS_NOTICE_TIME")
    private Date csysNoticeTime;

    @Column(name = "CSYS_NOTICE_DATE")
    private Date csysNoticeDate;

    @Column(name = "CSYS_NOTICE_CONTENT")
    private String csysNoticeContent;

    /**
     * @return CSYS_NOTICE_ID
     */
    public String getCsysNoticeId() {
        return csysNoticeId;
    }

    /**
     * @param csysNoticeId
     */
    public void setCsysNoticeId(String csysNoticeId) {
        this.csysNoticeId = csysNoticeId;
    }

    /**
     * @return CSYS_NOTICE_TEMPLATE_ID
     */
    public String getCsysNoticeTemplateId() {
        return csysNoticeTemplateId;
    }

    /**
     * @param csysNoticeTemplateId
     */
    public void setCsysNoticeTemplateId(String csysNoticeTemplateId) {
        this.csysNoticeTemplateId = csysNoticeTemplateId;
    }

    /**
     * @return CSYS_NOTICE_TABLE_NAME
     */
    public String getCsysNoticeTableName() {
        return csysNoticeTableName;
    }

    /**
     * @param csysNoticeTableName
     */
    public void setCsysNoticeTableName(String csysNoticeTableName) {
        this.csysNoticeTableName = csysNoticeTableName;
    }

    /**
     * @return CSYS_NOTICE_TABLE_VALUE
     */
    public String getCsysNoticeTableValue() {
        return csysNoticeTableValue;
    }

    /**
     * @param csysNoticeTableValue
     */
    public void setCsysNoticeTableValue(String csysNoticeTableValue) {
        this.csysNoticeTableValue = csysNoticeTableValue;
    }

    /**
     * @return CSYS_NOTICE_USER_ID
     */
    public String getCsysNoticeUserId() {
        return csysNoticeUserId;
    }

    /**
     * @param csysNoticeUserId
     */
    public void setCsysNoticeUserId(String csysNoticeUserId) {
        this.csysNoticeUserId = csysNoticeUserId;
    }

    /**
     * @return CSYS_NOTICE_USER_NAME
     */
    public String getCsysNoticeUserName() {
        return csysNoticeUserName;
    }

    /**
     * @param csysNoticeUserName
     */
    public void setCsysNoticeUserName(String csysNoticeUserName) {
        this.csysNoticeUserName = csysNoticeUserName;
    }

    /**
     * @return CSYS_NOTICE_HANDLE_USER_ID
     */
    public String getCsysNoticeHandleUserId() {
        return csysNoticeHandleUserId;
    }

    /**
     * @param csysNoticeHandleUserId
     */
    public void setCsysNoticeHandleUserId(String csysNoticeHandleUserId) {
        this.csysNoticeHandleUserId = csysNoticeHandleUserId;
    }

    /**
     * @return CSYS_NOTICE_HANDLE_USER_NAME
     */
    public String getCsysNoticeHandleUserName() {
        return csysNoticeHandleUserName;
    }

    /**
     * @param csysNoticeHandleUserName
     */
    public void setCsysNoticeHandleUserName(String csysNoticeHandleUserName) {
        this.csysNoticeHandleUserName = csysNoticeHandleUserName;
    }

    /**
     * @return CSYS_NOTICE_HANDLE_MOBILE
     */
    public String getCsysNoticeHandleMobile() {
        return csysNoticeHandleMobile;
    }

    /**
     * @param csysNoticeHandleMobile
     */
    public void setCsysNoticeHandleMobile(String csysNoticeHandleMobile) {
        this.csysNoticeHandleMobile = csysNoticeHandleMobile;
    }

    /**
     * @return CSYS_NOTICE_HANDLE_EMAIL
     */
    public String getCsysNoticeHandleEmail() {
        return csysNoticeHandleEmail;
    }

    /**
     * @param csysNoticeHandleEmail
     */
    public void setCsysNoticeHandleEmail(String csysNoticeHandleEmail) {
        this.csysNoticeHandleEmail = csysNoticeHandleEmail;
    }

    /**
     * @return CSYS_NOTICE_TYPE
     */
    public String getCsysNoticeType() {
        return csysNoticeType;
    }

    /**
     * @param csysNoticeType
     */
    public void setCsysNoticeType(String csysNoticeType) {
        this.csysNoticeType = csysNoticeType;
    }

    /**
     * @return CSYS_POINT_TRS_RECORD_ID
     */
    public String getCsysPointTrsRecordId() {
        return csysPointTrsRecordId;
    }

    /**
     * @param csysPointTrsRecordId
     */
    public void setCsysPointTrsRecordId(String csysPointTrsRecordId) {
        this.csysPointTrsRecordId = csysPointTrsRecordId;
    }

    /**
     * @return CSYS_NOTICE_URL
     */
    public String getCsysNoticeUrl() {
        return csysNoticeUrl;
    }

    /**
     * @param csysNoticeUrl
     */
    public void setCsysNoticeUrl(String csysNoticeUrl) {
        this.csysNoticeUrl = csysNoticeUrl;
    }

    /**
     * @return CSYS_NOTICE_LEVEL
     */
    public String getCsysNoticeLevel() {
        return csysNoticeLevel;
    }

    /**
     * @param csysNoticeLevel
     */
    public void setCsysNoticeLevel(String csysNoticeLevel) {
        this.csysNoticeLevel = csysNoticeLevel;
    }

    /**
     * @return CSYS_NOTICE_OPERTATE_TYPE
     */
    public String getCsysNoticeOpertateType() {
        return csysNoticeOpertateType;
    }

    /**
     * @param csysNoticeOpertateType
     */
    public void setCsysNoticeOpertateType(String csysNoticeOpertateType) {
        this.csysNoticeOpertateType = csysNoticeOpertateType;
    }

    /**
     * @return CSYS_NOTICE_MODE
     */
    public String getCsysNoticeMode() {
        return csysNoticeMode;
    }

    /**
     * @param csysNoticeMode
     */
    public void setCsysNoticeMode(String csysNoticeMode) {
        this.csysNoticeMode = csysNoticeMode;
    }

    /**
     * @return CSYS_NOTICE_IS_SUCCESS
     */
    public String getCsysNoticeIsSuccess() {
        return csysNoticeIsSuccess;
    }

    /**
     * @param csysNoticeIsSuccess
     */
    public void setCsysNoticeIsSuccess(String csysNoticeIsSuccess) {
        this.csysNoticeIsSuccess = csysNoticeIsSuccess;
    }

    /**
     * @return CSYS_NOTICE_FAIL_REASON
     */
    public String getCsysNoticeFailReason() {
        return csysNoticeFailReason;
    }

    /**
     * @param csysNoticeFailReason
     */
    public void setCsysNoticeFailReason(String csysNoticeFailReason) {
        this.csysNoticeFailReason = csysNoticeFailReason;
    }

    /**
     * @return CSYS_NOTICE_DESC
     */
    public String getCsysNoticeDesc() {
        return csysNoticeDesc;
    }

    /**
     * @param csysNoticeDesc
     */
    public void setCsysNoticeDesc(String csysNoticeDesc) {
        this.csysNoticeDesc = csysNoticeDesc;
    }

    /**
     * @return CSYS_NOTICE_CREATE_TIME
     */
    public Date getCsysNoticeCreateTime() {
        return csysNoticeCreateTime;
    }

    /**
     * @param csysNoticeCreateTime
     */
    public void setCsysNoticeCreateTime(Date csysNoticeCreateTime) {
        this.csysNoticeCreateTime = csysNoticeCreateTime;
    }

    /**
     * @return CSYS_NOTICE_CREATE_USER
     */
    public String getCsysNoticeCreateUser() {
        return csysNoticeCreateUser;
    }

    /**
     * @param csysNoticeCreateUser
     */
    public void setCsysNoticeCreateUser(String csysNoticeCreateUser) {
        this.csysNoticeCreateUser = csysNoticeCreateUser;
    }

    /**
     * @return CSYS_NOTICE_MODIFY_TIME
     */
    public Date getCsysNoticeModifyTime() {
        return csysNoticeModifyTime;
    }

    /**
     * @param csysNoticeModifyTime
     */
    public void setCsysNoticeModifyTime(Date csysNoticeModifyTime) {
        this.csysNoticeModifyTime = csysNoticeModifyTime;
    }

    /**
     * @return CSYS_NOTICE_MODIFY_USER
     */
    public String getCsysNoticeModifyUser() {
        return csysNoticeModifyUser;
    }

    /**
     * @param csysNoticeModifyUser
     */
    public void setCsysNoticeModifyUser(String csysNoticeModifyUser) {
        this.csysNoticeModifyUser = csysNoticeModifyUser;
    }

    /**
     * @return CSYS_NOTICE_IS_DELETE
     */
    public String getCsysNoticeIsDelete() {
        return csysNoticeIsDelete;
    }

    /**
     * @param csysNoticeIsDelete
     */
    public void setCsysNoticeIsDelete(String csysNoticeIsDelete) {
        this.csysNoticeIsDelete = csysNoticeIsDelete;
    }

    /**
     * @return CSYS_NOTICE_TIME
     */
    public Date getCsysNoticeTime() {
        return csysNoticeTime;
    }

    /**
     * @param csysNoticeTime
     */
    public void setCsysNoticeTime(Date csysNoticeTime) {
        this.csysNoticeTime = csysNoticeTime;
    }

    /**
     * @return CSYS_NOTICE_DATE
     */
    public Date getCsysNoticeDate() {
        return csysNoticeDate;
    }

    /**
     * @param csysNoticeDate
     */
    public void setCsysNoticeDate(Date csysNoticeDate) {
        this.csysNoticeDate = csysNoticeDate;
    }

    /**
     * @return CSYS_NOTICE_CONTENT
     */
    public String getCsysNoticeContent() {
        return csysNoticeContent;
    }

    /**
     * @param csysNoticeContent
     */
    public void setCsysNoticeContent(String csysNoticeContent) {
        this.csysNoticeContent = csysNoticeContent;
    }
}