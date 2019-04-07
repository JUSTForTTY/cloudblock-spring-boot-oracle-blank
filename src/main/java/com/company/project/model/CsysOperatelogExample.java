package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysOperatelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysOperatelogExample() {
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

        public Criteria andCsysOperatelogIdIsNull() {
            addCriterion("CSYS_OPERATELOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdIsNotNull() {
            addCriterion("CSYS_OPERATELOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_ID =", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_ID <>", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_ID >", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_ID >=", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_ID <", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_ID <=", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdLike(String value) {
            addCriterion("CSYS_OPERATELOG_ID like", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_ID not like", value, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_ID in", values, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_ID not in", values, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_ID between", value1, value2, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_ID not between", value1, value2, "csysOperatelogId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameIsNull() {
            addCriterion("CSYS_OPERATELOG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameIsNotNull() {
            addCriterion("CSYS_OPERATELOG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_NAME =", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_NAME <>", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_NAME >", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_NAME >=", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_NAME <", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_NAME <=", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameLike(String value) {
            addCriterion("CSYS_OPERATELOG_NAME like", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_NAME not like", value, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_NAME in", values, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_NAME not in", values, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_NAME between", value1, value2, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_NAME not between", value1, value2, "csysOperatelogName");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeIsNull() {
            addCriterion("CSYS_OPERATELOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeIsNotNull() {
            addCriterion("CSYS_OPERATELOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE =", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE <>", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE >", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE >=", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE <", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE <=", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeLike(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE like", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_TYPE not like", value, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_TYPE in", values, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_TYPE not in", values, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_TYPE between", value1, value2, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_TYPE not between", value1, value2, "csysOperatelogType");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIsNull() {
            addCriterion("CSYS_OPERATELOG_RESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIsNotNull() {
            addCriterion("CSYS_OPERATELOG_RESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE =", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE <>", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE >", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE >=", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE <", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE <=", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceLike(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE like", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE not like", value, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_RESOURCE in", values, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_RESOURCE not in", values, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_RESOURCE between", value1, value2, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_RESOURCE not between", value1, value2, "csysOperatelogResource");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdIsNull() {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdIsNotNull() {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID =", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID <>", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID >", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID >=", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID <", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID <=", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdLike(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID like", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID not like", value, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID in", values, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID not in", values, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID between", value1, value2, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogResourceIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_RESOURCE_ID not between", value1, value2, "csysOperatelogResourceId");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusIsNull() {
            addCriterion("CSYS_OPERATELOG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusIsNotNull() {
            addCriterion("CSYS_OPERATELOG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS =", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS <>", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS >", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS >=", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS <", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS <=", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusLike(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS like", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_STATUS not like", value, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_STATUS in", values, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_STATUS not in", values, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_STATUS between", value1, value2, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogStatusNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_STATUS not between", value1, value2, "csysOperatelogStatus");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorIsNull() {
            addCriterion("CSYS_OPERATELOG_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorIsNotNull() {
            addCriterion("CSYS_OPERATELOG_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR =", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR <>", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR >", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR >=", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR <", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR <=", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorLike(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR like", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_OPERATOR not like", value, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_OPERATOR in", values, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_OPERATOR not in", values, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_OPERATOR between", value1, value2, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogOperatorNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_OPERATOR not between", value1, value2, "csysOperatelogOperator");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescIsNull() {
            addCriterion("CSYS_OPERATELOG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescIsNotNull() {
            addCriterion("CSYS_OPERATELOG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_DESC =", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_DESC <>", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_DESC >", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_DESC >=", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_DESC <", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_DESC <=", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescLike(String value) {
            addCriterion("CSYS_OPERATELOG_DESC like", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_DESC not like", value, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_DESC in", values, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_DESC not in", values, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_DESC between", value1, value2, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_DESC not between", value1, value2, "csysOperatelogDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeIsNull() {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeIsNotNull() {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME =", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME <>", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME >", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME >=", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeLessThan(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME <", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME <=", value, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME in", values, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME not in", values, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME between", value1, value2, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_CREATE_TIME not between", value1, value2, "csysOperatelogCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserIsNull() {
            addCriterion("CSYS_OPERATELOG_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserIsNotNull() {
            addCriterion("CSYS_OPERATELOG_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER =", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER <>", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER >", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER >=", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER <", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER <=", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserLike(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER like", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER not like", value, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER in", values, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER not in", values, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER between", value1, value2, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_CREATE_USER not between", value1, value2, "csysOperatelogCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeIsNull() {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeIsNotNull() {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME =", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME <>", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME >", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME >=", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeLessThan(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME <", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME <=", value, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME in", values, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME not in", values, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME between", value1, value2, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_MODIFY_TIME not between", value1, value2, "csysOperatelogModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserIsNull() {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserIsNotNull() {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER =", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER <>", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER >", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER >=", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER <", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER <=", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserLike(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER like", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER not like", value, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER in", values, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER not in", values, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER between", value1, value2, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_MODIFY_USER not between", value1, value2, "csysOperatelogModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteIsNull() {
            addCriterion("CSYS_OPERATELOG_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteIsNotNull() {
            addCriterion("CSYS_OPERATELOG_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE =", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE <>", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE >", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE >=", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteLessThan(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE <", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE <=", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteLike(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE like", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteNotLike(String value) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE not like", value, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE in", values, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE not in", values, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE between", value1, value2, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_OPERATELOG_IS_DELETE not between", value1, value2, "csysOperatelogIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeIsNull() {
            addCriterion("CSYS_OPERATELOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeIsNotNull() {
            addCriterion("CSYS_OPERATELOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME =", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeNotEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME <>", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeGreaterThan(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME >", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME >=", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeLessThan(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME <", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_TIME <=", value, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_TIME in", values, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeNotIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_TIME not in", values, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_TIME between", value1, value2, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_TIME not between", value1, value2, "csysOperatelogTime");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateIsNull() {
            addCriterion("CSYS_OPERATELOG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateIsNotNull() {
            addCriterion("CSYS_OPERATELOG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE =", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateNotEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE <>", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateGreaterThan(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE >", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE >=", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateLessThan(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE <", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_OPERATELOG_DATE <=", value, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_DATE in", values, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateNotIn(List<Date> values) {
            addCriterion("CSYS_OPERATELOG_DATE not in", values, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_DATE between", value1, value2, "csysOperatelogDate");
            return (Criteria) this;
        }

        public Criteria andCsysOperatelogDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_OPERATELOG_DATE not between", value1, value2, "csysOperatelogDate");
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