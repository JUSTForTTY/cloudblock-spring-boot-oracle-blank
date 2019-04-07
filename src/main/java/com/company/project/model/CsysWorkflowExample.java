package com.company.project.outer.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysWorkflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysWorkflowExample() {
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

        public Criteria andCsysWorkflowTypeIsNull() {
            addCriterion("CSYS_WORKFLOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE =", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <>", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE >", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE >=", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <=", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLike(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE like", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE not like", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_TYPE in", values, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_TYPE not in", values, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_TYPE between", value1, value2, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_TYPE not between", value1, value2, "csysWorkflowType");
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

        public Criteria andCsysWorkflowColorthemeIsNull() {
            addCriterion("CSYS_WORKFLOW_COLORTHEME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_COLORTHEME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME =", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME <>", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME >", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME >=", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME <", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME <=", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeLike(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME like", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME not like", value, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME in", values, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME not in", values, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME between", value1, value2, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowColorthemeNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_COLORTHEME not between", value1, value2, "csysWorkflowColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleIsNull() {
            addCriterion("CSYS_WORKFLOW_LINESTYLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleIsNotNull() {
            addCriterion("CSYS_WORKFLOW_LINESTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE =", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE <>", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE >", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE >=", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE <", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE <=", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleLike(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE like", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE not like", value, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE in", values, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE not in", values, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE between", value1, value2, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowLinestyleNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_LINESTYLE not between", value1, value2, "csysWorkflowLinestyle");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationIsNull() {
            addCriterion("CSYS_WORKFLOW_ORIENTATION is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationIsNotNull() {
            addCriterion("CSYS_WORKFLOW_ORIENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION =", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION <>", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION >", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION >=", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION <", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION <=", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationLike(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION like", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION not like", value, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION in", values, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION not in", values, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION between", value1, value2, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowOrientationNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ORIENTATION not between", value1, value2, "csysWorkflowOrientation");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdIsNull() {
            addCriterion("CSYS_WORKFLOW_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdIsNotNull() {
            addCriterion("CSYS_WORKFLOW_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID =", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID <>", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID >", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID >=", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID <", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID <=", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdLike(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID like", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID not like", value, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID in", values, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID not in", values, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID between", value1, value2, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowParentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_PARENT_ID not between", value1, value2, "csysWorkflowParentId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionIsNull() {
            addCriterion("CSYS_WORKFLOW_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionIsNotNull() {
            addCriterion("CSYS_WORKFLOW_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION =", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION <>", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION >", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION >=", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION <", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION <=", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionLike(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION like", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_VERSION not like", value, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_VERSION in", values, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_VERSION not in", values, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_VERSION between", value1, value2, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowVersionNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_VERSION not between", value1, value2, "csysWorkflowVersion");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateIsNull() {
            addCriterion("CSYS_WORKFLOW_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateIsNotNull() {
            addCriterion("CSYS_WORKFLOW_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateEqualTo(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE =", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateNotEqualTo(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE <>", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateGreaterThan(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE >", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE >=", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateLessThan(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE <", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE <=", value, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateIn(List<BigDecimal> values) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE in", values, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateNotIn(List<BigDecimal> values) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE not in", values, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE between", value1, value2, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDueDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_WORKFLOW_DUE_DATE not between", value1, value2, "csysWorkflowDueDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescIsNull() {
            addCriterion("CSYS_WORKFLOW_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescIsNotNull() {
            addCriterion("CSYS_WORKFLOW_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_DESC =", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_DESC <>", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_DESC >", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_DESC >=", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_DESC <", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_DESC <=", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescLike(String value) {
            addCriterion("CSYS_WORKFLOW_DESC like", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_DESC not like", value, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_DESC in", values, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_DESC not in", values, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_DESC between", value1, value2, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_DESC not between", value1, value2, "csysWorkflowDesc");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME =", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME <>", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME >", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME >=", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME <", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME <=", value, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME in", values, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME not in", values, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME between", value1, value2, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_CREATE_TIME not between", value1, value2, "csysWorkflowCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserIsNull() {
            addCriterion("CSYS_WORKFLOW_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserIsNotNull() {
            addCriterion("CSYS_WORKFLOW_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER =", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER <>", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER >", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER >=", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER <", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER <=", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserLike(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER like", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER not like", value, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER in", values, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER not in", values, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER between", value1, value2, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_CREATE_USER not between", value1, value2, "csysWorkflowCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserIsNull() {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserIsNotNull() {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER =", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER <>", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER >", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER >=", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER <", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER <=", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserLike(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER like", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER not like", value, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER in", values, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER not in", values, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER between", value1, value2, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_MODIFY_USER not between", value1, value2, "csysWorkflowModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME =", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME <>", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME >", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME >=", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME <", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME <=", value, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME in", values, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME not in", values, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME between", value1, value2, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_MODIFY_TIME not between", value1, value2, "csysWorkflowModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteIsNull() {
            addCriterion("CSYS_WORKFLOW_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteIsNotNull() {
            addCriterion("CSYS_WORKFLOW_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE =", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE <>", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE >", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE >=", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE <", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE <=", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteLike(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE like", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE not like", value, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE in", values, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE not in", values, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE between", value1, value2, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_IS_DELETE not between", value1, value2, "csysWorkflowIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateIsNull() {
            addCriterion("CSYS_WORKFLOW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateIsNotNull() {
            addCriterion("CSYS_WORKFLOW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE =", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE <>", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE >", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE >=", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE <", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_DATE <=", value, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_DATE in", values, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_DATE not in", values, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_DATE between", value1, value2, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_DATE not between", value1, value2, "csysWorkflowDate");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeIsNull() {
            addCriterion("CSYS_WORKFLOW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME =", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeNotEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME <>", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeGreaterThan(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME >", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME >=", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeLessThan(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME <", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_WORKFLOW_TIME <=", value, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_TIME in", values, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeNotIn(List<Date> values) {
            addCriterion("CSYS_WORKFLOW_TIME not in", values, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_TIME between", value1, value2, "csysWorkflowTime");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_WORKFLOW_TIME not between", value1, value2, "csysWorkflowTime");
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