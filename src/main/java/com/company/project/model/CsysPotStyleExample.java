package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotStyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotStyleExample() {
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

        public Criteria andCsysPotStyleIdIsNull() {
            addCriterion("CSYS_POT_STYLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIsNotNull() {
            addCriterion("CSYS_POT_STYLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID =", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <>", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID >", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID >=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID <", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID not like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID not in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID not between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameIsNull() {
            addCriterion("CSYS_POT_STYLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameIsNotNull() {
            addCriterion("CSYS_POT_STYLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_NAME =", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_NAME <>", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_NAME >", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_NAME >=", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_NAME <", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_NAME <=", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameLike(String value) {
            addCriterion("CSYS_POT_STYLE_NAME like", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_NAME not like", value, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_NAME in", values, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_NAME not in", values, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_NAME between", value1, value2, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_NAME not between", value1, value2, "csysPotStyleName");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorIsNull() {
            addCriterion("CSYS_POT_STYLE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorIsNotNull() {
            addCriterion("CSYS_POT_STYLE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR =", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR <>", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR >", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR >=", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR <", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR <=", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorLike(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR like", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_COLOR not like", value, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_COLOR in", values, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_COLOR not in", values, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_COLOR between", value1, value2, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleColorNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_COLOR not between", value1, value2, "csysPotStyleColor");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescIsNull() {
            addCriterion("CSYS_POT_STYLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescIsNotNull() {
            addCriterion("CSYS_POT_STYLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_DESC =", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_DESC <>", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_DESC >", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_DESC >=", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_DESC <", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_DESC <=", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescLike(String value) {
            addCriterion("CSYS_POT_STYLE_DESC like", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_DESC not like", value, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_DESC in", values, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_DESC not in", values, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_DESC between", value1, value2, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_DESC not between", value1, value2, "csysPotStyleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeIsNull() {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME =", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME <>", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME >", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME >=", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME <", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME <=", value, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME in", values, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME not in", values, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME between", value1, value2, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_CREATE_TIME not between", value1, value2, "csysPotStyleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserIsNull() {
            addCriterion("CSYS_POT_STYLE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserIsNotNull() {
            addCriterion("CSYS_POT_STYLE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER =", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER <>", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER >", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER >=", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER <", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER <=", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserLike(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER like", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER not like", value, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER in", values, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER not in", values, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER between", value1, value2, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_CREATE_USER not between", value1, value2, "csysPotStyleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserIsNull() {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserIsNotNull() {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER =", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER <>", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER >", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER >=", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER <", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER <=", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserLike(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER like", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER not like", value, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER in", values, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER not in", values, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER between", value1, value2, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_MODIFY_USER not between", value1, value2, "csysPotStyleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeIsNull() {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME =", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME <>", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME >", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME >=", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME <", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME <=", value, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME in", values, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME not in", values, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME between", value1, value2, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_MODIFY_TIME not between", value1, value2, "csysPotStyleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteIsNull() {
            addCriterion("CSYS_POT_STYLE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_STYLE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE =", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE <>", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE >", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE >=", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE <", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE <=", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteLike(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE like", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE not like", value, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE in", values, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE not in", values, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE between", value1, value2, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_IS_DELETE not between", value1, value2, "csysPotStyleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeIsNull() {
            addCriterion("CSYS_POT_STYLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeIsNotNull() {
            addCriterion("CSYS_POT_STYLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME =", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME <>", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME >", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME >=", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeLessThan(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME <", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_TIME <=", value, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_TIME in", values, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_TIME not in", values, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_TIME between", value1, value2, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_TIME not between", value1, value2, "csysPotStyleTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateIsNull() {
            addCriterion("CSYS_POT_STYLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateIsNotNull() {
            addCriterion("CSYS_POT_STYLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE =", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE <>", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE >", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE >=", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateLessThan(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE <", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_STYLE_DATE <=", value, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_DATE in", values, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_STYLE_DATE not in", values, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_DATE between", value1, value2, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_STYLE_DATE not between", value1, value2, "csysPotStyleDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeIsNull() {
            addCriterion("CSYS_POT_STYLE_SHAPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeIsNotNull() {
            addCriterion("CSYS_POT_STYLE_SHAPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE =", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE <>", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE >", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE >=", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE <", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE <=", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeLike(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE like", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_SHAPE not like", value, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_SHAPE in", values, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_SHAPE not in", values, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_SHAPE between", value1, value2, "csysPotStyleShape");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleShapeNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_SHAPE not between", value1, value2, "csysPotStyleShape");
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