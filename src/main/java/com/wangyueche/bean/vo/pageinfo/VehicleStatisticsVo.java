package com.wangyueche.bean.vo.pageinfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/21.
 */
public class VehicleStatisticsVo implements Serializable {

    private static final long serialVersionUID = 2823689742567875452L;

    /**
     * 车辆总数量
     */
    private long totalVehicle;

    /**
     * 平台公司车辆统计信息
     */
    private List<CompanyVehicleStatisticsVo> list;

    public long getTotalVehicle() {
        return totalVehicle;
    }

    public void setTotalVehicle(long totalVehicle) {
        this.totalVehicle = totalVehicle;
    }

    public List<CompanyVehicleStatisticsVo> getList() {
        return list;
    }

    public void setList(List<CompanyVehicleStatisticsVo> list) {
        this.list = list;
    }
}
