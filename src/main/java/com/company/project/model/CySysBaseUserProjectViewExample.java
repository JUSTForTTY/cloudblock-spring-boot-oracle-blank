package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBaseUserProjectViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBaseUserProjectViewExample() {
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

        public Criteria andCySysBaseUserUsernameIsNull() {
            addCriterion("cy_sys_base_user_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameIsNotNull() {
            addCriterion("cy_sys_base_user_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameEqualTo(String value) {
            addCriterion("cy_sys_base_user_username =", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_username <>", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameGreaterThan(String value) {
            addCriterion("cy_sys_base_user_username >", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_username >=", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameLessThan(String value) {
            addCriterion("cy_sys_base_user_username <", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_username <=", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameLike(String value) {
            addCriterion("cy_sys_base_user_username like", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameNotLike(String value) {
            addCriterion("cy_sys_base_user_username not like", value, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameIn(List<String> values) {
            addCriterion("cy_sys_base_user_username in", values, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_username not in", values, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_username between", value1, value2, "cySysBaseUserUsername");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_username not between", value1, value2, "cySysBaseUserUsername");
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

        public Criteria andCySysBaseUserPasswordIsNull() {
            addCriterion("cy_sys_base_user_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordIsNotNull() {
            addCriterion("cy_sys_base_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordEqualTo(String value) {
            addCriterion("cy_sys_base_user_password =", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_password <>", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordGreaterThan(String value) {
            addCriterion("cy_sys_base_user_password >", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_password >=", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordLessThan(String value) {
            addCriterion("cy_sys_base_user_password <", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_password <=", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordLike(String value) {
            addCriterion("cy_sys_base_user_password like", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordNotLike(String value) {
            addCriterion("cy_sys_base_user_password not like", value, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordIn(List<String> values) {
            addCriterion("cy_sys_base_user_password in", values, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_password not in", values, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_password between", value1, value2, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_password not between", value1, value2, "cySysBaseUserPassword");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenIsNull() {
            addCriterion("cy_sys_base_user_access_token is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenIsNotNull() {
            addCriterion("cy_sys_base_user_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenEqualTo(String value) {
            addCriterion("cy_sys_base_user_access_token =", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_access_token <>", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenGreaterThan(String value) {
            addCriterion("cy_sys_base_user_access_token >", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_access_token >=", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenLessThan(String value) {
            addCriterion("cy_sys_base_user_access_token <", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_access_token <=", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenLike(String value) {
            addCriterion("cy_sys_base_user_access_token like", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenNotLike(String value) {
            addCriterion("cy_sys_base_user_access_token not like", value, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenIn(List<String> values) {
            addCriterion("cy_sys_base_user_access_token in", values, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_access_token not in", values, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_access_token between", value1, value2, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserAccessTokenNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_access_token not between", value1, value2, "cySysBaseUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameIsNull() {
            addCriterion("cy_sys_base_user_realname is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameIsNotNull() {
            addCriterion("cy_sys_base_user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameEqualTo(String value) {
            addCriterion("cy_sys_base_user_realname =", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_realname <>", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameGreaterThan(String value) {
            addCriterion("cy_sys_base_user_realname >", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_realname >=", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameLessThan(String value) {
            addCriterion("cy_sys_base_user_realname <", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_realname <=", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameLike(String value) {
            addCriterion("cy_sys_base_user_realname like", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameNotLike(String value) {
            addCriterion("cy_sys_base_user_realname not like", value, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameIn(List<String> values) {
            addCriterion("cy_sys_base_user_realname in", values, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_realname not in", values, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_realname between", value1, value2, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRealnameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_realname not between", value1, value2, "cySysBaseUserRealname");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberIsNull() {
            addCriterion("cy_sys_base_user_employee_number is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberIsNotNull() {
            addCriterion("cy_sys_base_user_employee_number is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberEqualTo(String value) {
            addCriterion("cy_sys_base_user_employee_number =", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_employee_number <>", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberGreaterThan(String value) {
            addCriterion("cy_sys_base_user_employee_number >", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_employee_number >=", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberLessThan(String value) {
            addCriterion("cy_sys_base_user_employee_number <", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_employee_number <=", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberLike(String value) {
            addCriterion("cy_sys_base_user_employee_number like", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberNotLike(String value) {
            addCriterion("cy_sys_base_user_employee_number not like", value, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberIn(List<String> values) {
            addCriterion("cy_sys_base_user_employee_number in", values, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_employee_number not in", values, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_employee_number between", value1, value2, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_employee_number not between", value1, value2, "cySysBaseUserEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderIsNull() {
            addCriterion("cy_sys_base_user_gender is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderIsNotNull() {
            addCriterion("cy_sys_base_user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderEqualTo(String value) {
            addCriterion("cy_sys_base_user_gender =", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_gender <>", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderGreaterThan(String value) {
            addCriterion("cy_sys_base_user_gender >", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_gender >=", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderLessThan(String value) {
            addCriterion("cy_sys_base_user_gender <", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_gender <=", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderLike(String value) {
            addCriterion("cy_sys_base_user_gender like", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderNotLike(String value) {
            addCriterion("cy_sys_base_user_gender not like", value, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderIn(List<String> values) {
            addCriterion("cy_sys_base_user_gender in", values, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_gender not in", values, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_gender between", value1, value2, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserGenderNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_gender not between", value1, value2, "cySysBaseUserGender");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationIsNull() {
            addCriterion("cy_sys_base_user_education is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationIsNotNull() {
            addCriterion("cy_sys_base_user_education is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationEqualTo(String value) {
            addCriterion("cy_sys_base_user_education =", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_education <>", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationGreaterThan(String value) {
            addCriterion("cy_sys_base_user_education >", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_education >=", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationLessThan(String value) {
            addCriterion("cy_sys_base_user_education <", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_education <=", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationLike(String value) {
            addCriterion("cy_sys_base_user_education like", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationNotLike(String value) {
            addCriterion("cy_sys_base_user_education not like", value, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationIn(List<String> values) {
            addCriterion("cy_sys_base_user_education in", values, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_education not in", values, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_education between", value1, value2, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEducationNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_education not between", value1, value2, "cySysBaseUserEducation");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoIsNull() {
            addCriterion("cy_sys_base_user_meno is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoIsNotNull() {
            addCriterion("cy_sys_base_user_meno is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoEqualTo(String value) {
            addCriterion("cy_sys_base_user_meno =", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_meno <>", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoGreaterThan(String value) {
            addCriterion("cy_sys_base_user_meno >", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_meno >=", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoLessThan(String value) {
            addCriterion("cy_sys_base_user_meno <", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_meno <=", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoLike(String value) {
            addCriterion("cy_sys_base_user_meno like", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoNotLike(String value) {
            addCriterion("cy_sys_base_user_meno not like", value, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoIn(List<String> values) {
            addCriterion("cy_sys_base_user_meno in", values, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_meno not in", values, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_meno between", value1, value2, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMenoNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_meno not between", value1, value2, "cySysBaseUserMeno");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeIsNull() {
            addCriterion("cy_sys_base_user_ewCode is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeIsNotNull() {
            addCriterion("cy_sys_base_user_ewCode is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeEqualTo(String value) {
            addCriterion("cy_sys_base_user_ewCode =", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_ewCode <>", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeGreaterThan(String value) {
            addCriterion("cy_sys_base_user_ewCode >", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_ewCode >=", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeLessThan(String value) {
            addCriterion("cy_sys_base_user_ewCode <", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_ewCode <=", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeLike(String value) {
            addCriterion("cy_sys_base_user_ewCode like", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeNotLike(String value) {
            addCriterion("cy_sys_base_user_ewCode not like", value, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeIn(List<String> values) {
            addCriterion("cy_sys_base_user_ewCode in", values, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_ewCode not in", values, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_ewCode between", value1, value2, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserEwcodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_ewCode not between", value1, value2, "cySysBaseUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageIsNull() {
            addCriterion("cy_sys_base_user_headimage is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageIsNotNull() {
            addCriterion("cy_sys_base_user_headimage is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageEqualTo(String value) {
            addCriterion("cy_sys_base_user_headimage =", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_headimage <>", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageGreaterThan(String value) {
            addCriterion("cy_sys_base_user_headimage >", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_headimage >=", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageLessThan(String value) {
            addCriterion("cy_sys_base_user_headimage <", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_headimage <=", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageLike(String value) {
            addCriterion("cy_sys_base_user_headimage like", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageNotLike(String value) {
            addCriterion("cy_sys_base_user_headimage not like", value, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageIn(List<String> values) {
            addCriterion("cy_sys_base_user_headimage in", values, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_headimage not in", values, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_headimage between", value1, value2, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHeadimageNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_headimage not between", value1, value2, "cySysBaseUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeIsNull() {
            addCriterion("cy_sys_base_user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeIsNotNull() {
            addCriterion("cy_sys_base_user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_create_time =", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_create_time <>", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_create_time >", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_create_time >=", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_create_time <", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_create_time <=", value, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_create_time in", values, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_create_time not in", values, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_create_time between", value1, value2, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_create_time not between", value1, value2, "cySysBaseUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserIsNull() {
            addCriterion("cy_sys_base_user_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserIsNotNull() {
            addCriterion("cy_sys_base_user_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_create_user =", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_create_user <>", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_create_user >", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_create_user >=", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserLessThan(String value) {
            addCriterion("cy_sys_base_user_create_user <", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_create_user <=", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserLike(String value) {
            addCriterion("cy_sys_base_user_create_user like", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserNotLike(String value) {
            addCriterion("cy_sys_base_user_create_user not like", value, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_create_user in", values, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_create_user not in", values, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_create_user between", value1, value2, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_create_user not between", value1, value2, "cySysBaseUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeIsNull() {
            addCriterion("cy_sys_base_user_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeIsNotNull() {
            addCriterion("cy_sys_base_user_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_base_user_modify_time =", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_base_user_modify_time <>", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_base_user_modify_time >", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_modify_time >=", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_base_user_modify_time <", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_base_user_modify_time <=", value, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_base_user_modify_time in", values, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_base_user_modify_time not in", values, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_modify_time between", value1, value2, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_base_user_modify_time not between", value1, value2, "cySysBaseUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserIsNull() {
            addCriterion("cy_sys_base_user_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserIsNotNull() {
            addCriterion("cy_sys_base_user_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserEqualTo(String value) {
            addCriterion("cy_sys_base_user_modify_user =", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_modify_user <>", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_base_user_modify_user >", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_modify_user >=", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserLessThan(String value) {
            addCriterion("cy_sys_base_user_modify_user <", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_modify_user <=", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserLike(String value) {
            addCriterion("cy_sys_base_user_modify_user like", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserNotLike(String value) {
            addCriterion("cy_sys_base_user_modify_user not like", value, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserIn(List<String> values) {
            addCriterion("cy_sys_base_user_modify_user in", values, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_modify_user not in", values, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_modify_user between", value1, value2, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_modify_user not between", value1, value2, "cySysBaseUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteIsNull() {
            addCriterion("cy_sys_base_user_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteIsNotNull() {
            addCriterion("cy_sys_base_user_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_base_user_is_delete =", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_is_delete <>", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_base_user_is_delete >", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_is_delete >=", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteLessThan(String value) {
            addCriterion("cy_sys_base_user_is_delete <", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_is_delete <=", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteLike(String value) {
            addCriterion("cy_sys_base_user_is_delete like", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteNotLike(String value) {
            addCriterion("cy_sys_base_user_is_delete not like", value, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_base_user_is_delete in", values, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_is_delete not in", values, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_is_delete between", value1, value2, "cySysBaseUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_is_delete not between", value1, value2, "cySysBaseUserIsDelete");
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

        public Criteria andCySysProjectCodeIsNull() {
            addCriterion("cy_sys_project_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeIsNotNull() {
            addCriterion("cy_sys_project_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeEqualTo(String value) {
            addCriterion("cy_sys_project_code =", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotEqualTo(String value) {
            addCriterion("cy_sys_project_code <>", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeGreaterThan(String value) {
            addCriterion("cy_sys_project_code >", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_code >=", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLessThan(String value) {
            addCriterion("cy_sys_project_code <", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_code <=", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLike(String value) {
            addCriterion("cy_sys_project_code like", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotLike(String value) {
            addCriterion("cy_sys_project_code not like", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeIn(List<String> values) {
            addCriterion("cy_sys_project_code in", values, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotIn(List<String> values) {
            addCriterion("cy_sys_project_code not in", values, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_project_code between", value1, value2, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_code not between", value1, value2, "cySysProjectCode");
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

        public Criteria andCySysProjectIconIsNull() {
            addCriterion("cy_sys_project_icon is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconIsNotNull() {
            addCriterion("cy_sys_project_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconEqualTo(String value) {
            addCriterion("cy_sys_project_icon =", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotEqualTo(String value) {
            addCriterion("cy_sys_project_icon <>", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconGreaterThan(String value) {
            addCriterion("cy_sys_project_icon >", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_icon >=", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLessThan(String value) {
            addCriterion("cy_sys_project_icon <", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_icon <=", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLike(String value) {
            addCriterion("cy_sys_project_icon like", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotLike(String value) {
            addCriterion("cy_sys_project_icon not like", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconIn(List<String> values) {
            addCriterion("cy_sys_project_icon in", values, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotIn(List<String> values) {
            addCriterion("cy_sys_project_icon not in", values, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconBetween(String value1, String value2) {
            addCriterion("cy_sys_project_icon between", value1, value2, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_icon not between", value1, value2, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIsNull() {
            addCriterion("cy_sys_project_is_original is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIsNotNull() {
            addCriterion("cy_sys_project_is_original is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalEqualTo(String value) {
            addCriterion("cy_sys_project_is_original =", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotEqualTo(String value) {
            addCriterion("cy_sys_project_is_original <>", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalGreaterThan(String value) {
            addCriterion("cy_sys_project_is_original >", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_original >=", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLessThan(String value) {
            addCriterion("cy_sys_project_is_original <", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_original <=", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLike(String value) {
            addCriterion("cy_sys_project_is_original like", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotLike(String value) {
            addCriterion("cy_sys_project_is_original not like", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIn(List<String> values) {
            addCriterion("cy_sys_project_is_original in", values, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotIn(List<String> values) {
            addCriterion("cy_sys_project_is_original not in", values, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_original between", value1, value2, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_original not between", value1, value2, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIsNull() {
            addCriterion("cy_sys_project_db_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIsNotNull() {
            addCriterion("cy_sys_project_db_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlEqualTo(String value) {
            addCriterion("cy_sys_project_db_url =", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_url <>", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_db_url >", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_url >=", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLessThan(String value) {
            addCriterion("cy_sys_project_db_url <", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_url <=", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLike(String value) {
            addCriterion("cy_sys_project_db_url like", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotLike(String value) {
            addCriterion("cy_sys_project_db_url not like", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIn(List<String> values) {
            addCriterion("cy_sys_project_db_url in", values, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_url not in", values, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_url between", value1, value2, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_url not between", value1, value2, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIsNull() {
            addCriterion("cy_sys_project_db_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIsNotNull() {
            addCriterion("cy_sys_project_db_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameEqualTo(String value) {
            addCriterion("cy_sys_project_db_username =", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_username <>", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameGreaterThan(String value) {
            addCriterion("cy_sys_project_db_username >", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_username >=", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLessThan(String value) {
            addCriterion("cy_sys_project_db_username <", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_username <=", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLike(String value) {
            addCriterion("cy_sys_project_db_username like", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotLike(String value) {
            addCriterion("cy_sys_project_db_username not like", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIn(List<String> values) {
            addCriterion("cy_sys_project_db_username in", values, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_username not in", values, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_username between", value1, value2, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_username not between", value1, value2, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIsNull() {
            addCriterion("cy_sys_project_db_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIsNotNull() {
            addCriterion("cy_sys_project_db_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordEqualTo(String value) {
            addCriterion("cy_sys_project_db_password =", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_password <>", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordGreaterThan(String value) {
            addCriterion("cy_sys_project_db_password >", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_password >=", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLessThan(String value) {
            addCriterion("cy_sys_project_db_password <", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_password <=", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLike(String value) {
            addCriterion("cy_sys_project_db_password like", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotLike(String value) {
            addCriterion("cy_sys_project_db_password not like", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIn(List<String> values) {
            addCriterion("cy_sys_project_db_password in", values, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_password not in", values, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_password between", value1, value2, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_password not between", value1, value2, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIsNull() {
            addCriterion("cy_sys_project_server_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIsNotNull() {
            addCriterion("cy_sys_project_server_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlEqualTo(String value) {
            addCriterion("cy_sys_project_server_url =", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_url <>", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_server_url >", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_url >=", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLessThan(String value) {
            addCriterion("cy_sys_project_server_url <", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_url <=", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLike(String value) {
            addCriterion("cy_sys_project_server_url like", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotLike(String value) {
            addCriterion("cy_sys_project_server_url not like", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIn(List<String> values) {
            addCriterion("cy_sys_project_server_url in", values, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_url not in", values, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_url between", value1, value2, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_url not between", value1, value2, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIsNull() {
            addCriterion("cy_sys_project_server_domain_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIsNotNull() {
            addCriterion("cy_sys_project_server_domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name =", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name <>", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameGreaterThan(String value) {
            addCriterion("cy_sys_project_server_domain_name >", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name >=", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLessThan(String value) {
            addCriterion("cy_sys_project_server_domain_name <", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name <=", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLike(String value) {
            addCriterion("cy_sys_project_server_domain_name like", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotLike(String value) {
            addCriterion("cy_sys_project_server_domain_name not like", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIn(List<String> values) {
            addCriterion("cy_sys_project_server_domain_name in", values, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_domain_name not in", values, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_domain_name between", value1, value2, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_domain_name not between", value1, value2, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIsNull() {
            addCriterion("cy_sys_project_server_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIsNotNull() {
            addCriterion("cy_sys_project_server_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameEqualTo(String value) {
            addCriterion("cy_sys_project_server_username =", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_username <>", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameGreaterThan(String value) {
            addCriterion("cy_sys_project_server_username >", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_username >=", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLessThan(String value) {
            addCriterion("cy_sys_project_server_username <", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_username <=", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLike(String value) {
            addCriterion("cy_sys_project_server_username like", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotLike(String value) {
            addCriterion("cy_sys_project_server_username not like", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIn(List<String> values) {
            addCriterion("cy_sys_project_server_username in", values, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_username not in", values, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_username between", value1, value2, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_username not between", value1, value2, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIsNull() {
            addCriterion("cy_sys_project_server_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIsNotNull() {
            addCriterion("cy_sys_project_server_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordEqualTo(String value) {
            addCriterion("cy_sys_project_server_password =", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_password <>", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordGreaterThan(String value) {
            addCriterion("cy_sys_project_server_password >", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_password >=", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLessThan(String value) {
            addCriterion("cy_sys_project_server_password <", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_password <=", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLike(String value) {
            addCriterion("cy_sys_project_server_password like", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotLike(String value) {
            addCriterion("cy_sys_project_server_password not like", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIn(List<String> values) {
            addCriterion("cy_sys_project_server_password in", values, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_password not in", values, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_password between", value1, value2, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_password not between", value1, value2, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIsNull() {
            addCriterion("cy_sys_project_desc is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIsNotNull() {
            addCriterion("cy_sys_project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescEqualTo(String value) {
            addCriterion("cy_sys_project_desc =", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotEqualTo(String value) {
            addCriterion("cy_sys_project_desc <>", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescGreaterThan(String value) {
            addCriterion("cy_sys_project_desc >", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_desc >=", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLessThan(String value) {
            addCriterion("cy_sys_project_desc <", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_desc <=", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLike(String value) {
            addCriterion("cy_sys_project_desc like", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotLike(String value) {
            addCriterion("cy_sys_project_desc not like", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIn(List<String> values) {
            addCriterion("cy_sys_project_desc in", values, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotIn(List<String> values) {
            addCriterion("cy_sys_project_desc not in", values, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescBetween(String value1, String value2) {
            addCriterion("cy_sys_project_desc between", value1, value2, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_desc not between", value1, value2, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIsNull() {
            addCriterion("cy_sys_project_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIsNotNull() {
            addCriterion("cy_sys_project_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete =", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete <>", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_project_is_delete >", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete >=", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLessThan(String value) {
            addCriterion("cy_sys_project_is_delete <", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete <=", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLike(String value) {
            addCriterion("cy_sys_project_is_delete like", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotLike(String value) {
            addCriterion("cy_sys_project_is_delete not like", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_project_is_delete in", values, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_project_is_delete not in", values, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_delete between", value1, value2, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_delete not between", value1, value2, "cySysProjectIsDelete");
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