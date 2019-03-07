package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu01data0030001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu01data0030001Example() {
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

        public Criteria andCySysBlockSucu01data0030001IdIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id =", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id <>", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id >", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id >=", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id <", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id <=", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id like", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_id not like", value, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_id in", values, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_id not in", values, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_id between", value1, value2, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_id not between", value1, value2, "cySysBlockSucu01data0030001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name =", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name <>", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name >", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name >=", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name <", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name <=", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name like", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_name not like", value, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_name in", values, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_name not in", values, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_name between", value1, value2, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_name not between", value1, value2, "cySysBlockSucu01data0030001Name");
            return (Criteria) this;
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

        public Criteria andCySysViewExplainIdIsNull() {
            addCriterion("cy_sys_view_explain_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdIsNotNull() {
            addCriterion("cy_sys_view_explain_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdEqualTo(String value) {
            addCriterion("cy_sys_view_explain_id =", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdNotEqualTo(String value) {
            addCriterion("cy_sys_view_explain_id <>", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdGreaterThan(String value) {
            addCriterion("cy_sys_view_explain_id >", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_view_explain_id >=", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdLessThan(String value) {
            addCriterion("cy_sys_view_explain_id <", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_view_explain_id <=", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdLike(String value) {
            addCriterion("cy_sys_view_explain_id like", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdNotLike(String value) {
            addCriterion("cy_sys_view_explain_id not like", value, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdIn(List<String> values) {
            addCriterion("cy_sys_view_explain_id in", values, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdNotIn(List<String> values) {
            addCriterion("cy_sys_view_explain_id not in", values, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdBetween(String value1, String value2) {
            addCriterion("cy_sys_view_explain_id between", value1, value2, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_view_explain_id not between", value1, value2, "cySysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameIsNull() {
            addCriterion("cy_sys_view_explain_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameIsNotNull() {
            addCriterion("cy_sys_view_explain_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameEqualTo(String value) {
            addCriterion("cy_sys_view_explain_name =", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameNotEqualTo(String value) {
            addCriterion("cy_sys_view_explain_name <>", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameGreaterThan(String value) {
            addCriterion("cy_sys_view_explain_name >", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_view_explain_name >=", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameLessThan(String value) {
            addCriterion("cy_sys_view_explain_name <", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_view_explain_name <=", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameLike(String value) {
            addCriterion("cy_sys_view_explain_name like", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameNotLike(String value) {
            addCriterion("cy_sys_view_explain_name not like", value, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameIn(List<String> values) {
            addCriterion("cy_sys_view_explain_name in", values, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameNotIn(List<String> values) {
            addCriterion("cy_sys_view_explain_name not in", values, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameBetween(String value1, String value2) {
            addCriterion("cy_sys_view_explain_name between", value1, value2, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysViewExplainNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_view_explain_name not between", value1, value2, "cySysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json =", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json <>", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json >", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json >=", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json <", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json <=", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json like", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json not like", value, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json in", values, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json not in", values, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json between", value1, value2, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ColumnSimpleJsonNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_column_simple_json not between", value1, value2, "cySysBlockSucu01data0030001ColumnSimpleJson");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time =", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time <>", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time >", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time >=", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time <", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time <=", value, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time in", values, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time not in", values, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time between", value1, value2, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu01data0030001_create_time not between", value1, value2, "cySysBlockSucu01data0030001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user =", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user <>", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user >", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user >=", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user <", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user <=", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user like", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user not like", value, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user in", values, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user not in", values, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user between", value1, value2, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_create_user not between", value1, value2, "cySysBlockSucu01data0030001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time =", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time <>", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time >", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time >=", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time <", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time <=", value, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time in", values, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time not in", values, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time between", value1, value2, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_time not between", value1, value2, "cySysBlockSucu01data0030001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user =", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user <>", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user >", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user >=", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user <", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user <=", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user like", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user not like", value, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user in", values, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user not in", values, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user between", value1, value2, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_modify_user not between", value1, value2, "cySysBlockSucu01data0030001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete =", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete <>", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete >", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete >=", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete <", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete <=", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete like", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete not like", value, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete in", values, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete not in", values, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete between", value1, value2, "cySysBlockSucu01data0030001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu01data0030001IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu01data0030001_is_delete not between", value1, value2, "cySysBlockSucu01data0030001IsDelete");
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