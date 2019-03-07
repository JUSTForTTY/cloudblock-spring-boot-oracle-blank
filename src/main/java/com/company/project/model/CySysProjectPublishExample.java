package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CySysProjectPublishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CySysProjectPublishExample() {
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

        public Criteria andCySysProjectPublishIdIsNull() {
            addCriterion("cy_sys_project_publish_id is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdIsNotNull() {
            addCriterion("cy_sys_project_publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdEqualTo(String value) {
            addCriterion("cy_sys_project_publish_id =", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_id <>", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_id >", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_id >=", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdLessThan(String value) {
            addCriterion("cy_sys_project_publish_id <", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_id <=", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdLike(String value) {
            addCriterion("cy_sys_project_publish_id like", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdNotLike(String value) {
            addCriterion("cy_sys_project_publish_id not like", value, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdIn(List<String> values) {
            addCriterion("cy_sys_project_publish_id in", values, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_id not in", values, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_id between", value1, value2, "cySysProjectPublishId");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIdNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_id not between", value1, value2, "cySysProjectPublishId");
            return (Criteria) this;
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

        public Criteria andCySysProjectPublishTypeIsNull() {
            addCriterion("cy_sys_project_publish_type is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeIsNotNull() {
            addCriterion("cy_sys_project_publish_type is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeEqualTo(String value) {
            addCriterion("cy_sys_project_publish_type =", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_type <>", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_type >", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_type >=", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeLessThan(String value) {
            addCriterion("cy_sys_project_publish_type <", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_type <=", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeLike(String value) {
            addCriterion("cy_sys_project_publish_type like", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeNotLike(String value) {
            addCriterion("cy_sys_project_publish_type not like", value, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeIn(List<String> values) {
            addCriterion("cy_sys_project_publish_type in", values, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_type not in", values, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_type between", value1, value2, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishTypeNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_type not between", value1, value2, "cySysProjectPublishType");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlIsNull() {
            addCriterion("cy_sys_project_publish_project_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlIsNotNull() {
            addCriterion("cy_sys_project_publish_project_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlEqualTo(String value) {
            addCriterion("cy_sys_project_publish_project_url =", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_project_url <>", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_project_url >", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_project_url >=", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlLessThan(String value) {
            addCriterion("cy_sys_project_publish_project_url <", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_project_url <=", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlLike(String value) {
            addCriterion("cy_sys_project_publish_project_url like", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlNotLike(String value) {
            addCriterion("cy_sys_project_publish_project_url not like", value, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlIn(List<String> values) {
            addCriterion("cy_sys_project_publish_project_url in", values, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_project_url not in", values, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_project_url between", value1, value2, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishProjectUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_project_url not between", value1, value2, "cySysProjectPublishProjectUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlIsNull() {
            addCriterion("cy_sys_project_publish_server_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlIsNotNull() {
            addCriterion("cy_sys_project_publish_server_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_url =", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_url <>", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_server_url >", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_url >=", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlLessThan(String value) {
            addCriterion("cy_sys_project_publish_server_url <", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_server_url <=", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlLike(String value) {
            addCriterion("cy_sys_project_publish_server_url like", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlNotLike(String value) {
            addCriterion("cy_sys_project_publish_server_url not like", value, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlIn(List<String> values) {
            addCriterion("cy_sys_project_publish_server_url in", values, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_server_url not in", values, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_server_url between", value1, value2, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishServerUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_server_url not between", value1, value2, "cySysProjectPublishServerUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlIsNull() {
            addCriterion("cy_sys_project_publish_local_url is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlIsNotNull() {
            addCriterion("cy_sys_project_publish_local_url is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlEqualTo(String value) {
            addCriterion("cy_sys_project_publish_local_url =", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_local_url <>", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_local_url >", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_local_url >=", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlLessThan(String value) {
            addCriterion("cy_sys_project_publish_local_url <", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_local_url <=", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlLike(String value) {
            addCriterion("cy_sys_project_publish_local_url like", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlNotLike(String value) {
            addCriterion("cy_sys_project_publish_local_url not like", value, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlIn(List<String> values) {
            addCriterion("cy_sys_project_publish_local_url in", values, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_local_url not in", values, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_local_url between", value1, value2, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishLocalUrlNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_local_url not between", value1, value2, "cySysProjectPublishLocalUrl");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusIsNull() {
            addCriterion("cy_sys_project_publish_status is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusIsNotNull() {
            addCriterion("cy_sys_project_publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusEqualTo(String value) {
            addCriterion("cy_sys_project_publish_status =", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_status <>", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_status >", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_status >=", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusLessThan(String value) {
            addCriterion("cy_sys_project_publish_status <", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_status <=", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusLike(String value) {
            addCriterion("cy_sys_project_publish_status like", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusNotLike(String value) {
            addCriterion("cy_sys_project_publish_status not like", value, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusIn(List<String> values) {
            addCriterion("cy_sys_project_publish_status in", values, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_status not in", values, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_status between", value1, value2, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishStatusNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_status not between", value1, value2, "cySysProjectPublishStatus");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeIsNull() {
            addCriterion("cy_sys_project_publish_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeIsNotNull() {
            addCriterion("cy_sys_project_publish_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_create_time =", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_create_time <>", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeGreaterThan(Date value) {
            addCriterion("cy_sys_project_publish_create_time >", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_create_time >=", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeLessThan(Date value) {
            addCriterion("cy_sys_project_publish_create_time <", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_create_time <=", value, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_create_time in", values, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_create_time not in", values, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_create_time between", value1, value2, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_create_time not between", value1, value2, "cySysProjectPublishCreateTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserIsNull() {
            addCriterion("cy_sys_project_publish_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserIsNotNull() {
            addCriterion("cy_sys_project_publish_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserEqualTo(String value) {
            addCriterion("cy_sys_project_publish_create_user =", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_create_user <>", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_create_user >", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_create_user >=", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserLessThan(String value) {
            addCriterion("cy_sys_project_publish_create_user <", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_create_user <=", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserLike(String value) {
            addCriterion("cy_sys_project_publish_create_user like", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserNotLike(String value) {
            addCriterion("cy_sys_project_publish_create_user not like", value, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserIn(List<String> values) {
            addCriterion("cy_sys_project_publish_create_user in", values, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_create_user not in", values, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_create_user between", value1, value2, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishCreateUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_create_user not between", value1, value2, "cySysProjectPublishCreateUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeIsNull() {
            addCriterion("cy_sys_project_publish_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeIsNotNull() {
            addCriterion("cy_sys_project_publish_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_modify_time =", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeNotEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_modify_time <>", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeGreaterThan(Date value) {
            addCriterion("cy_sys_project_publish_modify_time >", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_modify_time >=", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeLessThan(Date value) {
            addCriterion("cy_sys_project_publish_modify_time <", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cy_sys_project_publish_modify_time <=", value, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_modify_time in", values, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeNotIn(List<Date> values) {
            addCriterion("cy_sys_project_publish_modify_time not in", values, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_modify_time between", value1, value2, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cy_sys_project_publish_modify_time not between", value1, value2, "cySysProjectPublishModifyTime");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserIsNull() {
            addCriterion("cy_sys_project_publish_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserIsNotNull() {
            addCriterion("cy_sys_project_publish_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserEqualTo(String value) {
            addCriterion("cy_sys_project_publish_modify_user =", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_modify_user <>", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_modify_user >", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_modify_user >=", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserLessThan(String value) {
            addCriterion("cy_sys_project_publish_modify_user <", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_modify_user <=", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserLike(String value) {
            addCriterion("cy_sys_project_publish_modify_user like", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserNotLike(String value) {
            addCriterion("cy_sys_project_publish_modify_user not like", value, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserIn(List<String> values) {
            addCriterion("cy_sys_project_publish_modify_user in", values, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_modify_user not in", values, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_modify_user between", value1, value2, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishModifyUserNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_modify_user not between", value1, value2, "cySysProjectPublishModifyUser");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteIsNull() {
            addCriterion("cy_sys_project_publish_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteIsNotNull() {
            addCriterion("cy_sys_project_publish_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteEqualTo(String value) {
            addCriterion("cy_sys_project_publish_is_delete =", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteNotEqualTo(String value) {
            addCriterion("cy_sys_project_publish_is_delete <>", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteGreaterThan(String value) {
            addCriterion("cy_sys_project_publish_is_delete >", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_is_delete >=", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteLessThan(String value) {
            addCriterion("cy_sys_project_publish_is_delete <", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("cy_sys_project_publish_is_delete <=", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteLike(String value) {
            addCriterion("cy_sys_project_publish_is_delete like", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteNotLike(String value) {
            addCriterion("cy_sys_project_publish_is_delete not like", value, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteIn(List<String> values) {
            addCriterion("cy_sys_project_publish_is_delete in", values, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteNotIn(List<String> values) {
            addCriterion("cy_sys_project_publish_is_delete not in", values, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_is_delete between", value1, value2, "cySysProjectPublishIsDelete");
            return (Criteria) this;
        }

        public Criteria andCySysProjectPublishIsDeleteNotBetween(String value1, String value2) {
            addCriterion("cy_sys_project_publish_is_delete not between", value1, value2, "cySysProjectPublishIsDelete");
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