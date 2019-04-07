package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPageLayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPageLayoutExample() {
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

        public Criteria andCsysPageLayoutIdIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID =", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <>", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID >", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID >=", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <=", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID like", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not like", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_ID in", values, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not in", values, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_ID between", value1, value2, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not between", value1, value2, "csysPageLayoutId");
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

        public Criteria andCsysLayoutIdIsNull() {
            addCriterion("CSYS_LAYOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdIsNotNull() {
            addCriterion("CSYS_LAYOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID =", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID <>", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdGreaterThan(String value) {
            addCriterion("CSYS_LAYOUT_ID >", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID >=", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLessThan(String value) {
            addCriterion("CSYS_LAYOUT_ID <", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID <=", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLike(String value) {
            addCriterion("CSYS_LAYOUT_ID like", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotLike(String value) {
            addCriterion("CSYS_LAYOUT_ID not like", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_ID in", values, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_ID not in", values, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_ID between", value1, value2, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_ID not between", value1, value2, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameIsNull() {
            addCriterion("CSYS_LAYOUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameIsNotNull() {
            addCriterion("CSYS_LAYOUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_NAME =", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameNotEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_NAME <>", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameGreaterThan(String value) {
            addCriterion("CSYS_LAYOUT_NAME >", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_NAME >=", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameLessThan(String value) {
            addCriterion("CSYS_LAYOUT_NAME <", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_NAME <=", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameLike(String value) {
            addCriterion("CSYS_LAYOUT_NAME like", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameNotLike(String value) {
            addCriterion("CSYS_LAYOUT_NAME not like", value, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_NAME in", values, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameNotIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_NAME not in", values, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_NAME between", value1, value2, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_NAME not between", value1, value2, "csysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE =", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE <>", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE >", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE >=", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE <", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE <=", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE like", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE not like", value, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE in", values, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE not in", values, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE between", value1, value2, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutSenceNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_SENCE not between", value1, value2, "csysPageLayoutSence");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME =", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME <>", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME >", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME >=", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME <", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME <=", value, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME in", values, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME not in", values, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME between", value1, value2, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_TIME not between", value1, value2, "csysPageLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME =", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME <>", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME >", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME >=", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME <", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME <=", value, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME in", values, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME not in", values, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME between", value1, value2, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_TIME not between", value1, value2, "csysPageLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER =", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER <>", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER >", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER >=", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER <", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER <=", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER like", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER not like", value, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER in", values, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER not in", values, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER between", value1, value2, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_CREATE_USER not between", value1, value2, "csysPageLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER =", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER <>", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER >", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER >=", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER <", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER <=", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER like", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER not like", value, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER in", values, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER not in", values, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER between", value1, value2, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_MODIFY_USER not between", value1, value2, "csysPageLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE =", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE <>", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE >", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE >=", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE <", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE <=", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE like", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE not like", value, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE in", values, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE not in", values, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE between", value1, value2, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_IS_DELETE not between", value1, value2, "csysPageLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME =", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME <>", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME >", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME >=", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME <", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME <=", value, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME in", values, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME not in", values, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME between", value1, value2, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_TIME not between", value1, value2, "csysPageLayoutTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE =", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE <>", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE >", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE >=", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateLessThan(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE <", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE <=", value, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE in", values, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE not in", values, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE between", value1, value2, "csysPageLayoutDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_LAYOUT_DATE not between", value1, value2, "csysPageLayoutDate");
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