package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysWorkflowRunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysWorkflowRunExample() {
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

        public Criteria andCsysWorkflowRunParentIdIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID =", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID <>", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID >", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID >=", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID <", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID <=", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID like", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID not like", value, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID in", values, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID not in", values, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID between", value1, value2, "csysWorkflowRunParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunParentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PARENT_ID not between", value1, value2, "csysWorkflowRunParentId");
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

        public Criteria andCySysBlockIdIsNull() {
            addCriterion("CY_SYS_BLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIsNotNull() {
            addCriterion("CY_SYS_BLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID =", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID <>", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_ID >", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID >=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_ID <", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID <=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLike(String value) {
            addCriterion("CY_SYS_BLOCK_ID like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_ID not like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_ID in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_ID not in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_ID between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_ID not between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdIsNull() {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdIsNotNull() {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID =", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID <>", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID >", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID >=", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID <", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID <=", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdLike(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID like", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID not like", value, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID in", values, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID not in", values, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID between", value1, value2, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_RUNTIME_ID not between", value1, value2, "cySysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE =", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE <>", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE >", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE >=", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE <", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE <=", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE like", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE not like", value, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE in", values, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE not in", values, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE between", value1, value2, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE not between", value1, value2, "csysWorkflowRunTable");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL =", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL <>", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL >", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL >=", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL <", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL <=", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL like", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL not like", value, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL in", values, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL not in", values, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL between", value1, value2, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTableValNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TABLE_VAL not between", value1, value2, "csysWorkflowRunTableVal");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdIsNull() {
            addCriterion("CSYS_POT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdIsNotNull() {
            addCriterion("CSYS_POT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdEqualTo(String value) {
            addCriterion("CSYS_POT_ID =", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_ID <>", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdGreaterThan(String value) {
            addCriterion("CSYS_POT_ID >", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ID >=", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLessThan(String value) {
            addCriterion("CSYS_POT_ID <", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ID <=", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLike(String value) {
            addCriterion("CSYS_POT_ID like", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotLike(String value) {
            addCriterion("CSYS_POT_ID not like", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdIn(List<String> values) {
            addCriterion("CSYS_POT_ID in", values, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_ID not in", values, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ID between", value1, value2, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ID not between", value1, value2, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNull() {
            addCriterion("CSYS_POT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNotNull() {
            addCriterion("CSYS_POT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameEqualTo(String value) {
            addCriterion("CSYS_POT_NAME =", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <>", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThan(String value) {
            addCriterion("CSYS_POT_NAME >", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME >=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThan(String value) {
            addCriterion("CSYS_POT_NAME <", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLike(String value) {
            addCriterion("CSYS_POT_NAME like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotLike(String value) {
            addCriterion("CSYS_POT_NAME not like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIn(List<String> values) {
            addCriterion("CSYS_POT_NAME in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_NAME not in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME not between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE =", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE <>", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE >", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE >=", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE <", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE <=", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE like", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE not like", value, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE in", values, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE not in", values, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE between", value1, value2, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStateNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_STATE not between", value1, value2, "csysWorkflowRunState");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE =", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE <>", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE >", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE >=", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE <", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE <=", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE like", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE not like", value, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE in", values, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE not in", values, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE between", value1, value2, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunNumbeNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_NUMBE not between", value1, value2, "csysWorkflowRunNumbe");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME =", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME <>", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME >", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME >=", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME <", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME <=", value, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME in", values, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME not in", values, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME between", value1, value2, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_START_TIME not between", value1, value2, "csysWorkflowRunStartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME =", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME <>", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME >", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME >=", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME <", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME <=", value, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME in", values, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME not in", values, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME between", value1, value2, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CLOSE_TIME not between", value1, value2, "csysWorkflowRunCloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME =", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME <>", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME >", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME >=", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME <", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME <=", value, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME in", values, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME not in", values, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME between", value1, value2, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_END_TIME not between", value1, value2, "csysWorkflowRunEndTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME =", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME <>", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME >", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME >=", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME <", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME <=", value, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME in", values, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME not in", values, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME between", value1, value2, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunFreezeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_FREEZE_TIME not between", value1, value2, "csysWorkflowRunFreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC =", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC <>", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC >", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC >=", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC <", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC <=", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC like", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC not like", value, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC in", values, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC not in", values, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC between", value1, value2, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_DESC not between", value1, value2, "csysWorkflowRunDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME =", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME <>", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME >", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME >=", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME <", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME <=", value, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME in", values, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME not in", values, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME between", value1, value2, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_TIME not between", value1, value2, "csysWorkflowRunCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME =", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME <>", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME >", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME >=", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME <", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME <=", value, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME in", values, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME not in", values, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME between", value1, value2, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_TIME not between", value1, value2, "csysWorkflowRunModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER =", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER <>", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER >", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER >=", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER <", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER <=", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER like", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER not like", value, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER in", values, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER not in", values, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER between", value1, value2, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_CREATE_USER not between", value1, value2, "csysWorkflowRunCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER =", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER <>", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER >", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER >=", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER <", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER <=", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER like", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER not like", value, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER in", values, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER not in", values, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER between", value1, value2, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_MODIFY_USER not between", value1, value2, "csysWorkflowRunModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE =", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE <>", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE >", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE >=", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE <", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE <=", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE like", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE not like", value, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE in", values, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE not in", values, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE between", value1, value2, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_RUN_IS_DELETE not between", value1, value2, "csysWorkflowRunIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME =", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME <>", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME >", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME >=", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME <", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME <=", value, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME in", values, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME not in", values, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME between", value1, value2, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_TIME not between", value1, value2, "csysWorkflowRunTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE =", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE <>", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE >", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE >=", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE <", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE <=", value, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE in", values, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE not in", values, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE between", value1, value2, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_DATE not between", value1, value2, "csysWorkflowRunDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME =", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME <>", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME >", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME >=", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME <", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME <=", value, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME in", values, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME not in", values, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME between", value1, value2, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPstartTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PSTART_TIME not between", value1, value2, "csysWorkflowRunPstartTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME =", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME <>", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME >", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME >=", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME <", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME <=", value, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME in", values, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME not in", values, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME between", value1, value2, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPcloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PCLOSE_TIME not between", value1, value2, "csysWorkflowRunPcloseTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME =", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME <>", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME >", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME >=", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME <", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME <=", value, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME in", values, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME not in", values, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME between", value1, value2, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPendTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PEND_TIME not between", value1, value2, "csysWorkflowRunPendTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME =", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME <>", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME >", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME >=", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME <", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME <=", value, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME in", values, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME not in", values, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME between", value1, value2, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPfreezeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PFREEZE_TIME not between", value1, value2, "csysWorkflowRunPfreezeTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME =", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME <>", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME >", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME >=", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME <", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME <=", value, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME in", values, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME not in", values, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME between", value1, value2, "csysWorkflowRunPleastTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowRunPleastTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_RUN_PLEAST_TIME not between", value1, value2, "csysWorkflowRunPleastTime");
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