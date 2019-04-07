package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT")
public class CsysPot {
	@Id
	@Column(name = "CSYS_POT_ID")
	private String csysPotId;

	@Column(name = "CSYS_POT_PUBLIC_ID")
	private String csysPotPublicId;

	@Column(name = "CSYS_POT_NAME")
	private String csysPotName;

	@Column(name = "CSYS_WORKFLOW_ID")
	private String csysWorkflowId;

	@Column(name = "CSYS_WORKFLOW_NAME")
	private String csysWorkflowName;

	@Column(name = "CSYS_POT_TABLE")
	private String csysPotTable;

	@Column(name = "CSYS_POT_TYPE")
	private String csysPotType;

	@Column(name = "CSYS_POT_ATRRIBUTE")
	private String csysPotAtrribute;

	@Column(name = "CSYS_POT_DESC")
	private String csysPotDesc;

	@Column(name = "CSYS_POT_CREATE_TIME")
	private Date csysPotCreateTime;

	@Column(name = "CSYS_POT_CREATE_USER")
	private String csysPotCreateUser;

	@Column(name = "CSYS_POT_MODIFY_TIME")
	private Date csysPotModifyTime;

	@Column(name = "CSYS_POT_MODIFY_USER")
	private String csysPotModifyUser;

	@Column(name = "CSYS_POT_IS_DELETE")
	private String csysPotIsDelete;

	@Column(name = "CSYS_POT_TIME")
	private Date csysPotTime;

	@Column(name = "CSYS_POT_DATE")
	private Date csysPotDate;

	/**
	 * @return CSYS_POT_ID
	 */
	public String getCsysPotId() {
		return csysPotId;
	}

	/**
	 * @param csysPotId
	 */
	public void setCsysPotId(String csysPotId) {
		this.csysPotId = csysPotId;
	}

	/**
	 * @return CSYS_POT_PUBLIC_ID
	 */
	public String getCsysPotPublicId() {
		return csysPotPublicId;
	}

	/**
	 * @param csysPotPublicId
	 */
	public void setCsysPotPublicId(String csysPotPublicId) {
		this.csysPotPublicId = csysPotPublicId;
	}

	/**
	 * @return CSYS_POT_NAME
	 */
	public String getCsysPotName() {
		return csysPotName;
	}

	/**
	 * @param csysPotName
	 */
	public void setCsysPotName(String csysPotName) {
		this.csysPotName = csysPotName;
	}

	/**
	 * @return CSYS_WORKFLOW_ID
	 */
	public String getCsysWorkflowId() {
		return csysWorkflowId;
	}

	/**
	 * @param csysWorkflowId
	 */
	public void setCsysWorkflowId(String csysWorkflowId) {
		this.csysWorkflowId = csysWorkflowId;
	}

	/**
	 * @return CSYS_WORKFLOW_NAME
	 */
	public String getCsysWorkflowName() {
		return csysWorkflowName;
	}

	/**
	 * @param csysWorkflowName
	 */
	public void setCsysWorkflowName(String csysWorkflowName) {
		this.csysWorkflowName = csysWorkflowName;
	}

	/**
	 * @return CSYS_POT_TABLE
	 */
	public String getCsysPotTable() {
		return csysPotTable;
	}

	/**
	 * @param csysPotTable
	 */
	public void setCsysPotTable(String csysPotTable) {
		this.csysPotTable = csysPotTable;
	}

	/**
	 * @return CSYS_POT_TYPE
	 */
	public String getCsysPotType() {
		return csysPotType;
	}

	/**
	 * @param csysPotType
	 */
	public void setCsysPotType(String csysPotType) {
		this.csysPotType = csysPotType;
	}

	/**
	 * @return CSYS_POT_ATRRIBUTE
	 */
	public String getCsysPotAtrribute() {
		return csysPotAtrribute;
	}

	/**
	 * @param csysPotAtrribute
	 */
	public void setCsysPotAtrribute(String csysPotAtrribute) {
		this.csysPotAtrribute = csysPotAtrribute;
	}

	/**
	 * @return CSYS_POT_DESC
	 */
	public String getCsysPotDesc() {
		return csysPotDesc;
	}

	/**
	 * @param csysPotDesc
	 */
	public void setCsysPotDesc(String csysPotDesc) {
		this.csysPotDesc = csysPotDesc;
	}

	/**
	 * @return CSYS_POT_CREATE_TIME
	 */
	public Date getCsysPotCreateTime() {
		return csysPotCreateTime;
	}

	/**
	 * @param csysPotCreateTime
	 */
	public void setCsysPotCreateTime(Date csysPotCreateTime) {
		this.csysPotCreateTime = csysPotCreateTime;
	}

	/**
	 * @return CSYS_POT_CREATE_USER
	 */
	public String getCsysPotCreateUser() {
		return csysPotCreateUser;
	}

	/**
	 * @param csysPotCreateUser
	 */
	public void setCsysPotCreateUser(String csysPotCreateUser) {
		this.csysPotCreateUser = csysPotCreateUser;
	}

	/**
	 * @return CSYS_POT_MODIFY_TIME
	 */
	public Date getCsysPotModifyTime() {
		return csysPotModifyTime;
	}

	/**
	 * @param csysPotModifyTime
	 */
	public void setCsysPotModifyTime(Date csysPotModifyTime) {
		this.csysPotModifyTime = csysPotModifyTime;
	}

	/**
	 * @return CSYS_POT_MODIFY_USER
	 */
	public String getCsysPotModifyUser() {
		return csysPotModifyUser;
	}

	/**
	 * @param csysPotModifyUser
	 */
	public void setCsysPotModifyUser(String csysPotModifyUser) {
		this.csysPotModifyUser = csysPotModifyUser;
	}

	/**
	 * @return CSYS_POT_IS_DELETE
	 */
	public String getCsysPotIsDelete() {
		return csysPotIsDelete;
	}

	/**
	 * @param csysPotIsDelete
	 */
	public void setCsysPotIsDelete(String csysPotIsDelete) {
		this.csysPotIsDelete = csysPotIsDelete;
	}

	/**
	 * @return CSYS_POT_TIME
	 */
	public Date getCsysPotTime() {
		return csysPotTime;
	}

	/**
	 * @param csysPotTime
	 */
	public void setCsysPotTime(Date csysPotTime) {
		this.csysPotTime = csysPotTime;
	}

	/**
	 * @return CSYS_POT_DATE
	 */
	public Date getCsysPotDate() {
		return csysPotDate;
	}

	/**
	 * @param csysPotDate
	 */
	public void setCsysPotDate(Date csysPotDate) {
		this.csysPotDate = csysPotDate;
	}

	@Override
	public String toString() {
		return "CsysPot [csysPotId=" + csysPotId + ", csysPotPublicId=" + csysPotPublicId + ", csysPotName="
				+ csysPotName + ", csysWorkflowId=" + csysWorkflowId + ", csysWorkflowName=" + csysWorkflowName
				+ ", csysPotTable=" + csysPotTable + ", csysPotType=" + csysPotType + ", csysPotAtrribute="
				+ csysPotAtrribute + ", csysPotDesc=" + csysPotDesc + ", csysPotCreateTime=" + csysPotCreateTime
				+ ", csysPotCreateUser=" + csysPotCreateUser + ", csysPotModifyTime=" + csysPotModifyTime
				+ ", csysPotModifyUser=" + csysPotModifyUser + ", csysPotIsDelete=" + csysPotIsDelete + ", csysPotTime="
				+ csysPotTime + ", csysPotDate=" + csysPotDate + "]";
	}

}