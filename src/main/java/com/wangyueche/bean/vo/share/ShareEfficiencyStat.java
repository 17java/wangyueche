package com.wangyueche.bean.vo.share;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/5/16 18:31 .
 * 合乘效能统计
 */
public class ShareEfficiencyStat implements Serializable{
    private static final long serialVersionUID = -3324777413262084177L;

    private String companyId;

    //总订单数
    private Long orderNum;

    //总行驶里程
    private BigDecimal driveMile;

    //总行驶时间
    private Long driveTime;

    //总费用
    private BigDecimal factPrice;

    public String getCompanyId() {
        return companyId;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(BigDecimal driveMile) {
        this.driveMile = driveMile;
    }

    public Long getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Long driveTime) {
        this.driveTime = driveTime;
    }

    public BigDecimal getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
    }
}
