package com.bay1ts.domain;

import java.util.ArrayList;
import java.util.List;

public class GroupAuthoritiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupAuthoritiesExample() {
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

        public Criteria andGaIdIsNull() {
            addCriterion("ga_id is null");
            return (Criteria) this;
        }

        public Criteria andGaIdIsNotNull() {
            addCriterion("ga_id is not null");
            return (Criteria) this;
        }

        public Criteria andGaIdEqualTo(Long value) {
            addCriterion("ga_id =", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdNotEqualTo(Long value) {
            addCriterion("ga_id <>", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdGreaterThan(Long value) {
            addCriterion("ga_id >", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ga_id >=", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdLessThan(Long value) {
            addCriterion("ga_id <", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdLessThanOrEqualTo(Long value) {
            addCriterion("ga_id <=", value, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdIn(List<Long> values) {
            addCriterion("ga_id in", values, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdNotIn(List<Long> values) {
            addCriterion("ga_id not in", values, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdBetween(Long value1, Long value2) {
            addCriterion("ga_id between", value1, value2, "gaId");
            return (Criteria) this;
        }

        public Criteria andGaIdNotBetween(Long value1, Long value2) {
            addCriterion("ga_id not between", value1, value2, "gaId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(String value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(String value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(String value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(String value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(String value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLike(String value) {
            addCriterion("authority like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotLike(String value) {
            addCriterion("authority not like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<String> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<String> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(String value1, String value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(String value1, String value2) {
            addCriterion("authority not between", value1, value2, "authority");
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