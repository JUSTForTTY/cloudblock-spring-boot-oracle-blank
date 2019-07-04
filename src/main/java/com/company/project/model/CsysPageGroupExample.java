package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsysPageGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsysPageGroupExample() {
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

        public Criteria andCsysPageGroupIdIsNull() {
            addCriterion("CSYS_PAGE_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID =", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID <>", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID >", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID >=", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID <", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID <=", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID like", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_ID not like", value, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_ID in", values, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_ID not in", values, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_ID between", value1, value2, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_ID not between", value1, value2, "csysPageGroupId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNull() {
            addCriterion("CSYS_PAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIsNotNull() {
            addCriterion("CSYS_PAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID =", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <>", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThan(String value) {
            addCriterion("CSYS_PAGE_ID >", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID >=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThan(String value) {
            addCriterion("CSYS_PAGE_ID <", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_ID <=", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdLike(String value) {
            addCriterion("CSYS_PAGE_ID like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotLike(String value) {
            addCriterion("CSYS_PAGE_ID not like", value, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_ID not in", values, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageIdNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_ID not between", value1, value2, "csysPageId");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIsNull() {
            addCriterion("CSYS_PAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIsNotNull() {
            addCriterion("CSYS_PAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME =", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <>", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThan(String value) {
            addCriterion("CSYS_PAGE_NAME >", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME >=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThan(String value) {
            addCriterion("CSYS_PAGE_NAME <", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_NAME <=", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameLike(String value) {
            addCriterion("CSYS_PAGE_NAME like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotLike(String value) {
            addCriterion("CSYS_PAGE_NAME not like", value, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_NAME not in", values, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageNameNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_NAME not between", value1, value2, "csysPageName");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeIsNull() {
            addCriterion("CSYS_PAGE_GROUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE =", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE <>", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE >", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE >=", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE <", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE <=", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE like", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_CODE not like", value, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_CODE in", values, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_CODE not in", values, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_CODE between", value1, value2, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCodeNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_CODE not between", value1, value2, "csysPageGroupCode");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescIsNull() {
            addCriterion("CSYS_PAGE_GROUP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC =", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC <>", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC >", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC >=", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC <", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC <=", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC like", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_DESC not like", value, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_DESC in", values, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_DESC not in", values, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_DESC between", value1, value2, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupDescNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_DESC not between", value1, value2, "csysPageGroupDesc");
            return (Criteria) this;
        }

        public Criteria andFlag1IsNull() {
            addCriterion("FLAG_1 is null");
            return (Criteria) this;
        }

        public Criteria andFlag1IsNotNull() {
            addCriterion("FLAG_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFlag1EqualTo(String value) {
            addCriterion("FLAG_1 =", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1NotEqualTo(String value) {
            addCriterion("FLAG_1 <>", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1GreaterThan(String value) {
            addCriterion("FLAG_1 >", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1GreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_1 >=", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1LessThan(String value) {
            addCriterion("FLAG_1 <", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1LessThanOrEqualTo(String value) {
            addCriterion("FLAG_1 <=", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1Like(String value) {
            addCriterion("FLAG_1 like", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1NotLike(String value) {
            addCriterion("FLAG_1 not like", value, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1In(List<String> values) {
            addCriterion("FLAG_1 in", values, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1NotIn(List<String> values) {
            addCriterion("FLAG_1 not in", values, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1Between(String value1, String value2) {
            addCriterion("FLAG_1 between", value1, value2, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag1NotBetween(String value1, String value2) {
            addCriterion("FLAG_1 not between", value1, value2, "flag1");
            return (Criteria) this;
        }

        public Criteria andFlag2IsNull() {
            addCriterion("FLAG_2 is null");
            return (Criteria) this;
        }

        public Criteria andFlag2IsNotNull() {
            addCriterion("FLAG_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFlag2EqualTo(String value) {
            addCriterion("FLAG_2 =", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2NotEqualTo(String value) {
            addCriterion("FLAG_2 <>", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2GreaterThan(String value) {
            addCriterion("FLAG_2 >", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2GreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_2 >=", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2LessThan(String value) {
            addCriterion("FLAG_2 <", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2LessThanOrEqualTo(String value) {
            addCriterion("FLAG_2 <=", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2Like(String value) {
            addCriterion("FLAG_2 like", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2NotLike(String value) {
            addCriterion("FLAG_2 not like", value, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2In(List<String> values) {
            addCriterion("FLAG_2 in", values, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2NotIn(List<String> values) {
            addCriterion("FLAG_2 not in", values, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2Between(String value1, String value2) {
            addCriterion("FLAG_2 between", value1, value2, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag2NotBetween(String value1, String value2) {
            addCriterion("FLAG_2 not between", value1, value2, "flag2");
            return (Criteria) this;
        }

        public Criteria andFlag3IsNull() {
            addCriterion("FLAG_3 is null");
            return (Criteria) this;
        }

        public Criteria andFlag3IsNotNull() {
            addCriterion("FLAG_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFlag3EqualTo(String value) {
            addCriterion("FLAG_3 =", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3NotEqualTo(String value) {
            addCriterion("FLAG_3 <>", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3GreaterThan(String value) {
            addCriterion("FLAG_3 >", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3GreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_3 >=", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3LessThan(String value) {
            addCriterion("FLAG_3 <", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3LessThanOrEqualTo(String value) {
            addCriterion("FLAG_3 <=", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3Like(String value) {
            addCriterion("FLAG_3 like", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3NotLike(String value) {
            addCriterion("FLAG_3 not like", value, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3In(List<String> values) {
            addCriterion("FLAG_3 in", values, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3NotIn(List<String> values) {
            addCriterion("FLAG_3 not in", values, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3Between(String value1, String value2) {
            addCriterion("FLAG_3 between", value1, value2, "flag3");
            return (Criteria) this;
        }

        public Criteria andFlag3NotBetween(String value1, String value2) {
            addCriterion("FLAG_3 not between", value1, value2, "flag3");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeIsNull() {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME =", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME <>", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME >", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME >=", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME <", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME <=", value, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME in", values, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME not in", values, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME between", value1, value2, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_TIME not between", value1, value2, "csysPageGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeIsNull() {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME =", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeNotEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME <>", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeGreaterThan(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME >", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME >=", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeLessThan(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME <", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME <=", value, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeIn(List<Date> values) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME in", values, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeNotIn(List<Date> values) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME not in", values, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME between", value1, value2, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_TIME not between", value1, value2, "csysPageGroupModifyTime");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserIsNull() {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER =", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER <>", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER >", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER >=", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER <", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER <=", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER like", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER not like", value, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER in", values, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER not in", values, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER between", value1, value2, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupCreateUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_CREATE_USER not between", value1, value2, "csysPageGroupCreateUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserIsNull() {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER =", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER <>", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER >", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER >=", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER <", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER <=", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER like", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER not like", value, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER in", values, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER not in", values, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER between", value1, value2, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupModifyUserNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_MODIFY_USER not between", value1, value2, "csysPageGroupModifyUser");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteIsNull() {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteIsNotNull() {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE =", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteNotEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE <>", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteGreaterThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE >", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE >=", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteLessThan(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE <", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE <=", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE like", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteNotLike(String value) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE not like", value, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE in", values, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteNotIn(List<String> values) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE not in", values, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE between", value1, value2, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysPageGroupIsDeleteNotBetween(String value1, String value2) {
            addCriterion("CSYS_PAGE_GROUP_IS_DELETE not between", value1, value2, "csysPageGroupIsDelete");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeIsNull() {
            addCriterion("CSYS_CODEMASTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeIsNotNull() {
            addCriterion("CSYS_CODEMASTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME =", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeNotEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME <>", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeGreaterThan(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME >", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME >=", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeLessThan(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME <", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_TIME <=", value, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeIn(List<Date> values) {
            addCriterion("CSYS_CODEMASTER_TIME in", values, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeNotIn(List<Date> values) {
            addCriterion("CSYS_CODEMASTER_TIME not in", values, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeBetween(Date value1, Date value2) {
            addCriterion("CSYS_CODEMASTER_TIME between", value1, value2, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterTimeNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_CODEMASTER_TIME not between", value1, value2, "csysCodemasterTime");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateIsNull() {
            addCriterion("CSYS_CODEMASTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateIsNotNull() {
            addCriterion("CSYS_CODEMASTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE =", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateNotEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE <>", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateGreaterThan(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE >", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE >=", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateLessThan(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE <", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateLessThanOrEqualTo(Date value) {
            addCriterion("CSYS_CODEMASTER_DATE <=", value, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateIn(List<Date> values) {
            addCriterion("CSYS_CODEMASTER_DATE in", values, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateNotIn(List<Date> values) {
            addCriterion("CSYS_CODEMASTER_DATE not in", values, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateBetween(Date value1, Date value2) {
            addCriterion("CSYS_CODEMASTER_DATE between", value1, value2, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andCsysCodemasterDateNotBetween(Date value1, Date value2) {
            addCriterion("CSYS_CODEMASTER_DATE not between", value1, value2, "csysCodemasterDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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