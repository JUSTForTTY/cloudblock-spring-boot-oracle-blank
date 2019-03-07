package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu08searchweiget0030003Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu08searchweiget0030003Example() {
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

        public Criteria andCySysBlockSucu08searchweiget0030003IdIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id =", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id <>", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id >", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id >=", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id <", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id <=", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id like", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id not like", value, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id in", values, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id not in", values, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id between", value1, value2, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_id not between", value1, value2, "cySysBlockSucu08searchweiget0030003Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name =", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name <>", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name >", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name >=", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name <", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name <=", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name like", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name not like", value, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name in", values, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name not in", values, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name between", value1, value2, "cySysBlockSucu08searchweiget0030003Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_name not between", value1, value2, "cySysBlockSucu08searchweiget0030003Name");
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

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time =", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time <>", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time >", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time >=", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time <", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time <=", value, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time in", values, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time not in", values, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time between", value1, value2, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_time not between", value1, value2, "cySysBlockSucu08searchweiget0030003CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user =", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user <>", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user >", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user >=", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user <", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user <=", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user like", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user not like", value, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user in", values, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user not in", values, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user between", value1, value2, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_create_user not between", value1, value2, "cySysBlockSucu08searchweiget0030003CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time =", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time <>", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time >", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time >=", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time <", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time <=", value, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time in", values, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time not in", values, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time between", value1, value2, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_time not between", value1, value2, "cySysBlockSucu08searchweiget0030003ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user =", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user <>", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user >", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user >=", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user <", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user <=", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user like", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user not like", value, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user in", values, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user not in", values, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user between", value1, value2, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_modify_user not between", value1, value2, "cySysBlockSucu08searchweiget0030003ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete =", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete <>", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete >", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete >=", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete <", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete <=", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete like", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete not like", value, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete in", values, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete not in", values, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete between", value1, value2, "cySysBlockSucu08searchweiget0030003IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu08searchweiget0030003IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu08searchweiget0030003_is_delete not between", value1, value2, "cySysBlockSucu08searchweiget0030003IsDelete");
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