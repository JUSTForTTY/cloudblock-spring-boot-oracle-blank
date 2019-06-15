package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_PUBLIC")
public class CsysPotPublic {
    @Id
    @Column(name = "CSYS_POT_PUBLIC_ID")
    private String csysPotPublicId;

    @Column(name = "CSYS_POT_PUBLIC_NAME")
    private String csysPotPublicName;

    @Column(name = "CSYS_POT_PUBLIC_DESC")
    private String csysPotPublicDesc;

    @Column(name = "CSYS_POT_PUBLIC_CREATE_TIME")
    private Date csysPotPublicCreateTime;

    @Column(name = "CSYS_POT_PUBLIC_MODIFY_TIME")
    private Date csysPotPublicModifyTime;

    @Column(name = "CSYS_POT_PUBLIC_CREATE_USER")
    private String csysPotPublicCreateUser;

    @Column(name = "CSYS_POT_PUBLIC_MODIFY_USER")
    private String csysPotPublicModifyUser;

    @Column(name = "CSYS_POT_PUBLIC_IS_DELETE")
    private String csysPotPublicIsDelete;

    @Column(name = "CSYS_POT_PUBLIC_DATE")
    private Date csysPotPublicDate;

    @Column(name = "CSYS_POT_PUBLIC_TIME")
    private Date csysPotPublicTime;

    @Column(name = "CSYS_POT_STYLE_ID")
    private String csysPotStyleId;

    @Column(name = "CSYS_POT_GROUP_ID")
    private String csysPotGroupId;

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
     * @return CSYS_POT_PUBLIC_NAME
     */
    public String getCsysPotPublicName() {
        return csysPotPublicName;
    }

    /**
     * @param csysPotPublicName
     */
    public void setCsysPotPublicName(String csysPotPublicName) {
        this.csysPotPublicName = csysPotPublicName;
    }

    /**
     * @return CSYS_POT_PUBLIC_DESC
     */
    public String getCsysPotPublicDesc() {
        return csysPotPublicDesc;
    }

    /**
     * @param csysPotPublicDesc
     */
    public void setCsysPotPublicDesc(String csysPotPublicDesc) {
        this.csysPotPublicDesc = csysPotPublicDesc;
    }

    /**
     * @return CSYS_POT_PUBLIC_CREATE_TIME
     */
    public Date getCsysPotPublicCreateTime() {
        return csysPotPublicCreateTime;
    }

    /**
     * @param csysPotPublicCreateTime
     */
    public void setCsysPotPublicCreateTime(Date csysPotPublicCreateTime) {
        this.csysPotPublicCreateTime = csysPotPublicCreateTime;
    }

    /**
     * @return CSYS_POT_PUBLIC_MODIFY_TIME
     */
    public Date getCsysPotPublicModifyTime() {
        return csysPotPublicModifyTime;
    }

    /**
     * @param csysPotPublicModifyTime
     */
    public void setCsysPotPublicModifyTime(Date csysPotPublicModifyTime) {
        this.csysPotPublicModifyTime = csysPotPublicModifyTime;
    }

    /**
     * @return CSYS_POT_PUBLIC_CREATE_USER
     */
    public String getCsysPotPublicCreateUser() {
        return csysPotPublicCreateUser;
    }

    /**
     * @param csysPotPublicCreateUser
     */
    public void setCsysPotPublicCreateUser(String csysPotPublicCreateUser) {
        this.csysPotPublicCreateUser = csysPotPublicCreateUser;
    }

    /**
     * @return CSYS_POT_PUBLIC_MODIFY_USER
     */
    public String getCsysPotPublicModifyUser() {
        return csysPotPublicModifyUser;
    }

    /**
     * @param csysPotPublicModifyUser
     */
    public void setCsysPotPublicModifyUser(String csysPotPublicModifyUser) {
        this.csysPotPublicModifyUser = csysPotPublicModifyUser;
    }

    /**
     * @return CSYS_POT_PUBLIC_IS_DELETE
     */
    public String getCsysPotPublicIsDelete() {
        return csysPotPublicIsDelete;
    }

    /**
     * @param csysPotPublicIsDelete
     */
    public void setCsysPotPublicIsDelete(String csysPotPublicIsDelete) {
        this.csysPotPublicIsDelete = csysPotPublicIsDelete;
    }

    /**
     * @return CSYS_POT_PUBLIC_DATE
     */
    public Date getCsysPotPublicDate() {
        return csysPotPublicDate;
    }

    /**
     * @param csysPotPublicDate
     */
    public void setCsysPotPublicDate(Date csysPotPublicDate) {
        this.csysPotPublicDate = csysPotPublicDate;
    }

    /**
     * @return CSYS_POT_PUBLIC_TIME
     */
    public Date getCsysPotPublicTime() {
        return csysPotPublicTime;
    }

    /**
     * @param csysPotPublicTime
     */
    public void setCsysPotPublicTime(Date csysPotPublicTime) {
        this.csysPotPublicTime = csysPotPublicTime;
    }

    /**
     * @return CSYS_POT_STYLE_ID
     */
    public String getCsysPotStyleId() {
        return csysPotStyleId;
    }

    /**
     * @param csysPotStyleId
     */
    public void setCsysPotStyleId(String csysPotStyleId) {
        this.csysPotStyleId = csysPotStyleId;
    }

    /**
     * @return CSYS_POT_GROUP_ID
     */
    public String getCsysPotGroupId() {
        return csysPotGroupId;
    }

    /**
     * @param csysPotGroupId
     */
    public void setCsysPotGroupId(String csysPotGroupId) {
        this.csysPotGroupId = csysPotGroupId;
    }
}