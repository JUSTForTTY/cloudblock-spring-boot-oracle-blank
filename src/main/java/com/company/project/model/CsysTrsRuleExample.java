package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsRuleExample() {
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

        public Criteria andCsysTrsRuleNameIsNull() {
            addCriterion("CSYS_TRS_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameIsNotNull() {
            addCriterion("CSYS_TRS_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_NAME =", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_NAME <>", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_NAME >", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_NAME >=", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_NAME <", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_NAME <=", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameLike(String value) {
            addCriterion("CSYS_TRS_RULE_NAME like", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_NAME not like", value, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_NAME in", values, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_NAME not in", values, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_NAME between", value1, value2, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_NAME not between", value1, value2, "csysTrsRuleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIsNull() {
            addCriterion("CSYS_POT_STYLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIsNotNull() {
            addCriterion("CSYS_POT_STYLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID =", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <>", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID >", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID >=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID <", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID not like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID not in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID not between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainIsNull() {
            addCriterion("CSYS_TRS_RULE_ISMAIN is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainIsNotNull() {
            addCriterion("CSYS_TRS_RULE_ISMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN =", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN <>", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN >", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN >=", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN <", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN <=", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainLike(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN like", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_ISMAIN not like", value, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ISMAIN in", values, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ISMAIN not in", values, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ISMAIN between", value1, value2, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsmainNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ISMAIN not between", value1, value2, "csysTrsRuleIsmain");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescIsNull() {
            addCriterion("CSYS_TRS_RULE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescIsNotNull() {
            addCriterion("CSYS_TRS_RULE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_DESC =", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_DESC <>", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_DESC >", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_DESC >=", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_DESC <", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_DESC <=", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescLike(String value) {
            addCriterion("CSYS_TRS_RULE_DESC like", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_DESC not like", value, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_DESC in", values, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_DESC not in", values, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_DESC between", value1, value2, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_DESC not between", value1, value2, "csysTrsRuleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeIsNull() {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME =", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME <>", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME >", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME >=", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME <", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME <=", value, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME in", values, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME not in", values, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME between", value1, value2, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_CREATE_TIME not between", value1, value2, "csysTrsRuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserIsNull() {
            addCriterion("CSYS_TRS_RULE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_RULE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER =", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER <>", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER >", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER >=", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER <", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER <=", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserLike(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER like", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER not like", value, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER in", values, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER not in", values, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER between", value1, value2, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_CREATE_USER not between", value1, value2, "csysTrsRuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeIsNull() {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME =", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME <>", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME >", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME >=", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME <", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME <=", value, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME in", values, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME not in", values, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME between", value1, value2, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_MODIFY_TIME not between", value1, value2, "csysTrsRuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserIsNull() {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER =", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER <>", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER >", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER >=", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER <", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER <=", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserLike(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER like", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER not like", value, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER in", values, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER not in", values, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER between", value1, value2, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_MODIFY_USER not between", value1, value2, "csysTrsRuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteIsNull() {
            addCriterion("CSYS_TRS_RULE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_RULE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE =", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE <>", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE >", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE >=", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE <", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE <=", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE like", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE not like", value, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE in", values, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE not in", values, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE between", value1, value2, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_IS_DELETE not between", value1, value2, "csysTrsRuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeIsNull() {
            addCriterion("CSYS_TRS_RULE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME =", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME <>", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME >", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME >=", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME <", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_TIME <=", value, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_TIME in", values, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_TIME not in", values, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_TIME between", value1, value2, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_TIME not between", value1, value2, "csysTrsRuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateIsNull() {
            addCriterion("CSYS_TRS_RULE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateIsNotNull() {
            addCriterion("CSYS_TRS_RULE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE =", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE <>", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE >", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE >=", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateLessThan(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE <", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULE_DATE <=", value, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_DATE in", values, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULE_DATE not in", values, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_DATE between", value1, value2, "csysTrsRuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULE_DATE not between", value1, value2, "csysTrsRuleDate");
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