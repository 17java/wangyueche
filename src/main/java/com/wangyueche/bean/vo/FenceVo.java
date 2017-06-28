package com.wangyueche.bean.vo;

import java.io.Serializable;


public class FenceVo implements Serializable {

    private Integer id;

    private String name;

    private String spots;

    private String number;

    private Integer shape;

    private Double radius;

    private String purpose;

    private String remark;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShape() {
        return shape;
    }

    public void setShape(Integer shape) {
        this.shape = shape;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getSpots() {
        return spots;
    }

    public void setSpots(String spots) {
        this.spots = spots;
    }
}
