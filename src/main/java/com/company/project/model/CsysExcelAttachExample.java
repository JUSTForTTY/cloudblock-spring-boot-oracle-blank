package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysExcelAttachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysExcelAttachExample() {
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

        public Criteria andCsysExcelAttachCreateTimeIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME =", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME <>", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME >", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME >=", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME <", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME <=", value, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME in", values, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME not in", values, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME between", value1, value2, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_TIME not between", value1, value2, "csysExcelAttachCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME =", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME <>", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME >", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME >=", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME <", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME <=", value, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME in", values, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME not in", values, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME between", value1, value2, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_TIME not between", value1, value2, "csysExcelAttachModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER =", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER <>", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER >", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER >=", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER <", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER <=", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER like", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER not like", value, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER in", values, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER not in", values, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER between", value1, value2, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_CREATE_USER not between", value1, value2, "csysExcelAttachCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER =", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER <>", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER >", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER >=", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER <", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER <=", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER like", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER not like", value, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER in", values, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER not in", values, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER between", value1, value2, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_MODIFY_USER not between", value1, value2, "csysExcelAttachModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE =", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE <>", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE >", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE >=", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteLessThan(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE <", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE <=", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE like", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteNotLike(String value) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE not like", value, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE in", values, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE not in", values, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE between", value1, value2, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_EXCEL_ATTACH_IS_DELETE not between", value1, value2, "csysExcelAttachIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME =", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME <>", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME >", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME >=", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeLessThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME <", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME <=", value, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME in", values, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME not in", values, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME between", value1, value2, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_TIME not between", value1, value2, "csysExcelAttachTime");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateIsNull() {
            addCriterion("CSYS_EXCEL_ATTACH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateIsNotNull() {
            addCriterion("CSYS_EXCEL_ATTACH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE =", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateNotEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE <>", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateGreaterThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE >", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE >=", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateLessThan(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE <", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE <=", value, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE in", values, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateNotIn(List<Date> values) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE not in", values, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE between", value1, value2, "csysExcelAttachDate");
            return (Criteria) this;
        }

        public Criteria andCsysExcelAttachDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_EXCEL_ATTACH_DATE not between", value1, value2, "csysExcelAttachDate");
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