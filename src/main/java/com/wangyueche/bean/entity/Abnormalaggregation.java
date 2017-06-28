package com.wangyueche.bean.entity;

import java.io.Serializable;

public class Abnormalaggregation implements Serializable {
    private Integer id;

    private String name;

    private String memo;

    private Double lng;

    private Double lat;

    private Double radius;

    private Integer firstNum;

    private Integer secNum;

    private Integer thrNum;

    private Integer status;

    private static final long serialVersionUID = 1L;

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
        this.name = name == null ? null : name.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getRadius() {
        return radius;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecNum() {
        return secNum;
    }

    public void setSecNum(Integer secNum) {
        this.secNum = secNum;
    }

    public Integer getThrNum() {
        return thrNum;
    }

    public void setThrNum(Integer thrNum) {
        this.thrNum = thrNum;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", memo=").append(memo);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", radius=").append(radius);
        sb.append(", firstnum=").append(firstNum);
        sb.append(", secnum=").append(secNum);
        sb.append(", thrnum=").append(thrNum);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}