package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu05button0010008Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu05button0010008Example() {
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

        public Criteria andCySysBlockSucu05button0010008IdIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id =", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id <>", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id >", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id >=", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id <", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id <=", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id like", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_id not like", value, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_id in", values, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_id not in", values, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_id between", value1, value2, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_id not between", value1, value2, "cySysBlockSucu05button0010008Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name =", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name <>", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name >", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name >=", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name <", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name <=", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name like", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_name not like", value, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_name in", values, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_name not in", values, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_name between", value1, value2, "cySysBlockSucu05button0010008Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_name not between", value1, value2, "cySysBlockSucu05button0010008Name");
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

        public Criteria andCySysBlockSucu05button0010008CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time =", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time <>", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time >", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time >=", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time <", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time <=", value, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time in", values, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time not in", values, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time between", value1, value2, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010008_create_time not between", value1, value2, "cySysBlockSucu05button0010008CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user =", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user <>", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user >", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user >=", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user <", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user <=", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user like", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user not like", value, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user in", values, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user not in", values, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user between", value1, value2, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_create_user not between", value1, value2, "cySysBlockSucu05button0010008CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time =", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time <>", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time >", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time >=", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time <", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time <=", value, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time in", values, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time not in", values, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time between", value1, value2, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_time not between", value1, value2, "cySysBlockSucu05button0010008ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user =", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user <>", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user >", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user >=", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user <", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user <=", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user like", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user not like", value, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user in", values, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user not in", values, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user between", value1, value2, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_modify_user not between", value1, value2, "cySysBlockSucu05button0010008ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete =", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete <>", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete >", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete >=", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete <", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete <=", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete like", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete not like", value, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete in", values, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete not in", values, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete between", value1, value2, "cySysBlockSucu05button0010008IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu05button0010008IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu05button0010008_is_delete not between", value1, value2, "cySysBlockSucu05button0010008IsDelete");
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