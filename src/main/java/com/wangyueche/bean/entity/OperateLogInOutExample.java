package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class OperateLogInOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OperateLogInOutExample() {
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Long value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Long value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Long value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Long value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Long value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Long> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Long> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Long value1, Long value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Long value1, Long value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andInLongitudeIsNull() {
            addCriterion("in_longitude is null");
            return (Criteria) this;
        }

        public Criteria andInLongitudeIsNotNull() {
            addCriterion("in_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andInLongitudeEqualTo(Double value) {
            addCriterion("in_longitude =", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeNotEqualTo(Double value) {
            addCriterion("in_longitude <>", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeGreaterThan(Double value) {
            addCriterion("in_longitude >", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("in_longitude >=", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeLessThan(Double value) {
            addCriterion("in_longitude <", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("in_longitude <=", value, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeIn(List<Double> values) {
            addCriterion("in_longitude in", values, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeNotIn(List<Double> values) {
            addCriterion("in_longitude not in", values, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeBetween(Double value1, Double value2) {
            addCriterion("in_longitude between", value1, value2, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("in_longitude not between", value1, value2, "inLongitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeIsNull() {
            addCriterion("in_latitude is null");
            return (Criteria) this;
        }

        public Criteria andInLatitudeIsNotNull() {
            addCriterion("in_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andInLatitudeEqualTo(Double value) {
            addCriterion("in_latitude =", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeNotEqualTo(Double value) {
            addCriterion("in_latitude <>", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeGreaterThan(Double value) {
            addCriterion("in_latitude >", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("in_latitude >=", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeLessThan(Double value) {
            addCriterion("in_latitude <", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("in_latitude <=", value, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeIn(List<Double> values) {
            addCriterion("in_latitude in", values, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeNotIn(List<Double> values) {
            addCriterion("in_latitude not in", values, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeBetween(Double value1, Double value2) {
            addCriterion("in_latitude between", value1, value2, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("in_latitude not between", value1, value2, "inLatitude");
            return (Criteria) this;
        }

        public Criteria andInEncryptIsNull() {
            addCriterion("in_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andInEncryptIsNotNull() {
            addCriterion("in_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andInEncryptEqualTo(Integer value) {
            addCriterion("in_encrypt =", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptNotEqualTo(Integer value) {
            addCriterion("in_encrypt <>", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptGreaterThan(Integer value) {
            addCriterion("in_encrypt >", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_encrypt >=", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptLessThan(Integer value) {
            addCriterion("in_encrypt <", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptLessThanOrEqualTo(Integer value) {
            addCriterion("in_encrypt <=", value, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptIn(List<Integer> values) {
            addCriterion("in_encrypt in", values, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptNotIn(List<Integer> values) {
            addCriterion("in_encrypt not in", values, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptBetween(Integer value1, Integer value2) {
            addCriterion("in_encrypt between", value1, value2, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andInEncryptNotBetween(Integer value1, Integer value2) {
            addCriterion("in_encrypt not between", value1, value2, "inEncrypt");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNull() {
            addCriterion("logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNotNull() {
            addCriterion("logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeEqualTo(Long value) {
            addCriterion("logout_time =", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotEqualTo(Long value) {
            addCriterion("logout_time <>", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThan(Long value) {
            addCriterion("logout_time >", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("logout_time >=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThan(Long value) {
            addCriterion("logout_time <", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThanOrEqualTo(Long value) {
            addCriterion("logout_time <=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIn(List<Long> values) {
            addCriterion("logout_time in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotIn(List<Long> values) {
            addCriterion("logout_time not in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeBetween(Long value1, Long value2) {
            addCriterion("logout_time between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotBetween(Long value1, Long value2) {
            addCriterion("logout_time not between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeIsNull() {
            addCriterion("out_longitude is null");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeIsNotNull() {
            addCriterion("out_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeEqualTo(Double value) {
            addCriterion("out_longitude =", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeNotEqualTo(Double value) {
            addCriterion("out_longitude <>", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeGreaterThan(Double value) {
            addCriterion("out_longitude >", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("out_longitude >=", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeLessThan(Double value) {
            addCriterion("out_longitude <", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("out_longitude <=", value, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeIn(List<Double> values) {
            addCriterion("out_longitude in", values, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeNotIn(List<Double> values) {
            addCriterion("out_longitude not in", values, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeBetween(Double value1, Double value2) {
            addCriterion("out_longitude between", value1, value2, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("out_longitude not between", value1, value2, "outLongitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeIsNull() {
            addCriterion("out_latitude is null");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeIsNotNull() {
            addCriterion("out_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeEqualTo(Double value) {
            addCriterion("out_latitude =", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeNotEqualTo(Double value) {
            addCriterion("out_latitude <>", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeGreaterThan(Double value) {
            addCriterion("out_latitude >", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("out_latitude >=", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeLessThan(Double value) {
            addCriterion("out_latitude <", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("out_latitude <=", value, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeIn(List<Double> values) {
            addCriterion("out_latitude in", values, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeNotIn(List<Double> values) {
            addCriterion("out_latitude not in", values, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeBetween(Double value1, Double value2) {
            addCriterion("out_latitude between", value1, value2, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("out_latitude not between", value1, value2, "outLatitude");
            return (Criteria) this;
        }

        public Criteria andOutEncryptIsNull() {
            addCriterion("out_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andOutEncryptIsNotNull() {
            addCriterion("out_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andOutEncryptEqualTo(Integer value) {
            addCriterion("out_encrypt =", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptNotEqualTo(Integer value) {
            addCriterion("out_encrypt <>", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptGreaterThan(Integer value) {
            addCriterion("out_encrypt >", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_encrypt >=", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptLessThan(Integer value) {
            addCriterion("out_encrypt <", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptLessThanOrEqualTo(Integer value) {
            addCriterion("out_encrypt <=", value, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptIn(List<Integer> values) {
            addCriterion("out_encrypt in", values, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptNotIn(List<Integer> values) {
            addCriterion("out_encrypt not in", values, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptBetween(Integer value1, Integer value2) {
            addCriterion("out_encrypt between", value1, value2, "outEncrypt");
            return (Criteria) this;
        }

        public Criteria andOutEncryptNotBetween(Integer value1, Integer value2) {
            addCriterion("out_encrypt not between", value1, value2, "outEncrypt");
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