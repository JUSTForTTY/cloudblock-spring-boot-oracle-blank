package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockExample() {
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

        public Criteria andCySysBlockIdIsNull() {
            addCriterion("cy_sys_block_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIsNotNull() {
            addCriterion("cy_sys_block_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdEqualTo(String value) {
            addCriterion("cy_sys_block_id =", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotEqualTo(String value) {
            addCriterion("cy_sys_block_id <>", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThan(String value) {
            addCriterion("cy_sys_block_id >", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_id >=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThan(String value) {
            addCriterion("cy_sys_block_id <", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_id <=", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdLike(String value) {
            addCriterion("cy_sys_block_id like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotLike(String value) {
            addCriterion("cy_sys_block_id not like", value, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdIn(List<String> values) {
            addCriterion("cy_sys_block_id in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotIn(List<String> values) {
            addCriterion("cy_sys_block_id not in", values, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_id between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_id not between", value1, value2, "cySysBlockId");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIsNull() {
            addCriterion("cy_sys_block_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIsNotNull() {
            addCriterion("cy_sys_block_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeEqualTo(String value) {
            addCriterion("cy_sys_block_code =", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotEqualTo(String value) {
            addCriterion("cy_sys_block_code <>", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeGreaterThan(String value) {
            addCriterion("cy_sys_block_code >", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_code >=", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLessThan(String value) {
            addCriterion("cy_sys_block_code <", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_code <=", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeLike(String value) {
            addCriterion("cy_sys_block_code like", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotLike(String value) {
            addCriterion("cy_sys_block_code not like", value, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeIn(List<String> values) {
            addCriterion("cy_sys_block_code in", values, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotIn(List<String> values) {
            addCriterion("cy_sys_block_code not in", values, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_block_code between", value1, value2, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_code not between", value1, value2, "cySysBlockCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIsNull() {
            addCriterion("cy_sys_block_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIsNotNull() {
            addCriterion("cy_sys_block_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameEqualTo(String value) {
            addCriterion("cy_sys_block_name =", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotEqualTo(String value) {
            addCriterion("cy_sys_block_name <>", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameGreaterThan(String value) {
            addCriterion("cy_sys_block_name >", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_name >=", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLessThan(String value) {
            addCriterion("cy_sys_block_name <", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_name <=", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameLike(String value) {
            addCriterion("cy_sys_block_name like", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotLike(String value) {
            addCriterion("cy_sys_block_name not like", value, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameIn(List<String> values) {
            addCriterion("cy_sys_block_name in", values, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotIn(List<String> values) {
            addCriterion("cy_sys_block_name not in", values, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_name between", value1, value2, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_name not between", value1, value2, "cySysBlockName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIsNull() {
            addCriterion("cy_sys_block_level is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIsNotNull() {
            addCriterion("cy_sys_block_level is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelEqualTo(String value) {
            addCriterion("cy_sys_block_level =", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotEqualTo(String value) {
            addCriterion("cy_sys_block_level <>", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelGreaterThan(String value) {
            addCriterion("cy_sys_block_level >", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_level >=", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLessThan(String value) {
            addCriterion("cy_sys_block_level <", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_level <=", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelLike(String value) {
            addCriterion("cy_sys_block_level like", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotLike(String value) {
            addCriterion("cy_sys_block_level not like", value, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelIn(List<String> values) {
            addCriterion("cy_sys_block_level in", values, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotIn(List<String> values) {
            addCriterion("cy_sys_block_level not in", values, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelBetween(String value1, String value2) {
            addCriterion("cy_sys_block_level between", value1, value2, "cySysBlockLevel");
            return (Criteria) this;
        }

        public Criteria andCySysBlockLevelNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_level not between", value1, value2, "cySysBlockLevel");
            return (Criteria) this;
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

        public Criteria andCySysBlockRuntimeTableIsNull() {
            addCriterion("cy_sys_block_runtime_table is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableIsNotNull() {
            addCriterion("cy_sys_block_runtime_table is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableEqualTo(String value) {
            addCriterion("cy_sys_block_runtime_table =", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableNotEqualTo(String value) {
            addCriterion("cy_sys_block_runtime_table <>", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableGreaterThan(String value) {
            addCriterion("cy_sys_block_runtime_table >", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_runtime_table >=", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableLessThan(String value) {
            addCriterion("cy_sys_block_runtime_table <", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_runtime_table <=", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableLike(String value) {
            addCriterion("cy_sys_block_runtime_table like", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableNotLike(String value) {
            addCriterion("cy_sys_block_runtime_table not like", value, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableIn(List<String> values) {
            addCriterion("cy_sys_block_runtime_table in", values, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableNotIn(List<String> values) {
            addCriterion("cy_sys_block_runtime_table not in", values, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableBetween(String value1, String value2) {
            addCriterion("cy_sys_block_runtime_table between", value1, value2, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockRuntimeTableNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_runtime_table not between", value1, value2, "cySysBlockRuntimeTable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeIsNull() {
            addCriterion("cy_sys_block_html_drop_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeIsNotNull() {
            addCriterion("cy_sys_block_html_drop_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeEqualTo(String value) {
            addCriterion("cy_sys_block_html_drop_code =", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeNotEqualTo(String value) {
            addCriterion("cy_sys_block_html_drop_code <>", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeGreaterThan(String value) {
            addCriterion("cy_sys_block_html_drop_code >", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_html_drop_code >=", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeLessThan(String value) {
            addCriterion("cy_sys_block_html_drop_code <", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_html_drop_code <=", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeLike(String value) {
            addCriterion("cy_sys_block_html_drop_code like", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeNotLike(String value) {
            addCriterion("cy_sys_block_html_drop_code not like", value, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeIn(List<String> values) {
            addCriterion("cy_sys_block_html_drop_code in", values, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeNotIn(List<String> values) {
            addCriterion("cy_sys_block_html_drop_code not in", values, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_block_html_drop_code between", value1, value2, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHtmlDropCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_html_drop_code not between", value1, value2, "cySysBlockHtmlDropCode");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameIsNull() {
            addCriterion("cy_sys_block_configuration_panel_classname is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameIsNotNull() {
            addCriterion("cy_sys_block_configuration_panel_classname is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameEqualTo(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname =", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameNotEqualTo(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname <>", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameGreaterThan(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname >", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname >=", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameLessThan(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname <", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname <=", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameLike(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname like", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameNotLike(String value) {
            addCriterion("cy_sys_block_configuration_panel_classname not like", value, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameIn(List<String> values) {
            addCriterion("cy_sys_block_configuration_panel_classname in", values, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameNotIn(List<String> values) {
            addCriterion("cy_sys_block_configuration_panel_classname not in", values, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_configuration_panel_classname between", value1, value2, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockConfigurationPanelClassnameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_configuration_panel_classname not between", value1, value2, "cySysBlockConfigurationPanelClassname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedIsNull() {
            addCriterion("cy_sys_block_effectAllowed is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedIsNotNull() {
            addCriterion("cy_sys_block_effectAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedEqualTo(String value) {
            addCriterion("cy_sys_block_effectAllowed =", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedNotEqualTo(String value) {
            addCriterion("cy_sys_block_effectAllowed <>", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedGreaterThan(String value) {
            addCriterion("cy_sys_block_effectAllowed >", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_effectAllowed >=", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedLessThan(String value) {
            addCriterion("cy_sys_block_effectAllowed <", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_effectAllowed <=", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedLike(String value) {
            addCriterion("cy_sys_block_effectAllowed like", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedNotLike(String value) {
            addCriterion("cy_sys_block_effectAllowed not like", value, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedIn(List<String> values) {
            addCriterion("cy_sys_block_effectAllowed in", values, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedNotIn(List<String> values) {
            addCriterion("cy_sys_block_effectAllowed not in", values, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedBetween(String value1, String value2) {
            addCriterion("cy_sys_block_effectAllowed between", value1, value2, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockEffectallowedNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_effectAllowed not between", value1, value2, "cySysBlockEffectallowed");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableIsNull() {
            addCriterion("cy_sys_block_disable is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableIsNotNull() {
            addCriterion("cy_sys_block_disable is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableEqualTo(Boolean value) {
            addCriterion("cy_sys_block_disable =", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableNotEqualTo(Boolean value) {
            addCriterion("cy_sys_block_disable <>", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableGreaterThan(Boolean value) {
            addCriterion("cy_sys_block_disable >", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_block_disable >=", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableLessThan(Boolean value) {
            addCriterion("cy_sys_block_disable <", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableLessThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_block_disable <=", value, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableIn(List<Boolean> values) {
            addCriterion("cy_sys_block_disable in", values, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableNotIn(List<Boolean> values) {
            addCriterion("cy_sys_block_disable not in", values, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_block_disable between", value1, value2, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockDisableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_block_disable not between", value1, value2, "cySysBlockDisable");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleIsNull() {
            addCriterion("cy_sys_block_handle is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleIsNotNull() {
            addCriterion("cy_sys_block_handle is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleEqualTo(Boolean value) {
            addCriterion("cy_sys_block_handle =", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleNotEqualTo(Boolean value) {
            addCriterion("cy_sys_block_handle <>", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleGreaterThan(Boolean value) {
            addCriterion("cy_sys_block_handle >", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_block_handle >=", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleLessThan(Boolean value) {
            addCriterion("cy_sys_block_handle <", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleLessThanOrEqualTo(Boolean value) {
            addCriterion("cy_sys_block_handle <=", value, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleIn(List<Boolean> values) {
            addCriterion("cy_sys_block_handle in", values, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleNotIn(List<Boolean> values) {
            addCriterion("cy_sys_block_handle not in", values, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_block_handle between", value1, value2, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockHandleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cy_sys_block_handle not between", value1, value2, "cySysBlockHandle");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1IsNull() {
            addCriterion("cy_sys_block_sparecolumn1 is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1IsNotNull() {
            addCriterion("cy_sys_block_sparecolumn1 is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1EqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn1 =", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1NotEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn1 <>", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1GreaterThan(String value) {
            addCriterion("cy_sys_block_sparecolumn1 >", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1GreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn1 >=", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1LessThan(String value) {
            addCriterion("cy_sys_block_sparecolumn1 <", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1LessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn1 <=", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1Like(String value) {
            addCriterion("cy_sys_block_sparecolumn1 like", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1NotLike(String value) {
            addCriterion("cy_sys_block_sparecolumn1 not like", value, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1In(List<String> values) {
            addCriterion("cy_sys_block_sparecolumn1 in", values, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1NotIn(List<String> values) {
            addCriterion("cy_sys_block_sparecolumn1 not in", values, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1Between(String value1, String value2) {
            addCriterion("cy_sys_block_sparecolumn1 between", value1, value2, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn1NotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sparecolumn1 not between", value1, value2, "cySysBlockSparecolumn1");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2IsNull() {
            addCriterion("cy_sys_block_sparecolumn2 is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2IsNotNull() {
            addCriterion("cy_sys_block_sparecolumn2 is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2EqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn2 =", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2NotEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn2 <>", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2GreaterThan(String value) {
            addCriterion("cy_sys_block_sparecolumn2 >", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2GreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn2 >=", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2LessThan(String value) {
            addCriterion("cy_sys_block_sparecolumn2 <", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2LessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sparecolumn2 <=", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2Like(String value) {
            addCriterion("cy_sys_block_sparecolumn2 like", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2NotLike(String value) {
            addCriterion("cy_sys_block_sparecolumn2 not like", value, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2In(List<String> values) {
            addCriterion("cy_sys_block_sparecolumn2 in", values, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2NotIn(List<String> values) {
            addCriterion("cy_sys_block_sparecolumn2 not in", values, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2Between(String value1, String value2) {
            addCriterion("cy_sys_block_sparecolumn2 between", value1, value2, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSparecolumn2NotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sparecolumn2 not between", value1, value2, "cySysBlockSparecolumn2");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionIsNull() {
            addCriterion("cy_sys_block_version is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionIsNotNull() {
            addCriterion("cy_sys_block_version is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionEqualTo(String value) {
            addCriterion("cy_sys_block_version =", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionNotEqualTo(String value) {
            addCriterion("cy_sys_block_version <>", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionGreaterThan(String value) {
            addCriterion("cy_sys_block_version >", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_version >=", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionLessThan(String value) {
            addCriterion("cy_sys_block_version <", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_version <=", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionLike(String value) {
            addCriterion("cy_sys_block_version like", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionNotLike(String value) {
            addCriterion("cy_sys_block_version not like", value, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionIn(List<String> values) {
            addCriterion("cy_sys_block_version in", values, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionNotIn(List<String> values) {
            addCriterion("cy_sys_block_version not in", values, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionBetween(String value1, String value2) {
            addCriterion("cy_sys_block_version between", value1, value2, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockVersionNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_version not between", value1, value2, "cySysBlockVersion");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceIsNull() {
            addCriterion("cy_sys_block_resource is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceIsNotNull() {
            addCriterion("cy_sys_block_resource is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceEqualTo(String value) {
            addCriterion("cy_sys_block_resource =", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceNotEqualTo(String value) {
            addCriterion("cy_sys_block_resource <>", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceGreaterThan(String value) {
            addCriterion("cy_sys_block_resource >", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_resource >=", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceLessThan(String value) {
            addCriterion("cy_sys_block_resource <", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_resource <=", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceLike(String value) {
            addCriterion("cy_sys_block_resource like", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceNotLike(String value) {
            addCriterion("cy_sys_block_resource not like", value, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceIn(List<String> values) {
            addCriterion("cy_sys_block_resource in", values, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceNotIn(List<String> values) {
            addCriterion("cy_sys_block_resource not in", values, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceBetween(String value1, String value2) {
            addCriterion("cy_sys_block_resource between", value1, value2, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockResourceNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_resource not between", value1, value2, "cySysBlockResource");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortIsNull() {
            addCriterion("cy_sys_block_sort is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortIsNotNull() {
            addCriterion("cy_sys_block_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortEqualTo(Integer value) {
            addCriterion("cy_sys_block_sort =", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortNotEqualTo(Integer value) {
            addCriterion("cy_sys_block_sort <>", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortGreaterThan(Integer value) {
            addCriterion("cy_sys_block_sort >", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_block_sort >=", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortLessThan(Integer value) {
            addCriterion("cy_sys_block_sort <", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortLessThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_block_sort <=", value, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortIn(List<Integer> values) {
            addCriterion("cy_sys_block_sort in", values, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortNotIn(List<Integer> values) {
            addCriterion("cy_sys_block_sort not in", values, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_block_sort between", value1, value2, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSortNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_block_sort not between", value1, value2, "cySysBlockSort");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameIsNull() {
            addCriterion("cy_sys_block_beanname is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameIsNotNull() {
            addCriterion("cy_sys_block_beanname is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameEqualTo(String value) {
            addCriterion("cy_sys_block_beanname =", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameNotEqualTo(String value) {
            addCriterion("cy_sys_block_beanname <>", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameGreaterThan(String value) {
            addCriterion("cy_sys_block_beanname >", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_beanname >=", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameLessThan(String value) {
            addCriterion("cy_sys_block_beanname <", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_beanname <=", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameLike(String value) {
            addCriterion("cy_sys_block_beanname like", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameNotLike(String value) {
            addCriterion("cy_sys_block_beanname not like", value, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameIn(List<String> values) {
            addCriterion("cy_sys_block_beanname in", values, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameNotIn(List<String> values) {
            addCriterion("cy_sys_block_beanname not in", values, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_beanname between", value1, value2, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockBeannameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_beanname not between", value1, value2, "cySysBlockBeanname");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiIsNull() {
            addCriterion("cy_sys_block_is_needapi is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiIsNotNull() {
            addCriterion("cy_sys_block_is_needapi is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiEqualTo(String value) {
            addCriterion("cy_sys_block_is_needapi =", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiNotEqualTo(String value) {
            addCriterion("cy_sys_block_is_needapi <>", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiGreaterThan(String value) {
            addCriterion("cy_sys_block_is_needapi >", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_is_needapi >=", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiLessThan(String value) {
            addCriterion("cy_sys_block_is_needapi <", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_is_needapi <=", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiLike(String value) {
            addCriterion("cy_sys_block_is_needapi like", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiNotLike(String value) {
            addCriterion("cy_sys_block_is_needapi not like", value, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiIn(List<String> values) {
            addCriterion("cy_sys_block_is_needapi in", values, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiNotIn(List<String> values) {
            addCriterion("cy_sys_block_is_needapi not in", values, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiBetween(String value1, String value2) {
            addCriterion("cy_sys_block_is_needapi between", value1, value2, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsNeedapiNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_is_needapi not between", value1, value2, "cySysBlockIsNeedapi");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateIsNull() {
            addCriterion("cy_sys_block_codetemplate is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateIsNotNull() {
            addCriterion("cy_sys_block_codetemplate is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateEqualTo(String value) {
            addCriterion("cy_sys_block_codetemplate =", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateNotEqualTo(String value) {
            addCriterion("cy_sys_block_codetemplate <>", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateGreaterThan(String value) {
            addCriterion("cy_sys_block_codetemplate >", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_codetemplate >=", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateLessThan(String value) {
            addCriterion("cy_sys_block_codetemplate <", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_codetemplate <=", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateLike(String value) {
            addCriterion("cy_sys_block_codetemplate like", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateNotLike(String value) {
            addCriterion("cy_sys_block_codetemplate not like", value, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateIn(List<String> values) {
            addCriterion("cy_sys_block_codetemplate in", values, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateNotIn(List<String> values) {
            addCriterion("cy_sys_block_codetemplate not in", values, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateBetween(String value1, String value2) {
            addCriterion("cy_sys_block_codetemplate between", value1, value2, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCodetemplateNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_codetemplate not between", value1, value2, "cySysBlockCodetemplate");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameIsNull() {
            addCriterion("cy_sys_main_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameIsNotNull() {
            addCriterion("cy_sys_main_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameEqualTo(String value) {
            addCriterion("cy_sys_main_category_name =", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameNotEqualTo(String value) {
            addCriterion("cy_sys_main_category_name <>", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameGreaterThan(String value) {
            addCriterion("cy_sys_main_category_name >", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_main_category_name >=", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameLessThan(String value) {
            addCriterion("cy_sys_main_category_name <", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_main_category_name <=", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameLike(String value) {
            addCriterion("cy_sys_main_category_name like", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameNotLike(String value) {
            addCriterion("cy_sys_main_category_name not like", value, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameIn(List<String> values) {
            addCriterion("cy_sys_main_category_name in", values, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameNotIn(List<String> values) {
            addCriterion("cy_sys_main_category_name not in", values, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameBetween(String value1, String value2) {
            addCriterion("cy_sys_main_category_name between", value1, value2, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysMainCategoryNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_main_category_name not between", value1, value2, "cySysMainCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameIsNull() {
            addCriterion("cy_sys_sub_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameIsNotNull() {
            addCriterion("cy_sys_sub_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameEqualTo(String value) {
            addCriterion("cy_sys_sub_category_name =", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameNotEqualTo(String value) {
            addCriterion("cy_sys_sub_category_name <>", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameGreaterThan(String value) {
            addCriterion("cy_sys_sub_category_name >", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_sub_category_name >=", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameLessThan(String value) {
            addCriterion("cy_sys_sub_category_name <", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_sub_category_name <=", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameLike(String value) {
            addCriterion("cy_sys_sub_category_name like", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameNotLike(String value) {
            addCriterion("cy_sys_sub_category_name not like", value, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameIn(List<String> values) {
            addCriterion("cy_sys_sub_category_name in", values, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameNotIn(List<String> values) {
            addCriterion("cy_sys_sub_category_name not in", values, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameBetween(String value1, String value2) {
            addCriterion("cy_sys_sub_category_name between", value1, value2, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysSubCategoryNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_sub_category_name not between", value1, value2, "cySysSubCategoryName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeIsNull() {
            addCriterion("cy_sys_block_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeIsNotNull() {
            addCriterion("cy_sys_block_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_create_time =", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_create_time <>", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_create_time >", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_create_time >=", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_create_time <", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_create_time <=", value, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_create_time in", values, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_create_time not in", values, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_create_time between", value1, value2, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_create_time not between", value1, value2, "cySysBlockCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserIsNull() {
            addCriterion("cy_sys_block_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserIsNotNull() {
            addCriterion("cy_sys_block_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_create_user =", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_create_user <>", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_create_user >", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_create_user >=", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserLessThan(String value) {
            addCriterion("cy_sys_block_create_user <", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_create_user <=", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserLike(String value) {
            addCriterion("cy_sys_block_create_user like", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserNotLike(String value) {
            addCriterion("cy_sys_block_create_user not like", value, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_create_user in", values, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_create_user not in", values, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_create_user between", value1, value2, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_create_user not between", value1, value2, "cySysBlockCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeIsNull() {
            addCriterion("cy_sys_block_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_modify_time =", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_modify_time <>", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_modify_time >", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_modify_time >=", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_modify_time <", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_modify_time <=", value, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_modify_time in", values, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_modify_time not in", values, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_modify_time between", value1, value2, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_modify_time not between", value1, value2, "cySysBlockModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserIsNull() {
            addCriterion("cy_sys_block_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserIsNotNull() {
            addCriterion("cy_sys_block_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_modify_user =", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_modify_user <>", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_modify_user >", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_modify_user >=", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_modify_user <", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_modify_user <=", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserLike(String value) {
            addCriterion("cy_sys_block_modify_user like", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_modify_user not like", value, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_modify_user in", values, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_modify_user not in", values, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_modify_user between", value1, value2, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_modify_user not between", value1, value2, "cySysBlockModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteIsNull() {
            addCriterion("cy_sys_block_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteIsNotNull() {
            addCriterion("cy_sys_block_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_is_delete =", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_is_delete <>", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_is_delete >", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_is_delete >=", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_is_delete <", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_is_delete <=", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteLike(String value) {
            addCriterion("cy_sys_block_is_delete like", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_is_delete not like", value, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_is_delete in", values, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_is_delete not in", values, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_is_delete between", value1, value2, "cySysBlockIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_is_delete not between", value1, value2, "cySysBlockIsDelete");
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