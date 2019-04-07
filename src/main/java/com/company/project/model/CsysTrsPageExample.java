package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysTrsPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysTrsPageExample() {
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

        public Criteria andCsysTrsPageIdIsNull() {
            addCriterion("CSYS_TRS_PAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_ID =", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_ID <>", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_PAGE_ID >", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_ID >=", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdLessThan(String value) {
            addCriterion("CSYS_TRS_PAGE_ID <", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_ID <=", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdLike(String value) {
            addCriterion("CSYS_TRS_PAGE_ID like", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdNotLike(String value) {
            addCriterion("CSYS_TRS_PAGE_ID not like", value, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_ID in", values, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_ID not in", values, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_ID between", value1, value2, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_ID not between", value1, value2, "csysTrsPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdIsNull() {
            addCriterion("CSYS_POINT_TRS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdIsNotNull() {
            addCriterion("CSYS_POINT_TRS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID =", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID <>", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdGreaterThan(String value) {
            addCriterion("CSYS_POINT_TRS_ID >", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID >=", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLessThan(String value) {
            addCriterion("CSYS_POINT_TRS_ID <", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POINT_TRS_ID <=", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdLike(String value) {
            addCriterion("CSYS_POINT_TRS_ID like", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotLike(String value) {
            addCriterion("CSYS_POINT_TRS_ID not like", value, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_ID in", values, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotIn(List<String> values) {
            addCriterion("CSYS_POINT_TRS_ID not in", values, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_ID between", value1, value2, "csysPointTrsId");
            return (Criteria) this;
        }

        public Criteria andCsysPointTrsIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POINT_TRS_ID not between", value1, value2, "csysPointTrsId");
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

        public Criteria andCsysTrsPageDescIsNull() {
            addCriterion("CSYS_TRS_PAGE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC =", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescNotEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC <>", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescGreaterThan(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC >", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC >=", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescLessThan(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC <", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC <=", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescLike(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC like", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescNotLike(String value) {
            addCriterion("CSYS_TRS_PAGE_DESC not like", value, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_DESC in", values, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescNotIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_DESC not in", values, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_DESC between", value1, value2, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_DESC not between", value1, value2, "csysTrsPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeIsNull() {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME =", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME <>", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME >", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME >=", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME <", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME <=", value, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME in", values, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME not in", values, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME between", value1, value2, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_CREATE_TIME not between", value1, value2, "csysTrsPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeIsNull() {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME =", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME <>", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME >", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME >=", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME <", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME <=", value, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME in", values, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME not in", values, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME between", value1, value2, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_TIME not between", value1, value2, "csysTrsPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserIsNull() {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER =", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER <>", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER >", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER >=", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserLessThan(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER <", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER <=", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserLike(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER like", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserNotLike(String value) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER not like", value, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER in", values, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER not in", values, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER between", value1, value2, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_CREATE_USER not between", value1, value2, "csysTrsPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserIsNull() {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER =", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER <>", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserGreaterThan(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER >", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER >=", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserLessThan(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER <", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER <=", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserLike(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER like", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserNotLike(String value) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER not like", value, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER in", values, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER not in", values, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER between", value1, value2, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_MODIFY_USER not between", value1, value2, "csysTrsPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteIsNull() {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE =", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE <>", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE >", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE >=", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteLessThan(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE <", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE <=", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteLike(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE like", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteNotLike(String value) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE not like", value, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE in", values, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE not in", values, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE between", value1, value2, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_PAGE_IS_DELETE not between", value1, value2, "csysTrsPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeIsNull() {
            addCriterion("CSYS_TRS_PAGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME =", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME <>", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeGreaterThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME >", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME >=", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeLessThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME <", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_TIME <=", value, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_TIME in", values, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_TIME not in", values, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_TIME between", value1, value2, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_TIME not between", value1, value2, "csysTrsPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateIsNull() {
            addCriterion("CSYS_TRS_PAGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateIsNotNull() {
            addCriterion("CSYS_TRS_PAGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE =", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateNotEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE <>", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateGreaterThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE >", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE >=", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateLessThan(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE <", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_TRS_PAGE_DATE <=", value, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_DATE in", values, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateNotIn(List<Date> values) {
            addCriterion("CSYS_TRS_PAGE_DATE not in", values, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_DATE between", value1, value2, "csysTrsPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysTrsPageDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_TRS_PAGE_DATE not between", value1, value2, "csysTrsPageDate");
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