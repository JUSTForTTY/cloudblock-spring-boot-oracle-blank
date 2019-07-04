package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_TRS_RULEDL")
public class CsysTrsRuledl {
    @Id
    @Column(name = "CSYS_TRS_RULEDL_ID")
    private String csysTrsRuledlId;

    @Column(name = "CSYS_TRS_RULE_ID")
    private String csysTrsRuleId;

    @Column(name = "CSYS_TRS_RULESQL_ID")
    private String csysTrsRulesqlId;

    @Column(name = "CSYS_TRS_RULEDL_CUR_STYLEID")
    private String csysTrsRuledlCurStyleid;

    @Column(name = "CSYS_TRS_RULEDL_TARGET_STYLEID")
    private String csysTrsRuledlTargetStyleid;

    @Column(name = "CSYS_TRS_RULEDL_CREATE_TIME")
    private Date csysTrsRuledlCreateTime;

    @Column(name = "CSYS_TRS_RULEDL_CREATE_USER")
    private String csysTrsRuledlCreateUser;

    @Column(name = "CSYS_TRS_RULEDL_MODIFY_TIME")
    private Date csysTrsRuledlModifyTime;

    @Column(name = "CSYS_TRS_RULEDL_MODIFY_USER")
    private String csysTrsRuledlModifyUser;

    @Column(name = "CSYS_TRS_RULEDL_IS_DELETE")
    private String csysTrsRuledlIsDelete;

    @Column(name = "CSYS_TRS_RULEDL_TIME")
    private Date csysTrsRuledlTime;

    @Column(name = "CSYS_TRS_RULEDL_DATE")
    private Date csysTrsRuledlDate;

    /**
     * @return CSYS_TRS_RULEDL_ID
     */
    public String getCsysTrsRuledlId() {
        return csysTrsRuledlId;
    }

    /**
     * @param csysTrsRuledlId
     */
    public void setCsysTrsRuledlId(String csysTrsRuledlId) {
        this.csysTrsRuledlId = csysTrsRuledlId;
    }

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
     * @return CSYS_TRS_RULESQL_ID
     */
    public String getCsysTrsRulesqlId() {
        return csysTrsRulesqlId;
    }

    /**
     * @param csysTrsRulesqlId
     */
    public void setCsysTrsRulesqlId(String csysTrsRulesqlId) {
        this.csysTrsRulesqlId = csysTrsRulesqlId;
    }

    /**
     * @return CSYS_TRS_RULEDL_CUR_STYLEID
     */
    public String getCsysTrsRuledlCurStyleid() {
        return csysTrsRuledlCurStyleid;
    }

    /**
     * @param csysTrsRuledlCurStyleid
     */
    public void setCsysTrsRuledlCurStyleid(String csysTrsRuledlCurStyleid) {
        this.csysTrsRuledlCurStyleid = csysTrsRuledlCurStyleid;
    }

    /**
     * @return CSYS_TRS_RULEDL_TARGET_STYLEID
     */
    public String getCsysTrsRuledlTargetStyleid() {
        return csysTrsRuledlTargetStyleid;
    }

    /**
     * @param csysTrsRuledlTargetStyleid
     */
    public void setCsysTrsRuledlTargetStyleid(String csysTrsRuledlTargetStyleid) {
        this.csysTrsRuledlTargetStyleid = csysTrsRuledlTargetStyleid;
    }

    /**
     * @return CSYS_TRS_RULEDL_CREATE_TIME
     */
    public Date getCsysTrsRuledlCreateTime() {
        return csysTrsRuledlCreateTime;
    }

    /**
     * @param csysTrsRuledlCreateTime
     */
    public void setCsysTrsRuledlCreateTime(Date csysTrsRuledlCreateTime) {
        this.csysTrsRuledlCreateTime = csysTrsRuledlCreateTime;
    }

    /**
     * @return CSYS_TRS_RULEDL_CREATE_USER
     */
    public String getCsysTrsRuledlCreateUser() {
        return csysTrsRuledlCreateUser;
    }

    /**
     * @param csysTrsRuledlCreateUser
     */
    public void setCsysTrsRuledlCreateUser(String csysTrsRuledlCreateUser) {
        this.csysTrsRuledlCreateUser = csysTrsRuledlCreateUser;
    }

    /**
     * @return CSYS_TRS_RULEDL_MODIFY_TIME
     */
    public Date getCsysTrsRuledlModifyTime() {
        return csysTrsRuledlModifyTime;
    }

    /**
     * @param csysTrsRuledlModifyTime
     */
    public void setCsysTrsRuledlModifyTime(Date csysTrsRuledlModifyTime) {
        this.csysTrsRuledlModifyTime = csysTrsRuledlModifyTime;
    }

    /**
     * @return CSYS_TRS_RULEDL_MODIFY_USER
     */
    public String getCsysTrsRuledlModifyUser() {
        return csysTrsRuledlModifyUser;
    }

    /**
     * @param csysTrsRuledlModifyUser
     */
    public void setCsysTrsRuledlModifyUser(String csysTrsRuledlModifyUser) {
        this.csysTrsRuledlModifyUser = csysTrsRuledlModifyUser;
    }

    /**
     * @return CSYS_TRS_RULEDL_IS_DELETE
     */
    public String getCsysTrsRuledlIsDelete() {
        return csysTrsRuledlIsDelete;
    }

    /**
     * @param csysTrsRuledlIsDelete
     */
    public void setCsysTrsRuledlIsDelete(String csysTrsRuledlIsDelete) {
        this.csysTrsRuledlIsDelete = csysTrsRuledlIsDelete;
    }

    /**
     * @return CSYS_TRS_RULEDL_TIME
     */
    public Date getCsysTrsRuledlTime() {
        return csysTrsRuledlTime;
    }

    /**
     * @param csysTrsRuledlTime
     */
    public void setCsysTrsRuledlTime(Date csysTrsRuledlTime) {
        this.csysTrsRuledlTime = csysTrsRuledlTime;
    }

    /**
     * @return CSYS_TRS_RULEDL_DATE
     */
    public Date getCsysTrsRuledlDate() {
        return csysTrsRuledlDate;
    }

    /**
     * @param csysTrsRuledlDate
     */
    public void setCsysTrsRuledlDate(Date csysTrsRuledlDate) {
        this.csysTrsRuledlDate = csysTrsRuledlDate;
    }
}