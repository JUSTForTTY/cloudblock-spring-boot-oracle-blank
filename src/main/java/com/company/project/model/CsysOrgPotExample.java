package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysOrgPotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysOrgPotExample() {
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

        public Criteria andCsysOrgPotParentIdIsNull() {
            addCriterion("CSYS_ORG_POT_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdIsNotNull() {
            addCriterion("CSYS_ORG_POT_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID =", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID <>", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID >", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID >=", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdLessThan(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID <", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID <=", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdLike(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID like", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdNotLike(String value) {
            addCriterion("CSYS_ORG_POT_PARENT_ID not like", value, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_PARENT_ID in", values, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_PARENT_ID not in", values, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_PARENT_ID between", value1, value2, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotParentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_PARENT_ID not between", value1, value2, "csysOrgPotParentId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelIsNull() {
            addCriterion("CSYS_ORG_POT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelIsNotNull() {
            addCriterion("CSYS_ORG_POT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL =", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL <>", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL >", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL >=", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelLessThan(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL <", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL <=", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelLike(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL like", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelNotLike(String value) {
            addCriterion("CSYS_ORG_POT_LEVEL not like", value, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_LEVEL in", values, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_LEVEL not in", values, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_LEVEL between", value1, value2, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotLevelNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_LEVEL not between", value1, value2, "csysOrgPotLevel");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeIsNull() {
            addCriterion("CSYS_ORG_POT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeIsNotNull() {
            addCriterion("CSYS_ORG_POT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TYPE =", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TYPE <>", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_TYPE >", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TYPE >=", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeLessThan(String value) {
            addCriterion("CSYS_ORG_POT_TYPE <", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TYPE <=", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeLike(String value) {
            addCriterion("CSYS_ORG_POT_TYPE like", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeNotLike(String value) {
            addCriterion("CSYS_ORG_POT_TYPE not like", value, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TYPE in", values, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TYPE not in", values, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TYPE between", value1, value2, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TYPE not between", value1, value2, "csysOrgPotType");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIsNull() {
            addCriterion("CSYS_ORG_POT_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIsNotNull() {
            addCriterion("CSYS_ORG_POT_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE =", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE <>", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_TABLE >", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE >=", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableLessThan(String value) {
            addCriterion("CSYS_ORG_POT_TABLE <", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE <=", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableLike(String value) {
            addCriterion("CSYS_ORG_POT_TABLE like", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableNotLike(String value) {
            addCriterion("CSYS_ORG_POT_TABLE not like", value, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TABLE in", values, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TABLE not in", values, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TABLE between", value1, value2, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TABLE not between", value1, value2, "csysOrgPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdIsNull() {
            addCriterion("CSYS_ORG_POT_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdIsNotNull() {
            addCriterion("CSYS_ORG_POT_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID =", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID <>", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID >", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID >=", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdLessThan(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID <", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID <=", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdLike(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID like", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdNotLike(String value) {
            addCriterion("CSYS_ORG_POT_TABLE_ID not like", value, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TABLE_ID in", values, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_TABLE_ID not in", values, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TABLE_ID between", value1, value2, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTableIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_TABLE_ID not between", value1, value2, "csysOrgPotTableId");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeIsNull() {
            addCriterion("CSYS_ORG_POT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME =", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME <>", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME >", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME >=", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME <", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME <=", value, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME in", values, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME not in", values, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME between", value1, value2, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_CREATE_TIME not between", value1, value2, "csysOrgPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserIsNull() {
            addCriterion("CSYS_ORG_POT_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserIsNotNull() {
            addCriterion("CSYS_ORG_POT_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER =", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER <>", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER >", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER >=", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserLessThan(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER <", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER <=", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserLike(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER like", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserNotLike(String value) {
            addCriterion("CSYS_ORG_POT_CREATE_USER not like", value, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_CREATE_USER in", values, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_CREATE_USER not in", values, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_CREATE_USER between", value1, value2, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_CREATE_USER not between", value1, value2, "csysOrgPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeIsNull() {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME =", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME <>", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME >", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME >=", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME <", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME <=", value, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME in", values, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME not in", values, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME between", value1, value2, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_MODIFY_TIME not between", value1, value2, "csysOrgPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserIsNull() {
            addCriterion("CSYS_ORG_POT_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserIsNotNull() {
            addCriterion("CSYS_ORG_POT_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER =", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER <>", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER >", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER >=", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserLessThan(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER <", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER <=", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserLike(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER like", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserNotLike(String value) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER not like", value, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER in", values, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER not in", values, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER between", value1, value2, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_MODIFY_USER not between", value1, value2, "csysOrgPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteIsNull() {
            addCriterion("CSYS_ORG_POT_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteIsNotNull() {
            addCriterion("CSYS_ORG_POT_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE =", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE <>", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE >", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE >=", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteLessThan(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE <", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE <=", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteLike(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE like", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteNotLike(String value) {
            addCriterion("CSYS_ORG_POT_IS_DELETE not like", value, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_IS_DELETE in", values, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_ORG_POT_IS_DELETE not in", values, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_IS_DELETE between", value1, value2, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ORG_POT_IS_DELETE not between", value1, value2, "csysOrgPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeIsNull() {
            addCriterion("CSYS_ORG_POT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeIsNotNull() {
            addCriterion("CSYS_ORG_POT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeEqualTo(Object value) {
            addCriterion("CSYS_ORG_POT_TIME =", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeNotEqualTo(Object value) {
            addCriterion("CSYS_ORG_POT_TIME <>", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeGreaterThan(Object value) {
            addCriterion("CSYS_ORG_POT_TIME >", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeGreaterThanOrEqualTo(Object value) {
            addCriterion("CSYS_ORG_POT_TIME >=", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeLessThan(Object value) {
            addCriterion("CSYS_ORG_POT_TIME <", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeLessThanOrEqualTo(Object value) {
            addCriterion("CSYS_ORG_POT_TIME <=", value, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeIn(List<Object> values) {
            addCriterion("CSYS_ORG_POT_TIME in", values, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeNotIn(List<Object> values) {
            addCriterion("CSYS_ORG_POT_TIME not in", values, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeBetween(Object value1, Object value2) {
            addCriterion("CSYS_ORG_POT_TIME between", value1, value2, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotTimeNotBetween(Object value1, Object value2) {
            addCriterion("CSYS_ORG_POT_TIME not between", value1, value2, "csysOrgPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateIsNull() {
            addCriterion("CSYS_ORG_POT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateIsNotNull() {
            addCriterion("CSYS_ORG_POT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_DATE =", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateNotEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_DATE <>", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateGreaterThan(Date value) {
            addCriterion("CSYS_ORG_POT_DATE >", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_DATE >=", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateLessThan(Date value) {
            addCriterion("CSYS_ORG_POT_DATE <", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ORG_POT_DATE <=", value, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_DATE in", values, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateNotIn(List<Date> values) {
            addCriterion("CSYS_ORG_POT_DATE not in", values, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_DATE between", value1, value2, "csysOrgPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysOrgPotDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ORG_POT_DATE not between", value1, value2, "csysOrgPotDate");
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