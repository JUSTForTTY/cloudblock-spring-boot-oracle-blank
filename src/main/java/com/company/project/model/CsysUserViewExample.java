package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysUserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysUserViewExample() {
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

        public Criteria andCsysUserUsernameIsNull() {
            addCriterion("CSYS_USER_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameIsNotNull() {
            addCriterion("CSYS_USER_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameEqualTo(String value) {
            addCriterion("CSYS_USER_USERNAME =", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameNotEqualTo(String value) {
            addCriterion("CSYS_USER_USERNAME <>", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameGreaterThan(String value) {
            addCriterion("CSYS_USER_USERNAME >", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_USERNAME >=", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameLessThan(String value) {
            addCriterion("CSYS_USER_USERNAME <", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_USERNAME <=", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameLike(String value) {
            addCriterion("CSYS_USER_USERNAME like", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameNotLike(String value) {
            addCriterion("CSYS_USER_USERNAME not like", value, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameIn(List<String> values) {
            addCriterion("CSYS_USER_USERNAME in", values, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameNotIn(List<String> values) {
            addCriterion("CSYS_USER_USERNAME not in", values, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameBetween(String value1, String value2) {
            addCriterion("CSYS_USER_USERNAME between", value1, value2, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserUsernameNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_USERNAME not between", value1, value2, "csysUserUsername");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordIsNull() {
            addCriterion("CSYS_USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordIsNotNull() {
            addCriterion("CSYS_USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordEqualTo(String value) {
            addCriterion("CSYS_USER_PASSWORD =", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordNotEqualTo(String value) {
            addCriterion("CSYS_USER_PASSWORD <>", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordGreaterThan(String value) {
            addCriterion("CSYS_USER_PASSWORD >", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PASSWORD >=", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordLessThan(String value) {
            addCriterion("CSYS_USER_PASSWORD <", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PASSWORD <=", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordLike(String value) {
            addCriterion("CSYS_USER_PASSWORD like", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordNotLike(String value) {
            addCriterion("CSYS_USER_PASSWORD not like", value, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordIn(List<String> values) {
            addCriterion("CSYS_USER_PASSWORD in", values, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordNotIn(List<String> values) {
            addCriterion("CSYS_USER_PASSWORD not in", values, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PASSWORD between", value1, value2, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserPasswordNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PASSWORD not between", value1, value2, "csysUserPassword");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdIsNull() {
            addCriterion("CSYS_USER_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdIsNotNull() {
            addCriterion("CSYS_USER_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdEqualTo(String value) {
            addCriterion("CSYS_USER_OPEN_ID =", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdNotEqualTo(String value) {
            addCriterion("CSYS_USER_OPEN_ID <>", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdGreaterThan(String value) {
            addCriterion("CSYS_USER_OPEN_ID >", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_OPEN_ID >=", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdLessThan(String value) {
            addCriterion("CSYS_USER_OPEN_ID <", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_OPEN_ID <=", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdLike(String value) {
            addCriterion("CSYS_USER_OPEN_ID like", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdNotLike(String value) {
            addCriterion("CSYS_USER_OPEN_ID not like", value, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdIn(List<String> values) {
            addCriterion("CSYS_USER_OPEN_ID in", values, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdNotIn(List<String> values) {
            addCriterion("CSYS_USER_OPEN_ID not in", values, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdBetween(String value1, String value2) {
            addCriterion("CSYS_USER_OPEN_ID between", value1, value2, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_OPEN_ID not between", value1, value2, "csysUserOpenId");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameIsNull() {
            addCriterion("CSYS_USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameIsNotNull() {
            addCriterion("CSYS_USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameEqualTo(String value) {
            addCriterion("CSYS_USER_NICKNAME =", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameNotEqualTo(String value) {
            addCriterion("CSYS_USER_NICKNAME <>", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameGreaterThan(String value) {
            addCriterion("CSYS_USER_NICKNAME >", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NICKNAME >=", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameLessThan(String value) {
            addCriterion("CSYS_USER_NICKNAME <", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NICKNAME <=", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameLike(String value) {
            addCriterion("CSYS_USER_NICKNAME like", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameNotLike(String value) {
            addCriterion("CSYS_USER_NICKNAME not like", value, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameIn(List<String> values) {
            addCriterion("CSYS_USER_NICKNAME in", values, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameNotIn(List<String> values) {
            addCriterion("CSYS_USER_NICKNAME not in", values, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NICKNAME between", value1, value2, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNicknameNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NICKNAME not between", value1, value2, "csysUserNickname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameIsNull() {
            addCriterion("CSYS_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameIsNotNull() {
            addCriterion("CSYS_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameEqualTo(String value) {
            addCriterion("CSYS_USER_NAME =", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameNotEqualTo(String value) {
            addCriterion("CSYS_USER_NAME <>", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameGreaterThan(String value) {
            addCriterion("CSYS_USER_NAME >", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NAME >=", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameLessThan(String value) {
            addCriterion("CSYS_USER_NAME <", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NAME <=", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameLike(String value) {
            addCriterion("CSYS_USER_NAME like", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameNotLike(String value) {
            addCriterion("CSYS_USER_NAME not like", value, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameIn(List<String> values) {
            addCriterion("CSYS_USER_NAME in", values, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameNotIn(List<String> values) {
            addCriterion("CSYS_USER_NAME not in", values, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NAME between", value1, value2, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NAME not between", value1, value2, "csysUserName");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountIsNull() {
            addCriterion("CSYS_USER_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountIsNotNull() {
            addCriterion("CSYS_USER_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountEqualTo(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT =", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountNotEqualTo(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT <>", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountGreaterThan(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT >", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT >=", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountLessThan(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT <", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSYS_USER_ACCOUNT <=", value, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountIn(List<BigDecimal> values) {
            addCriterion("CSYS_USER_ACCOUNT in", values, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountNotIn(List<BigDecimal> values) {
            addCriterion("CSYS_USER_ACCOUNT not in", values, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_USER_ACCOUNT between", value1, value2, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSYS_USER_ACCOUNT not between", value1, value2, "csysUserAccount");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelIsNull() {
            addCriterion("CSYS_USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelIsNotNull() {
            addCriterion("CSYS_USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelEqualTo(String value) {
            addCriterion("CSYS_USER_LEVEL =", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelNotEqualTo(String value) {
            addCriterion("CSYS_USER_LEVEL <>", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelGreaterThan(String value) {
            addCriterion("CSYS_USER_LEVEL >", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_LEVEL >=", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelLessThan(String value) {
            addCriterion("CSYS_USER_LEVEL <", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_LEVEL <=", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelLike(String value) {
            addCriterion("CSYS_USER_LEVEL like", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelNotLike(String value) {
            addCriterion("CSYS_USER_LEVEL not like", value, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelIn(List<String> values) {
            addCriterion("CSYS_USER_LEVEL in", values, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelNotIn(List<String> values) {
            addCriterion("CSYS_USER_LEVEL not in", values, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelBetween(String value1, String value2) {
            addCriterion("CSYS_USER_LEVEL between", value1, value2, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserLevelNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_LEVEL not between", value1, value2, "csysUserLevel");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpIsNull() {
            addCriterion("CSYS_USER_HP is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpIsNotNull() {
            addCriterion("CSYS_USER_HP is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpEqualTo(String value) {
            addCriterion("CSYS_USER_HP =", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpNotEqualTo(String value) {
            addCriterion("CSYS_USER_HP <>", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpGreaterThan(String value) {
            addCriterion("CSYS_USER_HP >", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_HP >=", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpLessThan(String value) {
            addCriterion("CSYS_USER_HP <", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_HP <=", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpLike(String value) {
            addCriterion("CSYS_USER_HP like", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpNotLike(String value) {
            addCriterion("CSYS_USER_HP not like", value, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpIn(List<String> values) {
            addCriterion("CSYS_USER_HP in", values, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpNotIn(List<String> values) {
            addCriterion("CSYS_USER_HP not in", values, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpBetween(String value1, String value2) {
            addCriterion("CSYS_USER_HP between", value1, value2, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserHpNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_HP not between", value1, value2, "csysUserHp");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenIsNull() {
            addCriterion("CSYS_USER_ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenIsNotNull() {
            addCriterion("CSYS_USER_ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenEqualTo(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN =", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenNotEqualTo(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN <>", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenGreaterThan(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN >", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN >=", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenLessThan(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN <", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN <=", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenLike(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN like", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenNotLike(String value) {
            addCriterion("CSYS_USER_ACCESS_TOKEN not like", value, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenIn(List<String> values) {
            addCriterion("CSYS_USER_ACCESS_TOKEN in", values, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenNotIn(List<String> values) {
            addCriterion("CSYS_USER_ACCESS_TOKEN not in", values, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ACCESS_TOKEN between", value1, value2, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserAccessTokenNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ACCESS_TOKEN not between", value1, value2, "csysUserAccessToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameIsNull() {
            addCriterion("CSYS_USER_REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameIsNotNull() {
            addCriterion("CSYS_USER_REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameEqualTo(String value) {
            addCriterion("CSYS_USER_REALNAME =", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameNotEqualTo(String value) {
            addCriterion("CSYS_USER_REALNAME <>", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameGreaterThan(String value) {
            addCriterion("CSYS_USER_REALNAME >", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_REALNAME >=", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameLessThan(String value) {
            addCriterion("CSYS_USER_REALNAME <", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_REALNAME <=", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameLike(String value) {
            addCriterion("CSYS_USER_REALNAME like", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameNotLike(String value) {
            addCriterion("CSYS_USER_REALNAME not like", value, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameIn(List<String> values) {
            addCriterion("CSYS_USER_REALNAME in", values, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameNotIn(List<String> values) {
            addCriterion("CSYS_USER_REALNAME not in", values, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameBetween(String value1, String value2) {
            addCriterion("CSYS_USER_REALNAME between", value1, value2, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserRealnameNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_REALNAME not between", value1, value2, "csysUserRealname");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberIsNull() {
            addCriterion("CSYS_USER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberIsNotNull() {
            addCriterion("CSYS_USER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberEqualTo(String value) {
            addCriterion("CSYS_USER_NUMBER =", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberNotEqualTo(String value) {
            addCriterion("CSYS_USER_NUMBER <>", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberGreaterThan(String value) {
            addCriterion("CSYS_USER_NUMBER >", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NUMBER >=", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberLessThan(String value) {
            addCriterion("CSYS_USER_NUMBER <", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_NUMBER <=", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberLike(String value) {
            addCriterion("CSYS_USER_NUMBER like", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberNotLike(String value) {
            addCriterion("CSYS_USER_NUMBER not like", value, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberIn(List<String> values) {
            addCriterion("CSYS_USER_NUMBER in", values, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberNotIn(List<String> values) {
            addCriterion("CSYS_USER_NUMBER not in", values, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NUMBER between", value1, value2, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserNumberNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_NUMBER not between", value1, value2, "csysUserNumber");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderIsNull() {
            addCriterion("CSYS_USER_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderIsNotNull() {
            addCriterion("CSYS_USER_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderEqualTo(String value) {
            addCriterion("CSYS_USER_GENDER =", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderNotEqualTo(String value) {
            addCriterion("CSYS_USER_GENDER <>", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderGreaterThan(String value) {
            addCriterion("CSYS_USER_GENDER >", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_GENDER >=", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderLessThan(String value) {
            addCriterion("CSYS_USER_GENDER <", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_GENDER <=", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderLike(String value) {
            addCriterion("CSYS_USER_GENDER like", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderNotLike(String value) {
            addCriterion("CSYS_USER_GENDER not like", value, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderIn(List<String> values) {
            addCriterion("CSYS_USER_GENDER in", values, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderNotIn(List<String> values) {
            addCriterion("CSYS_USER_GENDER not in", values, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderBetween(String value1, String value2) {
            addCriterion("CSYS_USER_GENDER between", value1, value2, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserGenderNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_GENDER not between", value1, value2, "csysUserGender");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeIsNull() {
            addCriterion("CSYS_USER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeIsNotNull() {
            addCriterion("CSYS_USER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeEqualTo(Short value) {
            addCriterion("CSYS_USER_AGE =", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeNotEqualTo(Short value) {
            addCriterion("CSYS_USER_AGE <>", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeGreaterThan(Short value) {
            addCriterion("CSYS_USER_AGE >", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("CSYS_USER_AGE >=", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeLessThan(Short value) {
            addCriterion("CSYS_USER_AGE <", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeLessThanOrEqualTo(Short value) {
            addCriterion("CSYS_USER_AGE <=", value, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeIn(List<Short> values) {
            addCriterion("CSYS_USER_AGE in", values, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeNotIn(List<Short> values) {
            addCriterion("CSYS_USER_AGE not in", values, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeBetween(Short value1, Short value2) {
            addCriterion("CSYS_USER_AGE between", value1, value2, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserAgeNotBetween(Short value1, Short value2) {
            addCriterion("CSYS_USER_AGE not between", value1, value2, "csysUserAge");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneIsNull() {
            addCriterion("CSYS_USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneIsNotNull() {
            addCriterion("CSYS_USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneEqualTo(String value) {
            addCriterion("CSYS_USER_PHONE =", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneNotEqualTo(String value) {
            addCriterion("CSYS_USER_PHONE <>", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneGreaterThan(String value) {
            addCriterion("CSYS_USER_PHONE >", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PHONE >=", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneLessThan(String value) {
            addCriterion("CSYS_USER_PHONE <", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PHONE <=", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneLike(String value) {
            addCriterion("CSYS_USER_PHONE like", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneNotLike(String value) {
            addCriterion("CSYS_USER_PHONE not like", value, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneIn(List<String> values) {
            addCriterion("CSYS_USER_PHONE in", values, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneNotIn(List<String> values) {
            addCriterion("CSYS_USER_PHONE not in", values, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PHONE between", value1, value2, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserPhoneNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PHONE not between", value1, value2, "csysUserPhone");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileIsNull() {
            addCriterion("CSYS_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileIsNotNull() {
            addCriterion("CSYS_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileEqualTo(String value) {
            addCriterion("CSYS_USER_MOBILE =", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileNotEqualTo(String value) {
            addCriterion("CSYS_USER_MOBILE <>", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileGreaterThan(String value) {
            addCriterion("CSYS_USER_MOBILE >", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MOBILE >=", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileLessThan(String value) {
            addCriterion("CSYS_USER_MOBILE <", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MOBILE <=", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileLike(String value) {
            addCriterion("CSYS_USER_MOBILE like", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileNotLike(String value) {
            addCriterion("CSYS_USER_MOBILE not like", value, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileIn(List<String> values) {
            addCriterion("CSYS_USER_MOBILE in", values, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileNotIn(List<String> values) {
            addCriterion("CSYS_USER_MOBILE not in", values, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MOBILE between", value1, value2, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserMobileNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MOBILE not between", value1, value2, "csysUserMobile");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailIsNull() {
            addCriterion("CSYS_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailIsNotNull() {
            addCriterion("CSYS_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailEqualTo(String value) {
            addCriterion("CSYS_USER_EMAIL =", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailNotEqualTo(String value) {
            addCriterion("CSYS_USER_EMAIL <>", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailGreaterThan(String value) {
            addCriterion("CSYS_USER_EMAIL >", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EMAIL >=", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailLessThan(String value) {
            addCriterion("CSYS_USER_EMAIL <", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EMAIL <=", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailLike(String value) {
            addCriterion("CSYS_USER_EMAIL like", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailNotLike(String value) {
            addCriterion("CSYS_USER_EMAIL not like", value, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailIn(List<String> values) {
            addCriterion("CSYS_USER_EMAIL in", values, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailNotIn(List<String> values) {
            addCriterion("CSYS_USER_EMAIL not in", values, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EMAIL between", value1, value2, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserEmailNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EMAIL not between", value1, value2, "csysUserEmail");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressIsNull() {
            addCriterion("CSYS_USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressIsNotNull() {
            addCriterion("CSYS_USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressEqualTo(String value) {
            addCriterion("CSYS_USER_ADDRESS =", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressNotEqualTo(String value) {
            addCriterion("CSYS_USER_ADDRESS <>", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressGreaterThan(String value) {
            addCriterion("CSYS_USER_ADDRESS >", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ADDRESS >=", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressLessThan(String value) {
            addCriterion("CSYS_USER_ADDRESS <", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_ADDRESS <=", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressLike(String value) {
            addCriterion("CSYS_USER_ADDRESS like", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressNotLike(String value) {
            addCriterion("CSYS_USER_ADDRESS not like", value, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressIn(List<String> values) {
            addCriterion("CSYS_USER_ADDRESS in", values, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressNotIn(List<String> values) {
            addCriterion("CSYS_USER_ADDRESS not in", values, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ADDRESS between", value1, value2, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserAddressNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_ADDRESS not between", value1, value2, "csysUserAddress");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationIsNull() {
            addCriterion("CSYS_USER_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationIsNotNull() {
            addCriterion("CSYS_USER_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationEqualTo(String value) {
            addCriterion("CSYS_USER_EDUCATION =", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationNotEqualTo(String value) {
            addCriterion("CSYS_USER_EDUCATION <>", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationGreaterThan(String value) {
            addCriterion("CSYS_USER_EDUCATION >", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EDUCATION >=", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationLessThan(String value) {
            addCriterion("CSYS_USER_EDUCATION <", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EDUCATION <=", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationLike(String value) {
            addCriterion("CSYS_USER_EDUCATION like", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationNotLike(String value) {
            addCriterion("CSYS_USER_EDUCATION not like", value, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationIn(List<String> values) {
            addCriterion("CSYS_USER_EDUCATION in", values, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationNotIn(List<String> values) {
            addCriterion("CSYS_USER_EDUCATION not in", values, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EDUCATION between", value1, value2, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserEducationNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EDUCATION not between", value1, value2, "csysUserEducation");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoIsNull() {
            addCriterion("CSYS_USER_MENO is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoIsNotNull() {
            addCriterion("CSYS_USER_MENO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoEqualTo(String value) {
            addCriterion("CSYS_USER_MENO =", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoNotEqualTo(String value) {
            addCriterion("CSYS_USER_MENO <>", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoGreaterThan(String value) {
            addCriterion("CSYS_USER_MENO >", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MENO >=", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoLessThan(String value) {
            addCriterion("CSYS_USER_MENO <", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MENO <=", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoLike(String value) {
            addCriterion("CSYS_USER_MENO like", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoNotLike(String value) {
            addCriterion("CSYS_USER_MENO not like", value, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoIn(List<String> values) {
            addCriterion("CSYS_USER_MENO in", values, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoNotIn(List<String> values) {
            addCriterion("CSYS_USER_MENO not in", values, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MENO between", value1, value2, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserMenoNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MENO not between", value1, value2, "csysUserMeno");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeIsNull() {
            addCriterion("CSYS_USER_EWCODE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeIsNotNull() {
            addCriterion("CSYS_USER_EWCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeEqualTo(String value) {
            addCriterion("CSYS_USER_EWCODE =", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeNotEqualTo(String value) {
            addCriterion("CSYS_USER_EWCODE <>", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeGreaterThan(String value) {
            addCriterion("CSYS_USER_EWCODE >", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EWCODE >=", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeLessThan(String value) {
            addCriterion("CSYS_USER_EWCODE <", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_EWCODE <=", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeLike(String value) {
            addCriterion("CSYS_USER_EWCODE like", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeNotLike(String value) {
            addCriterion("CSYS_USER_EWCODE not like", value, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeIn(List<String> values) {
            addCriterion("CSYS_USER_EWCODE in", values, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeNotIn(List<String> values) {
            addCriterion("CSYS_USER_EWCODE not in", values, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EWCODE between", value1, value2, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserEwcodeNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_EWCODE not between", value1, value2, "csysUserEwcode");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageIsNull() {
            addCriterion("CSYS_USER_HEADIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageIsNotNull() {
            addCriterion("CSYS_USER_HEADIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageEqualTo(String value) {
            addCriterion("CSYS_USER_HEADIMAGE =", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageNotEqualTo(String value) {
            addCriterion("CSYS_USER_HEADIMAGE <>", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageGreaterThan(String value) {
            addCriterion("CSYS_USER_HEADIMAGE >", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_HEADIMAGE >=", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageLessThan(String value) {
            addCriterion("CSYS_USER_HEADIMAGE <", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_HEADIMAGE <=", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageLike(String value) {
            addCriterion("CSYS_USER_HEADIMAGE like", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageNotLike(String value) {
            addCriterion("CSYS_USER_HEADIMAGE not like", value, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageIn(List<String> values) {
            addCriterion("CSYS_USER_HEADIMAGE in", values, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageNotIn(List<String> values) {
            addCriterion("CSYS_USER_HEADIMAGE not in", values, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageBetween(String value1, String value2) {
            addCriterion("CSYS_USER_HEADIMAGE between", value1, value2, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserHeadimageNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_HEADIMAGE not between", value1, value2, "csysUserHeadimage");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityIsNull() {
            addCriterion("CSYS_USER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityIsNotNull() {
            addCriterion("CSYS_USER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityEqualTo(String value) {
            addCriterion("CSYS_USER_CITY =", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityNotEqualTo(String value) {
            addCriterion("CSYS_USER_CITY <>", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityGreaterThan(String value) {
            addCriterion("CSYS_USER_CITY >", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_CITY >=", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityLessThan(String value) {
            addCriterion("CSYS_USER_CITY <", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_CITY <=", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityLike(String value) {
            addCriterion("CSYS_USER_CITY like", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityNotLike(String value) {
            addCriterion("CSYS_USER_CITY not like", value, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityIn(List<String> values) {
            addCriterion("CSYS_USER_CITY in", values, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityNotIn(List<String> values) {
            addCriterion("CSYS_USER_CITY not in", values, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityBetween(String value1, String value2) {
            addCriterion("CSYS_USER_CITY between", value1, value2, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserCityNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_CITY not between", value1, value2, "csysUserCity");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceIsNull() {
            addCriterion("CSYS_USER_PROVICE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceIsNotNull() {
            addCriterion("CSYS_USER_PROVICE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceEqualTo(String value) {
            addCriterion("CSYS_USER_PROVICE =", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceNotEqualTo(String value) {
            addCriterion("CSYS_USER_PROVICE <>", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceGreaterThan(String value) {
            addCriterion("CSYS_USER_PROVICE >", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PROVICE >=", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceLessThan(String value) {
            addCriterion("CSYS_USER_PROVICE <", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_PROVICE <=", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceLike(String value) {
            addCriterion("CSYS_USER_PROVICE like", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceNotLike(String value) {
            addCriterion("CSYS_USER_PROVICE not like", value, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceIn(List<String> values) {
            addCriterion("CSYS_USER_PROVICE in", values, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceNotIn(List<String> values) {
            addCriterion("CSYS_USER_PROVICE not in", values, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PROVICE between", value1, value2, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserProviceNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_PROVICE not between", value1, value2, "csysUserProvice");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryIsNull() {
            addCriterion("CSYS_USER_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryIsNotNull() {
            addCriterion("CSYS_USER_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryEqualTo(String value) {
            addCriterion("CSYS_USER_COUNTRY =", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryNotEqualTo(String value) {
            addCriterion("CSYS_USER_COUNTRY <>", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryGreaterThan(String value) {
            addCriterion("CSYS_USER_COUNTRY >", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_COUNTRY >=", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryLessThan(String value) {
            addCriterion("CSYS_USER_COUNTRY <", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_COUNTRY <=", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryLike(String value) {
            addCriterion("CSYS_USER_COUNTRY like", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryNotLike(String value) {
            addCriterion("CSYS_USER_COUNTRY not like", value, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryIn(List<String> values) {
            addCriterion("CSYS_USER_COUNTRY in", values, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryNotIn(List<String> values) {
            addCriterion("CSYS_USER_COUNTRY not in", values, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryBetween(String value1, String value2) {
            addCriterion("CSYS_USER_COUNTRY between", value1, value2, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserCountryNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_COUNTRY not between", value1, value2, "csysUserCountry");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageIsNull() {
            addCriterion("CSYS_USER_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageIsNotNull() {
            addCriterion("CSYS_USER_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageEqualTo(String value) {
            addCriterion("CSYS_USER_LANGUAGE =", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageNotEqualTo(String value) {
            addCriterion("CSYS_USER_LANGUAGE <>", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageGreaterThan(String value) {
            addCriterion("CSYS_USER_LANGUAGE >", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_LANGUAGE >=", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageLessThan(String value) {
            addCriterion("CSYS_USER_LANGUAGE <", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_LANGUAGE <=", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageLike(String value) {
            addCriterion("CSYS_USER_LANGUAGE like", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageNotLike(String value) {
            addCriterion("CSYS_USER_LANGUAGE not like", value, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageIn(List<String> values) {
            addCriterion("CSYS_USER_LANGUAGE in", values, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageNotIn(List<String> values) {
            addCriterion("CSYS_USER_LANGUAGE not in", values, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageBetween(String value1, String value2) {
            addCriterion("CSYS_USER_LANGUAGE between", value1, value2, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserLanguageNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_LANGUAGE not between", value1, value2, "csysUserLanguage");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeIsNull() {
            addCriterion("CSYS_USER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeIsNotNull() {
            addCriterion("CSYS_USER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME =", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME <>", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME >", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME >=", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeLessThan(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME <", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_CREATE_TIME <=", value, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_CREATE_TIME in", values, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_CREATE_TIME not in", values, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_CREATE_TIME between", value1, value2, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_CREATE_TIME not between", value1, value2, "csysUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserIsNull() {
            addCriterion("CSYS_USER_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserIsNotNull() {
            addCriterion("CSYS_USER_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserEqualTo(String value) {
            addCriterion("CSYS_USER_CREATE_USER =", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_USER_CREATE_USER <>", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserGreaterThan(String value) {
            addCriterion("CSYS_USER_CREATE_USER >", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_CREATE_USER >=", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserLessThan(String value) {
            addCriterion("CSYS_USER_CREATE_USER <", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_CREATE_USER <=", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserLike(String value) {
            addCriterion("CSYS_USER_CREATE_USER like", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserNotLike(String value) {
            addCriterion("CSYS_USER_CREATE_USER not like", value, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserIn(List<String> values) {
            addCriterion("CSYS_USER_CREATE_USER in", values, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_USER_CREATE_USER not in", values, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER_CREATE_USER between", value1, value2, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_CREATE_USER not between", value1, value2, "csysUserCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeIsNull() {
            addCriterion("CSYS_USER_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeIsNotNull() {
            addCriterion("CSYS_USER_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME =", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME <>", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME >", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME >=", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeLessThan(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME <", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_MODIFY_TIME <=", value, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_MODIFY_TIME in", values, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_MODIFY_TIME not in", values, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_MODIFY_TIME between", value1, value2, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_MODIFY_TIME not between", value1, value2, "csysUserModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserIsNull() {
            addCriterion("CSYS_USER_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserIsNotNull() {
            addCriterion("CSYS_USER_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserEqualTo(String value) {
            addCriterion("CSYS_USER_MODIFY_USER =", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_USER_MODIFY_USER <>", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserGreaterThan(String value) {
            addCriterion("CSYS_USER_MODIFY_USER >", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MODIFY_USER >=", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserLessThan(String value) {
            addCriterion("CSYS_USER_MODIFY_USER <", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_MODIFY_USER <=", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserLike(String value) {
            addCriterion("CSYS_USER_MODIFY_USER like", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserNotLike(String value) {
            addCriterion("CSYS_USER_MODIFY_USER not like", value, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserIn(List<String> values) {
            addCriterion("CSYS_USER_MODIFY_USER in", values, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_USER_MODIFY_USER not in", values, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MODIFY_USER between", value1, value2, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_MODIFY_USER not between", value1, value2, "csysUserModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteIsNull() {
            addCriterion("CSYS_USER_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteIsNotNull() {
            addCriterion("CSYS_USER_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteEqualTo(String value) {
            addCriterion("CSYS_USER_IS_DELETE =", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_USER_IS_DELETE <>", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_USER_IS_DELETE >", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_IS_DELETE >=", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteLessThan(String value) {
            addCriterion("CSYS_USER_IS_DELETE <", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_IS_DELETE <=", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteLike(String value) {
            addCriterion("CSYS_USER_IS_DELETE like", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteNotLike(String value) {
            addCriterion("CSYS_USER_IS_DELETE not like", value, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteIn(List<String> values) {
            addCriterion("CSYS_USER_IS_DELETE in", values, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_USER_IS_DELETE not in", values, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_USER_IS_DELETE between", value1, value2, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_IS_DELETE not between", value1, value2, "csysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeIsNull() {
            addCriterion("CSYS_USER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeIsNotNull() {
            addCriterion("CSYS_USER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeEqualTo(Date value) {
            addCriterion("CSYS_USER_TIME =", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeNotEqualTo(Date value) {
            addCriterion("CSYS_USER_TIME <>", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeGreaterThan(Date value) {
            addCriterion("CSYS_USER_TIME >", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_TIME >=", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeLessThan(Date value) {
            addCriterion("CSYS_USER_TIME <", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_TIME <=", value, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeIn(List<Date> values) {
            addCriterion("CSYS_USER_TIME in", values, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeNotIn(List<Date> values) {
            addCriterion("CSYS_USER_TIME not in", values, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_TIME between", value1, value2, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_TIME not between", value1, value2, "csysUserTime");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateIsNull() {
            addCriterion("CSYS_USER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateIsNotNull() {
            addCriterion("CSYS_USER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateEqualTo(Date value) {
            addCriterion("CSYS_USER_DATE =", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateNotEqualTo(Date value) {
            addCriterion("CSYS_USER_DATE <>", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateGreaterThan(Date value) {
            addCriterion("CSYS_USER_DATE >", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_DATE >=", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateLessThan(Date value) {
            addCriterion("CSYS_USER_DATE <", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_USER_DATE <=", value, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateIn(List<Date> values) {
            addCriterion("CSYS_USER_DATE in", values, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateNotIn(List<Date> values) {
            addCriterion("CSYS_USER_DATE not in", values, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_DATE between", value1, value2, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_USER_DATE not between", value1, value2, "csysUserDate");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenIsNull() {
            addCriterion("CSYS_USER_REFRESH_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenIsNotNull() {
            addCriterion("CSYS_USER_REFRESH_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenEqualTo(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN =", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenNotEqualTo(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN <>", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenGreaterThan(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN >", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN >=", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenLessThan(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN <", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN <=", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenLike(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN like", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenNotLike(String value) {
            addCriterion("CSYS_USER_REFRESH_TOKEN not like", value, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenIn(List<String> values) {
            addCriterion("CSYS_USER_REFRESH_TOKEN in", values, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenNotIn(List<String> values) {
            addCriterion("CSYS_USER_REFRESH_TOKEN not in", values, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenBetween(String value1, String value2) {
            addCriterion("CSYS_USER_REFRESH_TOKEN between", value1, value2, "csysUserRefreshToken");
            return (Criteria) this;
        }

        public Criteria andCsysUserRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("CSYS_USER_REFRESH_TOKEN not between", value1, value2, "csysUserRefreshToken");
            return (Criteria) this;
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