package com.wangyueche.bean.entity;

import java.io.Serializable;

public class DriverInfo implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String driverName;

    private String driverPhone;

    private String driverGender;

    private Integer driverBirthday;

    private String driverNationality;

    private String driverNation;

    private String driverMaritalStatus;

    private String driverLanguageLevel;

    private String driverEducation;

    private String driverCensus;

    private String driverAddress;

    private String driverContactAddress;

    private String photoId;

    private String licenseId;

    private String licensePhotoId;

    private String driverType;

    private Integer getDriverLicenseDate;

    private Integer driverLicenseOn;

    private Integer driverLicenseOff;

    private Integer taxiDriver;

    private String certificateNo;

    private String networkCarIssueOrganization;

    private Integer networkCarIssueDate;

    private Integer getNetworkCarProofDate;

    private Integer networkCarProofOn;

    private Integer networkCarProofOff;

    private Integer registerDate;

    private Integer fulltimeDriver;

    private Integer inDriverBlacklist;

    private Integer commercialType;

    private String contractCompany;

    private Integer contractOn;

    private Integer contractOff;

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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
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

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }

    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender == null ? null : driverGender.trim();
    }

    public Integer getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Integer driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    public String getDriverNationality() {
        return driverNationality;
    }

    public void setDriverNationality(String driverNationality) {
        this.driverNationality = driverNationality == null ? null : driverNationality.trim();
    }

    public String getDriverNation() {
        return driverNation;
    }

    public void setDriverNation(String driverNation) {
        this.driverNation = driverNation == null ? null : driverNation.trim();
    }

    public String getDriverMaritalStatus() {
        return driverMaritalStatus;
    }

    public void setDriverMaritalStatus(String driverMaritalStatus) {
        this.driverMaritalStatus = driverMaritalStatus == null ? null : driverMaritalStatus.trim();
    }

    public String getDriverLanguageLevel() {
        return driverLanguageLevel;
    }

    public void setDriverLanguageLevel(String driverLanguageLevel) {
        this.driverLanguageLevel = driverLanguageLevel == null ? null : driverLanguageLevel.trim();
    }

    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation == null ? null : driverEducation.trim();
    }

    public String getDriverCensus() {
        return driverCensus;
    }

    public void setDriverCensus(String driverCensus) {
        this.driverCensus = driverCensus == null ? null : driverCensus.trim();
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress == null ? null : driverAddress.trim();
    }

    public String getDriverContactAddress() {
        return driverContactAddress;
    }

    public void setDriverContactAddress(String driverContactAddress) {
        this.driverContactAddress = driverContactAddress == null ? null : driverContactAddress.trim();
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId == null ? null : photoId.trim();
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public String getLicensePhotoId() {
        return licensePhotoId;
    }

    public void setLicensePhotoId(String licensePhotoId) {
        this.licensePhotoId = licensePhotoId == null ? null : licensePhotoId.trim();
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType == null ? null : driverType.trim();
    }

    public Integer getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Integer getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    public Integer getDriverLicenseOn() {
        return driverLicenseOn;
    }

    public void setDriverLicenseOn(Integer driverLicenseOn) {
        this.driverLicenseOn = driverLicenseOn;
    }

    public Integer getDriverLicenseOff() {
        return driverLicenseOff;
    }

    public void setDriverLicenseOff(Integer driverLicenseOff) {
        this.driverLicenseOff = driverLicenseOff;
    }

    public Integer getTaxiDriver() {
        return taxiDriver;
    }

    public void setTaxiDriver(Integer taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization == null ? null : networkCarIssueOrganization.trim();
    }

    public Integer getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Integer networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    public Integer getGetNetworkCarProofDate() {
        return getNetworkCarProofDate;
    }

    public void setGetNetworkCarProofDate(Integer getNetworkCarProofDate) {
        this.getNetworkCarProofDate = getNetworkCarProofDate;
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

    public Integer getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Integer registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getFulltimeDriver() {
        return fulltimeDriver;
    }

    public void setFulltimeDriver(Integer fulltimeDriver) {
        this.fulltimeDriver = fulltimeDriver;
    }

    public Integer getInDriverBlacklist() {
        return inDriverBlacklist;
    }

    public void setInDriverBlacklist(Integer inDriverBlacklist) {
        this.inDriverBlacklist = inDriverBlacklist;
    }

    public Integer getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Integer commercialType) {
        this.commercialType = commercialType;
    }

    public String getContractCompany() {
        return contractCompany;
    }

    public void setContractCompany(String contractCompany) {
        this.contractCompany = contractCompany == null ? null : contractCompany.trim();
    }

    public Integer getContractOn() {
        return contractOn;
    }

    public void setContractOn(Integer contractOn) {
        this.contractOn = contractOn;
    }

    public Integer getContractOff() {
        return contractOff;
    }

    public void setContractOff(Integer contractOff) {
        this.contractOff = contractOff;
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
        sb.append(", companyId=").append(companyId);
        sb.append(", address=").append(address);
        sb.append(", driverName=").append(driverName);
        sb.append(", driverPhone=").append(driverPhone);
        sb.append(", driverGender=").append(driverGender);
        sb.append(", driverBirthday=").append(driverBirthday);
        sb.append(", driverNationality=").append(driverNationality);
        sb.append(", driverNation=").append(driverNation);
        sb.append(", driverMaritalStatus=").append(driverMaritalStatus);
        sb.append(", driverLanguageLevel=").append(driverLanguageLevel);
        sb.append(", driverEducation=").append(driverEducation);
        sb.append(", driverCensus=").append(driverCensus);
        sb.append(", driverAddress=").append(driverAddress);
        sb.append(", driverContactAddress=").append(driverContactAddress);
        sb.append(", photoId=").append(photoId);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", licensePhotoId=").append(licensePhotoId);
        sb.append(", driverType=").append(driverType);
        sb.append(", getDriverLicenseDate=").append(getDriverLicenseDate);
        sb.append(", driverLicenseOn=").append(driverLicenseOn);
        sb.append(", driverLicenseOff=").append(driverLicenseOff);
        sb.append(", taxiDriver=").append(taxiDriver);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", networkCarIssueOrganization=").append(networkCarIssueOrganization);
        sb.append(", networkCarIssueDate=").append(networkCarIssueDate);
        sb.append(", getNetworkCarProofDate=").append(getNetworkCarProofDate);
        sb.append(", networkCarProofOn=").append(networkCarProofOn);
        sb.append(", networkCarProofOff=").append(networkCarProofOff);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", fulltimeDriver=").append(fulltimeDriver);
        sb.append(", inDriverBlacklist=").append(inDriverBlacklist);
        sb.append(", commercialType=").append(commercialType);
        sb.append(", contractCompany=").append(contractCompany);
        sb.append(", contractOn=").append(contractOn);
        sb.append(", contractOff=").append(contractOff);
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