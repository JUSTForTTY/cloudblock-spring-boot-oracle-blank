package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_USER_NOTICE")
public class CsysUserNotice {
    @Id
    @Column(name = "CSYS_USER__NOTICE_ID")
    private String csysUserNoticeId;

    @Column(name = "CSYS_NOTICE_TEMPLATE_ID")
    private String csysNoticeTemplateId;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_USER__NOTICE_CREATE_TIME")
    private Date csysUserNoticeCreateTime;

    @Column(name = "CSYS_USER__NOTICE_MODIFY_TIME")
    private Date csysUserNoticeModifyTime;

    @Column(name = "CSYS_USER__NOTICE_CREATE_USER")
    private String csysUserNoticeCreateUser;

    @Column(name = "CSYS_USER__NOTICE_MODIFY_USER")
    private String csysUserNoticeModifyUser;

    @Column(name = "CSYS_USER__NOTICE_IS_DELETE")
    private String csysUserNoticeIsDelete;

    @Column(name = "CSYS_USER__NOTICE_DATE")
    private Date csysUserNoticeDate;

    @Column(name = "CSYS_USER__NOTICE_TIME")
    private Date csysUserNoticeTime;

    /**
     * @return CSYS_USER__NOTICE_ID
     */
    public String getCsysUserNoticeId() {
        return csysUserNoticeId;
    }

    /**
     * @param csysUserNoticeId
     */
    public void setCsysUserNoticeId(String csysUserNoticeId) {
        this.csysUserNoticeId = csysUserNoticeId;
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
     * @return CSYS_USER__NOTICE_CREATE_TIME
     */
    public Date getCsysUserNoticeCreateTime() {
        return csysUserNoticeCreateTime;
    }

    /**
     * @param csysUserNoticeCreateTime
     */
    public void setCsysUserNoticeCreateTime(Date csysUserNoticeCreateTime) {
        this.csysUserNoticeCreateTime = csysUserNoticeCreateTime;
    }

    /**
     * @return CSYS_USER__NOTICE_MODIFY_TIME
     */
    public Date getCsysUserNoticeModifyTime() {
        return csysUserNoticeModifyTime;
    }

    /**
     * @param csysUserNoticeModifyTime
     */
    public void setCsysUserNoticeModifyTime(Date csysUserNoticeModifyTime) {
        this.csysUserNoticeModifyTime = csysUserNoticeModifyTime;
    }

    /**
     * @return CSYS_USER__NOTICE_CREATE_USER
     */
    public String getCsysUserNoticeCreateUser() {
        return csysUserNoticeCreateUser;
    }

    /**
     * @param csysUserNoticeCreateUser
     */
    public void setCsysUserNoticeCreateUser(String csysUserNoticeCreateUser) {
        this.csysUserNoticeCreateUser = csysUserNoticeCreateUser;
    }

    /**
     * @return CSYS_USER__NOTICE_MODIFY_USER
     */
    public String getCsysUserNoticeModifyUser() {
        return csysUserNoticeModifyUser;
    }

    /**
     * @param csysUserNoticeModifyUser
     */
    public void setCsysUserNoticeModifyUser(String csysUserNoticeModifyUser) {
        this.csysUserNoticeModifyUser = csysUserNoticeModifyUser;
    }

    /**
     * @return CSYS_USER__NOTICE_IS_DELETE
     */
    public String getCsysUserNoticeIsDelete() {
        return csysUserNoticeIsDelete;
    }

    /**
     * @param csysUserNoticeIsDelete
     */
    public void setCsysUserNoticeIsDelete(String csysUserNoticeIsDelete) {
        this.csysUserNoticeIsDelete = csysUserNoticeIsDelete;
    }

    /**
     * @return CSYS_USER__NOTICE_DATE
     */
    public Date getCsysUserNoticeDate() {
        return csysUserNoticeDate;
    }

    /**
     * @param csysUserNoticeDate
     */
    public void setCsysUserNoticeDate(Date csysUserNoticeDate) {
        this.csysUserNoticeDate = csysUserNoticeDate;
    }

    /**
     * @return CSYS_USER__NOTICE_TIME
     */
    public Date getCsysUserNoticeTime() {
        return csysUserNoticeTime;
    }

    /**
     * @param csysUserNoticeTime
     */
    public void setCsysUserNoticeTime(Date csysUserNoticeTime) {
        this.csysUserNoticeTime = csysUserNoticeTime;
    }
}