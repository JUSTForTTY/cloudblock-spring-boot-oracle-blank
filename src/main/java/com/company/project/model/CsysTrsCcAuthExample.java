package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsCcAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsCcAuthExample() {
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

        public Criteria andCsysTrsCcAuthIdIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID =", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID <>", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID >", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID >=", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID <", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID <=", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID like", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_ID not like", value, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_ID in", values, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_ID not in", values, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_ID between", value1, value2, "csysTrsCcAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_ID not between", value1, value2, "csysTrsCcAuthId");
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

        public Criteria andCsysTrsTransferIdIsNull() {
            addCriterion("CSYS_TRS_TRANSFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdIsNotNull() {
            addCriterion("CSYS_TRS_TRANSFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdEqualTo(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID =", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID <>", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID >", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID >=", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdLessThan(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID <", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID <=", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdLike(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID like", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdNotLike(String value) {
            addCriterion("CSYS_TRS_TRANSFER_ID not like", value, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdIn(List<String> values) {
            addCriterion("CSYS_TRS_TRANSFER_ID in", values, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_TRANSFER_ID not in", values, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_TRANSFER_ID between", value1, value2, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsTransferIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_TRANSFER_ID not between", value1, value2, "csysTrsTransferId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE =", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE <>", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE >", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE >=", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE <", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE <=", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE like", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE not like", value, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE in", values, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE not in", values, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE between", value1, value2, "csysTrsCcAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_TYPE not between", value1, value2, "csysTrsCcAuthType");
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

        public Criteria andCsysTrsCcAuthDescIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC =", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC <>", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC >", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC >=", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC <", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC <=", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC like", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC not like", value, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC in", values, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC not in", values, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC between", value1, value2, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_DESC not between", value1, value2, "csysTrsCcAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME =", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME <>", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME >", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME >=", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME <", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME <=", value, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME in", values, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME not in", values, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME between", value1, value2, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_TIME not between", value1, value2, "csysTrsCcAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME =", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME <>", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME >", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME >=", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME <", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME <=", value, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME in", values, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME not in", values, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME between", value1, value2, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_TIME not between", value1, value2, "csysTrsCcAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER =", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER <>", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER >", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER >=", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER <", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER <=", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER like", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER not like", value, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER in", values, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER not in", values, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER between", value1, value2, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_CREATE_USER not between", value1, value2, "csysTrsCcAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER =", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER <>", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER >", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER >=", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER <", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER <=", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER like", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER not like", value, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER in", values, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER not in", values, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER between", value1, value2, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_MODIFY_USER not between", value1, value2, "csysTrsCcAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE =", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE <>", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE >", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE >=", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE <", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE <=", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE like", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE not like", value, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE in", values, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE not in", values, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE between", value1, value2, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_CC_AUTH_IS_DELETE not between", value1, value2, "csysTrsCcAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE =", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE <>", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE >", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE >=", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateLessThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE <", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE <=", value, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE in", values, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE not in", values, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE between", value1, value2, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_DATE not between", value1, value2, "csysTrsCcAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeIsNull() {
            addCriterion("CSYS_TRS_CC_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeIsNotNull() {
            addCriterion("CSYS_TRS_CC_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME =", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME <>", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME >", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME >=", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME <", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME <=", value, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME in", values, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME not in", values, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME between", value1, value2, "csysTrsCcAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsCcAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_CC_AUTH_TIME not between", value1, value2, "csysTrsCcAuthTime");
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