package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/27 14:16
 * 企业订单统计
 *
 * @author gaojl
 */
public class OrderStatVo  implements Serializable{
    private static final long serialVersionUID = 7884553658024330472L;

    private String companyId;

    private String companyName;
    //总订单
    private Integer totalOrder;
    //成功订单
    private Integer matchOrder;
    //成功率
    private Double matchRate;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public Integer getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Integer getMatchOrder() {
        return matchOrder;
    }

    public void setMatchOrder(Integer matchOrder) {
        this.matchOrder = matchOrder;
    }

    public Double getMatchRate() {
        return matchRate;
    }

    public void setMatchRate(Double matchRate) {
        this.matchRate = matchRate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "OrderStatVo{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", totalOrder=" + totalOrder +
                ", matchOrder=" + matchOrder +
                ", matchRate=" + matchRate +
                '}';
    }
}
