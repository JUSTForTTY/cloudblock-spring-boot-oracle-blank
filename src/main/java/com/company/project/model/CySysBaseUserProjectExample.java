package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBaseUserProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBaseUserProjectExample() {
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

        public Criteria andCySysBaseUserProjectIdIsNull() {
            addCriterion("cy_sys_base_user_project_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdIsNotNull() {
            addCriterion("cy_sys_base_user_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_id =", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_id <>", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdGreaterThan(String value) {
            addCriterion("cy_sys_base_user_project_id >", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_id >=", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdLessThan(String value) {
            addCriterion("cy_sys_base_user_project_id <", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_id <=", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdLike(String value) {
            addCriterion("cy_sys_base_user_project_id like", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdNotLike(String value) {
            addCriterion("cy_sys_base_user_project_id not like", value, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_id in", values, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_id not in", values, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_id between", value1, value2, "cySysBaseUserProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_id not between", value1, value2, "cySysBaseUserProjectId");
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

        public Criteria andCySysBaseUserNameIsNull() {
            addCriterion("cy_sys_base_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameIsNotNull() {
            addCriterion("cy_sys_base_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameEqualTo(String value) {
            addCriterion("cy_sys_base_user_name =", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_name <>", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameGreaterThan(String value) {
            addCriterion("cy_sys_base_user_name >", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_name >=", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameLessThan(String value) {
            addCriterion("cy_sys_base_user_name <", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_name <=", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameLike(String value) {
            addCriterion("cy_sys_base_user_name like", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameNotLike(String value) {
            addCriterion("cy_sys_base_user_name not like", value, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameIn(List<String> values) {
            addCriterion("cy_sys_base_user_name in", values, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_name not in", values, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_name between", value1, value2, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_name not between", value1, value2, "cySysBaseUserName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdIsNull() {
            addCriterion("cy_sys_project_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdIsNotNull() {
            addCriterion("cy_sys_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdEqualTo(String value) {
            addCriterion("cy_sys_project_id =", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotEqualTo(String value) {
            addCriterion("cy_sys_project_id <>", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdGreaterThan(String value) {
            addCriterion("cy_sys_project_id >", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_id >=", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLessThan(String value) {
            addCriterion("cy_sys_project_id <", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_id <=", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLike(String value) {
            addCriterion("cy_sys_project_id like", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotLike(String value) {
            addCriterion("cy_sys_project_id not like", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdIn(List<String> values) {
            addCriterion("cy_sys_project_id in", values, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotIn(List<String> values) {
            addCriterion("cy_sys_project_id not in", values, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdBetween(String value1, String value2) {
            addCriterion("cy_sys_project_id between", value1, value2, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_id not between", value1, value2, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIsNull() {
            addCriterion("cy_sys_project_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIsNotNull() {
            addCriterion("cy_sys_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameEqualTo(String value) {
            addCriterion("cy_sys_project_name =", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_name <>", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameGreaterThan(String value) {
            addCriterion("cy_sys_project_name >", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_name >=", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLessThan(String value) {
            addCriterion("cy_sys_project_name <", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_name <=", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLike(String value) {
            addCriterion("cy_sys_project_name like", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotLike(String value) {
            addCriterion("cy_sys_project_name not like", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIn(List<String> values) {
            addCriterion("cy_sys_project_name in", values, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_name not in", values, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_name between", value1, value2, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_name not between", value1, value2, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeIsNull() {
            addCriterion("cy_sys_base_user_project_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeIsNotNull() {
            addCriterion("cy_sys_base_user_project_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_create_time =", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_create_time <>", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_project_create_time >", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_create_time >=", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_project_create_time <", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_create_time <=", value, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_project_create_time in", values, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_project_create_time not in", values, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_project_create_time between", value1, value2, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_project_create_time not between", value1, value2, "cySysBaseUserProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserIsNull() {
            addCriterion("cy_sys_base_user_project_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserIsNotNull() {
            addCriterion("cy_sys_base_user_project_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_create_user =", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_create_user <>", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_project_create_user >", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_create_user >=", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserLessThan(String value) {
            addCriterion("cy_sys_base_user_project_create_user <", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_create_user <=", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserLike(String value) {
            addCriterion("cy_sys_base_user_project_create_user like", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserNotLike(String value) {
            addCriterion("cy_sys_base_user_project_create_user not like", value, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_create_user in", values, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_create_user not in", values, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_create_user between", value1, value2, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_create_user not between", value1, value2, "cySysBaseUserProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeIsNull() {
            addCriterion("cy_sys_base_user_project_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeIsNotNull() {
            addCriterion("cy_sys_base_user_project_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time =", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time <>", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time >", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time >=", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time <", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_project_modify_time <=", value, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_project_modify_time in", values, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_project_modify_time not in", values, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_project_modify_time between", value1, value2, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_project_modify_time not between", value1, value2, "cySysBaseUserProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserIsNull() {
            addCriterion("cy_sys_base_user_project_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserIsNotNull() {
            addCriterion("cy_sys_base_user_project_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_modify_user =", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_modify_user <>", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_project_modify_user >", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_modify_user >=", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserLessThan(String value) {
            addCriterion("cy_sys_base_user_project_modify_user <", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_modify_user <=", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserLike(String value) {
            addCriterion("cy_sys_base_user_project_modify_user like", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserNotLike(String value) {
            addCriterion("cy_sys_base_user_project_modify_user not like", value, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_modify_user in", values, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_modify_user not in", values, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_modify_user between", value1, value2, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_modify_user not between", value1, value2, "cySysBaseUserProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteIsNull() {
            addCriterion("cy_sys_base_user_project_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteIsNotNull() {
            addCriterion("cy_sys_base_user_project_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_is_delete =", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_is_delete <>", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_base_user_project_is_delete >", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_is_delete >=", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteLessThan(String value) {
            addCriterion("cy_sys_base_user_project_is_delete <", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_project_is_delete <=", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteLike(String value) {
            addCriterion("cy_sys_base_user_project_is_delete like", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteNotLike(String value) {
            addCriterion("cy_sys_base_user_project_is_delete not like", value, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_is_delete in", values, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_project_is_delete not in", values, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_is_delete between", value1, value2, "cySysBaseUserProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserProjectIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_project_is_delete not between", value1, value2, "cySysBaseUserProjectIsDelete");
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