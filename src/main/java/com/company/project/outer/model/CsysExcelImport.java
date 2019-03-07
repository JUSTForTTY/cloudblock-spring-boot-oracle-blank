package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_EXCEL_IMPORT")
public class CsysExcelImport {
    @Id
    @Column(name = "CSYS_EXCEL_IMPORT_ID")
    private String csysExcelImportId;

    @Column(name = "CSYS_EXCEL_IMPORT_NAME")
    private String csysExcelImportName;

    @Column(name = "CSYS_VIEW_EXPLAIN_ID")
    private String csysViewExplainId;

    @Column(name = "CSYS_EXCEL_IMPORT_TYPE")
    private String csysExcelImportType;

    @Column(name = "CSYS_EXCEL_IMPORT_DL_NAME")
    private String csysExcelImportDlName;

    @Column(name = "CSYS_EXCEL_IMPORT_FILE")
    private String csysExcelImportFile;

    @Column(name = "CSYS_EXCEL_IMPORT_READ_ROW")
    private Short csysExcelImportReadRow;

    @Column(name = "CSYS_EXCEL_IMPORT_BF_PRC")
    private String csysExcelImportBfPrc;

    @Column(name = "CSYS_EXCEL_IMPORT_CR_PRC")
    private String csysExcelImportCrPrc;

    @Column(name = "CSYS_EXCEL_IMPORT_AF_PRC")
    private String csysExcelImportAfPrc;

    @Column(name = "CSYS_EXCEL_IMPORT_DESC")
    private String csysExcelImportDesc;

    @Column(name = "CSYS_EXCEL_IMPORT_CREATE_TIME")
    private Date csysExcelImportCreateTime;

    @Column(name = "CSYS_EXCEL_IMPORT_MODIFY_TIME")
    private Date csysExcelImportModifyTime;

    @Column(name = "CSYS_EXCEL_IMPORT_CREATE_USER")
    private String csysExcelImportCreateUser;

    @Column(name = "CSYS_EXCEL_IMPORT_MODIFY_USER")
    private String csysExcelImportModifyUser;

    @Column(name = "CSYS_EXCEL_IMPORT_IS_DELETE")
    private String csysExcelImportIsDelete;

    @Column(name = "CSYS_EXCEL_IMPORT_TIME")
    private Date csysExcelImportTime;

    @Column(name = "CSYS_EXCEL_IMPORT_DATE")
    private Date csysExcelImportDate;

    /**
     * @return CSYS_EXCEL_IMPORT_ID
     */
    public String getCsysExcelImportId() {
        return csysExcelImportId;
    }

    /**
     * @param csysExcelImportId
     */
    public void setCsysExcelImportId(String csysExcelImportId) {
        this.csysExcelImportId = csysExcelImportId;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_NAME
     */
    public String getCsysExcelImportName() {
        return csysExcelImportName;
    }

    /**
     * @param csysExcelImportName
     */
    public void setCsysExcelImportName(String csysExcelImportName) {
        this.csysExcelImportName = csysExcelImportName;
    }

    /**
     * @return CSYS_VIEW_EXPLAIN_ID
     */
    public String getCsysViewExplainId() {
        return csysViewExplainId;
    }

    /**
     * @param csysViewExplainId
     */
    public void setCsysViewExplainId(String csysViewExplainId) {
        this.csysViewExplainId = csysViewExplainId;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_TYPE
     */
    public String getCsysExcelImportType() {
        return csysExcelImportType;
    }

    /**
     * @param csysExcelImportType
     */
    public void setCsysExcelImportType(String csysExcelImportType) {
        this.csysExcelImportType = csysExcelImportType;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_DL_NAME
     */
    public String getCsysExcelImportDlName() {
        return csysExcelImportDlName;
    }

    /**
     * @param csysExcelImportDlName
     */
    public void setCsysExcelImportDlName(String csysExcelImportDlName) {
        this.csysExcelImportDlName = csysExcelImportDlName;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_FILE
     */
    public String getCsysExcelImportFile() {
        return csysExcelImportFile;
    }

    /**
     * @param csysExcelImportFile
     */
    public void setCsysExcelImportFile(String csysExcelImportFile) {
        this.csysExcelImportFile = csysExcelImportFile;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_READ_ROW
     */
    public Short getCsysExcelImportReadRow() {
        return csysExcelImportReadRow;
    }

    /**
     * @param csysExcelImportReadRow
     */
    public void setCsysExcelImportReadRow(Short csysExcelImportReadRow) {
        this.csysExcelImportReadRow = csysExcelImportReadRow;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_BF_PRC
     */
    public String getCsysExcelImportBfPrc() {
        return csysExcelImportBfPrc;
    }

    /**
     * @param csysExcelImportBfPrc
     */
    public void setCsysExcelImportBfPrc(String csysExcelImportBfPrc) {
        this.csysExcelImportBfPrc = csysExcelImportBfPrc;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_CR_PRC
     */
    public String getCsysExcelImportCrPrc() {
        return csysExcelImportCrPrc;
    }

    /**
     * @param csysExcelImportCrPrc
     */
    public void setCsysExcelImportCrPrc(String csysExcelImportCrPrc) {
        this.csysExcelImportCrPrc = csysExcelImportCrPrc;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_AF_PRC
     */
    public String getCsysExcelImportAfPrc() {
        return csysExcelImportAfPrc;
    }

    /**
     * @param csysExcelImportAfPrc
     */
    public void setCsysExcelImportAfPrc(String csysExcelImportAfPrc) {
        this.csysExcelImportAfPrc = csysExcelImportAfPrc;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_DESC
     */
    public String getCsysExcelImportDesc() {
        return csysExcelImportDesc;
    }

    /**
     * @param csysExcelImportDesc
     */
    public void setCsysExcelImportDesc(String csysExcelImportDesc) {
        this.csysExcelImportDesc = csysExcelImportDesc;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_CREATE_TIME
     */
    public Date getCsysExcelImportCreateTime() {
        return csysExcelImportCreateTime;
    }

    /**
     * @param csysExcelImportCreateTime
     */
    public void setCsysExcelImportCreateTime(Date csysExcelImportCreateTime) {
        this.csysExcelImportCreateTime = csysExcelImportCreateTime;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_MODIFY_TIME
     */
    public Date getCsysExcelImportModifyTime() {
        return csysExcelImportModifyTime;
    }

    /**
     * @param csysExcelImportModifyTime
     */
    public void setCsysExcelImportModifyTime(Date csysExcelImportModifyTime) {
        this.csysExcelImportModifyTime = csysExcelImportModifyTime;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_CREATE_USER
     */
    public String getCsysExcelImportCreateUser() {
        return csysExcelImportCreateUser;
    }

    /**
     * @param csysExcelImportCreateUser
     */
    public void setCsysExcelImportCreateUser(String csysExcelImportCreateUser) {
        this.csysExcelImportCreateUser = csysExcelImportCreateUser;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_MODIFY_USER
     */
    public String getCsysExcelImportModifyUser() {
        return csysExcelImportModifyUser;
    }

    /**
     * @param csysExcelImportModifyUser
     */
    public void setCsysExcelImportModifyUser(String csysExcelImportModifyUser) {
        this.csysExcelImportModifyUser = csysExcelImportModifyUser;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_IS_DELETE
     */
    public String getCsysExcelImportIsDelete() {
        return csysExcelImportIsDelete;
    }

    /**
     * @param csysExcelImportIsDelete
     */
    public void setCsysExcelImportIsDelete(String csysExcelImportIsDelete) {
        this.csysExcelImportIsDelete = csysExcelImportIsDelete;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_TIME
     */
    public Date getCsysExcelImportTime() {
        return csysExcelImportTime;
    }

    /**
     * @param csysExcelImportTime
     */
    public void setCsysExcelImportTime(Date csysExcelImportTime) {
        this.csysExcelImportTime = csysExcelImportTime;
    }

    /**
     * @return CSYS_EXCEL_IMPORT_DATE
     */
    public Date getCsysExcelImportDate() {
        return csysExcelImportDate;
    }

    /**
     * @param csysExcelImportDate
     */
    public void setCsysExcelImportDate(Date csysExcelImportDate) {
        this.csysExcelImportDate = csysExcelImportDate;
    }
}