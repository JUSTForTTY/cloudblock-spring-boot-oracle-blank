package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysNoticeExample() {
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

        public Criteria andCsysNoticeIdIsNull() {
            addCriterion("CSYS_NOTICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdIsNotNull() {
            addCriterion("CSYS_NOTICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdEqualTo(String value) {
            addCriterion("CSYS_NOTICE_ID =", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_ID <>", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_ID >", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_ID >=", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdLessThan(String value) {
            addCriterion("CSYS_NOTICE_ID <", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_ID <=", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdLike(String value) {
            addCriterion("CSYS_NOTICE_ID like", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdNotLike(String value) {
            addCriterion("CSYS_NOTICE_ID not like", value, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdIn(List<String> values) {
            addCriterion("CSYS_NOTICE_ID in", values, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_ID not in", values, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_ID between", value1, value2, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_ID not between", value1, value2, "csysNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdIsNull() {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdIsNotNull() {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID =", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID <>", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID >", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID >=", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdLessThan(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID <", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID <=", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdLike(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID like", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdNotLike(String value) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID not like", value, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID in", values, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID not in", values, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID between", value1, value2, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTemplateIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TEMPLATE_ID not between", value1, value2, "csysNoticeTemplateId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameIsNull() {
            addCriterion("CSYS_NOTICE_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameIsNotNull() {
            addCriterion("CSYS_NOTICE_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME =", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME <>", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME >", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME >=", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameLessThan(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME <", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME <=", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameLike(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME like", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameNotLike(String value) {
            addCriterion("CSYS_NOTICE_TABLE_NAME not like", value, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TABLE_NAME in", values, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TABLE_NAME not in", values, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TABLE_NAME between", value1, value2, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TABLE_NAME not between", value1, value2, "csysNoticeTableName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueIsNull() {
            addCriterion("CSYS_NOTICE_TABLE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueIsNotNull() {
            addCriterion("CSYS_NOTICE_TABLE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE =", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE <>", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE >", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE >=", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueLessThan(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE <", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE <=", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueLike(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE like", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueNotLike(String value) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE not like", value, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE in", values, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE not in", values, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE between", value1, value2, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTableValueNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TABLE_VALUE not between", value1, value2, "csysNoticeTableValue");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdIsNull() {
            addCriterion("CSYS_NOTICE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdIsNotNull() {
            addCriterion("CSYS_NOTICE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_ID =", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_ID <>", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_USER_ID >", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_ID >=", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdLessThan(String value) {
            addCriterion("CSYS_NOTICE_USER_ID <", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_ID <=", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdLike(String value) {
            addCriterion("CSYS_NOTICE_USER_ID like", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdNotLike(String value) {
            addCriterion("CSYS_NOTICE_USER_ID not like", value, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdIn(List<String> values) {
            addCriterion("CSYS_NOTICE_USER_ID in", values, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_USER_ID not in", values, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_USER_ID between", value1, value2, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_USER_ID not between", value1, value2, "csysNoticeUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameIsNull() {
            addCriterion("CSYS_NOTICE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameIsNotNull() {
            addCriterion("CSYS_NOTICE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME =", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME <>", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME >", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME >=", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameLessThan(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME <", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME <=", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameLike(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME like", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameNotLike(String value) {
            addCriterion("CSYS_NOTICE_USER_NAME not like", value, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameIn(List<String> values) {
            addCriterion("CSYS_NOTICE_USER_NAME in", values, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_USER_NAME not in", values, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_USER_NAME between", value1, value2, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUserNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_USER_NAME not between", value1, value2, "csysNoticeUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdIsNull() {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdIsNotNull() {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID =", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID <>", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID >", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID >=", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdLessThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID <", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID <=", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID like", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdNotLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID not like", value, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID in", values, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID not in", values, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID between", value1, value2, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_ID not between", value1, value2, "csysNoticeHandleUserId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameIsNull() {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameIsNotNull() {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME =", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME <>", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME >", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME >=", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameLessThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME <", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME <=", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME like", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameNotLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME not like", value, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME in", values, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME not in", values, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME between", value1, value2, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleUserNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_USER_NAME not between", value1, value2, "csysNoticeHandleUserName");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileIsNull() {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileIsNotNull() {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE =", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE <>", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE >", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE >=", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileLessThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE <", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE <=", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE like", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileNotLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE not like", value, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE in", values, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE not in", values, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE between", value1, value2, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleMobileNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_MOBILE not between", value1, value2, "csysNoticeHandleMobile");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailIsNull() {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailIsNotNull() {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL =", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL <>", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL >", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL >=", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailLessThan(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL <", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL <=", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL like", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailNotLike(String value) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL not like", value, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL in", values, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL not in", values, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL between", value1, value2, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeHandleEmailNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_HANDLE_EMAIL not between", value1, value2, "csysNoticeHandleEmail");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeIsNull() {
            addCriterion("CSYS_NOTICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeIsNotNull() {
            addCriterion("CSYS_NOTICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TYPE =", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TYPE <>", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_TYPE >", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TYPE >=", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeLessThan(String value) {
            addCriterion("CSYS_NOTICE_TYPE <", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_TYPE <=", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeLike(String value) {
            addCriterion("CSYS_NOTICE_TYPE like", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeNotLike(String value) {
            addCriterion("CSYS_NOTICE_TYPE not like", value, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TYPE in", values, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_TYPE not in", values, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TYPE between", value1, value2, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_TYPE not between", value1, value2, "csysNoticeType");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdIsNull() {
            addCriterion("CSYS_POINT_TRS_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdIsNotNull() {
            addCriterion("CSYS_POINT_TRS_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID =", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdNotEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID <>", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdGreaterThan(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID >", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID >=", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdLessThan(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID <", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID <=", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdLike(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID like", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdNotLike(String value) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID not like", value, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID in", values, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdNotIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID not in", values, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID between", value1, value2, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsRecordIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_RECORD_ID not between", value1, value2, "csysPointTrsRecordId");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlIsNull() {
            addCriterion("CSYS_NOTICE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlIsNotNull() {
            addCriterion("CSYS_NOTICE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlEqualTo(String value) {
            addCriterion("CSYS_NOTICE_URL =", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_URL <>", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_URL >", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_URL >=", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlLessThan(String value) {
            addCriterion("CSYS_NOTICE_URL <", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_URL <=", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlLike(String value) {
            addCriterion("CSYS_NOTICE_URL like", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlNotLike(String value) {
            addCriterion("CSYS_NOTICE_URL not like", value, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlIn(List<String> values) {
            addCriterion("CSYS_NOTICE_URL in", values, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_URL not in", values, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_URL between", value1, value2, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeUrlNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_URL not between", value1, value2, "csysNoticeUrl");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelIsNull() {
            addCriterion("CSYS_NOTICE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelIsNotNull() {
            addCriterion("CSYS_NOTICE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelEqualTo(String value) {
            addCriterion("CSYS_NOTICE_LEVEL =", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_LEVEL <>", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_LEVEL >", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_LEVEL >=", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelLessThan(String value) {
            addCriterion("CSYS_NOTICE_LEVEL <", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_LEVEL <=", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelLike(String value) {
            addCriterion("CSYS_NOTICE_LEVEL like", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelNotLike(String value) {
            addCriterion("CSYS_NOTICE_LEVEL not like", value, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelIn(List<String> values) {
            addCriterion("CSYS_NOTICE_LEVEL in", values, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_LEVEL not in", values, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_LEVEL between", value1, value2, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeLevelNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_LEVEL not between", value1, value2, "csysNoticeLevel");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeIsNull() {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeIsNotNull() {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeEqualTo(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE =", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE <>", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE >", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE >=", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeLessThan(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE <", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE <=", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeLike(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE like", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeNotLike(String value) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE not like", value, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeIn(List<String> values) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE in", values, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE not in", values, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE between", value1, value2, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeOpertateTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_OPERTATE_TYPE not between", value1, value2, "csysNoticeOpertateType");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeIsNull() {
            addCriterion("CSYS_NOTICE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeIsNotNull() {
            addCriterion("CSYS_NOTICE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODE =", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODE <>", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_MODE >", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODE >=", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeLessThan(String value) {
            addCriterion("CSYS_NOTICE_MODE <", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODE <=", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeLike(String value) {
            addCriterion("CSYS_NOTICE_MODE like", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeNotLike(String value) {
            addCriterion("CSYS_NOTICE_MODE not like", value, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeIn(List<String> values) {
            addCriterion("CSYS_NOTICE_MODE in", values, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_MODE not in", values, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_MODE between", value1, value2, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModeNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_MODE not between", value1, value2, "csysNoticeMode");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessIsNull() {
            addCriterion("CSYS_NOTICE_IS_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessIsNotNull() {
            addCriterion("CSYS_NOTICE_IS_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS =", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS <>", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS >", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS >=", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessLessThan(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS <", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS <=", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessLike(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS like", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessNotLike(String value) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS not like", value, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessIn(List<String> values) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS in", values, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS not in", values, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS between", value1, value2, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsSuccessNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_IS_SUCCESS not between", value1, value2, "csysNoticeIsSuccess");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonIsNull() {
            addCriterion("CSYS_NOTICE_FAIL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonIsNotNull() {
            addCriterion("CSYS_NOTICE_FAIL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonEqualTo(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON =", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON <>", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON >", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON >=", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonLessThan(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON <", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON <=", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonLike(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON like", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonNotLike(String value) {
            addCriterion("CSYS_NOTICE_FAIL_REASON not like", value, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonIn(List<String> values) {
            addCriterion("CSYS_NOTICE_FAIL_REASON in", values, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_FAIL_REASON not in", values, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_FAIL_REASON between", value1, value2, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeFailReasonNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_FAIL_REASON not between", value1, value2, "csysNoticeFailReason");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescIsNull() {
            addCriterion("CSYS_NOTICE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescIsNotNull() {
            addCriterion("CSYS_NOTICE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescEqualTo(String value) {
            addCriterion("CSYS_NOTICE_DESC =", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_DESC <>", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_DESC >", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_DESC >=", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescLessThan(String value) {
            addCriterion("CSYS_NOTICE_DESC <", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_DESC <=", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescLike(String value) {
            addCriterion("CSYS_NOTICE_DESC like", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescNotLike(String value) {
            addCriterion("CSYS_NOTICE_DESC not like", value, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescIn(List<String> values) {
            addCriterion("CSYS_NOTICE_DESC in", values, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_DESC not in", values, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_DESC between", value1, value2, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_DESC not between", value1, value2, "csysNoticeDesc");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeIsNull() {
            addCriterion("CSYS_NOTICE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME =", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME <>", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME >", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME >=", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME <", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_CREATE_TIME <=", value, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_CREATE_TIME in", values, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_CREATE_TIME not in", values, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_CREATE_TIME between", value1, value2, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_CREATE_TIME not between", value1, value2, "csysNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserIsNull() {
            addCriterion("CSYS_NOTICE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserIsNotNull() {
            addCriterion("CSYS_NOTICE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserEqualTo(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER =", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER <>", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER >", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER >=", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserLessThan(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER <", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER <=", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserLike(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER like", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserNotLike(String value) {
            addCriterion("CSYS_NOTICE_CREATE_USER not like", value, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserIn(List<String> values) {
            addCriterion("CSYS_NOTICE_CREATE_USER in", values, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_CREATE_USER not in", values, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_CREATE_USER between", value1, value2, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_CREATE_USER not between", value1, value2, "csysNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeIsNull() {
            addCriterion("CSYS_NOTICE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME =", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME <>", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME >", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME >=", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME <", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME <=", value, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME in", values, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME not in", values, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME between", value1, value2, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_MODIFY_TIME not between", value1, value2, "csysNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserIsNull() {
            addCriterion("CSYS_NOTICE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserIsNotNull() {
            addCriterion("CSYS_NOTICE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER =", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER <>", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER >", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER >=", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserLessThan(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER <", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER <=", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserLike(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER like", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserNotLike(String value) {
            addCriterion("CSYS_NOTICE_MODIFY_USER not like", value, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserIn(List<String> values) {
            addCriterion("CSYS_NOTICE_MODIFY_USER in", values, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_MODIFY_USER not in", values, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_MODIFY_USER between", value1, value2, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_MODIFY_USER not between", value1, value2, "csysNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteIsNull() {
            addCriterion("CSYS_NOTICE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteIsNotNull() {
            addCriterion("CSYS_NOTICE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE =", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE <>", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE >", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE >=", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteLessThan(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE <", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE <=", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteLike(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE like", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteNotLike(String value) {
            addCriterion("CSYS_NOTICE_IS_DELETE not like", value, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteIn(List<String> values) {
            addCriterion("CSYS_NOTICE_IS_DELETE in", values, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_NOTICE_IS_DELETE not in", values, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_IS_DELETE between", value1, value2, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_NOTICE_IS_DELETE not between", value1, value2, "csysNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeIsNull() {
            addCriterion("CSYS_NOTICE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeIsNotNull() {
            addCriterion("CSYS_NOTICE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TIME =", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TIME <>", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_TIME >", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TIME >=", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeLessThan(Date value) {
            addCriterion("CSYS_NOTICE_TIME <", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_TIME <=", value, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TIME in", values, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_TIME not in", values, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TIME between", value1, value2, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_TIME not between", value1, value2, "csysNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateIsNull() {
            addCriterion("CSYS_NOTICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateIsNotNull() {
            addCriterion("CSYS_NOTICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_DATE =", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateNotEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_DATE <>", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateGreaterThan(Date value) {
            addCriterion("CSYS_NOTICE_DATE >", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_DATE >=", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateLessThan(Date value) {
            addCriterion("CSYS_NOTICE_DATE <", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_NOTICE_DATE <=", value, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_DATE in", values, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateNotIn(List<Date> values) {
            addCriterion("CSYS_NOTICE_DATE not in", values, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_DATE between", value1, value2, "csysNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_NOTICE_DATE not between", value1, value2, "csysNoticeDate");
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