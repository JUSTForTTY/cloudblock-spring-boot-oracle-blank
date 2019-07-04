package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsRuledlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsRuledlExample() {
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

        public Criteria andCsysTrsRuledlCreateTimeIsNull() {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME =", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME <>", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME >", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME >=", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME <", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME <=", value, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME in", values, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME not in", values, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME between", value1, value2, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_TIME not between", value1, value2, "csysTrsRuledlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserIsNull() {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER =", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER <>", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER >", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER >=", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER <", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER <=", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER like", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER not like", value, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER in", values, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER not in", values, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER between", value1, value2, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_CREATE_USER not between", value1, value2, "csysTrsRuledlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeIsNull() {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME =", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME <>", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME >", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME >=", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME <", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME <=", value, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME in", values, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME not in", values, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME between", value1, value2, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_TIME not between", value1, value2, "csysTrsRuledlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserIsNull() {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER =", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER <>", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER >", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER >=", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER <", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER <=", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER like", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER not like", value, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER in", values, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER not in", values, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER between", value1, value2, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_MODIFY_USER not between", value1, value2, "csysTrsRuledlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteIsNull() {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE =", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE <>", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE >", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE >=", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE <", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE <=", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE like", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE not like", value, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE in", values, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE not in", values, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE between", value1, value2, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULEDL_IS_DELETE not between", value1, value2, "csysTrsRuledlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeIsNull() {
            addCriterion("CSYS_TRS_RULEDL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME =", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME <>", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME >", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME >=", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME <", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_TIME <=", value, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_TIME in", values, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_TIME not in", values, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_TIME between", value1, value2, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_TIME not between", value1, value2, "csysTrsRuledlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateIsNull() {
            addCriterion("CSYS_TRS_RULEDL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateIsNotNull() {
            addCriterion("CSYS_TRS_RULEDL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE =", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE <>", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE >", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE >=", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateLessThan(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE <", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULEDL_DATE <=", value, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_DATE in", values, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULEDL_DATE not in", values, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_DATE between", value1, value2, "csysTrsRuledlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuledlDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULEDL_DATE not between", value1, value2, "csysTrsRuledlDate");
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