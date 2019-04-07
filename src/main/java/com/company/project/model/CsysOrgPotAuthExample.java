package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysOrgPotAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysOrgPotAuthExample() {
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

        public Criteria andCsysOrgPotAuthIdIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID =", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID <>", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID >", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID >=", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID <", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID <=", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID like", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_ID not like", value, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_ID in", values, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_ID not in", values, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_ID between", value1, value2, "csysOrgPotAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_ID not between", value1, value2, "csysOrgPotAuthId");
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

        public Criteria andCsysOrgStruceNameIsNull() {
            addCriterion("CSYS_ORG_STRUCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME =", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME <>", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME >", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME >=", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME <", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME <=", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME like", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_NAME not like", value, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_NAME in", values, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_NAME not in", values, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_NAME between", value1, value2, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_NAME not between", value1, value2, "csysOrgStruceName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdIsNull() {
            addCriterion("CSYS_ORG_POT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdIsNotNull() {
            addCriterion("CSYS_ORG_POT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_ID =", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_ID <>", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_ID >", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_ID >=", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdLessThan(String value) {
            addCriterion("CSYS_ORG_POT_ID <", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_ID <=", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdLike(String value) {
            addCriterion("CSYS_ORG_POT_ID like", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdNotLike(String value) {
            addCriterion("CSYS_ORG_POT_ID not like", value, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_ID in", values, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_ID not in", values, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_ID between", value1, value2, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_ID not between", value1, value2, "csysOrgPotId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameIsNull() {
            addCriterion("CSYS_ORG_POT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameIsNotNull() {
            addCriterion("CSYS_ORG_POT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_NAME =", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_NAME <>", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_NAME >", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_NAME >=", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameLessThan(String value) {
            addCriterion("CSYS_ORG_POT_NAME <", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_NAME <=", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameLike(String value) {
            addCriterion("CSYS_ORG_POT_NAME like", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameNotLike(String value) {
            addCriterion("CSYS_ORG_POT_NAME not like", value, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_NAME in", values, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_NAME not in", values, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_NAME between", value1, value2, "csysOrgPotName");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_NAME not between", value1, value2, "csysOrgPotName");
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

        public Criteria andCsysOrgPotAuthTypeIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE =", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE <>", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE >", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE >=", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE <", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE <=", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE like", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE not like", value, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE in", values, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE not in", values, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE between", value1, value2, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_TYPE not between", value1, value2, "csysOrgPotAuthType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC =", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC <>", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC >", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC >=", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC <", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC <=", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC like", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC not like", value, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC in", values, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC not in", values, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC between", value1, value2, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_DESC not between", value1, value2, "csysOrgPotAuthDesc");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE =", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE <>", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE >", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE >=", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE <", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE <=", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE like", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE not like", value, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE in", values, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE not in", values, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE between", value1, value2, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_IS_DELETE not between", value1, value2, "csysOrgPotAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME =", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME <>", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME >", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME >=", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME <", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME <=", value, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME in", values, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME not in", values, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME between", value1, value2, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_TIME not between", value1, value2, "csysOrgPotAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE =", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE <>", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE >", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE >=", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE <", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE <=", value, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE in", values, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE not in", values, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE between", value1, value2, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_DATE not between", value1, value2, "csysOrgPotAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER =", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER <>", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER >", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER >=", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER <", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER <=", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER like", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER not like", value, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER in", values, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER not in", values, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER between", value1, value2, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_USER not between", value1, value2, "csysOrgPotAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER =", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER <>", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER >", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER >=", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER <", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER <=", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER like", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER not like", value, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER in", values, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER not in", values, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER between", value1, value2, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_USER not between", value1, value2, "csysOrgPotAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME =", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME <>", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME >", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME >=", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME <", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME <=", value, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME in", values, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME not in", values, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME between", value1, value2, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_CREATE_TIME not between", value1, value2, "csysOrgPotAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeIsNull() {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME =", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME <>", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME >", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME >=", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME <", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME <=", value, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME in", values, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME not in", values, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME between", value1, value2, "csysOrgPotAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_AUTH_MODIFY_TIME not between", value1, value2, "csysOrgPotAuthModifyTime");
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