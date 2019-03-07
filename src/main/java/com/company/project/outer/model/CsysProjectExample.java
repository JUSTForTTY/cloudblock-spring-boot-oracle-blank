package com.company.project.outer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysProjectExample() {
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

        public Criteria andCsysProjectIdIsNull() {
            addCriterion("CSYS_PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdIsNotNull() {
            addCriterion("CSYS_PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdEqualTo(String value) {
            addCriterion("CSYS_PROJECT_ID =", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_ID <>", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_ID >", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_ID >=", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdLessThan(String value) {
            addCriterion("CSYS_PROJECT_ID <", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_ID <=", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdLike(String value) {
            addCriterion("CSYS_PROJECT_ID like", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdNotLike(String value) {
            addCriterion("CSYS_PROJECT_ID not like", value, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdIn(List<String> values) {
            addCriterion("CSYS_PROJECT_ID in", values, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_ID not in", values, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_ID between", value1, value2, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_ID not between", value1, value2, "csysProjectId");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameIsNull() {
            addCriterion("CSYS_PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameIsNotNull() {
            addCriterion("CSYS_PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAME =", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAME <>", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_NAME >", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAME >=", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameLessThan(String value) {
            addCriterion("CSYS_PROJECT_NAME <", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAME <=", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameLike(String value) {
            addCriterion("CSYS_PROJECT_NAME like", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameNotLike(String value) {
            addCriterion("CSYS_PROJECT_NAME not like", value, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameIn(List<String> values) {
            addCriterion("CSYS_PROJECT_NAME in", values, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_NAME not in", values, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_NAME between", value1, value2, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_NAME not between", value1, value2, "csysProjectName");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyIsNull() {
            addCriterion("CSYS_PROJECT_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyIsNotNull() {
            addCriterion("CSYS_PROJECT_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyEqualTo(String value) {
            addCriterion("CSYS_PROJECT_COMPANY =", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_COMPANY <>", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_COMPANY >", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_COMPANY >=", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyLessThan(String value) {
            addCriterion("CSYS_PROJECT_COMPANY <", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_COMPANY <=", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyLike(String value) {
            addCriterion("CSYS_PROJECT_COMPANY like", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyNotLike(String value) {
            addCriterion("CSYS_PROJECT_COMPANY not like", value, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyIn(List<String> values) {
            addCriterion("CSYS_PROJECT_COMPANY in", values, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_COMPANY not in", values, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_COMPANY between", value1, value2, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCompanyNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_COMPANY not between", value1, value2, "csysProjectCompany");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoIsNull() {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoIsNotNull() {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO =", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO <>", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO >", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO >=", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoLessThan(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO <", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO <=", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoLike(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO like", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoNotLike(String value) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO not like", value, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO in", values, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO not in", values, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO between", value1, value2, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoginLogoNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOGIN_LOGO not between", value1, value2, "csysProjectLoginLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgIsNull() {
            addCriterion("CSYS_PROJECT_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgIsNotNull() {
            addCriterion("CSYS_PROJECT_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_BG =", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_BG <>", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_BG >", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_BG >=", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_BG <", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_BG <=", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgLike(String value) {
            addCriterion("CSYS_PROJECT_BG like", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_BG not like", value, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_BG in", values, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_BG not in", values, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_BG between", value1, value2, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_BG not between", value1, value2, "csysProjectBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoIsNull() {
            addCriterion("CSYS_PROJECT_LOADING_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoIsNotNull() {
            addCriterion("CSYS_PROJECT_LOADING_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO =", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO <>", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO >", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO >=", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoLessThan(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO <", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO <=", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoLike(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO like", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoNotLike(String value) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO not like", value, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO in", values, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO not in", values, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO between", value1, value2, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLoadingLogoNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOADING_LOGO not between", value1, value2, "csysProjectLoadingLogo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgIsNull() {
            addCriterion("CSYS_PROJECT_LOGO_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgIsNotNull() {
            addCriterion("CSYS_PROJECT_LOGO_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG =", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG <>", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG >", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG >=", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG <", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG <=", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgLike(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG like", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_LOGO_BG not like", value, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOGO_BG in", values, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_LOGO_BG not in", values, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOGO_BG between", value1, value2, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectLogoBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_LOGO_BG not between", value1, value2, "csysProjectLogoBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgIsNull() {
            addCriterion("CSYS_PROJECT_TOP_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgIsNotNull() {
            addCriterion("CSYS_PROJECT_TOP_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG =", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG <>", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG >", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG >=", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG <", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG <=", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgLike(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG like", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_TOP_BG not like", value, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_TOP_BG in", values, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_TOP_BG not in", values, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_TOP_BG between", value1, value2, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTopBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_TOP_BG not between", value1, value2, "csysProjectTopBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgIsNull() {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgIsNotNull() {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG =", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG <>", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG >", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG >=", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG <", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG <=", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgLike(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG like", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG not like", value, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG in", values, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG not in", values, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG between", value1, value2, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectNavigationBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_NAVIGATION_BG not between", value1, value2, "csysProjectNavigationBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorIsNull() {
            addCriterion("CSYS_PROJECT_SUSP_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorIsNotNull() {
            addCriterion("CSYS_PROJECT_SUSP_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR =", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR <>", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR >", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR >=", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorLessThan(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR <", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR <=", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorLike(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR like", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorNotLike(String value) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR not like", value, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorIn(List<String> values) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR in", values, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR not in", values, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR between", value1, value2, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSuspColorNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_SUSP_COLOR not between", value1, value2, "csysProjectSuspColor");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgIsNull() {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgIsNotNull() {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG =", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG <>", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG >", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG >=", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG <", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG <=", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgLike(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG like", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG not like", value, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG in", values, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG not in", values, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG between", value1, value2, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectMainMenuBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_MAIN_MENU_BG not between", value1, value2, "csysProjectMainMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgIsNull() {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgIsNotNull() {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG =", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG <>", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG >", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG >=", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgLessThan(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG <", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG <=", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgLike(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG like", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgNotLike(String value) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG not like", value, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgIn(List<String> values) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG in", values, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG not in", values, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG between", value1, value2, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectSubMenuBgNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_SUB_MENU_BG not between", value1, value2, "csysProjectSubMenuBg");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoIsNull() {
            addCriterion("CSYS_PROJECT_RECORD_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoIsNotNull() {
            addCriterion("CSYS_PROJECT_RECORD_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoEqualTo(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO =", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO <>", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO >", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO >=", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoLessThan(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO <", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO <=", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoLike(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO like", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoNotLike(String value) {
            addCriterion("CSYS_PROJECT_RECORD_INFO not like", value, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoIn(List<String> values) {
            addCriterion("CSYS_PROJECT_RECORD_INFO in", values, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_RECORD_INFO not in", values, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_RECORD_INFO between", value1, value2, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectRecordInfoNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_RECORD_INFO not between", value1, value2, "csysProjectRecordInfo");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleIsNull() {
            addCriterion("CSYS_PROJECT_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleIsNotNull() {
            addCriterion("CSYS_PROJECT_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleEqualTo(String value) {
            addCriterion("CSYS_PROJECT_STYLE =", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_STYLE <>", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_STYLE >", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_STYLE >=", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleLessThan(String value) {
            addCriterion("CSYS_PROJECT_STYLE <", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_STYLE <=", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleLike(String value) {
            addCriterion("CSYS_PROJECT_STYLE like", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleNotLike(String value) {
            addCriterion("CSYS_PROJECT_STYLE not like", value, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleIn(List<String> values) {
            addCriterion("CSYS_PROJECT_STYLE in", values, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_STYLE not in", values, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_STYLE between", value1, value2, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectStyleNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_STYLE not between", value1, value2, "csysProjectStyle");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeIsNull() {
            addCriterion("CSYS_PROJECT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeIsNotNull() {
            addCriterion("CSYS_PROJECT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME =", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME <>", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME >", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME >=", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME <", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_CREATE_TIME <=", value, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_CREATE_TIME in", values, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_CREATE_TIME not in", values, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_CREATE_TIME between", value1, value2, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_CREATE_TIME not between", value1, value2, "csysProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserIsNull() {
            addCriterion("CSYS_PROJECT_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserIsNotNull() {
            addCriterion("CSYS_PROJECT_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserEqualTo(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER =", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER <>", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER >", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER >=", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserLessThan(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER <", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER <=", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserLike(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER like", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserNotLike(String value) {
            addCriterion("CSYS_PROJECT_CREATE_USER not like", value, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserIn(List<String> values) {
            addCriterion("CSYS_PROJECT_CREATE_USER in", values, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_CREATE_USER not in", values, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_CREATE_USER between", value1, value2, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_CREATE_USER not between", value1, value2, "csysProjectCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeIsNull() {
            addCriterion("CSYS_PROJECT_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeIsNotNull() {
            addCriterion("CSYS_PROJECT_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME =", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME <>", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME >", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME >=", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME <", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME <=", value, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME in", values, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME not in", values, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME between", value1, value2, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_MODIFY_TIME not between", value1, value2, "csysProjectModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserIsNull() {
            addCriterion("CSYS_PROJECT_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserIsNotNull() {
            addCriterion("CSYS_PROJECT_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER =", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER <>", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER >", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER >=", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserLessThan(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER <", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER <=", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserLike(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER like", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserNotLike(String value) {
            addCriterion("CSYS_PROJECT_MODIFY_USER not like", value, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserIn(List<String> values) {
            addCriterion("CSYS_PROJECT_MODIFY_USER in", values, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_MODIFY_USER not in", values, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_MODIFY_USER between", value1, value2, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_MODIFY_USER not between", value1, value2, "csysProjectModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteIsNull() {
            addCriterion("CSYS_PROJECT_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteIsNotNull() {
            addCriterion("CSYS_PROJECT_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE =", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE <>", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE >", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE >=", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteLessThan(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE <", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE <=", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteLike(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE like", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteNotLike(String value) {
            addCriterion("CSYS_PROJECT_IS_DELETE not like", value, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PROJECT_IS_DELETE in", values, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PROJECT_IS_DELETE not in", values, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_IS_DELETE between", value1, value2, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PROJECT_IS_DELETE not between", value1, value2, "csysProjectIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeIsNull() {
            addCriterion("CSYS_PROJECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeIsNotNull() {
            addCriterion("CSYS_PROJECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_TIME =", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_TIME <>", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeGreaterThan(Date value) {
            addCriterion("CSYS_PROJECT_TIME >", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_TIME >=", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeLessThan(Date value) {
            addCriterion("CSYS_PROJECT_TIME <", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_TIME <=", value, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_TIME in", values, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_TIME not in", values, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_TIME between", value1, value2, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_TIME not between", value1, value2, "csysProjectTime");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateIsNull() {
            addCriterion("CSYS_PROJECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateIsNotNull() {
            addCriterion("CSYS_PROJECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_DATE =", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateNotEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_DATE <>", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateGreaterThan(Date value) {
            addCriterion("CSYS_PROJECT_DATE >", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_DATE >=", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateLessThan(Date value) {
            addCriterion("CSYS_PROJECT_DATE <", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PROJECT_DATE <=", value, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_DATE in", values, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateNotIn(List<Date> values) {
            addCriterion("CSYS_PROJECT_DATE not in", values, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_DATE between", value1, value2, "csysProjectDate");
            return (Criteria) this;
        }

        public Criteria andCsysProjectDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PROJECT_DATE not between", value1, value2, "csysProjectDate");
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