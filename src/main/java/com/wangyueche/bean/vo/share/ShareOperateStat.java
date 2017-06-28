package com.wangyueche.bean.vo.share;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/5/16 15:18 .
 * 合乘运营信息
 */
public class ShareOperateStat implements Serializable{
    private static final long serialVersionUID = -4468600285120727252L;
    //运营车辆数
    private Integer vehicleNum;
    //成功订单数
    private Integer orderNum;
    //总订单额
    private BigDecimal money;

    private String companyId;


    public Integer getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(Integer vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
