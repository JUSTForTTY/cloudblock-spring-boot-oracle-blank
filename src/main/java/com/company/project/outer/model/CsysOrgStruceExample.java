package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysOrgStruceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysOrgStruceExample() {
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

        public Criteria andCsysOrgStruceTypeIsNull() {
            addCriterion("CSYS_ORG_STRUCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE =", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE <>", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE >", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE >=", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE <", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE <=", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE like", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_TYPE not like", value, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_TYPE in", values, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_TYPE not in", values, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_TYPE between", value1, value2, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_TYPE not between", value1, value2, "csysOrgStruceType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledIsNull() {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED =", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED <>", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED >", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED >=", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED <", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED <=", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED like", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED not like", value, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED in", values, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED not in", values, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED between", value1, value2, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsEnabledNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_IS_ENABLED not between", value1, value2, "csysOrgStruceIsEnabled");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeIsNull() {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME =", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME <>", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME >", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME >=", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME <", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME <=", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME like", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME not like", value, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME in", values, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME not in", values, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME between", value1, value2, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceColorthemeNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_COLORTHEME not between", value1, value2, "csysOrgStruceColortheme");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleIsNull() {
            addCriterion("CSYS_ORG_STRUCE_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE =", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE <>", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE >", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE >=", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE <", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE <=", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE like", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_STYLE not like", value, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_STYLE in", values, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_STYLE not in", values, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_STYLE between", value1, value2, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceStyleNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_STYLE not between", value1, value2, "csysOrgStruceStyle");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteIsNull() {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE =", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE <>", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE >", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE >=", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE <", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE <=", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE like", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE not like", value, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE in", values, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE not in", values, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE between", value1, value2, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceOrienteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_ORIENTE not between", value1, value2, "csysOrgStruceOriente");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeIsNull() {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME =", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME <>", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME >", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME >=", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME <", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME <=", value, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME in", values, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME not in", values, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME between", value1, value2, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_TIME not between", value1, value2, "csysOrgStruceCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeIsNull() {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME =", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME <>", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME >", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME >=", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME <", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME <=", value, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME in", values, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME not in", values, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME between", value1, value2, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_TIME not between", value1, value2, "csysOrgStruceModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserIsNull() {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER =", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER <>", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER >", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER >=", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER <", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER <=", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER like", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER not like", value, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER in", values, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER not in", values, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER between", value1, value2, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_CREATE_USER not between", value1, value2, "csysOrgStruceCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserIsNull() {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER =", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER <>", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER >", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER >=", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER <", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER <=", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER like", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER not like", value, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER in", values, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER not in", values, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER between", value1, value2, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_MODIFY_USER not between", value1, value2, "csysOrgStruceModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteIsNull() {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE =", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE <>", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE >", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE >=", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteLessThan(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE <", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE <=", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE like", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteNotLike(String value) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE not like", value, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE in", values, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE not in", values, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE between", value1, value2, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_STRUCE_IS_DELETE not between", value1, value2, "csysOrgStruceIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeIsNull() {
            addCriterion("CSYS_ORG_STRUCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME =", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME <>", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME >", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME >=", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME <", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_TIME <=", value, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_TIME in", values, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_TIME not in", values, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_TIME between", value1, value2, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_TIME not between", value1, value2, "csysOrgStruceTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateIsNull() {
            addCriterion("CSYS_ORG_STRUCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateIsNotNull() {
            addCriterion("CSYS_ORG_STRUCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE =", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE <>", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateGreaterThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE >", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE >=", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateLessThan(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE <", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_STRUCE_DATE <=", value, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_DATE in", values, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_STRUCE_DATE not in", values, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_DATE between", value1, value2, "csysOrgStruceDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgStruceDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_STRUCE_DATE not between", value1, value2, "csysOrgStruceDate");
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