package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPageExample() {
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

        public Criteria andCsysPageLayoutIdIsNull() {
            addCriterion("CSYS_PAGE_LAYOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdIsNotNull() {
            addCriterion("CSYS_PAGE_LAYOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID =", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <>", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID >", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID >=", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLessThan(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID <=", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID like", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotLike(String value) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not like", value, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_ID in", values, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not in", values, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_ID between", value1, value2, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageLayoutIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_LAYOUT_ID not between", value1, value2, "csysPageLayoutId");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortIsNull() {
            addCriterion("CSYS_PAGE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortIsNotNull() {
            addCriterion("CSYS_PAGE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_SORT =", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortNotEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_SORT <>", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortGreaterThan(Integer value) {
            addCriterion("CSYS_PAGE_SORT >", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_SORT >=", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortLessThan(Integer value) {
            addCriterion("CSYS_PAGE_SORT <", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_PAGE_SORT <=", value, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortIn(List<Integer> values) {
            addCriterion("CSYS_PAGE_SORT in", values, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortNotIn(List<Integer> values) {
            addCriterion("CSYS_PAGE_SORT not in", values, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_PAGE_SORT between", value1, value2, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageSortNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_PAGE_SORT not between", value1, value2, "csysPageSort");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathIsNull() {
            addCriterion("CSYS_PAGE_ROUTH_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathIsNotNull() {
            addCriterion("CSYS_PAGE_ROUTH_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathEqualTo(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH =", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH <>", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathGreaterThan(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH >", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH >=", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathLessThan(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH <", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH <=", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathLike(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH like", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathNotLike(String value) {
            addCriterion("CSYS_PAGE_ROUTH_PATH not like", value, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathIn(List<String> values) {
            addCriterion("CSYS_PAGE_ROUTH_PATH in", values, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_ROUTH_PATH not in", values, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ROUTH_PATH between", value1, value2, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageRouthPathNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ROUTH_PATH not between", value1, value2, "csysPageRouthPath");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorIsNull() {
            addCriterion("CSYS_PAGE_SELECTOR is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorIsNotNull() {
            addCriterion("CSYS_PAGE_SELECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorEqualTo(String value) {
            addCriterion("CSYS_PAGE_SELECTOR =", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_SELECTOR <>", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorGreaterThan(String value) {
            addCriterion("CSYS_PAGE_SELECTOR >", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_SELECTOR >=", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorLessThan(String value) {
            addCriterion("CSYS_PAGE_SELECTOR <", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_SELECTOR <=", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorLike(String value) {
            addCriterion("CSYS_PAGE_SELECTOR like", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorNotLike(String value) {
            addCriterion("CSYS_PAGE_SELECTOR not like", value, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorIn(List<String> values) {
            addCriterion("CSYS_PAGE_SELECTOR in", values, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_SELECTOR not in", values, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_SELECTOR between", value1, value2, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageSelectorNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_SELECTOR not between", value1, value2, "csysPageSelector");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusIsNull() {
            addCriterion("CSYS_PAGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusIsNotNull() {
            addCriterion("CSYS_PAGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusEqualTo(String value) {
            addCriterion("CSYS_PAGE_STATUS =", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_STATUS <>", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusGreaterThan(String value) {
            addCriterion("CSYS_PAGE_STATUS >", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_STATUS >=", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusLessThan(String value) {
            addCriterion("CSYS_PAGE_STATUS <", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_STATUS <=", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusLike(String value) {
            addCriterion("CSYS_PAGE_STATUS like", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusNotLike(String value) {
            addCriterion("CSYS_PAGE_STATUS not like", value, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusIn(List<String> values) {
            addCriterion("CSYS_PAGE_STATUS in", values, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_STATUS not in", values, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_STATUS between", value1, value2, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageStatusNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_STATUS not between", value1, value2, "csysPageStatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusIsNull() {
            addCriterion("CSYS_PAGE_GITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusIsNotNull() {
            addCriterion("CSYS_PAGE_GITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusEqualTo(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS =", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS <>", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS >", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS >=", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusLessThan(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS <", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS <=", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusLike(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS like", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusNotLike(String value) {
            addCriterion("CSYS_PAGE_GITSTATUS not like", value, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusIn(List<String> values) {
            addCriterion("CSYS_PAGE_GITSTATUS in", values, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GITSTATUS not in", values, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GITSTATUS between", value1, value2, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageGitstatusNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GITSTATUS not between", value1, value2, "csysPageGitstatus");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeIsNull() {
            addCriterion("CSYS_PAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeIsNotNull() {
            addCriterion("CSYS_PAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeEqualTo(String value) {
            addCriterion("CSYS_PAGE_TYPE =", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_TYPE <>", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeGreaterThan(String value) {
            addCriterion("CSYS_PAGE_TYPE >", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_TYPE >=", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeLessThan(String value) {
            addCriterion("CSYS_PAGE_TYPE <", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_TYPE <=", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeLike(String value) {
            addCriterion("CSYS_PAGE_TYPE like", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeNotLike(String value) {
            addCriterion("CSYS_PAGE_TYPE not like", value, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeIn(List<String> values) {
            addCriterion("CSYS_PAGE_TYPE in", values, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_TYPE not in", values, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_TYPE between", value1, value2, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_TYPE not between", value1, value2, "csysPageType");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeIsNull() {
            addCriterion("CSYS_PAGE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeIsNotNull() {
            addCriterion("CSYS_PAGE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME =", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME <>", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME >", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME >=", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME <", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_CREATE_TIME <=", value, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_CREATE_TIME in", values, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_CREATE_TIME not in", values, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_CREATE_TIME between", value1, value2, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_CREATE_TIME not between", value1, value2, "csysPageCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeIsNull() {
            addCriterion("CSYS_PAGE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeIsNotNull() {
            addCriterion("CSYS_PAGE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME =", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME <>", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME >", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME >=", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME <", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_MODIFY_TIME <=", value, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_MODIFY_TIME in", values, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_MODIFY_TIME not in", values, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_MODIFY_TIME between", value1, value2, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_MODIFY_TIME not between", value1, value2, "csysPageModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserIsNull() {
            addCriterion("CSYS_PAGE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserIsNotNull() {
            addCriterion("CSYS_PAGE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER =", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER <>", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER >", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER >=", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserLessThan(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER <", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER <=", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserLike(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER like", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserNotLike(String value) {
            addCriterion("CSYS_PAGE_CREATE_USER not like", value, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_CREATE_USER in", values, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_CREATE_USER not in", values, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_CREATE_USER between", value1, value2, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_CREATE_USER not between", value1, value2, "csysPageCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserIsNull() {
            addCriterion("CSYS_PAGE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserIsNotNull() {
            addCriterion("CSYS_PAGE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER =", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER <>", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER >", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER >=", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserLessThan(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER <", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER <=", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserLike(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER like", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserNotLike(String value) {
            addCriterion("CSYS_PAGE_MODIFY_USER not like", value, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_MODIFY_USER in", values, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_MODIFY_USER not in", values, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_MODIFY_USER between", value1, value2, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_MODIFY_USER not between", value1, value2, "csysPageModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteIsNull() {
            addCriterion("CSYS_PAGE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteIsNotNull() {
            addCriterion("CSYS_PAGE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE =", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE <>", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE >", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE >=", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteLessThan(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE <", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE <=", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteLike(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE like", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteNotLike(String value) {
            addCriterion("CSYS_PAGE_IS_DELETE not like", value, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PAGE_IS_DELETE in", values, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_IS_DELETE not in", values, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_IS_DELETE between", value1, value2, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_IS_DELETE not between", value1, value2, "csysPageIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameIsNull() {
            addCriterion("CSYS_PAGE_CODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameIsNotNull() {
            addCriterion("CSYS_PAGE_CODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameEqualTo(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME =", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME <>", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameGreaterThan(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME >", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME >=", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameLessThan(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME <", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME <=", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameLike(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME like", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameNotLike(String value) {
            addCriterion("CSYS_PAGE_CODE_NAME not like", value, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameIn(List<String> values) {
            addCriterion("CSYS_PAGE_CODE_NAME in", values, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_CODE_NAME not in", values, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_CODE_NAME between", value1, value2, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCsysPageCodeNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_CODE_NAME not between", value1, value2, "csysPageCodeName");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdIsNull() {
            addCriterion("CY_SYS_PAGE_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdIsNotNull() {
            addCriterion("CY_SYS_PAGE_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdEqualTo(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID =", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdNotEqualTo(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID <>", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdGreaterThan(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID >", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdGreaterThanOrEqualTo(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID >=", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdLessThan(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID <", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdLessThanOrEqualTo(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID <=", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdLike(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID like", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdNotLike(String value) {
            addCriterion("CY_SYS_PAGE_TEMP_ID not like", value, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdIn(List<String> values) {
            addCriterion("CY_SYS_PAGE_TEMP_ID in", values, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdNotIn(List<String> values) {
            addCriterion("CY_SYS_PAGE_TEMP_ID not in", values, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdBetween(String value1, String value2) {
            addCriterion("CY_SYS_PAGE_TEMP_ID between", value1, value2, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCySysPageTempIdNotBetween(String value1, String value2) {
            addCriterion("CY_SYS_PAGE_TEMP_ID not between", value1, value2, "cySysPageTempId");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeIsNull() {
            addCriterion("CSYS_PAGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeIsNotNull() {
            addCriterion("CSYS_PAGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_TIME =", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_TIME <>", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_TIME >", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_TIME >=", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_TIME <", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_TIME <=", value, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_TIME in", values, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_TIME not in", values, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_TIME between", value1, value2, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_TIME not between", value1, value2, "csysPageTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateIsNull() {
            addCriterion("CSYS_PAGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateIsNotNull() {
            addCriterion("CSYS_PAGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateEqualTo(Date value) {
            addCriterion("CSYS_PAGE_DATE =", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_DATE <>", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_DATE >", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_DATE >=", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateLessThan(Date value) {
            addCriterion("CSYS_PAGE_DATE <", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_DATE <=", value, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateIn(List<Date> values) {
            addCriterion("CSYS_PAGE_DATE in", values, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_DATE not in", values, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_DATE between", value1, value2, "csysPageDate");
            return (Criteria) this;
        }

        public Criteria andCsysPageDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_DATE not between", value1, value2, "csysPageDate");
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