package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysBlockSucu04weight0080002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysBlockSucu04weight0080002Example() {
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

        public Criteria andCySysBlockSucu04weight0080002IdIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id =", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id <>", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id >", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id >=", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id <", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id <=", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id like", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_id not like", value, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_id in", values, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_id not in", values, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_id between", value1, value2, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_id not between", value1, value2, "cySysBlockSucu04weight0080002Id");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name =", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name <>", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name >", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name >=", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name <", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name <=", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name like", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_name not like", value, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_name in", values, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_name not in", values, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_name between", value1, value2, "cySysBlockSucu04weight0080002Name");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002NameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_name not between", value1, value2, "cySysBlockSucu04weight0080002Name");
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

        public Criteria andCySysBlockSucu04weight0080002IsDeleteIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete =", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete <>", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete >", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete >=", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete <", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete <=", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete like", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete not like", value, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete in", values, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete not in", values, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete between", value1, value2, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002IsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_is_delete not between", value1, value2, "cySysBlockSucu04weight0080002IsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user =", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user <>", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user >", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user >=", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user <", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user <=", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user like", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user not like", value, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user in", values, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user not in", values, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user between", value1, value2, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_user not between", value1, value2, "cySysBlockSucu04weight0080002CreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user =", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user <>", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user >", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user >=", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserLessThan(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user <", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user <=", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user like", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserNotLike(String value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user not like", value, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user in", values, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user not in", values, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user between", value1, value2, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_user not between", value1, value2, "cySysBlockSucu04weight0080002ModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time =", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time <>", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time >", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time >=", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time <", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time <=", value, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time in", values, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time not in", values, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time between", value1, value2, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_create_time not between", value1, value2, "cySysBlockSucu04weight0080002CreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeIsNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeIsNotNull() {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time =", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time <>", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time >", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time >=", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time <", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time <=", value, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time in", values, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time not in", values, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time between", value1, value2, "cySysBlockSucu04weight0080002ModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysBlockSucu04weight0080002ModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_block_sucu04weight0080002_modify_time not between", value1, value2, "cySysBlockSucu04weight0080002ModifyTime");
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