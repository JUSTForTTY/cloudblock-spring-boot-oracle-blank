package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysFieldInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysFieldInfoExample() {
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

        public Criteria andCsysFieldInfoIdIsNull() {
            addCriterion("CSYS_FIELD_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID =", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <>", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ID >", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID >=", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <=", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ID like", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ID not like", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ID in", values, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ID not in", values, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ID between", value1, value2, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ID not between", value1, value2, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIsNull() {
            addCriterion("CSYS_FIELD_INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME =", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <>", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME >", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME >=", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <=", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLike(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME like", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME not like", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_NAME in", values, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_NAME not in", values, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_NAME between", value1, value2, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_NAME not between", value1, value2, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIsNull() {
            addCriterion("CSYS_FIELD_INFO_RELNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_RELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME =", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <>", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME >", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME >=", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <=", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLike(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME like", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not like", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_RELNAME in", values, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not in", values, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_RELNAME between", value1, value2, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not between", value1, value2, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameIsNull() {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME =", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME <>", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME >", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME >=", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME <", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME <=", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME like", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME not like", value, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME in", values, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME not in", values, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME between", value1, value2, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAliasnameNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ALIASNAME not between", value1, value2, "csysFieldInfoAliasname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIsNull() {
            addCriterion("CSYS_FIELD_INFO_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION =", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <>", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION >", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION >=", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <=", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION like", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION not like", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REGION in", values, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REGION not in", values, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REGION between", value1, value2, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REGION not between", value1, value2, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIsNull() {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE =", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <>", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE >", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE >=", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <=", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE like", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not like", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE in", values, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not in", values, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE between", value1, value2, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not between", value1, value2, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIsNull() {
            addCriterion("CSYS_FIELD_INFO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE =", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <>", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE >", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE >=", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <=", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLike(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE like", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE not like", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_TYPE in", values, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_TYPE not in", values, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_TYPE between", value1, value2, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_TYPE not between", value1, value2, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullIsNull() {
            addCriterion("CSYS_FIELD_INFO_IS_NULL is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_IS_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL =", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL <>", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL >", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL >=", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL <", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL <=", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL like", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL not like", value, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL in", values, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL not in", values, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL between", value1, value2, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsNullNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_NULL not between", value1, value2, "csysFieldInfoIsNull");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIsNull() {
            addCriterion("CSYS_FIELD_INFO_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT =", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <>", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT >", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT >=", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <=", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLike(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT like", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not like", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT in", values, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not in", values, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT between", value1, value2, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not between", value1, value2, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkIsNull() {
            addCriterion("CSYS_FIELD_INFO_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK =", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK <>", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK >", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK >=", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK <", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK <=", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK like", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REMARK not like", value, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REMARK in", values, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REMARK not in", values, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REMARK between", value1, value2, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRemarkNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REMARK not between", value1, value2, "csysFieldInfoRemark");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptIsNull() {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT =", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT <>", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT >", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT >=", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT <", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT <=", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT like", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT not like", value, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT in", values, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT not in", values, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT between", value1, value2, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsEncryptNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_ENCRYPT not between", value1, value2, "csysFieldInfoIsEncrypt");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeIsNull() {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE =", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE <>", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE >", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE >=", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE <", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE <=", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE like", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE not like", value, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE in", values, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE not in", values, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE between", value1, value2, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoEncryptTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ENCRYPT_TYPE not between", value1, value2, "csysFieldInfoEncryptType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthIsNull() {
            addCriterion("CSYS_FIELD_INFO_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH =", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH <>", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH >", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH >=", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH <", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH <=", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthLike(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH like", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_LENGTH not like", value, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_LENGTH in", values, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_LENGTH not in", values, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_LENGTH between", value1, value2, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoLengthNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_LENGTH not between", value1, value2, "csysFieldInfoLength");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyIsNull() {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY =", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY <>", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY >", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY >=", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY <", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY <=", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyLike(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY like", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY not like", value, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY in", values, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY not in", values, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY between", value1, value2, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsKeyNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_KEY not between", value1, value2, "csysFieldInfoExistsKey");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysIsNull() {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS =", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS <>", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS >", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS >=", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS <", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS <=", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysLike(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS like", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS not like", value, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS in", values, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS not in", values, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS between", value1, value2, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoExistsOutkeysNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_EXISTS_OUTKEYS not between", value1, value2, "csysFieldInfoExistsOutkeys");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionIsNull() {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION =", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION <>", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION >", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION >=", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION <", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION <=", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionLike(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION like", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION not like", value, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION in", values, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION not in", values, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION between", value1, value2, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoForeignRegionNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_FOREIGN_REGION not between", value1, value2, "csysFieldInfoForeignRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeIsNull() {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME =", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME <>", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME >", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME >=", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeLessThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME <", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME <=", value, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME in", values, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME not in", values, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME between", value1, value2, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_CREATE_TIME not between", value1, value2, "csysFieldInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserIsNull() {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER =", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER <>", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER >", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER >=", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER <", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER <=", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserLike(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER like", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER not like", value, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER in", values, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER not in", values, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER between", value1, value2, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_CREATE_USER not between", value1, value2, "csysFieldInfoCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeIsNull() {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME =", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME <>", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME >", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME >=", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeLessThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME <", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME <=", value, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME in", values, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME not in", values, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME between", value1, value2, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_TIME not between", value1, value2, "csysFieldInfoModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserIsNull() {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER =", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER <>", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER >", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER >=", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER <", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER <=", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserLike(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER like", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER not like", value, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER in", values, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER not in", values, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER between", value1, value2, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_MODIFY_USER not between", value1, value2, "csysFieldInfoModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteIsNull() {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE =", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE <>", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE >", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE >=", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE <", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE <=", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE like", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE not like", value, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE in", values, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE not in", values, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE between", value1, value2, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_IS_DELETE not between", value1, value2, "csysFieldInfoIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeIsNull() {
            addCriterion("CSYS_FIELD_INFO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME =", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeNotEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME <>", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeGreaterThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME >", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME >=", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeLessThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME <", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_TIME <=", value, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_TIME in", values, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeNotIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_TIME not in", values, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_TIME between", value1, value2, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_TIME not between", value1, value2, "csysFieldInfoTime");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIsNull() {
            addCriterion("CSYS_FIELD_INFO_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE =", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <>", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateGreaterThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE >", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE >=", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateLessThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <=", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_DATE in", values, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_DATE not in", values, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_DATE between", value1, value2, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_DATE not between", value1, value2, "csysFieldInfoDate");
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