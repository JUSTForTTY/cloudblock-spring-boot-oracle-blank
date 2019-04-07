package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysRoleExample() {
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

        public Criteria andCsysDepartIdIsNull() {
            addCriterion("CSYS_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdIsNotNull() {
            addCriterion("CSYS_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdEqualTo(String value) {
            addCriterion("CSYS_DEPART_ID =", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdNotEqualTo(String value) {
            addCriterion("CSYS_DEPART_ID <>", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdGreaterThan(String value) {
            addCriterion("CSYS_DEPART_ID >", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPART_ID >=", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdLessThan(String value) {
            addCriterion("CSYS_DEPART_ID <", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_DEPART_ID <=", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdLike(String value) {
            addCriterion("CSYS_DEPART_ID like", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdNotLike(String value) {
            addCriterion("CSYS_DEPART_ID not like", value, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdIn(List<String> values) {
            addCriterion("CSYS_DEPART_ID in", values, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdNotIn(List<String> values) {
            addCriterion("CSYS_DEPART_ID not in", values, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdBetween(String value1, String value2) {
            addCriterion("CSYS_DEPART_ID between", value1, value2, "csysDepartId");
            return (Criteria) this;
        }

        public Criteria andCsysDepartIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_DEPART_ID not between", value1, value2, "csysDepartId");
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

        public Criteria andCsysRoleDescIsNull() {
            addCriterion("CSYS_ROLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescIsNotNull() {
            addCriterion("CSYS_ROLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescEqualTo(String value) {
            addCriterion("CSYS_ROLE_DESC =", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_DESC <>", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescGreaterThan(String value) {
            addCriterion("CSYS_ROLE_DESC >", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_DESC >=", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescLessThan(String value) {
            addCriterion("CSYS_ROLE_DESC <", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_DESC <=", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescLike(String value) {
            addCriterion("CSYS_ROLE_DESC like", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescNotLike(String value) {
            addCriterion("CSYS_ROLE_DESC not like", value, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescIn(List<String> values) {
            addCriterion("CSYS_ROLE_DESC in", values, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_DESC not in", values, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_DESC between", value1, value2, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_DESC not between", value1, value2, "csysRoleDesc");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeIsNull() {
            addCriterion("CSYS_ROLE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeIsNotNull() {
            addCriterion("CSYS_ROLE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME =", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME <>", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME >", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME >=", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeLessThan(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME <", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_CREATE_TIME <=", value, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_ROLE_CREATE_TIME in", values, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ROLE_CREATE_TIME not in", values, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_CREATE_TIME between", value1, value2, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_CREATE_TIME not between", value1, value2, "csysRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserIsNull() {
            addCriterion("CSYS_ROLE_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserIsNotNull() {
            addCriterion("CSYS_ROLE_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserEqualTo(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER =", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER <>", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserGreaterThan(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER >", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER >=", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserLessThan(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER <", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER <=", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserLike(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER like", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserNotLike(String value) {
            addCriterion("CSYS_ROLE_CREATE_USER not like", value, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserIn(List<String> values) {
            addCriterion("CSYS_ROLE_CREATE_USER in", values, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_CREATE_USER not in", values, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_CREATE_USER between", value1, value2, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_CREATE_USER not between", value1, value2, "csysRoleCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeIsNull() {
            addCriterion("CSYS_ROLE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeIsNotNull() {
            addCriterion("CSYS_ROLE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME =", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME <>", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME >", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME >=", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeLessThan(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME <", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_MODIFY_TIME <=", value, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_ROLE_MODIFY_TIME in", values, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ROLE_MODIFY_TIME not in", values, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_MODIFY_TIME between", value1, value2, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_MODIFY_TIME not between", value1, value2, "csysRoleModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserIsNull() {
            addCriterion("CSYS_ROLE_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserIsNotNull() {
            addCriterion("CSYS_ROLE_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserEqualTo(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER =", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER <>", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserGreaterThan(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER >", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER >=", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserLessThan(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER <", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER <=", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserLike(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER like", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserNotLike(String value) {
            addCriterion("CSYS_ROLE_MODIFY_USER not like", value, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserIn(List<String> values) {
            addCriterion("CSYS_ROLE_MODIFY_USER in", values, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_MODIFY_USER not in", values, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_MODIFY_USER between", value1, value2, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_MODIFY_USER not between", value1, value2, "csysRoleModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteIsNull() {
            addCriterion("CSYS_ROLE_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteIsNotNull() {
            addCriterion("CSYS_ROLE_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteEqualTo(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE =", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE <>", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE >", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE >=", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteLessThan(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE <", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE <=", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteLike(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE like", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteNotLike(String value) {
            addCriterion("CSYS_ROLE_IS_DELETE not like", value, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteIn(List<String> values) {
            addCriterion("CSYS_ROLE_IS_DELETE in", values, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_ROLE_IS_DELETE not in", values, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_IS_DELETE between", value1, value2, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_ROLE_IS_DELETE not between", value1, value2, "csysRoleIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeIsNull() {
            addCriterion("CSYS_ROLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeIsNotNull() {
            addCriterion("CSYS_ROLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeEqualTo(Date value) {
            addCriterion("CSYS_ROLE_TIME =", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeNotEqualTo(Date value) {
            addCriterion("CSYS_ROLE_TIME <>", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeGreaterThan(Date value) {
            addCriterion("CSYS_ROLE_TIME >", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_TIME >=", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeLessThan(Date value) {
            addCriterion("CSYS_ROLE_TIME <", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_TIME <=", value, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeIn(List<Date> values) {
            addCriterion("CSYS_ROLE_TIME in", values, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeNotIn(List<Date> values) {
            addCriterion("CSYS_ROLE_TIME not in", values, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_TIME between", value1, value2, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_TIME not between", value1, value2, "csysRoleTime");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateIsNull() {
            addCriterion("CSYS_ROLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateIsNotNull() {
            addCriterion("CSYS_ROLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateEqualTo(Date value) {
            addCriterion("CSYS_ROLE_DATE =", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateNotEqualTo(Date value) {
            addCriterion("CSYS_ROLE_DATE <>", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateGreaterThan(Date value) {
            addCriterion("CSYS_ROLE_DATE >", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_DATE >=", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateLessThan(Date value) {
            addCriterion("CSYS_ROLE_DATE <", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_ROLE_DATE <=", value, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateIn(List<Date> values) {
            addCriterion("CSYS_ROLE_DATE in", values, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateNotIn(List<Date> values) {
            addCriterion("CSYS_ROLE_DATE not in", values, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_DATE between", value1, value2, "csysRoleDate");
            return (Criteria) this;
        }

        public Criteria andCsysRoleDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_ROLE_DATE not between", value1, value2, "csysRoleDate");
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