package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysExcelImportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysExcelImportExample() {
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

        public Criteria andCsysExcelImportIdIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID =", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID <>", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID >", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID >=", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID <", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID <=", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID like", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_ID not like", value, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_ID in", values, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_ID not in", values, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_ID between", value1, value2, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_ID not between", value1, value2, "csysExcelImportId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME =", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME <>", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME >", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME >=", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME <", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME <=", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME like", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME not like", value, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME in", values, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME not in", values, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME between", value1, value2, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_NAME not between", value1, value2, "csysExcelImportName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID =", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <>", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID >", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID >=", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID <=", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID like", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not like", value, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID in", values, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not in", values, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID between", value1, value2, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_ID not between", value1, value2, "csysViewExplainId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE =", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE <>", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE >", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE >=", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE <", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE <=", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE like", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE not like", value, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE in", values, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE not in", values, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE between", value1, value2, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_TYPE not between", value1, value2, "csysExcelImportType");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME =", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME <>", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME >", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME >=", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME <", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME <=", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME like", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME not like", value, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME in", values, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME not in", values, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME between", value1, value2, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDlNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DL_NAME not between", value1, value2, "csysExcelImportDlName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE =", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE <>", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE >", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE >=", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE <", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE <=", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE like", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE not like", value, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE in", values, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE not in", values, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE between", value1, value2, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportFileNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_FILE not between", value1, value2, "csysExcelImportFile");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowEqualTo(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW =", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowNotEqualTo(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW <>", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowGreaterThan(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW >", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowGreaterThanOrEqualTo(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW >=", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowLessThan(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW <", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowLessThanOrEqualTo(Short value) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW <=", value, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowIn(List<Short> values) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW in", values, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowNotIn(List<Short> values) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW not in", values, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowBetween(Short value1, Short value2) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW between", value1, value2, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportReadRowNotBetween(Short value1, Short value2) {
            addCriterion("CSYS_EXCEL_IMPORT_READ_ROW not between", value1, value2, "csysExcelImportReadRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC =", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC <>", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC >", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC >=", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC <", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC <=", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC like", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC not like", value, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC in", values, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC not in", values, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC between", value1, value2, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportBfPrcNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_BF_PRC not between", value1, value2, "csysExcelImportBfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC =", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC <>", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC >", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC >=", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC <", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC <=", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC like", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC not like", value, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC in", values, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC not in", values, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC between", value1, value2, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCrPrcNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CR_PRC not between", value1, value2, "csysExcelImportCrPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC =", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC <>", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC >", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC >=", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC <", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC <=", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC like", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC not like", value, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC in", values, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC not in", values, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC between", value1, value2, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportAfPrcNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_AF_PRC not between", value1, value2, "csysExcelImportAfPrc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC =", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC <>", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC >", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC >=", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC <", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC <=", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC like", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC not like", value, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC in", values, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC not in", values, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC between", value1, value2, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DESC not between", value1, value2, "csysExcelImportDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME =", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME <>", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME >", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME >=", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME <", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME <=", value, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME in", values, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME not in", values, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME between", value1, value2, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_TIME not between", value1, value2, "csysExcelImportCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME =", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME <>", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME >", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME >=", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME <", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME <=", value, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME in", values, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME not in", values, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME between", value1, value2, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_TIME not between", value1, value2, "csysExcelImportModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER =", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER <>", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER >", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER >=", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER <", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER <=", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER like", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER not like", value, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER in", values, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER not in", values, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER between", value1, value2, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_CREATE_USER not between", value1, value2, "csysExcelImportCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER =", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER <>", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER >", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER >=", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER <", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER <=", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER like", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER not like", value, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER in", values, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER not in", values, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER between", value1, value2, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_MODIFY_USER not between", value1, value2, "csysExcelImportModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE =", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE <>", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE >", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE >=", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteLessThan(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE <", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE <=", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE like", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteNotLike(String value) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE not like", value, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE in", values, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE not in", values, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE between", value1, value2, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_IMPORT_IS_DELETE not between", value1, value2, "csysExcelImportIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME =", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME <>", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME >", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME >=", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME <", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME <=", value, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME in", values, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME not in", values, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME between", value1, value2, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_TIME not between", value1, value2, "csysExcelImportTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateIsNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateIsNotNull() {
            addCriterion("CSYS_EXCEL_IMPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE =", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE <>", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE >", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE >=", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateLessThan(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE <", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE <=", value, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE in", values, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE not in", values, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE between", value1, value2, "csysExcelImportDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelImportDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_IMPORT_DATE not between", value1, value2, "csysExcelImportDate");
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