package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SharePayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SharePayExample() {
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(String value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(String value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(String value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(String value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(String value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(String value) {
            addCriterion("route_id like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(String value) {
            addCriterion("route_id not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<String> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<String> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(String value1, String value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(String value1, String value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
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

        public Criteria andDriverPhoneIsNull() {
            addCriterion("driver_phone is null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIsNotNull() {
            addCriterion("driver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneEqualTo(String value) {
            addCriterion("driver_phone =", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotEqualTo(String value) {
            addCriterion("driver_phone <>", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThan(String value) {
            addCriterion("driver_phone >", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("driver_phone >=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThan(String value) {
            addCriterion("driver_phone <", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThanOrEqualTo(String value) {
            addCriterion("driver_phone <=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLike(String value) {
            addCriterion("driver_phone like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotLike(String value) {
            addCriterion("driver_phone not like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIn(List<String> values) {
            addCriterion("driver_phone in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotIn(List<String> values) {
            addCriterion("driver_phone not in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneBetween(String value1, String value2) {
            addCriterion("driver_phone between", value1, value2, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotBetween(String value1, String value2) {
            addCriterion("driver_phone not between", value1, value2, "driverPhone");
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

        public Criteria andBookDepartTimeIsNull() {
            addCriterion("book_depart_time is null");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeIsNotNull() {
            addCriterion("book_depart_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeEqualTo(Long value) {
            addCriterion("book_depart_time =", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeNotEqualTo(Long value) {
            addCriterion("book_depart_time <>", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeGreaterThan(Long value) {
            addCriterion("book_depart_time >", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("book_depart_time >=", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeLessThan(Long value) {
            addCriterion("book_depart_time <", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeLessThanOrEqualTo(Long value) {
            addCriterion("book_depart_time <=", value, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeIn(List<Long> values) {
            addCriterion("book_depart_time in", values, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeNotIn(List<Long> values) {
            addCriterion("book_depart_time not in", values, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeBetween(Long value1, Long value2) {
            addCriterion("book_depart_time between", value1, value2, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andBookDepartTimeNotBetween(Long value1, Long value2) {
            addCriterion("book_depart_time not between", value1, value2, "bookDepartTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNull() {
            addCriterion("depart_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNotNull() {
            addCriterion("depart_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeEqualTo(Long value) {
            addCriterion("depart_time =", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotEqualTo(Long value) {
            addCriterion("depart_time <>", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThan(Long value) {
            addCriterion("depart_time >", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_time >=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThan(Long value) {
            addCriterion("depart_time <", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThanOrEqualTo(Long value) {
            addCriterion("depart_time <=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIn(List<Long> values) {
            addCriterion("depart_time in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotIn(List<Long> values) {
            addCriterion("depart_time not in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeBetween(Long value1, Long value2) {
            addCriterion("depart_time between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotBetween(Long value1, Long value2) {
            addCriterion("depart_time not between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("departure not between", value1, value2, "departure");
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

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
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

        public Criteria andDriveTimeEqualTo(Long value) {
            addCriterion("drive_time =", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotEqualTo(Long value) {
            addCriterion("drive_time <>", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeGreaterThan(Long value) {
            addCriterion("drive_time >", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("drive_time >=", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeLessThan(Long value) {
            addCriterion("drive_time <", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeLessThanOrEqualTo(Long value) {
            addCriterion("drive_time <=", value, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeIn(List<Long> values) {
            addCriterion("drive_time in", values, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotIn(List<Long> values) {
            addCriterion("drive_time not in", values, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeBetween(Long value1, Long value2) {
            addCriterion("drive_time between", value1, value2, "driveTime");
            return (Criteria) this;
        }

        public Criteria andDriveTimeNotBetween(Long value1, Long value2) {
            addCriterion("drive_time not between", value1, value2, "driveTime");
            return (Criteria) this;
        }

        public Criteria andFacePriceIsNull() {
            addCriterion("face_price is null");
            return (Criteria) this;
        }

        public Criteria andFacePriceIsNotNull() {
            addCriterion("face_price is not null");
            return (Criteria) this;
        }

        public Criteria andFacePriceEqualTo(BigDecimal value) {
            addCriterion("face_price =", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotEqualTo(BigDecimal value) {
            addCriterion("face_price <>", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceGreaterThan(BigDecimal value) {
            addCriterion("face_price >", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("face_price >=", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceLessThan(BigDecimal value) {
            addCriterion("face_price <", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("face_price <=", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceIn(List<BigDecimal> values) {
            addCriterion("face_price in", values, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotIn(List<BigDecimal> values) {
            addCriterion("face_price not in", values, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("face_price between", value1, value2, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("face_price not between", value1, value2, "facePrice");
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

        public Criteria andShareFueFeeIsNull() {
            addCriterion("share_fue_fee is null");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeIsNotNull() {
            addCriterion("share_fue_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeEqualTo(BigDecimal value) {
            addCriterion("share_fue_fee =", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeNotEqualTo(BigDecimal value) {
            addCriterion("share_fue_fee <>", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeGreaterThan(BigDecimal value) {
            addCriterion("share_fue_fee >", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_fue_fee >=", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeLessThan(BigDecimal value) {
            addCriterion("share_fue_fee <", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_fue_fee <=", value, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeIn(List<BigDecimal> values) {
            addCriterion("share_fue_fee in", values, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeNotIn(List<BigDecimal> values) {
            addCriterion("share_fue_fee not in", values, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_fue_fee between", value1, value2, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareFueFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_fue_fee not between", value1, value2, "shareFueFee");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollIsNull() {
            addCriterion("share_highway_toll is null");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollIsNotNull() {
            addCriterion("share_highway_toll is not null");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollEqualTo(BigDecimal value) {
            addCriterion("share_highway_toll =", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollNotEqualTo(BigDecimal value) {
            addCriterion("share_highway_toll <>", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollGreaterThan(BigDecimal value) {
            addCriterion("share_highway_toll >", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_highway_toll >=", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollLessThan(BigDecimal value) {
            addCriterion("share_highway_toll <", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_highway_toll <=", value, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollIn(List<BigDecimal> values) {
            addCriterion("share_highway_toll in", values, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollNotIn(List<BigDecimal> values) {
            addCriterion("share_highway_toll not in", values, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_highway_toll between", value1, value2, "shareHighwayToll");
            return (Criteria) this;
        }

        public Criteria andShareHighwayTollNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_highway_toll not between", value1, value2, "shareHighwayToll");
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

        public Criteria andPassengerTipEqualTo(BigDecimal value) {
            addCriterion("passenger_tip =", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotEqualTo(BigDecimal value) {
            addCriterion("passenger_tip <>", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipGreaterThan(BigDecimal value) {
            addCriterion("passenger_tip >", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("passenger_tip >=", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipLessThan(BigDecimal value) {
            addCriterion("passenger_tip <", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("passenger_tip <=", value, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipIn(List<BigDecimal> values) {
            addCriterion("passenger_tip in", values, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotIn(List<BigDecimal> values) {
            addCriterion("passenger_tip not in", values, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("passenger_tip between", value1, value2, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andPassengerTipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("passenger_tip not between", value1, value2, "passengerTip");
            return (Criteria) this;
        }

        public Criteria andShareOtherIsNull() {
            addCriterion("share_other is null");
            return (Criteria) this;
        }

        public Criteria andShareOtherIsNotNull() {
            addCriterion("share_other is not null");
            return (Criteria) this;
        }

        public Criteria andShareOtherEqualTo(BigDecimal value) {
            addCriterion("share_other =", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherNotEqualTo(BigDecimal value) {
            addCriterion("share_other <>", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherGreaterThan(BigDecimal value) {
            addCriterion("share_other >", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_other >=", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherLessThan(BigDecimal value) {
            addCriterion("share_other <", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_other <=", value, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherIn(List<BigDecimal> values) {
            addCriterion("share_other in", values, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherNotIn(List<BigDecimal> values) {
            addCriterion("share_other not in", values, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_other between", value1, value2, "shareOther");
            return (Criteria) this;
        }

        public Criteria andShareOtherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_other not between", value1, value2, "shareOther");
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

        public Criteria andPassengerNumIsNull() {
            addCriterion("passenger_num is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumIsNotNull() {
            addCriterion("passenger_num is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumEqualTo(Integer value) {
            addCriterion("passenger_num =", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotEqualTo(Integer value) {
            addCriterion("passenger_num <>", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumGreaterThan(Integer value) {
            addCriterion("passenger_num >", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_num >=", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumLessThan(Integer value) {
            addCriterion("passenger_num <", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_num <=", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumIn(List<Integer> values) {
            addCriterion("passenger_num in", values, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotIn(List<Integer> values) {
            addCriterion("passenger_num not in", values, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumBetween(Integer value1, Integer value2) {
            addCriterion("passenger_num between", value1, value2, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_num not between", value1, value2, "passengerNum");
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