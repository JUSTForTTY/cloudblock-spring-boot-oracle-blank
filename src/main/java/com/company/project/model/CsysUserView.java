package com.company.project.outer.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_USER_VIEW")
public class CsysUserView {
	
    @Column(name = "CSYS_USER_ID")
    private String csysUserId;

    @Column(name = "CSYS_USER_USERNAME")
    private String csysUserUsername;

    @Column(name = "CSYS_USER_PASSWORD")
    private String csysUserPassword;

    @Column(name = "CSYS_USER_OPEN_ID")
    private String csysUserOpenId;

    @Column(name = "CSYS_USER_NICKNAME")
    private String csysUserNickname;

    @Column(name = "CSYS_USER_NAME")
    private String csysUserName;

    @Column(name = "CSYS_USER_ACCOUNT")
    private BigDecimal csysUserAccount;

    @Column(name = "CSYS_USER_LEVEL")
    private String csysUserLevel;

    @Column(name = "CSYS_USER_HP")
    private String csysUserHp;

    @Column(name = "CSYS_USER_ACCESS_TOKEN")
    private String csysUserAccessToken;

    @Column(name = "CSYS_USER_REALNAME")
    private String csysUserRealname;

    @Column(name = "CSYS_USER_NUMBER")
    private String csysUserNumber;

    @Column(name = "CSYS_USER_GENDER")
    private String csysUserGender;

    @Column(name = "CSYS_USER_AGE")
    private Short csysUserAge;

    @Column(name = "CSYS_USER_PHONE")
    private String csysUserPhone;

    @Column(name = "CSYS_USER_MOBILE")
    private String csysUserMobile;

    @Column(name = "CSYS_USER_EMAIL")
    private String csysUserEmail;

    @Column(name = "CSYS_USER_ADDRESS")
    private String csysUserAddress;

    @Column(name = "CSYS_USER_EDUCATION")
    private String csysUserEducation;

    @Column(name = "CSYS_USER_MENO")
    private String csysUserMeno;

    @Column(name = "CSYS_USER_EWCODE")
    private String csysUserEwcode;

    @Column(name = "CSYS_USER_HEADIMAGE")
    private String csysUserHeadimage;

    @Column(name = "CSYS_USER_CITY")
    private String csysUserCity;

    @Column(name = "CSYS_USER_PROVICE")
    private String csysUserProvice;

    @Column(name = "CSYS_USER_COUNTRY")
    private String csysUserCountry;

    @Column(name = "CSYS_USER_LANGUAGE")
    private String csysUserLanguage;

    @Column(name = "CSYS_USER_CREATE_TIME")
    private Date csysUserCreateTime;

    @Column(name = "CSYS_USER_CREATE_USER")
    private String csysUserCreateUser;

    @Column(name = "CSYS_USER_MODIFY_TIME")
    private Date csysUserModifyTime;

    @Column(name = "CSYS_USER_MODIFY_USER")
    private String csysUserModifyUser;

    @Column(name = "CSYS_USER_IS_DELETE")
    private String csysUserIsDelete;

    @Column(name = "CSYS_USER_TIME")
    private Date csysUserTime;

    @Column(name = "CSYS_USER_DATE")
    private Date csysUserDate;

    @Column(name = "CSYS_USER_REFRESH_TOKEN")
    private String csysUserRefreshToken;

    @Id
    @Column(name = "CSYS_USER_ROLE_ID")
    private String csysUserRoleId;

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
     * @return CSYS_USER_USERNAME
     */
    public String getCsysUserUsername() {
        return csysUserUsername;
    }

    /**
     * @param csysUserUsername
     */
    public void setCsysUserUsername(String csysUserUsername) {
        this.csysUserUsername = csysUserUsername;
    }

    /**
     * @return CSYS_USER_PASSWORD
     */
    public String getCsysUserPassword() {
        return csysUserPassword;
    }

    /**
     * @param csysUserPassword
     */
    public void setCsysUserPassword(String csysUserPassword) {
        this.csysUserPassword = csysUserPassword;
    }

    /**
     * @return CSYS_USER_OPEN_ID
     */
    public String getCsysUserOpenId() {
        return csysUserOpenId;
    }

    /**
     * @param csysUserOpenId
     */
    public void setCsysUserOpenId(String csysUserOpenId) {
        this.csysUserOpenId = csysUserOpenId;
    }

    /**
     * @return CSYS_USER_NICKNAME
     */
    public String getCsysUserNickname() {
        return csysUserNickname;
    }

    /**
     * @param csysUserNickname
     */
    public void setCsysUserNickname(String csysUserNickname) {
        this.csysUserNickname = csysUserNickname;
    }

    /**
     * @return CSYS_USER_NAME
     */
    public String getCsysUserName() {
        return csysUserName;
    }

    /**
     * @param csysUserName
     */
    public void setCsysUserName(String csysUserName) {
        this.csysUserName = csysUserName;
    }

    /**
     * @return CSYS_USER_ACCOUNT
     */
    public BigDecimal getCsysUserAccount() {
        return csysUserAccount;
    }

    /**
     * @param csysUserAccount
     */
    public void setCsysUserAccount(BigDecimal csysUserAccount) {
        this.csysUserAccount = csysUserAccount;
    }

    /**
     * @return CSYS_USER_LEVEL
     */
    public String getCsysUserLevel() {
        return csysUserLevel;
    }

    /**
     * @param csysUserLevel
     */
    public void setCsysUserLevel(String csysUserLevel) {
        this.csysUserLevel = csysUserLevel;
    }

    /**
     * @return CSYS_USER_HP
     */
    public String getCsysUserHp() {
        return csysUserHp;
    }

    /**
     * @param csysUserHp
     */
    public void setCsysUserHp(String csysUserHp) {
        this.csysUserHp = csysUserHp;
    }

    /**
     * @return CSYS_USER_ACCESS_TOKEN
     */
    public String getCsysUserAccessToken() {
        return csysUserAccessToken;
    }

    /**
     * @param csysUserAccessToken
     */
    public void setCsysUserAccessToken(String csysUserAccessToken) {
        this.csysUserAccessToken = csysUserAccessToken;
    }

    /**
     * @return CSYS_USER_REALNAME
     */
    public String getCsysUserRealname() {
        return csysUserRealname;
    }

    /**
     * @param csysUserRealname
     */
    public void setCsysUserRealname(String csysUserRealname) {
        this.csysUserRealname = csysUserRealname;
    }

    /**
     * @return CSYS_USER_NUMBER
     */
    public String getCsysUserNumber() {
        return csysUserNumber;
    }

    /**
     * @param csysUserNumber
     */
    public void setCsysUserNumber(String csysUserNumber) {
        this.csysUserNumber = csysUserNumber;
    }

    /**
     * @return CSYS_USER_GENDER
     */
    public String getCsysUserGender() {
        return csysUserGender;
    }

    /**
     * @param csysUserGender
     */
    public void setCsysUserGender(String csysUserGender) {
        this.csysUserGender = csysUserGender;
    }

    /**
     * @return CSYS_USER_AGE
     */
    public Short getCsysUserAge() {
        return csysUserAge;
    }

    /**
     * @param csysUserAge
     */
    public void setCsysUserAge(Short csysUserAge) {
        this.csysUserAge = csysUserAge;
    }

    /**
     * @return CSYS_USER_PHONE
     */
    public String getCsysUserPhone() {
        return csysUserPhone;
    }

    /**
     * @param csysUserPhone
     */
    public void setCsysUserPhone(String csysUserPhone) {
        this.csysUserPhone = csysUserPhone;
    }

    /**
     * @return CSYS_USER_MOBILE
     */
    public String getCsysUserMobile() {
        return csysUserMobile;
    }

    /**
     * @param csysUserMobile
     */
    public void setCsysUserMobile(String csysUserMobile) {
        this.csysUserMobile = csysUserMobile;
    }

    /**
     * @return CSYS_USER_EMAIL
     */
    public String getCsysUserEmail() {
        return csysUserEmail;
    }

    /**
     * @param csysUserEmail
     */
    public void setCsysUserEmail(String csysUserEmail) {
        this.csysUserEmail = csysUserEmail;
    }

    /**
     * @return CSYS_USER_ADDRESS
     */
    public String getCsysUserAddress() {
        return csysUserAddress;
    }

    /**
     * @param csysUserAddress
     */
    public void setCsysUserAddress(String csysUserAddress) {
        this.csysUserAddress = csysUserAddress;
    }

    /**
     * @return CSYS_USER_EDUCATION
     */
    public String getCsysUserEducation() {
        return csysUserEducation;
    }

    /**
     * @param csysUserEducation
     */
    public void setCsysUserEducation(String csysUserEducation) {
        this.csysUserEducation = csysUserEducation;
    }

    /**
     * @return CSYS_USER_MENO
     */
    public String getCsysUserMeno() {
        return csysUserMeno;
    }

    /**
     * @param csysUserMeno
     */
    public void setCsysUserMeno(String csysUserMeno) {
        this.csysUserMeno = csysUserMeno;
    }

    /**
     * @return CSYS_USER_EWCODE
     */
    public String getCsysUserEwcode() {
        return csysUserEwcode;
    }

    /**
     * @param csysUserEwcode
     */
    public void setCsysUserEwcode(String csysUserEwcode) {
        this.csysUserEwcode = csysUserEwcode;
    }

    /**
     * @return CSYS_USER_HEADIMAGE
     */
    public String getCsysUserHeadimage() {
        return csysUserHeadimage;
    }

    /**
     * @param csysUserHeadimage
     */
    public void setCsysUserHeadimage(String csysUserHeadimage) {
        this.csysUserHeadimage = csysUserHeadimage;
    }

    /**
     * @return CSYS_USER_CITY
     */
    public String getCsysUserCity() {
        return csysUserCity;
    }

    /**
     * @param csysUserCity
     */
    public void setCsysUserCity(String csysUserCity) {
        this.csysUserCity = csysUserCity;
    }

    /**
     * @return CSYS_USER_PROVICE
     */
    public String getCsysUserProvice() {
        return csysUserProvice;
    }

    /**
     * @param csysUserProvice
     */
    public void setCsysUserProvice(String csysUserProvice) {
        this.csysUserProvice = csysUserProvice;
    }

    /**
     * @return CSYS_USER_COUNTRY
     */
    public String getCsysUserCountry() {
        return csysUserCountry;
    }

    /**
     * @param csysUserCountry
     */
    public void setCsysUserCountry(String csysUserCountry) {
        this.csysUserCountry = csysUserCountry;
    }

    /**
     * @return CSYS_USER_LANGUAGE
     */
    public String getCsysUserLanguage() {
        return csysUserLanguage;
    }

    /**
     * @param csysUserLanguage
     */
    public void setCsysUserLanguage(String csysUserLanguage) {
        this.csysUserLanguage = csysUserLanguage;
    }

    /**
     * @return CSYS_USER_CREATE_TIME
     */
    public Date getCsysUserCreateTime() {
        return csysUserCreateTime;
    }

    /**
     * @param csysUserCreateTime
     */
    public void setCsysUserCreateTime(Date csysUserCreateTime) {
        this.csysUserCreateTime = csysUserCreateTime;
    }

    /**
     * @return CSYS_USER_CREATE_USER
     */
    public String getCsysUserCreateUser() {
        return csysUserCreateUser;
    }

    /**
     * @param csysUserCreateUser
     */
    public void setCsysUserCreateUser(String csysUserCreateUser) {
        this.csysUserCreateUser = csysUserCreateUser;
    }

    /**
     * @return CSYS_USER_MODIFY_TIME
     */
    public Date getCsysUserModifyTime() {
        return csysUserModifyTime;
    }

    /**
     * @param csysUserModifyTime
     */
    public void setCsysUserModifyTime(Date csysUserModifyTime) {
        this.csysUserModifyTime = csysUserModifyTime;
    }

    /**
     * @return CSYS_USER_MODIFY_USER
     */
    public String getCsysUserModifyUser() {
        return csysUserModifyUser;
    }

    /**
     * @param csysUserModifyUser
     */
    public void setCsysUserModifyUser(String csysUserModifyUser) {
        this.csysUserModifyUser = csysUserModifyUser;
    }

    /**
     * @return CSYS_USER_IS_DELETE
     */
    public String getCsysUserIsDelete() {
        return csysUserIsDelete;
    }

    /**
     * @param csysUserIsDelete
     */
    public void setCsysUserIsDelete(String csysUserIsDelete) {
        this.csysUserIsDelete = csysUserIsDelete;
    }

    /**
     * @return CSYS_USER_TIME
     */
    public Date getCsysUserTime() {
        return csysUserTime;
    }

    /**
     * @param csysUserTime
     */
    public void setCsysUserTime(Date csysUserTime) {
        this.csysUserTime = csysUserTime;
    }

    /**
     * @return CSYS_USER_DATE
     */
    public Date getCsysUserDate() {
        return csysUserDate;
    }

    /**
     * @param csysUserDate
     */
    public void setCsysUserDate(Date csysUserDate) {
        this.csysUserDate = csysUserDate;
    }

    /**
     * @return CSYS_USER_REFRESH_TOKEN
     */
    public String getCsysUserRefreshToken() {
        return csysUserRefreshToken;
    }

    /**
     * @param csysUserRefreshToken
     */
    public void setCsysUserRefreshToken(String csysUserRefreshToken) {
        this.csysUserRefreshToken = csysUserRefreshToken;
    }

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