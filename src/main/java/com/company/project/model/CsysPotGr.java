package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_GR")
public class CsysPotGr {
    @Id
    @Column(name = "CSYS_POT_GR_ID")
    private String csysPotGrId;

    @Column(name = "CSYS_POT_GROUP_ID")
    private String csysPotGroupId;

    @Column(name = "CSYS_POT_GROUP_NAME")
    private String csysPotGroupName;

    @Column(name = "CSYS_POT_ID")
    private String csysPotId;

    @Column(name = "CSYS_POT_NAME")
    private String csysPotName;

    @Column(name = "CSYS_POT_GR_DESC")
    private String csysPotGrDesc;

    @Column(name = "CSYS_POT_GR_CREATE_TIME")
    private Date csysPotGrCreateTime;

    @Column(name = "CSYS_POT_GR_CREATE_USER")
    private String csysPotGrCreateUser;

    @Column(name = "CSYS_POT_GR_MODIFY_USER")
    private String csysPotGrModifyUser;

    @Column(name = "CSYS_POT_GR_MODIFY_TIME")
    private Date csysPotGrModifyTime;

    @Column(name = "CSYS_POT_GR_IS_DELETE")
    private String csysPotGrIsDelete;

    @Column(name = "CSYS_POT_GR_TIME")
    private Date csysPotGrTime;

    @Column(name = "CSYS_POT_GR_DATE")
    private Date csysPotGrDate;

    /**
     * @return CSYS_POT_GR_ID
     */
    public String getCsysPotGrId() {
        return csysPotGrId;
    }

    /**
     * @param csysPotGrId
     */
    public void setCsysPotGrId(String csysPotGrId) {
        this.csysPotGrId = csysPotGrId;
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
     * @return CSYS_POT_ID
     */
    public String getCsysPotId() {
        return csysPotId;
    }

    /**
     * @param csysPotId
     */
    public void setCsysPotId(String csysPotId) {
        this.csysPotId = csysPotId;
    }

    /**
     * @return CSYS_POT_NAME
     */
    public String getCsysPotName() {
        return csysPotName;
    }

    /**
     * @param csysPotName
     */
    public void setCsysPotName(String csysPotName) {
        this.csysPotName = csysPotName;
    }

    /**
     * @return CSYS_POT_GR_DESC
     */
    public String getCsysPotGrDesc() {
        return csysPotGrDesc;
    }

    /**
     * @param csysPotGrDesc
     */
    public void setCsysPotGrDesc(String csysPotGrDesc) {
        this.csysPotGrDesc = csysPotGrDesc;
    }

    /**
     * @return CSYS_POT_GR_CREATE_TIME
     */
    public Date getCsysPotGrCreateTime() {
        return csysPotGrCreateTime;
    }

    /**
     * @param csysPotGrCreateTime
     */
    public void setCsysPotGrCreateTime(Date csysPotGrCreateTime) {
        this.csysPotGrCreateTime = csysPotGrCreateTime;
    }

    /**
     * @return CSYS_POT_GR_CREATE_USER
     */
    public String getCsysPotGrCreateUser() {
        return csysPotGrCreateUser;
    }

    /**
     * @param csysPotGrCreateUser
     */
    public void setCsysPotGrCreateUser(String csysPotGrCreateUser) {
        this.csysPotGrCreateUser = csysPotGrCreateUser;
    }

    /**
     * @return CSYS_POT_GR_MODIFY_USER
     */
    public String getCsysPotGrModifyUser() {
        return csysPotGrModifyUser;
    }

    /**
     * @param csysPotGrModifyUser
     */
    public void setCsysPotGrModifyUser(String csysPotGrModifyUser) {
        this.csysPotGrModifyUser = csysPotGrModifyUser;
    }

    /**
     * @return CSYS_POT_GR_MODIFY_TIME
     */
    public Date getCsysPotGrModifyTime() {
        return csysPotGrModifyTime;
    }

    /**
     * @param csysPotGrModifyTime
     */
    public void setCsysPotGrModifyTime(Date csysPotGrModifyTime) {
        this.csysPotGrModifyTime = csysPotGrModifyTime;
    }

    /**
     * @return CSYS_POT_GR_IS_DELETE
     */
    public String getCsysPotGrIsDelete() {
        return csysPotGrIsDelete;
    }

    /**
     * @param csysPotGrIsDelete
     */
    public void setCsysPotGrIsDelete(String csysPotGrIsDelete) {
        this.csysPotGrIsDelete = csysPotGrIsDelete;
    }

    /**
     * @return CSYS_POT_GR_TIME
     */
    public Date getCsysPotGrTime() {
        return csysPotGrTime;
    }

    /**
     * @param csysPotGrTime
     */
    public void setCsysPotGrTime(Date csysPotGrTime) {
        this.csysPotGrTime = csysPotGrTime;
    }

    /**
     * @return CSYS_POT_GR_DATE
     */
    public Date getCsysPotGrDate() {
        return csysPotGrDate;
    }

    /**
     * @param csysPotGrDate
     */
    public void setCsysPotGrDate(Date csysPotGrDate) {
        this.csysPotGrDate = csysPotGrDate;
    }
}