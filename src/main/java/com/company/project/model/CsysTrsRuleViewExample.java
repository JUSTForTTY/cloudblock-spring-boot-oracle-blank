package com.company.project.model;

import java.util.ArrayList;
import java.util.List;

public class CsysTrsRuleViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsRuleViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCsysTrsRuledlIdIsNull() {
            addCriterion("CSYS_TRS_RULEDL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID =", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID <>", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID >", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID >=", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID <", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID <=", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID like", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_ID not like", value, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_ID in", values, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_ID not in", values, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_ID between", value1, value2, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_ID not between", value1, value2, "csysTrsRuledlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIsNull() {
            addCriterion("CSYS_TRS_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIsNotNull() {
            addCriterion("CSYS_TRS_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID =", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID <>", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_ID >", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID >=", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_ID <", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID <=", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLike(String value) {
            addCriterion("CSYS_TRS_RULE_ID like", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_ID not like", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ID in", values, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ID not in", values, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ID between", value1, value2, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ID not between", value1, value2, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdIsNull() {
            addCriterion("CSYS_TRS_RULESQL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID =", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID <>", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID >", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID >=", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID <", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID <=", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID like", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_ID not like", value, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_ID in", values, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_ID not in", values, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_ID between", value1, value2, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_ID not between", value1, value2, "csysTrsRulesqlId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidIsNull() {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID =", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID <>", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID >", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID >=", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID <", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID <=", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID like", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID not like", value, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID in", values, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID not in", values, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID between", value1, value2, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCurStyleidNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_CUR_STYLEID not between", value1, value2, "csysTrsRuledlCurStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidIsNull() {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID =", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID <>", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID >", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID >=", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID <", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID <=", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID like", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID not like", value, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID in", values, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID not in", values, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID between", value1, value2, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTargetStyleidNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_TARGET_STYLEID not between", value1, value2, "csysTrsRuledlTargetStyleid");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataIsNull() {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA =", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA <>", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA >", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA >=", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA <", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA <=", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA like", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA not like", value, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA in", values, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA not in", values, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA between", value1, value2, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlRawDataNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_RAW_DATA not between", value1, value2, "csysTrsRulesqlRawData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodIsNull() {
            addCriterion("CSYS_TRS_RULESQL_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD =", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD <>", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD >", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD >=", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD <", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD <=", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD like", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_METHOD not like", value, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_METHOD in", values, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_METHOD not in", values, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_METHOD between", value1, value2, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlMethodNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_METHOD not between", value1, value2, "csysTrsRulesqlMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataIsNull() {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA =", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA <>", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA >", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA >=", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA <", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA <=", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA like", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA not like", value, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA in", values, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA not in", values, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA between", value1, value2, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlContrastDataNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_CONTRAST_DATA not between", value1, value2, "csysTrsRulesqlContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoIsNull() {
            addCriterion("CSYS_TRS_RULESQL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO =", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO <>", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO >", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO >=", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO <", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO <=", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO like", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_INFO not like", value, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_INFO in", values, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_INFO not in", values, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_INFO between", value1, value2, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlInfoNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_INFO not between", value1, value2, "csysTrsRulesqlInfo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}