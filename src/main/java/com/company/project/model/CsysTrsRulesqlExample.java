package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsRulesqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsRulesqlExample() {
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

        public Criteria andCsysTrsRulesqlCreateTimeIsNull() {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME =", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME <>", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME >", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME >=", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME <", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME <=", value, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME in", values, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME not in", values, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME between", value1, value2, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_TIME not between", value1, value2, "csysTrsRulesqlCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserIsNull() {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER =", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER <>", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER >", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER >=", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER <", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER <=", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER like", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER not like", value, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER in", values, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER not in", values, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER between", value1, value2, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_CREATE_USER not between", value1, value2, "csysTrsRulesqlCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeIsNull() {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME =", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME <>", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME >", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME >=", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME <", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME <=", value, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME in", values, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME not in", values, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME between", value1, value2, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_TIME not between", value1, value2, "csysTrsRulesqlModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserIsNull() {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER =", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER <>", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER >", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER >=", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER <", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER <=", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER like", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER not like", value, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER in", values, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER not in", values, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER between", value1, value2, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_MODIFY_USER not between", value1, value2, "csysTrsRulesqlModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteIsNull() {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE =", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE <>", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE >", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE >=", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE <", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE <=", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE like", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE not like", value, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE in", values, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE not in", values, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE between", value1, value2, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_IS_DELETE not between", value1, value2, "csysTrsRulesqlIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeIsNull() {
            addCriterion("CSYS_TRS_RULESQL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME =", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME <>", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME >", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME >=", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME <", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_TIME <=", value, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_TIME in", values, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_TIME not in", values, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_TIME between", value1, value2, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_TIME not between", value1, value2, "csysTrsRulesqlTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateIsNull() {
            addCriterion("CSYS_TRS_RULESQL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE =", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE <>", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE >", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE >=", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateLessThan(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE <", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_RULESQL_DATE <=", value, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_DATE in", values, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_RULESQL_DATE not in", values, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_DATE between", value1, value2, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_RULESQL_DATE not between", value1, value2, "csysTrsRulesqlDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecIsNull() {
            addCriterion("CSYS_TRS_RULESQL_DEC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecIsNotNull() {
            addCriterion("CSYS_TRS_RULESQL_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC =", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC <>", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC >", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC >=", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecLessThan(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC <", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC <=", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC like", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecNotLike(String value) {
            addCriterion("CSYS_TRS_RULESQL_DEC not like", value, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_DEC in", values, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULESQL_DEC not in", values, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_DEC between", value1, value2, "csysTrsRulesqlDec");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRulesqlDecNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULESQL_DEC not between", value1, value2, "csysTrsRulesqlDec");
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