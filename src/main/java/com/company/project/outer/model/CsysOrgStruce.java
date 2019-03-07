package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_ORG_STRUCE")
public class CsysOrgStruce {
    @Id
    @Column(name = "CSYS_ORG_STRUCE_ID")
    private String csysOrgStruceId;

    @Column(name = "CSYS_ORG_STRUCE_NAME")
    private String csysOrgStruceName;

    @Column(name = "CSYS_ORG_STRUCE_TYPE")
    private String csysOrgStruceType;

    @Column(name = "CSYS_ORG_STRUCE_IS_ENABLED")
    private String csysOrgStruceIsEnabled;

    @Column(name = "CSYS_ORG_STRUCE_COLORTHEME")
    private String csysOrgStruceColortheme;

    @Column(name = "CSYS_ORG_STRUCE_STYLE")
    private String csysOrgStruceStyle;

    @Column(name = "CSYS_ORG_STRUCE_ORIENTE")
    private String csysOrgStruceOriente;

    @Column(name = "CSYS_ORG_STRUCE_CREATE_TIME")
    private Date csysOrgStruceCreateTime;

    @Column(name = "CSYS_ORG_STRUCE_MODIFY_TIME")
    private Date csysOrgStruceModifyTime;

    @Column(name = "CSYS_ORG_STRUCE_CREATE_USER")
    private String csysOrgStruceCreateUser;

    @Column(name = "CSYS_ORG_STRUCE_MODIFY_USER")
    private String csysOrgStruceModifyUser;

    @Column(name = "CSYS_ORG_STRUCE_IS_DELETE")
    private String csysOrgStruceIsDelete;

    @Column(name = "CSYS_ORG_STRUCE_TIME")
    private Date csysOrgStruceTime;

    @Column(name = "CSYS_ORG_STRUCE_DATE")
    private Date csysOrgStruceDate;

    @Column(name = "CSYS_ORG_STRUCE_NODES")
    private String csysOrgStruceNodes;

    @Column(name = "CSYS_ORG_STRUCE_LINKS")
    private String csysOrgStruceLinks;

    /**
     * @return CSYS_ORG_STRUCE_ID
     */
    public String getCsysOrgStruceId() {
        return csysOrgStruceId;
    }

    /**
     * @param csysOrgStruceId
     */
    public void setCsysOrgStruceId(String csysOrgStruceId) {
        this.csysOrgStruceId = csysOrgStruceId;
    }

    /**
     * @return CSYS_ORG_STRUCE_NAME
     */
    public String getCsysOrgStruceName() {
        return csysOrgStruceName;
    }

    /**
     * @param csysOrgStruceName
     */
    public void setCsysOrgStruceName(String csysOrgStruceName) {
        this.csysOrgStruceName = csysOrgStruceName;
    }

    /**
     * @return CSYS_ORG_STRUCE_TYPE
     */
    public String getCsysOrgStruceType() {
        return csysOrgStruceType;
    }

    /**
     * @param csysOrgStruceType
     */
    public void setCsysOrgStruceType(String csysOrgStruceType) {
        this.csysOrgStruceType = csysOrgStruceType;
    }

    /**
     * @return CSYS_ORG_STRUCE_IS_ENABLED
     */
    public String getCsysOrgStruceIsEnabled() {
        return csysOrgStruceIsEnabled;
    }

    /**
     * @param csysOrgStruceIsEnabled
     */
    public void setCsysOrgStruceIsEnabled(String csysOrgStruceIsEnabled) {
        this.csysOrgStruceIsEnabled = csysOrgStruceIsEnabled;
    }

    /**
     * @return CSYS_ORG_STRUCE_COLORTHEME
     */
    public String getCsysOrgStruceColortheme() {
        return csysOrgStruceColortheme;
    }

    /**
     * @param csysOrgStruceColortheme
     */
    public void setCsysOrgStruceColortheme(String csysOrgStruceColortheme) {
        this.csysOrgStruceColortheme = csysOrgStruceColortheme;
    }

    /**
     * @return CSYS_ORG_STRUCE_STYLE
     */
    public String getCsysOrgStruceStyle() {
        return csysOrgStruceStyle;
    }

    /**
     * @param csysOrgStruceStyle
     */
    public void setCsysOrgStruceStyle(String csysOrgStruceStyle) {
        this.csysOrgStruceStyle = csysOrgStruceStyle;
    }

    /**
     * @return CSYS_ORG_STRUCE_ORIENTE
     */
    public String getCsysOrgStruceOriente() {
        return csysOrgStruceOriente;
    }

    /**
     * @param csysOrgStruceOriente
     */
    public void setCsysOrgStruceOriente(String csysOrgStruceOriente) {
        this.csysOrgStruceOriente = csysOrgStruceOriente;
    }

    /**
     * @return CSYS_ORG_STRUCE_CREATE_TIME
     */
    public Date getCsysOrgStruceCreateTime() {
        return csysOrgStruceCreateTime;
    }

    /**
     * @param csysOrgStruceCreateTime
     */
    public void setCsysOrgStruceCreateTime(Date csysOrgStruceCreateTime) {
        this.csysOrgStruceCreateTime = csysOrgStruceCreateTime;
    }

    /**
     * @return CSYS_ORG_STRUCE_MODIFY_TIME
     */
    public Date getCsysOrgStruceModifyTime() {
        return csysOrgStruceModifyTime;
    }

    /**
     * @param csysOrgStruceModifyTime
     */
    public void setCsysOrgStruceModifyTime(Date csysOrgStruceModifyTime) {
        this.csysOrgStruceModifyTime = csysOrgStruceModifyTime;
    }

    /**
     * @return CSYS_ORG_STRUCE_CREATE_USER
     */
    public String getCsysOrgStruceCreateUser() {
        return csysOrgStruceCreateUser;
    }

    /**
     * @param csysOrgStruceCreateUser
     */
    public void setCsysOrgStruceCreateUser(String csysOrgStruceCreateUser) {
        this.csysOrgStruceCreateUser = csysOrgStruceCreateUser;
    }

    /**
     * @return CSYS_ORG_STRUCE_MODIFY_USER
     */
    public String getCsysOrgStruceModifyUser() {
        return csysOrgStruceModifyUser;
    }

    /**
     * @param csysOrgStruceModifyUser
     */
    public void setCsysOrgStruceModifyUser(String csysOrgStruceModifyUser) {
        this.csysOrgStruceModifyUser = csysOrgStruceModifyUser;
    }

    /**
     * @return CSYS_ORG_STRUCE_IS_DELETE
     */
    public String getCsysOrgStruceIsDelete() {
        return csysOrgStruceIsDelete;
    }

    /**
     * @param csysOrgStruceIsDelete
     */
    public void setCsysOrgStruceIsDelete(String csysOrgStruceIsDelete) {
        this.csysOrgStruceIsDelete = csysOrgStruceIsDelete;
    }

    /**
     * @return CSYS_ORG_STRUCE_TIME
     */
    public Date getCsysOrgStruceTime() {
        return csysOrgStruceTime;
    }

    /**
     * @param csysOrgStruceTime
     */
    public void setCsysOrgStruceTime(Date csysOrgStruceTime) {
        this.csysOrgStruceTime = csysOrgStruceTime;
    }

    /**
     * @return CSYS_ORG_STRUCE_DATE
     */
    public Date getCsysOrgStruceDate() {
        return csysOrgStruceDate;
    }

    /**
     * @param csysOrgStruceDate
     */
    public void setCsysOrgStruceDate(Date csysOrgStruceDate) {
        this.csysOrgStruceDate = csysOrgStruceDate;
    }

    /**
     * @return CSYS_ORG_STRUCE_NODES
     */
    public String getCsysOrgStruceNodes() {
        return csysOrgStruceNodes;
    }

    /**
     * @param csysOrgStruceNodes
     */
    public void setCsysOrgStruceNodes(String csysOrgStruceNodes) {
        this.csysOrgStruceNodes = csysOrgStruceNodes;
    }

    /**
     * @return CSYS_ORG_STRUCE_LINKS
     */
    public String getCsysOrgStruceLinks() {
        return csysOrgStruceLinks;
    }

    /**
     * @param csysOrgStruceLinks
     */
    public void setCsysOrgStruceLinks(String csysOrgStruceLinks) {
        this.csysOrgStruceLinks = csysOrgStruceLinks;
    }
}