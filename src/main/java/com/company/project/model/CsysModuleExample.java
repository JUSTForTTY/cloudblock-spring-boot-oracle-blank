package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysModuleExample() {
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

        public Criteria andCsysModuleIdIsNull() {
            addCriterion("CSYS_MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdIsNotNull() {
            addCriterion("CSYS_MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdEqualTo(String value) {
            addCriterion("CSYS_MODULE_ID =", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_ID <>", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdGreaterThan(String value) {
            addCriterion("CSYS_MODULE_ID >", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_ID >=", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdLessThan(String value) {
            addCriterion("CSYS_MODULE_ID <", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_ID <=", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdLike(String value) {
            addCriterion("CSYS_MODULE_ID like", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdNotLike(String value) {
            addCriterion("CSYS_MODULE_ID not like", value, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdIn(List<String> values) {
            addCriterion("CSYS_MODULE_ID in", values, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_ID not in", values, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_ID between", value1, value2, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_ID not between", value1, value2, "csysModuleId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNull() {
            addCriterion("CSYS_PAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNotNull() {
            addCriterion("CSYS_PAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID =", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <>", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_ID >", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID >=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThan(String value) {
            addCriterion("CSYS_PAGE_ID <", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLike(String value) {
            addCriterion("CSYS_PAGE_ID like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotLike(String value) {
            addCriterion("CSYS_PAGE_ID not like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID not in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID not between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdIsNull() {
            addCriterion("CSYS_LAYOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdIsNotNull() {
            addCriterion("CSYS_LAYOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID =", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID <>", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdGreaterThan(String value) {
            addCriterion("CSYS_LAYOUT_ID >", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID >=", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLessThan(String value) {
            addCriterion("CSYS_LAYOUT_ID <", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_LAYOUT_ID <=", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdLike(String value) {
            addCriterion("CSYS_LAYOUT_ID like", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotLike(String value) {
            addCriterion("CSYS_LAYOUT_ID not like", value, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_ID in", values, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotIn(List<String> values) {
            addCriterion("CSYS_LAYOUT_ID not in", values, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_ID between", value1, value2, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysLayoutIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_LAYOUT_ID not between", value1, value2, "csysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameIsNull() {
            addCriterion("CSYS_MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameIsNotNull() {
            addCriterion("CSYS_MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameEqualTo(String value) {
            addCriterion("CSYS_MODULE_NAME =", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_NAME <>", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameGreaterThan(String value) {
            addCriterion("CSYS_MODULE_NAME >", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_NAME >=", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameLessThan(String value) {
            addCriterion("CSYS_MODULE_NAME <", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_NAME <=", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameLike(String value) {
            addCriterion("CSYS_MODULE_NAME like", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameNotLike(String value) {
            addCriterion("CSYS_MODULE_NAME not like", value, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameIn(List<String> values) {
            addCriterion("CSYS_MODULE_NAME in", values, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_NAME not in", values, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_NAME between", value1, value2, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_NAME not between", value1, value2, "csysModuleName");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexIsNull() {
            addCriterion("CSYS_MODULE_ISMULTIPLEX is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexIsNotNull() {
            addCriterion("CSYS_MODULE_ISMULTIPLEX is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexEqualTo(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX =", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX <>", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexGreaterThan(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX >", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX >=", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexLessThan(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX <", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX <=", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexLike(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX like", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexNotLike(String value) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX not like", value, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexIn(List<String> values) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX in", values, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX not in", values, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX between", value1, value2, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsmultiplexNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_ISMULTIPLEX not between", value1, value2, "csysModuleIsmultiplex");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeIsNull() {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeIsNotNull() {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeEqualTo(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE =", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE <>", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeGreaterThan(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE >", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE >=", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeLessThan(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE <", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE <=", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeLike(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE like", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeNotLike(String value) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE not like", value, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeIn(List<String> values) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE in", values, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE not in", values, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE between", value1, value2, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleMultiplexTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_MULTIPLEX_TYPE not between", value1, value2, "csysModuleMultiplexType");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeIsNull() {
            addCriterion("CSYS_MODULE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeIsNotNull() {
            addCriterion("CSYS_MODULE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME =", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME <>", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME >", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME >=", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeLessThan(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME <", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_CREATE_TIME <=", value, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_MODULE_CREATE_TIME in", values, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MODULE_CREATE_TIME not in", values, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_CREATE_TIME between", value1, value2, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_CREATE_TIME not between", value1, value2, "csysModuleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserIsNull() {
            addCriterion("CSYS_MODULE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserIsNotNull() {
            addCriterion("CSYS_MODULE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserEqualTo(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER =", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER <>", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserGreaterThan(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER >", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER >=", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserLessThan(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER <", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER <=", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserLike(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER like", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserNotLike(String value) {
            addCriterion("CSYS_MODULE_CREATE_USER not like", value, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserIn(List<String> values) {
            addCriterion("CSYS_MODULE_CREATE_USER in", values, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_CREATE_USER not in", values, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_CREATE_USER between", value1, value2, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_CREATE_USER not between", value1, value2, "csysModuleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeIsNull() {
            addCriterion("CSYS_MODULE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeIsNotNull() {
            addCriterion("CSYS_MODULE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME =", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME <>", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME >", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME >=", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeLessThan(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME <", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_MODIFY_TIME <=", value, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_MODULE_MODIFY_TIME in", values, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MODULE_MODIFY_TIME not in", values, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_MODIFY_TIME between", value1, value2, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_MODIFY_TIME not between", value1, value2, "csysModuleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserIsNull() {
            addCriterion("CSYS_MODULE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserIsNotNull() {
            addCriterion("CSYS_MODULE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserEqualTo(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER =", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER <>", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserGreaterThan(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER >", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER >=", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserLessThan(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER <", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER <=", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserLike(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER like", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserNotLike(String value) {
            addCriterion("CSYS_MODULE_MODIFY_USER not like", value, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserIn(List<String> values) {
            addCriterion("CSYS_MODULE_MODIFY_USER in", values, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_MODIFY_USER not in", values, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_MODIFY_USER between", value1, value2, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_MODIFY_USER not between", value1, value2, "csysModuleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteIsNull() {
            addCriterion("CSYS_MODULE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteIsNotNull() {
            addCriterion("CSYS_MODULE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteEqualTo(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE =", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE <>", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE >", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE >=", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteLessThan(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE <", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE <=", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteLike(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE like", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteNotLike(String value) {
            addCriterion("CSYS_MODULE_IS_DELETE not like", value, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteIn(List<String> values) {
            addCriterion("CSYS_MODULE_IS_DELETE in", values, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_MODULE_IS_DELETE not in", values, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_IS_DELETE between", value1, value2, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_MODULE_IS_DELETE not between", value1, value2, "csysModuleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeIsNull() {
            addCriterion("CSYS_MODULE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeIsNotNull() {
            addCriterion("CSYS_MODULE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeEqualTo(Date value) {
            addCriterion("CSYS_MODULE_TIME =", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MODULE_TIME <>", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeGreaterThan(Date value) {
            addCriterion("CSYS_MODULE_TIME >", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_TIME >=", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeLessThan(Date value) {
            addCriterion("CSYS_MODULE_TIME <", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_TIME <=", value, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeIn(List<Date> values) {
            addCriterion("CSYS_MODULE_TIME in", values, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MODULE_TIME not in", values, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_TIME between", value1, value2, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_TIME not between", value1, value2, "csysModuleTime");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateIsNull() {
            addCriterion("CSYS_MODULE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateIsNotNull() {
            addCriterion("CSYS_MODULE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateEqualTo(Date value) {
            addCriterion("CSYS_MODULE_DATE =", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateNotEqualTo(Date value) {
            addCriterion("CSYS_MODULE_DATE <>", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateGreaterThan(Date value) {
            addCriterion("CSYS_MODULE_DATE >", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_DATE >=", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateLessThan(Date value) {
            addCriterion("CSYS_MODULE_DATE <", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MODULE_DATE <=", value, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateIn(List<Date> values) {
            addCriterion("CSYS_MODULE_DATE in", values, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateNotIn(List<Date> values) {
            addCriterion("CSYS_MODULE_DATE not in", values, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_DATE between", value1, value2, "csysModuleDate");
            return (Criteria) this;
        }

        public Criteria andCsysModuleDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MODULE_DATE not between", value1, value2, "csysModuleDate");
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