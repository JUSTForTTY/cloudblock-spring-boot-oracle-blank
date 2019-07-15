package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPotExample() {
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

        public Criteria andCsysPotIdIsNull() {
            addCriterion("CSYS_POT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdIsNotNull() {
            addCriterion("CSYS_POT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdEqualTo(String value) {
            addCriterion("CSYS_POT_ID =", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_ID <>", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdGreaterThan(String value) {
            addCriterion("CSYS_POT_ID >", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ID >=", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLessThan(String value) {
            addCriterion("CSYS_POT_ID <", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ID <=", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdLike(String value) {
            addCriterion("CSYS_POT_ID like", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotLike(String value) {
            addCriterion("CSYS_POT_ID not like", value, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdIn(List<String> values) {
            addCriterion("CSYS_POT_ID in", values, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_ID not in", values, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ID between", value1, value2, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ID not between", value1, value2, "csysPotId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdIsNull() {
            addCriterion("CSYS_POT_PUBLIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdIsNotNull() {
            addCriterion("CSYS_POT_PUBLIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID =", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <>", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdGreaterThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID >", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID >=", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLessThan(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID <=", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID like", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotLike(String value) {
            addCriterion("CSYS_POT_PUBLIC_ID not like", value, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_ID in", values, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_PUBLIC_ID not in", values, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_ID between", value1, value2, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotPublicIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_PUBLIC_ID not between", value1, value2, "csysPotPublicId");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNull() {
            addCriterion("CSYS_POT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIsNotNull() {
            addCriterion("CSYS_POT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameEqualTo(String value) {
            addCriterion("CSYS_POT_NAME =", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <>", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThan(String value) {
            addCriterion("CSYS_POT_NAME >", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME >=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThan(String value) {
            addCriterion("CSYS_POT_NAME <", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_NAME <=", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameLike(String value) {
            addCriterion("CSYS_POT_NAME like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotLike(String value) {
            addCriterion("CSYS_POT_NAME not like", value, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameIn(List<String> values) {
            addCriterion("CSYS_POT_NAME in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotIn(List<String> values) {
            addCriterion("CSYS_POT_NAME not in", values, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysPotNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_NAME not between", value1, value2, "csysPotName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIsNull() {
            addCriterion("CSYS_WORKFLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIsNotNull() {
            addCriterion("CSYS_WORKFLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID =", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID <>", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_ID >", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID >=", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_ID <", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_ID <=", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdLike(String value) {
            addCriterion("CSYS_WORKFLOW_ID like", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_ID not like", value, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ID in", values, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_ID not in", values, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ID between", value1, value2, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_ID not between", value1, value2, "csysWorkflowId");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameIsNull() {
            addCriterion("CSYS_WORKFLOW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameIsNotNull() {
            addCriterion("CSYS_WORKFLOW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME =", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <>", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_NAME >", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME >=", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_NAME <=", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameLike(String value) {
            addCriterion("CSYS_WORKFLOW_NAME like", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_NAME not like", value, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_NAME in", values, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_NAME not in", values, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_NAME between", value1, value2, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_NAME not between", value1, value2, "csysWorkflowName");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableIsNull() {
            addCriterion("CSYS_POT_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableIsNotNull() {
            addCriterion("CSYS_POT_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableEqualTo(String value) {
            addCriterion("CSYS_POT_TABLE =", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableNotEqualTo(String value) {
            addCriterion("CSYS_POT_TABLE <>", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableGreaterThan(String value) {
            addCriterion("CSYS_POT_TABLE >", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TABLE >=", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableLessThan(String value) {
            addCriterion("CSYS_POT_TABLE <", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TABLE <=", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableLike(String value) {
            addCriterion("CSYS_POT_TABLE like", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableNotLike(String value) {
            addCriterion("CSYS_POT_TABLE not like", value, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableIn(List<String> values) {
            addCriterion("CSYS_POT_TABLE in", values, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableNotIn(List<String> values) {
            addCriterion("CSYS_POT_TABLE not in", values, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TABLE between", value1, value2, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTableNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TABLE not between", value1, value2, "csysPotTable");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeIsNull() {
            addCriterion("CSYS_POT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeIsNotNull() {
            addCriterion("CSYS_POT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeEqualTo(String value) {
            addCriterion("CSYS_POT_TYPE =", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeNotEqualTo(String value) {
            addCriterion("CSYS_POT_TYPE <>", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeGreaterThan(String value) {
            addCriterion("CSYS_POT_TYPE >", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TYPE >=", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeLessThan(String value) {
            addCriterion("CSYS_POT_TYPE <", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_TYPE <=", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeLike(String value) {
            addCriterion("CSYS_POT_TYPE like", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeNotLike(String value) {
            addCriterion("CSYS_POT_TYPE not like", value, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeIn(List<String> values) {
            addCriterion("CSYS_POT_TYPE in", values, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeNotIn(List<String> values) {
            addCriterion("CSYS_POT_TYPE not in", values, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TYPE between", value1, value2, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_TYPE not between", value1, value2, "csysPotType");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeIsNull() {
            addCriterion("CSYS_POT_ATRRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeIsNotNull() {
            addCriterion("CSYS_POT_ATRRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeEqualTo(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE =", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeNotEqualTo(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE <>", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeGreaterThan(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE >", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE >=", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeLessThan(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE <", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE <=", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeLike(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE like", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeNotLike(String value) {
            addCriterion("CSYS_POT_ATRRIBUTE not like", value, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeIn(List<String> values) {
            addCriterion("CSYS_POT_ATRRIBUTE in", values, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeNotIn(List<String> values) {
            addCriterion("CSYS_POT_ATRRIBUTE not in", values, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ATRRIBUTE between", value1, value2, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotAtrributeNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_ATRRIBUTE not between", value1, value2, "csysPotAtrribute");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescIsNull() {
            addCriterion("CSYS_POT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescIsNotNull() {
            addCriterion("CSYS_POT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescEqualTo(String value) {
            addCriterion("CSYS_POT_DESC =", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescNotEqualTo(String value) {
            addCriterion("CSYS_POT_DESC <>", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescGreaterThan(String value) {
            addCriterion("CSYS_POT_DESC >", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_DESC >=", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescLessThan(String value) {
            addCriterion("CSYS_POT_DESC <", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_DESC <=", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescLike(String value) {
            addCriterion("CSYS_POT_DESC like", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescNotLike(String value) {
            addCriterion("CSYS_POT_DESC not like", value, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescIn(List<String> values) {
            addCriterion("CSYS_POT_DESC in", values, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescNotIn(List<String> values) {
            addCriterion("CSYS_POT_DESC not in", values, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescBetween(String value1, String value2) {
            addCriterion("CSYS_POT_DESC between", value1, value2, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_DESC not between", value1, value2, "csysPotDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeIsNull() {
            addCriterion("CSYS_POT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeIsNotNull() {
            addCriterion("CSYS_POT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME =", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME <>", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME >", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME >=", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeLessThan(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME <", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_CREATE_TIME <=", value, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_CREATE_TIME in", values, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_CREATE_TIME not in", values, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_CREATE_TIME between", value1, value2, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_CREATE_TIME not between", value1, value2, "csysPotCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserIsNull() {
            addCriterion("CSYS_POT_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserIsNotNull() {
            addCriterion("CSYS_POT_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserEqualTo(String value) {
            addCriterion("CSYS_POT_CREATE_USER =", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_CREATE_USER <>", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserGreaterThan(String value) {
            addCriterion("CSYS_POT_CREATE_USER >", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CREATE_USER >=", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserLessThan(String value) {
            addCriterion("CSYS_POT_CREATE_USER <", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_CREATE_USER <=", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserLike(String value) {
            addCriterion("CSYS_POT_CREATE_USER like", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserNotLike(String value) {
            addCriterion("CSYS_POT_CREATE_USER not like", value, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserIn(List<String> values) {
            addCriterion("CSYS_POT_CREATE_USER in", values, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_CREATE_USER not in", values, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CREATE_USER between", value1, value2, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_CREATE_USER not between", value1, value2, "csysPotCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeIsNull() {
            addCriterion("CSYS_POT_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeIsNotNull() {
            addCriterion("CSYS_POT_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME =", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME <>", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME >", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME >=", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeLessThan(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME <", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_MODIFY_TIME <=", value, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_MODIFY_TIME in", values, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_MODIFY_TIME not in", values, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_MODIFY_TIME between", value1, value2, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_MODIFY_TIME not between", value1, value2, "csysPotModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserIsNull() {
            addCriterion("CSYS_POT_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserIsNotNull() {
            addCriterion("CSYS_POT_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserEqualTo(String value) {
            addCriterion("CSYS_POT_MODIFY_USER =", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_POT_MODIFY_USER <>", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserGreaterThan(String value) {
            addCriterion("CSYS_POT_MODIFY_USER >", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_MODIFY_USER >=", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserLessThan(String value) {
            addCriterion("CSYS_POT_MODIFY_USER <", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_MODIFY_USER <=", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserLike(String value) {
            addCriterion("CSYS_POT_MODIFY_USER like", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserNotLike(String value) {
            addCriterion("CSYS_POT_MODIFY_USER not like", value, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserIn(List<String> values) {
            addCriterion("CSYS_POT_MODIFY_USER in", values, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_POT_MODIFY_USER not in", values, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_POT_MODIFY_USER between", value1, value2, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_MODIFY_USER not between", value1, value2, "csysPotModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteIsNull() {
            addCriterion("CSYS_POT_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteIsNotNull() {
            addCriterion("CSYS_POT_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteEqualTo(String value) {
            addCriterion("CSYS_POT_IS_DELETE =", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_POT_IS_DELETE <>", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_POT_IS_DELETE >", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_DELETE >=", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteLessThan(String value) {
            addCriterion("CSYS_POT_IS_DELETE <", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_DELETE <=", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteLike(String value) {
            addCriterion("CSYS_POT_IS_DELETE like", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteNotLike(String value) {
            addCriterion("CSYS_POT_IS_DELETE not like", value, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteIn(List<String> values) {
            addCriterion("CSYS_POT_IS_DELETE in", values, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_POT_IS_DELETE not in", values, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_DELETE between", value1, value2, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_DELETE not between", value1, value2, "csysPotIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeIsNull() {
            addCriterion("CSYS_POT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeIsNotNull() {
            addCriterion("CSYS_POT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeEqualTo(Date value) {
            addCriterion("CSYS_POT_TIME =", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeNotEqualTo(Date value) {
            addCriterion("CSYS_POT_TIME <>", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeGreaterThan(Date value) {
            addCriterion("CSYS_POT_TIME >", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TIME >=", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeLessThan(Date value) {
            addCriterion("CSYS_POT_TIME <", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_TIME <=", value, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeIn(List<Date> values) {
            addCriterion("CSYS_POT_TIME in", values, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeNotIn(List<Date> values) {
            addCriterion("CSYS_POT_TIME not in", values, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TIME between", value1, value2, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_TIME not between", value1, value2, "csysPotTime");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateIsNull() {
            addCriterion("CSYS_POT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateIsNotNull() {
            addCriterion("CSYS_POT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateEqualTo(Date value) {
            addCriterion("CSYS_POT_DATE =", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateNotEqualTo(Date value) {
            addCriterion("CSYS_POT_DATE <>", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateGreaterThan(Date value) {
            addCriterion("CSYS_POT_DATE >", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_DATE >=", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateLessThan(Date value) {
            addCriterion("CSYS_POT_DATE <", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_POT_DATE <=", value, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateIn(List<Date> values) {
            addCriterion("CSYS_POT_DATE in", values, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateNotIn(List<Date> values) {
            addCriterion("CSYS_POT_DATE not in", values, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_DATE between", value1, value2, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_POT_DATE not between", value1, value2, "csysPotDate");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdIsNull() {
            addCriterion("CSYS_POT_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdIsNotNull() {
            addCriterion("CSYS_POT_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID =", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID <>", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdGreaterThan(String value) {
            addCriterion("CSYS_POT_GROUP_ID >", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID >=", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLessThan(String value) {
            addCriterion("CSYS_POT_GROUP_ID <", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_GROUP_ID <=", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdLike(String value) {
            addCriterion("CSYS_POT_GROUP_ID like", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotLike(String value) {
            addCriterion("CSYS_POT_GROUP_ID not like", value, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_ID in", values, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_GROUP_ID not in", values, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_ID between", value1, value2, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotGroupIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_GROUP_ID not between", value1, value2, "csysPotGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIsNull() {
            addCriterion("CSYS_POT_STYLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIsNotNull() {
            addCriterion("CSYS_POT_STYLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID =", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <>", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID >", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID >=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThan(String value) {
            addCriterion("CSYS_POT_STYLE_ID <", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_STYLE_ID <=", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotLike(String value) {
            addCriterion("CSYS_POT_STYLE_ID not like", value, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotIn(List<String> values) {
            addCriterion("CSYS_POT_STYLE_ID not in", values, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotStyleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_STYLE_ID not between", value1, value2, "csysPotStyleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIsNull() {
            addCriterion("CSYS_TRS_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIsNotNull() {
            addCriterion("CSYS_TRS_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID =", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID <>", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdGreaterThan(String value) {
            addCriterion("CSYS_TRS_RULE_ID >", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID >=", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLessThan(String value) {
            addCriterion("CSYS_TRS_RULE_ID <", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_TRS_RULE_ID <=", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdLike(String value) {
            addCriterion("CSYS_TRS_RULE_ID like", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotLike(String value) {
            addCriterion("CSYS_TRS_RULE_ID not like", value, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ID in", values, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotIn(List<String> values) {
            addCriterion("CSYS_TRS_RULE_ID not in", values, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ID between", value1, value2, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysTrsRuleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_TRS_RULE_ID not between", value1, value2, "csysTrsRuleId");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteIsNull() {
            addCriterion("CSYS_POT_IS_EXCRETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteIsNotNull() {
            addCriterion("CSYS_POT_IS_EXCRETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteEqualTo(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE =", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteNotEqualTo(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE <>", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteGreaterThan(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE >", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE >=", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteLessThan(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE <", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE <=", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteLike(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE like", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteNotLike(String value) {
            addCriterion("CSYS_POT_IS_EXCRETE not like", value, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteIn(List<String> values) {
            addCriterion("CSYS_POT_IS_EXCRETE in", values, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteNotIn(List<String> values) {
            addCriterion("CSYS_POT_IS_EXCRETE not in", values, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_EXCRETE between", value1, value2, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsExcreteNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_EXCRETE not between", value1, value2, "csysPotIsExcrete");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceIsNull() {
            addCriterion("CSYS_POT_IS_FIRST_PIECE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceIsNotNull() {
            addCriterion("CSYS_POT_IS_FIRST_PIECE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceEqualTo(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE =", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceNotEqualTo(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE <>", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceGreaterThan(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE >", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE >=", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceLessThan(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE <", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceLessThanOrEqualTo(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE <=", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceLike(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE like", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceNotLike(String value) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE not like", value, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceIn(List<String> values) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE in", values, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceNotIn(List<String> values) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE not in", values, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE between", value1, value2, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotIsFirstPieceNotBetween(String value1, String value2) {
            addCriterion("CSYS_POT_IS_FIRST_PIECE not between", value1, value2, "csysPotIsFirstPiece");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortIsNull() {
            addCriterion("CSYS_POT_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortIsNotNull() {
            addCriterion("CSYS_POT_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortEqualTo(Short value) {
            addCriterion("CSYS_POT_SORT =", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortNotEqualTo(Short value) {
            addCriterion("CSYS_POT_SORT <>", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortGreaterThan(Short value) {
            addCriterion("CSYS_POT_SORT >", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortGreaterThanOrEqualTo(Short value) {
            addCriterion("CSYS_POT_SORT >=", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortLessThan(Short value) {
            addCriterion("CSYS_POT_SORT <", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortLessThanOrEqualTo(Short value) {
            addCriterion("CSYS_POT_SORT <=", value, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortIn(List<Short> values) {
            addCriterion("CSYS_POT_SORT in", values, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortNotIn(List<Short> values) {
            addCriterion("CSYS_POT_SORT not in", values, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortBetween(Short value1, Short value2) {
            addCriterion("CSYS_POT_SORT between", value1, value2, "csysPotSort");
            return (Criteria) this;
        }

        public Criteria andCsysPotSortNotBetween(Short value1, Short value2) {
            addCriterion("CSYS_POT_SORT not between", value1, value2, "csysPotSort");
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