package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GmDriverLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public GmDriverLicenseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDriverGenderIsNull() {
            addCriterion("driver_gender is null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIsNotNull() {
            addCriterion("driver_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderEqualTo(Integer value) {
            addCriterion("driver_gender =", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotEqualTo(Integer value) {
            addCriterion("driver_gender <>", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThan(Integer value) {
            addCriterion("driver_gender >", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_gender >=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThan(Integer value) {
            addCriterion("driver_gender <", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThanOrEqualTo(Integer value) {
            addCriterion("driver_gender <=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIn(List<Integer> values) {
            addCriterion("driver_gender in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotIn(List<Integer> values) {
            addCriterion("driver_gender not in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderBetween(Integer value1, Integer value2) {
            addCriterion("driver_gender between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_gender not between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("document_type is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("document_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(Integer value) {
            addCriterion("document_type =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(Integer value) {
            addCriterion("document_type <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(Integer value) {
            addCriterion("document_type >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("document_type >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(Integer value) {
            addCriterion("document_type <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("document_type <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<Integer> values) {
            addCriterion("document_type in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<Integer> values) {
            addCriterion("document_type not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(Integer value1, Integer value2) {
            addCriterion("document_type between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("document_type not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
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

        public Criteria andTechnicalTitleIsNull() {
            addCriterion("technical_title is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleIsNotNull() {
            addCriterion("technical_title is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleEqualTo(String value) {
            addCriterion("technical_title =", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotEqualTo(String value) {
            addCriterion("technical_title <>", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleGreaterThan(String value) {
            addCriterion("technical_title >", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("technical_title >=", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLessThan(String value) {
            addCriterion("technical_title <", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLessThanOrEqualTo(String value) {
            addCriterion("technical_title <=", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLike(String value) {
            addCriterion("technical_title like", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotLike(String value) {
            addCriterion("technical_title not like", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleIn(List<String> values) {
            addCriterion("technical_title in", values, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotIn(List<String> values) {
            addCriterion("technical_title not in", values, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleBetween(String value1, String value2) {
            addCriterion("technical_title between", value1, value2, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotBetween(String value1, String value2) {
            addCriterion("technical_title not between", value1, value2, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNull() {
            addCriterion("employee_status is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNotNull() {
            addCriterion("employee_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusEqualTo(String value) {
            addCriterion("employee_status =", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotEqualTo(String value) {
            addCriterion("employee_status <>", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThan(String value) {
            addCriterion("employee_status >", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("employee_status >=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThan(String value) {
            addCriterion("employee_status <", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThanOrEqualTo(String value) {
            addCriterion("employee_status <=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLike(String value) {
            addCriterion("employee_status like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotLike(String value) {
            addCriterion("employee_status not like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIn(List<String> values) {
            addCriterion("employee_status in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotIn(List<String> values) {
            addCriterion("employee_status not in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusBetween(String value1, String value2) {
            addCriterion("employee_status between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotBetween(String value1, String value2) {
            addCriterion("employee_status not between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNull() {
            addCriterion("household_registration is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNotNull() {
            addCriterion("household_registration is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationEqualTo(String value) {
            addCriterion("household_registration =", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotEqualTo(String value) {
            addCriterion("household_registration <>", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThan(String value) {
            addCriterion("household_registration >", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("household_registration >=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThan(String value) {
            addCriterion("household_registration <", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThanOrEqualTo(String value) {
            addCriterion("household_registration <=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLike(String value) {
            addCriterion("household_registration like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotLike(String value) {
            addCriterion("household_registration not like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIn(List<String> values) {
            addCriterion("household_registration in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotIn(List<String> values) {
            addCriterion("household_registration not in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationBetween(String value1, String value2) {
            addCriterion("household_registration between", value1, value2, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotBetween(String value1, String value2) {
            addCriterion("household_registration not between", value1, value2, "householdRegistration");
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

        public Criteria andGetDriverLicenseDateIsNull() {
            addCriterion("get_driver_license_date is null");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateIsNotNull() {
            addCriterion("get_driver_license_date is not null");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateEqualTo(Date value) {
            addCriterionForJDBCDate("get_driver_license_date =", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("get_driver_license_date <>", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("get_driver_license_date >", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("get_driver_license_date >=", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateLessThan(Date value) {
            addCriterionForJDBCDate("get_driver_license_date <", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("get_driver_license_date <=", value, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateIn(List<Date> values) {
            addCriterionForJDBCDate("get_driver_license_date in", values, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("get_driver_license_date not in", values, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("get_driver_license_date between", value1, value2, "getDriverLicenseDate");
            return (Criteria) this;
        }

        public Criteria andGetDriverLicenseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("get_driver_license_date not between", value1, value2, "getDriverLicenseDate");
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

        public Criteria andNetworkCarIssueOrganizationCodeIsNull() {
            addCriterion("network_car_issue_organization_code is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeIsNotNull() {
            addCriterion("network_car_issue_organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeEqualTo(String value) {
            addCriterion("network_car_issue_organization_code =", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeNotEqualTo(String value) {
            addCriterion("network_car_issue_organization_code <>", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeGreaterThan(String value) {
            addCriterion("network_car_issue_organization_code >", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("network_car_issue_organization_code >=", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeLessThan(String value) {
            addCriterion("network_car_issue_organization_code <", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("network_car_issue_organization_code <=", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeLike(String value) {
            addCriterion("network_car_issue_organization_code like", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeNotLike(String value) {
            addCriterion("network_car_issue_organization_code not like", value, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeIn(List<String> values) {
            addCriterion("network_car_issue_organization_code in", values, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeNotIn(List<String> values) {
            addCriterion("network_car_issue_organization_code not in", values, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeBetween(String value1, String value2) {
            addCriterion("network_car_issue_organization_code between", value1, value2, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andNetworkCarIssueOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("network_car_issue_organization_code not between", value1, value2, "networkCarIssueOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressIsNull() {
            addCriterion("adhere_address is null");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressIsNotNull() {
            addCriterion("adhere_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressEqualTo(String value) {
            addCriterion("adhere_address =", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressNotEqualTo(String value) {
            addCriterion("adhere_address <>", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressGreaterThan(String value) {
            addCriterion("adhere_address >", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressGreaterThanOrEqualTo(String value) {
            addCriterion("adhere_address >=", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressLessThan(String value) {
            addCriterion("adhere_address <", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressLessThanOrEqualTo(String value) {
            addCriterion("adhere_address <=", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressLike(String value) {
            addCriterion("adhere_address like", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressNotLike(String value) {
            addCriterion("adhere_address not like", value, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressIn(List<String> values) {
            addCriterion("adhere_address in", values, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressNotIn(List<String> values) {
            addCriterion("adhere_address not in", values, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressBetween(String value1, String value2) {
            addCriterion("adhere_address between", value1, value2, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andAdhereAddressNotBetween(String value1, String value2) {
            addCriterion("adhere_address not between", value1, value2, "adhereAddress");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andIcCardIsNull() {
            addCriterion("ic_card is null");
            return (Criteria) this;
        }

        public Criteria andIcCardIsNotNull() {
            addCriterion("ic_card is not null");
            return (Criteria) this;
        }

        public Criteria andIcCardEqualTo(String value) {
            addCriterion("ic_card =", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotEqualTo(String value) {
            addCriterion("ic_card <>", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardGreaterThan(String value) {
            addCriterion("ic_card >", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardGreaterThanOrEqualTo(String value) {
            addCriterion("ic_card >=", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLessThan(String value) {
            addCriterion("ic_card <", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLessThanOrEqualTo(String value) {
            addCriterion("ic_card <=", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLike(String value) {
            addCriterion("ic_card like", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotLike(String value) {
            addCriterion("ic_card not like", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardIn(List<String> values) {
            addCriterion("ic_card in", values, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotIn(List<String> values) {
            addCriterion("ic_card not in", values, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardBetween(String value1, String value2) {
            addCriterion("ic_card between", value1, value2, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotBetween(String value1, String value2) {
            addCriterion("ic_card not between", value1, value2, "icCard");
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