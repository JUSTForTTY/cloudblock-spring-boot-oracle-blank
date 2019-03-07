package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPbAssocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPbAssocExample() {
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

        public Criteria andCsysPbAssocIdIsNull() {
            addCriterion("CSYS_PB_ASSOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_ID =", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_ID <>", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_ID >", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_ID >=", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_ID <", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_ID <=", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdLike(String value) {
            addCriterion("CSYS_PB_ASSOC_ID like", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_ID not like", value, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_ID in", values, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_ID not in", values, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_ID between", value1, value2, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_ID not between", value1, value2, "csysPbAssocId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNull() {
            addCriterion("CSYS_PAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNotNull() {
            addCriterion("CSYS_PAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID =", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <>", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_ID >", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID >=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThan(String value) {
            addCriterion("CSYS_PAGE_ID <", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLike(String value) {
            addCriterion("CSYS_PAGE_ID like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotLike(String value) {
            addCriterion("CSYS_PAGE_ID not like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID not in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID not between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1IsNull() {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1IsNotNull() {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1EqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 =", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1NotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 <>", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1GreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 >", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1GreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 >=", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1LessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 <", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1LessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 <=", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1Like(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 like", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1NotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 not like", value, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1In(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 in", values, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1NotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 not in", values, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1Between(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 between", value1, value2, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId1NotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID1 not between", value1, value2, "csysPbAssocRunId1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2IsNull() {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2IsNotNull() {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2EqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 =", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2NotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 <>", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2GreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 >", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2GreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 >=", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2LessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 <", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2LessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 <=", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2Like(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 like", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2NotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 not like", value, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2In(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 in", values, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2NotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 not in", values, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2Between(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 between", value1, value2, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocRunId2NotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_RUN_ID2 not between", value1, value2, "csysPbAssocRunId2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeIsNull() {
            addCriterion("CSYS_PB_ASSOC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE =", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE <>", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE >", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE >=", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE <", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE <=", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeLike(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE like", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_TYPE not like", value, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_TYPE in", values, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_TYPE not in", values, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_TYPE between", value1, value2, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_TYPE not between", value1, value2, "csysPbAssocType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1IsNull() {
            addCriterion("CSYS_PB_ASSOC_KEY1 is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1IsNotNull() {
            addCriterion("CSYS_PB_ASSOC_KEY1 is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1EqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 =", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1NotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 <>", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1GreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 >", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1GreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 >=", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1LessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 <", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1LessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 <=", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1Like(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 like", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1NotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY1 not like", value, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1In(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_KEY1 in", values, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1NotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_KEY1 not in", values, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1Between(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_KEY1 between", value1, value2, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey1NotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_KEY1 not between", value1, value2, "csysPbAssocKey1");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2IsNull() {
            addCriterion("CSYS_PB_ASSOC_KEY2 is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2IsNotNull() {
            addCriterion("CSYS_PB_ASSOC_KEY2 is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2EqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 =", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2NotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 <>", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2GreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 >", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2GreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 >=", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2LessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 <", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2LessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 <=", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2Like(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 like", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2NotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_KEY2 not like", value, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2In(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_KEY2 in", values, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2NotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_KEY2 not in", values, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2Between(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_KEY2 between", value1, value2, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocKey2NotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_KEY2 not between", value1, value2, "csysPbAssocKey2");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeIsNull() {
            addCriterion("CSYS_PB_ASSOC_MODE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE =", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE <>", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE >", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE >=", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE <", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE <=", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeLike(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE like", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_MODE not like", value, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_MODE in", values, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_MODE not in", values, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_MODE between", value1, value2, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModeNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_MODE not between", value1, value2, "csysPbAssocMode");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeIsNull() {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE =", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE <>", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE >", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE >=", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE <", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE <=", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeLike(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE like", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE not like", value, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE in", values, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE not in", values, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE between", value1, value2, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocLinkTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_LINK_TYPE not between", value1, value2, "csysPbAssocLinkType");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeIsNull() {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME =", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME <>", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME >", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME >=", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME <", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME <=", value, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME in", values, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME not in", values, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME between", value1, value2, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_CREATE_TIME not between", value1, value2, "csysPbAssocCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeIsNull() {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME =", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME <>", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME >", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME >=", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME <", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME <=", value, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME in", values, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME not in", values, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME between", value1, value2, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_TIME not between", value1, value2, "csysPbAssocModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserIsNull() {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER =", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER <>", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER >", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER >=", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER <", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER <=", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserLike(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER like", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER not like", value, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER in", values, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER not in", values, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER between", value1, value2, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_CREATE_USER not between", value1, value2, "csysPbAssocCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserIsNull() {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER =", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER <>", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER >", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER >=", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER <", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER <=", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserLike(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER like", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER not like", value, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER in", values, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER not in", values, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER between", value1, value2, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_MODIFY_USER not between", value1, value2, "csysPbAssocModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteIsNull() {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE =", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE <>", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE >", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE >=", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteLessThan(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE <", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE <=", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteLike(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE like", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteNotLike(String value) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE not like", value, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE in", values, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE not in", values, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE between", value1, value2, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PB_ASSOC_IS_DELETE not between", value1, value2, "csysPbAssocIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeIsNull() {
            addCriterion("CSYS_PB_ASSOC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME =", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME <>", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeGreaterThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME >", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME >=", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeLessThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME <", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_TIME <=", value, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_TIME in", values, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_TIME not in", values, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_TIME between", value1, value2, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_TIME not between", value1, value2, "csysPbAssocTime");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateIsNull() {
            addCriterion("CSYS_PB_ASSOC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateIsNotNull() {
            addCriterion("CSYS_PB_ASSOC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE =", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateNotEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE <>", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateGreaterThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE >", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE >=", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateLessThan(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE <", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PB_ASSOC_DATE <=", value, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_DATE in", values, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateNotIn(List<Date> values) {
            addCriterion("CSYS_PB_ASSOC_DATE not in", values, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_DATE between", value1, value2, "csysPbAssocDate");
            return (Criteria) this;
        }

        public Criteria andCsysPbAssocDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PB_ASSOC_DATE not between", value1, value2, "csysPbAssocDate");
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