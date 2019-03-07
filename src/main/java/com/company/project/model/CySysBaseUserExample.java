package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBaseUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBaseUserExample() {
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

        public Criteria andCySysBaseUserMobileIsNull() {
            addCriterion("cy_sys_base_user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileIsNotNull() {
            addCriterion("cy_sys_base_user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileEqualTo(String value) {
            addCriterion("cy_sys_base_user_mobile =", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_mobile <>", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileGreaterThan(String value) {
            addCriterion("cy_sys_base_user_mobile >", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_mobile >=", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileLessThan(String value) {
            addCriterion("cy_sys_base_user_mobile <", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_mobile <=", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileLike(String value) {
            addCriterion("cy_sys_base_user_mobile like", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileNotLike(String value) {
            addCriterion("cy_sys_base_user_mobile not like", value, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileIn(List<String> values) {
            addCriterion("cy_sys_base_user_mobile in", values, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_mobile not in", values, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_mobile between", value1, value2, "cySysBaseUserMobile");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserMobileNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_mobile not between", value1, value2, "cySysBaseUserMobile");
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

        public Criteria andCySysBaseUserRefreshTokenIsNull() {
            addCriterion("cy_sys_base_user_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenIsNotNull() {
            addCriterion("cy_sys_base_user_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenEqualTo(String value) {
            addCriterion("cy_sys_base_user_refresh_token =", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenNotEqualTo(String value) {
            addCriterion("cy_sys_base_user_refresh_token <>", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenGreaterThan(String value) {
            addCriterion("cy_sys_base_user_refresh_token >", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_refresh_token >=", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenLessThan(String value) {
            addCriterion("cy_sys_base_user_refresh_token <", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_base_user_refresh_token <=", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenLike(String value) {
            addCriterion("cy_sys_base_user_refresh_token like", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenNotLike(String value) {
            addCriterion("cy_sys_base_user_refresh_token not like", value, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenIn(List<String> values) {
            addCriterion("cy_sys_base_user_refresh_token in", values, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenNotIn(List<String> values) {
            addCriterion("cy_sys_base_user_refresh_token not in", values, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_refresh_token between", value1, value2, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("cy_sys_base_user_refresh_token not between", value1, value2, "cySysBaseUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpIsNull() {
            addCriterion("cy_sys_base_user_hp is null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpIsNotNull() {
            addCriterion("cy_sys_base_user_hp is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpEqualTo(Integer value) {
            addCriterion("cy_sys_base_user_hp =", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpNotEqualTo(Integer value) {
            addCriterion("cy_sys_base_user_hp <>", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpGreaterThan(Integer value) {
            addCriterion("cy_sys_base_user_hp >", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_base_user_hp >=", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpLessThan(Integer value) {
            addCriterion("cy_sys_base_user_hp <", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpLessThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_base_user_hp <=", value, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpIn(List<Integer> values) {
            addCriterion("cy_sys_base_user_hp in", values, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpNotIn(List<Integer> values) {
            addCriterion("cy_sys_base_user_hp not in", values, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_base_user_hp between", value1, value2, "cySysBaseUserHp");
            return (Criteria) this;
        }

        public Criteria andCySysBaseUserHpNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_base_user_hp not between", value1, value2, "cySysBaseUserHp");
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