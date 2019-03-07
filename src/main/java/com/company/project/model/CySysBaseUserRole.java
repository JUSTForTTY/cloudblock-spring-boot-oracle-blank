package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_base_user_role")
public class CySysBaseUserRole {
    /**
     * 用户角色编号
     */
    @Id
    @Column(name = "cy_sys_base_user_role_id")
    private String cySysBaseUserRoleId;

    /**
     * 用户编号
     */
    @Column(name = "cy_sys_base_user_id")
    private String cySysBaseUserId;

    /**
     * 角色编号
     */
    @Column(name = "cy_sys_role_id")
    private String cySysRoleId;

    /**
     * 部门编号
     */
    @Column(name = "cy_sys_department_id")
    private String cySysDepartmentId;

    /**
     * 是否为当前运行角色
     */
    @Column(name = "cy_sys_base_user_role_is_runtime")
    private String cySysBaseUserRoleIsRuntime;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_base_user_role_create_time")
    private Date cySysBaseUserRoleCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_base_user_role_create_user")
    private String cySysBaseUserRoleCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_base_user_role_modify_time")
    private Date cySysBaseUserRoleModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_base_user_role_modify_user")
    private String cySysBaseUserRoleModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_base_user_role_is_delete")
    private String cySysBaseUserRoleIsDelete;

    /**
     * 获取用户角色编号
     *
     * @return cy_sys_base_user_role_id - 用户角色编号
     */
    public String getCySysBaseUserRoleId() {
        return cySysBaseUserRoleId;
    }

    /**
     * 设置用户角色编号
     *
     * @param cySysBaseUserRoleId 用户角色编号
     */
    public void setCySysBaseUserRoleId(String cySysBaseUserRoleId) {
        this.cySysBaseUserRoleId = cySysBaseUserRoleId;
    }

    /**
     * 获取用户编号
     *
     * @return cy_sys_base_user_id - 用户编号
     */
    public String getCySysBaseUserId() {
        return cySysBaseUserId;
    }

    /**
     * 设置用户编号
     *
     * @param cySysBaseUserId 用户编号
     */
    public void setCySysBaseUserId(String cySysBaseUserId) {
        this.cySysBaseUserId = cySysBaseUserId;
    }

    /**
     * 获取角色编号
     *
     * @return cy_sys_role_id - 角色编号
     */
    public String getCySysRoleId() {
        return cySysRoleId;
    }

    /**
     * 设置角色编号
     *
     * @param cySysRoleId 角色编号
     */
    public void setCySysRoleId(String cySysRoleId) {
        this.cySysRoleId = cySysRoleId;
    }

    /**
     * 获取部门编号
     *
     * @return cy_sys_department_id - 部门编号
     */
    public String getCySysDepartmentId() {
        return cySysDepartmentId;
    }

    /**
     * 设置部门编号
     *
     * @param cySysDepartmentId 部门编号
     */
    public void setCySysDepartmentId(String cySysDepartmentId) {
        this.cySysDepartmentId = cySysDepartmentId;
    }

    /**
     * 获取是否为当前运行角色
     *
     * @return cy_sys_base_user_role_is_runtime - 是否为当前运行角色
     */
    public String getCySysBaseUserRoleIsRuntime() {
        return cySysBaseUserRoleIsRuntime;
    }

    /**
     * 设置是否为当前运行角色
     *
     * @param cySysBaseUserRoleIsRuntime 是否为当前运行角色
     */
    public void setCySysBaseUserRoleIsRuntime(String cySysBaseUserRoleIsRuntime) {
        this.cySysBaseUserRoleIsRuntime = cySysBaseUserRoleIsRuntime;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_base_user_role_create_time - 创建时间
     */
    public Date getCySysBaseUserRoleCreateTime() {
        return cySysBaseUserRoleCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBaseUserRoleCreateTime 创建时间
     */
    public void setCySysBaseUserRoleCreateTime(Date cySysBaseUserRoleCreateTime) {
        this.cySysBaseUserRoleCreateTime = cySysBaseUserRoleCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_base_user_role_create_user - 创建人
     */
    public String getCySysBaseUserRoleCreateUser() {
        return cySysBaseUserRoleCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBaseUserRoleCreateUser 创建人
     */
    public void setCySysBaseUserRoleCreateUser(String cySysBaseUserRoleCreateUser) {
        this.cySysBaseUserRoleCreateUser = cySysBaseUserRoleCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_base_user_role_modify_time - 更新时间
     */
    public Date getCySysBaseUserRoleModifyTime() {
        return cySysBaseUserRoleModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBaseUserRoleModifyTime 更新时间
     */
    public void setCySysBaseUserRoleModifyTime(Date cySysBaseUserRoleModifyTime) {
        this.cySysBaseUserRoleModifyTime = cySysBaseUserRoleModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_base_user_role_modify_user - 更新人
     */
    public String getCySysBaseUserRoleModifyUser() {
        return cySysBaseUserRoleModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBaseUserRoleModifyUser 更新人
     */
    public void setCySysBaseUserRoleModifyUser(String cySysBaseUserRoleModifyUser) {
        this.cySysBaseUserRoleModifyUser = cySysBaseUserRoleModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_base_user_role_is_delete - 是否删除
     */
    public String getCySysBaseUserRoleIsDelete() {
        return cySysBaseUserRoleIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBaseUserRoleIsDelete 是否删除
     */
    public void setCySysBaseUserRoleIsDelete(String cySysBaseUserRoleIsDelete) {
        this.cySysBaseUserRoleIsDelete = cySysBaseUserRoleIsDelete;
    }
}