package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotGroupExample() {
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

        public Criteria andCsysPotGroupIdIsNull() {
            addCriterion("CSYS_POT_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdIsNotNull() {
            addCriterion("CSYS_POT_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID =", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID <>", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_ID >", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID >=", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_ID <", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID <=", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLike(String value) {
            addCriterion("CSYS_POT_GROUP_ID like", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_ID not like", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_ID in", values, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_ID not in", values, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_ID between", value1, value2, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_ID not between", value1, value2, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameIsNull() {
            addCriterion("CSYS_POT_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameIsNotNull() {
            addCriterion("CSYS_POT_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_NAME =", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_NAME <>", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_NAME >", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_NAME >=", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_NAME <", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_NAME <=", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameLike(String value) {
            addCriterion("CSYS_POT_GROUP_NAME like", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_NAME not like", value, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_NAME in", values, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_NAME not in", values, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_NAME between", value1, value2, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_NAME not between", value1, value2, "csysPotGroupName");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescIsNull() {
            addCriterion("CSYS_POT_GROUP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescIsNotNull() {
            addCriterion("CSYS_POT_GROUP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_DESC =", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_DESC <>", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_DESC >", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_DESC >=", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_DESC <", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_DESC <=", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescLike(String value) {
            addCriterion("CSYS_POT_GROUP_DESC like", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_DESC not like", value, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_DESC in", values, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_DESC not in", values, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_DESC between", value1, value2, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_DESC not between", value1, value2, "csysPotGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeIsNull() {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME =", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME <>", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME >", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME >=", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME <", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME <=", value, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME in", values, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME not in", values, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME between", value1, value2, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_CREATE_TIME not between", value1, value2, "csysPotGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserIsNull() {
            addCriterion("CSYS_POT_GROUP_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserIsNotNull() {
            addCriterion("CSYS_POT_GROUP_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER =", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER <>", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER >", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER >=", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER <", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER <=", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserLike(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER like", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER not like", value, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER in", values, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER not in", values, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER between", value1, value2, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_CREATE_USER not between", value1, value2, "csysPotGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserIsNull() {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserIsNotNull() {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER =", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER <>", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER >", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER >=", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER <", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER <=", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserLike(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER like", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER not like", value, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER in", values, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER not in", values, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER between", value1, value2, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_MODIFY_USER not between", value1, value2, "csysPotGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeIsNull() {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME =", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME <>", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME >", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME >=", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME <", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME <=", value, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME in", values, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME not in", values, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME between", value1, value2, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_MODIFY_TIME not between", value1, value2, "csysPotGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteIsNull() {
            addCriterion("CSYS_POT_GROUP_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_GROUP_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE =", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE <>", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE >", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE >=", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE <", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE <=", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteLike(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE like", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE not like", value, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE in", values, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE not in", values, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE between", value1, value2, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_IS_DELETE not between", value1, value2, "csysPotGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeIsNull() {
            addCriterion("CSYS_POT_GROUP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeIsNotNull() {
            addCriterion("CSYS_POT_GROUP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME =", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME <>", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME >", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME >=", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeLessThan(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME <", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_TIME <=", value, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_TIME in", values, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_TIME not in", values, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_TIME between", value1, value2, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_TIME not between", value1, value2, "csysPotGroupTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateIsNull() {
            addCriterion("CSYS_POT_GROUP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateIsNotNull() {
            addCriterion("CSYS_POT_GROUP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE =", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE <>", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE >", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE >=", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateLessThan(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE <", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_GROUP_DATE <=", value, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_DATE in", values, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_GROUP_DATE not in", values, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_DATE between", value1, value2, "csysPotGroupDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_GROUP_DATE not between", value1, value2, "csysPotGroupDate");
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