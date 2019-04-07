package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotPublicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotPublicExample() {
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

        public Criteria andCsysPotPublicIdIsNull() {
            addCriterion("CSYS_POT_PUBLIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID =", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <>", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID >", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID >=", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <=", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID like", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID not like", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_ID in", values, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_ID not in", values, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_ID between", value1, value2, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_ID not between", value1, value2, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNull() {
            addCriterion("CSYS_POT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNotNull() {
            addCriterion("CSYS_POT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameEqualTo(String value) {
            addCriterion("CSYS_POT_NAME =", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <>", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThan(String value) {
            addCriterion("CSYS_POT_NAME >", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME >=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThan(String value) {
            addCriterion("CSYS_POT_NAME <", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLike(String value) {
            addCriterion("CSYS_POT_NAME like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotLike(String value) {
            addCriterion("CSYS_POT_NAME not like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIn(List<String> values) {
            addCriterion("CSYS_POT_NAME in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_NAME not in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME not between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescIsNull() {
            addCriterion("CSYS_POT_PUBLIC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC =", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC <>", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC >", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC >=", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC <", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC <=", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC like", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_DESC not like", value, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_DESC in", values, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_DESC not in", values, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_DESC between", value1, value2, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_DESC not between", value1, value2, "csysPotPublicDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeIsNull() {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME =", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME <>", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME >", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME >=", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME <", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME <=", value, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME in", values, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME not in", values, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME between", value1, value2, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_TIME not between", value1, value2, "csysPotPublicCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeIsNull() {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME =", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME <>", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME >", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME >=", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME <", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME <=", value, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME in", values, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME not in", values, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME between", value1, value2, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_TIME not between", value1, value2, "csysPotPublicModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserIsNull() {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER =", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER <>", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER >", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER >=", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER <", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER <=", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER like", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER not like", value, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER in", values, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER not in", values, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER between", value1, value2, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_CREATE_USER not between", value1, value2, "csysPotPublicCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserIsNull() {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER =", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER <>", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER >", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER >=", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER <", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER <=", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER like", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER not like", value, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER in", values, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER not in", values, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER between", value1, value2, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_MODIFY_USER not between", value1, value2, "csysPotPublicModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteIsNull() {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE =", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE <>", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE >", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE >=", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE <", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE <=", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE like", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE not like", value, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE in", values, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE not in", values, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE between", value1, value2, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_IS_DELETE not between", value1, value2, "csysPotPublicIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateIsNull() {
            addCriterion("CSYS_POT_PUBLIC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE =", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE <>", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE >", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE >=", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateLessThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE <", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_DATE <=", value, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_DATE in", values, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_DATE not in", values, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_DATE between", value1, value2, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_DATE not between", value1, value2, "csysPotPublicDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeIsNull() {
            addCriterion("CSYS_POT_PUBLIC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME =", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME <>", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME >", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME >=", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeLessThan(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME <", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_PUBLIC_TIME <=", value, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_TIME in", values, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_PUBLIC_TIME not in", values, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_TIME between", value1, value2, "csysPotPublicTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_PUBLIC_TIME not between", value1, value2, "csysPotPublicTime");
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