package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysUserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysUserRoleExample() {
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

        public Criteria andCsysUserRoleIdIsNull() {
            addCriterion("CSYS_USER_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdIsNotNull() {
            addCriterion("CSYS_USER_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_ID =", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdNotEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_ID <>", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdGreaterThan(String value) {
            addCriterion("CSYS_USER_ROLE_ID >", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_ID >=", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdLessThan(String value) {
            addCriterion("CSYS_USER_ROLE_ID <", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_ID <=", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdLike(String value) {
            addCriterion("CSYS_USER_ROLE_ID like", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdNotLike(String value) {
            addCriterion("CSYS_USER_ROLE_ID not like", value, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_ID in", values, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdNotIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_ID not in", values, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_ID between", value1, value2, "csysUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_ID not between", value1, value2, "csysUserRoleId");
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

        public Criteria andCsysRoleIdIsNull() {
            addCriterion("CSYS_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIsNotNull() {
            addCriterion("CSYS_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID =", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <>", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThan(String value) {
            addCriterion("CSYS_ROLE_ID >", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID >=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThan(String value) {
            addCriterion("CSYS_ROLE_ID <", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLike(String value) {
            addCriterion("CSYS_ROLE_ID like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotLike(String value) {
            addCriterion("CSYS_ROLE_ID not like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID not in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID between", value1, value2, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID not between", value1, value2, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIsNull() {
            addCriterion("CSYS_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIsNotNull() {
            addCriterion("CSYS_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID =", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <>", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdGreaterThan(String value) {
            addCriterion("CSYS_DEPARTMENT_ID >", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID >=", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLessThan(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <=", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLike(String value) {
            addCriterion("CSYS_DEPARTMENT_ID like", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotLike(String value) {
            addCriterion("CSYS_DEPARTMENT_ID not like", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_ID in", values, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_ID not in", values, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_ID between", value1, value2, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_ID not between", value1, value2, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeIsNull() {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeIsNotNull() {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME =", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME <>", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME >", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME >=", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeLessThan(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME <", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME <=", value, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME in", values, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME not in", values, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME between", value1, value2, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_CREATE_TIME not between", value1, value2, "csysUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeIsNull() {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeIsNotNull() {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME =", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME <>", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME >", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME >=", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeLessThan(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME <", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME <=", value, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME in", values, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME not in", values, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME between", value1, value2, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_MODIFY_TIME not between", value1, value2, "csysUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserIsNull() {
            addCriterion("CSYS_USER_ROLE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserIsNotNull() {
            addCriterion("CSYS_USER_ROLE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER =", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER <>", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserGreaterThan(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER >", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER >=", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserLessThan(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER <", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER <=", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserLike(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER like", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserNotLike(String value) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER not like", value, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER in", values, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER not in", values, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER between", value1, value2, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_CREATE_USER not between", value1, value2, "csysUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserIsNull() {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserIsNotNull() {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER =", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER <>", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserGreaterThan(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER >", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER >=", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserLessThan(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER <", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER <=", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserLike(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER like", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserNotLike(String value) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER not like", value, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER in", values, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER not in", values, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER between", value1, value2, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_MODIFY_USER not between", value1, value2, "csysUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteIsNull() {
            addCriterion("CSYS_USER_ROLE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteIsNotNull() {
            addCriterion("CSYS_USER_ROLE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE =", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE <>", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE >", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE >=", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteLessThan(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE <", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE <=", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteLike(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE like", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteNotLike(String value) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE not like", value, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE in", values, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE not in", values, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE between", value1, value2, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ROLE_IS_DELETE not between", value1, value2, "csysUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeIsNull() {
            addCriterion("CSYS_USER_ROLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeIsNotNull() {
            addCriterion("CSYS_USER_ROLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME =", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME <>", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME >", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME >=", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeLessThan(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME <", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_TIME <=", value, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_TIME in", values, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_TIME not in", values, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_TIME between", value1, value2, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_TIME not between", value1, value2, "csysUserRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateIsNull() {
            addCriterion("CSYS_USER_ROLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateIsNotNull() {
            addCriterion("CSYS_USER_ROLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE =", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateNotEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE <>", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateGreaterThan(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE >", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE >=", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateLessThan(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE <", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_ROLE_DATE <=", value, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_DATE in", values, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateNotIn(List<Date> values) {
            addCriterion("CSYS_USER_ROLE_DATE not in", values, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_DATE between", value1, value2, "csysUserRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRoleDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_ROLE_DATE not between", value1, value2, "csysUserRoleDate");
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