package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysNoticeTpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysNoticeTpExample() {
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

        public Criteria andCsysNoticeTpIdIsNull() {
            addCriterion("CSYS_NOTICE_TP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ID =", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ID <>", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_ID >", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ID >=", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_ID <", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ID <=", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdLike(String value) {
            addCriterion("CSYS_NOTICE_TP_ID like", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_ID not like", value, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_ID in", values, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_ID not in", values, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_ID between", value1, value2, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_ID not between", value1, value2, "csysNoticeTpId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameIsNull() {
            addCriterion("CSYS_NOTICE_TP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME =", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME <>", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME >", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME >=", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME <", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME <=", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameLike(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME like", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_NAME not like", value, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_NAME in", values, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_NAME not in", values, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_NAME between", value1, value2, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_NAME not between", value1, value2, "csysNoticeTpName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeIsNull() {
            addCriterion("CSYS_NOTICE_TP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE =", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE <>", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE >", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE >=", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE <", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE <=", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeLike(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE like", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_TYPE not like", value, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_TYPE in", values, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_TYPE not in", values, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_TYPE between", value1, value2, "csysNoticeTpType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_TYPE not between", value1, value2, "csysNoticeTpType");
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

        public Criteria andCsysPointTrsIdIsNull() {
            addCriterion("CSYS_POINT_TRS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdIsNotNull() {
            addCriterion("CSYS_POINT_TRS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID =", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID <>", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdGreaterThan(String value) {
            addCriterion("CSYS_POINT_TRS_ID >", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID >=", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLessThan(String value) {
            addCriterion("CSYS_POINT_TRS_ID <", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID <=", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLike(String value) {
            addCriterion("CSYS_POINT_TRS_ID like", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotLike(String value) {
            addCriterion("CSYS_POINT_TRS_ID not like", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_ID in", values, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_ID not in", values, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_ID between", value1, value2, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_ID not between", value1, value2, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryIsNull() {
            addCriterion("CSYS_POINT_TRS_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryIsNotNull() {
            addCriterion("CSYS_POINT_TRS_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY =", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryNotEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY <>", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryGreaterThan(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY >", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY >=", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryLessThan(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY <", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY <=", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryLike(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY like", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryNotLike(String value) {
            addCriterion("CSYS_POINT_TRS_CATEGORY not like", value, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_CATEGORY in", values, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryNotIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_CATEGORY not in", values, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_CATEGORY between", value1, value2, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsCategoryNotBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_CATEGORY not between", value1, value2, "csysPointTrsCategory");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleIsNull() {
            addCriterion("CSYS_NOTICE_TP_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE =", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE <>", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE >", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE >=", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE <", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE <=", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE like", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CYCLE not like", value, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CYCLE in", values, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CYCLE not in", values, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CYCLE between", value1, value2, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCycleNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CYCLE not between", value1, value2, "csysNoticeTpCycle");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteIsNull() {
            addCriterion("CSYS_NOTICE_TP_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE =", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE <>", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE >", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE >=", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE <", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE <=", value, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE in", values, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE not in", values, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE between", value1, value2, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpExecuteNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_EXECUTE not between", value1, value2, "csysNoticeTpExecute");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearIsNull() {
            addCriterion("CSYS_NOTICE_TP_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR =", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR <>", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR >", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR >=", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR <", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR <=", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearLike(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR like", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_YEAR not like", value, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_YEAR in", values, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_YEAR not in", values, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_YEAR between", value1, value2, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpYearNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_YEAR not between", value1, value2, "csysNoticeTpYear");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthIsNull() {
            addCriterion("CSYS_NOTICE_TP_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH =", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH <>", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH >", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH >=", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH <", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH <=", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH like", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MONTH not like", value, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MONTH in", values, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MONTH not in", values, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MONTH between", value1, value2, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpMonthNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MONTH not between", value1, value2, "csysNoticeTpMonth");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayIsNull() {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY =", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY <>", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY >", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY >=", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY <", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY <=", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY like", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY not like", value, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY in", values, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY not in", values, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY between", value1, value2, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpManyDayNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MANY_DAY not between", value1, value2, "csysNoticeTpManyDay");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersIsNull() {
            addCriterion("CSYS_NOTICE_TP_QUARTERS is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_QUARTERS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS =", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS <>", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS >", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS >=", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS <", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS <=", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersLike(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS like", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS not like", value, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS in", values, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS not in", values, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS between", value1, value2, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpQuartersNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_QUARTERS not between", value1, value2, "csysNoticeTpQuarters");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekIsNull() {
            addCriterion("CSYS_NOTICE_TP_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK =", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK <>", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK >", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK >=", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK <", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK <=", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekLike(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK like", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_WEEK not like", value, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_WEEK in", values, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_WEEK not in", values, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_WEEK between", value1, value2, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpWeekNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_WEEK not between", value1, value2, "csysNoticeTpWeek");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME =", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME <>", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME >", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME >=", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME <", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME <=", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME like", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CTIME not like", value, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CTIME in", values, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CTIME not in", values, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CTIME between", value1, value2, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCtimeNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CTIME not between", value1, value2, "csysNoticeTpCtime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_ST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_ST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME =", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME <>", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME >", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME >=", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME <", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME <=", value, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME in", values, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME not in", values, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME between", value1, value2, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpStTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_ST_TIME not between", value1, value2, "csysNoticeTpStTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME =", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME <>", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME >", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME >=", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME <", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_END_TIME <=", value, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_END_TIME in", values, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_END_TIME not in", values, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_END_TIME between", value1, value2, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_END_TIME not between", value1, value2, "csysNoticeTpEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledIsNull() {
            addCriterion("CSYS_NOTICE_TP_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED =", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED <>", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED >", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED >=", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED <", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED <=", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledLike(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED like", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_ENABLED not like", value, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_ENABLED in", values, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_ENABLED not in", values, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_ENABLED between", value1, value2, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpEnabledNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_ENABLED not between", value1, value2, "csysNoticeTpEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME =", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME <>", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME >", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME >=", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME <", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME <=", value, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME in", values, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME not in", values, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME between", value1, value2, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_CREATE_TIME not between", value1, value2, "csysNoticeTpCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME =", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME <>", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME >", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME >=", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME <", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME <=", value, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME in", values, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME not in", values, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME between", value1, value2, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_TIME not between", value1, value2, "csysNoticeTpModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserIsNull() {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER =", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER <>", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER >", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER >=", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER <", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER <=", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER like", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER not like", value, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER in", values, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER not in", values, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER between", value1, value2, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_CREATE_USER not between", value1, value2, "csysNoticeTpCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserIsNull() {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER =", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER <>", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER >", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER >=", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER <", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER <=", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER like", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER not like", value, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER in", values, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER not in", values, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER between", value1, value2, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_MODIFY_USER not between", value1, value2, "csysNoticeTpModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteIsNull() {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE =", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE <>", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE >", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE >=", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteLessThan(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE <", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE <=", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteLike(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE like", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteNotLike(String value) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE not like", value, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE in", values, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE not in", values, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE between", value1, value2, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TP_IS_DELETE not between", value1, value2, "csysNoticeTpIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeIsNull() {
            addCriterion("CSYS_NOTICE_TP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME =", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME <>", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME >", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME >=", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME <", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_TIME <=", value, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_TIME in", values, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_TIME not in", values, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_TIME between", value1, value2, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_TIME not between", value1, value2, "csysNoticeTpTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateIsNull() {
            addCriterion("CSYS_NOTICE_TP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateIsNotNull() {
            addCriterion("CSYS_NOTICE_TP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE =", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE <>", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE >", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE >=", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE <", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TP_DATE <=", value, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_DATE in", values, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TP_DATE not in", values, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_DATE between", value1, value2, "csysNoticeTpDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTpDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TP_DATE not between", value1, value2, "csysNoticeTpDate");
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