package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.util.Date;

public class GmDriverLicense implements Serializable {
    private Integer id;

    private Integer address;

    private String driverName;

    private Integer driverGender;

    private Integer documentType;

    private String idNumber;

    private String nation;

    private String driverPhone;

    private String driverAddress;

    private String driverEducation;

    private String technicalTitle;

    private String employeeStatus;

    private String householdRegistration;

    private String certificateNo;

    private Integer driverBirthday;

    private Date getDriverLicenseDate;

    private Integer networkCarIssueDate;

    private Integer networkCarProofOn;

    private Integer networkCarProofOff;

    private String networkCarIssueOrganization;

    private String networkCarIssueOrganizationCode;

    private String adhereAddress;

    private String cardType;

    private String icCard;

    private String licenseId;

    private String emergencyContact;

    private String emergencyContactPhone;

    private String emergencyContactAddress;

    private Integer state;

    private Integer flag;

    private Long updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public Integer getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(Integer driverGender) {
        this.driverGender = driverGender;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress == null ? null : driverAddress.trim();
    }

    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation == null ? null : driverEducation.trim();
    }

    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle == null ? null : technicalTitle.trim();
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus == null ? null : employeeStatus.trim();
    }

    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration == null ? null : householdRegistration.trim();
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public Integer getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Integer driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    public Date getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Date getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    public Integer getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Integer networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    public Integer getNetworkCarProofOn() {
        return networkCarProofOn;
    }

    public void setNetworkCarProofOn(Integer networkCarProofOn) {
        this.networkCarProofOn = networkCarProofOn;
    }

    public Integer getNetworkCarProofOff() {
        return networkCarProofOff;
    }

    public void setNetworkCarProofOff(Integer networkCarProofOff) {
        this.networkCarProofOff = networkCarProofOff;
    }

    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization == null ? null : networkCarIssueOrganization.trim();
    }

    public String getNetworkCarIssueOrganizationCode() {
        return networkCarIssueOrganizationCode;
    }

    public void setNetworkCarIssueOrganizationCode(String networkCarIssueOrganizationCode) {
        this.networkCarIssueOrganizationCode = networkCarIssueOrganizationCode == null ? null : networkCarIssueOrganizationCode.trim();
    }

    public String getAdhereAddress() {
        return adhereAddress;
    }

    public void setAdhereAddress(String adhereAddress) {
        this.adhereAddress = adhereAddress == null ? null : adhereAddress.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getIcCard() {
        return icCard;
    }

    public void setIcCard(String icCard) {
        this.icCard = icCard == null ? null : icCard.trim();
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone == null ? null : emergencyContactPhone.trim();
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress == null ? null : emergencyContactAddress.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", driverName=").append(driverName);
        sb.append(", driverGender=").append(driverGender);
        sb.append(", documentType=").append(documentType);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", nation=").append(nation);
        sb.append(", driverPhone=").append(driverPhone);
        sb.append(", driverAddress=").append(driverAddress);
        sb.append(", driverEducation=").append(driverEducation);
        sb.append(", technicalTitle=").append(technicalTitle);
        sb.append(", employeeStatus=").append(employeeStatus);
        sb.append(", householdRegistration=").append(householdRegistration);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", driverBirthday=").append(driverBirthday);
        sb.append(", getDriverLicenseDate=").append(getDriverLicenseDate);
        sb.append(", networkCarIssueDate=").append(networkCarIssueDate);
        sb.append(", networkCarProofOn=").append(networkCarProofOn);
        sb.append(", networkCarProofOff=").append(networkCarProofOff);
        sb.append(", networkCarIssueOrganization=").append(networkCarIssueOrganization);
        sb.append(", networkCarIssueOrganizationCode=").append(networkCarIssueOrganizationCode);
        sb.append(", adhereAddress=").append(adhereAddress);
        sb.append(", cardType=").append(cardType);
        sb.append(", icCard=").append(icCard);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", emergencyContact=").append(emergencyContact);
        sb.append(", emergencyContactPhone=").append(emergencyContactPhone);
        sb.append(", emergencyContactAddress=").append(emergencyContactAddress);
        sb.append(", state=").append(state);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}