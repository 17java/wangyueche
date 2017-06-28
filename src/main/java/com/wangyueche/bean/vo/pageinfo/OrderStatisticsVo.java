package com.wangyueche.bean.vo.pageinfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/21.
 */
public class OrderStatisticsVo implements Serializable {

    private static final long serialVersionUID = 4313209177687041280L;

    /**
     * 订单总数量
     */
    private long totalOrder;

    /**
     * 成功订单总数量
     */
    private long totalSuccessOrder;

    /**
     * 平台公司订单统计信息
     */
    private List<CompanyOrderStatisticsVo> list;

    public long getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(long totalOrder) {
        this.totalOrder = totalOrder;
    }

    public long getTotalSuccessOrder() {
        return totalSuccessOrder;
    }

    public void setTotalSuccessOrder(long totalSuccessOrder) {
        this.totalSuccessOrder = totalSuccessOrder;
    }

    public List<CompanyOrderStatisticsVo> getList() {
        return list;
    }

    public void setList(List<CompanyOrderStatisticsVo> list) {
        this.list = list;
    }
}
