package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockCategoryExample() {
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

        public Criteria andCySysBlockCategoryIdIsNull() {
            addCriterion("cy_sys_block_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdIsNotNull() {
            addCriterion("cy_sys_block_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdEqualTo(String value) {
            addCriterion("cy_sys_block_category_id =", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_id <>", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdGreaterThan(String value) {
            addCriterion("cy_sys_block_category_id >", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_id >=", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLessThan(String value) {
            addCriterion("cy_sys_block_category_id <", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_id <=", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdLike(String value) {
            addCriterion("cy_sys_block_category_id like", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotLike(String value) {
            addCriterion("cy_sys_block_category_id not like", value, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdIn(List<String> values) {
            addCriterion("cy_sys_block_category_id in", values, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_id not in", values, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_id between", value1, value2, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_id not between", value1, value2, "cySysBlockCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIsNull() {
            addCriterion("cy_sys_block_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIsNotNull() {
            addCriterion("cy_sys_block_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameEqualTo(String value) {
            addCriterion("cy_sys_block_category_name =", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_name <>", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameGreaterThan(String value) {
            addCriterion("cy_sys_block_category_name >", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_name >=", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLessThan(String value) {
            addCriterion("cy_sys_block_category_name <", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_name <=", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameLike(String value) {
            addCriterion("cy_sys_block_category_name like", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotLike(String value) {
            addCriterion("cy_sys_block_category_name not like", value, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameIn(List<String> values) {
            addCriterion("cy_sys_block_category_name in", values, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_name not in", values, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_name between", value1, value2, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_name not between", value1, value2, "cySysBlockCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdIsNull() {
            addCriterion("cy_sys_block_category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdIsNotNull() {
            addCriterion("cy_sys_block_category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdEqualTo(String value) {
            addCriterion("cy_sys_block_category_parent_id =", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_parent_id <>", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdGreaterThan(String value) {
            addCriterion("cy_sys_block_category_parent_id >", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_parent_id >=", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdLessThan(String value) {
            addCriterion("cy_sys_block_category_parent_id <", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_parent_id <=", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdLike(String value) {
            addCriterion("cy_sys_block_category_parent_id like", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdNotLike(String value) {
            addCriterion("cy_sys_block_category_parent_id not like", value, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdIn(List<String> values) {
            addCriterion("cy_sys_block_category_parent_id in", values, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_parent_id not in", values, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_parent_id between", value1, value2, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryParentIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_parent_id not between", value1, value2, "cySysBlockCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceIsNull() {
            addCriterion("cy_sys_block_category_sence is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceIsNotNull() {
            addCriterion("cy_sys_block_category_sence is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceEqualTo(String value) {
            addCriterion("cy_sys_block_category_sence =", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_sence <>", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceGreaterThan(String value) {
            addCriterion("cy_sys_block_category_sence >", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_sence >=", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceLessThan(String value) {
            addCriterion("cy_sys_block_category_sence <", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_sence <=", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceLike(String value) {
            addCriterion("cy_sys_block_category_sence like", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceNotLike(String value) {
            addCriterion("cy_sys_block_category_sence not like", value, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceIn(List<String> values) {
            addCriterion("cy_sys_block_category_sence in", values, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_sence not in", values, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_sence between", value1, value2, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySenceNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_sence not between", value1, value2, "cySysBlockCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortIsNull() {
            addCriterion("cy_sys_block_category_sort is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortIsNotNull() {
            addCriterion("cy_sys_block_category_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortEqualTo(Integer value) {
            addCriterion("cy_sys_block_category_sort =", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortNotEqualTo(Integer value) {
            addCriterion("cy_sys_block_category_sort <>", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortGreaterThan(Integer value) {
            addCriterion("cy_sys_block_category_sort >", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_block_category_sort >=", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortLessThan(Integer value) {
            addCriterion("cy_sys_block_category_sort <", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortLessThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_block_category_sort <=", value, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortIn(List<Integer> values) {
            addCriterion("cy_sys_block_category_sort in", values, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortNotIn(List<Integer> values) {
            addCriterion("cy_sys_block_category_sort not in", values, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_block_category_sort between", value1, value2, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategorySortNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_block_category_sort not between", value1, value2, "cySysBlockCategorySort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeIsNull() {
            addCriterion("cy_sys_block_category_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeIsNotNull() {
            addCriterion("cy_sys_block_category_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_category_create_time =", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_category_create_time <>", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_category_create_time >", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_category_create_time >=", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_category_create_time <", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_category_create_time <=", value, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_category_create_time in", values, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_category_create_time not in", values, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_category_create_time between", value1, value2, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_category_create_time not between", value1, value2, "cySysBlockCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserIsNull() {
            addCriterion("cy_sys_block_category_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserIsNotNull() {
            addCriterion("cy_sys_block_category_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_category_create_user =", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_create_user <>", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_category_create_user >", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_create_user >=", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserLessThan(String value) {
            addCriterion("cy_sys_block_category_create_user <", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_create_user <=", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserLike(String value) {
            addCriterion("cy_sys_block_category_create_user like", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserNotLike(String value) {
            addCriterion("cy_sys_block_category_create_user not like", value, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_category_create_user in", values, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_create_user not in", values, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_create_user between", value1, value2, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_create_user not between", value1, value2, "cySysBlockCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeIsNull() {
            addCriterion("cy_sys_block_category_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_category_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_category_modify_time =", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_category_modify_time <>", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_category_modify_time >", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_category_modify_time >=", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_category_modify_time <", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_category_modify_time <=", value, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_category_modify_time in", values, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_category_modify_time not in", values, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_category_modify_time between", value1, value2, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_category_modify_time not between", value1, value2, "cySysBlockCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserIsNull() {
            addCriterion("cy_sys_block_category_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserIsNotNull() {
            addCriterion("cy_sys_block_category_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_category_modify_user =", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_modify_user <>", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_category_modify_user >", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_modify_user >=", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_category_modify_user <", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_modify_user <=", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserLike(String value) {
            addCriterion("cy_sys_block_category_modify_user like", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_category_modify_user not like", value, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_category_modify_user in", values, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_modify_user not in", values, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_modify_user between", value1, value2, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_modify_user not between", value1, value2, "cySysBlockCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteIsNull() {
            addCriterion("cy_sys_block_category_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteIsNotNull() {
            addCriterion("cy_sys_block_category_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_category_is_delete =", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_category_is_delete <>", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_category_is_delete >", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_is_delete >=", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_category_is_delete <", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_category_is_delete <=", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteLike(String value) {
            addCriterion("cy_sys_block_category_is_delete like", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_category_is_delete not like", value, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_category_is_delete in", values, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_category_is_delete not in", values, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_is_delete between", value1, value2, "cySysBlockCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCategoryIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_category_is_delete not between", value1, value2, "cySysBlockCategoryIsDelete");
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