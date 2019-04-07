package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsConditionExample() {
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

        public Criteria andCsysTrsConditionIdIsNull() {
            addCriterion("CSYS_TRS_CONDITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID =", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID <>", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID >", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID >=", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID <", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID <=", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID like", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_ID not like", value, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_ID in", values, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_ID not in", values, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_ID between", value1, value2, "csysTrsConditionId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_ID not between", value1, value2, "csysTrsConditionId");
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

        public Criteria andCsysTrsConditionColumnIsNull() {
            addCriterion("CSYS_TRS_CONDITION_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN =", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN <>", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN >", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN >=", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN <", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN <=", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN like", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN not like", value, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN in", values, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN not in", values, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN between", value1, value2, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionColumnNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_COLUMN not between", value1, value2, "csysTrsConditionColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataIsNull() {
            addCriterion("CSYS_TRS_CONDITION_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA =", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA <>", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA >", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA >=", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA <", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA <=", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA like", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_DATA not like", value, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_DATA in", values, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_DATA not in", values, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_DATA between", value1, value2, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDataNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_DATA not between", value1, value2, "csysTrsConditionData");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableIsNull() {
            addCriterion("CSYS_TRS_CONDITION_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE =", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE <>", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE >", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE >=", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE <", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE <=", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE like", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_TABLE not like", value, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_TABLE in", values, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_TABLE not in", values, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_TABLE between", value1, value2, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_TABLE not between", value1, value2, "csysTrsConditionTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodIsNull() {
            addCriterion("CSYS_TRS_CONDITION_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD =", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD <>", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD >", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD >=", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD <", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD <=", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD like", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_METHOD not like", value, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_METHOD in", values, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_METHOD not in", values, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_METHOD between", value1, value2, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionMethodNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_METHOD not between", value1, value2, "csysTrsConditionMethod");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstIsNull() {
            addCriterion("CSYS_TRS_CONDITION_CONTARST is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_CONTARST is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST =", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST <>", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST >", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST >=", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST <", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST <=", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST like", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST not like", value, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST in", values, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST not in", values, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST between", value1, value2, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionContarstNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_CONTARST not between", value1, value2, "csysTrsConditionContarst");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescIsNull() {
            addCriterion("CSYS_TRS_CONDITION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC =", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC <>", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC >", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC >=", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC <", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC <=", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC like", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_DESC not like", value, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_DESC in", values, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_DESC not in", values, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_DESC between", value1, value2, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_DESC not between", value1, value2, "csysTrsConditionDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeIsNull() {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME =", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME <>", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME >", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME >=", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME <", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME <=", value, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME in", values, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME not in", values, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME between", value1, value2, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_TIME not between", value1, value2, "csysTrsConditionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeIsNull() {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME =", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME <>", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME >", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME >=", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME <", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME <=", value, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME in", values, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME not in", values, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME between", value1, value2, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_TIME not between", value1, value2, "csysTrsConditionModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserIsNull() {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER =", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER <>", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER >", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER >=", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER <", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER <=", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER like", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER not like", value, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER in", values, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER not in", values, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER between", value1, value2, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_CREATE_USER not between", value1, value2, "csysTrsConditionCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserIsNull() {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER =", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER <>", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER >", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER >=", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER <", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER <=", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER like", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER not like", value, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER in", values, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER not in", values, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER between", value1, value2, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_MODIFY_USER not between", value1, value2, "csysTrsConditionModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteIsNull() {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE =", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE <>", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE >", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE >=", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE <", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE <=", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE like", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE not like", value, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE in", values, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE not in", values, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE between", value1, value2, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CONDITION_IS_DELETE not between", value1, value2, "csysTrsConditionIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeIsNull() {
            addCriterion("CSYS_TRS_CONDITION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME =", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME <>", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME >", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME >=", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME <", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_TIME <=", value, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_TIME in", values, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_TIME not in", values, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_TIME between", value1, value2, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_TIME not between", value1, value2, "csysTrsConditionTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateIsNull() {
            addCriterion("CSYS_TRS_CONDITION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateIsNotNull() {
            addCriterion("CSYS_TRS_CONDITION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE =", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE <>", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE >", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE >=", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateLessThan(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE <", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CONDITION_DATE <=", value, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_DATE in", values, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CONDITION_DATE not in", values, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_DATE between", value1, value2, "csysTrsConditionDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsConditionDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CONDITION_DATE not between", value1, value2, "csysTrsConditionDate");
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