package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class PassengerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public PassengerInfoExample() {
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

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Integer value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Integer value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Integer value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Integer value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Integer value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Integer> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Integer> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Integer value1, Integer value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Integer value1, Integer value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNull() {
            addCriterion("passenger_phone is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNotNull() {
            addCriterion("passenger_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneEqualTo(String value) {
            addCriterion("passenger_phone =", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotEqualTo(String value) {
            addCriterion("passenger_phone <>", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThan(String value) {
            addCriterion("passenger_phone >", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_phone >=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThan(String value) {
            addCriterion("passenger_phone <", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThanOrEqualTo(String value) {
            addCriterion("passenger_phone <=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLike(String value) {
            addCriterion("passenger_phone like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotLike(String value) {
            addCriterion("passenger_phone not like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIn(List<String> values) {
            addCriterion("passenger_phone in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotIn(List<String> values) {
            addCriterion("passenger_phone not in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneBetween(String value1, String value2) {
            addCriterion("passenger_phone between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotBetween(String value1, String value2) {
            addCriterion("passenger_phone not between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNull() {
            addCriterion("passenger_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNotNull() {
            addCriterion("passenger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameEqualTo(String value) {
            addCriterion("passenger_name =", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotEqualTo(String value) {
            addCriterion("passenger_name <>", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThan(String value) {
            addCriterion("passenger_name >", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_name >=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThan(String value) {
            addCriterion("passenger_name <", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_name <=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLike(String value) {
            addCriterion("passenger_name like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotLike(String value) {
            addCriterion("passenger_name not like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIn(List<String> values) {
            addCriterion("passenger_name in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotIn(List<String> values) {
            addCriterion("passenger_name not in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameBetween(String value1, String value2) {
            addCriterion("passenger_name between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotBetween(String value1, String value2) {
            addCriterion("passenger_name not between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderIsNull() {
            addCriterion("passenger_gender is null");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderIsNotNull() {
            addCriterion("passenger_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderEqualTo(String value) {
            addCriterion("passenger_gender =", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderNotEqualTo(String value) {
            addCriterion("passenger_gender <>", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderGreaterThan(String value) {
            addCriterion("passenger_gender >", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_gender >=", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderLessThan(String value) {
            addCriterion("passenger_gender <", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderLessThanOrEqualTo(String value) {
            addCriterion("passenger_gender <=", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderLike(String value) {
            addCriterion("passenger_gender like", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderNotLike(String value) {
            addCriterion("passenger_gender not like", value, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderIn(List<String> values) {
            addCriterion("passenger_gender in", values, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderNotIn(List<String> values) {
            addCriterion("passenger_gender not in", values, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderBetween(String value1, String value2) {
            addCriterion("passenger_gender between", value1, value2, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andPassengerGenderNotBetween(String value1, String value2) {
            addCriterion("passenger_gender not between", value1, value2, "passengerGender");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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