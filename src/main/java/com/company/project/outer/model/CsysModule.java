package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_MODULE")
public class CsysModule {
    @Id
    @Column(name = "CSYS_MODULE_ID")
    private String csysModuleId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_LAYOUT_ID")
    private String csysLayoutId;

    @Column(name = "CSYS_MODULE_NAME")
    private String csysModuleName;

    @Column(name = "CSYS_MODULE_ISMULTIPLEX")
    private String csysModuleIsmultiplex;

    @Column(name = "CSYS_MODULE_MULTIPLEX_TYPE")
    private String csysModuleMultiplexType;

    @Column(name = "CSYS_MODULE_CREATE_TIME")
    private Date csysModuleCreateTime;

    @Column(name = "CSYS_MODULE_CREATE_USER")
    private String csysModuleCreateUser;

    @Column(name = "CSYS_MODULE_MODIFY_TIME")
    private Date csysModuleModifyTime;

    @Column(name = "CSYS_MODULE_MODIFY_USER")
    private String csysModuleModifyUser;

    @Column(name = "CSYS_MODULE_IS_DELETE")
    private String csysModuleIsDelete;

    @Column(name = "CSYS_MODULE_TIME")
    private Date csysModuleTime;

    @Column(name = "CSYS_MODULE_DATE")
    private Date csysModuleDate;

    @Column(name = "CSYS_MODULE_HTML_CODE")
    private String csysModuleHtmlCode;

    @Column(name = "CSYS_MODULE_HTML_DROP_CODE")
    private String csysModuleHtmlDropCode;

    /**
     * @return CSYS_MODULE_ID
     */
    public String getCsysModuleId() {
        return csysModuleId;
    }

    /**
     * @param csysModuleId
     */
    public void setCsysModuleId(String csysModuleId) {
        this.csysModuleId = csysModuleId;
    }

    /**
     * @return CSYS_PAGE_ID
     */
    public String getCsysPageId() {
        return csysPageId;
    }

    /**
     * @param csysPageId
     */
    public void setCsysPageId(String csysPageId) {
        this.csysPageId = csysPageId;
    }

    /**
     * @return CSYS_LAYOUT_ID
     */
    public String getCsysLayoutId() {
        return csysLayoutId;
    }

    /**
     * @param csysLayoutId
     */
    public void setCsysLayoutId(String csysLayoutId) {
        this.csysLayoutId = csysLayoutId;
    }

    /**
     * @return CSYS_MODULE_NAME
     */
    public String getCsysModuleName() {
        return csysModuleName;
    }

    /**
     * @param csysModuleName
     */
    public void setCsysModuleName(String csysModuleName) {
        this.csysModuleName = csysModuleName;
    }

    /**
     * @return CSYS_MODULE_ISMULTIPLEX
     */
    public String getCsysModuleIsmultiplex() {
        return csysModuleIsmultiplex;
    }

    /**
     * @param csysModuleIsmultiplex
     */
    public void setCsysModuleIsmultiplex(String csysModuleIsmultiplex) {
        this.csysModuleIsmultiplex = csysModuleIsmultiplex;
    }

    /**
     * @return CSYS_MODULE_MULTIPLEX_TYPE
     */
    public String getCsysModuleMultiplexType() {
        return csysModuleMultiplexType;
    }

    /**
     * @param csysModuleMultiplexType
     */
    public void setCsysModuleMultiplexType(String csysModuleMultiplexType) {
        this.csysModuleMultiplexType = csysModuleMultiplexType;
    }

    /**
     * @return CSYS_MODULE_CREATE_TIME
     */
    public Date getCsysModuleCreateTime() {
        return csysModuleCreateTime;
    }

    /**
     * @param csysModuleCreateTime
     */
    public void setCsysModuleCreateTime(Date csysModuleCreateTime) {
        this.csysModuleCreateTime = csysModuleCreateTime;
    }

    /**
     * @return CSYS_MODULE_CREATE_USER
     */
    public String getCsysModuleCreateUser() {
        return csysModuleCreateUser;
    }

    /**
     * @param csysModuleCreateUser
     */
    public void setCsysModuleCreateUser(String csysModuleCreateUser) {
        this.csysModuleCreateUser = csysModuleCreateUser;
    }

    /**
     * @return CSYS_MODULE_MODIFY_TIME
     */
    public Date getCsysModuleModifyTime() {
        return csysModuleModifyTime;
    }

    /**
     * @param csysModuleModifyTime
     */
    public void setCsysModuleModifyTime(Date csysModuleModifyTime) {
        this.csysModuleModifyTime = csysModuleModifyTime;
    }

    /**
     * @return CSYS_MODULE_MODIFY_USER
     */
    public String getCsysModuleModifyUser() {
        return csysModuleModifyUser;
    }

    /**
     * @param csysModuleModifyUser
     */
    public void setCsysModuleModifyUser(String csysModuleModifyUser) {
        this.csysModuleModifyUser = csysModuleModifyUser;
    }

    /**
     * @return CSYS_MODULE_IS_DELETE
     */
    public String getCsysModuleIsDelete() {
        return csysModuleIsDelete;
    }

    /**
     * @param csysModuleIsDelete
     */
    public void setCsysModuleIsDelete(String csysModuleIsDelete) {
        this.csysModuleIsDelete = csysModuleIsDelete;
    }

    /**
     * @return CSYS_MODULE_TIME
     */
    public Date getCsysModuleTime() {
        return csysModuleTime;
    }

    /**
     * @param csysModuleTime
     */
    public void setCsysModuleTime(Date csysModuleTime) {
        this.csysModuleTime = csysModuleTime;
    }

    /**
     * @return CSYS_MODULE_DATE
     */
    public Date getCsysModuleDate() {
        return csysModuleDate;
    }

    /**
     * @param csysModuleDate
     */
    public void setCsysModuleDate(Date csysModuleDate) {
        this.csysModuleDate = csysModuleDate;
    }

    /**
     * @return CSYS_MODULE_HTML_CODE
     */
    public String getCsysModuleHtmlCode() {
        return csysModuleHtmlCode;
    }

    /**
     * @param csysModuleHtmlCode
     */
    public void setCsysModuleHtmlCode(String csysModuleHtmlCode) {
        this.csysModuleHtmlCode = csysModuleHtmlCode;
    }

    /**
     * @return CSYS_MODULE_HTML_DROP_CODE
     */
    public String getCsysModuleHtmlDropCode() {
        return csysModuleHtmlDropCode;
    }

    /**
     * @param csysModuleHtmlDropCode
     */
    public void setCsysModuleHtmlDropCode(String csysModuleHtmlDropCode) {
        this.csysModuleHtmlDropCode = csysModuleHtmlDropCode;
    }
}