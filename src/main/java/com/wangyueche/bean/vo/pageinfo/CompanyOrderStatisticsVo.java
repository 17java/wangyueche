package com.wangyueche.bean.vo.pageinfo;

import java.io.Serializable;

/**
 * Created by gaoshiwei on 2017/4/21.
 */
public class CompanyOrderStatisticsVo implements Serializable{

    private static final long serialVersionUID = 5981864721278377158L;

    /**
     * 平台公司订单总数量
     */
    private long totalCompanyOrder;

    /**
     * 平台公司订单总成功数量
     */
    private long totalCompanySuccessOrder;

    /**
     * 平台公司订单总成功率
     */
    private double totalCompanySuccessRate;

    public long getTotalCompanyOrder() {
        return totalCompanyOrder;
    }

    public void setTotalCompanyOrder(long totalCompanyOrder) {
        this.totalCompanyOrder = totalCompanyOrder;
    }

    public long getTotalCompanySuccessOrder() {
        return totalCompanySuccessOrder;
    }

    public void setTotalCompanySuccessOrder(long totalCompanySuccessOrder) {
        this.totalCompanySuccessOrder = totalCompanySuccessOrder;
    }

    public double getTotalCompanySuccessRate() {
        return totalCompanySuccessRate;
    }

    public void setTotalCompanySuccessRate(double totalCompanySuccessRate) {
        this.totalCompanySuccessRate = totalCompanySuccessRate;
    }
}
