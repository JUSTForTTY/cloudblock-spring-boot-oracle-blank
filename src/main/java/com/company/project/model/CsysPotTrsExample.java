package com.company.project.outer.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotTrsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotTrsExample() {
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

        public Criteria andCsysWorkflowNameIsNull() {
            addCriterion("CSYS_WORKFLOW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameIsNotNull() {
            addCriterion("CSYS_WORKFLOW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME =", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <>", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_NAME >", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME >=", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <=", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLike(String value) {
            addCriterion("CSYS_WORKFLOW_NAME like", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_NAME not like", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_NAME in", values, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_NAME not in", values, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_NAME between", value1, value2, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_NAME not between", value1, value2, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdIsNull() {
            addCriterion("CSYS_POT_CURRENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdIsNotNull() {
            addCriterion("CSYS_POT_CURRENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_ID =", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_ID <>", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdGreaterThan(String value) {
            addCriterion("CSYS_POT_CURRENT_ID >", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_ID >=", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdLessThan(String value) {
            addCriterion("CSYS_POT_CURRENT_ID <", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_ID <=", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdLike(String value) {
            addCriterion("CSYS_POT_CURRENT_ID like", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdNotLike(String value) {
            addCriterion("CSYS_POT_CURRENT_ID not like", value, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_ID in", values, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_ID not in", values, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_ID between", value1, value2, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_ID not between", value1, value2, "csysPotCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameIsNull() {
            addCriterion("CSYS_POT_CURRENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameIsNotNull() {
            addCriterion("CSYS_POT_CURRENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME =", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME <>", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameGreaterThan(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME >", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME >=", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameLessThan(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME <", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME <=", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameLike(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME like", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameNotLike(String value) {
            addCriterion("CSYS_POT_CURRENT_NAME not like", value, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_NAME in", values, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_NAME not in", values, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_NAME between", value1, value2, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_NAME not between", value1, value2, "csysPotCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableIsNull() {
            addCriterion("CSYS_POT_CURRENT_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableIsNotNull() {
            addCriterion("CSYS_POT_CURRENT_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE =", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableNotEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE <>", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableGreaterThan(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE >", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE >=", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableLessThan(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE <", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE <=", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableLike(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE like", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableNotLike(String value) {
            addCriterion("CSYS_POT_CURRENT_TABLE not like", value, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_TABLE in", values, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableNotIn(List<String> values) {
            addCriterion("CSYS_POT_CURRENT_TABLE not in", values, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_TABLE between", value1, value2, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotCurrentTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CURRENT_TABLE not between", value1, value2, "csysPotCurrentTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdIsNull() {
            addCriterion("CSYS_POT_TRS_POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdIsNotNull() {
            addCriterion("CSYS_POT_TRS_POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID =", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID <>", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID >", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID >=", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdLessThan(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID <", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID <=", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdLike(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID like", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdNotLike(String value) {
            addCriterion("CSYS_POT_TRS_POINT_ID not like", value, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_POINT_ID in", values, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_POINT_ID not in", values, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_POINT_ID between", value1, value2, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_POINT_ID not between", value1, value2, "csysPotTrsPointId");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameIsNull() {
            addCriterion("CSYS_POT_TRS_POINT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameIsNotNull() {
            addCriterion("CSYS_POT_TRS_POINT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME =", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME <>", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME >", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME >=", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameLessThan(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME <", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME <=", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameLike(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME like", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameNotLike(String value) {
            addCriterion("CSYS_POT_TRS_POINT_NAME not like", value, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_POINT_NAME in", values, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_POINT_NAME not in", values, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_POINT_NAME between", value1, value2, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsPointNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_POINT_NAME not between", value1, value2, "csysPotTrsPointName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableIsNull() {
            addCriterion("CSYS_POT_TRS_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableIsNotNull() {
            addCriterion("CSYS_POT_TRS_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_TABLE =", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_TABLE <>", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_TABLE >", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_TABLE >=", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableLessThan(String value) {
            addCriterion("CSYS_POT_TRS_TABLE <", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_TABLE <=", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableLike(String value) {
            addCriterion("CSYS_POT_TRS_TABLE like", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableNotLike(String value) {
            addCriterion("CSYS_POT_TRS_TABLE not like", value, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_TABLE in", values, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_TABLE not in", values, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_TABLE between", value1, value2, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_TABLE not between", value1, value2, "csysPotTrsTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeIsNull() {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME =", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeNotEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME <>", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeGreaterThan(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME >", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME >=", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeLessThan(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME <", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME <=", value, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeIn(List<BigDecimal> values) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME in", values, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeNotIn(List<BigDecimal> values) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME not in", values, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME between", value1, value2, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLongestTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_POT_TRS_LONGEST_TIME not between", value1, value2, "csysPotTrsLongestTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmIsNull() {
            addCriterion("CSYS_POT_TRS_CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmIsNotNull() {
            addCriterion("CSYS_POT_TRS_CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmEqualTo(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM =", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmNotEqualTo(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM <>", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmGreaterThan(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM >", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM >=", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmLessThan(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM <", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_POT_TRS_CONFIRM <=", value, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmIn(List<Integer> values) {
            addCriterion("CSYS_POT_TRS_CONFIRM in", values, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmNotIn(List<Integer> values) {
            addCriterion("CSYS_POT_TRS_CONFIRM not in", values, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_POT_TRS_CONFIRM between", value1, value2, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_POT_TRS_CONFIRM not between", value1, value2, "csysPotTrsConfirm");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeIsNull() {
            addCriterion("CSYS_POT_TRS_ALL_EXE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeIsNotNull() {
            addCriterion("CSYS_POT_TRS_ALL_EXE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE =", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE <>", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE >", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE >=", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeLessThan(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE <", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE <=", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeLike(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE like", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeNotLike(String value) {
            addCriterion("CSYS_POT_TRS_ALL_EXE not like", value, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_ALL_EXE in", values, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_ALL_EXE not in", values, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_ALL_EXE between", value1, value2, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAllExeNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_ALL_EXE not between", value1, value2, "csysPotTrsAllExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeIsNull() {
            addCriterion("CSYS_POT_TRS_AUTO_EXE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeIsNotNull() {
            addCriterion("CSYS_POT_TRS_AUTO_EXE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE =", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE <>", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE >", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE >=", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeLessThan(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE <", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE <=", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeLike(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE like", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeNotLike(String value) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE not like", value, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE in", values, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE not in", values, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE between", value1, value2, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsAutoExeNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_AUTO_EXE not between", value1, value2, "csysPotTrsAutoExe");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindIsNull() {
            addCriterion("CSYS_POT_TRS_REMAIND is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindIsNotNull() {
            addCriterion("CSYS_POT_TRS_REMAIND is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND =", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND <>", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND >", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND >=", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindLessThan(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND <", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND <=", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindLike(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND like", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindNotLike(String value) {
            addCriterion("CSYS_POT_TRS_REMAIND not like", value, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_REMAIND in", values, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_REMAIND not in", values, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_REMAIND between", value1, value2, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsRemaindNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_REMAIND not between", value1, value2, "csysPotTrsRemaind");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescIsNull() {
            addCriterion("CSYS_POT_TRS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescIsNotNull() {
            addCriterion("CSYS_POT_TRS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_DESC =", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_DESC <>", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_DESC >", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_DESC >=", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescLessThan(String value) {
            addCriterion("CSYS_POT_TRS_DESC <", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_DESC <=", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescLike(String value) {
            addCriterion("CSYS_POT_TRS_DESC like", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescNotLike(String value) {
            addCriterion("CSYS_POT_TRS_DESC not like", value, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_DESC in", values, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_DESC not in", values, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_DESC between", value1, value2, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_DESC not between", value1, value2, "csysPotTrsDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeIsNull() {
            addCriterion("CSYS_POT_TRS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_TIME =", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_TIME <>", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_TIME >", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_TIME >=", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_TIME <", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_TIME <=", value, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_TIME in", values, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_TIME not in", values, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_TIME between", value1, value2, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_TIME not between", value1, value2, "csysPotTrsTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateIsNull() {
            addCriterion("CSYS_POT_TRS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateIsNotNull() {
            addCriterion("CSYS_POT_TRS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_DATE =", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_DATE <>", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_DATE >", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_DATE >=", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_DATE <", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_DATE <=", value, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_DATE in", values, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_DATE not in", values, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_DATE between", value1, value2, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_DATE not between", value1, value2, "csysPotTrsDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeIsNull() {
            addCriterion("CSYS_POT_TRS_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME =", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME <>", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME >", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME >=", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME <", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME <=", value, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME in", values, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME not in", values, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME between", value1, value2, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_CREATE_TIME not between", value1, value2, "csysPotTrsCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserIsNull() {
            addCriterion("CSYS_POT_TRS_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserIsNotNull() {
            addCriterion("CSYS_POT_TRS_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER =", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER <>", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER >", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER >=", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER <", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER <=", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserLike(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER like", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_TRS_CREATE_USER not like", value, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CREATE_USER in", values, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_CREATE_USER not in", values, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CREATE_USER between", value1, value2, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_CREATE_USER not between", value1, value2, "csysPotTrsCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeIsNull() {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME =", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME <>", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME >", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME >=", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME <", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME <=", value, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME in", values, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME not in", values, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME between", value1, value2, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TRS_MODIFY_TIME not between", value1, value2, "csysPotTrsModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserIsNull() {
            addCriterion("CSYS_POT_TRS_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserIsNotNull() {
            addCriterion("CSYS_POT_TRS_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER =", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER <>", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER >", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER >=", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER <", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER <=", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserLike(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER like", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER not like", value, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER in", values, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER not in", values, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER between", value1, value2, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_MODIFY_USER not between", value1, value2, "csysPotTrsModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteIsNull() {
            addCriterion("CSYS_POT_TRS_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_TRS_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE =", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE <>", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE >", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE >=", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE <", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE <=", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteLike(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE like", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_TRS_IS_DELETE not like", value, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_IS_DELETE in", values, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_TRS_IS_DELETE not in", values, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_IS_DELETE between", value1, value2, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TRS_IS_DELETE not between", value1, value2, "csysPotTrsIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeIsNull() {
            addCriterion("CSYS_POT_TRS_LEAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeIsNotNull() {
            addCriterion("CSYS_POT_TRS_LEAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME =", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeNotEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME <>", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeGreaterThan(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME >", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME >=", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeLessThan(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME <", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME <=", value, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeIn(List<BigDecimal> values) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME in", values, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeNotIn(List<BigDecimal> values) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME not in", values, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME between", value1, value2, "csysPotTrsLeastTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTrsLeastTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_POT_TRS_LEAST_TIME not between", value1, value2, "csysPotTrsLeastTime");
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