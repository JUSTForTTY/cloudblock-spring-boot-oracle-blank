package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_project_publish")
public class CySysProjectPublish {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_project_publish_id")
    private String cySysProjectPublishId;

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
     * 项目版本号（git）
     */
    @Column(name = "cy_sys_project_git_version")
    private String cySysProjectGitVersion;

    /**
     * 发布类别（0：在线发布，1：本地发布）
     */
    @Column(name = "cy_sys_project_publish_type")
    private String cySysProjectPublishType;

    /**
     * 在线发布项目地址
     */
    @Column(name = "cy_sys_project_publish_project_url")
    private String cySysProjectPublishProjectUrl;

    /**
     * 在线发布项目服务器地址
     */
    @Column(name = "cy_sys_project_publish_server_url")
    private String cySysProjectPublishServerUrl;

    /**
     * 本地发布项目地址
     */
    @Column(name = "cy_sys_project_publish_local_url")
    private String cySysProjectPublishLocalUrl;

    /**
     * 发布状态（0：成功，1：失败）
     */
    @Column(name = "cy_sys_project_publish_status")
    private String cySysProjectPublishStatus;

    /**
     * 创建时间（发布时间）
     */
    @Column(name = "cy_sys_project_publish_create_time")
    private Date cySysProjectPublishCreateTime;

    /**
     * 创建人（发布人）
     */
    @Column(name = "cy_sys_project_publish_create_user")
    private String cySysProjectPublishCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_project_publish_modify_time")
    private Date cySysProjectPublishModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_project_publish_modify_user")
    private String cySysProjectPublishModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_project_publish_is_delete")
    private String cySysProjectPublishIsDelete;

    /**
     * 获取编号
     *
     * @return cy_sys_project_publish_id - 编号
     */
    public String getCySysProjectPublishId() {
        return cySysProjectPublishId;
    }

    /**
     * 设置编号
     *
     * @param cySysProjectPublishId 编号
     */
    public void setCySysProjectPublishId(String cySysProjectPublishId) {
        this.cySysProjectPublishId = cySysProjectPublishId;
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
     * 获取项目版本号（git）
     *
     * @return cy_sys_project_git_version - 项目版本号（git）
     */
    public String getCySysProjectGitVersion() {
        return cySysProjectGitVersion;
    }

    /**
     * 设置项目版本号（git）
     *
     * @param cySysProjectGitVersion 项目版本号（git）
     */
    public void setCySysProjectGitVersion(String cySysProjectGitVersion) {
        this.cySysProjectGitVersion = cySysProjectGitVersion;
    }

    /**
     * 获取发布类别（0：在线发布，1：本地发布）
     *
     * @return cy_sys_project_publish_type - 发布类别（0：在线发布，1：本地发布）
     */
    public String getCySysProjectPublishType() {
        return cySysProjectPublishType;
    }

    /**
     * 设置发布类别（0：在线发布，1：本地发布）
     *
     * @param cySysProjectPublishType 发布类别（0：在线发布，1：本地发布）
     */
    public void setCySysProjectPublishType(String cySysProjectPublishType) {
        this.cySysProjectPublishType = cySysProjectPublishType;
    }

    /**
     * 获取在线发布项目地址
     *
     * @return cy_sys_project_publish_project_url - 在线发布项目地址
     */
    public String getCySysProjectPublishProjectUrl() {
        return cySysProjectPublishProjectUrl;
    }

    /**
     * 设置在线发布项目地址
     *
     * @param cySysProjectPublishProjectUrl 在线发布项目地址
     */
    public void setCySysProjectPublishProjectUrl(String cySysProjectPublishProjectUrl) {
        this.cySysProjectPublishProjectUrl = cySysProjectPublishProjectUrl;
    }

    /**
     * 获取在线发布项目服务器地址
     *
     * @return cy_sys_project_publish_server_url - 在线发布项目服务器地址
     */
    public String getCySysProjectPublishServerUrl() {
        return cySysProjectPublishServerUrl;
    }

    /**
     * 设置在线发布项目服务器地址
     *
     * @param cySysProjectPublishServerUrl 在线发布项目服务器地址
     */
    public void setCySysProjectPublishServerUrl(String cySysProjectPublishServerUrl) {
        this.cySysProjectPublishServerUrl = cySysProjectPublishServerUrl;
    }

    /**
     * 获取本地发布项目地址
     *
     * @return cy_sys_project_publish_local_url - 本地发布项目地址
     */
    public String getCySysProjectPublishLocalUrl() {
        return cySysProjectPublishLocalUrl;
    }

    /**
     * 设置本地发布项目地址
     *
     * @param cySysProjectPublishLocalUrl 本地发布项目地址
     */
    public void setCySysProjectPublishLocalUrl(String cySysProjectPublishLocalUrl) {
        this.cySysProjectPublishLocalUrl = cySysProjectPublishLocalUrl;
    }

    /**
     * 获取发布状态（0：成功，1：失败）
     *
     * @return cy_sys_project_publish_status - 发布状态（0：成功，1：失败）
     */
    public String getCySysProjectPublishStatus() {
        return cySysProjectPublishStatus;
    }

    /**
     * 设置发布状态（0：成功，1：失败）
     *
     * @param cySysProjectPublishStatus 发布状态（0：成功，1：失败）
     */
    public void setCySysProjectPublishStatus(String cySysProjectPublishStatus) {
        this.cySysProjectPublishStatus = cySysProjectPublishStatus;
    }

    /**
     * 获取创建时间（发布时间）
     *
     * @return cy_sys_project_publish_create_time - 创建时间（发布时间）
     */
    public Date getCySysProjectPublishCreateTime() {
        return cySysProjectPublishCreateTime;
    }

    /**
     * 设置创建时间（发布时间）
     *
     * @param cySysProjectPublishCreateTime 创建时间（发布时间）
     */
    public void setCySysProjectPublishCreateTime(Date cySysProjectPublishCreateTime) {
        this.cySysProjectPublishCreateTime = cySysProjectPublishCreateTime;
    }

    /**
     * 获取创建人（发布人）
     *
     * @return cy_sys_project_publish_create_user - 创建人（发布人）
     */
    public String getCySysProjectPublishCreateUser() {
        return cySysProjectPublishCreateUser;
    }

    /**
     * 设置创建人（发布人）
     *
     * @param cySysProjectPublishCreateUser 创建人（发布人）
     */
    public void setCySysProjectPublishCreateUser(String cySysProjectPublishCreateUser) {
        this.cySysProjectPublishCreateUser = cySysProjectPublishCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_project_publish_modify_time - 更新时间
     */
    public Date getCySysProjectPublishModifyTime() {
        return cySysProjectPublishModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysProjectPublishModifyTime 更新时间
     */
    public void setCySysProjectPublishModifyTime(Date cySysProjectPublishModifyTime) {
        this.cySysProjectPublishModifyTime = cySysProjectPublishModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_project_publish_modify_user - 更新人
     */
    public String getCySysProjectPublishModifyUser() {
        return cySysProjectPublishModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysProjectPublishModifyUser 更新人
     */
    public void setCySysProjectPublishModifyUser(String cySysProjectPublishModifyUser) {
        this.cySysProjectPublishModifyUser = cySysProjectPublishModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_project_publish_is_delete - 是否删除
     */
    public String getCySysProjectPublishIsDelete() {
        return cySysProjectPublishIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysProjectPublishIsDelete 是否删除
     */
    public void setCySysProjectPublishIsDelete(String cySysProjectPublishIsDelete) {
        this.cySysProjectPublishIsDelete = cySysProjectPublishIsDelete;
    }
}