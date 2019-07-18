package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_EXCEL_ATTACH")
public class CsysExcelAttach {
    @Id
    @Column(name = "CSYS_EXCEL_ATTACH_ID")
    private String csysExcelAttachId;

    @Column(name = "CSYS_EXCEL_IMPORT_ID")
    private String csysExcelImportId;

    @Column(name = "CSYS_FIELD_INFO_ID")
    private String csysFieldInfoId;

    @Column(name = "CSYS_EXCEL_ATTACH_FIELD_ROW")
    private Integer csysExcelAttachFieldRow;

    @Column(name = "CSYS_EXCEL_ATTACH_FIELD_COLUMN")
    private Integer csysExcelAttachFieldColumn;

    @Column(name = "CSYS_EXCEL_ATTACH_FIELD_NAME")
    private String csysExcelAttachFieldName;

    @Column(name = "CSYS_EXCEL_ATTACH_FIELD_DESC")
    private String csysExcelAttachFieldDesc;

    @Column(name = "CSYS_EXCEL_ATTACH_CREATE_TIME")
    private Date csysExcelAttachCreateTime;

    @Column(name = "CSYS_EXCEL_ATTACH_MODIFY_TIME")
    private Date csysExcelAttachModifyTime;

    @Column(name = "CSYS_EXCEL_ATTACH_CREATE_USER")
    private String csysExcelAttachCreateUser;

    @Column(name = "CSYS_EXCEL_ATTACH_MODIFY_USER")
    private String csysExcelAttachModifyUser;

    @Column(name = "CSYS_EXCEL_ATTACH_IS_DELETE")
    private String csysExcelAttachIsDelete;

    @Column(name = "CSYS_EXCEL_ATTACH_TIME")
    private Date csysExcelAttachTime;

    @Column(name = "CSYS_EXCEL_ATTACH_DATE")
    private Date csysExcelAttachDate;

    @Column(name = "CSYS_EXCEL_ATTACH_IS_PRIMARY")
    private String csysExcelAttachIsPrimary;

    @Column(name = "CSYS_EXCEL_ATTACH_TRANSFERSQL")
    private String csysExcelAttachTransfersql;

    /**
     * @return CSYS_EXCEL_ATTACH_ID
     */
    public String getCsysExcelAttachId() {
        return csysExcelAttachId;
    }

    /**
     * @param csysExcelAttachId
     */
    public void setCsysExcelAttachId(String csysExcelAttachId) {
        this.csysExcelAttachId = csysExcelAttachId;
    }

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
     * @return CSYS_FIELD_INFO_ID
     */
    public String getCsysFieldInfoId() {
        return csysFieldInfoId;
    }

    /**
     * @param csysFieldInfoId
     */
    public void setCsysFieldInfoId(String csysFieldInfoId) {
        this.csysFieldInfoId = csysFieldInfoId;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_FIELD_ROW
     */
    public Integer getCsysExcelAttachFieldRow() {
        return csysExcelAttachFieldRow;
    }

    /**
     * @param csysExcelAttachFieldRow
     */
    public void setCsysExcelAttachFieldRow(Integer csysExcelAttachFieldRow) {
        this.csysExcelAttachFieldRow = csysExcelAttachFieldRow;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_FIELD_COLUMN
     */
    public Integer getCsysExcelAttachFieldColumn() {
        return csysExcelAttachFieldColumn;
    }

    /**
     * @param csysExcelAttachFieldColumn
     */
    public void setCsysExcelAttachFieldColumn(Integer csysExcelAttachFieldColumn) {
        this.csysExcelAttachFieldColumn = csysExcelAttachFieldColumn;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_FIELD_NAME
     */
    public String getCsysExcelAttachFieldName() {
        return csysExcelAttachFieldName;
    }

    /**
     * @param csysExcelAttachFieldName
     */
    public void setCsysExcelAttachFieldName(String csysExcelAttachFieldName) {
        this.csysExcelAttachFieldName = csysExcelAttachFieldName;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_FIELD_DESC
     */
    public String getCsysExcelAttachFieldDesc() {
        return csysExcelAttachFieldDesc;
    }

    /**
     * @param csysExcelAttachFieldDesc
     */
    public void setCsysExcelAttachFieldDesc(String csysExcelAttachFieldDesc) {
        this.csysExcelAttachFieldDesc = csysExcelAttachFieldDesc;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_CREATE_TIME
     */
    public Date getCsysExcelAttachCreateTime() {
        return csysExcelAttachCreateTime;
    }

    /**
     * @param csysExcelAttachCreateTime
     */
    public void setCsysExcelAttachCreateTime(Date csysExcelAttachCreateTime) {
        this.csysExcelAttachCreateTime = csysExcelAttachCreateTime;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_MODIFY_TIME
     */
    public Date getCsysExcelAttachModifyTime() {
        return csysExcelAttachModifyTime;
    }

    /**
     * @param csysExcelAttachModifyTime
     */
    public void setCsysExcelAttachModifyTime(Date csysExcelAttachModifyTime) {
        this.csysExcelAttachModifyTime = csysExcelAttachModifyTime;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_CREATE_USER
     */
    public String getCsysExcelAttachCreateUser() {
        return csysExcelAttachCreateUser;
    }

    /**
     * @param csysExcelAttachCreateUser
     */
    public void setCsysExcelAttachCreateUser(String csysExcelAttachCreateUser) {
        this.csysExcelAttachCreateUser = csysExcelAttachCreateUser;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_MODIFY_USER
     */
    public String getCsysExcelAttachModifyUser() {
        return csysExcelAttachModifyUser;
    }

    /**
     * @param csysExcelAttachModifyUser
     */
    public void setCsysExcelAttachModifyUser(String csysExcelAttachModifyUser) {
        this.csysExcelAttachModifyUser = csysExcelAttachModifyUser;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_IS_DELETE
     */
    public String getCsysExcelAttachIsDelete() {
        return csysExcelAttachIsDelete;
    }

    /**
     * @param csysExcelAttachIsDelete
     */
    public void setCsysExcelAttachIsDelete(String csysExcelAttachIsDelete) {
        this.csysExcelAttachIsDelete = csysExcelAttachIsDelete;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_TIME
     */
    public Date getCsysExcelAttachTime() {
        return csysExcelAttachTime;
    }

    /**
     * @param csysExcelAttachTime
     */
    public void setCsysExcelAttachTime(Date csysExcelAttachTime) {
        this.csysExcelAttachTime = csysExcelAttachTime;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_DATE
     */
    public Date getCsysExcelAttachDate() {
        return csysExcelAttachDate;
    }

    /**
     * @param csysExcelAttachDate
     */
    public void setCsysExcelAttachDate(Date csysExcelAttachDate) {
        this.csysExcelAttachDate = csysExcelAttachDate;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_IS_PRIMARY
     */
    public String getCsysExcelAttachIsPrimary() {
        return csysExcelAttachIsPrimary;
    }

    /**
     * @param csysExcelAttachIsPrimary
     */
    public void setCsysExcelAttachIsPrimary(String csysExcelAttachIsPrimary) {
        this.csysExcelAttachIsPrimary = csysExcelAttachIsPrimary;
    }

    /**
     * @return CSYS_EXCEL_ATTACH_TRANSFERSQL
     */
    public String getCsysExcelAttachTransfersql() {
        return csysExcelAttachTransfersql;
    }

    /**
     * @param csysExcelAttachTransfersql
     */
    public void setCsysExcelAttachTransfersql(String csysExcelAttachTransfersql) {
        this.csysExcelAttachTransfersql = csysExcelAttachTransfersql;
    }
}