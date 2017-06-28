package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.CompanyService;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:22
 *
 * @author gaojl
 */
public class CompanyServiceVo implements Serializable {
    private static final long serialVersionUID = 9140981406780321068L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String serviceName;

    private String serviceNo;

    private String detailAddress;

    private String responsibleName;

    private String responsiblePhone;

    private String managerName;

    private String managerPhone;

    private String contactPhone;

    private String mailAddress;

    private Integer createDate;

    private Integer state;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public CompanyServiceVo() {
    }

    public CompanyServiceVo(CompanyService companyService) {
        this.id = companyService.getId();
        this.companyId = companyService.getCompanyId();
        this.address = companyService.getAddress();
        this.serviceName = companyService.getServiceName();
        this.serviceNo = companyService.getServiceNo();
        this.detailAddress = companyService.getDetailAddress();
        this.responsibleName = companyService.getResponsibleName();
        this.responsiblePhone = companyService.getResponsiblePhone();
        this.managerName = companyService.getManagerName();
        this.managerPhone = companyService.getManagerPhone();
        this.contactPhone = companyService.getContactPhone();
        this.mailAddress = companyService.getMailAddress();
        this.createDate = companyService.getCreateDate();
        this.state = companyService.getState();
        this.flag = companyService.getFlag();
        this.updateTime = companyService.getUpdateTime();
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsiblePhone() {
        return responsiblePhone;
    }

    public void setResponsiblePhone(String responsiblePhone) {
        this.responsiblePhone = responsiblePhone;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
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
