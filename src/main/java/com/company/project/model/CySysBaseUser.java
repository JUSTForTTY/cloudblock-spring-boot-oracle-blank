package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_base_user")
public class CySysBaseUser {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "cy_sys_base_user_id")
    private String cySysBaseUserId;

    /**
     * 用户名
     */
    @Column(name = "cy_sys_base_user_username")
    private String cySysBaseUserUsername;

    /**
     * 名称
     */
    @Column(name = "cy_sys_base_user_name")
    private String cySysBaseUserName;

    /**
     * 密码
     */
    @Column(name = "cy_sys_base_user_password")
    private String cySysBaseUserPassword;

    /**
     * 手机号
     */
    @Column(name = "cy_sys_base_user_mobile")
    private String cySysBaseUserMobile;

    /**
     * 授权码
     */
    @Column(name = "cy_sys_base_user_access_token")
    private String cySysBaseUserAccessToken;

    /**
     * 刷新授权码
     */
    @Column(name = "cy_sys_base_user_refresh_token")
    private String cySysBaseUserRefreshToken;

    /**
     * 体力值
     */
    @Column(name = "cy_sys_base_user_hp")
    private Integer cySysBaseUserHp;

    /**
     * 真实姓名
     */
    @Column(name = "cy_sys_base_user_realname")
    private String cySysBaseUserRealname;

    /**
     * 员工号
     */
    @Column(name = "cy_sys_base_user_employee_number")
    private String cySysBaseUserEmployeeNumber;

    /**
     * 性别
     */
    @Column(name = "cy_sys_base_user_gender")
    private String cySysBaseUserGender;

    /**
     * 学历
     */
    @Column(name = "cy_sys_base_user_education")
    private String cySysBaseUserEducation;

    /**
     * 备注
     */
    @Column(name = "cy_sys_base_user_meno")
    private String cySysBaseUserMeno;

    /**
     * 二维码
     */
    @Column(name = "cy_sys_base_user_ewCode")
    private String cySysBaseUserEwcode;

    /**
     * 头像
     */
    @Column(name = "cy_sys_base_user_headimage")
    private String cySysBaseUserHeadimage;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_base_user_create_time")
    private Date cySysBaseUserCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_base_user_create_user")
    private String cySysBaseUserCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_base_user_modify_time")
    private Date cySysBaseUserModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_base_user_modify_user")
    private String cySysBaseUserModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_base_user_is_delete")
    private String cySysBaseUserIsDelete;

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
     * 获取用户名
     *
     * @return cy_sys_base_user_username - 用户名
     */
    public String getCySysBaseUserUsername() {
        return cySysBaseUserUsername;
    }

    /**
     * 设置用户名
     *
     * @param cySysBaseUserUsername 用户名
     */
    public void setCySysBaseUserUsername(String cySysBaseUserUsername) {
        this.cySysBaseUserUsername = cySysBaseUserUsername;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_base_user_name - 名称
     */
    public String getCySysBaseUserName() {
        return cySysBaseUserName;
    }

    /**
     * 设置名称
     *
     * @param cySysBaseUserName 名称
     */
    public void setCySysBaseUserName(String cySysBaseUserName) {
        this.cySysBaseUserName = cySysBaseUserName;
    }

    /**
     * 获取密码
     *
     * @return cy_sys_base_user_password - 密码
     */
    public String getCySysBaseUserPassword() {
        return cySysBaseUserPassword;
    }

    /**
     * 设置密码
     *
     * @param cySysBaseUserPassword 密码
     */
    public void setCySysBaseUserPassword(String cySysBaseUserPassword) {
        this.cySysBaseUserPassword = cySysBaseUserPassword;
    }

    /**
     * 获取手机号
     *
     * @return cy_sys_base_user_mobile - 手机号
     */
    public String getCySysBaseUserMobile() {
        return cySysBaseUserMobile;
    }

    /**
     * 设置手机号
     *
     * @param cySysBaseUserMobile 手机号
     */
    public void setCySysBaseUserMobile(String cySysBaseUserMobile) {
        this.cySysBaseUserMobile = cySysBaseUserMobile;
    }

    /**
     * 获取授权码
     *
     * @return cy_sys_base_user_access_token - 授权码
     */
    public String getCySysBaseUserAccessToken() {
        return cySysBaseUserAccessToken;
    }

    /**
     * 设置授权码
     *
     * @param cySysBaseUserAccessToken 授权码
     */
    public void setCySysBaseUserAccessToken(String cySysBaseUserAccessToken) {
        this.cySysBaseUserAccessToken = cySysBaseUserAccessToken;
    }

    /**
     * 获取刷新授权码
     *
     * @return cy_sys_base_user_refresh_token - 刷新授权码
     */
    public String getCySysBaseUserRefreshToken() {
        return cySysBaseUserRefreshToken;
    }

    /**
     * 设置刷新授权码
     *
     * @param cySysBaseUserRefreshToken 刷新授权码
     */
    public void setCySysBaseUserRefreshToken(String cySysBaseUserRefreshToken) {
        this.cySysBaseUserRefreshToken = cySysBaseUserRefreshToken;
    }

    /**
     * 获取体力值
     *
     * @return cy_sys_base_user_hp - 体力值
     */
    public Integer getCySysBaseUserHp() {
        return cySysBaseUserHp;
    }

    /**
     * 设置体力值
     *
     * @param cySysBaseUserHp 体力值
     */
    public void setCySysBaseUserHp(Integer cySysBaseUserHp) {
        this.cySysBaseUserHp = cySysBaseUserHp;
    }

    /**
     * 获取真实姓名
     *
     * @return cy_sys_base_user_realname - 真实姓名
     */
    public String getCySysBaseUserRealname() {
        return cySysBaseUserRealname;
    }

    /**
     * 设置真实姓名
     *
     * @param cySysBaseUserRealname 真实姓名
     */
    public void setCySysBaseUserRealname(String cySysBaseUserRealname) {
        this.cySysBaseUserRealname = cySysBaseUserRealname;
    }

    /**
     * 获取员工号
     *
     * @return cy_sys_base_user_employee_number - 员工号
     */
    public String getCySysBaseUserEmployeeNumber() {
        return cySysBaseUserEmployeeNumber;
    }

    /**
     * 设置员工号
     *
     * @param cySysBaseUserEmployeeNumber 员工号
     */
    public void setCySysBaseUserEmployeeNumber(String cySysBaseUserEmployeeNumber) {
        this.cySysBaseUserEmployeeNumber = cySysBaseUserEmployeeNumber;
    }

    /**
     * 获取性别
     *
     * @return cy_sys_base_user_gender - 性别
     */
    public String getCySysBaseUserGender() {
        return cySysBaseUserGender;
    }

    /**
     * 设置性别
     *
     * @param cySysBaseUserGender 性别
     */
    public void setCySysBaseUserGender(String cySysBaseUserGender) {
        this.cySysBaseUserGender = cySysBaseUserGender;
    }

    /**
     * 获取学历
     *
     * @return cy_sys_base_user_education - 学历
     */
    public String getCySysBaseUserEducation() {
        return cySysBaseUserEducation;
    }

    /**
     * 设置学历
     *
     * @param cySysBaseUserEducation 学历
     */
    public void setCySysBaseUserEducation(String cySysBaseUserEducation) {
        this.cySysBaseUserEducation = cySysBaseUserEducation;
    }

    /**
     * 获取备注
     *
     * @return cy_sys_base_user_meno - 备注
     */
    public String getCySysBaseUserMeno() {
        return cySysBaseUserMeno;
    }

    /**
     * 设置备注
     *
     * @param cySysBaseUserMeno 备注
     */
    public void setCySysBaseUserMeno(String cySysBaseUserMeno) {
        this.cySysBaseUserMeno = cySysBaseUserMeno;
    }

    /**
     * 获取二维码
     *
     * @return cy_sys_base_user_ewCode - 二维码
     */
    public String getCySysBaseUserEwcode() {
        return cySysBaseUserEwcode;
    }

    /**
     * 设置二维码
     *
     * @param cySysBaseUserEwcode 二维码
     */
    public void setCySysBaseUserEwcode(String cySysBaseUserEwcode) {
        this.cySysBaseUserEwcode = cySysBaseUserEwcode;
    }

    /**
     * 获取头像
     *
     * @return cy_sys_base_user_headimage - 头像
     */
    public String getCySysBaseUserHeadimage() {
        return cySysBaseUserHeadimage;
    }

    /**
     * 设置头像
     *
     * @param cySysBaseUserHeadimage 头像
     */
    public void setCySysBaseUserHeadimage(String cySysBaseUserHeadimage) {
        this.cySysBaseUserHeadimage = cySysBaseUserHeadimage;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_base_user_create_time - 创建时间
     */
    public Date getCySysBaseUserCreateTime() {
        return cySysBaseUserCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBaseUserCreateTime 创建时间
     */
    public void setCySysBaseUserCreateTime(Date cySysBaseUserCreateTime) {
        this.cySysBaseUserCreateTime = cySysBaseUserCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_base_user_create_user - 创建人
     */
    public String getCySysBaseUserCreateUser() {
        return cySysBaseUserCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBaseUserCreateUser 创建人
     */
    public void setCySysBaseUserCreateUser(String cySysBaseUserCreateUser) {
        this.cySysBaseUserCreateUser = cySysBaseUserCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_base_user_modify_time - 更新时间
     */
    public Date getCySysBaseUserModifyTime() {
        return cySysBaseUserModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBaseUserModifyTime 更新时间
     */
    public void setCySysBaseUserModifyTime(Date cySysBaseUserModifyTime) {
        this.cySysBaseUserModifyTime = cySysBaseUserModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_base_user_modify_user - 更新人
     */
    public String getCySysBaseUserModifyUser() {
        return cySysBaseUserModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBaseUserModifyUser 更新人
     */
    public void setCySysBaseUserModifyUser(String cySysBaseUserModifyUser) {
        this.cySysBaseUserModifyUser = cySysBaseUserModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_base_user_is_delete - 是否删除
     */
    public String getCySysBaseUserIsDelete() {
        return cySysBaseUserIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBaseUserIsDelete 是否删除
     */
    public void setCySysBaseUserIsDelete(String cySysBaseUserIsDelete) {
        this.cySysBaseUserIsDelete = cySysBaseUserIsDelete;
    }
}