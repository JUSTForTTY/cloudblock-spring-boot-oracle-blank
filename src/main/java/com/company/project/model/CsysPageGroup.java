package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PAGE_GROUP")
public class CsysPageGroup {
    @Id
    @Column(name = "CSYS_PAGE_GROUP_ID")
    private String csysPageGroupId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PAGE_NAME")
    private String csysPageName;

    @Column(name = "CSYS_PAGE_GROUP_CODE")
    private String csysPageGroupCode;

    @Column(name = "CSYS_PAGE_GROUP_DESC")
    private String csysPageGroupDesc;

    @Column(name = "FLAG_1")
    private String flag1;

    @Column(name = "FLAG_2")
    private String flag2;

    @Column(name = "FLAG_3")
    private String flag3;

    @Column(name = "CSYS_PAGE_GROUP_CREATE_TIME")
    private Date csysPageGroupCreateTime;

    @Column(name = "CSYS_PAGE_GROUP_MODIFY_TIME")
    private Date csysPageGroupModifyTime;

    @Column(name = "CSYS_PAGE_GROUP_CREATE_USER")
    private String csysPageGroupCreateUser;

    @Column(name = "CSYS_PAGE_GROUP_MODIFY_USER")
    private String csysPageGroupModifyUser;

    @Column(name = "CSYS_PAGE_GROUP_IS_DELETE")
    private String csysPageGroupIsDelete;

    @Column(name = "CSYS_CODEMASTER_TIME")
    private Date csysCodemasterTime;

    @Column(name = "CSYS_CODEMASTER_DATE")
    private Date csysCodemasterDate;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return CSYS_PAGE_GROUP_ID
     */
    public String getCsysPageGroupId() {
        return csysPageGroupId;
    }

    /**
     * @param csysPageGroupId
     */
    public void setCsysPageGroupId(String csysPageGroupId) {
        this.csysPageGroupId = csysPageGroupId;
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
     * @return CSYS_PAGE_GROUP_CODE
     */
    public String getCsysPageGroupCode() {
        return csysPageGroupCode;
    }

    /**
     * @param csysPageGroupCode
     */
    public void setCsysPageGroupCode(String csysPageGroupCode) {
        this.csysPageGroupCode = csysPageGroupCode;
    }

    /**
     * @return CSYS_PAGE_GROUP_DESC
     */
    public String getCsysPageGroupDesc() {
        return csysPageGroupDesc;
    }

    /**
     * @param csysPageGroupDesc
     */
    public void setCsysPageGroupDesc(String csysPageGroupDesc) {
        this.csysPageGroupDesc = csysPageGroupDesc;
    }

    /**
     * @return FLAG_1
     */
    public String getFlag1() {
        return flag1;
    }

    /**
     * @param flag1
     */
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    /**
     * @return FLAG_2
     */
    public String getFlag2() {
        return flag2;
    }

    /**
     * @param flag2
     */
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    /**
     * @return FLAG_3
     */
    public String getFlag3() {
        return flag3;
    }

    /**
     * @param flag3
     */
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    /**
     * @return CSYS_PAGE_GROUP_CREATE_TIME
     */
    public Date getCsysPageGroupCreateTime() {
        return csysPageGroupCreateTime;
    }

    /**
     * @param csysPageGroupCreateTime
     */
    public void setCsysPageGroupCreateTime(Date csysPageGroupCreateTime) {
        this.csysPageGroupCreateTime = csysPageGroupCreateTime;
    }

    /**
     * @return CSYS_PAGE_GROUP_MODIFY_TIME
     */
    public Date getCsysPageGroupModifyTime() {
        return csysPageGroupModifyTime;
    }

    /**
     * @param csysPageGroupModifyTime
     */
    public void setCsysPageGroupModifyTime(Date csysPageGroupModifyTime) {
        this.csysPageGroupModifyTime = csysPageGroupModifyTime;
    }

    /**
     * @return CSYS_PAGE_GROUP_CREATE_USER
     */
    public String getCsysPageGroupCreateUser() {
        return csysPageGroupCreateUser;
    }

    /**
     * @param csysPageGroupCreateUser
     */
    public void setCsysPageGroupCreateUser(String csysPageGroupCreateUser) {
        this.csysPageGroupCreateUser = csysPageGroupCreateUser;
    }

    /**
     * @return CSYS_PAGE_GROUP_MODIFY_USER
     */
    public String getCsysPageGroupModifyUser() {
        return csysPageGroupModifyUser;
    }

    /**
     * @param csysPageGroupModifyUser
     */
    public void setCsysPageGroupModifyUser(String csysPageGroupModifyUser) {
        this.csysPageGroupModifyUser = csysPageGroupModifyUser;
    }

    /**
     * @return CSYS_PAGE_GROUP_IS_DELETE
     */
    public String getCsysPageGroupIsDelete() {
        return csysPageGroupIsDelete;
    }

    /**
     * @param csysPageGroupIsDelete
     */
    public void setCsysPageGroupIsDelete(String csysPageGroupIsDelete) {
        this.csysPageGroupIsDelete = csysPageGroupIsDelete;
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}