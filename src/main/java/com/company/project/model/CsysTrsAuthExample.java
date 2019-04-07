package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsAuthExample() {
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

        public Criteria andCsysTrsAuthIdIsNull() {
            addCriterion("CSYS_TRS_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_ID =", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_ID <>", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_ID >", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_ID >=", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_ID <", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_ID <=", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdLike(String value) {
            addCriterion("CSYS_TRS_AUTH_ID like", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_ID not like", value, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_ID in", values, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_ID not in", values, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_ID between", value1, value2, "csysTrsAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_ID not between", value1, value2, "csysTrsAuthId");
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

        public Criteria andCsysTrsAuthTypeIsNull() {
            addCriterion("CSYS_TRS_AUTH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE =", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE <>", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE >", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE >=", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE <", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE <=", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeLike(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE like", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_TYPE not like", value, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_TYPE in", values, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_TYPE not in", values, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_TYPE between", value1, value2, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_TYPE not between", value1, value2, "csysTrsAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIsNull() {
            addCriterion("CSYS_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIsNotNull() {
            addCriterion("CSYS_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID =", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <>", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThan(String value) {
            addCriterion("CSYS_ROLE_ID >", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID >=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThan(String value) {
            addCriterion("CSYS_ROLE_ID <", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLike(String value) {
            addCriterion("CSYS_ROLE_ID like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotLike(String value) {
            addCriterion("CSYS_ROLE_ID not like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID not in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID between", value1, value2, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID not between", value1, value2, "csysRoleId");
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

        public Criteria andCsysTrsAuthDescIsNull() {
            addCriterion("CSYS_TRS_AUTH_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC =", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC <>", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC >", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC >=", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC <", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC <=", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescLike(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC like", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_DESC not like", value, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_DESC in", values, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_DESC not in", values, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_DESC between", value1, value2, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_DESC not between", value1, value2, "csysTrsAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeIsNull() {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME =", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME <>", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME >", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME >=", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME <", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME <=", value, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME in", values, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME not in", values, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME between", value1, value2, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_CREATE_TIME not between", value1, value2, "csysTrsAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeIsNull() {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME =", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME <>", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME >", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME >=", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME <", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME <=", value, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME in", values, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME not in", values, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME between", value1, value2, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_TIME not between", value1, value2, "csysTrsAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserIsNull() {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER =", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER <>", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER >", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER >=", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER <", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER <=", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserLike(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER like", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER not like", value, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER in", values, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER not in", values, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER between", value1, value2, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_CREATE_USER not between", value1, value2, "csysTrsAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserIsNull() {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER =", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER <>", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER >", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER >=", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER <", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER <=", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserLike(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER like", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER not like", value, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER in", values, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER not in", values, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER between", value1, value2, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_MODIFY_USER not between", value1, value2, "csysTrsAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteIsNull() {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE =", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE <>", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE >", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE >=", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE <", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE <=", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE like", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE not like", value, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE in", values, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE not in", values, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE between", value1, value2, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_AUTH_IS_DELETE not between", value1, value2, "csysTrsAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeIsNull() {
            addCriterion("CSYS_TRS_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME =", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME <>", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME >", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME >=", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME <", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_TIME <=", value, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_TIME in", values, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_TIME not in", values, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_TIME between", value1, value2, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_TIME not between", value1, value2, "csysTrsAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateIsNull() {
            addCriterion("CSYS_TRS_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateIsNotNull() {
            addCriterion("CSYS_TRS_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE =", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE <>", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE >", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE >=", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateLessThan(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE <", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_AUTH_DATE <=", value, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_DATE in", values, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_AUTH_DATE not in", values, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_DATE between", value1, value2, "csysTrsAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_AUTH_DATE not between", value1, value2, "csysTrsAuthDate");
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