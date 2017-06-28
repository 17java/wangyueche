package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.util.Date;

public class Fence implements Serializable {
    private Integer id;

    private String name;

    private String number;

    private Integer shape;

    private Double radius;

    private String purpose;

    private Date createtime;

    private Date endtime;

    private String remark;

    private Integer status;

    private Integer type;

    private String spots;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSpots() {
        return spots;
    }

    public void setSpots(String spots) {
        this.spots = spots == null ? null : spots.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", shape=").append(shape);
        sb.append(", radius=").append(radius);
        sb.append(", purpose=").append(purpose);
        sb.append(", createtime=").append(createtime);
        sb.append(", endtime=").append(endtime);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", spots=").append(spots);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}