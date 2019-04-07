package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_LOG_PAM")
public class CsysTrsLogPam {
    @Id
    @Column(name = "CSYS_TRS_LOG_PAM_ID")
    private String csysTrsLogPamId;

    @Column(name = "CSYS_TRS_LOG_ID")
    private String csysTrsLogId;

    @Column(name = "CSYS_TRS_LOG_PAM_NAME")
    private String csysTrsLogPamName;

    @Column(name = "CY_SYS_BLOCK_ID")
    private String cySysBlockId;

    @Column(name = "CY_SYS_BLOCK_RUNTIME_ID")
    private String cySysBlockRuntimeId;

    @Column(name = "CSYS_TRS_LOG_PAM_TABLE")
    private String csysTrsLogPamTable;

    @Column(name = "CSYS_TRS_LOG_PAM_VALUE")
    private String csysTrsLogPamValue;

    @Column(name = "CSYS_TRS_LOG_PAM_CREATE_TIME")
    private Date csysTrsLogPamCreateTime;

    @Column(name = "CSYS_TRS_LOG_PAM_MODIFY_TIME")
    private Date csysTrsLogPamModifyTime;

    @Column(name = "CSYS_TRS_LOG_PAM_CREATE_USER")
    private String csysTrsLogPamCreateUser;

    @Column(name = "CSYS_TRS_LOG_PAM_MODIFY_USER")
    private String csysTrsLogPamModifyUser;

    @Column(name = "CSYS_TRS_LOG_PAM_IS_DELETE")
    private String csysTrsLogPamIsDelete;

    @Column(name = "CSYS_TRS_LOG_PAM_DATE")
    private Date csysTrsLogPamDate;

    @Column(name = "CSYS_TRS_LOG_PAM_TIME")
    private Date csysTrsLogPamTime;

    @Column(name = "CSYS_TRS_LOG_PAM_COLUMN")
    private String csysTrsLogPamColumn;

    /**
     * @return CSYS_TRS_LOG_PAM_ID
     */
    public String getCsysTrsLogPamId() {
        return csysTrsLogPamId;
    }

    /**
     * @param csysTrsLogPamId
     */
    public void setCsysTrsLogPamId(String csysTrsLogPamId) {
        this.csysTrsLogPamId = csysTrsLogPamId;
    }

    /**
     * @return CSYS_TRS_LOG_ID
     */
    public String getCsysTrsLogId() {
        return csysTrsLogId;
    }

    /**
     * @param csysTrsLogId
     */
    public void setCsysTrsLogId(String csysTrsLogId) {
        this.csysTrsLogId = csysTrsLogId;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_NAME
     */
    public String getCsysTrsLogPamName() {
        return csysTrsLogPamName;
    }

    /**
     * @param csysTrsLogPamName
     */
    public void setCsysTrsLogPamName(String csysTrsLogPamName) {
        this.csysTrsLogPamName = csysTrsLogPamName;
    }

    /**
     * @return CY_SYS_BLOCK_ID
     */
    public String getCySysBlockId() {
        return cySysBlockId;
    }

    /**
     * @param cySysBlockId
     */
    public void setCySysBlockId(String cySysBlockId) {
        this.cySysBlockId = cySysBlockId;
    }

    /**
     * @return CY_SYS_BLOCK_RUNTIME_ID
     */
    public String getCySysBlockRuntimeId() {
        return cySysBlockRuntimeId;
    }

    /**
     * @param cySysBlockRuntimeId
     */
    public void setCySysBlockRuntimeId(String cySysBlockRuntimeId) {
        this.cySysBlockRuntimeId = cySysBlockRuntimeId;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_TABLE
     */
    public String getCsysTrsLogPamTable() {
        return csysTrsLogPamTable;
    }

    /**
     * @param csysTrsLogPamTable
     */
    public void setCsysTrsLogPamTable(String csysTrsLogPamTable) {
        this.csysTrsLogPamTable = csysTrsLogPamTable;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_VALUE
     */
    public String getCsysTrsLogPamValue() {
        return csysTrsLogPamValue;
    }

    /**
     * @param csysTrsLogPamValue
     */
    public void setCsysTrsLogPamValue(String csysTrsLogPamValue) {
        this.csysTrsLogPamValue = csysTrsLogPamValue;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_CREATE_TIME
     */
    public Date getCsysTrsLogPamCreateTime() {
        return csysTrsLogPamCreateTime;
    }

    /**
     * @param csysTrsLogPamCreateTime
     */
    public void setCsysTrsLogPamCreateTime(Date csysTrsLogPamCreateTime) {
        this.csysTrsLogPamCreateTime = csysTrsLogPamCreateTime;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_MODIFY_TIME
     */
    public Date getCsysTrsLogPamModifyTime() {
        return csysTrsLogPamModifyTime;
    }

    /**
     * @param csysTrsLogPamModifyTime
     */
    public void setCsysTrsLogPamModifyTime(Date csysTrsLogPamModifyTime) {
        this.csysTrsLogPamModifyTime = csysTrsLogPamModifyTime;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_CREATE_USER
     */
    public String getCsysTrsLogPamCreateUser() {
        return csysTrsLogPamCreateUser;
    }

    /**
     * @param csysTrsLogPamCreateUser
     */
    public void setCsysTrsLogPamCreateUser(String csysTrsLogPamCreateUser) {
        this.csysTrsLogPamCreateUser = csysTrsLogPamCreateUser;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_MODIFY_USER
     */
    public String getCsysTrsLogPamModifyUser() {
        return csysTrsLogPamModifyUser;
    }

    /**
     * @param csysTrsLogPamModifyUser
     */
    public void setCsysTrsLogPamModifyUser(String csysTrsLogPamModifyUser) {
        this.csysTrsLogPamModifyUser = csysTrsLogPamModifyUser;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_IS_DELETE
     */
    public String getCsysTrsLogPamIsDelete() {
        return csysTrsLogPamIsDelete;
    }

    /**
     * @param csysTrsLogPamIsDelete
     */
    public void setCsysTrsLogPamIsDelete(String csysTrsLogPamIsDelete) {
        this.csysTrsLogPamIsDelete = csysTrsLogPamIsDelete;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_DATE
     */
    public Date getCsysTrsLogPamDate() {
        return csysTrsLogPamDate;
    }

    /**
     * @param csysTrsLogPamDate
     */
    public void setCsysTrsLogPamDate(Date csysTrsLogPamDate) {
        this.csysTrsLogPamDate = csysTrsLogPamDate;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_TIME
     */
    public Date getCsysTrsLogPamTime() {
        return csysTrsLogPamTime;
    }

    /**
     * @param csysTrsLogPamTime
     */
    public void setCsysTrsLogPamTime(Date csysTrsLogPamTime) {
        this.csysTrsLogPamTime = csysTrsLogPamTime;
    }

    /**
     * @return CSYS_TRS_LOG_PAM_COLUMN
     */
    public String getCsysTrsLogPamColumn() {
        return csysTrsLogPamColumn;
    }

    /**
     * @param csysTrsLogPamColumn
     */
    public void setCsysTrsLogPamColumn(String csysTrsLogPamColumn) {
        this.csysTrsLogPamColumn = csysTrsLogPamColumn;
    }
}