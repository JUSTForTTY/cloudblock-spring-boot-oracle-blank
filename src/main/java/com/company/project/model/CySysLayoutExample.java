package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysLayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysLayoutExample() {
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

        public Criteria andCySysLayoutIdIsNull() {
            addCriterion("cy_sys_layout_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdIsNotNull() {
            addCriterion("cy_sys_layout_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdEqualTo(String value) {
            addCriterion("cy_sys_layout_id =", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdNotEqualTo(String value) {
            addCriterion("cy_sys_layout_id <>", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdGreaterThan(String value) {
            addCriterion("cy_sys_layout_id >", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_id >=", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdLessThan(String value) {
            addCriterion("cy_sys_layout_id <", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_id <=", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdLike(String value) {
            addCriterion("cy_sys_layout_id like", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdNotLike(String value) {
            addCriterion("cy_sys_layout_id not like", value, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdIn(List<String> values) {
            addCriterion("cy_sys_layout_id in", values, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdNotIn(List<String> values) {
            addCriterion("cy_sys_layout_id not in", values, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_id between", value1, value2, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_id not between", value1, value2, "cySysLayoutId");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeIsNull() {
            addCriterion("cy_sys_layout_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeIsNotNull() {
            addCriterion("cy_sys_layout_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeEqualTo(String value) {
            addCriterion("cy_sys_layout_code =", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeNotEqualTo(String value) {
            addCriterion("cy_sys_layout_code <>", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeGreaterThan(String value) {
            addCriterion("cy_sys_layout_code >", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_code >=", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeLessThan(String value) {
            addCriterion("cy_sys_layout_code <", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_code <=", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeLike(String value) {
            addCriterion("cy_sys_layout_code like", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeNotLike(String value) {
            addCriterion("cy_sys_layout_code not like", value, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeIn(List<String> values) {
            addCriterion("cy_sys_layout_code in", values, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeNotIn(List<String> values) {
            addCriterion("cy_sys_layout_code not in", values, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_code between", value1, value2, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_code not between", value1, value2, "cySysLayoutCode");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameIsNull() {
            addCriterion("cy_sys_layout_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameIsNotNull() {
            addCriterion("cy_sys_layout_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameEqualTo(String value) {
            addCriterion("cy_sys_layout_name =", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameNotEqualTo(String value) {
            addCriterion("cy_sys_layout_name <>", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameGreaterThan(String value) {
            addCriterion("cy_sys_layout_name >", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_name >=", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameLessThan(String value) {
            addCriterion("cy_sys_layout_name <", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_name <=", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameLike(String value) {
            addCriterion("cy_sys_layout_name like", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameNotLike(String value) {
            addCriterion("cy_sys_layout_name not like", value, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameIn(List<String> values) {
            addCriterion("cy_sys_layout_name in", values, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameNotIn(List<String> values) {
            addCriterion("cy_sys_layout_name not in", values, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_name between", value1, value2, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_name not between", value1, value2, "cySysLayoutName");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelIsNull() {
            addCriterion("cy_sys_layout_level is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelIsNotNull() {
            addCriterion("cy_sys_layout_level is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelEqualTo(String value) {
            addCriterion("cy_sys_layout_level =", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelNotEqualTo(String value) {
            addCriterion("cy_sys_layout_level <>", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelGreaterThan(String value) {
            addCriterion("cy_sys_layout_level >", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_level >=", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelLessThan(String value) {
            addCriterion("cy_sys_layout_level <", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_level <=", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelLike(String value) {
            addCriterion("cy_sys_layout_level like", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelNotLike(String value) {
            addCriterion("cy_sys_layout_level not like", value, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelIn(List<String> values) {
            addCriterion("cy_sys_layout_level in", values, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelNotIn(List<String> values) {
            addCriterion("cy_sys_layout_level not in", values, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_level between", value1, value2, "cySysLayoutLevel");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLevelNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_level not between", value1, value2, "cySysLayoutLevel");
            return (Criteria) this;
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

        public Criteria andCySysLayoutConfigurationPanelClassnameIsNull() {
            addCriterion("cy_sys_layout_configuration_panel_classname is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameIsNotNull() {
            addCriterion("cy_sys_layout_configuration_panel_classname is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameEqualTo(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname =", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameNotEqualTo(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname <>", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameGreaterThan(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname >", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname >=", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameLessThan(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname <", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname <=", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameLike(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname like", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameNotLike(String value) {
            addCriterion("cy_sys_layout_configuration_panel_classname not like", value, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameIn(List<String> values) {
            addCriterion("cy_sys_layout_configuration_panel_classname in", values, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameNotIn(List<String> values) {
            addCriterion("cy_sys_layout_configuration_panel_classname not in", values, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_configuration_panel_classname between", value1, value2, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutConfigurationPanelClassnameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_configuration_panel_classname not between", value1, value2, "cySysLayoutConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedIsNull() {
            addCriterion("cy_sys_layout_effectAllowed is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedIsNotNull() {
            addCriterion("cy_sys_layout_effectAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedEqualTo(String value) {
            addCriterion("cy_sys_layout_effectAllowed =", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedNotEqualTo(String value) {
            addCriterion("cy_sys_layout_effectAllowed <>", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedGreaterThan(String value) {
            addCriterion("cy_sys_layout_effectAllowed >", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_effectAllowed >=", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedLessThan(String value) {
            addCriterion("cy_sys_layout_effectAllowed <", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_effectAllowed <=", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedLike(String value) {
            addCriterion("cy_sys_layout_effectAllowed like", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedNotLike(String value) {
            addCriterion("cy_sys_layout_effectAllowed not like", value, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedIn(List<String> values) {
            addCriterion("cy_sys_layout_effectAllowed in", values, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedNotIn(List<String> values) {
            addCriterion("cy_sys_layout_effectAllowed not in", values, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_effectAllowed between", value1, value2, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutEffectallowedNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_effectAllowed not between", value1, value2, "cySysLayoutEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableIsNull() {
            addCriterion("cy_sys_layout_disable is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableIsNotNull() {
            addCriterion("cy_sys_layout_disable is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_disable =", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableNotEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_disable <>", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableGreaterThan(Boolean value) {
            addCriterion("cy_sys_layout_disable >", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_disable >=", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableLessThan(Boolean value) {
            addCriterion("cy_sys_layout_disable <", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableLessThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_disable <=", value, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableIn(List<Boolean> values) {
            addCriterion("cy_sys_layout_disable in", values, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableNotIn(List<Boolean> values) {
            addCriterion("cy_sys_layout_disable not in", values, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_layout_disable between", value1, value2, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutDisableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_layout_disable not between", value1, value2, "cySysLayoutDisable");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleIsNull() {
            addCriterion("cy_sys_layout_handle is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleIsNotNull() {
            addCriterion("cy_sys_layout_handle is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_handle =", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleNotEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_handle <>", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleGreaterThan(Boolean value) {
            addCriterion("cy_sys_layout_handle >", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_handle >=", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleLessThan(Boolean value) {
            addCriterion("cy_sys_layout_handle <", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleLessThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_layout_handle <=", value, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleIn(List<Boolean> values) {
            addCriterion("cy_sys_layout_handle in", values, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleNotIn(List<Boolean> values) {
            addCriterion("cy_sys_layout_handle not in", values, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_layout_handle between", value1, value2, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutHandleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_layout_handle not between", value1, value2, "cySysLayoutHandle");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataIsNull() {
            addCriterion("cy_sys_layout_layoutdata is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataIsNotNull() {
            addCriterion("cy_sys_layout_layoutdata is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataEqualTo(String value) {
            addCriterion("cy_sys_layout_layoutdata =", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataNotEqualTo(String value) {
            addCriterion("cy_sys_layout_layoutdata <>", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataGreaterThan(String value) {
            addCriterion("cy_sys_layout_layoutdata >", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_layoutdata >=", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataLessThan(String value) {
            addCriterion("cy_sys_layout_layoutdata <", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_layoutdata <=", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataLike(String value) {
            addCriterion("cy_sys_layout_layoutdata like", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataNotLike(String value) {
            addCriterion("cy_sys_layout_layoutdata not like", value, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataIn(List<String> values) {
            addCriterion("cy_sys_layout_layoutdata in", values, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataNotIn(List<String> values) {
            addCriterion("cy_sys_layout_layoutdata not in", values, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_layoutdata between", value1, value2, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutLayoutdataNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_layoutdata not between", value1, value2, "cySysLayoutLayoutdata");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1IsNull() {
            addCriterion("cy_sys_layout_sparecolumn1 is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1IsNotNull() {
            addCriterion("cy_sys_layout_sparecolumn1 is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1EqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 =", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1NotEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 <>", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1GreaterThan(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 >", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1GreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 >=", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1LessThan(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 <", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1LessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 <=", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1Like(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 like", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1NotLike(String value) {
            addCriterion("cy_sys_layout_sparecolumn1 not like", value, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1In(List<String> values) {
            addCriterion("cy_sys_layout_sparecolumn1 in", values, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1NotIn(List<String> values) {
            addCriterion("cy_sys_layout_sparecolumn1 not in", values, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1Between(String value1, String value2) {
            addCriterion("cy_sys_layout_sparecolumn1 between", value1, value2, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn1NotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_sparecolumn1 not between", value1, value2, "cySysLayoutSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2IsNull() {
            addCriterion("cy_sys_layout_sparecolumn2 is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2IsNotNull() {
            addCriterion("cy_sys_layout_sparecolumn2 is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2EqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 =", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2NotEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 <>", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2GreaterThan(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 >", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2GreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 >=", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2LessThan(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 <", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2LessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 <=", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2Like(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 like", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2NotLike(String value) {
            addCriterion("cy_sys_layout_sparecolumn2 not like", value, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2In(List<String> values) {
            addCriterion("cy_sys_layout_sparecolumn2 in", values, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2NotIn(List<String> values) {
            addCriterion("cy_sys_layout_sparecolumn2 not in", values, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2Between(String value1, String value2) {
            addCriterion("cy_sys_layout_sparecolumn2 between", value1, value2, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutSparecolumn2NotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_sparecolumn2 not between", value1, value2, "cySysLayoutSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionIsNull() {
            addCriterion("cy_sys_layout_version is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionIsNotNull() {
            addCriterion("cy_sys_layout_version is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionEqualTo(String value) {
            addCriterion("cy_sys_layout_version =", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionNotEqualTo(String value) {
            addCriterion("cy_sys_layout_version <>", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionGreaterThan(String value) {
            addCriterion("cy_sys_layout_version >", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_version >=", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionLessThan(String value) {
            addCriterion("cy_sys_layout_version <", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_version <=", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionLike(String value) {
            addCriterion("cy_sys_layout_version like", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionNotLike(String value) {
            addCriterion("cy_sys_layout_version not like", value, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionIn(List<String> values) {
            addCriterion("cy_sys_layout_version in", values, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionNotIn(List<String> values) {
            addCriterion("cy_sys_layout_version not in", values, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_version between", value1, value2, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutVersionNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_version not between", value1, value2, "cySysLayoutVersion");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceIsNull() {
            addCriterion("cy_sys_layout_resource is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceIsNotNull() {
            addCriterion("cy_sys_layout_resource is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceEqualTo(String value) {
            addCriterion("cy_sys_layout_resource =", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceNotEqualTo(String value) {
            addCriterion("cy_sys_layout_resource <>", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceGreaterThan(String value) {
            addCriterion("cy_sys_layout_resource >", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_resource >=", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceLessThan(String value) {
            addCriterion("cy_sys_layout_resource <", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_resource <=", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceLike(String value) {
            addCriterion("cy_sys_layout_resource like", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceNotLike(String value) {
            addCriterion("cy_sys_layout_resource not like", value, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceIn(List<String> values) {
            addCriterion("cy_sys_layout_resource in", values, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceNotIn(List<String> values) {
            addCriterion("cy_sys_layout_resource not in", values, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_resource between", value1, value2, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutResourceNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_resource not between", value1, value2, "cySysLayoutResource");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeIsNull() {
            addCriterion("cy_sys_layout_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeIsNotNull() {
            addCriterion("cy_sys_layout_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_layout_create_time =", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_layout_create_time <>", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_layout_create_time >", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_create_time >=", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_layout_create_time <", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_create_time <=", value, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_layout_create_time in", values, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_layout_create_time not in", values, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_create_time between", value1, value2, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_create_time not between", value1, value2, "cySysLayoutCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserIsNull() {
            addCriterion("cy_sys_layout_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserIsNotNull() {
            addCriterion("cy_sys_layout_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserEqualTo(String value) {
            addCriterion("cy_sys_layout_create_user =", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_layout_create_user <>", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_layout_create_user >", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_create_user >=", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserLessThan(String value) {
            addCriterion("cy_sys_layout_create_user <", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_create_user <=", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserLike(String value) {
            addCriterion("cy_sys_layout_create_user like", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserNotLike(String value) {
            addCriterion("cy_sys_layout_create_user not like", value, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserIn(List<String> values) {
            addCriterion("cy_sys_layout_create_user in", values, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_layout_create_user not in", values, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_create_user between", value1, value2, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_create_user not between", value1, value2, "cySysLayoutCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeIsNull() {
            addCriterion("cy_sys_layout_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeIsNotNull() {
            addCriterion("cy_sys_layout_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_layout_modify_time =", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_layout_modify_time <>", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_layout_modify_time >", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_modify_time >=", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_layout_modify_time <", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_layout_modify_time <=", value, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_layout_modify_time in", values, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_layout_modify_time not in", values, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_modify_time between", value1, value2, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_layout_modify_time not between", value1, value2, "cySysLayoutModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserIsNull() {
            addCriterion("cy_sys_layout_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserIsNotNull() {
            addCriterion("cy_sys_layout_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserEqualTo(String value) {
            addCriterion("cy_sys_layout_modify_user =", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_layout_modify_user <>", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_layout_modify_user >", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_modify_user >=", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserLessThan(String value) {
            addCriterion("cy_sys_layout_modify_user <", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_modify_user <=", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserLike(String value) {
            addCriterion("cy_sys_layout_modify_user like", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserNotLike(String value) {
            addCriterion("cy_sys_layout_modify_user not like", value, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserIn(List<String> values) {
            addCriterion("cy_sys_layout_modify_user in", values, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_layout_modify_user not in", values, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_modify_user between", value1, value2, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_modify_user not between", value1, value2, "cySysLayoutModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteIsNull() {
            addCriterion("cy_sys_layout_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteIsNotNull() {
            addCriterion("cy_sys_layout_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_layout_is_delete =", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_layout_is_delete <>", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_layout_is_delete >", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_is_delete >=", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteLessThan(String value) {
            addCriterion("cy_sys_layout_is_delete <", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_layout_is_delete <=", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteLike(String value) {
            addCriterion("cy_sys_layout_is_delete like", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteNotLike(String value) {
            addCriterion("cy_sys_layout_is_delete not like", value, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_layout_is_delete in", values, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_layout_is_delete not in", values, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_is_delete between", value1, value2, "cySysLayoutIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysLayoutIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_layout_is_delete not between", value1, value2, "cySysLayoutIsDelete");
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