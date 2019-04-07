package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysMenuAuthViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysMenuAuthViewExample() {
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

        public Criteria andCsysMenuIdIsNull() {
            addCriterion("CSYS_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdIsNotNull() {
            addCriterion("CSYS_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdEqualTo(String value) {
            addCriterion("CSYS_MENU_ID =", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotEqualTo(String value) {
            addCriterion("CSYS_MENU_ID <>", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdGreaterThan(String value) {
            addCriterion("CSYS_MENU_ID >", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ID >=", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLessThan(String value) {
            addCriterion("CSYS_MENU_ID <", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ID <=", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLike(String value) {
            addCriterion("CSYS_MENU_ID like", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotLike(String value) {
            addCriterion("CSYS_MENU_ID not like", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdIn(List<String> values) {
            addCriterion("CSYS_MENU_ID in", values, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotIn(List<String> values) {
            addCriterion("CSYS_MENU_ID not in", values, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ID between", value1, value2, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ID not between", value1, value2, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIsNull() {
            addCriterion("CSYS_MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIsNotNull() {
            addCriterion("CSYS_MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME =", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME <>", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameGreaterThan(String value) {
            addCriterion("CSYS_MENU_NAME >", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME >=", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLessThan(String value) {
            addCriterion("CSYS_MENU_NAME <", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME <=", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLike(String value) {
            addCriterion("CSYS_MENU_NAME like", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotLike(String value) {
            addCriterion("CSYS_MENU_NAME not like", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIn(List<String> values) {
            addCriterion("CSYS_MENU_NAME in", values, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotIn(List<String> values) {
            addCriterion("CSYS_MENU_NAME not in", values, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_NAME between", value1, value2, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_NAME not between", value1, value2, "csysMenuName");
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

        public Criteria andCsysMenuParentIdIsNull() {
            addCriterion("CSYS_MENU_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdIsNotNull() {
            addCriterion("CSYS_MENU_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdEqualTo(String value) {
            addCriterion("CSYS_MENU_PARENT_ID =", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdNotEqualTo(String value) {
            addCriterion("CSYS_MENU_PARENT_ID <>", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdGreaterThan(String value) {
            addCriterion("CSYS_MENU_PARENT_ID >", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_PARENT_ID >=", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdLessThan(String value) {
            addCriterion("CSYS_MENU_PARENT_ID <", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_PARENT_ID <=", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdLike(String value) {
            addCriterion("CSYS_MENU_PARENT_ID like", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdNotLike(String value) {
            addCriterion("CSYS_MENU_PARENT_ID not like", value, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdIn(List<String> values) {
            addCriterion("CSYS_MENU_PARENT_ID in", values, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdNotIn(List<String> values) {
            addCriterion("CSYS_MENU_PARENT_ID not in", values, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_PARENT_ID between", value1, value2, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuParentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_PARENT_ID not between", value1, value2, "csysMenuParentId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndIsNull() {
            addCriterion("CSYS_MENU_IS_END is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndIsNotNull() {
            addCriterion("CSYS_MENU_IS_END is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_END =", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndNotEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_END <>", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndGreaterThan(String value) {
            addCriterion("CSYS_MENU_IS_END >", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_END >=", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndLessThan(String value) {
            addCriterion("CSYS_MENU_IS_END <", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_END <=", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndLike(String value) {
            addCriterion("CSYS_MENU_IS_END like", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndNotLike(String value) {
            addCriterion("CSYS_MENU_IS_END not like", value, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_END in", values, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndNotIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_END not in", values, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_END between", value1, value2, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsEndNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_END not between", value1, value2, "csysMenuIsEnd");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineIsNull() {
            addCriterion("CSYS_MENU_IS_OUTLINE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineIsNotNull() {
            addCriterion("CSYS_MENU_IS_OUTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE =", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineNotEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE <>", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineGreaterThan(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE >", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE >=", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineLessThan(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE <", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE <=", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineLike(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE like", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineNotLike(String value) {
            addCriterion("CSYS_MENU_IS_OUTLINE not like", value, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_OUTLINE in", values, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineNotIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_OUTLINE not in", values, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_OUTLINE between", value1, value2, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsOutlineNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_OUTLINE not between", value1, value2, "csysMenuIsOutline");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcIsNull() {
            addCriterion("CSYS_MENU_SRC is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcIsNotNull() {
            addCriterion("CSYS_MENU_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcEqualTo(String value) {
            addCriterion("CSYS_MENU_SRC =", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcNotEqualTo(String value) {
            addCriterion("CSYS_MENU_SRC <>", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcGreaterThan(String value) {
            addCriterion("CSYS_MENU_SRC >", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_SRC >=", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcLessThan(String value) {
            addCriterion("CSYS_MENU_SRC <", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_SRC <=", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcLike(String value) {
            addCriterion("CSYS_MENU_SRC like", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcNotLike(String value) {
            addCriterion("CSYS_MENU_SRC not like", value, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcIn(List<String> values) {
            addCriterion("CSYS_MENU_SRC in", values, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcNotIn(List<String> values) {
            addCriterion("CSYS_MENU_SRC not in", values, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_SRC between", value1, value2, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSrcNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_SRC not between", value1, value2, "csysMenuSrc");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclIsNull() {
            addCriterion("CSYS_MENU_ACL is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclIsNotNull() {
            addCriterion("CSYS_MENU_ACL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclEqualTo(String value) {
            addCriterion("CSYS_MENU_ACL =", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclNotEqualTo(String value) {
            addCriterion("CSYS_MENU_ACL <>", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclGreaterThan(String value) {
            addCriterion("CSYS_MENU_ACL >", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ACL >=", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclLessThan(String value) {
            addCriterion("CSYS_MENU_ACL <", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ACL <=", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclLike(String value) {
            addCriterion("CSYS_MENU_ACL like", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclNotLike(String value) {
            addCriterion("CSYS_MENU_ACL not like", value, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclIn(List<String> values) {
            addCriterion("CSYS_MENU_ACL in", values, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclNotIn(List<String> values) {
            addCriterion("CSYS_MENU_ACL not in", values, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ACL between", value1, value2, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAclNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ACL not between", value1, value2, "csysMenuAcl");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkIsNull() {
            addCriterion("CSYS_MENU_IS_NEED_MARK is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkIsNotNull() {
            addCriterion("CSYS_MENU_IS_NEED_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK =", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkNotEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK <>", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkGreaterThan(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK >", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK >=", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkLessThan(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK <", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK <=", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkLike(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK like", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkNotLike(String value) {
            addCriterion("CSYS_MENU_IS_NEED_MARK not like", value, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_NEED_MARK in", values, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkNotIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_NEED_MARK not in", values, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_NEED_MARK between", value1, value2, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsNeedMarkNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_NEED_MARK not between", value1, value2, "csysMenuIsNeedMark");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoIsNull() {
            addCriterion("CSYS_MENU_MENO is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoIsNotNull() {
            addCriterion("CSYS_MENU_MENO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoEqualTo(String value) {
            addCriterion("CSYS_MENU_MENO =", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoNotEqualTo(String value) {
            addCriterion("CSYS_MENU_MENO <>", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoGreaterThan(String value) {
            addCriterion("CSYS_MENU_MENO >", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_MENO >=", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoLessThan(String value) {
            addCriterion("CSYS_MENU_MENO <", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_MENO <=", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoLike(String value) {
            addCriterion("CSYS_MENU_MENO like", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoNotLike(String value) {
            addCriterion("CSYS_MENU_MENO not like", value, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoIn(List<String> values) {
            addCriterion("CSYS_MENU_MENO in", values, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoNotIn(List<String> values) {
            addCriterion("CSYS_MENU_MENO not in", values, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_MENO between", value1, value2, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuMenoNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_MENO not between", value1, value2, "csysMenuMeno");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockIsNull() {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockIsNotNull() {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockEqualTo(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK =", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockNotEqualTo(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK <>", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockGreaterThan(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK >", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK >=", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockLessThan(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK <", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK <=", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockLike(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK like", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockNotLike(String value) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK not like", value, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockIn(List<String> values) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK in", values, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockNotIn(List<String> values) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK not in", values, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK between", value1, value2, "csysMenuFlowNoticeBlock");
            return (Criteria) this;
        }

        public Criteria andCsysMenuFlowNoticeBlockNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_FLOW_NOTICE_BLOCK not between", value1, value2, "csysMenuFlowNoticeBlock");
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

        public Criteria andCsysMenuIconIsNull() {
            addCriterion("CSYS_MENU_ICON is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconIsNotNull() {
            addCriterion("CSYS_MENU_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconEqualTo(String value) {
            addCriterion("CSYS_MENU_ICON =", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconNotEqualTo(String value) {
            addCriterion("CSYS_MENU_ICON <>", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconGreaterThan(String value) {
            addCriterion("CSYS_MENU_ICON >", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ICON >=", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconLessThan(String value) {
            addCriterion("CSYS_MENU_ICON <", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ICON <=", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconLike(String value) {
            addCriterion("CSYS_MENU_ICON like", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconNotLike(String value) {
            addCriterion("CSYS_MENU_ICON not like", value, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconIn(List<String> values) {
            addCriterion("CSYS_MENU_ICON in", values, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconNotIn(List<String> values) {
            addCriterion("CSYS_MENU_ICON not in", values, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ICON between", value1, value2, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIconNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ICON not between", value1, value2, "csysMenuIcon");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortIsNull() {
            addCriterion("CSYS_MENU_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortIsNotNull() {
            addCriterion("CSYS_MENU_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortEqualTo(Integer value) {
            addCriterion("CSYS_MENU_SORT =", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortNotEqualTo(Integer value) {
            addCriterion("CSYS_MENU_SORT <>", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortGreaterThan(Integer value) {
            addCriterion("CSYS_MENU_SORT >", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_MENU_SORT >=", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortLessThan(Integer value) {
            addCriterion("CSYS_MENU_SORT <", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_MENU_SORT <=", value, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortIn(List<Integer> values) {
            addCriterion("CSYS_MENU_SORT in", values, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortNotIn(List<Integer> values) {
            addCriterion("CSYS_MENU_SORT not in", values, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_MENU_SORT between", value1, value2, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_MENU_SORT not between", value1, value2, "csysMenuSort");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusIsNull() {
            addCriterion("CSYS_MENU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusIsNotNull() {
            addCriterion("CSYS_MENU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusEqualTo(String value) {
            addCriterion("CSYS_MENU_STATUS =", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusNotEqualTo(String value) {
            addCriterion("CSYS_MENU_STATUS <>", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusGreaterThan(String value) {
            addCriterion("CSYS_MENU_STATUS >", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_STATUS >=", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusLessThan(String value) {
            addCriterion("CSYS_MENU_STATUS <", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_STATUS <=", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusLike(String value) {
            addCriterion("CSYS_MENU_STATUS like", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusNotLike(String value) {
            addCriterion("CSYS_MENU_STATUS not like", value, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusIn(List<String> values) {
            addCriterion("CSYS_MENU_STATUS in", values, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusNotIn(List<String> values) {
            addCriterion("CSYS_MENU_STATUS not in", values, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_STATUS between", value1, value2, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuStatusNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_STATUS not between", value1, value2, "csysMenuStatus");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeIsNull() {
            addCriterion("CSYS_MENU_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeIsNotNull() {
            addCriterion("CSYS_MENU_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME =", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME <>", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME >", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME >=", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME <", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_CREATE_TIME <=", value, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_CREATE_TIME in", values, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_CREATE_TIME not in", values, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_CREATE_TIME between", value1, value2, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_CREATE_TIME not between", value1, value2, "csysMenuCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeIsNull() {
            addCriterion("CSYS_MENU_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeIsNotNull() {
            addCriterion("CSYS_MENU_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME =", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME <>", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME >", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME >=", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME <", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_MODIFY_TIME <=", value, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_MODIFY_TIME in", values, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_MODIFY_TIME not in", values, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_MODIFY_TIME between", value1, value2, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_MODIFY_TIME not between", value1, value2, "csysMenuModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserIsNull() {
            addCriterion("CSYS_MENU_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserIsNotNull() {
            addCriterion("CSYS_MENU_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserEqualTo(String value) {
            addCriterion("CSYS_MENU_CREATE_USER =", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_CREATE_USER <>", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_CREATE_USER >", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_CREATE_USER >=", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserLessThan(String value) {
            addCriterion("CSYS_MENU_CREATE_USER <", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_CREATE_USER <=", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserLike(String value) {
            addCriterion("CSYS_MENU_CREATE_USER like", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserNotLike(String value) {
            addCriterion("CSYS_MENU_CREATE_USER not like", value, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserIn(List<String> values) {
            addCriterion("CSYS_MENU_CREATE_USER in", values, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_CREATE_USER not in", values, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_CREATE_USER between", value1, value2, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_CREATE_USER not between", value1, value2, "csysMenuCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserIsNull() {
            addCriterion("CSYS_MENU_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserIsNotNull() {
            addCriterion("CSYS_MENU_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserEqualTo(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER =", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER <>", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER >", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER >=", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserLessThan(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER <", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER <=", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserLike(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER like", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserNotLike(String value) {
            addCriterion("CSYS_MENU_MODIFY_USER not like", value, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserIn(List<String> values) {
            addCriterion("CSYS_MENU_MODIFY_USER in", values, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_MODIFY_USER not in", values, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_MODIFY_USER between", value1, value2, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_MODIFY_USER not between", value1, value2, "csysMenuModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteIsNull() {
            addCriterion("CSYS_MENU_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteIsNotNull() {
            addCriterion("CSYS_MENU_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_DELETE =", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_DELETE <>", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_MENU_IS_DELETE >", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_DELETE >=", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteLessThan(String value) {
            addCriterion("CSYS_MENU_IS_DELETE <", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_IS_DELETE <=", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteLike(String value) {
            addCriterion("CSYS_MENU_IS_DELETE like", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteNotLike(String value) {
            addCriterion("CSYS_MENU_IS_DELETE not like", value, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_DELETE in", values, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_MENU_IS_DELETE not in", values, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_DELETE between", value1, value2, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_IS_DELETE not between", value1, value2, "csysMenuIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateIsNull() {
            addCriterion("CSYS_MENU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateIsNotNull() {
            addCriterion("CSYS_MENU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateEqualTo(Date value) {
            addCriterion("CSYS_MENU_DATE =", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_DATE <>", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateGreaterThan(Date value) {
            addCriterion("CSYS_MENU_DATE >", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_DATE >=", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateLessThan(Date value) {
            addCriterion("CSYS_MENU_DATE <", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_DATE <=", value, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateIn(List<Date> values) {
            addCriterion("CSYS_MENU_DATE in", values, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_DATE not in", values, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_DATE between", value1, value2, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_DATE not between", value1, value2, "csysMenuDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeIsNull() {
            addCriterion("CSYS_MENU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeIsNotNull() {
            addCriterion("CSYS_MENU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_TIME =", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_TIME <>", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_TIME >", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_TIME >=", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_TIME <", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_TIME <=", value, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_TIME in", values, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_TIME not in", values, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_TIME between", value1, value2, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_TIME not between", value1, value2, "csysMenuTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdIsNull() {
            addCriterion("CSYS_MENU_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID =", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <>", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_ID >", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID >=", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <=", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLike(String value) {
            addCriterion("CSYS_MENU_AUTH_ID like", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_ID not like", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_ID in", values, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_ID not in", values, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_ID between", value1, value2, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_ID not between", value1, value2, "csysMenuAuthId");
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

        public Criteria andCsysRoleNameIsNull() {
            addCriterion("CSYS_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameIsNotNull() {
            addCriterion("CSYS_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME =", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME <>", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameGreaterThan(String value) {
            addCriterion("CSYS_ROLE_NAME >", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME >=", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLessThan(String value) {
            addCriterion("CSYS_ROLE_NAME <", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME <=", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLike(String value) {
            addCriterion("CSYS_ROLE_NAME like", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotLike(String value) {
            addCriterion("CSYS_ROLE_NAME not like", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameIn(List<String> values) {
            addCriterion("CSYS_ROLE_NAME in", values, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_NAME not in", values, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_NAME between", value1, value2, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_NAME not between", value1, value2, "csysRoleName");
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

        public Criteria andCsysDepartmentNameIsNull() {
            addCriterion("CSYS_DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameIsNotNull() {
            addCriterion("CSYS_DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME =", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <>", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameGreaterThan(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME >", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME >=", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLessThan(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <=", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLike(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME like", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotLike(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME not like", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_NAME in", values, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_NAME not in", values, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_NAME between", value1, value2, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_NAME not between", value1, value2, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME =", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <>", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME >", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME >=", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <=", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME in", values, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME not in", values, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME between", value1, value2, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME not between", value1, value2, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIsNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER =", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <>", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER >", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER >=", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <=", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLike(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER like", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not like", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER in", values, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not in", values, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER between", value1, value2, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not between", value1, value2, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME =", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <>", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME >", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME >=", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <=", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME in", values, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME not in", values, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME between", value1, value2, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME not between", value1, value2, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIsNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER =", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <>", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER >", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER >=", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <=", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLike(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER like", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not like", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER in", values, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not in", values, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER between", value1, value2, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not between", value1, value2, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIsNull() {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE =", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <>", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE >", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE >=", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <=", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLike(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE like", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not like", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE in", values, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not in", values, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE between", value1, value2, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not between", value1, value2, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME =", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <>", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME >", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME >=", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <=", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_TIME in", values, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_TIME not in", values, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_TIME between", value1, value2, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_TIME not between", value1, value2, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIsNull() {
            addCriterion("CSYS_MENU_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE =", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <>", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE >", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE >=", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <=", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_DATE in", values, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_DATE not in", values, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_DATE between", value1, value2, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_DATE not between", value1, value2, "csysMenuAuthDate");
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