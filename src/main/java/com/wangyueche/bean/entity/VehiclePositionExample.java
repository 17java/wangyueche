package com.wangyueche.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VehiclePositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public VehiclePositionExample() {
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

        public Criteria andVehicleRegionCodeIsNull() {
            addCriterion("vehicle_region_code is null");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeIsNotNull() {
            addCriterion("vehicle_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeEqualTo(Integer value) {
            addCriterion("vehicle_region_code =", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeNotEqualTo(Integer value) {
            addCriterion("vehicle_region_code <>", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeGreaterThan(Integer value) {
            addCriterion("vehicle_region_code >", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_region_code >=", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeLessThan(Integer value) {
            addCriterion("vehicle_region_code <", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_region_code <=", value, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeIn(List<Integer> values) {
            addCriterion("vehicle_region_code in", values, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeNotIn(List<Integer> values) {
            addCriterion("vehicle_region_code not in", values, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_region_code between", value1, value2, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andVehicleRegionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_region_code not between", value1, value2, "vehicleRegionCode");
            return (Criteria) this;
        }

        public Criteria andPositionTimeIsNull() {
            addCriterion("position_time is null");
            return (Criteria) this;
        }

        public Criteria andPositionTimeIsNotNull() {
            addCriterion("position_time is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTimeEqualTo(Long value) {
            addCriterion("position_time =", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeNotEqualTo(Long value) {
            addCriterion("position_time <>", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeGreaterThan(Long value) {
            addCriterion("position_time >", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("position_time >=", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeLessThan(Long value) {
            addCriterion("position_time <", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeLessThanOrEqualTo(Long value) {
            addCriterion("position_time <=", value, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeIn(List<Long> values) {
            addCriterion("position_time in", values, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeNotIn(List<Long> values) {
            addCriterion("position_time not in", values, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeBetween(Long value1, Long value2) {
            addCriterion("position_time between", value1, value2, "positionTime");
            return (Criteria) this;
        }

        public Criteria andPositionTimeNotBetween(Long value1, Long value2) {
            addCriterion("position_time not between", value1, value2, "positionTime");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(BigDecimal value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(BigDecimal value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(BigDecimal value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(BigDecimal value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<BigDecimal> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<BigDecimal> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(BigDecimal value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(BigDecimal value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(BigDecimal value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(BigDecimal value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<BigDecimal> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<BigDecimal> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andElevationIsNull() {
            addCriterion("elevation is null");
            return (Criteria) this;
        }

        public Criteria andElevationIsNotNull() {
            addCriterion("elevation is not null");
            return (Criteria) this;
        }

        public Criteria andElevationEqualTo(BigDecimal value) {
            addCriterion("elevation =", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotEqualTo(BigDecimal value) {
            addCriterion("elevation <>", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThan(BigDecimal value) {
            addCriterion("elevation >", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("elevation >=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThan(BigDecimal value) {
            addCriterion("elevation <", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("elevation <=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationIn(List<BigDecimal> values) {
            addCriterion("elevation in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotIn(List<BigDecimal> values) {
            addCriterion("elevation not in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("elevation between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("elevation not between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(BigDecimal value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(BigDecimal value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(BigDecimal value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(BigDecimal value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<BigDecimal> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<BigDecimal> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
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

        public Criteria andWarnStatusIsNull() {
            addCriterion("warn_status is null");
            return (Criteria) this;
        }

        public Criteria andWarnStatusIsNotNull() {
            addCriterion("warn_status is not null");
            return (Criteria) this;
        }

        public Criteria andWarnStatusEqualTo(Integer value) {
            addCriterion("warn_status =", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusNotEqualTo(Integer value) {
            addCriterion("warn_status <>", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusGreaterThan(Integer value) {
            addCriterion("warn_status >", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_status >=", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusLessThan(Integer value) {
            addCriterion("warn_status <", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("warn_status <=", value, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusIn(List<Integer> values) {
            addCriterion("warn_status in", values, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusNotIn(List<Integer> values) {
            addCriterion("warn_status not in", values, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusBetween(Integer value1, Integer value2) {
            addCriterion("warn_status between", value1, value2, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andWarnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_status not between", value1, value2, "warnStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusIsNull() {
            addCriterion("veh_status is null");
            return (Criteria) this;
        }

        public Criteria andVehStatusIsNotNull() {
            addCriterion("veh_status is not null");
            return (Criteria) this;
        }

        public Criteria andVehStatusEqualTo(Integer value) {
            addCriterion("veh_status =", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusNotEqualTo(Integer value) {
            addCriterion("veh_status <>", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusGreaterThan(Integer value) {
            addCriterion("veh_status >", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("veh_status >=", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusLessThan(Integer value) {
            addCriterion("veh_status <", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusLessThanOrEqualTo(Integer value) {
            addCriterion("veh_status <=", value, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusIn(List<Integer> values) {
            addCriterion("veh_status in", values, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusNotIn(List<Integer> values) {
            addCriterion("veh_status not in", values, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusBetween(Integer value1, Integer value2) {
            addCriterion("veh_status between", value1, value2, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andVehStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("veh_status not between", value1, value2, "vehStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNull() {
            addCriterion("biz_status is null");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNotNull() {
            addCriterion("biz_status is not null");
            return (Criteria) this;
        }

        public Criteria andBizStatusEqualTo(Integer value) {
            addCriterion("biz_status =", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotEqualTo(Integer value) {
            addCriterion("biz_status <>", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThan(Integer value) {
            addCriterion("biz_status >", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_status >=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThan(Integer value) {
            addCriterion("biz_status <", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThanOrEqualTo(Integer value) {
            addCriterion("biz_status <=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusIn(List<Integer> values) {
            addCriterion("biz_status in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotIn(List<Integer> values) {
            addCriterion("biz_status not in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusBetween(Integer value1, Integer value2) {
            addCriterion("biz_status between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_status not between", value1, value2, "bizStatus");
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