package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:31
 * 驾驶员信誉统计信息
 * @author gaojl
 */
public class DriverReputationStat implements Serializable {
    private static final long serialVersionUID = 5901187762598245406L;
    private String companyId;
    private String companyName;
    //完成订单数
    private Integer orderAmount;
    //处罚次数
    private Integer punishTimes;
    //乘客投诉次数
    private Integer passengerComplaintTimes;
    //违章次数
    private Integer violationTimes;

    public Integer getViolationTimes() {
        return violationTimes;
    }

    public void setViolationTimes(Integer violationTimes) {
        this.violationTimes = violationTimes;
    }

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

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getPunishTimes() {
        return punishTimes;
    }

    public void setPunishTimes(Integer punishTimes) {
        this.punishTimes = punishTimes;
    }

    public Integer getPassengerComplaintTimes() {
        return passengerComplaintTimes;
    }

    public void setPassengerComplaintTimes(Integer passengerComplaintTimes) {
        this.passengerComplaintTimes = passengerComplaintTimes;
    }
}
