package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysLayoutCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysLayoutCategoryExample() {
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

        public Criteria andCySysLayoutCategoryIdIsNull() {
            addCriterion("cy_sys_layout_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdIsNotNull() {
            addCriterion("cy_sys_layout_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdEqualTo(String value) {
            addCriterion("cy_sys_layout_category_id =", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_id <>", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_id >", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_id >=", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdLessThan(String value) {
            addCriterion("cy_sys_layout_category_id <", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_id <=", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdLike(String value) {
            addCriterion("cy_sys_layout_category_id like", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdNotLike(String value) {
            addCriterion("cy_sys_layout_category_id not like", value, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdIn(List<String> values) {
            addCriterion("cy_sys_layout_category_id in", values, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_id not in", values, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_id between", value1, value2, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_id not between", value1, value2, "cySysLayoutCategoryId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameIsNull() {
            addCriterion("cy_sys_layout_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameIsNotNull() {
            addCriterion("cy_sys_layout_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameEqualTo(String value) {
            addCriterion("cy_sys_layout_category_name =", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_name <>", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_name >", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_name >=", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameLessThan(String value) {
            addCriterion("cy_sys_layout_category_name <", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_name <=", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameLike(String value) {
            addCriterion("cy_sys_layout_category_name like", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameNotLike(String value) {
            addCriterion("cy_sys_layout_category_name not like", value, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameIn(List<String> values) {
            addCriterion("cy_sys_layout_category_name in", values, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_name not in", values, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_name between", value1, value2, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_name not between", value1, value2, "cySysLayoutCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdIsNull() {
            addCriterion("cy_sys_layout_category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdIsNotNull() {
            addCriterion("cy_sys_layout_category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdEqualTo(String value) {
            addCriterion("cy_sys_layout_category_parent_id =", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_parent_id <>", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_parent_id >", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_parent_id >=", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdLessThan(String value) {
            addCriterion("cy_sys_layout_category_parent_id <", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_parent_id <=", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdLike(String value) {
            addCriterion("cy_sys_layout_category_parent_id like", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdNotLike(String value) {
            addCriterion("cy_sys_layout_category_parent_id not like", value, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdIn(List<String> values) {
            addCriterion("cy_sys_layout_category_parent_id in", values, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_parent_id not in", values, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_parent_id between", value1, value2, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryParentIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_parent_id not between", value1, value2, "cySysLayoutCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceIsNull() {
            addCriterion("cy_sys_layout_category_sence is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceIsNotNull() {
            addCriterion("cy_sys_layout_category_sence is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceEqualTo(String value) {
            addCriterion("cy_sys_layout_category_sence =", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_sence <>", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_sence >", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_sence >=", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceLessThan(String value) {
            addCriterion("cy_sys_layout_category_sence <", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_sence <=", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceLike(String value) {
            addCriterion("cy_sys_layout_category_sence like", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceNotLike(String value) {
            addCriterion("cy_sys_layout_category_sence not like", value, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceIn(List<String> values) {
            addCriterion("cy_sys_layout_category_sence in", values, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_sence not in", values, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_sence between", value1, value2, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategorySenceNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_sence not between", value1, value2, "cySysLayoutCategorySence");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeIsNull() {
            addCriterion("cy_sys_layout_category_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeIsNotNull() {
            addCriterion("cy_sys_layout_category_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_create_time =", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_create_time <>", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_layout_category_create_time >", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_create_time >=", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_layout_category_create_time <", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_create_time <=", value, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_layout_category_create_time in", values, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_layout_category_create_time not in", values, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_category_create_time between", value1, value2, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_category_create_time not between", value1, value2, "cySysLayoutCategoryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserIsNull() {
            addCriterion("cy_sys_layout_category_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserIsNotNull() {
            addCriterion("cy_sys_layout_category_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserEqualTo(String value) {
            addCriterion("cy_sys_layout_category_create_user =", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_create_user <>", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_create_user >", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_create_user >=", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserLessThan(String value) {
            addCriterion("cy_sys_layout_category_create_user <", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_create_user <=", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserLike(String value) {
            addCriterion("cy_sys_layout_category_create_user like", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserNotLike(String value) {
            addCriterion("cy_sys_layout_category_create_user not like", value, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserIn(List<String> values) {
            addCriterion("cy_sys_layout_category_create_user in", values, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_create_user not in", values, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_create_user between", value1, value2, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_create_user not between", value1, value2, "cySysLayoutCategoryCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeIsNull() {
            addCriterion("cy_sys_layout_category_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeIsNotNull() {
            addCriterion("cy_sys_layout_category_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_modify_time =", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_modify_time <>", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_layout_category_modify_time >", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_modify_time >=", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_layout_category_modify_time <", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_category_modify_time <=", value, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_layout_category_modify_time in", values, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_layout_category_modify_time not in", values, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_category_modify_time between", value1, value2, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_category_modify_time not between", value1, value2, "cySysLayoutCategoryModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserIsNull() {
            addCriterion("cy_sys_layout_category_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserIsNotNull() {
            addCriterion("cy_sys_layout_category_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserEqualTo(String value) {
            addCriterion("cy_sys_layout_category_modify_user =", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_modify_user <>", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_modify_user >", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_modify_user >=", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserLessThan(String value) {
            addCriterion("cy_sys_layout_category_modify_user <", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_modify_user <=", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserLike(String value) {
            addCriterion("cy_sys_layout_category_modify_user like", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserNotLike(String value) {
            addCriterion("cy_sys_layout_category_modify_user not like", value, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserIn(List<String> values) {
            addCriterion("cy_sys_layout_category_modify_user in", values, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_modify_user not in", values, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_modify_user between", value1, value2, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_modify_user not between", value1, value2, "cySysLayoutCategoryModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteIsNull() {
            addCriterion("cy_sys_layout_category_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteIsNotNull() {
            addCriterion("cy_sys_layout_category_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_layout_category_is_delete =", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_layout_category_is_delete <>", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_layout_category_is_delete >", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_is_delete >=", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteLessThan(String value) {
            addCriterion("cy_sys_layout_category_is_delete <", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_category_is_delete <=", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteLike(String value) {
            addCriterion("cy_sys_layout_category_is_delete like", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteNotLike(String value) {
            addCriterion("cy_sys_layout_category_is_delete not like", value, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_layout_category_is_delete in", values, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_layout_category_is_delete not in", values, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_is_delete between", value1, value2, "cySysLayoutCategoryIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCategoryIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_category_is_delete not between", value1, value2, "cySysLayoutCategoryIsDelete");
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