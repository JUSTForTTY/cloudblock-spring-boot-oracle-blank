package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsLogPamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsLogPamExample() {
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

        public Criteria andCsysTrsLogPamIdIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID =", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID <>", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID >", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID >=", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID <", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID <=", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID like", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_ID not like", value, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_ID in", values, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_ID not in", values, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_ID between", value1, value2, "csysTrsLogPamId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_ID not between", value1, value2, "csysTrsLogPamId");
            return (Criteria) this;
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

        public Criteria andCsysTrsLogPamNameIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME =", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME <>", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME >", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME >=", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME <", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME <=", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME like", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME not like", value, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME in", values, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME not in", values, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME between", value1, value2, "csysTrsLogPamName");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_NAME not between", value1, value2, "csysTrsLogPamName");
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

        public Criteria andCsysTrsLogPamTableIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE =", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE <>", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE >", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE >=", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE <", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE <=", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE like", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE not like", value, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE in", values, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE not in", values, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE between", value1, value2, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_TABLE not between", value1, value2, "csysTrsLogPamTable");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE =", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE <>", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE >", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE >=", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE <", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE <=", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE like", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE not like", value, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE in", values, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE not in", values, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE between", value1, value2, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamValueNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_VALUE not between", value1, value2, "csysTrsLogPamValue");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME =", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME <>", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME >", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME >=", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME <", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME <=", value, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME in", values, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME not in", values, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME between", value1, value2, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_TIME not between", value1, value2, "csysTrsLogPamCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME =", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME <>", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME >", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME >=", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME <", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME <=", value, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME in", values, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME not in", values, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME between", value1, value2, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_TIME not between", value1, value2, "csysTrsLogPamModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER =", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER <>", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER >", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER >=", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER <", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER <=", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER like", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER not like", value, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER in", values, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER not in", values, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER between", value1, value2, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_CREATE_USER not between", value1, value2, "csysTrsLogPamCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER =", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER <>", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER >", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER >=", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER <", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER <=", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER like", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER not like", value, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER in", values, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER not in", values, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER between", value1, value2, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_MODIFY_USER not between", value1, value2, "csysTrsLogPamModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE =", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE <>", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE >", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE >=", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE <", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE <=", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE like", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE not like", value, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE in", values, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE not in", values, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE between", value1, value2, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_IS_DELETE not between", value1, value2, "csysTrsLogPamIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE =", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE <>", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE >", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE >=", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE <", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE <=", value, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE in", values, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE not in", values, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE between", value1, value2, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_DATE not between", value1, value2, "csysTrsLogPamDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME =", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME <>", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME >", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME >=", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME <", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME <=", value, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME in", values, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME not in", values, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME between", value1, value2, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_LOG_PAM_TIME not between", value1, value2, "csysTrsLogPamTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnIsNull() {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnIsNotNull() {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN =", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnNotEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN <>", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnGreaterThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN >", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN >=", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnLessThan(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN <", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN <=", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN like", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnNotLike(String value) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN not like", value, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN in", values, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnNotIn(List<String> values) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN not in", values, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN between", value1, value2, "csysTrsLogPamColumn");
            return (Criteria) this;
        }

        public Criteria andCsysTrsLogPamColumnNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_LOG_PAM_COLUMN not between", value1, value2, "csysTrsLogPamColumn");
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