package com.wangyueche.bean.vo;

import java.io.Serializable;

/**
 * Created by gaoshiwei on 2017/4/17.
 * 企业营运订单统计
 */
public class ScaleOrderStatisticsVo implements Serializable{

    private static final long serialVersionUID = -4652075632469142180L;

    /**
     * 总订单量
     */
    private long totalOrderCount;

    /**
     * 总成功量
     */
    private long totalSuccessCount;

    /**
     * 总成功率
     */
    private long totalSuccessRate;
}
