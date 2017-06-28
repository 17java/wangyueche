package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:39
 * 驾驶员同比
 * @author gaojl
 */
public class DriverYOYBasis implements Serializable{
    private static final long serialVersionUID = 2816132424254792547L;
    private String companyId;
    private String companyName;
    private Integer year;
    private Integer driverAmount;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDriverAmount() {
        return driverAmount;
    }

    public void setDriverAmount(Integer driverAmount) {
        this.driverAmount = driverAmount;
    }
}
