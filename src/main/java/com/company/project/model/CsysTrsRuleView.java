package com.company.project.model;

import javax.persistence.*;

@Table(name = "CSYS_TRS_RULE_VIEW")
public class CsysTrsRuleView {
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

    @Column(name = "CSYS_TRS_RULESQL_RAW_DATA")
    private String csysTrsRulesqlRawData;

    @Column(name = "CSYS_TRS_RULESQL_METHOD")
    private String csysTrsRulesqlMethod;

    @Column(name = "CSYS_TRS_RULESQL_CONTRAST_DATA")
    private String csysTrsRulesqlContrastData;

    @Column(name = "CSYS_TRS_RULESQL_INFO")
    private String csysTrsRulesqlInfo;

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
     * @return CSYS_TRS_RULESQL_RAW_DATA
     */
    public String getCsysTrsRulesqlRawData() {
        return csysTrsRulesqlRawData;
    }

    /**
     * @param csysTrsRulesqlRawData
     */
    public void setCsysTrsRulesqlRawData(String csysTrsRulesqlRawData) {
        this.csysTrsRulesqlRawData = csysTrsRulesqlRawData;
    }

    /**
     * @return CSYS_TRS_RULESQL_METHOD
     */
    public String getCsysTrsRulesqlMethod() {
        return csysTrsRulesqlMethod;
    }

    /**
     * @param csysTrsRulesqlMethod
     */
    public void setCsysTrsRulesqlMethod(String csysTrsRulesqlMethod) {
        this.csysTrsRulesqlMethod = csysTrsRulesqlMethod;
    }

    /**
     * @return CSYS_TRS_RULESQL_CONTRAST_DATA
     */
    public String getCsysTrsRulesqlContrastData() {
        return csysTrsRulesqlContrastData;
    }

    /**
     * @param csysTrsRulesqlContrastData
     */
    public void setCsysTrsRulesqlContrastData(String csysTrsRulesqlContrastData) {
        this.csysTrsRulesqlContrastData = csysTrsRulesqlContrastData;
    }

    /**
     * @return CSYS_TRS_RULESQL_INFO
     */
    public String getCsysTrsRulesqlInfo() {
        return csysTrsRulesqlInfo;
    }

    /**
     * @param csysTrsRulesqlInfo
     */
    public void setCsysTrsRulesqlInfo(String csysTrsRulesqlInfo) {
        this.csysTrsRulesqlInfo = csysTrsRulesqlInfo;
    }
}