package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu04weight0060001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu04weight0060001Example() {
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

        public Criteria andCySysBlockSucu04weight0060001IdIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id =", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id <>", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id >", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id >=", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id <", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id <=", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id like", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_id not like", value, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_id in", values, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_id not in", values, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_id between", value1, value2, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_id not between", value1, value2, "cySysBlockSucu04weight0060001Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name =", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name <>", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name >", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name >=", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name <", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name <=", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name like", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_name not like", value, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_name in", values, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_name not in", values, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_name between", value1, value2, "cySysBlockSucu04weight0060001Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_name not between", value1, value2, "cySysBlockSucu04weight0060001Name");
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

        public Criteria andCySysBlockSucu04weight0060001IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete =", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete <>", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete >", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete >=", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete <", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete <=", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete like", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete not like", value, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete in", values, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete not in", values, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete between", value1, value2, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_is_delete not between", value1, value2, "cySysBlockSucu04weight0060001IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user =", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user <>", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user >", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user >=", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user <", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user <=", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user like", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user not like", value, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user in", values, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user not in", values, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user between", value1, value2, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_user not between", value1, value2, "cySysBlockSucu04weight0060001CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user =", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user <>", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user >", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user >=", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user <", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user <=", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user like", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user not like", value, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user in", values, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user not in", values, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user between", value1, value2, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_user not between", value1, value2, "cySysBlockSucu04weight0060001ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time =", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time <>", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time >", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time >=", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time <", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time <=", value, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time in", values, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time not in", values, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time between", value1, value2, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_create_time not between", value1, value2, "cySysBlockSucu04weight0060001CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time =", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time <>", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time >", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time >=", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time <", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time <=", value, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time in", values, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time not in", values, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time between", value1, value2, "cySysBlockSucu04weight0060001ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0060001ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0060001_modify_time not between", value1, value2, "cySysBlockSucu04weight0060001ModifyTime");
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