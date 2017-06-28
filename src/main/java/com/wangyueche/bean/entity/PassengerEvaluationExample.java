package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class PassengerEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public PassengerEvaluationExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeEqualTo(Long value) {
            addCriterion("evaluate_time =", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotEqualTo(Long value) {
            addCriterion("evaluate_time <>", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThan(Long value) {
            addCriterion("evaluate_time >", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_time >=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThan(Long value) {
            addCriterion("evaluate_time <", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_time <=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIn(List<Long> values) {
            addCriterion("evaluate_time in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotIn(List<Long> values) {
            addCriterion("evaluate_time not in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeBetween(Long value1, Long value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNull() {
            addCriterion("service_score is null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNotNull() {
            addCriterion("service_score is not null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreEqualTo(Integer value) {
            addCriterion("service_score =", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotEqualTo(Integer value) {
            addCriterion("service_score <>", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThan(Integer value) {
            addCriterion("service_score >", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_score >=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThan(Integer value) {
            addCriterion("service_score <", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThanOrEqualTo(Integer value) {
            addCriterion("service_score <=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIn(List<Integer> values) {
            addCriterion("service_score in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotIn(List<Integer> values) {
            addCriterion("service_score not in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreBetween(Integer value1, Integer value2) {
            addCriterion("service_score between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("service_score not between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreIsNull() {
            addCriterion("driver_score is null");
            return (Criteria) this;
        }

        public Criteria andDriverScoreIsNotNull() {
            addCriterion("driver_score is not null");
            return (Criteria) this;
        }

        public Criteria andDriverScoreEqualTo(Integer value) {
            addCriterion("driver_score =", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreNotEqualTo(Integer value) {
            addCriterion("driver_score <>", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreGreaterThan(Integer value) {
            addCriterion("driver_score >", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_score >=", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreLessThan(Integer value) {
            addCriterion("driver_score <", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreLessThanOrEqualTo(Integer value) {
            addCriterion("driver_score <=", value, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreIn(List<Integer> values) {
            addCriterion("driver_score in", values, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreNotIn(List<Integer> values) {
            addCriterion("driver_score not in", values, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreBetween(Integer value1, Integer value2) {
            addCriterion("driver_score between", value1, value2, "driverScore");
            return (Criteria) this;
        }

        public Criteria andDriverScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_score not between", value1, value2, "driverScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreIsNull() {
            addCriterion("vehicle_score is null");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreIsNotNull() {
            addCriterion("vehicle_score is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreEqualTo(Integer value) {
            addCriterion("vehicle_score =", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreNotEqualTo(Integer value) {
            addCriterion("vehicle_score <>", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreGreaterThan(Integer value) {
            addCriterion("vehicle_score >", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_score >=", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreLessThan(Integer value) {
            addCriterion("vehicle_score <", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_score <=", value, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreIn(List<Integer> values) {
            addCriterion("vehicle_score in", values, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreNotIn(List<Integer> values) {
            addCriterion("vehicle_score not in", values, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_score between", value1, value2, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andVehicleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_score not between", value1, value2, "vehicleScore");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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