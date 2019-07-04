package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_RULE")
public class CsysTrsRule {
    @Id
    @Column(name = "CSYS_TRS_RULE_ID")
    private String csysTrsRuleId;

    @Column(name = "CSYS_TRS_RULE_NAME")
    private String csysTrsRuleName;

    @Column(name = "CSYS_POT_STYLE_ID")
    private String csysPotStyleId;

    @Column(name = "CSYS_TRS_RULE_ISMAIN")
    private String csysTrsRuleIsmain;

    @Column(name = "CSYS_TRS_RULE_DESC")
    private String csysTrsRuleDesc;

    @Column(name = "CSYS_TRS_RULE_CREATE_TIME")
    private Date csysTrsRuleCreateTime;

    @Column(name = "CSYS_TRS_RULE_CREATE_USER")
    private String csysTrsRuleCreateUser;

    @Column(name = "CSYS_TRS_RULE_MODIFY_TIME")
    private Date csysTrsRuleModifyTime;

    @Column(name = "CSYS_TRS_RULE_MODIFY_USER")
    private String csysTrsRuleModifyUser;

    @Column(name = "CSYS_TRS_RULE_IS_DELETE")
    private String csysTrsRuleIsDelete;

    @Column(name = "CSYS_TRS_RULE_TIME")
    private Date csysTrsRuleTime;

    @Column(name = "CSYS_TRS_RULE_DATE")
    private Date csysTrsRuleDate;

    /**
     * @return CSYS_TRS_RULE_ID
     */
    public String getCsysTrsRuleId() {
        return csysTrsRuleId;
    }

    /**
     * @param csysTrsRuleId
     */
    public void setCsysTrsRuleId(String csysTrsRuleId) {
        this.csysTrsRuleId = csysTrsRuleId;
    }

    /**
     * @return CSYS_TRS_RULE_NAME
     */
    public String getCsysTrsRuleName() {
        return csysTrsRuleName;
    }

    /**
     * @param csysTrsRuleName
     */
    public void setCsysTrsRuleName(String csysTrsRuleName) {
        this.csysTrsRuleName = csysTrsRuleName;
    }

    /**
     * @return CSYS_POT_STYLE_ID
     */
    public String getCsysPotStyleId() {
        return csysPotStyleId;
    }

    /**
     * @param csysPotStyleId
     */
    public void setCsysPotStyleId(String csysPotStyleId) {
        this.csysPotStyleId = csysPotStyleId;
    }

    /**
     * @return CSYS_TRS_RULE_ISMAIN
     */
    public String getCsysTrsRuleIsmain() {
        return csysTrsRuleIsmain;
    }

    /**
     * @param csysTrsRuleIsmain
     */
    public void setCsysTrsRuleIsmain(String csysTrsRuleIsmain) {
        this.csysTrsRuleIsmain = csysTrsRuleIsmain;
    }

    /**
     * @return CSYS_TRS_RULE_DESC
     */
    public String getCsysTrsRuleDesc() {
        return csysTrsRuleDesc;
    }

    /**
     * @param csysTrsRuleDesc
     */
    public void setCsysTrsRuleDesc(String csysTrsRuleDesc) {
        this.csysTrsRuleDesc = csysTrsRuleDesc;
    }

    /**
     * @return CSYS_TRS_RULE_CREATE_TIME
     */
    public Date getCsysTrsRuleCreateTime() {
        return csysTrsRuleCreateTime;
    }

    /**
     * @param csysTrsRuleCreateTime
     */
    public void setCsysTrsRuleCreateTime(Date csysTrsRuleCreateTime) {
        this.csysTrsRuleCreateTime = csysTrsRuleCreateTime;
    }

    /**
     * @return CSYS_TRS_RULE_CREATE_USER
     */
    public String getCsysTrsRuleCreateUser() {
        return csysTrsRuleCreateUser;
    }

    /**
     * @param csysTrsRuleCreateUser
     */
    public void setCsysTrsRuleCreateUser(String csysTrsRuleCreateUser) {
        this.csysTrsRuleCreateUser = csysTrsRuleCreateUser;
    }

    /**
     * @return CSYS_TRS_RULE_MODIFY_TIME
     */
    public Date getCsysTrsRuleModifyTime() {
        return csysTrsRuleModifyTime;
    }

    /**
     * @param csysTrsRuleModifyTime
     */
    public void setCsysTrsRuleModifyTime(Date csysTrsRuleModifyTime) {
        this.csysTrsRuleModifyTime = csysTrsRuleModifyTime;
    }

    /**
     * @return CSYS_TRS_RULE_MODIFY_USER
     */
    public String getCsysTrsRuleModifyUser() {
        return csysTrsRuleModifyUser;
    }

    /**
     * @param csysTrsRuleModifyUser
     */
    public void setCsysTrsRuleModifyUser(String csysTrsRuleModifyUser) {
        this.csysTrsRuleModifyUser = csysTrsRuleModifyUser;
    }

    /**
     * @return CSYS_TRS_RULE_IS_DELETE
     */
    public String getCsysTrsRuleIsDelete() {
        return csysTrsRuleIsDelete;
    }

    /**
     * @param csysTrsRuleIsDelete
     */
    public void setCsysTrsRuleIsDelete(String csysTrsRuleIsDelete) {
        this.csysTrsRuleIsDelete = csysTrsRuleIsDelete;
    }

    /**
     * @return CSYS_TRS_RULE_TIME
     */
    public Date getCsysTrsRuleTime() {
        return csysTrsRuleTime;
    }

    /**
     * @param csysTrsRuleTime
     */
    public void setCsysTrsRuleTime(Date csysTrsRuleTime) {
        this.csysTrsRuleTime = csysTrsRuleTime;
    }

    /**
     * @return CSYS_TRS_RULE_DATE
     */
    public Date getCsysTrsRuleDate() {
        return csysTrsRuleDate;
    }

    /**
     * @param csysTrsRuleDate
     */
    public void setCsysTrsRuleDate(Date csysTrsRuleDate) {
        this.csysTrsRuleDate = csysTrsRuleDate;
    }
}