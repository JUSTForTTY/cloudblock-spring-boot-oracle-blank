package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysViewExplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysViewExplainExample() {
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

        public Criteria andCsysViewExplainIdIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID =", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <>", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID >", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID >=", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <=", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID like", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not like", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID in", values, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not in", values, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID between", value1, value2, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not between", value1, value2, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME =", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <>", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME >", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME >=", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <=", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME like", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not like", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME in", values, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not in", values, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME between", value1, value2, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not between", value1, value2, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE =", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <>", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE >", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE >=", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <=", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE like", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not like", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE in", values, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not in", values, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE between", value1, value2, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not between", value1, value2, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC =", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <>", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC >", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC >=", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <=", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC like", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not like", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC in", values, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not in", values, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC between", value1, value2, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not between", value1, value2, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME =", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME <>", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME >", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME >=", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeLessThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME <", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME <=", value, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME in", values, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME not in", values, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME between", value1, value2, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_TIME not between", value1, value2, "csysViewExplainCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME =", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME <>", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME >", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME >=", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeLessThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME <", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME <=", value, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME in", values, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME not in", values, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME between", value1, value2, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_TIME not between", value1, value2, "csysViewExplainModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER =", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER <>", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER >", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER >=", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER <", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER <=", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER like", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER not like", value, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER in", values, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER not in", values, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER between", value1, value2, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_CREATE_USER not between", value1, value2, "csysViewExplainCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER =", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER <>", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER >", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER >=", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER <", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER <=", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER like", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER not like", value, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER in", values, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER not in", values, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER between", value1, value2, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_MODIFY_USER not between", value1, value2, "csysViewExplainModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE =", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE <>", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE >", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE >=", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE <", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE <=", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE like", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE not like", value, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE in", values, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE not in", values, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE between", value1, value2, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_IS_DELETE not between", value1, value2, "csysViewExplainIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME =", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeNotEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME <>", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeGreaterThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME >", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME >=", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeLessThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME <", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME <=", value, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME in", values, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeNotIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME not in", values, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME between", value1, value2, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TIME not between", value1, value2, "csysViewExplainTime");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE =", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateNotEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE <>", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateGreaterThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE >", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE >=", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateLessThan(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE <", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE <=", value, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE in", values, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateNotIn(List<Date> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE not in", values, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE between", value1, value2, "csysViewExplainDate");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DATE not between", value1, value2, "csysViewExplainDate");
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