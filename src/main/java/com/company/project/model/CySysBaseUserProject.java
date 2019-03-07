package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_base_user_project")
public class CySysBaseUserProject {
    /**
     * 用户项目表
     */
    @Id
    @Column(name = "cy_sys_base_user_project_id")
    private String cySysBaseUserProjectId;

    /**
     * 用户编号
     */
    @Column(name = "cy_sys_base_user_id")
    private String cySysBaseUserId;

    /**
     * 用户名称
     */
    @Column(name = "cy_sys_base_user_name")
    private String cySysBaseUserName;

    /**
     * 项目编号
     */
    @Column(name = "cy_sys_project_id")
    private String cySysProjectId;

    /**
     * 项目名称
     */
    @Column(name = "cy_sys_project_name")
    private String cySysProjectName;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_base_user_project_create_time")
    private Date cySysBaseUserProjectCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_base_user_project_create_user")
    private String cySysBaseUserProjectCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_base_user_project_modify_time")
    private Date cySysBaseUserProjectModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_base_user_project_modify_user")
    private String cySysBaseUserProjectModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_base_user_project_is_delete")
    private String cySysBaseUserProjectIsDelete;

    /**
     * 获取用户项目表
     *
     * @return cy_sys_base_user_project_id - 用户项目表
     */
    public String getCySysBaseUserProjectId() {
        return cySysBaseUserProjectId;
    }

    /**
     * 设置用户项目表
     *
     * @param cySysBaseUserProjectId 用户项目表
     */
    public void setCySysBaseUserProjectId(String cySysBaseUserProjectId) {
        this.cySysBaseUserProjectId = cySysBaseUserProjectId;
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
     * 获取用户名称
     *
     * @return cy_sys_base_user_name - 用户名称
     */
    public String getCySysBaseUserName() {
        return cySysBaseUserName;
    }

    /**
     * 设置用户名称
     *
     * @param cySysBaseUserName 用户名称
     */
    public void setCySysBaseUserName(String cySysBaseUserName) {
        this.cySysBaseUserName = cySysBaseUserName;
    }

    /**
     * 获取项目编号
     *
     * @return cy_sys_project_id - 项目编号
     */
    public String getCySysProjectId() {
        return cySysProjectId;
    }

    /**
     * 设置项目编号
     *
     * @param cySysProjectId 项目编号
     */
    public void setCySysProjectId(String cySysProjectId) {
        this.cySysProjectId = cySysProjectId;
    }

    /**
     * 获取项目名称
     *
     * @return cy_sys_project_name - 项目名称
     */
    public String getCySysProjectName() {
        return cySysProjectName;
    }

    /**
     * 设置项目名称
     *
     * @param cySysProjectName 项目名称
     */
    public void setCySysProjectName(String cySysProjectName) {
        this.cySysProjectName = cySysProjectName;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_base_user_project_create_time - 创建时间
     */
    public Date getCySysBaseUserProjectCreateTime() {
        return cySysBaseUserProjectCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBaseUserProjectCreateTime 创建时间
     */
    public void setCySysBaseUserProjectCreateTime(Date cySysBaseUserProjectCreateTime) {
        this.cySysBaseUserProjectCreateTime = cySysBaseUserProjectCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_base_user_project_create_user - 创建人
     */
    public String getCySysBaseUserProjectCreateUser() {
        return cySysBaseUserProjectCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBaseUserProjectCreateUser 创建人
     */
    public void setCySysBaseUserProjectCreateUser(String cySysBaseUserProjectCreateUser) {
        this.cySysBaseUserProjectCreateUser = cySysBaseUserProjectCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_base_user_project_modify_time - 更新时间
     */
    public Date getCySysBaseUserProjectModifyTime() {
        return cySysBaseUserProjectModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBaseUserProjectModifyTime 更新时间
     */
    public void setCySysBaseUserProjectModifyTime(Date cySysBaseUserProjectModifyTime) {
        this.cySysBaseUserProjectModifyTime = cySysBaseUserProjectModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_base_user_project_modify_user - 更新人
     */
    public String getCySysBaseUserProjectModifyUser() {
        return cySysBaseUserProjectModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBaseUserProjectModifyUser 更新人
     */
    public void setCySysBaseUserProjectModifyUser(String cySysBaseUserProjectModifyUser) {
        this.cySysBaseUserProjectModifyUser = cySysBaseUserProjectModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_base_user_project_is_delete - 是否删除
     */
    public String getCySysBaseUserProjectIsDelete() {
        return cySysBaseUserProjectIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBaseUserProjectIsDelete 是否删除
     */
    public void setCySysBaseUserProjectIsDelete(String cySysBaseUserProjectIsDelete) {
        this.cySysBaseUserProjectIsDelete = cySysBaseUserProjectIsDelete;
    }
}