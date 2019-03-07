package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu05button0010007Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu05button0010007Example() {
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

        public Criteria andCySysBlockSucu05button0010007IdIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id =", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id <>", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id >", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id >=", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id <", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id <=", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id like", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_id not like", value, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_id in", values, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_id not in", values, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_id between", value1, value2, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_id not between", value1, value2, "cySysBlockSucu05button0010007Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name =", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name <>", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name >", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name >=", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name <", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name <=", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name like", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_name not like", value, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_name in", values, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_name not in", values, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_name between", value1, value2, "cySysBlockSucu05button0010007Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_name not between", value1, value2, "cySysBlockSucu05button0010007Name");
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

        public Criteria andCySysBlockSucu05button0010007CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time =", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time <>", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time >", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time >=", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time <", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time <=", value, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time in", values, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time not in", values, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time between", value1, value2, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010007_create_time not between", value1, value2, "cySysBlockSucu05button0010007CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user =", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user <>", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user >", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user >=", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user <", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user <=", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user like", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user not like", value, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user in", values, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user not in", values, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user between", value1, value2, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_create_user not between", value1, value2, "cySysBlockSucu05button0010007CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time =", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time <>", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time >", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time >=", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time <", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time <=", value, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time in", values, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time not in", values, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time between", value1, value2, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_time not between", value1, value2, "cySysBlockSucu05button0010007ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user =", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user <>", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user >", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user >=", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user <", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user <=", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user like", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user not like", value, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user in", values, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user not in", values, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user between", value1, value2, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_modify_user not between", value1, value2, "cySysBlockSucu05button0010007ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete =", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete <>", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete >", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete >=", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete <", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete <=", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete like", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete not like", value, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete in", values, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete not in", values, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete between", value1, value2, "cySysBlockSucu05button0010007IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010007IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010007_is_delete not between", value1, value2, "cySysBlockSucu05button0010007IsDelete");
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