package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_MENU_AUTH")
public class CsysMenuAuth {
    @Id
    @Column(name = "CSYS_MENU_AUTH_ID")
    private String csysMenuAuthId;

    @Column(name = "CSYS_MENU_ID")
    private String csysMenuId;

    @Column(name = "CSYS_MENU_NAME")
    private String csysMenuName;

    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_ROLE_NAME")
    private String csysRoleName;

    @Column(name = "CSYS_DEPARTMENT_ID")
    private String csysDepartmentId;

    @Column(name = "CSYS_DEPARTMENT_NAME")
    private String csysDepartmentName;

    @Column(name = "CSYS_MENU_AUTH_CREATE_TIME")
    private Date csysMenuAuthCreateTime;

    @Column(name = "CSYS_MENU_AUTH_CREATE_USER")
    private String csysMenuAuthCreateUser;

    @Column(name = "CSYS_MENU_AUTH_MODIFY_TIME")
    private Date csysMenuAuthModifyTime;

    @Column(name = "CSYS_MENU_AUTH_MODIFY_USER")
    private String csysMenuAuthModifyUser;

    @Column(name = "CSYS_MENU_AUTH_IS_DELETE")
    private String csysMenuAuthIsDelete;

    @Column(name = "CSYS_MENU_AUTH_TIME")
    private Date csysMenuAuthTime;

    @Column(name = "CSYS_MENU_AUTH_DATE")
    private Date csysMenuAuthDate;

    @Column(name = "CSYS_MENU_AUTH_HASCHILD")
    private String csysMenuAuthHaschild;

    /**
     * @return CSYS_MENU_AUTH_ID
     */
    public String getCsysMenuAuthId() {
        return csysMenuAuthId;
    }

    /**
     * @param csysMenuAuthId
     */
    public void setCsysMenuAuthId(String csysMenuAuthId) {
        this.csysMenuAuthId = csysMenuAuthId;
    }

    /**
     * @return CSYS_MENU_ID
     */
    public String getCsysMenuId() {
        return csysMenuId;
    }

    /**
     * @param csysMenuId
     */
    public void setCsysMenuId(String csysMenuId) {
        this.csysMenuId = csysMenuId;
    }

    /**
     * @return CSYS_MENU_NAME
     */
    public String getCsysMenuName() {
        return csysMenuName;
    }

    /**
     * @param csysMenuName
     */
    public void setCsysMenuName(String csysMenuName) {
        this.csysMenuName = csysMenuName;
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
     * @return CSYS_DEPARTMENT_NAME
     */
    public String getCsysDepartmentName() {
        return csysDepartmentName;
    }

    /**
     * @param csysDepartmentName
     */
    public void setCsysDepartmentName(String csysDepartmentName) {
        this.csysDepartmentName = csysDepartmentName;
    }

    /**
     * @return CSYS_MENU_AUTH_CREATE_TIME
     */
    public Date getCsysMenuAuthCreateTime() {
        return csysMenuAuthCreateTime;
    }

    /**
     * @param csysMenuAuthCreateTime
     */
    public void setCsysMenuAuthCreateTime(Date csysMenuAuthCreateTime) {
        this.csysMenuAuthCreateTime = csysMenuAuthCreateTime;
    }

    /**
     * @return CSYS_MENU_AUTH_CREATE_USER
     */
    public String getCsysMenuAuthCreateUser() {
        return csysMenuAuthCreateUser;
    }

    /**
     * @param csysMenuAuthCreateUser
     */
    public void setCsysMenuAuthCreateUser(String csysMenuAuthCreateUser) {
        this.csysMenuAuthCreateUser = csysMenuAuthCreateUser;
    }

    /**
     * @return CSYS_MENU_AUTH_MODIFY_TIME
     */
    public Date getCsysMenuAuthModifyTime() {
        return csysMenuAuthModifyTime;
    }

    /**
     * @param csysMenuAuthModifyTime
     */
    public void setCsysMenuAuthModifyTime(Date csysMenuAuthModifyTime) {
        this.csysMenuAuthModifyTime = csysMenuAuthModifyTime;
    }

    /**
     * @return CSYS_MENU_AUTH_MODIFY_USER
     */
    public String getCsysMenuAuthModifyUser() {
        return csysMenuAuthModifyUser;
    }

    /**
     * @param csysMenuAuthModifyUser
     */
    public void setCsysMenuAuthModifyUser(String csysMenuAuthModifyUser) {
        this.csysMenuAuthModifyUser = csysMenuAuthModifyUser;
    }

    /**
     * @return CSYS_MENU_AUTH_IS_DELETE
     */
    public String getCsysMenuAuthIsDelete() {
        return csysMenuAuthIsDelete;
    }

    /**
     * @param csysMenuAuthIsDelete
     */
    public void setCsysMenuAuthIsDelete(String csysMenuAuthIsDelete) {
        this.csysMenuAuthIsDelete = csysMenuAuthIsDelete;
    }

    /**
     * @return CSYS_MENU_AUTH_TIME
     */
    public Date getCsysMenuAuthTime() {
        return csysMenuAuthTime;
    }

    /**
     * @param csysMenuAuthTime
     */
    public void setCsysMenuAuthTime(Date csysMenuAuthTime) {
        this.csysMenuAuthTime = csysMenuAuthTime;
    }

    /**
     * @return CSYS_MENU_AUTH_DATE
     */
    public Date getCsysMenuAuthDate() {
        return csysMenuAuthDate;
    }

    /**
     * @param csysMenuAuthDate
     */
    public void setCsysMenuAuthDate(Date csysMenuAuthDate) {
        this.csysMenuAuthDate = csysMenuAuthDate;
    }

    /**
     * @return CSYS_MENU_AUTH_HASCHILD
     */
    public String getCsysMenuAuthHaschild() {
        return csysMenuAuthHaschild;
    }

    /**
     * @param csysMenuAuthHaschild
     */
    public void setCsysMenuAuthHaschild(String csysMenuAuthHaschild) {
        this.csysMenuAuthHaschild = csysMenuAuthHaschild;
    }
}