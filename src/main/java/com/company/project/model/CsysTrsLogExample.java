package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsLogExample() {
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

        public Criteria andCsysTrsLogIdIsNull() {
            addCriterion("CSYS_TRS_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdIsNotNull() {
            addCriterion("CSYS_TRS_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_ID =", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_ID <>", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_ID >", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_ID >=", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_ID <", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_ID <=", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdLike(String value) {
            addCriterion("CSYS_TRS_LOG_ID like", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_ID not like", value, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_ID in", values, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_ID not in", values, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_ID between", value1, value2, "csysTrsLogId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_ID not between", value1, value2, "csysTrsLogId");
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

        public Criteria andCsysTrsLogTypeIsNull() {
            addCriterion("CSYS_TRS_LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE =", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE <>", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE >", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE >=", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE <", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE <=", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeLike(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE like", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_TYPE not like", value, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TYPE in", values, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TYPE not in", values, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TYPE between", value1, value2, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TYPE not between", value1, value2, "csysTrsLogType");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdIsNull() {
            addCriterion("CSYS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdIsNotNull() {
            addCriterion("CSYS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdEqualTo(String value) {
            addCriterion("CSYS_USER_ID =", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdNotEqualTo(String value) {
            addCriterion("CSYS_USER_ID <>", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdGreaterThan(String value) {
            addCriterion("CSYS_USER_ID >", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ID >=", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdLessThan(String value) {
            addCriterion("CSYS_USER_ID <", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ID <=", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdLike(String value) {
            addCriterion("CSYS_USER_ID like", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdNotLike(String value) {
            addCriterion("CSYS_USER_ID not like", value, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdIn(List<String> values) {
            addCriterion("CSYS_USER_ID in", values, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdNotIn(List<String> values) {
            addCriterion("CSYS_USER_ID not in", values, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ID between", value1, value2, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysUserIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ID not between", value1, value2, "csysUserId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableIsNull() {
            addCriterion("CSYS_TRS_LOG_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableIsNotNull() {
            addCriterion("CSYS_TRS_LOG_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE =", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE <>", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE >", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE >=", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE <", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE <=", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableLike(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE like", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE not like", value, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TABLE in", values, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TABLE not in", values, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TABLE between", value1, value2, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TABLE not between", value1, value2, "csysTrsLogTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValIsNull() {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValIsNotNull() {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL =", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL <>", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL >", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL >=", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL <", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL <=", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValLike(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL like", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL not like", value, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL in", values, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL not in", values, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL between", value1, value2, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTableValNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_TABLE_VAL not between", value1, value2, "csysTrsLogTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID =", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID <>", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID >", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID >=", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID <", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID <=", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID like", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_ID not like", value, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_ID in", values, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_ID not in", values, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_ID between", value1, value2, "csysWorkflowRunId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_ID not between", value1, value2, "csysWorkflowRunId");
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

        public Criteria andCsysTrsLogLastIdIsNull() {
            addCriterion("CSYS_TRS_LOG_LAST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdIsNotNull() {
            addCriterion("CSYS_TRS_LOG_LAST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID =", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID <>", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID >", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID >=", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID <", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID <=", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdLike(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID like", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_ID not like", value, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_LAST_ID in", values, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_LAST_ID not in", values, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_LAST_ID between", value1, value2, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_LAST_ID not between", value1, value2, "csysTrsLogLastId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameIsNull() {
            addCriterion("CSYS_TRS_LOG_LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameIsNotNull() {
            addCriterion("CSYS_TRS_LOG_LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME =", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME <>", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME >", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME >=", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME <", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME <=", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameLike(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME like", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME not like", value, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME in", values, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME not in", values, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME between", value1, value2, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogLastNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_LAST_NAME not between", value1, value2, "csysTrsLogLastName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdIsNull() {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdIsNotNull() {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID =", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID <>", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID >", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID >=", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID <", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID <=", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdLike(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID like", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID not like", value, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID in", values, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID not in", values, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID between", value1, value2, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CURRENT_ID not between", value1, value2, "csysTrsLogCurrentId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameIsNull() {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameIsNotNull() {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME =", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME <>", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME >", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME >=", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME <", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME <=", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameLike(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME like", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME not like", value, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME in", values, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME not in", values, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME between", value1, value2, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCurrentNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CURRENT_NAME not between", value1, value2, "csysTrsLogCurrentName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME =", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME <>", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME >", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME >=", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME <", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_START_TIME <=", value, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_START_TIME in", values, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_START_TIME not in", values, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_START_TIME between", value1, value2, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_START_TIME not between", value1, value2, "csysTrsLogStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME =", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME <>", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME >", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME >=", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME <", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME <=", value, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME in", values, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME not in", values, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME between", value1, value2, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_CLOSE_TIME not between", value1, value2, "csysTrsLogCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME =", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME <>", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME >", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME >=", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME <", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_END_TIME <=", value, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_END_TIME in", values, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_END_TIME not in", values, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_END_TIME between", value1, value2, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_END_TIME not between", value1, value2, "csysTrsLogEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescIsNull() {
            addCriterion("CSYS_TRS_LOG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescIsNotNull() {
            addCriterion("CSYS_TRS_LOG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_DESC =", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_DESC <>", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_DESC >", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_DESC >=", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_DESC <", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_DESC <=", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescLike(String value) {
            addCriterion("CSYS_TRS_LOG_DESC like", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_DESC not like", value, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_DESC in", values, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_DESC not in", values, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_DESC between", value1, value2, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_DESC not between", value1, value2, "csysTrsLogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME =", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME <>", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME >", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME >=", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME <", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME <=", value, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME in", values, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME not in", values, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME between", value1, value2, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_CREATE_TIME not between", value1, value2, "csysTrsLogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserIsNull() {
            addCriterion("CSYS_TRS_LOG_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_LOG_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER =", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER <>", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER >", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER >=", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER <", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER <=", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserLike(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER like", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER not like", value, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER in", values, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER not in", values, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER between", value1, value2, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_CREATE_USER not between", value1, value2, "csysTrsLogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserIsNull() {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER =", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER <>", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER >", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER >=", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER <", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER <=", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserLike(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER like", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER not like", value, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER in", values, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER not in", values, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER between", value1, value2, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_MODIFY_USER not between", value1, value2, "csysTrsLogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME =", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME <>", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME >", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME >=", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME <", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME <=", value, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME in", values, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME not in", values, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME between", value1, value2, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_MODIFY_TIME not between", value1, value2, "csysTrsLogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteIsNull() {
            addCriterion("CSYS_TRS_LOG_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_LOG_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE =", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE <>", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE >", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE >=", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE <", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE <=", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE like", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE not like", value, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE in", values, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE not in", values, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE between", value1, value2, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_IS_DELETE not between", value1, value2, "csysTrsLogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME =", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME <>", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME >", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME >=", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME <", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_TIME <=", value, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_TIME in", values, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_TIME not in", values, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_TIME between", value1, value2, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_TIME not between", value1, value2, "csysTrsLogTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateIsNull() {
            addCriterion("CSYS_TRS_LOG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateIsNotNull() {
            addCriterion("CSYS_TRS_LOG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE =", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE <>", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE >", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE >=", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE <", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_DATE <=", value, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_DATE in", values, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_DATE not in", values, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_DATE between", value1, value2, "csysTrsLogDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_DATE not between", value1, value2, "csysTrsLogDate");
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