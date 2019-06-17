package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_GROUP")
public class CsysPotGroup {
    @Id
    @Column(name = "CSYS_POT_GROUP_ID")
    private String csysPotGroupId;

    @Column(name = "CSYS_POT_GROUP_NAME")
    private String csysPotGroupName;

    @Column(name = "CSYS_POT_GROUP_DESC")
    private String csysPotGroupDesc;

    @Column(name = "CSYS_POT_GROUP_CREATE_TIME")
    private Date csysPotGroupCreateTime;

    @Column(name = "CSYS_POT_GROUP_CREATE_USER")
    private String csysPotGroupCreateUser;

    @Column(name = "CSYS_POT_GROUP_MODIFY_USER")
    private String csysPotGroupModifyUser;

    @Column(name = "CSYS_POT_GROUP_MODIFY_TIME")
    private Date csysPotGroupModifyTime;

    @Column(name = "CSYS_POT_GROUP_IS_DELETE")
    private String csysPotGroupIsDelete;

    @Column(name = "CSYS_POT_GROUP_TIME")
    private Date csysPotGroupTime;

    @Column(name = "CSYS_POT_GROUP_DATE")
    private Date csysPotGroupDate;

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

    /**
     * @return CSYS_POT_GROUP_NAME
     */
    public String getCsysPotGroupName() {
        return csysPotGroupName;
    }

    /**
     * @param csysPotGroupName
     */
    public void setCsysPotGroupName(String csysPotGroupName) {
        this.csysPotGroupName = csysPotGroupName;
    }

    /**
     * @return CSYS_POT_GROUP_DESC
     */
    public String getCsysPotGroupDesc() {
        return csysPotGroupDesc;
    }

    /**
     * @param csysPotGroupDesc
     */
    public void setCsysPotGroupDesc(String csysPotGroupDesc) {
        this.csysPotGroupDesc = csysPotGroupDesc;
    }

    /**
     * @return CSYS_POT_GROUP_CREATE_TIME
     */
    public Date getCsysPotGroupCreateTime() {
        return csysPotGroupCreateTime;
    }

    /**
     * @param csysPotGroupCreateTime
     */
    public void setCsysPotGroupCreateTime(Date csysPotGroupCreateTime) {
        this.csysPotGroupCreateTime = csysPotGroupCreateTime;
    }

    /**
     * @return CSYS_POT_GROUP_CREATE_USER
     */
    public String getCsysPotGroupCreateUser() {
        return csysPotGroupCreateUser;
    }

    /**
     * @param csysPotGroupCreateUser
     */
    public void setCsysPotGroupCreateUser(String csysPotGroupCreateUser) {
        this.csysPotGroupCreateUser = csysPotGroupCreateUser;
    }

    /**
     * @return CSYS_POT_GROUP_MODIFY_USER
     */
    public String getCsysPotGroupModifyUser() {
        return csysPotGroupModifyUser;
    }

    /**
     * @param csysPotGroupModifyUser
     */
    public void setCsysPotGroupModifyUser(String csysPotGroupModifyUser) {
        this.csysPotGroupModifyUser = csysPotGroupModifyUser;
    }

    /**
     * @return CSYS_POT_GROUP_MODIFY_TIME
     */
    public Date getCsysPotGroupModifyTime() {
        return csysPotGroupModifyTime;
    }

    /**
     * @param csysPotGroupModifyTime
     */
    public void setCsysPotGroupModifyTime(Date csysPotGroupModifyTime) {
        this.csysPotGroupModifyTime = csysPotGroupModifyTime;
    }

    /**
     * @return CSYS_POT_GROUP_IS_DELETE
     */
    public String getCsysPotGroupIsDelete() {
        return csysPotGroupIsDelete;
    }

    /**
     * @param csysPotGroupIsDelete
     */
    public void setCsysPotGroupIsDelete(String csysPotGroupIsDelete) {
        this.csysPotGroupIsDelete = csysPotGroupIsDelete;
    }

    /**
     * @return CSYS_POT_GROUP_TIME
     */
    public Date getCsysPotGroupTime() {
        return csysPotGroupTime;
    }

    /**
     * @param csysPotGroupTime
     */
    public void setCsysPotGroupTime(Date csysPotGroupTime) {
        this.csysPotGroupTime = csysPotGroupTime;
    }

    /**
     * @return CSYS_POT_GROUP_DATE
     */
    public Date getCsysPotGroupDate() {
        return csysPotGroupDate;
    }

    /**
     * @param csysPotGroupDate
     */
    public void setCsysPotGroupDate(Date csysPotGroupDate) {
        this.csysPotGroupDate = csysPotGroupDate;
    }
}