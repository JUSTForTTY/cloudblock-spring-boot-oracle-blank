package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotTrsConExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotTrsConExample() {
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

        public Criteria andCsysPotTrsConIdIsNull() {
            addCriterion("CSYS_POT_TRS_CON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID =", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID <>", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID >", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID >=", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID <", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID <=", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID like", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_ID not like", value, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_ID in", values, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_ID not in", values, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_ID between", value1, value2, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_ID not between", value1, value2, "csysPotTrsConId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIsNull() {
            addCriterion("CSYS_WORKFLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIsNotNull() {
            addCriterion("CSYS_WORKFLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID =", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID <>", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_ID >", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID >=", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_ID <", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID <=", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLike(String value) {
            addCriterion("CSYS_WORKFLOW_ID like", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_ID not like", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ID in", values, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ID not in", values, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ID between", value1, value2, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ID not between", value1, value2, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdIsNull() {
            addCriterion("CSYS_POT_TRS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdIsNotNull() {
            addCriterion("CSYS_POT_TRS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ID =", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ID <>", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_ID >", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ID >=", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdLessThan(String value) {
            addCriterion("CSYS_POT_TRS_ID <", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ID <=", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdLike(String value) {
            addCriterion("CSYS_POT_TRS_ID like", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdNotLike(String value) {
            addCriterion("CSYS_POT_TRS_ID not like", value, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_ID in", values, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_ID not in", values, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_ID between", value1, value2, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_ID not between", value1, value2, "csysPotTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataIsNull() {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA =", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA <>", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA >", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA >=", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA <", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA <=", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA like", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA not like", value, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA in", values, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA not in", values, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA between", value1, value2, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConRawDataNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_RAW_DATA not between", value1, value2, "csysPotTrsConRawData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodIsNull() {
            addCriterion("CSYS_POT_TRS_CON_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD =", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD <>", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD >", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD >=", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD <", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD <=", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD like", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_METHOD not like", value, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_METHOD in", values, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_METHOD not in", values, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_METHOD between", value1, value2, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConMethodNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_METHOD not between", value1, value2, "csysPotTrsConMethod");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataIsNull() {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA =", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA <>", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA >", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA >=", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA <", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA <=", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA like", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA not like", value, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA in", values, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA not in", values, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA between", value1, value2, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConContrastDataNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_CONTRAST_DATA not between", value1, value2, "csysPotTrsConContrastData");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoIsNull() {
            addCriterion("CSYS_POT_TRS_CON_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO =", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO <>", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO >", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO >=", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO <", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO <=", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO like", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_INFO not like", value, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_INFO in", values, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_INFO not in", values, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_INFO between", value1, value2, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConInfoNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_INFO not between", value1, value2, "csysPotTrsConInfo");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescIsNull() {
            addCriterion("CSYS_POT_TRS_CON_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC =", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC <>", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC >", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC >=", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC <", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC <=", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC like", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_DESC not like", value, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_DESC in", values, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_DESC not in", values, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_DESC between", value1, value2, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_DESC not between", value1, value2, "csysPotTrsConDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeIsNull() {
            addCriterion("CSYS_POT_TRS_CON_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME =", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME <>", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME >", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME >=", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME <", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_TIME <=", value, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_TIME in", values, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_TIME not in", values, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_TIME between", value1, value2, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_TIME not between", value1, value2, "csysPotTrsConTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateIsNull() {
            addCriterion("CSYS_POT_TRS_CON_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE =", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE <>", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE >", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE >=", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE <", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_DATE <=", value, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_DATE in", values, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_DATE not in", values, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_DATE between", value1, value2, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_DATE not between", value1, value2, "csysPotTrsConDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeIsNull() {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME =", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME <>", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME >", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME >=", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME <", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME <=", value, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME in", values, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME not in", values, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME between", value1, value2, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_TIME not between", value1, value2, "csysPotTrsConCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserIsNull() {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER =", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER <>", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER >", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER >=", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER <", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER <=", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER like", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER not like", value, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER in", values, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER not in", values, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER between", value1, value2, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_CREATE_USER not between", value1, value2, "csysPotTrsConCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeIsNull() {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME =", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME <>", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME >", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME >=", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME <", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME <=", value, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME in", values, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME not in", values, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME between", value1, value2, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_TIME not between", value1, value2, "csysPotTrsConModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserIsNull() {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER =", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER <>", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER >", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER >=", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER <", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER <=", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER like", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER not like", value, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER in", values, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER not in", values, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER between", value1, value2, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_MODIFY_USER not between", value1, value2, "csysPotTrsConModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteIsNull() {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE =", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE <>", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE >", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE >=", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE <", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE <=", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE like", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE not like", value, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE in", values, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE not in", values, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE between", value1, value2, "csysPotTrsConIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CON_IS_DELETE not between", value1, value2, "csysPotTrsConIsDelete");
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