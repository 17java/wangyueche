package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.DriverInfo;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:53
 *
 * @author gaojl
 */
public class DriverInfoVo implements Serializable {

    private static final long serialVersionUID = 3484546539130538473L;

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

    private String companyName;

    public DriverInfoVo(DriverInfo driverInfo) {
        this.id = driverInfo.getId();
        this.companyId = driverInfo.getCompanyId();
        this.address = driverInfo.getAddress();
        this.driverName = driverInfo.getDriverName();
        this.driverPhone = driverInfo.getDriverPhone();
        this.driverGender = driverInfo.getDriverGender();
        this.driverBirthday = driverInfo.getDriverBirthday();
        this.driverNationality = driverInfo.getDriverNationality();
        this.driverNation = driverInfo.getDriverNation();
        this.driverMaritalStatus = driverInfo.getDriverMaritalStatus();
        this.driverLanguageLevel = driverInfo.getDriverLanguageLevel();
        this.driverEducation = driverInfo.getDriverEducation();
        this.driverCensus = driverInfo.getDriverCensus();
        this.driverAddress = driverInfo.getDriverAddress();
        this.driverContactAddress = driverInfo.getDriverContactAddress();
        this.photoId = driverInfo.getPhotoId();
        this.licenseId = driverInfo.getLicenseId();
        this.licensePhotoId = driverInfo.getLicensePhotoId();
        this.driverType = driverInfo.getDriverType();
        this.getDriverLicenseDate = driverInfo.getGetDriverLicenseDate();
        this.driverLicenseOn = driverInfo.getDriverLicenseOn();
        this.driverLicenseOff = driverInfo.getDriverLicenseOff();
        this.taxiDriver = driverInfo.getTaxiDriver();
        this.certificateNo = driverInfo.getCertificateNo();
        this.networkCarIssueOrganization = driverInfo.getNetworkCarIssueOrganization();
        this.networkCarIssueDate = driverInfo.getNetworkCarIssueDate();
        this.getNetworkCarProofDate = driverInfo.getGetNetworkCarProofDate();
        this.networkCarProofOn = driverInfo.getNetworkCarProofOn();
        this.networkCarProofOff = driverInfo.getNetworkCarProofOff();
        this.registerDate = driverInfo.getRegisterDate();
        this.fulltimeDriver = driverInfo.getFulltimeDriver();
        this.inDriverBlacklist = driverInfo.getInDriverBlacklist();
        this.commercialType = driverInfo.getCommercialType();
        this.contractCompany = driverInfo.getContractCompany();
        this.contractOn = driverInfo.getContractOn();
        this.contractOff = driverInfo.getContractOff();
        this.emergencyContact = driverInfo.getEmergencyContact();
        this.emergencyContactPhone = driverInfo.getEmergencyContactPhone();
        this.emergencyContactAddress = driverInfo.getEmergencyContactAddress();
        this.state = driverInfo.getState();
        this.flag = driverInfo.getFlag();
        this.updateTime = driverInfo.getUpdateTime();
    }

    public DriverInfoVo() {
    }

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
        this.companyId = companyId;
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
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
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
        this.driverNationality = driverNationality;
    }

    public String getDriverNation() {
        return driverNation;
    }

    public void setDriverNation(String driverNation) {
        this.driverNation = driverNation;
    }

    public String getDriverMaritalStatus() {
        return driverMaritalStatus;
    }

    public void setDriverMaritalStatus(String driverMaritalStatus) {
        this.driverMaritalStatus = driverMaritalStatus;
    }

    public String getDriverLanguageLevel() {
        return driverLanguageLevel;
    }

    public void setDriverLanguageLevel(String driverLanguageLevel) {
        this.driverLanguageLevel = driverLanguageLevel;
    }

    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation;
    }

    public String getDriverCensus() {
        return driverCensus;
    }

    public void setDriverCensus(String driverCensus) {
        this.driverCensus = driverCensus;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public String getDriverContactAddress() {
        return driverContactAddress;
    }

    public void setDriverContactAddress(String driverContactAddress) {
        this.driverContactAddress = driverContactAddress;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicensePhotoId() {
        return licensePhotoId;
    }

    public void setLicensePhotoId(String licensePhotoId) {
        this.licensePhotoId = licensePhotoId;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
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
        this.certificateNo = certificateNo;
    }

    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization;
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
        this.contractCompany = contractCompany;
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
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
