package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysUserNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysUserNoticeExample() {
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

        public Criteria andCsysUserNoticeIdIsNull() {
            addCriterion("CSYS_USER__NOTICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_ID =", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdNotEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_ID <>", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdGreaterThan(String value) {
            addCriterion("CSYS_USER__NOTICE_ID >", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_ID >=", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdLessThan(String value) {
            addCriterion("CSYS_USER__NOTICE_ID <", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_ID <=", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdLike(String value) {
            addCriterion("CSYS_USER__NOTICE_ID like", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdNotLike(String value) {
            addCriterion("CSYS_USER__NOTICE_ID not like", value, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_ID in", values, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdNotIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_ID not in", values, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_ID between", value1, value2, "csysUserNoticeId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_ID not between", value1, value2, "csysUserNoticeId");
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

        public Criteria andCsysUserNoticeCreateTimeIsNull() {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME =", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME <>", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME >", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME >=", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeLessThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME <", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME <=", value, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME in", values, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME not in", values, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME between", value1, value2, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_CREATE_TIME not between", value1, value2, "csysUserNoticeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeIsNull() {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME =", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME <>", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME >", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME >=", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeLessThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME <", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME <=", value, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME in", values, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME not in", values, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME between", value1, value2, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_TIME not between", value1, value2, "csysUserNoticeModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserIsNull() {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER =", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER <>", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserGreaterThan(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER >", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER >=", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserLessThan(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER <", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER <=", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserLike(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER like", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserNotLike(String value) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER not like", value, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER in", values, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER not in", values, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER between", value1, value2, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_CREATE_USER not between", value1, value2, "csysUserNoticeCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserIsNull() {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER =", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER <>", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserGreaterThan(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER >", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER >=", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserLessThan(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER <", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER <=", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserLike(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER like", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserNotLike(String value) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER not like", value, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER in", values, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER not in", values, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER between", value1, value2, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_MODIFY_USER not between", value1, value2, "csysUserNoticeModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteIsNull() {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE =", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE <>", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE >", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE >=", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteLessThan(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE <", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE <=", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteLike(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE like", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteNotLike(String value) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE not like", value, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE in", values, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE not in", values, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE between", value1, value2, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER__NOTICE_IS_DELETE not between", value1, value2, "csysUserNoticeIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateIsNull() {
            addCriterion("CSYS_USER__NOTICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE =", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateNotEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE <>", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateGreaterThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE >", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE >=", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateLessThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE <", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_DATE <=", value, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_DATE in", values, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateNotIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_DATE not in", values, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_DATE between", value1, value2, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_DATE not between", value1, value2, "csysUserNoticeDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeIsNull() {
            addCriterion("CSYS_USER__NOTICE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeIsNotNull() {
            addCriterion("CSYS_USER__NOTICE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME =", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME <>", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME >", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME >=", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeLessThan(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME <", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER__NOTICE_TIME <=", value, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_TIME in", values, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER__NOTICE_TIME not in", values, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_TIME between", value1, value2, "csysUserNoticeTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER__NOTICE_TIME not between", value1, value2, "csysUserNoticeTime");
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