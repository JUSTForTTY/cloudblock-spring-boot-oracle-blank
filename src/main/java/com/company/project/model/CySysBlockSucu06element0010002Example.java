package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu06element0010002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu06element0010002Example() {
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

        public Criteria andCySysBlockSucu06element0010002IdIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id =", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id <>", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id >", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id >=", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id <", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id <=", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id like", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_id not like", value, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_id in", values, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_id not in", values, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_id between", value1, value2, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_id not between", value1, value2, "cySysBlockSucu06element0010002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name =", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name <>", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name >", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name >=", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name <", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name <=", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name like", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_name not like", value, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_name in", values, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_name not in", values, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_name between", value1, value2, "cySysBlockSucu06element0010002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_name not between", value1, value2, "cySysBlockSucu06element0010002Name");
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

        public Criteria andCySysBlockSucu06element0010002CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time =", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time <>", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time >", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time >=", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time <", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time <=", value, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time in", values, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time not in", values, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time between", value1, value2, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu06element0010002_create_time not between", value1, value2, "cySysBlockSucu06element0010002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user =", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user <>", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user >", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user >=", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user <", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user <=", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user like", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user not like", value, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user in", values, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user not in", values, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user between", value1, value2, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_create_user not between", value1, value2, "cySysBlockSucu06element0010002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time =", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time <>", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time >", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time >=", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time <", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time <=", value, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time in", values, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time not in", values, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time between", value1, value2, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_time not between", value1, value2, "cySysBlockSucu06element0010002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user =", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user <>", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user >", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user >=", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user <", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user <=", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user like", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user not like", value, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user in", values, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user not in", values, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user between", value1, value2, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_modify_user not between", value1, value2, "cySysBlockSucu06element0010002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete =", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete <>", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete >", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete >=", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete <", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete <=", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete like", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete not like", value, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete in", values, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete not in", values, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete between", value1, value2, "cySysBlockSucu06element0010002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu06element0010002IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu06element0010002_is_delete not between", value1, value2, "cySysBlockSucu06element0010002IsDelete");
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