package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_GRO_PRE")
public class CsysPotGroPre {
    @Id
    @Column(name = "CSYS_POT_GRO_PRE_ID")
    private String csysPotGroPreId;

    @Column(name = "CSYS_POT_GRO_PRE_NAME")
    private String csysPotGroPreName;

    @Column(name = "CSYS_POT_GROUP_FROM_ID")
    private String csysPotGroupFromId;

    @Column(name = "CSYS_POT_GROUP_TO_ID")
    private String csysPotGroupToId;

    @Column(name = "CSYS_POT_GRO_PRE_DESC")
    private String csysPotGroPreDesc;

    @Column(name = "CSYS_POT_GRO_PRE_CREATE_TIME")
    private Date csysPotGroPreCreateTime;

    @Column(name = "CSYS_POT_GRO_PRE_CREATE_USER")
    private String csysPotGroPreCreateUser;

    @Column(name = "CSYS_POT_GRO_PRE_MODIFY_USER")
    private String csysPotGroPreModifyUser;

    @Column(name = "CSYS_POT_GRO_PRE_MODIFY_TIME")
    private Date csysPotGroPreModifyTime;

    @Column(name = "CSYS_POT_GRO_PRE_IS_DELETE")
    private String csysPotGroPreIsDelete;

    @Column(name = "CSYS_POT_GRO_PRE_TIME")
    private Date csysPotGroPreTime;

    @Column(name = "CSYS_POT_GRO_PRE_DATE")
    private Date csysPotGroPreDate;

    /**
     * @return CSYS_POT_GRO_PRE_ID
     */
    public String getCsysPotGroPreId() {
        return csysPotGroPreId;
    }

    /**
     * @param csysPotGroPreId
     */
    public void setCsysPotGroPreId(String csysPotGroPreId) {
        this.csysPotGroPreId = csysPotGroPreId;
    }

    /**
     * @return CSYS_POT_GRO_PRE_NAME
     */
    public String getCsysPotGroPreName() {
        return csysPotGroPreName;
    }

    /**
     * @param csysPotGroPreName
     */
    public void setCsysPotGroPreName(String csysPotGroPreName) {
        this.csysPotGroPreName = csysPotGroPreName;
    }

    /**
     * @return CSYS_POT_GROUP_FROM_ID
     */
    public String getCsysPotGroupFromId() {
        return csysPotGroupFromId;
    }

    /**
     * @param csysPotGroupFromId
     */
    public void setCsysPotGroupFromId(String csysPotGroupFromId) {
        this.csysPotGroupFromId = csysPotGroupFromId;
    }

    /**
     * @return CSYS_POT_GROUP_TO_ID
     */
    public String getCsysPotGroupToId() {
        return csysPotGroupToId;
    }

    /**
     * @param csysPotGroupToId
     */
    public void setCsysPotGroupToId(String csysPotGroupToId) {
        this.csysPotGroupToId = csysPotGroupToId;
    }

    /**
     * @return CSYS_POT_GRO_PRE_DESC
     */
    public String getCsysPotGroPreDesc() {
        return csysPotGroPreDesc;
    }

    /**
     * @param csysPotGroPreDesc
     */
    public void setCsysPotGroPreDesc(String csysPotGroPreDesc) {
        this.csysPotGroPreDesc = csysPotGroPreDesc;
    }

    /**
     * @return CSYS_POT_GRO_PRE_CREATE_TIME
     */
    public Date getCsysPotGroPreCreateTime() {
        return csysPotGroPreCreateTime;
    }

    /**
     * @param csysPotGroPreCreateTime
     */
    public void setCsysPotGroPreCreateTime(Date csysPotGroPreCreateTime) {
        this.csysPotGroPreCreateTime = csysPotGroPreCreateTime;
    }

    /**
     * @return CSYS_POT_GRO_PRE_CREATE_USER
     */
    public String getCsysPotGroPreCreateUser() {
        return csysPotGroPreCreateUser;
    }

    /**
     * @param csysPotGroPreCreateUser
     */
    public void setCsysPotGroPreCreateUser(String csysPotGroPreCreateUser) {
        this.csysPotGroPreCreateUser = csysPotGroPreCreateUser;
    }

    /**
     * @return CSYS_POT_GRO_PRE_MODIFY_USER
     */
    public String getCsysPotGroPreModifyUser() {
        return csysPotGroPreModifyUser;
    }

    /**
     * @param csysPotGroPreModifyUser
     */
    public void setCsysPotGroPreModifyUser(String csysPotGroPreModifyUser) {
        this.csysPotGroPreModifyUser = csysPotGroPreModifyUser;
    }

    /**
     * @return CSYS_POT_GRO_PRE_MODIFY_TIME
     */
    public Date getCsysPotGroPreModifyTime() {
        return csysPotGroPreModifyTime;
    }

    /**
     * @param csysPotGroPreModifyTime
     */
    public void setCsysPotGroPreModifyTime(Date csysPotGroPreModifyTime) {
        this.csysPotGroPreModifyTime = csysPotGroPreModifyTime;
    }

    /**
     * @return CSYS_POT_GRO_PRE_IS_DELETE
     */
    public String getCsysPotGroPreIsDelete() {
        return csysPotGroPreIsDelete;
    }

    /**
     * @param csysPotGroPreIsDelete
     */
    public void setCsysPotGroPreIsDelete(String csysPotGroPreIsDelete) {
        this.csysPotGroPreIsDelete = csysPotGroPreIsDelete;
    }

    /**
     * @return CSYS_POT_GRO_PRE_TIME
     */
    public Date getCsysPotGroPreTime() {
        return csysPotGroPreTime;
    }

    /**
     * @param csysPotGroPreTime
     */
    public void setCsysPotGroPreTime(Date csysPotGroPreTime) {
        this.csysPotGroPreTime = csysPotGroPreTime;
    }

    /**
     * @return CSYS_POT_GRO_PRE_DATE
     */
    public Date getCsysPotGroPreDate() {
        return csysPotGroPreDate;
    }

    /**
     * @param csysPotGroPreDate
     */
    public void setCsysPotGroPreDate(Date csysPotGroPreDate) {
        this.csysPotGroPreDate = csysPotGroPreDate;
    }
}