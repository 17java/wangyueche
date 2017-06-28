package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class VehicleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public VehicleInfoExample() {
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

        public Criteria andPlateColorIsNull() {
            addCriterion("plate_color is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNotNull() {
            addCriterion("plate_color is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorEqualTo(String value) {
            addCriterion("plate_color =", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotEqualTo(String value) {
            addCriterion("plate_color <>", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThan(String value) {
            addCriterion("plate_color >", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("plate_color >=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThan(String value) {
            addCriterion("plate_color <", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThanOrEqualTo(String value) {
            addCriterion("plate_color <=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLike(String value) {
            addCriterion("plate_color like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotLike(String value) {
            addCriterion("plate_color not like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorIn(List<String> values) {
            addCriterion("plate_color in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotIn(List<String> values) {
            addCriterion("plate_color not in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorBetween(String value1, String value2) {
            addCriterion("plate_color between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotBetween(String value1, String value2) {
            addCriterion("plate_color not between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNull() {
            addCriterion("seats is null");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNotNull() {
            addCriterion("seats is not null");
            return (Criteria) this;
        }

        public Criteria andSeatsEqualTo(Integer value) {
            addCriterion("seats =", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotEqualTo(Integer value) {
            addCriterion("seats <>", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThan(Integer value) {
            addCriterion("seats >", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThanOrEqualTo(Integer value) {
            addCriterion("seats >=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThan(Integer value) {
            addCriterion("seats <", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThanOrEqualTo(Integer value) {
            addCriterion("seats <=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsIn(List<Integer> values) {
            addCriterion("seats in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotIn(List<Integer> values) {
            addCriterion("seats not in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsBetween(Integer value1, Integer value2) {
            addCriterion("seats between", value1, value2, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotBetween(Integer value1, Integer value2) {
            addCriterion("seats not between", value1, value2, "seats");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
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

        public Criteria andVehicleTypeIsNull() {
            addCriterion("vehicle_type is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("vehicle_type is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(String value) {
            addCriterion("vehicle_type =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(String value) {
            addCriterion("vehicle_type <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(String value) {
            addCriterion("vehicle_type >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_type >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(String value) {
            addCriterion("vehicle_type <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_type <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLike(String value) {
            addCriterion("vehicle_type like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotLike(String value) {
            addCriterion("vehicle_type not like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<String> values) {
            addCriterion("vehicle_type in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<String> values) {
            addCriterion("vehicle_type not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(String value1, String value2) {
            addCriterion("vehicle_type between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("vehicle_type not between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNull() {
            addCriterion("vehicle_color is null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNotNull() {
            addCriterion("vehicle_color is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorEqualTo(String value) {
            addCriterion("vehicle_color =", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotEqualTo(String value) {
            addCriterion("vehicle_color <>", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThan(String value) {
            addCriterion("vehicle_color >", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_color >=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThan(String value) {
            addCriterion("vehicle_color <", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThanOrEqualTo(String value) {
            addCriterion("vehicle_color <=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLike(String value) {
            addCriterion("vehicle_color like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotLike(String value) {
            addCriterion("vehicle_color not like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIn(List<String> values) {
            addCriterion("vehicle_color in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotIn(List<String> values) {
            addCriterion("vehicle_color not in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorBetween(String value1, String value2) {
            addCriterion("vehicle_color between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotBetween(String value1, String value2) {
            addCriterion("vehicle_color not between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNull() {
            addCriterion("engine_id is null");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNotNull() {
            addCriterion("engine_id is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIdEqualTo(String value) {
            addCriterion("engine_id =", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotEqualTo(String value) {
            addCriterion("engine_id <>", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThan(String value) {
            addCriterion("engine_id >", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThanOrEqualTo(String value) {
            addCriterion("engine_id >=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThan(String value) {
            addCriterion("engine_id <", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThanOrEqualTo(String value) {
            addCriterion("engine_id <=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLike(String value) {
            addCriterion("engine_id like", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotLike(String value) {
            addCriterion("engine_id not like", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdIn(List<String> values) {
            addCriterion("engine_id in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotIn(List<String> values) {
            addCriterion("engine_id not in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdBetween(String value1, String value2) {
            addCriterion("engine_id between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotBetween(String value1, String value2) {
            addCriterion("engine_id not between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAIsNull() {
            addCriterion("certify_date_A is null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAIsNotNull() {
            addCriterion("certify_date_A is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAEqualTo(Integer value) {
            addCriterion("certify_date_A =", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateANotEqualTo(Integer value) {
            addCriterion("certify_date_A <>", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAGreaterThan(Integer value) {
            addCriterion("certify_date_A >", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_date_A >=", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateALessThan(Integer value) {
            addCriterion("certify_date_A <", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateALessThanOrEqualTo(Integer value) {
            addCriterion("certify_date_A <=", value, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateAIn(List<Integer> values) {
            addCriterion("certify_date_A in", values, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateANotIn(List<Integer> values) {
            addCriterion("certify_date_A not in", values, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateABetween(Integer value1, Integer value2) {
            addCriterion("certify_date_A between", value1, value2, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andCertifyDateANotBetween(Integer value1, Integer value2) {
            addCriterion("certify_date_A not between", value1, value2, "certifyDateA");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceIsNull() {
            addCriterion("engine_displace is null");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceIsNotNull() {
            addCriterion("engine_displace is not null");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceEqualTo(String value) {
            addCriterion("engine_displace =", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceNotEqualTo(String value) {
            addCriterion("engine_displace <>", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceGreaterThan(String value) {
            addCriterion("engine_displace >", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceGreaterThanOrEqualTo(String value) {
            addCriterion("engine_displace >=", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceLessThan(String value) {
            addCriterion("engine_displace <", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceLessThanOrEqualTo(String value) {
            addCriterion("engine_displace <=", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceLike(String value) {
            addCriterion("engine_displace like", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceNotLike(String value) {
            addCriterion("engine_displace not like", value, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceIn(List<String> values) {
            addCriterion("engine_displace in", values, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceNotIn(List<String> values) {
            addCriterion("engine_displace not in", values, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceBetween(String value1, String value2) {
            addCriterion("engine_displace between", value1, value2, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andEngineDisplaceNotBetween(String value1, String value2) {
            addCriterion("engine_displace not between", value1, value2, "engineDisplace");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNull() {
            addCriterion("photo_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNotNull() {
            addCriterion("photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdEqualTo(String value) {
            addCriterion("photo_id =", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotEqualTo(String value) {
            addCriterion("photo_id <>", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThan(String value) {
            addCriterion("photo_id >", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("photo_id >=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThan(String value) {
            addCriterion("photo_id <", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("photo_id <=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLike(String value) {
            addCriterion("photo_id like", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotLike(String value) {
            addCriterion("photo_id not like", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIn(List<String> values) {
            addCriterion("photo_id in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotIn(List<String> values) {
            addCriterion("photo_id not in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdBetween(String value1, String value2) {
            addCriterion("photo_id between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotBetween(String value1, String value2) {
            addCriterion("photo_id not between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andTransAgencyIsNull() {
            addCriterion("trans_agency is null");
            return (Criteria) this;
        }

        public Criteria andTransAgencyIsNotNull() {
            addCriterion("trans_agency is not null");
            return (Criteria) this;
        }

        public Criteria andTransAgencyEqualTo(String value) {
            addCriterion("trans_agency =", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyNotEqualTo(String value) {
            addCriterion("trans_agency <>", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyGreaterThan(String value) {
            addCriterion("trans_agency >", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("trans_agency >=", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyLessThan(String value) {
            addCriterion("trans_agency <", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyLessThanOrEqualTo(String value) {
            addCriterion("trans_agency <=", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyLike(String value) {
            addCriterion("trans_agency like", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyNotLike(String value) {
            addCriterion("trans_agency not like", value, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyIn(List<String> values) {
            addCriterion("trans_agency in", values, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyNotIn(List<String> values) {
            addCriterion("trans_agency not in", values, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyBetween(String value1, String value2) {
            addCriterion("trans_agency between", value1, value2, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAgencyNotBetween(String value1, String value2) {
            addCriterion("trans_agency not between", value1, value2, "transAgency");
            return (Criteria) this;
        }

        public Criteria andTransAreaIsNull() {
            addCriterion("trans_area is null");
            return (Criteria) this;
        }

        public Criteria andTransAreaIsNotNull() {
            addCriterion("trans_area is not null");
            return (Criteria) this;
        }

        public Criteria andTransAreaEqualTo(String value) {
            addCriterion("trans_area =", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaNotEqualTo(String value) {
            addCriterion("trans_area <>", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaGreaterThan(String value) {
            addCriterion("trans_area >", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaGreaterThanOrEqualTo(String value) {
            addCriterion("trans_area >=", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaLessThan(String value) {
            addCriterion("trans_area <", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaLessThanOrEqualTo(String value) {
            addCriterion("trans_area <=", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaLike(String value) {
            addCriterion("trans_area like", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaNotLike(String value) {
            addCriterion("trans_area not like", value, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaIn(List<String> values) {
            addCriterion("trans_area in", values, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaNotIn(List<String> values) {
            addCriterion("trans_area not in", values, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaBetween(String value1, String value2) {
            addCriterion("trans_area between", value1, value2, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransAreaNotBetween(String value1, String value2) {
            addCriterion("trans_area not between", value1, value2, "transArea");
            return (Criteria) this;
        }

        public Criteria andTransDateStartIsNull() {
            addCriterion("trans_date_start is null");
            return (Criteria) this;
        }

        public Criteria andTransDateStartIsNotNull() {
            addCriterion("trans_date_start is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateStartEqualTo(Integer value) {
            addCriterion("trans_date_start =", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartNotEqualTo(Integer value) {
            addCriterion("trans_date_start <>", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartGreaterThan(Integer value) {
            addCriterion("trans_date_start >", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_date_start >=", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartLessThan(Integer value) {
            addCriterion("trans_date_start <", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartLessThanOrEqualTo(Integer value) {
            addCriterion("trans_date_start <=", value, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartIn(List<Integer> values) {
            addCriterion("trans_date_start in", values, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartNotIn(List<Integer> values) {
            addCriterion("trans_date_start not in", values, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartBetween(Integer value1, Integer value2) {
            addCriterion("trans_date_start between", value1, value2, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStartNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_date_start not between", value1, value2, "transDateStart");
            return (Criteria) this;
        }

        public Criteria andTransDateStopIsNull() {
            addCriterion("trans_date_stop is null");
            return (Criteria) this;
        }

        public Criteria andTransDateStopIsNotNull() {
            addCriterion("trans_date_stop is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateStopEqualTo(Integer value) {
            addCriterion("trans_date_stop =", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopNotEqualTo(Integer value) {
            addCriterion("trans_date_stop <>", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopGreaterThan(Integer value) {
            addCriterion("trans_date_stop >", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_date_stop >=", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopLessThan(Integer value) {
            addCriterion("trans_date_stop <", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopLessThanOrEqualTo(Integer value) {
            addCriterion("trans_date_stop <=", value, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopIn(List<Integer> values) {
            addCriterion("trans_date_stop in", values, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopNotIn(List<Integer> values) {
            addCriterion("trans_date_stop not in", values, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopBetween(Integer value1, Integer value2) {
            addCriterion("trans_date_stop between", value1, value2, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andTransDateStopNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_date_stop not between", value1, value2, "transDateStop");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBIsNull() {
            addCriterion("certify_date_B is null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBIsNotNull() {
            addCriterion("certify_date_B is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBEqualTo(Integer value) {
            addCriterion("certify_date_B =", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBNotEqualTo(Integer value) {
            addCriterion("certify_date_B <>", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBGreaterThan(Integer value) {
            addCriterion("certify_date_B >", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_date_B >=", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBLessThan(Integer value) {
            addCriterion("certify_date_B <", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBLessThanOrEqualTo(Integer value) {
            addCriterion("certify_date_B <=", value, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBIn(List<Integer> values) {
            addCriterion("certify_date_B in", values, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBNotIn(List<Integer> values) {
            addCriterion("certify_date_B not in", values, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBBetween(Integer value1, Integer value2) {
            addCriterion("certify_date_B between", value1, value2, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBNotBetween(Integer value1, Integer value2) {
            addCriterion("certify_date_B not between", value1, value2, "certifyDateB");
            return (Criteria) this;
        }

        public Criteria andFixStateIsNull() {
            addCriterion("fix_state is null");
            return (Criteria) this;
        }

        public Criteria andFixStateIsNotNull() {
            addCriterion("fix_state is not null");
            return (Criteria) this;
        }

        public Criteria andFixStateEqualTo(String value) {
            addCriterion("fix_state =", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateNotEqualTo(String value) {
            addCriterion("fix_state <>", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateGreaterThan(String value) {
            addCriterion("fix_state >", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateGreaterThanOrEqualTo(String value) {
            addCriterion("fix_state >=", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateLessThan(String value) {
            addCriterion("fix_state <", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateLessThanOrEqualTo(String value) {
            addCriterion("fix_state <=", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateLike(String value) {
            addCriterion("fix_state like", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateNotLike(String value) {
            addCriterion("fix_state not like", value, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateIn(List<String> values) {
            addCriterion("fix_state in", values, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateNotIn(List<String> values) {
            addCriterion("fix_state not in", values, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateBetween(String value1, String value2) {
            addCriterion("fix_state between", value1, value2, "fixState");
            return (Criteria) this;
        }

        public Criteria andFixStateNotBetween(String value1, String value2) {
            addCriterion("fix_state not between", value1, value2, "fixState");
            return (Criteria) this;
        }

        public Criteria andNextFixDateIsNull() {
            addCriterion("next_fix_date is null");
            return (Criteria) this;
        }

        public Criteria andNextFixDateIsNotNull() {
            addCriterion("next_fix_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextFixDateEqualTo(Integer value) {
            addCriterion("next_fix_date =", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateNotEqualTo(Integer value) {
            addCriterion("next_fix_date <>", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateGreaterThan(Integer value) {
            addCriterion("next_fix_date >", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("next_fix_date >=", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateLessThan(Integer value) {
            addCriterion("next_fix_date <", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateLessThanOrEqualTo(Integer value) {
            addCriterion("next_fix_date <=", value, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateIn(List<Integer> values) {
            addCriterion("next_fix_date in", values, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateNotIn(List<Integer> values) {
            addCriterion("next_fix_date not in", values, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateBetween(Integer value1, Integer value2) {
            addCriterion("next_fix_date between", value1, value2, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andNextFixDateNotBetween(Integer value1, Integer value2) {
            addCriterion("next_fix_date not between", value1, value2, "nextFixDate");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNull() {
            addCriterion("check_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("check_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(String value) {
            addCriterion("check_state =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(String value) {
            addCriterion("check_state <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(String value) {
            addCriterion("check_state >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(String value) {
            addCriterion("check_state >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(String value) {
            addCriterion("check_state <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(String value) {
            addCriterion("check_state <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<String> values) {
            addCriterion("check_state in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<String> values) {
            addCriterion("check_state not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(String value1, String value2) {
            addCriterion("check_state between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(String value1, String value2) {
            addCriterion("check_state not between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdIsNull() {
            addCriterion("fee_print_id is null");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdIsNotNull() {
            addCriterion("fee_print_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdEqualTo(String value) {
            addCriterion("fee_print_id =", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdNotEqualTo(String value) {
            addCriterion("fee_print_id <>", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdGreaterThan(String value) {
            addCriterion("fee_print_id >", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdGreaterThanOrEqualTo(String value) {
            addCriterion("fee_print_id >=", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdLessThan(String value) {
            addCriterion("fee_print_id <", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdLessThanOrEqualTo(String value) {
            addCriterion("fee_print_id <=", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdLike(String value) {
            addCriterion("fee_print_id like", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdNotLike(String value) {
            addCriterion("fee_print_id not like", value, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdIn(List<String> values) {
            addCriterion("fee_print_id in", values, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdNotIn(List<String> values) {
            addCriterion("fee_print_id not in", values, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdBetween(String value1, String value2) {
            addCriterion("fee_print_id between", value1, value2, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andFeePrintIdNotBetween(String value1, String value2) {
            addCriterion("fee_print_id not between", value1, value2, "feePrintId");
            return (Criteria) this;
        }

        public Criteria andGpsBrandIsNull() {
            addCriterion("gPS_brand is null");
            return (Criteria) this;
        }

        public Criteria andGpsBrandIsNotNull() {
            addCriterion("gPS_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGpsBrandEqualTo(String value) {
            addCriterion("gPS_brand =", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandNotEqualTo(String value) {
            addCriterion("gPS_brand <>", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandGreaterThan(String value) {
            addCriterion("gPS_brand >", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandGreaterThanOrEqualTo(String value) {
            addCriterion("gPS_brand >=", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandLessThan(String value) {
            addCriterion("gPS_brand <", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandLessThanOrEqualTo(String value) {
            addCriterion("gPS_brand <=", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandLike(String value) {
            addCriterion("gPS_brand like", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandNotLike(String value) {
            addCriterion("gPS_brand not like", value, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandIn(List<String> values) {
            addCriterion("gPS_brand in", values, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandNotIn(List<String> values) {
            addCriterion("gPS_brand not in", values, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandBetween(String value1, String value2) {
            addCriterion("gPS_brand between", value1, value2, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsBrandNotBetween(String value1, String value2) {
            addCriterion("gPS_brand not between", value1, value2, "gpsBrand");
            return (Criteria) this;
        }

        public Criteria andGpsModelIsNull() {
            addCriterion("gPS_model is null");
            return (Criteria) this;
        }

        public Criteria andGpsModelIsNotNull() {
            addCriterion("gPS_model is not null");
            return (Criteria) this;
        }

        public Criteria andGpsModelEqualTo(String value) {
            addCriterion("gPS_model =", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelNotEqualTo(String value) {
            addCriterion("gPS_model <>", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelGreaterThan(String value) {
            addCriterion("gPS_model >", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelGreaterThanOrEqualTo(String value) {
            addCriterion("gPS_model >=", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelLessThan(String value) {
            addCriterion("gPS_model <", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelLessThanOrEqualTo(String value) {
            addCriterion("gPS_model <=", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelLike(String value) {
            addCriterion("gPS_model like", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelNotLike(String value) {
            addCriterion("gPS_model not like", value, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelIn(List<String> values) {
            addCriterion("gPS_model in", values, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelNotIn(List<String> values) {
            addCriterion("gPS_model not in", values, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelBetween(String value1, String value2) {
            addCriterion("gPS_model between", value1, value2, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsModelNotBetween(String value1, String value2) {
            addCriterion("gPS_model not between", value1, value2, "gpsModel");
            return (Criteria) this;
        }

        public Criteria andGpsimeiIsNull() {
            addCriterion("gPSIMEI is null");
            return (Criteria) this;
        }

        public Criteria andGpsimeiIsNotNull() {
            addCriterion("gPSIMEI is not null");
            return (Criteria) this;
        }

        public Criteria andGpsimeiEqualTo(String value) {
            addCriterion("gPSIMEI =", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiNotEqualTo(String value) {
            addCriterion("gPSIMEI <>", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiGreaterThan(String value) {
            addCriterion("gPSIMEI >", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiGreaterThanOrEqualTo(String value) {
            addCriterion("gPSIMEI >=", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiLessThan(String value) {
            addCriterion("gPSIMEI <", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiLessThanOrEqualTo(String value) {
            addCriterion("gPSIMEI <=", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiLike(String value) {
            addCriterion("gPSIMEI like", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiNotLike(String value) {
            addCriterion("gPSIMEI not like", value, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiIn(List<String> values) {
            addCriterion("gPSIMEI in", values, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiNotIn(List<String> values) {
            addCriterion("gPSIMEI not in", values, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiBetween(String value1, String value2) {
            addCriterion("gPSIMEI between", value1, value2, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsimeiNotBetween(String value1, String value2) {
            addCriterion("gPSIMEI not between", value1, value2, "gpsimei");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateIsNull() {
            addCriterion("gPS_install_date is null");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateIsNotNull() {
            addCriterion("gPS_install_date is not null");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateEqualTo(Integer value) {
            addCriterion("gPS_install_date =", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateNotEqualTo(Integer value) {
            addCriterion("gPS_install_date <>", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateGreaterThan(Integer value) {
            addCriterion("gPS_install_date >", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gPS_install_date >=", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateLessThan(Integer value) {
            addCriterion("gPS_install_date <", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateLessThanOrEqualTo(Integer value) {
            addCriterion("gPS_install_date <=", value, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateIn(List<Integer> values) {
            addCriterion("gPS_install_date in", values, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateNotIn(List<Integer> values) {
            addCriterion("gPS_install_date not in", values, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateBetween(Integer value1, Integer value2) {
            addCriterion("gPS_install_date between", value1, value2, "gpsInstallDate");
            return (Criteria) this;
        }

        public Criteria andGpsInstallDateNotBetween(Integer value1, Integer value2) {
            addCriterion("gPS_install_date not between", value1, value2, "gpsInstallDate");
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

        public Criteria andCommercialTypeIsNull() {
            addCriterion("commercial_type is null");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeIsNotNull() {
            addCriterion("commercial_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeEqualTo(Integer value) {
            addCriterion("commercial_type =", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeNotEqualTo(Integer value) {
            addCriterion("commercial_type <>", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeGreaterThan(Integer value) {
            addCriterion("commercial_type >", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commercial_type >=", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeLessThan(Integer value) {
            addCriterion("commercial_type <", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeLessThanOrEqualTo(Integer value) {
            addCriterion("commercial_type <=", value, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeIn(List<Integer> values) {
            addCriterion("commercial_type in", values, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeNotIn(List<Integer> values) {
            addCriterion("commercial_type not in", values, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeBetween(Integer value1, Integer value2) {
            addCriterion("commercial_type between", value1, value2, "commercialType");
            return (Criteria) this;
        }

        public Criteria andCommercialTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("commercial_type not between", value1, value2, "commercialType");
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