package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OrderInfoExample() {
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Long value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Long value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Long value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Long value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Long value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Long> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Long> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Long value1, Long value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Long value1, Long value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteIsNull() {
            addCriterion("passenger_note is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteIsNotNull() {
            addCriterion("passenger_note is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteEqualTo(String value) {
            addCriterion("passenger_note =", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteNotEqualTo(String value) {
            addCriterion("passenger_note <>", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteGreaterThan(String value) {
            addCriterion("passenger_note >", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_note >=", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteLessThan(String value) {
            addCriterion("passenger_note <", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteLessThanOrEqualTo(String value) {
            addCriterion("passenger_note <=", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteLike(String value) {
            addCriterion("passenger_note like", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteNotLike(String value) {
            addCriterion("passenger_note not like", value, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteIn(List<String> values) {
            addCriterion("passenger_note in", values, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteNotIn(List<String> values) {
            addCriterion("passenger_note not in", values, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteBetween(String value1, String value2) {
            addCriterion("passenger_note between", value1, value2, "passengerNote");
            return (Criteria) this;
        }

        public Criteria andPassengerNoteNotBetween(String value1, String value2) {
            addCriterion("passenger_note not between", value1, value2, "passengerNote");
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

        public Criteria andDistributeTimeIsNull() {
            addCriterion("distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNotNull() {
            addCriterion("distribute_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeEqualTo(Long value) {
            addCriterion("distribute_time =", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotEqualTo(Long value) {
            addCriterion("distribute_time <>", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThan(Long value) {
            addCriterion("distribute_time >", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("distribute_time >=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThan(Long value) {
            addCriterion("distribute_time <", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThanOrEqualTo(Long value) {
            addCriterion("distribute_time <=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIn(List<Long> values) {
            addCriterion("distribute_time in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotIn(List<Long> values) {
            addCriterion("distribute_time not in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeBetween(Long value1, Long value2) {
            addCriterion("distribute_time between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotBetween(Long value1, Long value2) {
            addCriterion("distribute_time not between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Long value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Long value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Long value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Long value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Long value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Long> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Long> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Long value1, Long value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Long value1, Long value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeIsNull() {
            addCriterion("cancel_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeIsNotNull() {
            addCriterion("cancel_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeEqualTo(String value) {
            addCriterion("cancel_type_code =", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeNotEqualTo(String value) {
            addCriterion("cancel_type_code <>", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeGreaterThan(String value) {
            addCriterion("cancel_type_code >", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_type_code >=", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeLessThan(String value) {
            addCriterion("cancel_type_code <", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("cancel_type_code <=", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeLike(String value) {
            addCriterion("cancel_type_code like", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeNotLike(String value) {
            addCriterion("cancel_type_code not like", value, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeIn(List<String> values) {
            addCriterion("cancel_type_code in", values, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeNotIn(List<String> values) {
            addCriterion("cancel_type_code not in", values, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeBetween(String value1, String value2) {
            addCriterion("cancel_type_code between", value1, value2, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelTypeCodeNotBetween(String value1, String value2) {
            addCriterion("cancel_type_code not between", value1, value2, "cancelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
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