package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShareRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ShareRouteExample() {
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

        public Criteria andRouteCreateTimeIsNull() {
            addCriterion("route_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeIsNotNull() {
            addCriterion("route_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeEqualTo(Long value) {
            addCriterion("route_create_time =", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeNotEqualTo(Long value) {
            addCriterion("route_create_time <>", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeGreaterThan(Long value) {
            addCriterion("route_create_time >", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("route_create_time >=", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeLessThan(Long value) {
            addCriterion("route_create_time <", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("route_create_time <=", value, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeIn(List<Long> values) {
            addCriterion("route_create_time in", values, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeNotIn(List<Long> values) {
            addCriterion("route_create_time not in", values, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeBetween(Long value1, Long value2) {
            addCriterion("route_create_time between", value1, value2, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("route_create_time not between", value1, value2, "routeCreateTime");
            return (Criteria) this;
        }

        public Criteria andRouteMileIsNull() {
            addCriterion("route_mile is null");
            return (Criteria) this;
        }

        public Criteria andRouteMileIsNotNull() {
            addCriterion("route_mile is not null");
            return (Criteria) this;
        }

        public Criteria andRouteMileEqualTo(BigDecimal value) {
            addCriterion("route_mile =", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileNotEqualTo(BigDecimal value) {
            addCriterion("route_mile <>", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileGreaterThan(BigDecimal value) {
            addCriterion("route_mile >", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("route_mile >=", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileLessThan(BigDecimal value) {
            addCriterion("route_mile <", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("route_mile <=", value, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileIn(List<BigDecimal> values) {
            addCriterion("route_mile in", values, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileNotIn(List<BigDecimal> values) {
            addCriterion("route_mile not in", values, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("route_mile between", value1, value2, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteMileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("route_mile not between", value1, value2, "routeMile");
            return (Criteria) this;
        }

        public Criteria andRouteNoteIsNull() {
            addCriterion("route_note is null");
            return (Criteria) this;
        }

        public Criteria andRouteNoteIsNotNull() {
            addCriterion("route_note is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNoteEqualTo(String value) {
            addCriterion("route_note =", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteNotEqualTo(String value) {
            addCriterion("route_note <>", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteGreaterThan(String value) {
            addCriterion("route_note >", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteGreaterThanOrEqualTo(String value) {
            addCriterion("route_note >=", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteLessThan(String value) {
            addCriterion("route_note <", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteLessThanOrEqualTo(String value) {
            addCriterion("route_note <=", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteLike(String value) {
            addCriterion("route_note like", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteNotLike(String value) {
            addCriterion("route_note not like", value, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteIn(List<String> values) {
            addCriterion("route_note in", values, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteNotIn(List<String> values) {
            addCriterion("route_note not in", values, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteBetween(String value1, String value2) {
            addCriterion("route_note between", value1, value2, "routeNote");
            return (Criteria) this;
        }

        public Criteria andRouteNoteNotBetween(String value1, String value2) {
            addCriterion("route_note not between", value1, value2, "routeNote");
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