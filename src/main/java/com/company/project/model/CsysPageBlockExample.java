package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPageBlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPageBlockExample() {
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

        public Criteria andCsysPageBlockIdIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID =", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID <>", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID >", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID >=", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID <", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID <=", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID like", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_ID not like", value, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_ID in", values, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_ID not in", values, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_ID between", value1, value2, "csysPageBlockId");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_ID not between", value1, value2, "csysPageBlockId");
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

        public Criteria andCsysPageNameIsNull() {
            addCriterion("CSYS_PAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIsNotNull() {
            addCriterion("CSYS_PAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME =", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <>", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThan(String value) {
            addCriterion("CSYS_PAGE_NAME >", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME >=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThan(String value) {
            addCriterion("CSYS_PAGE_NAME <", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLike(String value) {
            addCriterion("CSYS_PAGE_NAME like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotLike(String value) {
            addCriterion("CSYS_PAGE_NAME not like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME not in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME not between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescIsNull() {
            addCriterion("CSYS_PAGE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescIsNotNull() {
            addCriterion("CSYS_PAGE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescEqualTo(String value) {
            addCriterion("CSYS_PAGE_DESC =", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_DESC <>", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescGreaterThan(String value) {
            addCriterion("CSYS_PAGE_DESC >", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_DESC >=", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescLessThan(String value) {
            addCriterion("CSYS_PAGE_DESC <", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_DESC <=", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescLike(String value) {
            addCriterion("CSYS_PAGE_DESC like", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescNotLike(String value) {
            addCriterion("CSYS_PAGE_DESC not like", value, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescIn(List<String> values) {
            addCriterion("CSYS_PAGE_DESC in", values, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_DESC not in", values, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_DESC between", value1, value2, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_DESC not between", value1, value2, "csysPageDesc");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdIsNull() {
            addCriterion("CSYS_BLOCK_RUNTIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdIsNotNull() {
            addCriterion("CSYS_BLOCK_RUNTIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdEqualTo(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID =", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdNotEqualTo(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID <>", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdGreaterThan(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID >", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID >=", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdLessThan(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID <", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID <=", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdLike(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID like", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdNotLike(String value) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID not like", value, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdIn(List<String> values) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID in", values, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdNotIn(List<String> values) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID not in", values, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdBetween(String value1, String value2) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID between", value1, value2, "csysBlockRuntimeId");
            return (Criteria) this;
        }

        public Criteria andCsysBlockRuntimeIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_BLOCK_RUNTIME_ID not between", value1, value2, "csysBlockRuntimeId");
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

        public Criteria andCsysWorkflowTypeIsNull() {
            addCriterion("CSYS_WORKFLOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeIsNotNull() {
            addCriterion("CSYS_WORKFLOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE =", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <>", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeGreaterThan(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE >", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE >=", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLessThan(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE <=", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeLike(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE like", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotLike(String value) {
            addCriterion("CSYS_WORKFLOW_TYPE not like", value, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_TYPE in", values, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotIn(List<String> values) {
            addCriterion("CSYS_WORKFLOW_TYPE not in", values, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_TYPE between", value1, value2, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCsysWorkflowTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_WORKFLOW_TYPE not between", value1, value2, "csysWorkflowType");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIsNull() {
            addCriterion("CY_SYS_BLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIsNotNull() {
            addCriterion("CY_SYS_BLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID =", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID <>", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_ID >", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID >=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_ID <", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_ID <=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLike(String value) {
            addCriterion("CY_SYS_BLOCK_ID like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_ID not like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_ID in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_ID not in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_ID between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_ID not between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIsNull() {
            addCriterion("CY_SYS_BLOCK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIsNotNull() {
            addCriterion("CY_SYS_BLOCK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_NAME =", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_NAME <>", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_NAME >", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_NAME >=", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_NAME <", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_NAME <=", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLike(String value) {
            addCriterion("CY_SYS_BLOCK_NAME like", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_NAME not like", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_NAME in", values, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_NAME not in", values, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_NAME between", value1, value2, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_NAME not between", value1, value2, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIsNull() {
            addCriterion("CY_SYS_BLOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIsNotNull() {
            addCriterion("CY_SYS_BLOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CODE =", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CODE <>", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_CODE >", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CODE >=", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_CODE <", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CODE <=", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLike(String value) {
            addCriterion("CY_SYS_BLOCK_CODE like", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_CODE not like", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CODE in", values, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CODE not in", values, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CODE between", value1, value2, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CODE not between", value1, value2, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdIsNull() {
            addCriterion("CY_SYS_BLOCK_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdIsNotNull() {
            addCriterion("CY_SYS_BLOCK_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID =", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID <>", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID >", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID >=", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID <", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID <=", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdLike(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID like", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID not like", value, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID in", values, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID not in", values, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID between", value1, value2, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockParentIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_PARENT_ID not between", value1, value2, "cySysBlockParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIsNull() {
            addCriterion("CY_SYS_BLOCK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIsNotNull() {
            addCriterion("CY_SYS_BLOCK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL =", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL <>", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL >", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL >=", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL <", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL <=", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLike(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL like", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_LEVEL not like", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_LEVEL in", values, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_LEVEL not in", values, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_LEVEL between", value1, value2, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_LEVEL not between", value1, value2, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdIsNull() {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdIsNotNull() {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID =", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID <>", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID >", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID >=", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID <", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID <=", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLike(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID like", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID not like", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID in", values, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID not in", values, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID between", value1, value2, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_ID not between", value1, value2, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIsNull() {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIsNotNull() {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME =", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME <>", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameGreaterThan(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME >", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME >=", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLessThan(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME <", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME <=", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLike(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME like", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotLike(String value) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME not like", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME in", values, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotIn(List<String> values) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME not in", values, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME between", value1, value2, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_BLOCK_CATEGORY_NAME not between", value1, value2, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY =", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY <>", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY >", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY >=", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY <", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY <=", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY like", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY not like", value, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY in", values, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY not in", values, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY between", value1, value2, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsAuthorityNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_AUTHORITY not between", value1, value2, "csysPageBlockIsAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY =", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY <>", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY >", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY >=", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY <", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY <=", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY like", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY not like", value, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY in", values, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY not in", values, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY between", value1, value2, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockAuthorityNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_AUTHORITY not between", value1, value2, "csysPageBlockAuthority");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN =", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN <>", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN >", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN >=", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN <", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN <=", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN like", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN not like", value, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN in", values, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN not in", values, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN between", value1, value2, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsMainNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_MAIN not between", value1, value2, "csysPageBlockIsMain");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT =", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortNotEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT <>", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortGreaterThan(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT >", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT >=", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortLessThan(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT <", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_BLOCK_SORT <=", value, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortIn(List<Integer> values) {
            addCriterion("CSYS_PAGE_BLOCK_SORT in", values, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortNotIn(List<Integer> values) {
            addCriterion("CSYS_PAGE_BLOCK_SORT not in", values, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_PAGE_BLOCK_SORT between", value1, value2, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockSortNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_PAGE_BLOCK_SORT not between", value1, value2, "csysPageBlockSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_API is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_API is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API =", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API <>", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API >", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API >=", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API <", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API <=", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API like", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_API not like", value, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_API in", values, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_API not in", values, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_API between", value1, value2, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockApiNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_API not between", value1, value2, "csysPageBlockApi");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER =", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER <>", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER >", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER >=", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER <", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER <=", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER like", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER not like", value, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER in", values, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER not in", values, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER between", value1, value2, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_USER not between", value1, value2, "csysPageBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER =", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER <>", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER >", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER >=", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER <", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER <=", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER like", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER not like", value, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER in", values, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER not in", values, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER between", value1, value2, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_USER not between", value1, value2, "csysPageBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME =", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME <>", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME >", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME >=", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME <", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME <=", value, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME in", values, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME not in", values, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME between", value1, value2, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_CREATE_TIME not between", value1, value2, "csysPageBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME =", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME <>", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME >", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME >=", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME <", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME <=", value, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME in", values, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME not in", values, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME between", value1, value2, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_MODIFY_TIME not between", value1, value2, "csysPageBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE =", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE <>", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE >", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE >=", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteLessThan(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE <", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE <=", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE like", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteNotLike(String value) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE not like", value, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE in", values, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE not in", values, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE between", value1, value2, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_BLOCK_IS_DELETE not between", value1, value2, "csysPageBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE =", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE <>", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE >", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE >=", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateLessThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE <", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_DATE <=", value, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_DATE in", values, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_DATE not in", values, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_DATE between", value1, value2, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_DATE not between", value1, value2, "csysPageBlockDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeIsNull() {
            addCriterion("CSYS_PAGE_BLOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeIsNotNull() {
            addCriterion("CSYS_PAGE_BLOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME =", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME <>", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME >", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME >=", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME <", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_BLOCK_TIME <=", value, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_TIME in", values, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_BLOCK_TIME not in", values, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_TIME between", value1, value2, "csysPageBlockTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageBlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_BLOCK_TIME not between", value1, value2, "csysPageBlockTime");
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