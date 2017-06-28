package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VehicleInsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public VehicleInsuranceExample() {
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

        public Criteria andVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andInsurComIsNull() {
            addCriterion("insur_com is null");
            return (Criteria) this;
        }

        public Criteria andInsurComIsNotNull() {
            addCriterion("insur_com is not null");
            return (Criteria) this;
        }

        public Criteria andInsurComEqualTo(String value) {
            addCriterion("insur_com =", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComNotEqualTo(String value) {
            addCriterion("insur_com <>", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComGreaterThan(String value) {
            addCriterion("insur_com >", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComGreaterThanOrEqualTo(String value) {
            addCriterion("insur_com >=", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComLessThan(String value) {
            addCriterion("insur_com <", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComLessThanOrEqualTo(String value) {
            addCriterion("insur_com <=", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComLike(String value) {
            addCriterion("insur_com like", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComNotLike(String value) {
            addCriterion("insur_com not like", value, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComIn(List<String> values) {
            addCriterion("insur_com in", values, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComNotIn(List<String> values) {
            addCriterion("insur_com not in", values, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComBetween(String value1, String value2) {
            addCriterion("insur_com between", value1, value2, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurComNotBetween(String value1, String value2) {
            addCriterion("insur_com not between", value1, value2, "insurCom");
            return (Criteria) this;
        }

        public Criteria andInsurNumIsNull() {
            addCriterion("insur_num is null");
            return (Criteria) this;
        }

        public Criteria andInsurNumIsNotNull() {
            addCriterion("insur_num is not null");
            return (Criteria) this;
        }

        public Criteria andInsurNumEqualTo(String value) {
            addCriterion("insur_num =", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumNotEqualTo(String value) {
            addCriterion("insur_num <>", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumGreaterThan(String value) {
            addCriterion("insur_num >", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumGreaterThanOrEqualTo(String value) {
            addCriterion("insur_num >=", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumLessThan(String value) {
            addCriterion("insur_num <", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumLessThanOrEqualTo(String value) {
            addCriterion("insur_num <=", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumLike(String value) {
            addCriterion("insur_num like", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumNotLike(String value) {
            addCriterion("insur_num not like", value, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumIn(List<String> values) {
            addCriterion("insur_num in", values, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumNotIn(List<String> values) {
            addCriterion("insur_num not in", values, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumBetween(String value1, String value2) {
            addCriterion("insur_num between", value1, value2, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurNumNotBetween(String value1, String value2) {
            addCriterion("insur_num not between", value1, value2, "insurNum");
            return (Criteria) this;
        }

        public Criteria andInsurTypeIsNull() {
            addCriterion("insur_type is null");
            return (Criteria) this;
        }

        public Criteria andInsurTypeIsNotNull() {
            addCriterion("insur_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsurTypeEqualTo(String value) {
            addCriterion("insur_type =", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeNotEqualTo(String value) {
            addCriterion("insur_type <>", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeGreaterThan(String value) {
            addCriterion("insur_type >", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeGreaterThanOrEqualTo(String value) {
            addCriterion("insur_type >=", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeLessThan(String value) {
            addCriterion("insur_type <", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeLessThanOrEqualTo(String value) {
            addCriterion("insur_type <=", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeLike(String value) {
            addCriterion("insur_type like", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeNotLike(String value) {
            addCriterion("insur_type not like", value, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeIn(List<String> values) {
            addCriterion("insur_type in", values, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeNotIn(List<String> values) {
            addCriterion("insur_type not in", values, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeBetween(String value1, String value2) {
            addCriterion("insur_type between", value1, value2, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurTypeNotBetween(String value1, String value2) {
            addCriterion("insur_type not between", value1, value2, "insurType");
            return (Criteria) this;
        }

        public Criteria andInsurCountIsNull() {
            addCriterion("insur_count is null");
            return (Criteria) this;
        }

        public Criteria andInsurCountIsNotNull() {
            addCriterion("insur_count is not null");
            return (Criteria) this;
        }

        public Criteria andInsurCountEqualTo(BigDecimal value) {
            addCriterion("insur_count =", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountNotEqualTo(BigDecimal value) {
            addCriterion("insur_count <>", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountGreaterThan(BigDecimal value) {
            addCriterion("insur_count >", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insur_count >=", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountLessThan(BigDecimal value) {
            addCriterion("insur_count <", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insur_count <=", value, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountIn(List<BigDecimal> values) {
            addCriterion("insur_count in", values, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountNotIn(List<BigDecimal> values) {
            addCriterion("insur_count not in", values, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insur_count between", value1, value2, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insur_count not between", value1, value2, "insurCount");
            return (Criteria) this;
        }

        public Criteria andInsurEffIsNull() {
            addCriterion("insur_eff is null");
            return (Criteria) this;
        }

        public Criteria andInsurEffIsNotNull() {
            addCriterion("insur_eff is not null");
            return (Criteria) this;
        }

        public Criteria andInsurEffEqualTo(Integer value) {
            addCriterion("insur_eff =", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffNotEqualTo(Integer value) {
            addCriterion("insur_eff <>", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffGreaterThan(Integer value) {
            addCriterion("insur_eff >", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffGreaterThanOrEqualTo(Integer value) {
            addCriterion("insur_eff >=", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffLessThan(Integer value) {
            addCriterion("insur_eff <", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffLessThanOrEqualTo(Integer value) {
            addCriterion("insur_eff <=", value, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffIn(List<Integer> values) {
            addCriterion("insur_eff in", values, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffNotIn(List<Integer> values) {
            addCriterion("insur_eff not in", values, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffBetween(Integer value1, Integer value2) {
            addCriterion("insur_eff between", value1, value2, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurEffNotBetween(Integer value1, Integer value2) {
            addCriterion("insur_eff not between", value1, value2, "insurEff");
            return (Criteria) this;
        }

        public Criteria andInsurExpIsNull() {
            addCriterion("insur_exp is null");
            return (Criteria) this;
        }

        public Criteria andInsurExpIsNotNull() {
            addCriterion("insur_exp is not null");
            return (Criteria) this;
        }

        public Criteria andInsurExpEqualTo(Integer value) {
            addCriterion("insur_exp =", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpNotEqualTo(Integer value) {
            addCriterion("insur_exp <>", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpGreaterThan(Integer value) {
            addCriterion("insur_exp >", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("insur_exp >=", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpLessThan(Integer value) {
            addCriterion("insur_exp <", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpLessThanOrEqualTo(Integer value) {
            addCriterion("insur_exp <=", value, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpIn(List<Integer> values) {
            addCriterion("insur_exp in", values, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpNotIn(List<Integer> values) {
            addCriterion("insur_exp not in", values, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpBetween(Integer value1, Integer value2) {
            addCriterion("insur_exp between", value1, value2, "insurExp");
            return (Criteria) this;
        }

        public Criteria andInsurExpNotBetween(Integer value1, Integer value2) {
            addCriterion("insur_exp not between", value1, value2, "insurExp");
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