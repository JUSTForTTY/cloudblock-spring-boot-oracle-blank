package com.company.project.model;

import java.util.ArrayList;
import java.util.List;

public class CsysSequenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysSequenceExample() {
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

        public Criteria andCsysSequenceTablenameIsNull() {
            addCriterion("CSYS_SEQUENCE_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameIsNotNull() {
            addCriterion("CSYS_SEQUENCE_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameEqualTo(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME =", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameNotEqualTo(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME <>", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameGreaterThan(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME >", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME >=", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameLessThan(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME <", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME <=", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameLike(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME like", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameNotLike(String value) {
            addCriterion("CSYS_SEQUENCE_TABLENAME not like", value, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameIn(List<String> values) {
            addCriterion("CSYS_SEQUENCE_TABLENAME in", values, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameNotIn(List<String> values) {
            addCriterion("CSYS_SEQUENCE_TABLENAME not in", values, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameBetween(String value1, String value2) {
            addCriterion("CSYS_SEQUENCE_TABLENAME between", value1, value2, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceTablenameNotBetween(String value1, String value2) {
            addCriterion("CSYS_SEQUENCE_TABLENAME not between", value1, value2, "csysSequenceTablename");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoIsNull() {
            addCriterion("CSYS_SEQUENCE_SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoIsNotNull() {
            addCriterion("CSYS_SEQUENCE_SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoEqualTo(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO =", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoNotEqualTo(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO <>", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoGreaterThan(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO >", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoGreaterThanOrEqualTo(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO >=", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoLessThan(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO <", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoLessThanOrEqualTo(Long value) {
            addCriterion("CSYS_SEQUENCE_SEQNO <=", value, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoIn(List<Long> values) {
            addCriterion("CSYS_SEQUENCE_SEQNO in", values, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoNotIn(List<Long> values) {
            addCriterion("CSYS_SEQUENCE_SEQNO not in", values, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoBetween(Long value1, Long value2) {
            addCriterion("CSYS_SEQUENCE_SEQNO between", value1, value2, "csysSequenceSeqno");
            return (Criteria) this;
        }

        public Criteria andCsysSequenceSeqnoNotBetween(Long value1, Long value2) {
            addCriterion("CSYS_SEQUENCE_SEQNO not between", value1, value2, "csysSequenceSeqno");
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