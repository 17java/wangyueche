package com.wangyueche.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CompanyServiceExample() {
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

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNull() {
            addCriterion("service_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNotNull() {
            addCriterion("service_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNoEqualTo(String value) {
            addCriterion("service_no =", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotEqualTo(String value) {
            addCriterion("service_no <>", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThan(String value) {
            addCriterion("service_no >", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("service_no >=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThan(String value) {
            addCriterion("service_no <", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThanOrEqualTo(String value) {
            addCriterion("service_no <=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLike(String value) {
            addCriterion("service_no like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotLike(String value) {
            addCriterion("service_no not like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoIn(List<String> values) {
            addCriterion("service_no in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotIn(List<String> values) {
            addCriterion("service_no not in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoBetween(String value1, String value2) {
            addCriterion("service_no between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotBetween(String value1, String value2) {
            addCriterion("service_no not between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("detail_address =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("detail_address <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("detail_address like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("detail_address not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("detail_address in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameIsNull() {
            addCriterion("responsible_name is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameIsNotNull() {
            addCriterion("responsible_name is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameEqualTo(String value) {
            addCriterion("responsible_name =", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameNotEqualTo(String value) {
            addCriterion("responsible_name <>", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameGreaterThan(String value) {
            addCriterion("responsible_name >", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_name >=", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameLessThan(String value) {
            addCriterion("responsible_name <", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameLessThanOrEqualTo(String value) {
            addCriterion("responsible_name <=", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameLike(String value) {
            addCriterion("responsible_name like", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameNotLike(String value) {
            addCriterion("responsible_name not like", value, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameIn(List<String> values) {
            addCriterion("responsible_name in", values, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameNotIn(List<String> values) {
            addCriterion("responsible_name not in", values, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameBetween(String value1, String value2) {
            addCriterion("responsible_name between", value1, value2, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsibleNameNotBetween(String value1, String value2) {
            addCriterion("responsible_name not between", value1, value2, "responsibleName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneIsNull() {
            addCriterion("responsible_phone is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneIsNotNull() {
            addCriterion("responsible_phone is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneEqualTo(String value) {
            addCriterion("responsible_phone =", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneNotEqualTo(String value) {
            addCriterion("responsible_phone <>", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneGreaterThan(String value) {
            addCriterion("responsible_phone >", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_phone >=", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneLessThan(String value) {
            addCriterion("responsible_phone <", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneLessThanOrEqualTo(String value) {
            addCriterion("responsible_phone <=", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneLike(String value) {
            addCriterion("responsible_phone like", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneNotLike(String value) {
            addCriterion("responsible_phone not like", value, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneIn(List<String> values) {
            addCriterion("responsible_phone in", values, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneNotIn(List<String> values) {
            addCriterion("responsible_phone not in", values, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneBetween(String value1, String value2) {
            addCriterion("responsible_phone between", value1, value2, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePhoneNotBetween(String value1, String value2) {
            addCriterion("responsible_phone not between", value1, value2, "responsiblePhone");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNull() {
            addCriterion("manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNotNull() {
            addCriterion("manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneEqualTo(String value) {
            addCriterion("manager_phone =", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotEqualTo(String value) {
            addCriterion("manager_phone <>", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThan(String value) {
            addCriterion("manager_phone >", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("manager_phone >=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThan(String value) {
            addCriterion("manager_phone <", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("manager_phone <=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLike(String value) {
            addCriterion("manager_phone like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotLike(String value) {
            addCriterion("manager_phone not like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIn(List<String> values) {
            addCriterion("manager_phone in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotIn(List<String> values) {
            addCriterion("manager_phone not in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneBetween(String value1, String value2) {
            addCriterion("manager_phone between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("manager_phone not between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNull() {
            addCriterion("mail_address is null");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNotNull() {
            addCriterion("mail_address is not null");
            return (Criteria) this;
        }

        public Criteria andMailAddressEqualTo(String value) {
            addCriterion("mail_address =", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotEqualTo(String value) {
            addCriterion("mail_address <>", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThan(String value) {
            addCriterion("mail_address >", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mail_address >=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThan(String value) {
            addCriterion("mail_address <", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThanOrEqualTo(String value) {
            addCriterion("mail_address <=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLike(String value) {
            addCriterion("mail_address like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotLike(String value) {
            addCriterion("mail_address not like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressIn(List<String> values) {
            addCriterion("mail_address in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotIn(List<String> values) {
            addCriterion("mail_address not in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressBetween(String value1, String value2) {
            addCriterion("mail_address between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotBetween(String value1, String value2) {
            addCriterion("mail_address not between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Integer value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Integer value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Integer value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Integer value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Integer value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Integer> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Integer> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Integer value1, Integer value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Integer value1, Integer value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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