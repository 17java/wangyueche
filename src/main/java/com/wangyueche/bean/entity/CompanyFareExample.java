package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyFareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CompanyFareExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Integer value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Integer value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Integer value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Integer value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Integer value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Integer> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Integer> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Integer value1, Integer value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFareTypeIsNull() {
            addCriterion("fare_type is null");
            return (Criteria) this;
        }

        public Criteria andFareTypeIsNotNull() {
            addCriterion("fare_type is not null");
            return (Criteria) this;
        }

        public Criteria andFareTypeEqualTo(String value) {
            addCriterion("fare_type =", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeNotEqualTo(String value) {
            addCriterion("fare_type <>", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeGreaterThan(String value) {
            addCriterion("fare_type >", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fare_type >=", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeLessThan(String value) {
            addCriterion("fare_type <", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeLessThanOrEqualTo(String value) {
            addCriterion("fare_type <=", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeLike(String value) {
            addCriterion("fare_type like", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeNotLike(String value) {
            addCriterion("fare_type not like", value, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeIn(List<String> values) {
            addCriterion("fare_type in", values, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeNotIn(List<String> values) {
            addCriterion("fare_type not in", values, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeBetween(String value1, String value2) {
            addCriterion("fare_type between", value1, value2, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeNotBetween(String value1, String value2) {
            addCriterion("fare_type not between", value1, value2, "fareType");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteIsNull() {
            addCriterion("fare_type_note is null");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteIsNotNull() {
            addCriterion("fare_type_note is not null");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteEqualTo(String value) {
            addCriterion("fare_type_note =", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteNotEqualTo(String value) {
            addCriterion("fare_type_note <>", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteGreaterThan(String value) {
            addCriterion("fare_type_note >", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("fare_type_note >=", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteLessThan(String value) {
            addCriterion("fare_type_note <", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteLessThanOrEqualTo(String value) {
            addCriterion("fare_type_note <=", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteLike(String value) {
            addCriterion("fare_type_note like", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteNotLike(String value) {
            addCriterion("fare_type_note not like", value, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteIn(List<String> values) {
            addCriterion("fare_type_note in", values, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteNotIn(List<String> values) {
            addCriterion("fare_type_note not in", values, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteBetween(String value1, String value2) {
            addCriterion("fare_type_note between", value1, value2, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareTypeNoteNotBetween(String value1, String value2) {
            addCriterion("fare_type_note not between", value1, value2, "fareTypeNote");
            return (Criteria) this;
        }

        public Criteria andFareValidOnIsNull() {
            addCriterion("fare_valid_on is null");
            return (Criteria) this;
        }

        public Criteria andFareValidOnIsNotNull() {
            addCriterion("fare_valid_on is not null");
            return (Criteria) this;
        }

        public Criteria andFareValidOnEqualTo(Long value) {
            addCriterion("fare_valid_on =", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnNotEqualTo(Long value) {
            addCriterion("fare_valid_on <>", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnGreaterThan(Long value) {
            addCriterion("fare_valid_on >", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnGreaterThanOrEqualTo(Long value) {
            addCriterion("fare_valid_on >=", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnLessThan(Long value) {
            addCriterion("fare_valid_on <", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnLessThanOrEqualTo(Long value) {
            addCriterion("fare_valid_on <=", value, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnIn(List<Long> values) {
            addCriterion("fare_valid_on in", values, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnNotIn(List<Long> values) {
            addCriterion("fare_valid_on not in", values, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnBetween(Long value1, Long value2) {
            addCriterion("fare_valid_on between", value1, value2, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOnNotBetween(Long value1, Long value2) {
            addCriterion("fare_valid_on not between", value1, value2, "fareValidOn");
            return (Criteria) this;
        }

        public Criteria andFareValidOffIsNull() {
            addCriterion("fare_valid_off is null");
            return (Criteria) this;
        }

        public Criteria andFareValidOffIsNotNull() {
            addCriterion("fare_valid_off is not null");
            return (Criteria) this;
        }

        public Criteria andFareValidOffEqualTo(Long value) {
            addCriterion("fare_valid_off =", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffNotEqualTo(Long value) {
            addCriterion("fare_valid_off <>", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffGreaterThan(Long value) {
            addCriterion("fare_valid_off >", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffGreaterThanOrEqualTo(Long value) {
            addCriterion("fare_valid_off >=", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffLessThan(Long value) {
            addCriterion("fare_valid_off <", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffLessThanOrEqualTo(Long value) {
            addCriterion("fare_valid_off <=", value, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffIn(List<Long> values) {
            addCriterion("fare_valid_off in", values, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffNotIn(List<Long> values) {
            addCriterion("fare_valid_off not in", values, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffBetween(Long value1, Long value2) {
            addCriterion("fare_valid_off between", value1, value2, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andFareValidOffNotBetween(Long value1, Long value2) {
            addCriterion("fare_valid_off not between", value1, value2, "fareValidOff");
            return (Criteria) this;
        }

        public Criteria andStartFareIsNull() {
            addCriterion("start_fare is null");
            return (Criteria) this;
        }

        public Criteria andStartFareIsNotNull() {
            addCriterion("start_fare is not null");
            return (Criteria) this;
        }

        public Criteria andStartFareEqualTo(BigDecimal value) {
            addCriterion("start_fare =", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareNotEqualTo(BigDecimal value) {
            addCriterion("start_fare <>", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareGreaterThan(BigDecimal value) {
            addCriterion("start_fare >", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_fare >=", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareLessThan(BigDecimal value) {
            addCriterion("start_fare <", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_fare <=", value, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareIn(List<BigDecimal> values) {
            addCriterion("start_fare in", values, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareNotIn(List<BigDecimal> values) {
            addCriterion("start_fare not in", values, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_fare between", value1, value2, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartFareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_fare not between", value1, value2, "startFare");
            return (Criteria) this;
        }

        public Criteria andStartMileIsNull() {
            addCriterion("start_mile is null");
            return (Criteria) this;
        }

        public Criteria andStartMileIsNotNull() {
            addCriterion("start_mile is not null");
            return (Criteria) this;
        }

        public Criteria andStartMileEqualTo(BigDecimal value) {
            addCriterion("start_mile =", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileNotEqualTo(BigDecimal value) {
            addCriterion("start_mile <>", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileGreaterThan(BigDecimal value) {
            addCriterion("start_mile >", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_mile >=", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileLessThan(BigDecimal value) {
            addCriterion("start_mile <", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_mile <=", value, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileIn(List<BigDecimal> values) {
            addCriterion("start_mile in", values, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileNotIn(List<BigDecimal> values) {
            addCriterion("start_mile not in", values, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_mile between", value1, value2, "startMile");
            return (Criteria) this;
        }

        public Criteria andStartMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_mile not between", value1, value2, "startMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileIsNull() {
            addCriterion("unit_price_per_mile is null");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileIsNotNull() {
            addCriterion("unit_price_per_mile is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_mile =", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileNotEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_mile <>", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileGreaterThan(BigDecimal value) {
            addCriterion("unit_price_per_mile >", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_mile >=", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileLessThan(BigDecimal value) {
            addCriterion("unit_price_per_mile <", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_mile <=", value, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileIn(List<BigDecimal> values) {
            addCriterion("unit_price_per_mile in", values, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileNotIn(List<BigDecimal> values) {
            addCriterion("unit_price_per_mile not in", values, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price_per_mile between", value1, value2, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price_per_mile not between", value1, value2, "unitPricePerMile");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteIsNull() {
            addCriterion("unit_price_per_minute is null");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteIsNotNull() {
            addCriterion("unit_price_per_minute is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_minute =", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteNotEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_minute <>", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteGreaterThan(BigDecimal value) {
            addCriterion("unit_price_per_minute >", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_minute >=", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteLessThan(BigDecimal value) {
            addCriterion("unit_price_per_minute <", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price_per_minute <=", value, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteIn(List<BigDecimal> values) {
            addCriterion("unit_price_per_minute in", values, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteNotIn(List<BigDecimal> values) {
            addCriterion("unit_price_per_minute not in", values, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price_per_minute between", value1, value2, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUnitPricePerMinuteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price_per_minute not between", value1, value2, "unitPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andUpPriceIsNull() {
            addCriterion("up_price is null");
            return (Criteria) this;
        }

        public Criteria andUpPriceIsNotNull() {
            addCriterion("up_price is not null");
            return (Criteria) this;
        }

        public Criteria andUpPriceEqualTo(BigDecimal value) {
            addCriterion("up_price =", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceNotEqualTo(BigDecimal value) {
            addCriterion("up_price <>", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceGreaterThan(BigDecimal value) {
            addCriterion("up_price >", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("up_price >=", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceLessThan(BigDecimal value) {
            addCriterion("up_price <", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("up_price <=", value, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceIn(List<BigDecimal> values) {
            addCriterion("up_price in", values, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceNotIn(List<BigDecimal> values) {
            addCriterion("up_price not in", values, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_price between", value1, value2, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_price not between", value1, value2, "upPrice");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileIsNull() {
            addCriterion("up_price_start_mile is null");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileIsNotNull() {
            addCriterion("up_price_start_mile is not null");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileEqualTo(Integer value) {
            addCriterion("up_price_start_mile =", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileNotEqualTo(Integer value) {
            addCriterion("up_price_start_mile <>", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileGreaterThan(Integer value) {
            addCriterion("up_price_start_mile >", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_price_start_mile >=", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileLessThan(Integer value) {
            addCriterion("up_price_start_mile <", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileLessThanOrEqualTo(Integer value) {
            addCriterion("up_price_start_mile <=", value, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileIn(List<Integer> values) {
            addCriterion("up_price_start_mile in", values, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileNotIn(List<Integer> values) {
            addCriterion("up_price_start_mile not in", values, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileBetween(Integer value1, Integer value2) {
            addCriterion("up_price_start_mile between", value1, value2, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andUpPriceStartMileNotBetween(Integer value1, Integer value2) {
            addCriterion("up_price_start_mile not between", value1, value2, "upPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnIsNull() {
            addCriterion("morning_peak_time_on is null");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnIsNotNull() {
            addCriterion("morning_peak_time_on is not null");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnEqualTo(String value) {
            addCriterion("morning_peak_time_on =", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnNotEqualTo(String value) {
            addCriterion("morning_peak_time_on <>", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnGreaterThan(String value) {
            addCriterion("morning_peak_time_on >", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnGreaterThanOrEqualTo(String value) {
            addCriterion("morning_peak_time_on >=", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnLessThan(String value) {
            addCriterion("morning_peak_time_on <", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnLessThanOrEqualTo(String value) {
            addCriterion("morning_peak_time_on <=", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnLike(String value) {
            addCriterion("morning_peak_time_on like", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnNotLike(String value) {
            addCriterion("morning_peak_time_on not like", value, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnIn(List<String> values) {
            addCriterion("morning_peak_time_on in", values, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnNotIn(List<String> values) {
            addCriterion("morning_peak_time_on not in", values, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnBetween(String value1, String value2) {
            addCriterion("morning_peak_time_on between", value1, value2, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOnNotBetween(String value1, String value2) {
            addCriterion("morning_peak_time_on not between", value1, value2, "morningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffIsNull() {
            addCriterion("morning_peak_time_off is null");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffIsNotNull() {
            addCriterion("morning_peak_time_off is not null");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffEqualTo(String value) {
            addCriterion("morning_peak_time_off =", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffNotEqualTo(String value) {
            addCriterion("morning_peak_time_off <>", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffGreaterThan(String value) {
            addCriterion("morning_peak_time_off >", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffGreaterThanOrEqualTo(String value) {
            addCriterion("morning_peak_time_off >=", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffLessThan(String value) {
            addCriterion("morning_peak_time_off <", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffLessThanOrEqualTo(String value) {
            addCriterion("morning_peak_time_off <=", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffLike(String value) {
            addCriterion("morning_peak_time_off like", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffNotLike(String value) {
            addCriterion("morning_peak_time_off not like", value, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffIn(List<String> values) {
            addCriterion("morning_peak_time_off in", values, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffNotIn(List<String> values) {
            addCriterion("morning_peak_time_off not in", values, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffBetween(String value1, String value2) {
            addCriterion("morning_peak_time_off between", value1, value2, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andMorningPeakTimeOffNotBetween(String value1, String value2) {
            addCriterion("morning_peak_time_off not between", value1, value2, "morningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnIsNull() {
            addCriterion("evening_peak_time_on is null");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnIsNotNull() {
            addCriterion("evening_peak_time_on is not null");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnEqualTo(String value) {
            addCriterion("evening_peak_time_on =", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnNotEqualTo(String value) {
            addCriterion("evening_peak_time_on <>", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnGreaterThan(String value) {
            addCriterion("evening_peak_time_on >", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnGreaterThanOrEqualTo(String value) {
            addCriterion("evening_peak_time_on >=", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnLessThan(String value) {
            addCriterion("evening_peak_time_on <", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnLessThanOrEqualTo(String value) {
            addCriterion("evening_peak_time_on <=", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnLike(String value) {
            addCriterion("evening_peak_time_on like", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnNotLike(String value) {
            addCriterion("evening_peak_time_on not like", value, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnIn(List<String> values) {
            addCriterion("evening_peak_time_on in", values, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnNotIn(List<String> values) {
            addCriterion("evening_peak_time_on not in", values, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnBetween(String value1, String value2) {
            addCriterion("evening_peak_time_on between", value1, value2, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOnNotBetween(String value1, String value2) {
            addCriterion("evening_peak_time_on not between", value1, value2, "eveningPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffIsNull() {
            addCriterion("evening_peak_time_off is null");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffIsNotNull() {
            addCriterion("evening_peak_time_off is not null");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffEqualTo(String value) {
            addCriterion("evening_peak_time_off =", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffNotEqualTo(String value) {
            addCriterion("evening_peak_time_off <>", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffGreaterThan(String value) {
            addCriterion("evening_peak_time_off >", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffGreaterThanOrEqualTo(String value) {
            addCriterion("evening_peak_time_off >=", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffLessThan(String value) {
            addCriterion("evening_peak_time_off <", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffLessThanOrEqualTo(String value) {
            addCriterion("evening_peak_time_off <=", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffLike(String value) {
            addCriterion("evening_peak_time_off like", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffNotLike(String value) {
            addCriterion("evening_peak_time_off not like", value, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffIn(List<String> values) {
            addCriterion("evening_peak_time_off in", values, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffNotIn(List<String> values) {
            addCriterion("evening_peak_time_off not in", values, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffBetween(String value1, String value2) {
            addCriterion("evening_peak_time_off between", value1, value2, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andEveningPeakTimeOffNotBetween(String value1, String value2) {
            addCriterion("evening_peak_time_off not between", value1, value2, "eveningPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnIsNull() {
            addCriterion("other_peak_time_on is null");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnIsNotNull() {
            addCriterion("other_peak_time_on is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnEqualTo(String value) {
            addCriterion("other_peak_time_on =", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnNotEqualTo(String value) {
            addCriterion("other_peak_time_on <>", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnGreaterThan(String value) {
            addCriterion("other_peak_time_on >", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnGreaterThanOrEqualTo(String value) {
            addCriterion("other_peak_time_on >=", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnLessThan(String value) {
            addCriterion("other_peak_time_on <", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnLessThanOrEqualTo(String value) {
            addCriterion("other_peak_time_on <=", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnLike(String value) {
            addCriterion("other_peak_time_on like", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnNotLike(String value) {
            addCriterion("other_peak_time_on not like", value, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnIn(List<String> values) {
            addCriterion("other_peak_time_on in", values, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnNotIn(List<String> values) {
            addCriterion("other_peak_time_on not in", values, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnBetween(String value1, String value2) {
            addCriterion("other_peak_time_on between", value1, value2, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOnNotBetween(String value1, String value2) {
            addCriterion("other_peak_time_on not between", value1, value2, "otherPeakTimeOn");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffIsNull() {
            addCriterion("other_peak_time_off is null");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffIsNotNull() {
            addCriterion("other_peak_time_off is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffEqualTo(String value) {
            addCriterion("other_peak_time_off =", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffNotEqualTo(String value) {
            addCriterion("other_peak_time_off <>", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffGreaterThan(String value) {
            addCriterion("other_peak_time_off >", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffGreaterThanOrEqualTo(String value) {
            addCriterion("other_peak_time_off >=", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffLessThan(String value) {
            addCriterion("other_peak_time_off <", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffLessThanOrEqualTo(String value) {
            addCriterion("other_peak_time_off <=", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffLike(String value) {
            addCriterion("other_peak_time_off like", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffNotLike(String value) {
            addCriterion("other_peak_time_off not like", value, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffIn(List<String> values) {
            addCriterion("other_peak_time_off in", values, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffNotIn(List<String> values) {
            addCriterion("other_peak_time_off not in", values, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffBetween(String value1, String value2) {
            addCriterion("other_peak_time_off between", value1, value2, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andOtherPeakTimeOffNotBetween(String value1, String value2) {
            addCriterion("other_peak_time_off not between", value1, value2, "otherPeakTimeOff");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceIsNull() {
            addCriterion("peak_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceIsNotNull() {
            addCriterion("peak_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceEqualTo(BigDecimal value) {
            addCriterion("peak_unit_price =", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("peak_unit_price <>", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("peak_unit_price >", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_unit_price >=", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceLessThan(BigDecimal value) {
            addCriterion("peak_unit_price <", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_unit_price <=", value, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceIn(List<BigDecimal> values) {
            addCriterion("peak_unit_price in", values, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("peak_unit_price not in", values, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_unit_price between", value1, value2, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_unit_price not between", value1, value2, "peakUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileIsNull() {
            addCriterion("peak_price_start_mile is null");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileIsNotNull() {
            addCriterion("peak_price_start_mile is not null");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileEqualTo(BigDecimal value) {
            addCriterion("peak_price_start_mile =", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileNotEqualTo(BigDecimal value) {
            addCriterion("peak_price_start_mile <>", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileGreaterThan(BigDecimal value) {
            addCriterion("peak_price_start_mile >", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_price_start_mile >=", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileLessThan(BigDecimal value) {
            addCriterion("peak_price_start_mile <", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_price_start_mile <=", value, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileIn(List<BigDecimal> values) {
            addCriterion("peak_price_start_mile in", values, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileNotIn(List<BigDecimal> values) {
            addCriterion("peak_price_start_mile not in", values, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_price_start_mile between", value1, value2, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andPeakPriceStartMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_price_start_mile not between", value1, value2, "peakPriceStartMile");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteIsNull() {
            addCriterion("low_speed_price_per_minute is null");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteIsNotNull() {
            addCriterion("low_speed_price_per_minute is not null");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteEqualTo(BigDecimal value) {
            addCriterion("low_speed_price_per_minute =", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteNotEqualTo(BigDecimal value) {
            addCriterion("low_speed_price_per_minute <>", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteGreaterThan(BigDecimal value) {
            addCriterion("low_speed_price_per_minute >", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_speed_price_per_minute >=", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteLessThan(BigDecimal value) {
            addCriterion("low_speed_price_per_minute <", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_speed_price_per_minute <=", value, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteIn(List<BigDecimal> values) {
            addCriterion("low_speed_price_per_minute in", values, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteNotIn(List<BigDecimal> values) {
            addCriterion("low_speed_price_per_minute not in", values, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_speed_price_per_minute between", value1, value2, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andLowSpeedPricePerMinuteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_speed_price_per_minute not between", value1, value2, "lowSpeedPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileIsNull() {
            addCriterion("night_price_per_mile is null");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileIsNotNull() {
            addCriterion("night_price_per_mile is not null");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileEqualTo(BigDecimal value) {
            addCriterion("night_price_per_mile =", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileNotEqualTo(BigDecimal value) {
            addCriterion("night_price_per_mile <>", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileGreaterThan(BigDecimal value) {
            addCriterion("night_price_per_mile >", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("night_price_per_mile >=", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileLessThan(BigDecimal value) {
            addCriterion("night_price_per_mile <", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("night_price_per_mile <=", value, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileIn(List<BigDecimal> values) {
            addCriterion("night_price_per_mile in", values, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileNotIn(List<BigDecimal> values) {
            addCriterion("night_price_per_mile not in", values, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_price_per_mile between", value1, value2, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_price_per_mile not between", value1, value2, "nightPricePerMile");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteIsNull() {
            addCriterion("night_price_per_minute is null");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteIsNotNull() {
            addCriterion("night_price_per_minute is not null");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteEqualTo(BigDecimal value) {
            addCriterion("night_price_per_minute =", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteNotEqualTo(BigDecimal value) {
            addCriterion("night_price_per_minute <>", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteGreaterThan(BigDecimal value) {
            addCriterion("night_price_per_minute >", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("night_price_per_minute >=", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteLessThan(BigDecimal value) {
            addCriterion("night_price_per_minute <", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("night_price_per_minute <=", value, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteIn(List<BigDecimal> values) {
            addCriterion("night_price_per_minute in", values, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteNotIn(List<BigDecimal> values) {
            addCriterion("night_price_per_minute not in", values, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_price_per_minute between", value1, value2, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andNightPricePerMinuteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_price_per_minute not between", value1, value2, "nightPricePerMinute");
            return (Criteria) this;
        }

        public Criteria andOtherPriceIsNull() {
            addCriterion("other_price is null");
            return (Criteria) this;
        }

        public Criteria andOtherPriceIsNotNull() {
            addCriterion("other_price is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPriceEqualTo(String value) {
            addCriterion("other_price =", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceNotEqualTo(String value) {
            addCriterion("other_price <>", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceGreaterThan(String value) {
            addCriterion("other_price >", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceGreaterThanOrEqualTo(String value) {
            addCriterion("other_price >=", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceLessThan(String value) {
            addCriterion("other_price <", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceLessThanOrEqualTo(String value) {
            addCriterion("other_price <=", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceLike(String value) {
            addCriterion("other_price like", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceNotLike(String value) {
            addCriterion("other_price not like", value, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceIn(List<String> values) {
            addCriterion("other_price in", values, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceNotIn(List<String> values) {
            addCriterion("other_price not in", values, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceBetween(String value1, String value2) {
            addCriterion("other_price between", value1, value2, "otherPrice");
            return (Criteria) this;
        }

        public Criteria andOtherPriceNotBetween(String value1, String value2) {
            addCriterion("other_price not between", value1, value2, "otherPrice");
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