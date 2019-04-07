package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysOrgAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysOrgAuthExample() {
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

        public Criteria andCsysOrgAuthIdIsNull() {
            addCriterion("CSYS_ORG_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_ID =", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_ID <>", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_AUTH_ID >", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_ID >=", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdLessThan(String value) {
            addCriterion("CSYS_ORG_AUTH_ID <", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_ID <=", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdLike(String value) {
            addCriterion("CSYS_ORG_AUTH_ID like", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdNotLike(String value) {
            addCriterion("CSYS_ORG_AUTH_ID not like", value, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_ID in", values, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_ID not in", values, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_ID between", value1, value2, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_ID not between", value1, value2, "csysOrgAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdIsNull() {
            addCriterion("CSYS_ORG_STRUCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID =", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID <>", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID >", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID >=", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID <", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID <=", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID like", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_ID not like", value, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_ID in", values, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_ID not in", values, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_ID between", value1, value2, "csysOrgStruceId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_ID not between", value1, value2, "csysOrgStruceId");
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

        public Criteria andCsysPageNameIsNull() {
            addCriterion("CSYS_PAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIsNotNull() {
            addCriterion("CSYS_PAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME =", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <>", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThan(String value) {
            addCriterion("CSYS_PAGE_NAME >", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME >=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThan(String value) {
            addCriterion("CSYS_PAGE_NAME <", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLike(String value) {
            addCriterion("CSYS_PAGE_NAME like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotLike(String value) {
            addCriterion("CSYS_PAGE_NAME not like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME not in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME not between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeIsNull() {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME =", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME <>", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME >", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME >=", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME <", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME <=", value, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME in", values, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME not in", values, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME between", value1, value2, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_CREATE_TIME not between", value1, value2, "csysOrgAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserIsNull() {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER =", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER <>", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER >", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER >=", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER <", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER <=", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserLike(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER like", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER not like", value, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER in", values, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER not in", values, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER between", value1, value2, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_CREATE_USER not between", value1, value2, "csysOrgAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeIsNull() {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME =", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME <>", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME >", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME >=", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME <", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME <=", value, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME in", values, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME not in", values, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME between", value1, value2, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_TIME not between", value1, value2, "csysOrgAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteIsNull() {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE =", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE <>", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE >", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE >=", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE <", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE <=", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteLike(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE like", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE not like", value, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE in", values, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE not in", values, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE between", value1, value2, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_IS_DELETE not between", value1, value2, "csysOrgAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeIsNull() {
            addCriterion("CSYS_ORG_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME =", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME <>", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME >", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME >=", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME <", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_TIME <=", value, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_TIME in", values, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_TIME not in", values, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_TIME between", value1, value2, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_TIME not between", value1, value2, "csysOrgAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateIsNull() {
            addCriterion("CSYS_ORG_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE =", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE <>", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE >", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE >=", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateLessThan(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE <", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_AUTH_DATE <=", value, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_DATE in", values, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_AUTH_DATE not in", values, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_DATE between", value1, value2, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_AUTH_DATE not between", value1, value2, "csysOrgAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserIsNull() {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserIsNotNull() {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER =", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER <>", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER >", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER >=", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER <", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER <=", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserLike(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER like", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER not like", value, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER in", values, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER not in", values, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER between", value1, value2, "csysOrgAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_AUTH_MODIFY_USER not between", value1, value2, "csysOrgAuthModifyUser");
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