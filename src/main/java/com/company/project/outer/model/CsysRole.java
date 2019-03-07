package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_ROLE")
public class CsysRole {
	@Id
    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_DEPART_ID")
    private String csysDepartId;

    @Column(name = "CSYS_ROLE_NAME")
    private String csysRoleName;

    @Column(name = "CSYS_ROLE_DESC")
    private String csysRoleDesc;

    @Column(name = "CSYS_ROLE_CREATE_TIME")
    private Date csysRoleCreateTime;

    @Column(name = "CSYS_ROLE_CREATE_USER")
    private String csysRoleCreateUser;

    @Column(name = "CSYS_ROLE_MODIFY_TIME")
    private Date csysRoleModifyTime;

    @Column(name = "CSYS_ROLE_MODIFY_USER")
    private String csysRoleModifyUser;

    @Column(name = "CSYS_ROLE_IS_DELETE")
    private String csysRoleIsDelete;

    @Column(name = "CSYS_ROLE_TIME")
    private Date csysRoleTime;

    @Column(name = "CSYS_ROLE_DATE")
    private Date csysRoleDate;

    /**
     * @return CSYS_ROLE_ID
     */
    public String getCsysRoleId() {
        return csysRoleId;
    }

    /**
     * @param csysRoleId
     */
    public void setCsysRoleId(String csysRoleId) {
        this.csysRoleId = csysRoleId;
    }

    /**
     * @return CSYS_DEPART_ID
     */
    public String getCsysDepartId() {
        return csysDepartId;
    }

    /**
     * @param csysDepartId
     */
    public void setCsysDepartId(String csysDepartId) {
        this.csysDepartId = csysDepartId;
    }

    /**
     * @return CSYS_ROLE_NAME
     */
    public String getCsysRoleName() {
        return csysRoleName;
    }

    /**
     * @param csysRoleName
     */
    public void setCsysRoleName(String csysRoleName) {
        this.csysRoleName = csysRoleName;
    }

    /**
     * @return CSYS_ROLE_DESC
     */
    public String getCsysRoleDesc() {
        return csysRoleDesc;
    }

    /**
     * @param csysRoleDesc
     */
    public void setCsysRoleDesc(String csysRoleDesc) {
        this.csysRoleDesc = csysRoleDesc;
    }

    /**
     * @return CSYS_ROLE_CREATE_TIME
     */
    public Date getCsysRoleCreateTime() {
        return csysRoleCreateTime;
    }

    /**
     * @param csysRoleCreateTime
     */
    public void setCsysRoleCreateTime(Date csysRoleCreateTime) {
        this.csysRoleCreateTime = csysRoleCreateTime;
    }

    /**
     * @return CSYS_ROLE_CREATE_USER
     */
    public String getCsysRoleCreateUser() {
        return csysRoleCreateUser;
    }

    /**
     * @param csysRoleCreateUser
     */
    public void setCsysRoleCreateUser(String csysRoleCreateUser) {
        this.csysRoleCreateUser = csysRoleCreateUser;
    }

    /**
     * @return CSYS_ROLE_MODIFY_TIME
     */
    public Date getCsysRoleModifyTime() {
        return csysRoleModifyTime;
    }

    /**
     * @param csysRoleModifyTime
     */
    public void setCsysRoleModifyTime(Date csysRoleModifyTime) {
        this.csysRoleModifyTime = csysRoleModifyTime;
    }

    /**
     * @return CSYS_ROLE_MODIFY_USER
     */
    public String getCsysRoleModifyUser() {
        return csysRoleModifyUser;
    }

    /**
     * @param csysRoleModifyUser
     */
    public void setCsysRoleModifyUser(String csysRoleModifyUser) {
        this.csysRoleModifyUser = csysRoleModifyUser;
    }

    /**
     * @return CSYS_ROLE_IS_DELETE
     */
    public String getCsysRoleIsDelete() {
        return csysRoleIsDelete;
    }

    /**
     * @param csysRoleIsDelete
     */
    public void setCsysRoleIsDelete(String csysRoleIsDelete) {
        this.csysRoleIsDelete = csysRoleIsDelete;
    }

    /**
     * @return CSYS_ROLE_TIME
     */
    public Date getCsysRoleTime() {
        return csysRoleTime;
    }

    /**
     * @param csysRoleTime
     */
    public void setCsysRoleTime(Date csysRoleTime) {
        this.csysRoleTime = csysRoleTime;
    }

    /**
     * @return CSYS_ROLE_DATE
     */
    public Date getCsysRoleDate() {
        return csysRoleDate;
    }

    /**
     * @param csysRoleDate
     */
    public void setCsysRoleDate(Date csysRoleDate) {
        this.csysRoleDate = csysRoleDate;
    }
}