package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OperateDepartArriveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OperateDepartArriveExample() {
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

        public Criteria andOnAreaIsNull() {
            addCriterion("on_area is null");
            return (Criteria) this;
        }

        public Criteria andOnAreaIsNotNull() {
            addCriterion("on_area is not null");
            return (Criteria) this;
        }

        public Criteria andOnAreaEqualTo(Integer value) {
            addCriterion("on_area =", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaNotEqualTo(Integer value) {
            addCriterion("on_area <>", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaGreaterThan(Integer value) {
            addCriterion("on_area >", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("on_area >=", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaLessThan(Integer value) {
            addCriterion("on_area <", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaLessThanOrEqualTo(Integer value) {
            addCriterion("on_area <=", value, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaIn(List<Integer> values) {
            addCriterion("on_area in", values, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaNotIn(List<Integer> values) {
            addCriterion("on_area not in", values, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaBetween(Integer value1, Integer value2) {
            addCriterion("on_area between", value1, value2, "onArea");
            return (Criteria) this;
        }

        public Criteria andOnAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("on_area not between", value1, value2, "onArea");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIsNull() {
            addCriterion("license_id is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIsNotNull() {
            addCriterion("license_id is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdEqualTo(String value) {
            addCriterion("license_id =", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotEqualTo(String value) {
            addCriterion("license_id <>", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThan(String value) {
            addCriterion("license_id >", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("license_id >=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThan(String value) {
            addCriterion("license_id <", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThanOrEqualTo(String value) {
            addCriterion("license_id <=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLike(String value) {
            addCriterion("license_id like", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotLike(String value) {
            addCriterion("license_id not like", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIn(List<String> values) {
            addCriterion("license_id in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotIn(List<String> values) {
            addCriterion("license_id not in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdBetween(String value1, String value2) {
            addCriterion("license_id between", value1, value2, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotBetween(String value1, String value2) {
            addCriterion("license_id not between", value1, value2, "licenseId");
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

        public Criteria andBookDepTimeIsNull() {
            addCriterion("book_dep_time is null");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeIsNotNull() {
            addCriterion("book_dep_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeEqualTo(Long value) {
            addCriterion("book_dep_time =", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeNotEqualTo(Long value) {
            addCriterion("book_dep_time <>", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeGreaterThan(Long value) {
            addCriterion("book_dep_time >", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("book_dep_time >=", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeLessThan(Long value) {
            addCriterion("book_dep_time <", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeLessThanOrEqualTo(Long value) {
            addCriterion("book_dep_time <=", value, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeIn(List<Long> values) {
            addCriterion("book_dep_time in", values, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeNotIn(List<Long> values) {
            addCriterion("book_dep_time not in", values, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeBetween(Long value1, Long value2) {
            addCriterion("book_dep_time between", value1, value2, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andBookDepTimeNotBetween(Long value1, Long value2) {
            addCriterion("book_dep_time not between", value1, value2, "bookDepTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNull() {
            addCriterion("wait_time is null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNotNull() {
            addCriterion("wait_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeEqualTo(Long value) {
            addCriterion("wait_time =", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotEqualTo(Long value) {
            addCriterion("wait_time <>", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThan(Long value) {
            addCriterion("wait_time >", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wait_time >=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThan(Long value) {
            addCriterion("wait_time <", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThanOrEqualTo(Long value) {
            addCriterion("wait_time <=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIn(List<Long> values) {
            addCriterion("wait_time in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotIn(List<Long> values) {
            addCriterion("wait_time not in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeBetween(Long value1, Long value2) {
            addCriterion("wait_time between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotBetween(Long value1, Long value2) {
            addCriterion("wait_time not between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeIsNull() {
            addCriterion("dep_longitude is null");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeIsNotNull() {
            addCriterion("dep_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeEqualTo(Double value) {
            addCriterion("dep_longitude =", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeNotEqualTo(Double value) {
            addCriterion("dep_longitude <>", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeGreaterThan(Double value) {
            addCriterion("dep_longitude >", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("dep_longitude >=", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeLessThan(Double value) {
            addCriterion("dep_longitude <", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("dep_longitude <=", value, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeIn(List<Double> values) {
            addCriterion("dep_longitude in", values, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeNotIn(List<Double> values) {
            addCriterion("dep_longitude not in", values, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeBetween(Double value1, Double value2) {
            addCriterion("dep_longitude between", value1, value2, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("dep_longitude not between", value1, value2, "depLongitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeIsNull() {
            addCriterion("dep_latitude is null");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeIsNotNull() {
            addCriterion("dep_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeEqualTo(Double value) {
            addCriterion("dep_latitude =", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeNotEqualTo(Double value) {
            addCriterion("dep_latitude <>", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeGreaterThan(Double value) {
            addCriterion("dep_latitude >", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("dep_latitude >=", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeLessThan(Double value) {
            addCriterion("dep_latitude <", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("dep_latitude <=", value, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeIn(List<Double> values) {
            addCriterion("dep_latitude in", values, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeNotIn(List<Double> values) {
            addCriterion("dep_latitude not in", values, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeBetween(Double value1, Double value2) {
            addCriterion("dep_latitude between", value1, value2, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("dep_latitude not between", value1, value2, "depLatitude");
            return (Criteria) this;
        }

        public Criteria andDepAreaIsNull() {
            addCriterion("dep_area is null");
            return (Criteria) this;
        }

        public Criteria andDepAreaIsNotNull() {
            addCriterion("dep_area is not null");
            return (Criteria) this;
        }

        public Criteria andDepAreaEqualTo(String value) {
            addCriterion("dep_area =", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaNotEqualTo(String value) {
            addCriterion("dep_area <>", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaGreaterThan(String value) {
            addCriterion("dep_area >", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaGreaterThanOrEqualTo(String value) {
            addCriterion("dep_area >=", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaLessThan(String value) {
            addCriterion("dep_area <", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaLessThanOrEqualTo(String value) {
            addCriterion("dep_area <=", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaLike(String value) {
            addCriterion("dep_area like", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaNotLike(String value) {
            addCriterion("dep_area not like", value, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaIn(List<String> values) {
            addCriterion("dep_area in", values, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaNotIn(List<String> values) {
            addCriterion("dep_area not in", values, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaBetween(String value1, String value2) {
            addCriterion("dep_area between", value1, value2, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepAreaNotBetween(String value1, String value2) {
            addCriterion("dep_area not between", value1, value2, "depArea");
            return (Criteria) this;
        }

        public Criteria andDepTimeIsNull() {
            addCriterion("dep_time is null");
            return (Criteria) this;
        }

        public Criteria andDepTimeIsNotNull() {
            addCriterion("dep_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepTimeEqualTo(Long value) {
            addCriterion("dep_time =", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeNotEqualTo(Long value) {
            addCriterion("dep_time <>", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeGreaterThan(Long value) {
            addCriterion("dep_time >", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("dep_time >=", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeLessThan(Long value) {
            addCriterion("dep_time <", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeLessThanOrEqualTo(Long value) {
            addCriterion("dep_time <=", value, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeIn(List<Long> values) {
            addCriterion("dep_time in", values, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeNotIn(List<Long> values) {
            addCriterion("dep_time not in", values, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeBetween(Long value1, Long value2) {
            addCriterion("dep_time between", value1, value2, "depTime");
            return (Criteria) this;
        }

        public Criteria andDepTimeNotBetween(Long value1, Long value2) {
            addCriterion("dep_time not between", value1, value2, "depTime");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNull() {
            addCriterion("encrypt is null");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNotNull() {
            addCriterion("encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptEqualTo(Integer value) {
            addCriterion("encrypt =", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotEqualTo(Integer value) {
            addCriterion("encrypt <>", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThan(Integer value) {
            addCriterion("encrypt >", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThanOrEqualTo(Integer value) {
            addCriterion("encrypt >=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThan(Integer value) {
            addCriterion("encrypt <", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThanOrEqualTo(Integer value) {
            addCriterion("encrypt <=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptIn(List<Integer> values) {
            addCriterion("encrypt in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotIn(List<Integer> values) {
            addCriterion("encrypt not in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptBetween(Integer value1, Integer value2) {
            addCriterion("encrypt between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotBetween(Integer value1, Integer value2) {
            addCriterion("encrypt not between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeIsNull() {
            addCriterion("dest_longitude is null");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeIsNotNull() {
            addCriterion("dest_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeEqualTo(Double value) {
            addCriterion("dest_longitude =", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeNotEqualTo(Double value) {
            addCriterion("dest_longitude <>", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeGreaterThan(Double value) {
            addCriterion("dest_longitude >", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("dest_longitude >=", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeLessThan(Double value) {
            addCriterion("dest_longitude <", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("dest_longitude <=", value, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeIn(List<Double> values) {
            addCriterion("dest_longitude in", values, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeNotIn(List<Double> values) {
            addCriterion("dest_longitude not in", values, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeBetween(Double value1, Double value2) {
            addCriterion("dest_longitude between", value1, value2, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("dest_longitude not between", value1, value2, "destLongitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeIsNull() {
            addCriterion("dest_latitude is null");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeIsNotNull() {
            addCriterion("dest_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeEqualTo(Double value) {
            addCriterion("dest_latitude =", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeNotEqualTo(Double value) {
            addCriterion("dest_latitude <>", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeGreaterThan(Double value) {
            addCriterion("dest_latitude >", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("dest_latitude >=", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeLessThan(Double value) {
            addCriterion("dest_latitude <", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("dest_latitude <=", value, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeIn(List<Double> values) {
            addCriterion("dest_latitude in", values, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeNotIn(List<Double> values) {
            addCriterion("dest_latitude not in", values, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeBetween(Double value1, Double value2) {
            addCriterion("dest_latitude between", value1, value2, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("dest_latitude not between", value1, value2, "destLatitude");
            return (Criteria) this;
        }

        public Criteria andDestAreaIsNull() {
            addCriterion("dest_area is null");
            return (Criteria) this;
        }

        public Criteria andDestAreaIsNotNull() {
            addCriterion("dest_area is not null");
            return (Criteria) this;
        }

        public Criteria andDestAreaEqualTo(String value) {
            addCriterion("dest_area =", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaNotEqualTo(String value) {
            addCriterion("dest_area <>", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaGreaterThan(String value) {
            addCriterion("dest_area >", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaGreaterThanOrEqualTo(String value) {
            addCriterion("dest_area >=", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaLessThan(String value) {
            addCriterion("dest_area <", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaLessThanOrEqualTo(String value) {
            addCriterion("dest_area <=", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaLike(String value) {
            addCriterion("dest_area like", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaNotLike(String value) {
            addCriterion("dest_area not like", value, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaIn(List<String> values) {
            addCriterion("dest_area in", values, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaNotIn(List<String> values) {
            addCriterion("dest_area not in", values, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaBetween(String value1, String value2) {
            addCriterion("dest_area between", value1, value2, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestAreaNotBetween(String value1, String value2) {
            addCriterion("dest_area not between", value1, value2, "destArea");
            return (Criteria) this;
        }

        public Criteria andDestTimeIsNull() {
            addCriterion("dest_time is null");
            return (Criteria) this;
        }

        public Criteria andDestTimeIsNotNull() {
            addCriterion("dest_time is not null");
            return (Criteria) this;
        }

        public Criteria andDestTimeEqualTo(Long value) {
            addCriterion("dest_time =", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeNotEqualTo(Long value) {
            addCriterion("dest_time <>", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeGreaterThan(Long value) {
            addCriterion("dest_time >", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("dest_time >=", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeLessThan(Long value) {
            addCriterion("dest_time <", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeLessThanOrEqualTo(Long value) {
            addCriterion("dest_time <=", value, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeIn(List<Long> values) {
            addCriterion("dest_time in", values, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeNotIn(List<Long> values) {
            addCriterion("dest_time not in", values, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeBetween(Long value1, Long value2) {
            addCriterion("dest_time between", value1, value2, "destTime");
            return (Criteria) this;
        }

        public Criteria andDestTimeNotBetween(Long value1, Long value2) {
            addCriterion("dest_time not between", value1, value2, "destTime");
            return (Criteria) this;
        }

        public Criteria andBookModelIsNull() {
            addCriterion("book_model is null");
            return (Criteria) this;
        }

        public Criteria andBookModelIsNotNull() {
            addCriterion("book_model is not null");
            return (Criteria) this;
        }

        public Criteria andBookModelEqualTo(String value) {
            addCriterion("book_model =", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelNotEqualTo(String value) {
            addCriterion("book_model <>", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelGreaterThan(String value) {
            addCriterion("book_model >", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelGreaterThanOrEqualTo(String value) {
            addCriterion("book_model >=", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelLessThan(String value) {
            addCriterion("book_model <", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelLessThanOrEqualTo(String value) {
            addCriterion("book_model <=", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelLike(String value) {
            addCriterion("book_model like", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelNotLike(String value) {
            addCriterion("book_model not like", value, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelIn(List<String> values) {
            addCriterion("book_model in", values, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelNotIn(List<String> values) {
            addCriterion("book_model not in", values, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelBetween(String value1, String value2) {
            addCriterion("book_model between", value1, value2, "bookModel");
            return (Criteria) this;
        }

        public Criteria andBookModelNotBetween(String value1, String value2) {
            addCriterion("book_model not between", value1, value2, "bookModel");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andDriveMileIsNull() {
            addCriterion("drive_mile is null");
            return (Criteria) this;
        }

        public Criteria andDriveMileIsNotNull() {
            addCriterion("drive_mile is not null");
            return (Criteria) this;
        }

        public Criteria andDriveMileEqualTo(BigDecimal value) {
            addCriterion("drive_mile =", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileNotEqualTo(BigDecimal value) {
            addCriterion("drive_mile <>", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileGreaterThan(BigDecimal value) {
            addCriterion("drive_mile >", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drive_mile >=", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileLessThan(BigDecimal value) {
            addCriterion("drive_mile <", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drive_mile <=", value, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileIn(List<BigDecimal> values) {
            addCriterion("drive_mile in", values, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileNotIn(List<BigDecimal> values) {
            addCriterion("drive_mile not in", values, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drive_mile between", value1, value2, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drive_mile not between", value1, value2, "driveMile");
            return (Criteria) this;
        }

        public Criteria andDriveTimeIsNull() {
            addCriterion("drive_time is null");
            return (Criteria) this;
        }

        public Criteria andDriveTimeIsNotNull() {
            addCriterion("drive_time is not null");
            return (Criteria) this;
        }

        public Criteria andDriveTimeEqualTo(Integer value) {
            addCriterion("drive_time =", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotEqualTo(Integer value) {
            addCriterion("drive_time <>", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeGreaterThan(Integer value) {
            addCriterion("drive_time >", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drive_time >=", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeLessThan(Integer value) {
            addCriterion("drive_time <", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("drive_time <=", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeIn(List<Integer> values) {
            addCriterion("drive_time in", values, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotIn(List<Integer> values) {
            addCriterion("drive_time not in", values, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeBetween(Integer value1, Integer value2) {
            addCriterion("drive_time between", value1, value2, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("drive_time not between", value1, value2, "driveTime");
            return (Criteria) this;
        }

        public Criteria andWaitMileIsNull() {
            addCriterion("wait_mile is null");
            return (Criteria) this;
        }

        public Criteria andWaitMileIsNotNull() {
            addCriterion("wait_mile is not null");
            return (Criteria) this;
        }

        public Criteria andWaitMileEqualTo(BigDecimal value) {
            addCriterion("wait_mile =", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileNotEqualTo(BigDecimal value) {
            addCriterion("wait_mile <>", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileGreaterThan(BigDecimal value) {
            addCriterion("wait_mile >", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_mile >=", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileLessThan(BigDecimal value) {
            addCriterion("wait_mile <", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_mile <=", value, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileIn(List<BigDecimal> values) {
            addCriterion("wait_mile in", values, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileNotIn(List<BigDecimal> values) {
            addCriterion("wait_mile not in", values, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_mile between", value1, value2, "waitMile");
            return (Criteria) this;
        }

        public Criteria andWaitMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_mile not between", value1, value2, "waitMile");
            return (Criteria) this;
        }

        public Criteria andFactPriceIsNull() {
            addCriterion("fact_price is null");
            return (Criteria) this;
        }

        public Criteria andFactPriceIsNotNull() {
            addCriterion("fact_price is not null");
            return (Criteria) this;
        }

        public Criteria andFactPriceEqualTo(BigDecimal value) {
            addCriterion("fact_price =", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotEqualTo(BigDecimal value) {
            addCriterion("fact_price <>", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceGreaterThan(BigDecimal value) {
            addCriterion("fact_price >", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_price >=", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceLessThan(BigDecimal value) {
            addCriterion("fact_price <", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_price <=", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceIn(List<BigDecimal> values) {
            addCriterion("fact_price in", values, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotIn(List<BigDecimal> values) {
            addCriterion("fact_price not in", values, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_price between", value1, value2, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_price not between", value1, value2, "factPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCashPriceIsNull() {
            addCriterion("cash_price is null");
            return (Criteria) this;
        }

        public Criteria andCashPriceIsNotNull() {
            addCriterion("cash_price is not null");
            return (Criteria) this;
        }

        public Criteria andCashPriceEqualTo(BigDecimal value) {
            addCriterion("cash_price =", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceNotEqualTo(BigDecimal value) {
            addCriterion("cash_price <>", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceGreaterThan(BigDecimal value) {
            addCriterion("cash_price >", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_price >=", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceLessThan(BigDecimal value) {
            addCriterion("cash_price <", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_price <=", value, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceIn(List<BigDecimal> values) {
            addCriterion("cash_price in", values, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceNotIn(List<BigDecimal> values) {
            addCriterion("cash_price not in", values, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_price between", value1, value2, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andCashPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_price not between", value1, value2, "cashPrice");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLinePriceIsNull() {
            addCriterion("line_price is null");
            return (Criteria) this;
        }

        public Criteria andLinePriceIsNotNull() {
            addCriterion("line_price is not null");
            return (Criteria) this;
        }

        public Criteria andLinePriceEqualTo(BigDecimal value) {
            addCriterion("line_price =", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotEqualTo(BigDecimal value) {
            addCriterion("line_price <>", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceGreaterThan(BigDecimal value) {
            addCriterion("line_price >", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("line_price >=", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceLessThan(BigDecimal value) {
            addCriterion("line_price <", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("line_price <=", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceIn(List<BigDecimal> values) {
            addCriterion("line_price in", values, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotIn(List<BigDecimal> values) {
            addCriterion("line_price not in", values, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_price between", value1, value2, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_price not between", value1, value2, "linePrice");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNull() {
            addCriterion("pos_name is null");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNotNull() {
            addCriterion("pos_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosNameEqualTo(String value) {
            addCriterion("pos_name =", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotEqualTo(String value) {
            addCriterion("pos_name <>", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThan(String value) {
            addCriterion("pos_name >", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThanOrEqualTo(String value) {
            addCriterion("pos_name >=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThan(String value) {
            addCriterion("pos_name <", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThanOrEqualTo(String value) {
            addCriterion("pos_name <=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLike(String value) {
            addCriterion("pos_name like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotLike(String value) {
            addCriterion("pos_name not like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameIn(List<String> values) {
            addCriterion("pos_name in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotIn(List<String> values) {
            addCriterion("pos_name not in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameBetween(String value1, String value2) {
            addCriterion("pos_name between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotBetween(String value1, String value2) {
            addCriterion("pos_name not between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosPriceIsNull() {
            addCriterion("pos_price is null");
            return (Criteria) this;
        }

        public Criteria andPosPriceIsNotNull() {
            addCriterion("pos_price is not null");
            return (Criteria) this;
        }

        public Criteria andPosPriceEqualTo(BigDecimal value) {
            addCriterion("pos_price =", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceNotEqualTo(BigDecimal value) {
            addCriterion("pos_price <>", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceGreaterThan(BigDecimal value) {
            addCriterion("pos_price >", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_price >=", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceLessThan(BigDecimal value) {
            addCriterion("pos_price <", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_price <=", value, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceIn(List<BigDecimal> values) {
            addCriterion("pos_price in", values, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceNotIn(List<BigDecimal> values) {
            addCriterion("pos_price not in", values, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_price between", value1, value2, "posPrice");
            return (Criteria) this;
        }

        public Criteria andPosPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_price not between", value1, value2, "posPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceIsNull() {
            addCriterion("benfit_price is null");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceIsNotNull() {
            addCriterion("benfit_price is not null");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceEqualTo(BigDecimal value) {
            addCriterion("benfit_price =", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceNotEqualTo(BigDecimal value) {
            addCriterion("benfit_price <>", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceGreaterThan(BigDecimal value) {
            addCriterion("benfit_price >", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("benfit_price >=", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceLessThan(BigDecimal value) {
            addCriterion("benfit_price <", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("benfit_price <=", value, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceIn(List<BigDecimal> values) {
            addCriterion("benfit_price in", values, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceNotIn(List<BigDecimal> values) {
            addCriterion("benfit_price not in", values, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benfit_price between", value1, value2, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBenfitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benfit_price not between", value1, value2, "benfitPrice");
            return (Criteria) this;
        }

        public Criteria andBookTipIsNull() {
            addCriterion("book_tip is null");
            return (Criteria) this;
        }

        public Criteria andBookTipIsNotNull() {
            addCriterion("book_tip is not null");
            return (Criteria) this;
        }

        public Criteria andBookTipEqualTo(BigDecimal value) {
            addCriterion("book_tip =", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipNotEqualTo(BigDecimal value) {
            addCriterion("book_tip <>", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipGreaterThan(BigDecimal value) {
            addCriterion("book_tip >", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_tip >=", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipLessThan(BigDecimal value) {
            addCriterion("book_tip <", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_tip <=", value, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipIn(List<BigDecimal> values) {
            addCriterion("book_tip in", values, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipNotIn(List<BigDecimal> values) {
            addCriterion("book_tip not in", values, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_tip between", value1, value2, "bookTip");
            return (Criteria) this;
        }

        public Criteria andBookTipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_tip not between", value1, value2, "bookTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipIsNull() {
            addCriterion("passenger_tip is null");
            return (Criteria) this;
        }

        public Criteria andPassengerTipIsNotNull() {
            addCriterion("passenger_tip is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerTipEqualTo(Integer value) {
            addCriterion("passenger_tip =", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotEqualTo(Integer value) {
            addCriterion("passenger_tip <>", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipGreaterThan(Integer value) {
            addCriterion("passenger_tip >", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_tip >=", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipLessThan(Integer value) {
            addCriterion("passenger_tip <", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_tip <=", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipIn(List<Integer> values) {
            addCriterion("passenger_tip in", values, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotIn(List<Integer> values) {
            addCriterion("passenger_tip not in", values, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipBetween(Integer value1, Integer value2) {
            addCriterion("passenger_tip between", value1, value2, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_tip not between", value1, value2, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceIsNull() {
            addCriterion("peak_up_price is null");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceIsNotNull() {
            addCriterion("peak_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceEqualTo(BigDecimal value) {
            addCriterion("peak_up_price =", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceNotEqualTo(BigDecimal value) {
            addCriterion("peak_up_price <>", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceGreaterThan(BigDecimal value) {
            addCriterion("peak_up_price >", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_up_price >=", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceLessThan(BigDecimal value) {
            addCriterion("peak_up_price <", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("peak_up_price <=", value, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceIn(List<BigDecimal> values) {
            addCriterion("peak_up_price in", values, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceNotIn(List<BigDecimal> values) {
            addCriterion("peak_up_price not in", values, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_up_price between", value1, value2, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andPeakUpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peak_up_price not between", value1, value2, "peakUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceIsNull() {
            addCriterion("night_up_price is null");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceIsNotNull() {
            addCriterion("night_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceEqualTo(BigDecimal value) {
            addCriterion("night_up_price =", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceNotEqualTo(BigDecimal value) {
            addCriterion("night_up_price <>", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceGreaterThan(BigDecimal value) {
            addCriterion("night_up_price >", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("night_up_price >=", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceLessThan(BigDecimal value) {
            addCriterion("night_up_price <", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("night_up_price <=", value, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceIn(List<BigDecimal> values) {
            addCriterion("night_up_price in", values, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceNotIn(List<BigDecimal> values) {
            addCriterion("night_up_price not in", values, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_up_price between", value1, value2, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andNightUpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("night_up_price not between", value1, value2, "nightUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceIsNull() {
            addCriterion("far_up_price is null");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceIsNotNull() {
            addCriterion("far_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceEqualTo(BigDecimal value) {
            addCriterion("far_up_price =", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceNotEqualTo(BigDecimal value) {
            addCriterion("far_up_price <>", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceGreaterThan(BigDecimal value) {
            addCriterion("far_up_price >", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("far_up_price >=", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceLessThan(BigDecimal value) {
            addCriterion("far_up_price <", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("far_up_price <=", value, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceIn(List<BigDecimal> values) {
            addCriterion("far_up_price in", values, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceNotIn(List<BigDecimal> values) {
            addCriterion("far_up_price not in", values, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("far_up_price between", value1, value2, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andFarUpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("far_up_price not between", value1, value2, "farUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceIsNull() {
            addCriterion("other_up_price is null");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceIsNotNull() {
            addCriterion("other_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceEqualTo(BigDecimal value) {
            addCriterion("other_up_price =", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceNotEqualTo(BigDecimal value) {
            addCriterion("other_up_price <>", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceGreaterThan(BigDecimal value) {
            addCriterion("other_up_price >", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_up_price >=", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceLessThan(BigDecimal value) {
            addCriterion("other_up_price <", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_up_price <=", value, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceIn(List<BigDecimal> values) {
            addCriterion("other_up_price in", values, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceNotIn(List<BigDecimal> values) {
            addCriterion("other_up_price not in", values, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_up_price between", value1, value2, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andOtherUpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_up_price not between", value1, value2, "otherUpPrice");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(String value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(String value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(String value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(String value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(String value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLike(String value) {
            addCriterion("pay_state like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotLike(String value) {
            addCriterion("pay_state not like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<String> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<String> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(String value1, String value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(String value1, String value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Long value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Long value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Long value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Long value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Long value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Long> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Long> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Long value1, Long value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Long value1, Long value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeIsNull() {
            addCriterion("order_match_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeIsNotNull() {
            addCriterion("order_match_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeEqualTo(Long value) {
            addCriterion("order_match_time =", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeNotEqualTo(Long value) {
            addCriterion("order_match_time <>", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeGreaterThan(Long value) {
            addCriterion("order_match_time >", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_match_time >=", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeLessThan(Long value) {
            addCriterion("order_match_time <", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeLessThanOrEqualTo(Long value) {
            addCriterion("order_match_time <=", value, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeIn(List<Long> values) {
            addCriterion("order_match_time in", values, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeNotIn(List<Long> values) {
            addCriterion("order_match_time not in", values, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeBetween(Long value1, Long value2) {
            addCriterion("order_match_time between", value1, value2, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andOrderMatchTimeNotBetween(Long value1, Long value2) {
            addCriterion("order_match_time not between", value1, value2, "orderMatchTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("invoice_status like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("invoice_status not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateIsNull() {
            addCriterion("begin_beyond_operate is null");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateIsNotNull() {
            addCriterion("begin_beyond_operate is not null");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateEqualTo(Integer value) {
            addCriterion("begin_beyond_operate =", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateNotEqualTo(Integer value) {
            addCriterion("begin_beyond_operate <>", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateGreaterThan(Integer value) {
            addCriterion("begin_beyond_operate >", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_beyond_operate >=", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateLessThan(Integer value) {
            addCriterion("begin_beyond_operate <", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateLessThanOrEqualTo(Integer value) {
            addCriterion("begin_beyond_operate <=", value, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateIn(List<Integer> values) {
            addCriterion("begin_beyond_operate in", values, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateNotIn(List<Integer> values) {
            addCriterion("begin_beyond_operate not in", values, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateBetween(Integer value1, Integer value2) {
            addCriterion("begin_beyond_operate between", value1, value2, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andBeginBeyondOperateNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_beyond_operate not between", value1, value2, "beginBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateIsNull() {
            addCriterion("end_beyond_operate is null");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateIsNotNull() {
            addCriterion("end_beyond_operate is not null");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateEqualTo(Integer value) {
            addCriterion("end_beyond_operate =", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateNotEqualTo(Integer value) {
            addCriterion("end_beyond_operate <>", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateGreaterThan(Integer value) {
            addCriterion("end_beyond_operate >", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_beyond_operate >=", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateLessThan(Integer value) {
            addCriterion("end_beyond_operate <", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateLessThanOrEqualTo(Integer value) {
            addCriterion("end_beyond_operate <=", value, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateIn(List<Integer> values) {
            addCriterion("end_beyond_operate in", values, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateNotIn(List<Integer> values) {
            addCriterion("end_beyond_operate not in", values, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateBetween(Integer value1, Integer value2) {
            addCriterion("end_beyond_operate between", value1, value2, "endBeyondOperate");
            return (Criteria) this;
        }

        public Criteria andEndBeyondOperateNotBetween(Integer value1, Integer value2) {
            addCriterion("end_beyond_operate not between", value1, value2, "endBeyondOperate");
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