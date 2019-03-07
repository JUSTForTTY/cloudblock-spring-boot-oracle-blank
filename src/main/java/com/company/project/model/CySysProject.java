package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_project")
public class CySysProject {
    /**
     * 项目编号
     */
    @Id
    @Column(name = "cy_sys_project_id")
    private String cySysProjectId;

    /**
     * 项目代号
     */
    @Column(name = "cy_sys_project_code")
    private String cySysProjectCode;

    /**
     * 项目名称
     */
    @Column(name = "cy_sys_project_name")
    private String cySysProjectName;

    /**
     * 项目图标
     */
    @Column(name = "cy_sys_project_icon")
    private String cySysProjectIcon;

    /**
     * 是否原创 0：否 1：是
     */
    @Column(name = "cy_sys_project_is_original")
    private String cySysProjectIsOriginal;

    /**
     * 项目数据库地址
     */
    @Column(name = "cy_sys_project_db_url")
    private String cySysProjectDbUrl;

    /**
     * 数据库用户名
     */
    @Column(name = "cy_sys_project_db_username")
    private String cySysProjectDbUsername;

    /**
     * 数据库密码
     */
    @Column(name = "cy_sys_project_db_password")
    private String cySysProjectDbPassword;

    /**
     * 服务器地址
     */
    @Column(name = "cy_sys_project_server_url")
    private String cySysProjectServerUrl;

    /**
     * 域名地址
     */
    @Column(name = "cy_sys_project_server_domain_name")
    private String cySysProjectServerDomainName;

    /**
     * 服务器用户名
     */
    @Column(name = "cy_sys_project_server_username")
    private String cySysProjectServerUsername;

    /**
     * 服务器密码
     */
    @Column(name = "cy_sys_project_server_password")
    private String cySysProjectServerPassword;

    /**
     * 服务器盘符
     */
    @Column(name = "cy_sys_project_server_code")
    private String cySysProjectServerCode;

    /**
     * 前端项目所在磁盘位置
     */
    @Column(name = "cy_sys_project_front_positon")
    private String cySysProjectFrontPositon;

    /**
     * 后端项目所在磁盘位置
     */
    @Column(name = "cy_sys_project_back_positon")
    private String cySysProjectBackPositon;

    /**
     * 项目发布服务器所在磁盘位置
     */
    @Column(name = "cy_sys_project_publish_server_position")
    private String cySysProjectPublishServerPosition;

    /**
     * 当前项目版本号（git）
     */
    @Column(name = "cy_sys_project_git_version")
    private String cySysProjectGitVersion;

    /**
     * 前端项目名称
     */
    @Column(name = "cy_sys_project_git_front_name")
    private String cySysProjectGitFrontName;

    /**
     * 后端项目名称
     */
    @Column(name = "cy_sys_project_git_back_name")
    private String cySysProjectGitBackName;

    /**
     * 前端git路径（https地址）
     */
    @Column(name = "cy_sys_project_git_front_url")
    private String cySysProjectGitFrontUrl;

    /**
     * 后端git路径（https地址）
     */
    @Column(name = "cy_sys_project_git_back_url")
    private String cySysProjectGitBackUrl;

    /**
     * 发布次数
     */
    @Column(name = "cy_sys_project_publish_number")
    private Integer cySysProjectPublishNumber;

    /**
     * 发布成功率
     */
    @Column(name = "cy_sys_project_publish_pass_percent")
    private BigDecimal cySysProjectPublishPassPercent;

    /**
     * 最新发布状态（0：失败，1：成功）
     */
    @Column(name = "cy_sys_project_publish_last_status")
    private String cySysProjectPublishLastStatus;

    /**
     * 最新发布时间
     */
    @Column(name = "cy_sys_project_publish_last_time")
    private Date cySysProjectPublishLastTime;

    /**
     * 项目发布地址（jenkins地址）
     */
    @Column(name = "cy_sys_project_jenkins_url")
    private String cySysProjectJenkinsUrl;

    /**
     * 项目发布用户名（jenkins用户名）
     */
    @Column(name = "cy_sys_project_jenkins_username")
    private String cySysProjectJenkinsUsername;

    /**
     * 项目发布密码（jenkins密码）
     */
    @Column(name = "cy_sys_project_jenkins_password")
    private String cySysProjectJenkinsPassword;

    /**
     * 项目描述
     */
    @Column(name = "cy_sys_project_desc")
    private String cySysProjectDesc;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_project_create_time")
    private Date cySysProjectCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_project_create_user")
    private String cySysProjectCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_project_modify_time")
    private Date cySysProjectModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_project_modify_user")
    private String cySysProjectModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_project_is_delete")
    private String cySysProjectIsDelete;

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
     * 获取项目代号
     *
     * @return cy_sys_project_code - 项目代号
     */
    public String getCySysProjectCode() {
        return cySysProjectCode;
    }

    /**
     * 设置项目代号
     *
     * @param cySysProjectCode 项目代号
     */
    public void setCySysProjectCode(String cySysProjectCode) {
        this.cySysProjectCode = cySysProjectCode;
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
     * 获取项目图标
     *
     * @return cy_sys_project_icon - 项目图标
     */
    public String getCySysProjectIcon() {
        return cySysProjectIcon;
    }

    /**
     * 设置项目图标
     *
     * @param cySysProjectIcon 项目图标
     */
    public void setCySysProjectIcon(String cySysProjectIcon) {
        this.cySysProjectIcon = cySysProjectIcon;
    }

    /**
     * 获取是否原创 0：否 1：是
     *
     * @return cy_sys_project_is_original - 是否原创 0：否 1：是
     */
    public String getCySysProjectIsOriginal() {
        return cySysProjectIsOriginal;
    }

    /**
     * 设置是否原创 0：否 1：是
     *
     * @param cySysProjectIsOriginal 是否原创 0：否 1：是
     */
    public void setCySysProjectIsOriginal(String cySysProjectIsOriginal) {
        this.cySysProjectIsOriginal = cySysProjectIsOriginal;
    }

    /**
     * 获取项目数据库地址
     *
     * @return cy_sys_project_db_url - 项目数据库地址
     */
    public String getCySysProjectDbUrl() {
        return cySysProjectDbUrl;
    }

    /**
     * 设置项目数据库地址
     *
     * @param cySysProjectDbUrl 项目数据库地址
     */
    public void setCySysProjectDbUrl(String cySysProjectDbUrl) {
        this.cySysProjectDbUrl = cySysProjectDbUrl;
    }

    /**
     * 获取数据库用户名
     *
     * @return cy_sys_project_db_username - 数据库用户名
     */
    public String getCySysProjectDbUsername() {
        return cySysProjectDbUsername;
    }

    /**
     * 设置数据库用户名
     *
     * @param cySysProjectDbUsername 数据库用户名
     */
    public void setCySysProjectDbUsername(String cySysProjectDbUsername) {
        this.cySysProjectDbUsername = cySysProjectDbUsername;
    }

    /**
     * 获取数据库密码
     *
     * @return cy_sys_project_db_password - 数据库密码
     */
    public String getCySysProjectDbPassword() {
        return cySysProjectDbPassword;
    }

    /**
     * 设置数据库密码
     *
     * @param cySysProjectDbPassword 数据库密码
     */
    public void setCySysProjectDbPassword(String cySysProjectDbPassword) {
        this.cySysProjectDbPassword = cySysProjectDbPassword;
    }

    /**
     * 获取服务器地址
     *
     * @return cy_sys_project_server_url - 服务器地址
     */
    public String getCySysProjectServerUrl() {
        return cySysProjectServerUrl;
    }

    /**
     * 设置服务器地址
     *
     * @param cySysProjectServerUrl 服务器地址
     */
    public void setCySysProjectServerUrl(String cySysProjectServerUrl) {
        this.cySysProjectServerUrl = cySysProjectServerUrl;
    }

    /**
     * 获取域名地址
     *
     * @return cy_sys_project_server_domain_name - 域名地址
     */
    public String getCySysProjectServerDomainName() {
        return cySysProjectServerDomainName;
    }

    /**
     * 设置域名地址
     *
     * @param cySysProjectServerDomainName 域名地址
     */
    public void setCySysProjectServerDomainName(String cySysProjectServerDomainName) {
        this.cySysProjectServerDomainName = cySysProjectServerDomainName;
    }

    /**
     * 获取服务器用户名
     *
     * @return cy_sys_project_server_username - 服务器用户名
     */
    public String getCySysProjectServerUsername() {
        return cySysProjectServerUsername;
    }

    /**
     * 设置服务器用户名
     *
     * @param cySysProjectServerUsername 服务器用户名
     */
    public void setCySysProjectServerUsername(String cySysProjectServerUsername) {
        this.cySysProjectServerUsername = cySysProjectServerUsername;
    }

    /**
     * 获取服务器密码
     *
     * @return cy_sys_project_server_password - 服务器密码
     */
    public String getCySysProjectServerPassword() {
        return cySysProjectServerPassword;
    }

    /**
     * 设置服务器密码
     *
     * @param cySysProjectServerPassword 服务器密码
     */
    public void setCySysProjectServerPassword(String cySysProjectServerPassword) {
        this.cySysProjectServerPassword = cySysProjectServerPassword;
    }

    /**
     * 获取服务器盘符
     *
     * @return cy_sys_project_server_code - 服务器盘符
     */
    public String getCySysProjectServerCode() {
        return cySysProjectServerCode;
    }

    /**
     * 设置服务器盘符
     *
     * @param cySysProjectServerCode 服务器盘符
     */
    public void setCySysProjectServerCode(String cySysProjectServerCode) {
        this.cySysProjectServerCode = cySysProjectServerCode;
    }

    /**
     * 获取前端项目所在磁盘位置
     *
     * @return cy_sys_project_front_positon - 前端项目所在磁盘位置
     */
    public String getCySysProjectFrontPositon() {
        return cySysProjectFrontPositon;
    }

    /**
     * 设置前端项目所在磁盘位置
     *
     * @param cySysProjectFrontPositon 前端项目所在磁盘位置
     */
    public void setCySysProjectFrontPositon(String cySysProjectFrontPositon) {
        this.cySysProjectFrontPositon = cySysProjectFrontPositon;
    }

    /**
     * 获取后端项目所在磁盘位置
     *
     * @return cy_sys_project_back_positon - 后端项目所在磁盘位置
     */
    public String getCySysProjectBackPositon() {
        return cySysProjectBackPositon;
    }

    /**
     * 设置后端项目所在磁盘位置
     *
     * @param cySysProjectBackPositon 后端项目所在磁盘位置
     */
    public void setCySysProjectBackPositon(String cySysProjectBackPositon) {
        this.cySysProjectBackPositon = cySysProjectBackPositon;
    }

    /**
     * 获取项目发布服务器所在磁盘位置
     *
     * @return cy_sys_project_publish_server_position - 项目发布服务器所在磁盘位置
     */
    public String getCySysProjectPublishServerPosition() {
        return cySysProjectPublishServerPosition;
    }

    /**
     * 设置项目发布服务器所在磁盘位置
     *
     * @param cySysProjectPublishServerPosition 项目发布服务器所在磁盘位置
     */
    public void setCySysProjectPublishServerPosition(String cySysProjectPublishServerPosition) {
        this.cySysProjectPublishServerPosition = cySysProjectPublishServerPosition;
    }

    /**
     * 获取当前项目版本号（git）
     *
     * @return cy_sys_project_git_version - 当前项目版本号（git）
     */
    public String getCySysProjectGitVersion() {
        return cySysProjectGitVersion;
    }

    /**
     * 设置当前项目版本号（git）
     *
     * @param cySysProjectGitVersion 当前项目版本号（git）
     */
    public void setCySysProjectGitVersion(String cySysProjectGitVersion) {
        this.cySysProjectGitVersion = cySysProjectGitVersion;
    }

    /**
     * 获取前端项目名称
     *
     * @return cy_sys_project_git_front_name - 前端项目名称
     */
    public String getCySysProjectGitFrontName() {
        return cySysProjectGitFrontName;
    }

    /**
     * 设置前端项目名称
     *
     * @param cySysProjectGitFrontName 前端项目名称
     */
    public void setCySysProjectGitFrontName(String cySysProjectGitFrontName) {
        this.cySysProjectGitFrontName = cySysProjectGitFrontName;
    }

    /**
     * 获取后端项目名称
     *
     * @return cy_sys_project_git_back_name - 后端项目名称
     */
    public String getCySysProjectGitBackName() {
        return cySysProjectGitBackName;
    }

    /**
     * 设置后端项目名称
     *
     * @param cySysProjectGitBackName 后端项目名称
     */
    public void setCySysProjectGitBackName(String cySysProjectGitBackName) {
        this.cySysProjectGitBackName = cySysProjectGitBackName;
    }

    /**
     * 获取前端git路径（https地址）
     *
     * @return cy_sys_project_git_front_url - 前端git路径（https地址）
     */
    public String getCySysProjectGitFrontUrl() {
        return cySysProjectGitFrontUrl;
    }

    /**
     * 设置前端git路径（https地址）
     *
     * @param cySysProjectGitFrontUrl 前端git路径（https地址）
     */
    public void setCySysProjectGitFrontUrl(String cySysProjectGitFrontUrl) {
        this.cySysProjectGitFrontUrl = cySysProjectGitFrontUrl;
    }

    /**
     * 获取后端git路径（https地址）
     *
     * @return cy_sys_project_git_back_url - 后端git路径（https地址）
     */
    public String getCySysProjectGitBackUrl() {
        return cySysProjectGitBackUrl;
    }

    /**
     * 设置后端git路径（https地址）
     *
     * @param cySysProjectGitBackUrl 后端git路径（https地址）
     */
    public void setCySysProjectGitBackUrl(String cySysProjectGitBackUrl) {
        this.cySysProjectGitBackUrl = cySysProjectGitBackUrl;
    }

    /**
     * 获取发布次数
     *
     * @return cy_sys_project_publish_number - 发布次数
     */
    public Integer getCySysProjectPublishNumber() {
        return cySysProjectPublishNumber;
    }

    /**
     * 设置发布次数
     *
     * @param cySysProjectPublishNumber 发布次数
     */
    public void setCySysProjectPublishNumber(Integer cySysProjectPublishNumber) {
        this.cySysProjectPublishNumber = cySysProjectPublishNumber;
    }

    /**
     * 获取发布成功率
     *
     * @return cy_sys_project_publish_pass_percent - 发布成功率
     */
    public BigDecimal getCySysProjectPublishPassPercent() {
        return cySysProjectPublishPassPercent;
    }

    /**
     * 设置发布成功率
     *
     * @param cySysProjectPublishPassPercent 发布成功率
     */
    public void setCySysProjectPublishPassPercent(BigDecimal cySysProjectPublishPassPercent) {
        this.cySysProjectPublishPassPercent = cySysProjectPublishPassPercent;
    }

    /**
     * 获取最新发布状态（0：失败，1：成功）
     *
     * @return cy_sys_project_publish_last_status - 最新发布状态（0：失败，1：成功）
     */
    public String getCySysProjectPublishLastStatus() {
        return cySysProjectPublishLastStatus;
    }

    /**
     * 设置最新发布状态（0：失败，1：成功）
     *
     * @param cySysProjectPublishLastStatus 最新发布状态（0：失败，1：成功）
     */
    public void setCySysProjectPublishLastStatus(String cySysProjectPublishLastStatus) {
        this.cySysProjectPublishLastStatus = cySysProjectPublishLastStatus;
    }

    /**
     * 获取最新发布时间
     *
     * @return cy_sys_project_publish_last_time - 最新发布时间
     */
    public Date getCySysProjectPublishLastTime() {
        return cySysProjectPublishLastTime;
    }

    /**
     * 设置最新发布时间
     *
     * @param cySysProjectPublishLastTime 最新发布时间
     */
    public void setCySysProjectPublishLastTime(Date cySysProjectPublishLastTime) {
        this.cySysProjectPublishLastTime = cySysProjectPublishLastTime;
    }

    /**
     * 获取项目发布地址（jenkins地址）
     *
     * @return cy_sys_project_jenkins_url - 项目发布地址（jenkins地址）
     */
    public String getCySysProjectJenkinsUrl() {
        return cySysProjectJenkinsUrl;
    }

    /**
     * 设置项目发布地址（jenkins地址）
     *
     * @param cySysProjectJenkinsUrl 项目发布地址（jenkins地址）
     */
    public void setCySysProjectJenkinsUrl(String cySysProjectJenkinsUrl) {
        this.cySysProjectJenkinsUrl = cySysProjectJenkinsUrl;
    }

    /**
     * 获取项目发布用户名（jenkins用户名）
     *
     * @return cy_sys_project_jenkins_username - 项目发布用户名（jenkins用户名）
     */
    public String getCySysProjectJenkinsUsername() {
        return cySysProjectJenkinsUsername;
    }

    /**
     * 设置项目发布用户名（jenkins用户名）
     *
     * @param cySysProjectJenkinsUsername 项目发布用户名（jenkins用户名）
     */
    public void setCySysProjectJenkinsUsername(String cySysProjectJenkinsUsername) {
        this.cySysProjectJenkinsUsername = cySysProjectJenkinsUsername;
    }

    /**
     * 获取项目发布密码（jenkins密码）
     *
     * @return cy_sys_project_jenkins_password - 项目发布密码（jenkins密码）
     */
    public String getCySysProjectJenkinsPassword() {
        return cySysProjectJenkinsPassword;
    }

    /**
     * 设置项目发布密码（jenkins密码）
     *
     * @param cySysProjectJenkinsPassword 项目发布密码（jenkins密码）
     */
    public void setCySysProjectJenkinsPassword(String cySysProjectJenkinsPassword) {
        this.cySysProjectJenkinsPassword = cySysProjectJenkinsPassword;
    }

    /**
     * 获取项目描述
     *
     * @return cy_sys_project_desc - 项目描述
     */
    public String getCySysProjectDesc() {
        return cySysProjectDesc;
    }

    /**
     * 设置项目描述
     *
     * @param cySysProjectDesc 项目描述
     */
    public void setCySysProjectDesc(String cySysProjectDesc) {
        this.cySysProjectDesc = cySysProjectDesc;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_project_create_time - 创建时间
     */
    public Date getCySysProjectCreateTime() {
        return cySysProjectCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysProjectCreateTime 创建时间
     */
    public void setCySysProjectCreateTime(Date cySysProjectCreateTime) {
        this.cySysProjectCreateTime = cySysProjectCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_project_create_user - 创建人
     */
    public String getCySysProjectCreateUser() {
        return cySysProjectCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysProjectCreateUser 创建人
     */
    public void setCySysProjectCreateUser(String cySysProjectCreateUser) {
        this.cySysProjectCreateUser = cySysProjectCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_project_modify_time - 更新时间
     */
    public Date getCySysProjectModifyTime() {
        return cySysProjectModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysProjectModifyTime 更新时间
     */
    public void setCySysProjectModifyTime(Date cySysProjectModifyTime) {
        this.cySysProjectModifyTime = cySysProjectModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_project_modify_user - 更新人
     */
    public String getCySysProjectModifyUser() {
        return cySysProjectModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysProjectModifyUser 更新人
     */
    public void setCySysProjectModifyUser(String cySysProjectModifyUser) {
        this.cySysProjectModifyUser = cySysProjectModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_project_is_delete - 是否删除
     */
    public String getCySysProjectIsDelete() {
        return cySysProjectIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysProjectIsDelete 是否删除
     */
    public void setCySysProjectIsDelete(String cySysProjectIsDelete) {
        this.cySysProjectIsDelete = cySysProjectIsDelete;
    }
}