package com.wangyueche.bean.vo;

/**
 * Created by zhangfei on 2017/4/25.
 */
@Deprecated
public class ParkVo {

    private Long end;
    private Long start;
    private Double distance;
    private String unit;

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
