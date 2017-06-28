package com.wangyueche.bean.vo;

import java.io.Serializable;

/**
 * Created by gaoshiwei on 2017/4/17.
 * 车辆运行信息统计
 */
public class MoveInfoStatisticsVo implements Serializable {

    private static final long serialVersionUID = -7950486424006312820L;

    /**
     * 总行驶里程
     */
    private long totalMile;

    /**
     * 总载客里程
     */
    private long totalDriveMile;

    /**
     * 总载客时间
     */
    private long totalDriveTime;
}
