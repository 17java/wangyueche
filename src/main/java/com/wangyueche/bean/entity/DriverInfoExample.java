package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class DriverInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public DriverInfoExample() {
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

        public Criteria andDriverGenderIsNull() {
            addCriterion("driver_gender is null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIsNotNull() {
            addCriterion("driver_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderEqualTo(String value) {
            addCriterion("driver_gender =", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotEqualTo(String value) {
            addCriterion("driver_gender <>", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThan(String value) {
            addCriterion("driver_gender >", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThanOrEqualTo(String value) {
            addCriterion("driver_gender >=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThan(String value) {
            addCriterion("driver_gender <", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThanOrEqualTo(String value) {
            addCriterion("driver_gender <=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLike(String value) {
            addCriterion("driver_gender like", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotLike(String value) {
            addCriterion("driver_gender not like", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIn(List<String> values) {
            addCriterion("driver_gender in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotIn(List<String> values) {
            addCriterion("driver_gender not in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderBetween(String value1, String value2) {
            addCriterion("driver_gender between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotBetween(String value1, String value2) {
            addCriterion("driver_gender not between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIsNull() {
            addCriterion("driver_birthday is null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIsNotNull() {
            addCriterion("driver_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayEqualTo(Integer value) {
            addCriterion("driver_birthday =", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotEqualTo(Integer value) {
            addCriterion("driver_birthday <>", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayGreaterThan(Integer value) {
            addCriterion("driver_birthday >", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_birthday >=", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayLessThan(Integer value) {
            addCriterion("driver_birthday <", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("driver_birthday <=", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIn(List<Integer> values) {
            addCriterion("driver_birthday in", values, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotIn(List<Integer> values) {
            addCriterion("driver_birthday not in", values, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("driver_birthday between", value1, value2, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_birthday not between", value1, value2, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityIsNull() {
            addCriterion("driver_nationality is null");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityIsNotNull() {
            addCriterion("driver_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityEqualTo(String value) {
            addCriterion("driver_nationality =", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityNotEqualTo(String value) {
            addCriterion("driver_nationality <>", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityGreaterThan(String value) {
            addCriterion("driver_nationality >", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("driver_nationality >=", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityLessThan(String value) {
            addCriterion("driver_nationality <", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityLessThanOrEqualTo(String value) {
            addCriterion("driver_nationality <=", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityLike(String value) {
            addCriterion("driver_nationality like", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityNotLike(String value) {
            addCriterion("driver_nationality not like", value, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityIn(List<String> values) {
            addCriterion("driver_nationality in", values, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityNotIn(List<String> values) {
            addCriterion("driver_nationality not in", values, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityBetween(String value1, String value2) {
            addCriterion("driver_nationality between", value1, value2, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationalityNotBetween(String value1, String value2) {
            addCriterion("driver_nationality not between", value1, value2, "driverNationality");
            return (Criteria) this;
        }

        public Criteria andDriverNationIsNull() {
            addCriterion("driver_nation is null");
            return (Criteria) this;
        }

        public Criteria andDriverNationIsNotNull() {
            addCriterion("driver_nation is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNationEqualTo(String value) {
            addCriterion("driver_nation =", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationNotEqualTo(String value) {
            addCriterion("driver_nation <>", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationGreaterThan(String value) {
            addCriterion("driver_nation >", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationGreaterThanOrEqualTo(String value) {
            addCriterion("driver_nation >=", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationLessThan(String value) {
            addCriterion("driver_nation <", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationLessThanOrEqualTo(String value) {
            addCriterion("driver_nation <=", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationLike(String value) {
            addCriterion("driver_nation like", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationNotLike(String value) {
            addCriterion("driver_nation not like", value, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationIn(List<String> values) {
            addCriterion("driver_nation in", values, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationNotIn(List<String> values) {
            addCriterion("driver_nation not in", values, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationBetween(String value1, String value2) {
            addCriterion("driver_nation between", value1, value2, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverNationNotBetween(String value1, String value2) {
            addCriterion("driver_nation not between", value1, value2, "driverNation");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusIsNull() {
            addCriterion("driver_marital_status is null");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusIsNotNull() {
            addCriterion("driver_marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusEqualTo(String value) {
            addCriterion("driver_marital_status =", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusNotEqualTo(String value) {
            addCriterion("driver_marital_status <>", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusGreaterThan(String value) {
            addCriterion("driver_marital_status >", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("driver_marital_status >=", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusLessThan(String value) {
            addCriterion("driver_marital_status <", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("driver_marital_status <=", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusLike(String value) {
            addCriterion("driver_marital_status like", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusNotLike(String value) {
            addCriterion("driver_marital_status not like", value, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusIn(List<String> values) {
            addCriterion("driver_marital_status in", values, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusNotIn(List<String> values) {
            addCriterion("driver_marital_status not in", values, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusBetween(String value1, String value2) {
            addCriterion("driver_marital_status between", value1, value2, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("driver_marital_status not between", value1, value2, "driverMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelIsNull() {
            addCriterion("driver_language_level is null");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelIsNotNull() {
            addCriterion("driver_language_level is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelEqualTo(String value) {
            addCriterion("driver_language_level =", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelNotEqualTo(String value) {
            addCriterion("driver_language_level <>", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelGreaterThan(String value) {
            addCriterion("driver_language_level >", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_language_level >=", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelLessThan(String value) {
            addCriterion("driver_language_level <", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelLessThanOrEqualTo(String value) {
            addCriterion("driver_language_level <=", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelLike(String value) {
            addCriterion("driver_language_level like", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelNotLike(String value) {
            addCriterion("driver_language_level not like", value, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelIn(List<String> values) {
            addCriterion("driver_language_level in", values, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelNotIn(List<String> values) {
            addCriterion("driver_language_level not in", values, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelBetween(String value1, String value2) {
            addCriterion("driver_language_level between", value1, value2, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverLanguageLevelNotBetween(String value1, String value2) {
            addCriterion("driver_language_level not between", value1, value2, "driverLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andDriverEducationIsNull() {
            addCriterion("driver_education is null");
            return (Criteria) this;
        }

        public Criteria andDriverEducationIsNotNull() {
            addCriterion("driver_education is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEducationEqualTo(String value) {
            addCriterion("driver_education =", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationNotEqualTo(String value) {
            addCriterion("driver_education <>", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationGreaterThan(String value) {
            addCriterion("driver_education >", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationGreaterThanOrEqualTo(String value) {
            addCriterion("driver_education >=", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationLessThan(String value) {
            addCriterion("driver_education <", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationLessThanOrEqualTo(String value) {
            addCriterion("driver_education <=", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationLike(String value) {
            addCriterion("driver_education like", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationNotLike(String value) {
            addCriterion("driver_education not like", value, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationIn(List<String> values) {
            addCriterion("driver_education in", values, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationNotIn(List<String> values) {
            addCriterion("driver_education not in", values, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationBetween(String value1, String value2) {
            addCriterion("driver_education between", value1, value2, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverEducationNotBetween(String value1, String value2) {
            addCriterion("driver_education not between", value1, value2, "driverEducation");
            return (Criteria) this;
        }

        public Criteria andDriverCensusIsNull() {
            addCriterion("driver_census is null");
            return (Criteria) this;
        }

        public Criteria andDriverCensusIsNotNull() {
            addCriterion("driver_census is not null");
            return (Criteria) this;
        }

        public Criteria andDriverCensusEqualTo(String value) {
            addCriterion("driver_census =", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusNotEqualTo(String value) {
            addCriterion("driver_census <>", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusGreaterThan(String value) {
            addCriterion("driver_census >", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusGreaterThanOrEqualTo(String value) {
            addCriterion("driver_census >=", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusLessThan(String value) {
            addCriterion("driver_census <", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusLessThanOrEqualTo(String value) {
            addCriterion("driver_census <=", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusLike(String value) {
            addCriterion("driver_census like", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusNotLike(String value) {
            addCriterion("driver_census not like", value, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusIn(List<String> values) {
            addCriterion("driver_census in", values, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusNotIn(List<String> values) {
            addCriterion("driver_census not in", values, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusBetween(String value1, String value2) {
            addCriterion("driver_census between", value1, value2, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverCensusNotBetween(String value1, String value2) {
            addCriterion("driver_census not between", value1, value2, "driverCensus");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIsNull() {
            addCriterion("driver_address is null");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIsNotNull() {
            addCriterion("driver_address is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAddressEqualTo(String value) {
            addCriterion("driver_address =", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotEqualTo(String value) {
            addCriterion("driver_address <>", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressGreaterThan(String value) {
            addCriterion("driver_address >", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("driver_address >=", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLessThan(String value) {
            addCriterion("driver_address <", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLessThanOrEqualTo(String value) {
            addCriterion("driver_address <=", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLike(String value) {
            addCriterion("driver_address like", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotLike(String value) {
            addCriterion("driver_address not like", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIn(List<String> values) {
            addCriterion("driver_address in", values, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotIn(List<String> values) {
            addCriterion("driver_address not in", values, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressBetween(String value1, String value2) {
            addCriterion("driver_address between", value1, value2, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotBetween(String value1, String value2) {
            addCriterion("driver_address not between", value1, value2, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressIsNull() {
            addCriterion("driver_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressIsNotNull() {
            addCriterion("driver_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressEqualTo(String value) {
            addCriterion("driver_contact_address =", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressNotEqualTo(String value) {
            addCriterion("driver_contact_address <>", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressGreaterThan(String value) {
            addCriterion("driver_contact_address >", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("driver_contact_address >=", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressLessThan(String value) {
            addCriterion("driver_contact_address <", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressLessThanOrEqualTo(String value) {
            addCriterion("driver_contact_address <=", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressLike(String value) {
            addCriterion("driver_contact_address like", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressNotLike(String value) {
            addCriterion("driver_contact_address not like", value, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressIn(List<String> values) {
            addCriterion("driver_contact_address in", values, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressNotIn(List<String> values) {
            addCriterion("driver_contact_address not in", values, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressBetween(String value1, String value2) {
            addCriterion("driver_contact_address between", value1, value2, "driverContactAddress");
            return (Criteria) this;
        }

        public Criteria andDriverContactAddressNotBetween(String value1, String value2) {
            addCriterion("driver_contact_address not between", value1, value2, "driverContactAddress");
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

        public Criteria andLicensePhotoIdIsNull() {
            addCriterion("license_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdIsNotNull() {
            addCriterion("license_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdEqualTo(String value) {
            addCriterion("license_photo_id =", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdNotEqualTo(String value) {
            addCriterion("license_photo_id <>", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdGreaterThan(String value) {
            addCriterion("license_photo_id >", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("license_photo_id >=", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdLessThan(String value) {
            addCriterion("license_photo_id <", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdLessThanOrEqualTo(String value) {
            addCriterion("license_photo_id <=", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdLike(String value) {
            addCriterion("license_photo_id like", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdNotLike(String value) {
            addCriterion("license_photo_id not like", value, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdIn(List<String> values) {
            addCriterion("license_photo_id in", values, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdNotIn(List<String> values) {
            addCriterion("license_photo_id not in", values, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdBetween(String value1, String value2) {
            addCriterion("license_photo_id between", value1, value2, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoIdNotBetween(String value1, String value2) {
            addCriterion("license_photo_id not between", value1, value2, "licensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIsNull() {
            addCriterion("driver_type is null");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIsNotNull() {
            addCriterion("driver_type is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTypeEqualTo(String value) {
            addCriterion("driver_type =", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotEqualTo(String value) {
            addCriterion("driver_type <>", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeGreaterThan(String value) {
            addCriterion("driver_type >", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_type >=", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeLessThan(String value) {
            addCriterion("driver_type <", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeLessThanOrEqualTo(String value) {
            addCriterion("driver_type <=", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeLike(String value) {
            addCriterion("driver_type like", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotLike(String value) {
            addCriterion("driver_type not like", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIn(List<String> values) {
            addCriterion("driver_type in", values, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotIn(List<String> values) {
            addCriterion("driver_type not in", values, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeBetween(String value1, String value2) {
            addCriterion("driver_type between", value1, value2, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotBetween(String value1, String value2) {
            addCriterion("driver_type not between", value1, value2, "driverType");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateIsNull() {
            addCriterion("get_driver_license_date is null");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateIsNotNull() {
            addCriterion("get_driver_license_date is not null");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateEqualTo(Integer value) {
            addCriterion("get_driver_license_date =", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotEqualTo(Integer value) {
            addCriterion("get_driver_license_date <>", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateGreaterThan(Integer value) {
            addCriterion("get_driver_license_date >", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_driver_license_date >=", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateLessThan(Integer value) {
            addCriterion("get_driver_license_date <", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateLessThanOrEqualTo(Integer value) {
            addCriterion("get_driver_license_date <=", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateIn(List<Integer> values) {
            addCriterion("get_driver_license_date in", values, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotIn(List<Integer> values) {
            addCriterion("get_driver_license_date not in", values, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateBetween(Integer value1, Integer value2) {
            addCriterion("get_driver_license_date between", value1, value2, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotBetween(Integer value1, Integer value2) {
            addCriterion("get_driver_license_date not between", value1, value2, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnIsNull() {
            addCriterion("driver_license_on is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnIsNotNull() {
            addCriterion("driver_license_on is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnEqualTo(Integer value) {
            addCriterion("driver_license_on =", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnNotEqualTo(Integer value) {
            addCriterion("driver_license_on <>", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnGreaterThan(Integer value) {
            addCriterion("driver_license_on >", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_license_on >=", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnLessThan(Integer value) {
            addCriterion("driver_license_on <", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnLessThanOrEqualTo(Integer value) {
            addCriterion("driver_license_on <=", value, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnIn(List<Integer> values) {
            addCriterion("driver_license_on in", values, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnNotIn(List<Integer> values) {
            addCriterion("driver_license_on not in", values, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnBetween(Integer value1, Integer value2) {
            addCriterion("driver_license_on between", value1, value2, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOnNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_license_on not between", value1, value2, "driverLicenseOn");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffIsNull() {
            addCriterion("driver_license_off is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffIsNotNull() {
            addCriterion("driver_license_off is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffEqualTo(Integer value) {
            addCriterion("driver_license_off =", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffNotEqualTo(Integer value) {
            addCriterion("driver_license_off <>", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffGreaterThan(Integer value) {
            addCriterion("driver_license_off >", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_license_off >=", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffLessThan(Integer value) {
            addCriterion("driver_license_off <", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffLessThanOrEqualTo(Integer value) {
            addCriterion("driver_license_off <=", value, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffIn(List<Integer> values) {
            addCriterion("driver_license_off in", values, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffNotIn(List<Integer> values) {
            addCriterion("driver_license_off not in", values, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffBetween(Integer value1, Integer value2) {
            addCriterion("driver_license_off between", value1, value2, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseOffNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_license_off not between", value1, value2, "driverLicenseOff");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverIsNull() {
            addCriterion("taxi_driver is null");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverIsNotNull() {
            addCriterion("taxi_driver is not null");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverEqualTo(Integer value) {
            addCriterion("taxi_driver =", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverNotEqualTo(Integer value) {
            addCriterion("taxi_driver <>", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverGreaterThan(Integer value) {
            addCriterion("taxi_driver >", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverGreaterThanOrEqualTo(Integer value) {
            addCriterion("taxi_driver >=", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverLessThan(Integer value) {
            addCriterion("taxi_driver <", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverLessThanOrEqualTo(Integer value) {
            addCriterion("taxi_driver <=", value, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverIn(List<Integer> values) {
            addCriterion("taxi_driver in", values, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverNotIn(List<Integer> values) {
            addCriterion("taxi_driver not in", values, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverBetween(Integer value1, Integer value2) {
            addCriterion("taxi_driver between", value1, value2, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andTaxiDriverNotBetween(Integer value1, Integer value2) {
            addCriterion("taxi_driver not between", value1, value2, "taxiDriver");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_no =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_no <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_no >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_no >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_no <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_no <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_no in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_no not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_no between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_no not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationIsNull() {
            addCriterion("network_car_issue_organization is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationIsNotNull() {
            addCriterion("network_car_issue_organization is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationEqualTo(String value) {
            addCriterion("network_car_issue_organization =", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationNotEqualTo(String value) {
            addCriterion("network_car_issue_organization <>", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationGreaterThan(String value) {
            addCriterion("network_car_issue_organization >", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("network_car_issue_organization >=", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationLessThan(String value) {
            addCriterion("network_car_issue_organization <", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationLessThanOrEqualTo(String value) {
            addCriterion("network_car_issue_organization <=", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationLike(String value) {
            addCriterion("network_car_issue_organization like", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationNotLike(String value) {
            addCriterion("network_car_issue_organization not like", value, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationIn(List<String> values) {
            addCriterion("network_car_issue_organization in", values, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationNotIn(List<String> values) {
            addCriterion("network_car_issue_organization not in", values, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationBetween(String value1, String value2) {
            addCriterion("network_car_issue_organization between", value1, value2, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationNotBetween(String value1, String value2) {
            addCriterion("network_car_issue_organization not between", value1, value2, "networkCarIssueOrganization");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateIsNull() {
            addCriterion("network_car_issue_date is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateIsNotNull() {
            addCriterion("network_car_issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateEqualTo(Integer value) {
            addCriterion("network_car_issue_date =", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateNotEqualTo(Integer value) {
            addCriterion("network_car_issue_date <>", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateGreaterThan(Integer value) {
            addCriterion("network_car_issue_date >", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("network_car_issue_date >=", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateLessThan(Integer value) {
            addCriterion("network_car_issue_date <", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateLessThanOrEqualTo(Integer value) {
            addCriterion("network_car_issue_date <=", value, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateIn(List<Integer> values) {
            addCriterion("network_car_issue_date in", values, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateNotIn(List<Integer> values) {
            addCriterion("network_car_issue_date not in", values, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateBetween(Integer value1, Integer value2) {
            addCriterion("network_car_issue_date between", value1, value2, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueDateNotBetween(Integer value1, Integer value2) {
            addCriterion("network_car_issue_date not between", value1, value2, "networkCarIssueDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateIsNull() {
            addCriterion("get_network_car_proof_date is null");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateIsNotNull() {
            addCriterion("get_network_car_proof_date is not null");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateEqualTo(Integer value) {
            addCriterion("get_network_car_proof_date =", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateNotEqualTo(Integer value) {
            addCriterion("get_network_car_proof_date <>", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateGreaterThan(Integer value) {
            addCriterion("get_network_car_proof_date >", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_network_car_proof_date >=", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateLessThan(Integer value) {
            addCriterion("get_network_car_proof_date <", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateLessThanOrEqualTo(Integer value) {
            addCriterion("get_network_car_proof_date <=", value, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateIn(List<Integer> values) {
            addCriterion("get_network_car_proof_date in", values, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateNotIn(List<Integer> values) {
            addCriterion("get_network_car_proof_date not in", values, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateBetween(Integer value1, Integer value2) {
            addCriterion("get_network_car_proof_date between", value1, value2, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andGetNetworkCarProofDateNotBetween(Integer value1, Integer value2) {
            addCriterion("get_network_car_proof_date not between", value1, value2, "getNetworkCarProofDate");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnIsNull() {
            addCriterion("network_car_proof_on is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnIsNotNull() {
            addCriterion("network_car_proof_on is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnEqualTo(Integer value) {
            addCriterion("network_car_proof_on =", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnNotEqualTo(Integer value) {
            addCriterion("network_car_proof_on <>", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnGreaterThan(Integer value) {
            addCriterion("network_car_proof_on >", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnGreaterThanOrEqualTo(Integer value) {
            addCriterion("network_car_proof_on >=", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnLessThan(Integer value) {
            addCriterion("network_car_proof_on <", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnLessThanOrEqualTo(Integer value) {
            addCriterion("network_car_proof_on <=", value, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnIn(List<Integer> values) {
            addCriterion("network_car_proof_on in", values, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnNotIn(List<Integer> values) {
            addCriterion("network_car_proof_on not in", values, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnBetween(Integer value1, Integer value2) {
            addCriterion("network_car_proof_on between", value1, value2, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOnNotBetween(Integer value1, Integer value2) {
            addCriterion("network_car_proof_on not between", value1, value2, "networkCarProofOn");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffIsNull() {
            addCriterion("network_car_proof_off is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffIsNotNull() {
            addCriterion("network_car_proof_off is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffEqualTo(Integer value) {
            addCriterion("network_car_proof_off =", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffNotEqualTo(Integer value) {
            addCriterion("network_car_proof_off <>", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffGreaterThan(Integer value) {
            addCriterion("network_car_proof_off >", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("network_car_proof_off >=", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffLessThan(Integer value) {
            addCriterion("network_car_proof_off <", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffLessThanOrEqualTo(Integer value) {
            addCriterion("network_car_proof_off <=", value, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffIn(List<Integer> values) {
            addCriterion("network_car_proof_off in", values, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffNotIn(List<Integer> values) {
            addCriterion("network_car_proof_off not in", values, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffBetween(Integer value1, Integer value2) {
            addCriterion("network_car_proof_off between", value1, value2, "networkCarProofOff");
            return (Criteria) this;
        }

        public Criteria andNetworkCarProofOffNotBetween(Integer value1, Integer value2) {
            addCriterion("network_car_proof_off not between", value1, value2, "networkCarProofOff");
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

        public Criteria andFulltimeDriverIsNull() {
            addCriterion("fullTime_driver is null");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverIsNotNull() {
            addCriterion("fullTime_driver is not null");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverEqualTo(Integer value) {
            addCriterion("fullTime_driver =", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverNotEqualTo(Integer value) {
            addCriterion("fullTime_driver <>", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverGreaterThan(Integer value) {
            addCriterion("fullTime_driver >", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverGreaterThanOrEqualTo(Integer value) {
            addCriterion("fullTime_driver >=", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverLessThan(Integer value) {
            addCriterion("fullTime_driver <", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverLessThanOrEqualTo(Integer value) {
            addCriterion("fullTime_driver <=", value, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverIn(List<Integer> values) {
            addCriterion("fullTime_driver in", values, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverNotIn(List<Integer> values) {
            addCriterion("fullTime_driver not in", values, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverBetween(Integer value1, Integer value2) {
            addCriterion("fullTime_driver between", value1, value2, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andFulltimeDriverNotBetween(Integer value1, Integer value2) {
            addCriterion("fullTime_driver not between", value1, value2, "fulltimeDriver");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistIsNull() {
            addCriterion("in_driver_blacklist is null");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistIsNotNull() {
            addCriterion("in_driver_blacklist is not null");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistEqualTo(Integer value) {
            addCriterion("in_driver_blacklist =", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistNotEqualTo(Integer value) {
            addCriterion("in_driver_blacklist <>", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistGreaterThan(Integer value) {
            addCriterion("in_driver_blacklist >", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_driver_blacklist >=", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistLessThan(Integer value) {
            addCriterion("in_driver_blacklist <", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistLessThanOrEqualTo(Integer value) {
            addCriterion("in_driver_blacklist <=", value, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistIn(List<Integer> values) {
            addCriterion("in_driver_blacklist in", values, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistNotIn(List<Integer> values) {
            addCriterion("in_driver_blacklist not in", values, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistBetween(Integer value1, Integer value2) {
            addCriterion("in_driver_blacklist between", value1, value2, "inDriverBlacklist");
            return (Criteria) this;
        }

        public Criteria andInDriverBlacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("in_driver_blacklist not between", value1, value2, "inDriverBlacklist");
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

        public Criteria andContractCompanyIsNull() {
            addCriterion("contract_company is null");
            return (Criteria) this;
        }

        public Criteria andContractCompanyIsNotNull() {
            addCriterion("contract_company is not null");
            return (Criteria) this;
        }

        public Criteria andContractCompanyEqualTo(String value) {
            addCriterion("contract_company =", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyNotEqualTo(String value) {
            addCriterion("contract_company <>", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyGreaterThan(String value) {
            addCriterion("contract_company >", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("contract_company >=", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyLessThan(String value) {
            addCriterion("contract_company <", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyLessThanOrEqualTo(String value) {
            addCriterion("contract_company <=", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyLike(String value) {
            addCriterion("contract_company like", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyNotLike(String value) {
            addCriterion("contract_company not like", value, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyIn(List<String> values) {
            addCriterion("contract_company in", values, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyNotIn(List<String> values) {
            addCriterion("contract_company not in", values, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyBetween(String value1, String value2) {
            addCriterion("contract_company between", value1, value2, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractCompanyNotBetween(String value1, String value2) {
            addCriterion("contract_company not between", value1, value2, "contractCompany");
            return (Criteria) this;
        }

        public Criteria andContractOnIsNull() {
            addCriterion("contract_on is null");
            return (Criteria) this;
        }

        public Criteria andContractOnIsNotNull() {
            addCriterion("contract_on is not null");
            return (Criteria) this;
        }

        public Criteria andContractOnEqualTo(Integer value) {
            addCriterion("contract_on =", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnNotEqualTo(Integer value) {
            addCriterion("contract_on <>", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnGreaterThan(Integer value) {
            addCriterion("contract_on >", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_on >=", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnLessThan(Integer value) {
            addCriterion("contract_on <", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnLessThanOrEqualTo(Integer value) {
            addCriterion("contract_on <=", value, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnIn(List<Integer> values) {
            addCriterion("contract_on in", values, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnNotIn(List<Integer> values) {
            addCriterion("contract_on not in", values, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnBetween(Integer value1, Integer value2) {
            addCriterion("contract_on between", value1, value2, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOnNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_on not between", value1, value2, "contractOn");
            return (Criteria) this;
        }

        public Criteria andContractOffIsNull() {
            addCriterion("contract_off is null");
            return (Criteria) this;
        }

        public Criteria andContractOffIsNotNull() {
            addCriterion("contract_off is not null");
            return (Criteria) this;
        }

        public Criteria andContractOffEqualTo(Integer value) {
            addCriterion("contract_off =", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffNotEqualTo(Integer value) {
            addCriterion("contract_off <>", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffGreaterThan(Integer value) {
            addCriterion("contract_off >", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_off >=", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffLessThan(Integer value) {
            addCriterion("contract_off <", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffLessThanOrEqualTo(Integer value) {
            addCriterion("contract_off <=", value, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffIn(List<Integer> values) {
            addCriterion("contract_off in", values, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffNotIn(List<Integer> values) {
            addCriterion("contract_off not in", values, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffBetween(Integer value1, Integer value2) {
            addCriterion("contract_off between", value1, value2, "contractOff");
            return (Criteria) this;
        }

        public Criteria andContractOffNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_off not between", value1, value2, "contractOff");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNull() {
            addCriterion("emergency_contact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNotNull() {
            addCriterion("emergency_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactEqualTo(String value) {
            addCriterion("emergency_contact =", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotEqualTo(String value) {
            addCriterion("emergency_contact <>", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThan(String value) {
            addCriterion("emergency_contact >", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact >=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThan(String value) {
            addCriterion("emergency_contact <", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact <=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLike(String value) {
            addCriterion("emergency_contact like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotLike(String value) {
            addCriterion("emergency_contact not like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIn(List<String> values) {
            addCriterion("emergency_contact in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotIn(List<String> values) {
            addCriterion("emergency_contact not in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactBetween(String value1, String value2) {
            addCriterion("emergency_contact between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotBetween(String value1, String value2) {
            addCriterion("emergency_contact not between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIsNull() {
            addCriterion("emergency_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIsNotNull() {
            addCriterion("emergency_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneEqualTo(String value) {
            addCriterion("emergency_contact_phone =", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotEqualTo(String value) {
            addCriterion("emergency_contact_phone <>", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneGreaterThan(String value) {
            addCriterion("emergency_contact_phone >", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_phone >=", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLessThan(String value) {
            addCriterion("emergency_contact_phone <", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_phone <=", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLike(String value) {
            addCriterion("emergency_contact_phone like", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotLike(String value) {
            addCriterion("emergency_contact_phone not like", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIn(List<String> values) {
            addCriterion("emergency_contact_phone in", values, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotIn(List<String> values) {
            addCriterion("emergency_contact_phone not in", values, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneBetween(String value1, String value2) {
            addCriterion("emergency_contact_phone between", value1, value2, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_phone not between", value1, value2, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressIsNull() {
            addCriterion("emergency_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressIsNotNull() {
            addCriterion("emergency_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressEqualTo(String value) {
            addCriterion("emergency_contact_address =", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressNotEqualTo(String value) {
            addCriterion("emergency_contact_address <>", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressGreaterThan(String value) {
            addCriterion("emergency_contact_address >", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_address >=", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressLessThan(String value) {
            addCriterion("emergency_contact_address <", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_address <=", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressLike(String value) {
            addCriterion("emergency_contact_address like", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressNotLike(String value) {
            addCriterion("emergency_contact_address not like", value, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressIn(List<String> values) {
            addCriterion("emergency_contact_address in", values, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressNotIn(List<String> values) {
            addCriterion("emergency_contact_address not in", values, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressBetween(String value1, String value2) {
            addCriterion("emergency_contact_address between", value1, value2, "emergencyContactAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactAddressNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_address not between", value1, value2, "emergencyContactAddress");
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