package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysExcelImportViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysExcelImportViewExample() {
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

        public Criteria andCsysExcelAttachIdIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID =", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID <>", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID >", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID >=", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID <", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID <=", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID like", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_ID not like", value, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_ID in", values, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_ID not in", values, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_ID between", value1, value2, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_ID not between", value1, value2, "csysExcelAttachId");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW =", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowNotEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW <>", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowGreaterThan(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW >", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW >=", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowLessThan(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW <", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW <=", value, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowIn(List<Integer> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW in", values, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowNotIn(List<Integer> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW not in", values, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW between", value1, value2, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldRowNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_ROW not between", value1, value2, "csysExcelAttachFieldRow");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN =", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnNotEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN <>", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnGreaterThan(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN >", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN >=", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnLessThan(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN <", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnLessThanOrEqualTo(Integer value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN <=", value, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnIn(List<Integer> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN in", values, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnNotIn(List<Integer> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN not in", values, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN between", value1, value2, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldColumnNotBetween(Integer value1, Integer value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_COLUMN not between", value1, value2, "csysExcelAttachFieldColumn");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY =", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY <>", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY >", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY >=", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY <", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY <=", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY like", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY not like", value, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY in", values, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY not in", values, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY between", value1, value2, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsPrimaryNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_PRIMARY not between", value1, value2, "csysExcelAttachIsPrimary");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL =", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL <>", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL >", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL >=", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL <", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL <=", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL like", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL not like", value, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL in", values, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL not in", values, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL between", value1, value2, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTransfersqlNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_TRANSFERSQL not between", value1, value2, "csysExcelAttachTransfersql");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME =", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME <>", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME >", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME >=", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME <", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME <=", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME like", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME not like", value, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME in", values, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME not in", values, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME between", value1, value2, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_NAME not between", value1, value2, "csysExcelAttachFieldName");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC =", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC <>", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC >", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC >=", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC <", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC <=", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC like", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC not like", value, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC in", values, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC not in", values, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC between", value1, value2, "csysExcelAttachFieldDesc");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachFieldDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_FIELD_DESC not between", value1, value2, "csysExcelAttachFieldDesc");
            return (Criteria) this;
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

        public Criteria andCsysFieldInfoIdIsNull() {
            addCriterion("CSYS_FIELD_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID =", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <>", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ID >", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID >=", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ID <=", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ID like", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ID not like", value, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ID in", values, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ID not in", values, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ID between", value1, value2, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ID not between", value1, value2, "csysFieldInfoId");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIsNull() {
            addCriterion("CSYS_FIELD_INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME =", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <>", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME >", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME >=", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME <=", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameLike(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME like", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_NAME not like", value, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_NAME in", values, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_NAME not in", values, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_NAME between", value1, value2, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_NAME not between", value1, value2, "csysFieldInfoName");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIsNull() {
            addCriterion("CSYS_FIELD_INFO_RELNAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_RELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME =", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <>", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME >", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME >=", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME <=", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameLike(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME like", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not like", value, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_RELNAME in", values, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not in", values, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_RELNAME between", value1, value2, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRelnameNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_RELNAME not between", value1, value2, "csysFieldInfoRelname");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIsNull() {
            addCriterion("CSYS_FIELD_INFO_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION =", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <>", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION >", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION >=", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION <=", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION like", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_REGION not like", value, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REGION in", values, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_REGION not in", values, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REGION between", value1, value2, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoRegionNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_REGION not between", value1, value2, "csysFieldInfoRegion");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIsNull() {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE =", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <>", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE >", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE >=", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE <=", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE like", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not like", value, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE in", values, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not in", values, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE between", value1, value2, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoAttributeNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_ATTRIBUTE not between", value1, value2, "csysFieldInfoAttribute");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIsNull() {
            addCriterion("CSYS_FIELD_INFO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE =", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <>", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE >", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE >=", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE <=", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeLike(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE like", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_TYPE not like", value, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_TYPE in", values, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_TYPE not in", values, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_TYPE between", value1, value2, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_TYPE not between", value1, value2, "csysFieldInfoType");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIsNull() {
            addCriterion("CSYS_FIELD_INFO_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT =", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <>", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultGreaterThan(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT >", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT >=", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLessThan(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLessThanOrEqualTo(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT <=", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultLike(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT like", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotLike(String value) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not like", value, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT in", values, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotIn(List<String> values) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not in", values, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT between", value1, value2, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDefaultNotBetween(String value1, String value2) {
            addCriterion("CSYS_FIELD_INFO_DEFAULT not between", value1, value2, "csysFieldInfoDefault");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIsNull() {
            addCriterion("CSYS_FIELD_INFO_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIsNotNull() {
            addCriterion("CSYS_FIELD_INFO_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE =", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <>", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateGreaterThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE >", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE >=", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateLessThan(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_FIELD_INFO_DATE <=", value, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_DATE in", values, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotIn(List<Date> values) {
            addCriterion("CSYS_FIELD_INFO_DATE not in", values, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_DATE between", value1, value2, "csysFieldInfoDate");
            return (Criteria) this;
        }

        public Criteria andCsysFieldInfoDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_FIELD_INFO_DATE not between", value1, value2, "csysFieldInfoDate");
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

        public Criteria andCsysViewExplainNameIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME =", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <>", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME >", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME >=", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME <=", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME like", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not like", value, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME in", values, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not in", values, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME between", value1, value2, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_NAME not between", value1, value2, "csysViewExplainName");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE =", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <>", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE >", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE >=", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE <=", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE like", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not like", value, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE in", values, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not in", values, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE between", value1, value2, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainTypeNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_TYPE not between", value1, value2, "csysViewExplainType");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIsNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIsNotNull() {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC =", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <>", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescGreaterThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC >", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC >=", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLessThan(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC <=", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC like", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotLike(String value) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not like", value, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC in", values, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotIn(List<String> values) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not in", values, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC between", value1, value2, "csysViewExplainDesc");
            return (Criteria) this;
        }

        public Criteria andCsysViewExplainDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_VIEW_EXPLAIN_DESC not between", value1, value2, "csysViewExplainDesc");
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