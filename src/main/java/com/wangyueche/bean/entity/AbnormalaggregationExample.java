package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class AbnormalaggregationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public AbnormalaggregationExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Double value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Double value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Double value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Double value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Double value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Double value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Double> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Double> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Double value1, Double value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Double value1, Double value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Double value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Double value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Double value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Double value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Double value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Double value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Double> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Double> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Double value1, Double value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Double value1, Double value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andFirstnumIsNull() {
            addCriterion("firstNum is null");
            return (Criteria) this;
        }

        public Criteria andFirstnumIsNotNull() {
            addCriterion("firstNum is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnumEqualTo(Integer value) {
            addCriterion("firstNum =", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumNotEqualTo(Integer value) {
            addCriterion("firstNum <>", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumGreaterThan(Integer value) {
            addCriterion("firstNum >", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstNum >=", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumLessThan(Integer value) {
            addCriterion("firstNum <", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumLessThanOrEqualTo(Integer value) {
            addCriterion("firstNum <=", value, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumIn(List<Integer> values) {
            addCriterion("firstNum in", values, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumNotIn(List<Integer> values) {
            addCriterion("firstNum not in", values, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumBetween(Integer value1, Integer value2) {
            addCriterion("firstNum between", value1, value2, "firstnum");
            return (Criteria) this;
        }

        public Criteria andFirstnumNotBetween(Integer value1, Integer value2) {
            addCriterion("firstNum not between", value1, value2, "firstnum");
            return (Criteria) this;
        }

        public Criteria andSecnumIsNull() {
            addCriterion("secNum is null");
            return (Criteria) this;
        }

        public Criteria andSecnumIsNotNull() {
            addCriterion("secNum is not null");
            return (Criteria) this;
        }

        public Criteria andSecnumEqualTo(Integer value) {
            addCriterion("secNum =", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumNotEqualTo(Integer value) {
            addCriterion("secNum <>", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumGreaterThan(Integer value) {
            addCriterion("secNum >", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("secNum >=", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumLessThan(Integer value) {
            addCriterion("secNum <", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumLessThanOrEqualTo(Integer value) {
            addCriterion("secNum <=", value, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumIn(List<Integer> values) {
            addCriterion("secNum in", values, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumNotIn(List<Integer> values) {
            addCriterion("secNum not in", values, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumBetween(Integer value1, Integer value2) {
            addCriterion("secNum between", value1, value2, "secnum");
            return (Criteria) this;
        }

        public Criteria andSecnumNotBetween(Integer value1, Integer value2) {
            addCriterion("secNum not between", value1, value2, "secnum");
            return (Criteria) this;
        }

        public Criteria andThrnumIsNull() {
            addCriterion("thrNum is null");
            return (Criteria) this;
        }

        public Criteria andThrnumIsNotNull() {
            addCriterion("thrNum is not null");
            return (Criteria) this;
        }

        public Criteria andThrnumEqualTo(Integer value) {
            addCriterion("thrNum =", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumNotEqualTo(Integer value) {
            addCriterion("thrNum <>", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumGreaterThan(Integer value) {
            addCriterion("thrNum >", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("thrNum >=", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumLessThan(Integer value) {
            addCriterion("thrNum <", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumLessThanOrEqualTo(Integer value) {
            addCriterion("thrNum <=", value, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumIn(List<Integer> values) {
            addCriterion("thrNum in", values, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumNotIn(List<Integer> values) {
            addCriterion("thrNum not in", values, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumBetween(Integer value1, Integer value2) {
            addCriterion("thrNum between", value1, value2, "thrnum");
            return (Criteria) this;
        }

        public Criteria andThrnumNotBetween(Integer value1, Integer value2) {
            addCriterion("thrNum not between", value1, value2, "thrnum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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