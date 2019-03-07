package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysMenuAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysMenuAuthExample() {
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

        public Criteria andCsysMenuAuthIdIsNull() {
            addCriterion("CSYS_MENU_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID =", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <>", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_ID >", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID >=", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_ID <=", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdLike(String value) {
            addCriterion("CSYS_MENU_AUTH_ID like", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_ID not like", value, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_ID in", values, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_ID not in", values, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_ID between", value1, value2, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_ID not between", value1, value2, "csysMenuAuthId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdIsNull() {
            addCriterion("CSYS_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdIsNotNull() {
            addCriterion("CSYS_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdEqualTo(String value) {
            addCriterion("CSYS_MENU_ID =", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotEqualTo(String value) {
            addCriterion("CSYS_MENU_ID <>", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdGreaterThan(String value) {
            addCriterion("CSYS_MENU_ID >", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ID >=", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLessThan(String value) {
            addCriterion("CSYS_MENU_ID <", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_ID <=", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdLike(String value) {
            addCriterion("CSYS_MENU_ID like", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotLike(String value) {
            addCriterion("CSYS_MENU_ID not like", value, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdIn(List<String> values) {
            addCriterion("CSYS_MENU_ID in", values, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotIn(List<String> values) {
            addCriterion("CSYS_MENU_ID not in", values, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ID between", value1, value2, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_ID not between", value1, value2, "csysMenuId");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIsNull() {
            addCriterion("CSYS_MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIsNotNull() {
            addCriterion("CSYS_MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME =", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME <>", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameGreaterThan(String value) {
            addCriterion("CSYS_MENU_NAME >", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME >=", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLessThan(String value) {
            addCriterion("CSYS_MENU_NAME <", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_NAME <=", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameLike(String value) {
            addCriterion("CSYS_MENU_NAME like", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotLike(String value) {
            addCriterion("CSYS_MENU_NAME not like", value, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameIn(List<String> values) {
            addCriterion("CSYS_MENU_NAME in", values, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotIn(List<String> values) {
            addCriterion("CSYS_MENU_NAME not in", values, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_NAME between", value1, value2, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_NAME not between", value1, value2, "csysMenuName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIsNull() {
            addCriterion("CSYS_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIsNotNull() {
            addCriterion("CSYS_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID =", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <>", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThan(String value) {
            addCriterion("CSYS_ROLE_ID >", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID >=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThan(String value) {
            addCriterion("CSYS_ROLE_ID <", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_ID <=", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdLike(String value) {
            addCriterion("CSYS_ROLE_ID like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotLike(String value) {
            addCriterion("CSYS_ROLE_ID not like", value, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_ID not in", values, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID between", value1, value2, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_ID not between", value1, value2, "csysRoleId");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameIsNull() {
            addCriterion("CSYS_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameIsNotNull() {
            addCriterion("CSYS_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME =", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME <>", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameGreaterThan(String value) {
            addCriterion("CSYS_ROLE_NAME >", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME >=", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLessThan(String value) {
            addCriterion("CSYS_ROLE_NAME <", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_NAME <=", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameLike(String value) {
            addCriterion("CSYS_ROLE_NAME like", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotLike(String value) {
            addCriterion("CSYS_ROLE_NAME not like", value, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameIn(List<String> values) {
            addCriterion("CSYS_ROLE_NAME in", values, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_NAME not in", values, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_NAME between", value1, value2, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysRoleNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_NAME not between", value1, value2, "csysRoleName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIsNull() {
            addCriterion("CSYS_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIsNotNull() {
            addCriterion("CSYS_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID =", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <>", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdGreaterThan(String value) {
            addCriterion("CSYS_DEPARTMENT_ID >", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID >=", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLessThan(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_ID <=", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdLike(String value) {
            addCriterion("CSYS_DEPARTMENT_ID like", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotLike(String value) {
            addCriterion("CSYS_DEPARTMENT_ID not like", value, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_ID in", values, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_ID not in", values, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_ID between", value1, value2, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_ID not between", value1, value2, "csysDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameIsNull() {
            addCriterion("CSYS_DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameIsNotNull() {
            addCriterion("CSYS_DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME =", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <>", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameGreaterThan(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME >", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME >=", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLessThan(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME <=", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameLike(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME like", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotLike(String value) {
            addCriterion("CSYS_DEPARTMENT_NAME not like", value, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_NAME in", values, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotIn(List<String> values) {
            addCriterion("CSYS_DEPARTMENT_NAME not in", values, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_NAME between", value1, value2, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_DEPARTMENT_NAME not between", value1, value2, "csysDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME =", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <>", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME >", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME >=", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME <=", value, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME in", values, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME not in", values, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME between", value1, value2, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_TIME not between", value1, value2, "csysMenuAuthCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIsNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER =", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <>", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER >", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER >=", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER <=", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserLike(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER like", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not like", value, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER in", values, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not in", values, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER between", value1, value2, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_CREATE_USER not between", value1, value2, "csysMenuAuthCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME =", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <>", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME >", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME >=", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME <=", value, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME in", values, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME not in", values, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME between", value1, value2, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_TIME not between", value1, value2, "csysMenuAuthModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIsNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER =", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <>", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER >", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER >=", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER <=", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserLike(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER like", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not like", value, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER in", values, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not in", values, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER between", value1, value2, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_MODIFY_USER not between", value1, value2, "csysMenuAuthModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIsNull() {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE =", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <>", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE >", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE >=", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE <=", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteLike(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE like", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not like", value, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE in", values, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not in", values, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE between", value1, value2, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_IS_DELETE not between", value1, value2, "csysMenuAuthIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIsNull() {
            addCriterion("CSYS_MENU_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME =", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <>", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME >", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME >=", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_TIME <=", value, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_TIME in", values, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_TIME not in", values, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_TIME between", value1, value2, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_TIME not between", value1, value2, "csysMenuAuthTime");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIsNull() {
            addCriterion("CSYS_MENU_AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE =", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <>", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateGreaterThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE >", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE >=", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateLessThan(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_MENU_AUTH_DATE <=", value, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_DATE in", values, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotIn(List<Date> values) {
            addCriterion("CSYS_MENU_AUTH_DATE not in", values, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_DATE between", value1, value2, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_MENU_AUTH_DATE not between", value1, value2, "csysMenuAuthDate");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildIsNull() {
            addCriterion("CSYS_MENU_AUTH_HASCHILD is null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildIsNotNull() {
            addCriterion("CSYS_MENU_AUTH_HASCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD =", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildNotEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD <>", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildGreaterThan(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD >", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD >=", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildLessThan(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD <", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildLessThanOrEqualTo(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD <=", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildLike(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD like", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildNotLike(String value) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD not like", value, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD in", values, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildNotIn(List<String> values) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD not in", values, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD between", value1, value2, "csysMenuAuthHaschild");
            return (Criteria) this;
        }

        public Criteria andCsysMenuAuthHaschildNotBetween(String value1, String value2) {
            addCriterion("CSYS_MENU_AUTH_HASCHILD not between", value1, value2, "csysMenuAuthHaschild");
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