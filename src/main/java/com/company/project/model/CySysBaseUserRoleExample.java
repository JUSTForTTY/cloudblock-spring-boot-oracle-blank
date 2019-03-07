package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBaseUserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBaseUserRoleExample() {
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

        public Criteria andCySysBaseUserRoleIdIsNull() {
            addCriterion("cy_sys_base_user_role_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdIsNotNull() {
            addCriterion("cy_sys_base_user_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_id =", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_id <>", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdGreaterThan(String value) {
            addCriterion("cy_sys_base_user_role_id >", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_id >=", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdLessThan(String value) {
            addCriterion("cy_sys_base_user_role_id <", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_id <=", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdLike(String value) {
            addCriterion("cy_sys_base_user_role_id like", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdNotLike(String value) {
            addCriterion("cy_sys_base_user_role_id not like", value, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_id in", values, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_id not in", values, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_id between", value1, value2, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_id not between", value1, value2, "cySysBaseUserRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdIsNull() {
            addCriterion("cy_sys_base_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdIsNotNull() {
            addCriterion("cy_sys_base_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdEqualTo(String value) {
            addCriterion("cy_sys_base_user_id =", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_id <>", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdGreaterThan(String value) {
            addCriterion("cy_sys_base_user_id >", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_id >=", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdLessThan(String value) {
            addCriterion("cy_sys_base_user_id <", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_id <=", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdLike(String value) {
            addCriterion("cy_sys_base_user_id like", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdNotLike(String value) {
            addCriterion("cy_sys_base_user_id not like", value, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdIn(List<String> values) {
            addCriterion("cy_sys_base_user_id in", values, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_id not in", values, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_id between", value1, value2, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_id not between", value1, value2, "cySysBaseUserId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdIsNull() {
            addCriterion("cy_sys_role_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdIsNotNull() {
            addCriterion("cy_sys_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdEqualTo(String value) {
            addCriterion("cy_sys_role_id =", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdNotEqualTo(String value) {
            addCriterion("cy_sys_role_id <>", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdGreaterThan(String value) {
            addCriterion("cy_sys_role_id >", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_role_id >=", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdLessThan(String value) {
            addCriterion("cy_sys_role_id <", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_role_id <=", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdLike(String value) {
            addCriterion("cy_sys_role_id like", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdNotLike(String value) {
            addCriterion("cy_sys_role_id not like", value, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdIn(List<String> values) {
            addCriterion("cy_sys_role_id in", values, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdNotIn(List<String> values) {
            addCriterion("cy_sys_role_id not in", values, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdBetween(String value1, String value2) {
            addCriterion("cy_sys_role_id between", value1, value2, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysRoleIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_role_id not between", value1, value2, "cySysRoleId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdIsNull() {
            addCriterion("cy_sys_department_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdIsNotNull() {
            addCriterion("cy_sys_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdEqualTo(String value) {
            addCriterion("cy_sys_department_id =", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdNotEqualTo(String value) {
            addCriterion("cy_sys_department_id <>", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdGreaterThan(String value) {
            addCriterion("cy_sys_department_id >", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_department_id >=", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdLessThan(String value) {
            addCriterion("cy_sys_department_id <", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_department_id <=", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdLike(String value) {
            addCriterion("cy_sys_department_id like", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdNotLike(String value) {
            addCriterion("cy_sys_department_id not like", value, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdIn(List<String> values) {
            addCriterion("cy_sys_department_id in", values, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdNotIn(List<String> values) {
            addCriterion("cy_sys_department_id not in", values, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdBetween(String value1, String value2) {
            addCriterion("cy_sys_department_id between", value1, value2, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_department_id not between", value1, value2, "cySysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeIsNull() {
            addCriterion("cy_sys_base_user_role_is_runtime is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeIsNotNull() {
            addCriterion("cy_sys_base_user_role_is_runtime is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime =", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime <>", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeGreaterThan(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime >", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime >=", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeLessThan(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime <", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime <=", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeLike(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime like", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeNotLike(String value) {
            addCriterion("cy_sys_base_user_role_is_runtime not like", value, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_is_runtime in", values, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_is_runtime not in", values, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_is_runtime between", value1, value2, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsRuntimeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_is_runtime not between", value1, value2, "cySysBaseUserRoleIsRuntime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeIsNull() {
            addCriterion("cy_sys_base_user_role_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeIsNotNull() {
            addCriterion("cy_sys_base_user_role_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_create_time =", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_create_time <>", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_role_create_time >", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_create_time >=", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_role_create_time <", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_create_time <=", value, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_role_create_time in", values, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_role_create_time not in", values, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_role_create_time between", value1, value2, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_role_create_time not between", value1, value2, "cySysBaseUserRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserIsNull() {
            addCriterion("cy_sys_base_user_role_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserIsNotNull() {
            addCriterion("cy_sys_base_user_role_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_create_user =", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_create_user <>", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_role_create_user >", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_create_user >=", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserLessThan(String value) {
            addCriterion("cy_sys_base_user_role_create_user <", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_create_user <=", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserLike(String value) {
            addCriterion("cy_sys_base_user_role_create_user like", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserNotLike(String value) {
            addCriterion("cy_sys_base_user_role_create_user not like", value, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_create_user in", values, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_create_user not in", values, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_create_user between", value1, value2, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_create_user not between", value1, value2, "cySysBaseUserRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeIsNull() {
            addCriterion("cy_sys_base_user_role_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeIsNotNull() {
            addCriterion("cy_sys_base_user_role_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time =", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time <>", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time >", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time >=", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time <", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_role_modify_time <=", value, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_role_modify_time in", values, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_role_modify_time not in", values, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_role_modify_time between", value1, value2, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_role_modify_time not between", value1, value2, "cySysBaseUserRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserIsNull() {
            addCriterion("cy_sys_base_user_role_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserIsNotNull() {
            addCriterion("cy_sys_base_user_role_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_modify_user =", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_modify_user <>", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_role_modify_user >", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_modify_user >=", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserLessThan(String value) {
            addCriterion("cy_sys_base_user_role_modify_user <", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_modify_user <=", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserLike(String value) {
            addCriterion("cy_sys_base_user_role_modify_user like", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserNotLike(String value) {
            addCriterion("cy_sys_base_user_role_modify_user not like", value, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_modify_user in", values, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_modify_user not in", values, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_modify_user between", value1, value2, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_modify_user not between", value1, value2, "cySysBaseUserRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteIsNull() {
            addCriterion("cy_sys_base_user_role_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteIsNotNull() {
            addCriterion("cy_sys_base_user_role_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_delete =", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_delete <>", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_base_user_role_is_delete >", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_delete >=", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteLessThan(String value) {
            addCriterion("cy_sys_base_user_role_is_delete <", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_role_is_delete <=", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteLike(String value) {
            addCriterion("cy_sys_base_user_role_is_delete like", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteNotLike(String value) {
            addCriterion("cy_sys_base_user_role_is_delete not like", value, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_is_delete in", values, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_role_is_delete not in", values, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_is_delete between", value1, value2, "cySysBaseUserRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRoleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_role_is_delete not between", value1, value2, "cySysBaseUserRoleIsDelete");
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