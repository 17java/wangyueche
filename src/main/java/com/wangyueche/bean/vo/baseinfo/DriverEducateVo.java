package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.DriverEducate;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:49
 *
 * @author gaojl
 */
public class DriverEducateVo implements Serializable {

    private static final long serialVersionUID = -3702419993965984633L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String licenseId;

    private String courseName;

    private Integer courseDate;

    private String startTime;

    private String stopTime;

    private String duration;

    private Integer flag;

    private Long updatetime;

    private String companyName;

    public DriverEducateVo(DriverEducate driverEducate) {
        this.id = driverEducate.getId();
        this.companyId = driverEducate.getCompanyId();
        this.address = driverEducate.getAddress();
        this.licenseId = driverEducate.getLicenseId();
        this.courseName = driverEducate.getCourseName();
        this.courseDate = driverEducate.getCourseDate();
        this.startTime = driverEducate.getStartTime();
        this.stopTime = driverEducate.getStopTime();
        this.duration = driverEducate.getDuration();
        this.flag = driverEducate.getFlag();
        this.updatetime = driverEducate.getUpdatetime();
    }

    public DriverEducateVo() {
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

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Integer courseDate) {
        this.courseDate = courseDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

