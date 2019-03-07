package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysProjectExample() {
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

        public Criteria andCySysProjectIdIsNull() {
            addCriterion("cy_sys_project_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdIsNotNull() {
            addCriterion("cy_sys_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdEqualTo(String value) {
            addCriterion("cy_sys_project_id =", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotEqualTo(String value) {
            addCriterion("cy_sys_project_id <>", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdGreaterThan(String value) {
            addCriterion("cy_sys_project_id >", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_id >=", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLessThan(String value) {
            addCriterion("cy_sys_project_id <", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_id <=", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdLike(String value) {
            addCriterion("cy_sys_project_id like", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotLike(String value) {
            addCriterion("cy_sys_project_id not like", value, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdIn(List<String> values) {
            addCriterion("cy_sys_project_id in", values, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotIn(List<String> values) {
            addCriterion("cy_sys_project_id not in", values, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdBetween(String value1, String value2) {
            addCriterion("cy_sys_project_id between", value1, value2, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_id not between", value1, value2, "cySysProjectId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeIsNull() {
            addCriterion("cy_sys_project_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeIsNotNull() {
            addCriterion("cy_sys_project_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeEqualTo(String value) {
            addCriterion("cy_sys_project_code =", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotEqualTo(String value) {
            addCriterion("cy_sys_project_code <>", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeGreaterThan(String value) {
            addCriterion("cy_sys_project_code >", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_code >=", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLessThan(String value) {
            addCriterion("cy_sys_project_code <", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_code <=", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeLike(String value) {
            addCriterion("cy_sys_project_code like", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotLike(String value) {
            addCriterion("cy_sys_project_code not like", value, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeIn(List<String> values) {
            addCriterion("cy_sys_project_code in", values, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotIn(List<String> values) {
            addCriterion("cy_sys_project_code not in", values, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_project_code between", value1, value2, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_code not between", value1, value2, "cySysProjectCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIsNull() {
            addCriterion("cy_sys_project_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIsNotNull() {
            addCriterion("cy_sys_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameEqualTo(String value) {
            addCriterion("cy_sys_project_name =", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_name <>", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameGreaterThan(String value) {
            addCriterion("cy_sys_project_name >", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_name >=", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLessThan(String value) {
            addCriterion("cy_sys_project_name <", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_name <=", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameLike(String value) {
            addCriterion("cy_sys_project_name like", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotLike(String value) {
            addCriterion("cy_sys_project_name not like", value, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameIn(List<String> values) {
            addCriterion("cy_sys_project_name in", values, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_name not in", values, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_name between", value1, value2, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_name not between", value1, value2, "cySysProjectName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconIsNull() {
            addCriterion("cy_sys_project_icon is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconIsNotNull() {
            addCriterion("cy_sys_project_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconEqualTo(String value) {
            addCriterion("cy_sys_project_icon =", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotEqualTo(String value) {
            addCriterion("cy_sys_project_icon <>", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconGreaterThan(String value) {
            addCriterion("cy_sys_project_icon >", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_icon >=", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLessThan(String value) {
            addCriterion("cy_sys_project_icon <", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_icon <=", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconLike(String value) {
            addCriterion("cy_sys_project_icon like", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotLike(String value) {
            addCriterion("cy_sys_project_icon not like", value, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconIn(List<String> values) {
            addCriterion("cy_sys_project_icon in", values, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotIn(List<String> values) {
            addCriterion("cy_sys_project_icon not in", values, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconBetween(String value1, String value2) {
            addCriterion("cy_sys_project_icon between", value1, value2, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIconNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_icon not between", value1, value2, "cySysProjectIcon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIsNull() {
            addCriterion("cy_sys_project_is_original is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIsNotNull() {
            addCriterion("cy_sys_project_is_original is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalEqualTo(String value) {
            addCriterion("cy_sys_project_is_original =", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotEqualTo(String value) {
            addCriterion("cy_sys_project_is_original <>", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalGreaterThan(String value) {
            addCriterion("cy_sys_project_is_original >", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_original >=", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLessThan(String value) {
            addCriterion("cy_sys_project_is_original <", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_original <=", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalLike(String value) {
            addCriterion("cy_sys_project_is_original like", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotLike(String value) {
            addCriterion("cy_sys_project_is_original not like", value, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalIn(List<String> values) {
            addCriterion("cy_sys_project_is_original in", values, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotIn(List<String> values) {
            addCriterion("cy_sys_project_is_original not in", values, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_original between", value1, value2, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsOriginalNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_original not between", value1, value2, "cySysProjectIsOriginal");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIsNull() {
            addCriterion("cy_sys_project_db_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIsNotNull() {
            addCriterion("cy_sys_project_db_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlEqualTo(String value) {
            addCriterion("cy_sys_project_db_url =", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_url <>", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_db_url >", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_url >=", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLessThan(String value) {
            addCriterion("cy_sys_project_db_url <", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_url <=", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlLike(String value) {
            addCriterion("cy_sys_project_db_url like", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotLike(String value) {
            addCriterion("cy_sys_project_db_url not like", value, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlIn(List<String> values) {
            addCriterion("cy_sys_project_db_url in", values, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_url not in", values, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_url between", value1, value2, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_url not between", value1, value2, "cySysProjectDbUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIsNull() {
            addCriterion("cy_sys_project_db_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIsNotNull() {
            addCriterion("cy_sys_project_db_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameEqualTo(String value) {
            addCriterion("cy_sys_project_db_username =", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_username <>", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameGreaterThan(String value) {
            addCriterion("cy_sys_project_db_username >", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_username >=", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLessThan(String value) {
            addCriterion("cy_sys_project_db_username <", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_username <=", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameLike(String value) {
            addCriterion("cy_sys_project_db_username like", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotLike(String value) {
            addCriterion("cy_sys_project_db_username not like", value, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameIn(List<String> values) {
            addCriterion("cy_sys_project_db_username in", values, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_username not in", values, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_username between", value1, value2, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_username not between", value1, value2, "cySysProjectDbUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIsNull() {
            addCriterion("cy_sys_project_db_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIsNotNull() {
            addCriterion("cy_sys_project_db_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordEqualTo(String value) {
            addCriterion("cy_sys_project_db_password =", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_project_db_password <>", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordGreaterThan(String value) {
            addCriterion("cy_sys_project_db_password >", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_password >=", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLessThan(String value) {
            addCriterion("cy_sys_project_db_password <", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_db_password <=", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordLike(String value) {
            addCriterion("cy_sys_project_db_password like", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotLike(String value) {
            addCriterion("cy_sys_project_db_password not like", value, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordIn(List<String> values) {
            addCriterion("cy_sys_project_db_password in", values, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_project_db_password not in", values, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_password between", value1, value2, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDbPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_db_password not between", value1, value2, "cySysProjectDbPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIsNull() {
            addCriterion("cy_sys_project_server_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIsNotNull() {
            addCriterion("cy_sys_project_server_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlEqualTo(String value) {
            addCriterion("cy_sys_project_server_url =", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_url <>", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_server_url >", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_url >=", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLessThan(String value) {
            addCriterion("cy_sys_project_server_url <", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_url <=", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlLike(String value) {
            addCriterion("cy_sys_project_server_url like", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotLike(String value) {
            addCriterion("cy_sys_project_server_url not like", value, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlIn(List<String> values) {
            addCriterion("cy_sys_project_server_url in", values, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_url not in", values, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_url between", value1, value2, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_url not between", value1, value2, "cySysProjectServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIsNull() {
            addCriterion("cy_sys_project_server_domain_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIsNotNull() {
            addCriterion("cy_sys_project_server_domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name =", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name <>", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameGreaterThan(String value) {
            addCriterion("cy_sys_project_server_domain_name >", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name >=", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLessThan(String value) {
            addCriterion("cy_sys_project_server_domain_name <", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_domain_name <=", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameLike(String value) {
            addCriterion("cy_sys_project_server_domain_name like", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotLike(String value) {
            addCriterion("cy_sys_project_server_domain_name not like", value, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameIn(List<String> values) {
            addCriterion("cy_sys_project_server_domain_name in", values, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_domain_name not in", values, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_domain_name between", value1, value2, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerDomainNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_domain_name not between", value1, value2, "cySysProjectServerDomainName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIsNull() {
            addCriterion("cy_sys_project_server_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIsNotNull() {
            addCriterion("cy_sys_project_server_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameEqualTo(String value) {
            addCriterion("cy_sys_project_server_username =", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_username <>", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameGreaterThan(String value) {
            addCriterion("cy_sys_project_server_username >", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_username >=", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLessThan(String value) {
            addCriterion("cy_sys_project_server_username <", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_username <=", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameLike(String value) {
            addCriterion("cy_sys_project_server_username like", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotLike(String value) {
            addCriterion("cy_sys_project_server_username not like", value, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameIn(List<String> values) {
            addCriterion("cy_sys_project_server_username in", values, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_username not in", values, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_username between", value1, value2, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_username not between", value1, value2, "cySysProjectServerUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIsNull() {
            addCriterion("cy_sys_project_server_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIsNotNull() {
            addCriterion("cy_sys_project_server_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordEqualTo(String value) {
            addCriterion("cy_sys_project_server_password =", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_password <>", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordGreaterThan(String value) {
            addCriterion("cy_sys_project_server_password >", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_password >=", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLessThan(String value) {
            addCriterion("cy_sys_project_server_password <", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_password <=", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordLike(String value) {
            addCriterion("cy_sys_project_server_password like", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotLike(String value) {
            addCriterion("cy_sys_project_server_password not like", value, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordIn(List<String> values) {
            addCriterion("cy_sys_project_server_password in", values, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_password not in", values, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_password between", value1, value2, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_password not between", value1, value2, "cySysProjectServerPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeIsNull() {
            addCriterion("cy_sys_project_server_code is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeIsNotNull() {
            addCriterion("cy_sys_project_server_code is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeEqualTo(String value) {
            addCriterion("cy_sys_project_server_code =", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeNotEqualTo(String value) {
            addCriterion("cy_sys_project_server_code <>", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeGreaterThan(String value) {
            addCriterion("cy_sys_project_server_code >", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_code >=", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeLessThan(String value) {
            addCriterion("cy_sys_project_server_code <", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_server_code <=", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeLike(String value) {
            addCriterion("cy_sys_project_server_code like", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeNotLike(String value) {
            addCriterion("cy_sys_project_server_code not like", value, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeIn(List<String> values) {
            addCriterion("cy_sys_project_server_code in", values, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeNotIn(List<String> values) {
            addCriterion("cy_sys_project_server_code not in", values, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_code between", value1, value2, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectServerCodeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_server_code not between", value1, value2, "cySysProjectServerCode");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonIsNull() {
            addCriterion("cy_sys_project_front_positon is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonIsNotNull() {
            addCriterion("cy_sys_project_front_positon is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonEqualTo(String value) {
            addCriterion("cy_sys_project_front_positon =", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonNotEqualTo(String value) {
            addCriterion("cy_sys_project_front_positon <>", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonGreaterThan(String value) {
            addCriterion("cy_sys_project_front_positon >", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_front_positon >=", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonLessThan(String value) {
            addCriterion("cy_sys_project_front_positon <", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_front_positon <=", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonLike(String value) {
            addCriterion("cy_sys_project_front_positon like", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonNotLike(String value) {
            addCriterion("cy_sys_project_front_positon not like", value, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonIn(List<String> values) {
            addCriterion("cy_sys_project_front_positon in", values, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonNotIn(List<String> values) {
            addCriterion("cy_sys_project_front_positon not in", values, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonBetween(String value1, String value2) {
            addCriterion("cy_sys_project_front_positon between", value1, value2, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectFrontPositonNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_front_positon not between", value1, value2, "cySysProjectFrontPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonIsNull() {
            addCriterion("cy_sys_project_back_positon is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonIsNotNull() {
            addCriterion("cy_sys_project_back_positon is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonEqualTo(String value) {
            addCriterion("cy_sys_project_back_positon =", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonNotEqualTo(String value) {
            addCriterion("cy_sys_project_back_positon <>", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonGreaterThan(String value) {
            addCriterion("cy_sys_project_back_positon >", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_back_positon >=", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonLessThan(String value) {
            addCriterion("cy_sys_project_back_positon <", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_back_positon <=", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonLike(String value) {
            addCriterion("cy_sys_project_back_positon like", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonNotLike(String value) {
            addCriterion("cy_sys_project_back_positon not like", value, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonIn(List<String> values) {
            addCriterion("cy_sys_project_back_positon in", values, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonNotIn(List<String> values) {
            addCriterion("cy_sys_project_back_positon not in", values, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonBetween(String value1, String value2) {
            addCriterion("cy_sys_project_back_positon between", value1, value2, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectBackPositonNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_back_positon not between", value1, value2, "cySysProjectBackPositon");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionIsNull() {
            addCriterion("cy_sys_project_publish_server_position is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionIsNotNull() {
            addCriterion("cy_sys_project_publish_server_position is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_position =", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_position <>", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_server_position >", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_position >=", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionLessThan(String value) {
            addCriterion("cy_sys_project_publish_server_position <", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_position <=", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionLike(String value) {
            addCriterion("cy_sys_project_publish_server_position like", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionNotLike(String value) {
            addCriterion("cy_sys_project_publish_server_position not like", value, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionIn(List<String> values) {
            addCriterion("cy_sys_project_publish_server_position in", values, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_server_position not in", values, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_server_position between", value1, value2, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerPositionNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_server_position not between", value1, value2, "cySysProjectPublishServerPosition");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionIsNull() {
            addCriterion("cy_sys_project_git_version is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionIsNotNull() {
            addCriterion("cy_sys_project_git_version is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionEqualTo(String value) {
            addCriterion("cy_sys_project_git_version =", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionNotEqualTo(String value) {
            addCriterion("cy_sys_project_git_version <>", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionGreaterThan(String value) {
            addCriterion("cy_sys_project_git_version >", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_version >=", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionLessThan(String value) {
            addCriterion("cy_sys_project_git_version <", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_version <=", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionLike(String value) {
            addCriterion("cy_sys_project_git_version like", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionNotLike(String value) {
            addCriterion("cy_sys_project_git_version not like", value, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionIn(List<String> values) {
            addCriterion("cy_sys_project_git_version in", values, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionNotIn(List<String> values) {
            addCriterion("cy_sys_project_git_version not in", values, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_version between", value1, value2, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitVersionNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_version not between", value1, value2, "cySysProjectGitVersion");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameIsNull() {
            addCriterion("cy_sys_project_git_front_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameIsNotNull() {
            addCriterion("cy_sys_project_git_front_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_name =", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_name <>", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameGreaterThan(String value) {
            addCriterion("cy_sys_project_git_front_name >", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_name >=", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameLessThan(String value) {
            addCriterion("cy_sys_project_git_front_name <", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_name <=", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameLike(String value) {
            addCriterion("cy_sys_project_git_front_name like", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameNotLike(String value) {
            addCriterion("cy_sys_project_git_front_name not like", value, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameIn(List<String> values) {
            addCriterion("cy_sys_project_git_front_name in", values, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_git_front_name not in", values, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_front_name between", value1, value2, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_front_name not between", value1, value2, "cySysProjectGitFrontName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameIsNull() {
            addCriterion("cy_sys_project_git_back_name is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameIsNotNull() {
            addCriterion("cy_sys_project_git_back_name is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_name =", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameNotEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_name <>", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameGreaterThan(String value) {
            addCriterion("cy_sys_project_git_back_name >", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_name >=", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameLessThan(String value) {
            addCriterion("cy_sys_project_git_back_name <", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_name <=", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameLike(String value) {
            addCriterion("cy_sys_project_git_back_name like", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameNotLike(String value) {
            addCriterion("cy_sys_project_git_back_name not like", value, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameIn(List<String> values) {
            addCriterion("cy_sys_project_git_back_name in", values, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameNotIn(List<String> values) {
            addCriterion("cy_sys_project_git_back_name not in", values, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_back_name between", value1, value2, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackNameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_back_name not between", value1, value2, "cySysProjectGitBackName");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlIsNull() {
            addCriterion("cy_sys_project_git_front_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlIsNotNull() {
            addCriterion("cy_sys_project_git_front_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_url =", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_url <>", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_git_front_url >", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_url >=", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlLessThan(String value) {
            addCriterion("cy_sys_project_git_front_url <", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_front_url <=", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlLike(String value) {
            addCriterion("cy_sys_project_git_front_url like", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlNotLike(String value) {
            addCriterion("cy_sys_project_git_front_url not like", value, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlIn(List<String> values) {
            addCriterion("cy_sys_project_git_front_url in", values, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_git_front_url not in", values, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_front_url between", value1, value2, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitFrontUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_front_url not between", value1, value2, "cySysProjectGitFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlIsNull() {
            addCriterion("cy_sys_project_git_back_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlIsNotNull() {
            addCriterion("cy_sys_project_git_back_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_url =", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_url <>", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_git_back_url >", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_url >=", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlLessThan(String value) {
            addCriterion("cy_sys_project_git_back_url <", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_git_back_url <=", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlLike(String value) {
            addCriterion("cy_sys_project_git_back_url like", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlNotLike(String value) {
            addCriterion("cy_sys_project_git_back_url not like", value, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlIn(List<String> values) {
            addCriterion("cy_sys_project_git_back_url in", values, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_git_back_url not in", values, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_back_url between", value1, value2, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectGitBackUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_git_back_url not between", value1, value2, "cySysProjectGitBackUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberIsNull() {
            addCriterion("cy_sys_project_publish_number is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberIsNotNull() {
            addCriterion("cy_sys_project_publish_number is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberEqualTo(Integer value) {
            addCriterion("cy_sys_project_publish_number =", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberNotEqualTo(Integer value) {
            addCriterion("cy_sys_project_publish_number <>", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberGreaterThan(Integer value) {
            addCriterion("cy_sys_project_publish_number >", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_project_publish_number >=", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberLessThan(Integer value) {
            addCriterion("cy_sys_project_publish_number <", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cy_sys_project_publish_number <=", value, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberIn(List<Integer> values) {
            addCriterion("cy_sys_project_publish_number in", values, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberNotIn(List<Integer> values) {
            addCriterion("cy_sys_project_publish_number not in", values, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_project_publish_number between", value1, value2, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_sys_project_publish_number not between", value1, value2, "cySysProjectPublishNumber");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentIsNull() {
            addCriterion("cy_sys_project_publish_pass_percent is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentIsNotNull() {
            addCriterion("cy_sys_project_publish_pass_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentEqualTo(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent =", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentNotEqualTo(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent <>", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentGreaterThan(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent >", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent >=", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentLessThan(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent <", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cy_sys_project_publish_pass_percent <=", value, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentIn(List<BigDecimal> values) {
            addCriterion("cy_sys_project_publish_pass_percent in", values, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentNotIn(List<BigDecimal> values) {
            addCriterion("cy_sys_project_publish_pass_percent not in", values, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cy_sys_project_publish_pass_percent between", value1, value2, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishPassPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cy_sys_project_publish_pass_percent not between", value1, value2, "cySysProjectPublishPassPercent");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusIsNull() {
            addCriterion("cy_sys_project_publish_last_status is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusIsNotNull() {
            addCriterion("cy_sys_project_publish_last_status is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusEqualTo(String value) {
            addCriterion("cy_sys_project_publish_last_status =", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_last_status <>", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_last_status >", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_last_status >=", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusLessThan(String value) {
            addCriterion("cy_sys_project_publish_last_status <", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_last_status <=", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusLike(String value) {
            addCriterion("cy_sys_project_publish_last_status like", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusNotLike(String value) {
            addCriterion("cy_sys_project_publish_last_status not like", value, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusIn(List<String> values) {
            addCriterion("cy_sys_project_publish_last_status in", values, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_last_status not in", values, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_last_status between", value1, value2, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastStatusNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_last_status not between", value1, value2, "cySysProjectPublishLastStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeIsNull() {
            addCriterion("cy_sys_project_publish_last_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeIsNotNull() {
            addCriterion("cy_sys_project_publish_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_last_time =", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_last_time <>", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeGreaterThan(Date value) {
            addCriterion("cy_sys_project_publish_last_time >", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_last_time >=", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeLessThan(Date value) {
            addCriterion("cy_sys_project_publish_last_time <", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_last_time <=", value, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_last_time in", values, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_last_time not in", values, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_last_time between", value1, value2, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_last_time not between", value1, value2, "cySysProjectPublishLastTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlIsNull() {
            addCriterion("cy_sys_project_jenkins_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlIsNotNull() {
            addCriterion("cy_sys_project_jenkins_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_url =", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_url <>", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_jenkins_url >", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_url >=", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlLessThan(String value) {
            addCriterion("cy_sys_project_jenkins_url <", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_url <=", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlLike(String value) {
            addCriterion("cy_sys_project_jenkins_url like", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlNotLike(String value) {
            addCriterion("cy_sys_project_jenkins_url not like", value, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_url in", values, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_url not in", values, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_url between", value1, value2, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_url not between", value1, value2, "cySysProjectJenkinsUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameIsNull() {
            addCriterion("cy_sys_project_jenkins_username is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameIsNotNull() {
            addCriterion("cy_sys_project_jenkins_username is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_username =", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameNotEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_username <>", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameGreaterThan(String value) {
            addCriterion("cy_sys_project_jenkins_username >", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_username >=", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameLessThan(String value) {
            addCriterion("cy_sys_project_jenkins_username <", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_username <=", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameLike(String value) {
            addCriterion("cy_sys_project_jenkins_username like", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameNotLike(String value) {
            addCriterion("cy_sys_project_jenkins_username not like", value, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_username in", values, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameNotIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_username not in", values, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_username between", value1, value2, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsUsernameNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_username not between", value1, value2, "cySysProjectJenkinsUsername");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordIsNull() {
            addCriterion("cy_sys_project_jenkins_password is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordIsNotNull() {
            addCriterion("cy_sys_project_jenkins_password is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_password =", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordNotEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_password <>", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordGreaterThan(String value) {
            addCriterion("cy_sys_project_jenkins_password >", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_password >=", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordLessThan(String value) {
            addCriterion("cy_sys_project_jenkins_password <", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_jenkins_password <=", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordLike(String value) {
            addCriterion("cy_sys_project_jenkins_password like", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordNotLike(String value) {
            addCriterion("cy_sys_project_jenkins_password not like", value, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_password in", values, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordNotIn(List<String> values) {
            addCriterion("cy_sys_project_jenkins_password not in", values, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_password between", value1, value2, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectJenkinsPasswordNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_jenkins_password not between", value1, value2, "cySysProjectJenkinsPassword");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIsNull() {
            addCriterion("cy_sys_project_desc is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIsNotNull() {
            addCriterion("cy_sys_project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescEqualTo(String value) {
            addCriterion("cy_sys_project_desc =", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotEqualTo(String value) {
            addCriterion("cy_sys_project_desc <>", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescGreaterThan(String value) {
            addCriterion("cy_sys_project_desc >", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_desc >=", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLessThan(String value) {
            addCriterion("cy_sys_project_desc <", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_desc <=", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescLike(String value) {
            addCriterion("cy_sys_project_desc like", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotLike(String value) {
            addCriterion("cy_sys_project_desc not like", value, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescIn(List<String> values) {
            addCriterion("cy_sys_project_desc in", values, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotIn(List<String> values) {
            addCriterion("cy_sys_project_desc not in", values, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescBetween(String value1, String value2) {
            addCriterion("cy_sys_project_desc between", value1, value2, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectDescNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_desc not between", value1, value2, "cySysProjectDesc");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeIsNull() {
            addCriterion("cy_sys_project_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeIsNotNull() {
            addCriterion("cy_sys_project_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_project_create_time =", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_project_create_time <>", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_project_create_time >", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_create_time >=", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_project_create_time <", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_create_time <=", value, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_project_create_time in", values, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_project_create_time not in", values, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_create_time between", value1, value2, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_create_time not between", value1, value2, "cySysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserIsNull() {
            addCriterion("cy_sys_project_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserIsNotNull() {
            addCriterion("cy_sys_project_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserEqualTo(String value) {
            addCriterion("cy_sys_project_create_user =", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_project_create_user <>", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_project_create_user >", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_create_user >=", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserLessThan(String value) {
            addCriterion("cy_sys_project_create_user <", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_create_user <=", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserLike(String value) {
            addCriterion("cy_sys_project_create_user like", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserNotLike(String value) {
            addCriterion("cy_sys_project_create_user not like", value, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserIn(List<String> values) {
            addCriterion("cy_sys_project_create_user in", values, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_project_create_user not in", values, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_project_create_user between", value1, value2, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_create_user not between", value1, value2, "cySysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeIsNull() {
            addCriterion("cy_sys_project_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeIsNotNull() {
            addCriterion("cy_sys_project_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_project_modify_time =", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_project_modify_time <>", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_project_modify_time >", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_modify_time >=", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_project_modify_time <", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_modify_time <=", value, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_project_modify_time in", values, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_project_modify_time not in", values, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_modify_time between", value1, value2, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_modify_time not between", value1, value2, "cySysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserIsNull() {
            addCriterion("cy_sys_project_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserIsNotNull() {
            addCriterion("cy_sys_project_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserEqualTo(String value) {
            addCriterion("cy_sys_project_modify_user =", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_project_modify_user <>", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_project_modify_user >", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_modify_user >=", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserLessThan(String value) {
            addCriterion("cy_sys_project_modify_user <", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_modify_user <=", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserLike(String value) {
            addCriterion("cy_sys_project_modify_user like", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserNotLike(String value) {
            addCriterion("cy_sys_project_modify_user not like", value, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserIn(List<String> values) {
            addCriterion("cy_sys_project_modify_user in", values, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_project_modify_user not in", values, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_project_modify_user between", value1, value2, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_modify_user not between", value1, value2, "cySysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIsNull() {
            addCriterion("cy_sys_project_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIsNotNull() {
            addCriterion("cy_sys_project_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete =", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete <>", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_project_is_delete >", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete >=", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLessThan(String value) {
            addCriterion("cy_sys_project_is_delete <", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_is_delete <=", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteLike(String value) {
            addCriterion("cy_sys_project_is_delete like", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotLike(String value) {
            addCriterion("cy_sys_project_is_delete not like", value, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_project_is_delete in", values, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_project_is_delete not in", values, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_delete between", value1, value2, "cySysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_is_delete not between", value1, value2, "cySysProjectIsDelete");
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