package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class GmCompanyBusinessLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public GmCompanyBusinessLicenseExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIsNull() {
            addCriterion("address_code is null");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIsNotNull() {
            addCriterion("address_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCodeEqualTo(Integer value) {
            addCriterion("address_code =", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotEqualTo(Integer value) {
            addCriterion("address_code <>", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeGreaterThan(Integer value) {
            addCriterion("address_code >", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_code >=", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeLessThan(Integer value) {
            addCriterion("address_code <", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeLessThanOrEqualTo(Integer value) {
            addCriterion("address_code <=", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIn(List<Integer> values) {
            addCriterion("address_code in", values, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotIn(List<Integer> values) {
            addCriterion("address_code not in", values, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeBetween(Integer value1, Integer value2) {
            addCriterion("address_code between", value1, value2, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("address_code not between", value1, value2, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("address_name =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("address_name >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("address_name <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("address_name like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("address_name not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("address_name in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "addressName");
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

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIsNull() {
            addCriterion("operating_state is null");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIsNotNull() {
            addCriterion("operating_state is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingStateEqualTo(String value) {
            addCriterion("operating_state =", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotEqualTo(String value) {
            addCriterion("operating_state <>", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateGreaterThan(String value) {
            addCriterion("operating_state >", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateGreaterThanOrEqualTo(String value) {
            addCriterion("operating_state >=", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateLessThan(String value) {
            addCriterion("operating_state <", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateLessThanOrEqualTo(String value) {
            addCriterion("operating_state <=", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateLike(String value) {
            addCriterion("operating_state like", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotLike(String value) {
            addCriterion("operating_state not like", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIn(List<String> values) {
            addCriterion("operating_state in", values, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotIn(List<String> values) {
            addCriterion("operating_state not in", values, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateBetween(String value1, String value2) {
            addCriterion("operating_state between", value1, value2, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotBetween(String value1, String value2) {
            addCriterion("operating_state not between", value1, value2, "operatingState");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureIsNull() {
            addCriterion("economic_nature is null");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureIsNotNull() {
            addCriterion("economic_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureEqualTo(String value) {
            addCriterion("economic_nature =", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureNotEqualTo(String value) {
            addCriterion("economic_nature <>", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureGreaterThan(String value) {
            addCriterion("economic_nature >", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureGreaterThanOrEqualTo(String value) {
            addCriterion("economic_nature >=", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureLessThan(String value) {
            addCriterion("economic_nature <", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureLessThanOrEqualTo(String value) {
            addCriterion("economic_nature <=", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureLike(String value) {
            addCriterion("economic_nature like", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureNotLike(String value) {
            addCriterion("economic_nature not like", value, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureIn(List<String> values) {
            addCriterion("economic_nature in", values, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureNotIn(List<String> values) {
            addCriterion("economic_nature not in", values, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureBetween(String value1, String value2) {
            addCriterion("economic_nature between", value1, value2, "economicNature");
            return (Criteria) this;
        }

        public Criteria andEconomicNatureNotBetween(String value1, String value2) {
            addCriterion("economic_nature not between", value1, value2, "economicNature");
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

        public Criteria andOperationAreaIsNull() {
            addCriterion("operation_area is null");
            return (Criteria) this;
        }

        public Criteria andOperationAreaIsNotNull() {
            addCriterion("operation_area is not null");
            return (Criteria) this;
        }

        public Criteria andOperationAreaEqualTo(String value) {
            addCriterion("operation_area =", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaNotEqualTo(String value) {
            addCriterion("operation_area <>", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaGreaterThan(String value) {
            addCriterion("operation_area >", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("operation_area >=", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaLessThan(String value) {
            addCriterion("operation_area <", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaLessThanOrEqualTo(String value) {
            addCriterion("operation_area <=", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaLike(String value) {
            addCriterion("operation_area like", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaNotLike(String value) {
            addCriterion("operation_area not like", value, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaIn(List<String> values) {
            addCriterion("operation_area in", values, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaNotIn(List<String> values) {
            addCriterion("operation_area not in", values, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaBetween(String value1, String value2) {
            addCriterion("operation_area between", value1, value2, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationAreaNotBetween(String value1, String value2) {
            addCriterion("operation_area not between", value1, value2, "operationArea");
            return (Criteria) this;
        }

        public Criteria andOperationArea2IsNull() {
            addCriterion("operation_area2 is null");
            return (Criteria) this;
        }

        public Criteria andOperationArea2IsNotNull() {
            addCriterion("operation_area2 is not null");
            return (Criteria) this;
        }

        public Criteria andOperationArea2EqualTo(String value) {
            addCriterion("operation_area2 =", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2NotEqualTo(String value) {
            addCriterion("operation_area2 <>", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2GreaterThan(String value) {
            addCriterion("operation_area2 >", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2GreaterThanOrEqualTo(String value) {
            addCriterion("operation_area2 >=", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2LessThan(String value) {
            addCriterion("operation_area2 <", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2LessThanOrEqualTo(String value) {
            addCriterion("operation_area2 <=", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2Like(String value) {
            addCriterion("operation_area2 like", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2NotLike(String value) {
            addCriterion("operation_area2 not like", value, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2In(List<String> values) {
            addCriterion("operation_area2 in", values, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2NotIn(List<String> values) {
            addCriterion("operation_area2 not in", values, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2Between(String value1, String value2) {
            addCriterion("operation_area2 between", value1, value2, "operationArea2");
            return (Criteria) this;
        }

        public Criteria andOperationArea2NotBetween(String value1, String value2) {
            addCriterion("operation_area2 not between", value1, value2, "operationArea2");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Integer value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Integer value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Integer value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Integer value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Integer> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Integer> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Integer value1, Integer value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNull() {
            addCriterion("stop_date is null");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNotNull() {
            addCriterion("stop_date is not null");
            return (Criteria) this;
        }

        public Criteria andStopDateEqualTo(Integer value) {
            addCriterion("stop_date =", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotEqualTo(Integer value) {
            addCriterion("stop_date <>", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThan(Integer value) {
            addCriterion("stop_date >", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_date >=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThan(Integer value) {
            addCriterion("stop_date <", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThanOrEqualTo(Integer value) {
            addCriterion("stop_date <=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateIn(List<Integer> values) {
            addCriterion("stop_date in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotIn(List<Integer> values) {
            addCriterion("stop_date not in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateBetween(Integer value1, Integer value2) {
            addCriterion("stop_date between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_date not between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andCertifyDateIsNull() {
            addCriterion("certify_date is null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateIsNotNull() {
            addCriterion("certify_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyDateEqualTo(Integer value) {
            addCriterion("certify_date =", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateNotEqualTo(Integer value) {
            addCriterion("certify_date <>", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateGreaterThan(Integer value) {
            addCriterion("certify_date >", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_date >=", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateLessThan(Integer value) {
            addCriterion("certify_date <", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateLessThanOrEqualTo(Integer value) {
            addCriterion("certify_date <=", value, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateIn(List<Integer> values) {
            addCriterion("certify_date in", values, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateNotIn(List<Integer> values) {
            addCriterion("certify_date not in", values, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateBetween(Integer value1, Integer value2) {
            addCriterion("certify_date between", value1, value2, "certifyDate");
            return (Criteria) this;
        }

        public Criteria andCertifyDateNotBetween(Integer value1, Integer value2) {
            addCriterion("certify_date not between", value1, value2, "certifyDate");
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