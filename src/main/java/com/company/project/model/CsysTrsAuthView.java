package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_AUTH_VIEW")
public class CsysTrsAuthView {
	@Id
    @Column(name = "CSYS_POT_TRS_ID")
    private String csysPotTrsId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_POT_CURRENT_ID")
    private String csysPotCurrentId;

    @Column(name = "CSYS_POT_CURRENT_NAME")
    private String csysPotCurrentName;

    @Column(name = "CSYS_POT_CURRENT_TABLE")
    private String csysPotCurrentTable;

    @Column(name = "CSYS_POT_TRS_POINT_ID")
    private String csysPotTrsPointId;

    @Column(name = "CSYS_POT_TRS_POINT_NAME")
    private String csysPotTrsPointName;

    @Column(name = "CSYS_POT_TRS_TABLE")
    private String csysPotTrsTable;

    @Column(name = "CSYS_POT_TRS_LONGEST_TIME")
    private BigDecimal csysPotTrsLongestTime;

    @Column(name = "CSYS_POT_TRS_LEAST_TIME")
    private BigDecimal csysPotTrsLeastTime;

    @Column(name = "CSYS_POT_TRS_CONFIRM")
    private Integer csysPotTrsConfirm;

    @Column(name = "CSYS_POT_TRS_ALL_EXE")
    private String csysPotTrsAllExe;

    @Column(name = "CSYS_POT_TRS_AUTO_EXE")
    private String csysPotTrsAutoExe;

    @Column(name = "CSYS_POT_TRS_REMAIND")
    private String csysPotTrsRemaind;

    @Column(name = "CSYS_POT_TRS_DESC")
    private String csysPotTrsDesc;

    @Column(name = "CSYS_POT_TRS_TIME")
    private Date csysPotTrsTime;

    @Column(name = "CSYS_POT_TRS_DATE")
    private Date csysPotTrsDate;

    @Column(name = "CSYS_TRS_AUTH_ID")
    private String csysTrsAuthId;

    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_TRS_AUTH_DESC")
    private String csysTrsAuthDesc;

    @Column(name = "CSYS_CODEMASTER_DESC")
    private String csysCodemasterDesc;

    /**
     * @return CSYS_POT_TRS_ID
     */
    public String getCsysPotTrsId() {
        return csysPotTrsId;
    }

    /**
     * @param csysPotTrsId
     */
    public void setCsysPotTrsId(String csysPotTrsId) {
        this.csysPotTrsId = csysPotTrsId;
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
     * @return CSYS_POT_CURRENT_ID
     */
    public String getCsysPotCurrentId() {
        return csysPotCurrentId;
    }

    /**
     * @param csysPotCurrentId
     */
    public void setCsysPotCurrentId(String csysPotCurrentId) {
        this.csysPotCurrentId = csysPotCurrentId;
    }

    /**
     * @return CSYS_POT_CURRENT_NAME
     */
    public String getCsysPotCurrentName() {
        return csysPotCurrentName;
    }

    /**
     * @param csysPotCurrentName
     */
    public void setCsysPotCurrentName(String csysPotCurrentName) {
        this.csysPotCurrentName = csysPotCurrentName;
    }

    /**
     * @return CSYS_POT_CURRENT_TABLE
     */
    public String getCsysPotCurrentTable() {
        return csysPotCurrentTable;
    }

    /**
     * @param csysPotCurrentTable
     */
    public void setCsysPotCurrentTable(String csysPotCurrentTable) {
        this.csysPotCurrentTable = csysPotCurrentTable;
    }

    /**
     * @return CSYS_POT_TRS_POINT_ID
     */
    public String getCsysPotTrsPointId() {
        return csysPotTrsPointId;
    }

    /**
     * @param csysPotTrsPointId
     */
    public void setCsysPotTrsPointId(String csysPotTrsPointId) {
        this.csysPotTrsPointId = csysPotTrsPointId;
    }

    /**
     * @return CSYS_POT_TRS_POINT_NAME
     */
    public String getCsysPotTrsPointName() {
        return csysPotTrsPointName;
    }

    /**
     * @param csysPotTrsPointName
     */
    public void setCsysPotTrsPointName(String csysPotTrsPointName) {
        this.csysPotTrsPointName = csysPotTrsPointName;
    }

    /**
     * @return CSYS_POT_TRS_TABLE
     */
    public String getCsysPotTrsTable() {
        return csysPotTrsTable;
    }

    /**
     * @param csysPotTrsTable
     */
    public void setCsysPotTrsTable(String csysPotTrsTable) {
        this.csysPotTrsTable = csysPotTrsTable;
    }

    /**
     * @return CSYS_POT_TRS_LONGEST_TIME
     */
    public BigDecimal getCsysPotTrsLongestTime() {
        return csysPotTrsLongestTime;
    }

    /**
     * @param csysPotTrsLongestTime
     */
    public void setCsysPotTrsLongestTime(BigDecimal csysPotTrsLongestTime) {
        this.csysPotTrsLongestTime = csysPotTrsLongestTime;
    }

    /**
     * @return CSYS_POT_TRS_LEAST_TIME
     */
    public BigDecimal getCsysPotTrsLeastTime() {
        return csysPotTrsLeastTime;
    }

    /**
     * @param csysPotTrsLeastTime
     */
    public void setCsysPotTrsLeastTime(BigDecimal csysPotTrsLeastTime) {
        this.csysPotTrsLeastTime = csysPotTrsLeastTime;
    }

    /**
     * @return CSYS_POT_TRS_CONFIRM
     */
    public Integer getCsysPotTrsConfirm() {
        return csysPotTrsConfirm;
    }

    /**
     * @param csysPotTrsConfirm
     */
    public void setCsysPotTrsConfirm(Integer csysPotTrsConfirm) {
        this.csysPotTrsConfirm = csysPotTrsConfirm;
    }

    /**
     * @return CSYS_POT_TRS_ALL_EXE
     */
    public String getCsysPotTrsAllExe() {
        return csysPotTrsAllExe;
    }

    /**
     * @param csysPotTrsAllExe
     */
    public void setCsysPotTrsAllExe(String csysPotTrsAllExe) {
        this.csysPotTrsAllExe = csysPotTrsAllExe;
    }

    /**
     * @return CSYS_POT_TRS_AUTO_EXE
     */
    public String getCsysPotTrsAutoExe() {
        return csysPotTrsAutoExe;
    }

    /**
     * @param csysPotTrsAutoExe
     */
    public void setCsysPotTrsAutoExe(String csysPotTrsAutoExe) {
        this.csysPotTrsAutoExe = csysPotTrsAutoExe;
    }

    /**
     * @return CSYS_POT_TRS_REMAIND
     */
    public String getCsysPotTrsRemaind() {
        return csysPotTrsRemaind;
    }

    /**
     * @param csysPotTrsRemaind
     */
    public void setCsysPotTrsRemaind(String csysPotTrsRemaind) {
        this.csysPotTrsRemaind = csysPotTrsRemaind;
    }

    /**
     * @return CSYS_POT_TRS_DESC
     */
    public String getCsysPotTrsDesc() {
        return csysPotTrsDesc;
    }

    /**
     * @param csysPotTrsDesc
     */
    public void setCsysPotTrsDesc(String csysPotTrsDesc) {
        this.csysPotTrsDesc = csysPotTrsDesc;
    }

    /**
     * @return CSYS_POT_TRS_TIME
     */
    public Date getCsysPotTrsTime() {
        return csysPotTrsTime;
    }

    /**
     * @param csysPotTrsTime
     */
    public void setCsysPotTrsTime(Date csysPotTrsTime) {
        this.csysPotTrsTime = csysPotTrsTime;
    }

    /**
     * @return CSYS_POT_TRS_DATE
     */
    public Date getCsysPotTrsDate() {
        return csysPotTrsDate;
    }

    /**
     * @param csysPotTrsDate
     */
    public void setCsysPotTrsDate(Date csysPotTrsDate) {
        this.csysPotTrsDate = csysPotTrsDate;
    }

    /**
     * @return CSYS_TRS_AUTH_ID
     */
    public String getCsysTrsAuthId() {
        return csysTrsAuthId;
    }

    /**
     * @param csysTrsAuthId
     */
    public void setCsysTrsAuthId(String csysTrsAuthId) {
        this.csysTrsAuthId = csysTrsAuthId;
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
     * @return CSYS_TRS_AUTH_DESC
     */
    public String getCsysTrsAuthDesc() {
        return csysTrsAuthDesc;
    }

    /**
     * @param csysTrsAuthDesc
     */
    public void setCsysTrsAuthDesc(String csysTrsAuthDesc) {
        this.csysTrsAuthDesc = csysTrsAuthDesc;
    }

    /**
     * @return CSYS_CODEMASTER_DESC
     */
    public String getCsysCodemasterDesc() {
        return csysCodemasterDesc;
    }

    /**
     * @param csysCodemasterDesc
     */
    public void setCsysCodemasterDesc(String csysCodemasterDesc) {
        this.csysCodemasterDesc = csysCodemasterDesc;
    }
}