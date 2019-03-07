package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_EXCEL_IMPORT_VIEW")
public class CsysExcelImportView {
	@Id
	@Column(name = "CSYS_EXCEL_ATTACH_ID")
	private String csysExcelAttachId;

	@Column(name = "CSYS_EXCEL_ATTACH_FIELD_ROW")
	private Integer csysExcelAttachFieldRow;

	@Column(name = "CSYS_EXCEL_ATTACH_FIELD_COLUMN")
	private Integer csysExcelAttachFieldColumn;

	@Column(name = "CSYS_EXCEL_ATTACH_FIELD_NAME")
	private String csysExcelAttachFieldName;

	@Column(name = "CSYS_EXCEL_ATTACH_FIELD_DESC")
	private String csysExcelAttachFieldDesc;

	@Column(name = "CSYS_EXCEL_IMPORT_ID")
	private String csysExcelImportId;

	@Column(name = "CSYS_EXCEL_IMPORT_NAME")
	private String csysExcelImportName;

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

	@Column(name = "CSYS_EXCEL_IMPORT_TIME")
	private Date csysExcelImportTime;

	@Column(name = "CSYS_EXCEL_IMPORT_DATE")
	private Date csysExcelImportDate;

	@Column(name = "CSYS_FIELD_INFO_ID")
	private String csysFieldInfoId;

	@Column(name = "CSYS_FIELD_INFO_NAME")
	private String csysFieldInfoName;

	@Column(name = "CSYS_FIELD_INFO_RELNAME")
	private String csysFieldInfoRelname;

	@Column(name = "CSYS_FIELD_INFO_REGION")
	private String csysFieldInfoRegion;

	@Column(name = "CSYS_FIELD_INFO_ATTRIBUTE")
	private String csysFieldInfoAttribute;

	@Column(name = "CSYS_FIELD_INFO_TYPE")
	private String csysFieldInfoType;

	@Column(name = "CSYS_FIELD_INFO_DEFAULT")
	private String csysFieldInfoDefault;

	@Column(name = "CSYS_FIELD_INFO_DATE")
	private Date csysFieldInfoDate;

	@Column(name = "CSYS_VIEW_EXPLAIN_ID")
	private String csysViewExplainId;

	@Column(name = "CSYS_VIEW_EXPLAIN_NAME")
	private String csysViewExplainName;

	@Column(name = "CSYS_VIEW_EXPLAIN_TYPE")
	private String csysViewExplainType;

	@Column(name = "CSYS_VIEW_EXPLAIN_DESC")
	private String csysViewExplainDesc;

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
	 * @return CSYS_FIELD_INFO_NAME
	 */
	public String getCsysFieldInfoName() {
		return csysFieldInfoName;
	}

	/**
	 * @param csysFieldInfoName
	 */
	public void setCsysFieldInfoName(String csysFieldInfoName) {
		this.csysFieldInfoName = csysFieldInfoName;
	}

	/**
	 * @return CSYS_FIELD_INFO_RELNAME
	 */
	public String getCsysFieldInfoRelname() {
		return csysFieldInfoRelname;
	}

	/**
	 * @param csysFieldInfoRelname
	 */
	public void setCsysFieldInfoRelname(String csysFieldInfoRelname) {
		this.csysFieldInfoRelname = csysFieldInfoRelname;
	}

	/**
	 * @return CSYS_FIELD_INFO_REGION
	 */
	public String getCsysFieldInfoRegion() {
		return csysFieldInfoRegion;
	}

	/**
	 * @param csysFieldInfoRegion
	 */
	public void setCsysFieldInfoRegion(String csysFieldInfoRegion) {
		this.csysFieldInfoRegion = csysFieldInfoRegion;
	}

	/**
	 * @return CSYS_FIELD_INFO_ATTRIBUTE
	 */
	public String getCsysFieldInfoAttribute() {
		return csysFieldInfoAttribute;
	}

	/**
	 * @param csysFieldInfoAttribute
	 */
	public void setCsysFieldInfoAttribute(String csysFieldInfoAttribute) {
		this.csysFieldInfoAttribute = csysFieldInfoAttribute;
	}

	/**
	 * @return CSYS_FIELD_INFO_TYPE
	 */
	public String getCsysFieldInfoType() {
		return csysFieldInfoType;
	}

	/**
	 * @param csysFieldInfoType
	 */
	public void setCsysFieldInfoType(String csysFieldInfoType) {
		this.csysFieldInfoType = csysFieldInfoType;
	}

	/**
	 * @return CSYS_FIELD_INFO_DEFAULT
	 */
	public String getCsysFieldInfoDefault() {
		return csysFieldInfoDefault;
	}

	/**
	 * @param csysFieldInfoDefault
	 */
	public void setCsysFieldInfoDefault(String csysFieldInfoDefault) {
		this.csysFieldInfoDefault = csysFieldInfoDefault;
	}

	/**
	 * @return CSYS_FIELD_INFO_DATE
	 */
	public Date getCsysFieldInfoDate() {
		return csysFieldInfoDate;
	}

	/**
	 * @param csysFieldInfoDate
	 */
	public void setCsysFieldInfoDate(Date csysFieldInfoDate) {
		this.csysFieldInfoDate = csysFieldInfoDate;
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
	 * @return CSYS_VIEW_EXPLAIN_NAME
	 */
	public String getCsysViewExplainName() {
		return csysViewExplainName;
	}

	/**
	 * @param csysViewExplainName
	 */
	public void setCsysViewExplainName(String csysViewExplainName) {
		this.csysViewExplainName = csysViewExplainName;
	}

	/**
	 * @return CSYS_VIEW_EXPLAIN_TYPE
	 */
	public String getCsysViewExplainType() {
		return csysViewExplainType;
	}

	/**
	 * @param csysViewExplainType
	 */
	public void setCsysViewExplainType(String csysViewExplainType) {
		this.csysViewExplainType = csysViewExplainType;
	}

	/**
	 * @return CSYS_VIEW_EXPLAIN_DESC
	 */
	public String getCsysViewExplainDesc() {
		return csysViewExplainDesc;
	}

	/**
	 * @param csysViewExplainDesc
	 */
	public void setCsysViewExplainDesc(String csysViewExplainDesc) {
		this.csysViewExplainDesc = csysViewExplainDesc;
	}
}