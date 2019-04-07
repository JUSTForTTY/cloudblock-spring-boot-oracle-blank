package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_USER_ROLE")
public class CsysUserRole {
    @Id
    @Column(name = "CSYS_USER_ROLE_ID")
    private String csysUserRoleId;

    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_DEPARTMENT_ID")
    private String csysDepartmentId;

    @Column(name = "CSYS_USER_ROLE_CREATE_TIME")
    private Date csysUserRoleCreateTime;

    @Column(name = "CSYS_USER_ROLE_MODIFY_TIME")
    private Date csysUserRoleModifyTime;

    @Column(name = "CSYS_USER_ROLE_CREATE_USER")
    private String csysUserRoleCreateUser;

    @Column(name = "CSYS_USER_ROLE_MODIFY_USER")
    private String csysUserRoleModifyUser;

    @Column(name = "CSYS_USER_ROLE_IS_DELETE")
    private String csysUserRoleIsDelete;

    @Column(name = "CSYS_USER_ROLE_TIME")
    private Date csysUserRoleTime;

    @Column(name = "CSYS_USER_ROLE_DATE")
    private Date csysUserRoleDate;

    /**
     * @return CSYS_USER_ROLE_ID
     */
    public String getCsysUserRoleId() {
        return csysUserRoleId;
    }

    /**
     * @param csysUserRoleId
     */
    public void setCsysUserRoleId(String csysUserRoleId) {
        this.csysUserRoleId = csysUserRoleId;
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
     * @return CSYS_DEPARTMENT_ID
     */
    public String getCsysDepartmentId() {
        return csysDepartmentId;
    }

    /**
     * @param csysDepartmentId
     */
    public void setCsysDepartmentId(String csysDepartmentId) {
        this.csysDepartmentId = csysDepartmentId;
    }

    /**
     * @return CSYS_USER_ROLE_CREATE_TIME
     */
    public Date getCsysUserRoleCreateTime() {
        return csysUserRoleCreateTime;
    }

    /**
     * @param csysUserRoleCreateTime
     */
    public void setCsysUserRoleCreateTime(Date csysUserRoleCreateTime) {
        this.csysUserRoleCreateTime = csysUserRoleCreateTime;
    }

    /**
     * @return CSYS_USER_ROLE_MODIFY_TIME
     */
    public Date getCsysUserRoleModifyTime() {
        return csysUserRoleModifyTime;
    }

    /**
     * @param csysUserRoleModifyTime
     */
    public void setCsysUserRoleModifyTime(Date csysUserRoleModifyTime) {
        this.csysUserRoleModifyTime = csysUserRoleModifyTime;
    }

    /**
     * @return CSYS_USER_ROLE_CREATE_USER
     */
    public String getCsysUserRoleCreateUser() {
        return csysUserRoleCreateUser;
    }

    /**
     * @param csysUserRoleCreateUser
     */
    public void setCsysUserRoleCreateUser(String csysUserRoleCreateUser) {
        this.csysUserRoleCreateUser = csysUserRoleCreateUser;
    }

    /**
     * @return CSYS_USER_ROLE_MODIFY_USER
     */
    public String getCsysUserRoleModifyUser() {
        return csysUserRoleModifyUser;
    }

    /**
     * @param csysUserRoleModifyUser
     */
    public void setCsysUserRoleModifyUser(String csysUserRoleModifyUser) {
        this.csysUserRoleModifyUser = csysUserRoleModifyUser;
    }

    /**
     * @return CSYS_USER_ROLE_IS_DELETE
     */
    public String getCsysUserRoleIsDelete() {
        return csysUserRoleIsDelete;
    }

    /**
     * @param csysUserRoleIsDelete
     */
    public void setCsysUserRoleIsDelete(String csysUserRoleIsDelete) {
        this.csysUserRoleIsDelete = csysUserRoleIsDelete;
    }

    /**
     * @return CSYS_USER_ROLE_TIME
     */
    public Date getCsysUserRoleTime() {
        return csysUserRoleTime;
    }

    /**
     * @param csysUserRoleTime
     */
    public void setCsysUserRoleTime(Date csysUserRoleTime) {
        this.csysUserRoleTime = csysUserRoleTime;
    }

    /**
     * @return CSYS_USER_ROLE_DATE
     */
    public Date getCsysUserRoleDate() {
        return csysUserRoleDate;
    }

    /**
     * @param csysUserRoleDate
     */
    public void setCsysUserRoleDate(Date csysUserRoleDate) {
        this.csysUserRoleDate = csysUserRoleDate;
    }
}