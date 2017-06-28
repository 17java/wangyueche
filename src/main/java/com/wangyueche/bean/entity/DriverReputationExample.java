package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class DriverReputationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public DriverReputationExample() {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNull() {
            addCriterion("test_date is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("test_date is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(Integer value) {
            addCriterion("test_date =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(Integer value) {
            addCriterion("test_date <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(Integer value) {
            addCriterion("test_date >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_date >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(Integer value) {
            addCriterion("test_date <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(Integer value) {
            addCriterion("test_date <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<Integer> values) {
            addCriterion("test_date in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<Integer> values) {
            addCriterion("test_date not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(Integer value1, Integer value2) {
            addCriterion("test_date between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(Integer value1, Integer value2) {
            addCriterion("test_date not between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentIsNull() {
            addCriterion("test_department is null");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentIsNotNull() {
            addCriterion("test_department is not null");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentEqualTo(String value) {
            addCriterion("test_department =", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentNotEqualTo(String value) {
            addCriterion("test_department <>", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentGreaterThan(String value) {
            addCriterion("test_department >", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("test_department >=", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentLessThan(String value) {
            addCriterion("test_department <", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentLessThanOrEqualTo(String value) {
            addCriterion("test_department <=", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentLike(String value) {
            addCriterion("test_department like", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentNotLike(String value) {
            addCriterion("test_department not like", value, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentIn(List<String> values) {
            addCriterion("test_department in", values, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentNotIn(List<String> values) {
            addCriterion("test_department not in", values, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentBetween(String value1, String value2) {
            addCriterion("test_department between", value1, value2, "testDepartment");
            return (Criteria) this;
        }

        public Criteria andTestDepartmentNotBetween(String value1, String value2) {
            addCriterion("test_department not between", value1, value2, "testDepartment");
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