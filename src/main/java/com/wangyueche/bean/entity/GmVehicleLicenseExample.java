package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GmVehicleLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public GmVehicleLicenseExample() {
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

        public Criteria andVehicleTypeCodeIsNull() {
            addCriterion("vehicle_type_code is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIsNotNull() {
            addCriterion("vehicle_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeEqualTo(String value) {
            addCriterion("vehicle_type_code =", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotEqualTo(String value) {
            addCriterion("vehicle_type_code <>", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThan(String value) {
            addCriterion("vehicle_type_code >", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_type_code >=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThan(String value) {
            addCriterion("vehicle_type_code <", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_type_code <=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLike(String value) {
            addCriterion("vehicle_type_code like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotLike(String value) {
            addCriterion("vehicle_type_code not like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIn(List<String> values) {
            addCriterion("vehicle_type_code in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotIn(List<String> values) {
            addCriterion("vehicle_type_code not in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeBetween(String value1, String value2) {
            addCriterion("vehicle_type_code between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotBetween(String value1, String value2) {
            addCriterion("vehicle_type_code not between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Integer value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Integer value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Integer value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Integer value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Integer> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Integer> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Integer value1, Integer value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaIsNull() {
            addCriterion("certify_dateA is null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaIsNotNull() {
            addCriterion("certify_dateA is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaEqualTo(Integer value) {
            addCriterion("certify_dateA =", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaNotEqualTo(Integer value) {
            addCriterion("certify_dateA <>", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaGreaterThan(Integer value) {
            addCriterion("certify_dateA >", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_dateA >=", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaLessThan(Integer value) {
            addCriterion("certify_dateA <", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaLessThanOrEqualTo(Integer value) {
            addCriterion("certify_dateA <=", value, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaIn(List<Integer> values) {
            addCriterion("certify_dateA in", values, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaNotIn(List<Integer> values) {
            addCriterion("certify_dateA not in", values, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaBetween(Integer value1, Integer value2) {
            addCriterion("certify_dateA between", value1, value2, "certifyDatea");
            return (Criteria) this;
        }

        public Criteria andCertifyDateaNotBetween(Integer value1, Integer value2) {
            addCriterion("certify_dateA not between", value1, value2, "certifyDatea");
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

        public Criteria andWheelbaseIsNull() {
            addCriterion("wheelbase is null");
            return (Criteria) this;
        }

        public Criteria andWheelbaseIsNotNull() {
            addCriterion("wheelbase is not null");
            return (Criteria) this;
        }

        public Criteria andWheelbaseEqualTo(BigDecimal value) {
            addCriterion("wheelbase =", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseNotEqualTo(BigDecimal value) {
            addCriterion("wheelbase <>", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseGreaterThan(BigDecimal value) {
            addCriterion("wheelbase >", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wheelbase >=", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseLessThan(BigDecimal value) {
            addCriterion("wheelbase <", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wheelbase <=", value, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseIn(List<BigDecimal> values) {
            addCriterion("wheelbase in", values, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseNotIn(List<BigDecimal> values) {
            addCriterion("wheelbase not in", values, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheelbase between", value1, value2, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andWheelbaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheelbase not between", value1, value2, "wheelbase");
            return (Criteria) this;
        }

        public Criteria andCommanderIsNull() {
            addCriterion("commander is null");
            return (Criteria) this;
        }

        public Criteria andCommanderIsNotNull() {
            addCriterion("commander is not null");
            return (Criteria) this;
        }

        public Criteria andCommanderEqualTo(BigDecimal value) {
            addCriterion("commander =", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderNotEqualTo(BigDecimal value) {
            addCriterion("commander <>", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderGreaterThan(BigDecimal value) {
            addCriterion("commander >", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commander >=", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderLessThan(BigDecimal value) {
            addCriterion("commander <", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commander <=", value, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderIn(List<BigDecimal> values) {
            addCriterion("commander in", values, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderNotIn(List<BigDecimal> values) {
            addCriterion("commander not in", values, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commander between", value1, value2, "commander");
            return (Criteria) this;
        }

        public Criteria andCommanderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commander not between", value1, value2, "commander");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(BigDecimal value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(BigDecimal value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(BigDecimal value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(BigDecimal value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<BigDecimal> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<BigDecimal> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power not between", value1, value2, "power");
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