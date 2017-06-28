package com.wangyueche.bean.entity;

import java.io.Serializable;

public class ShareOrder implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String routeId;

    private String orderId;

    private Long bookDepartTime;

    private String departure;

    private Double depLongitude;

    private Double depLatitude;

    private String destination;

    private Double destLongitude;

    private Double destLatitude;

    private Integer encrypt;

    private Long orderEnsureTime;

    private Integer passengerNum;

    private String passengerNote;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getBookDepartTime() {
        return bookDepartTime;
    }

    public void setBookDepartTime(Long bookDepartTime) {
        this.bookDepartTime = bookDepartTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public Double getDepLongitude() {
        return depLongitude;
    }

    public void setDepLongitude(Double depLongitude) {
        this.depLongitude = depLongitude;
    }

    public Double getDepLatitude() {
        return depLatitude;
    }

    public void setDepLatitude(Double depLatitude) {
        this.depLatitude = depLatitude;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Double getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Double destLongitude) {
        this.destLongitude = destLongitude;
    }

    public Double getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Double destLatitude) {
        this.destLatitude = destLatitude;
    }

    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    public Long getOrderEnsureTime() {
        return orderEnsureTime;
    }

    public void setOrderEnsureTime(Long orderEnsureTime) {
        this.orderEnsureTime = orderEnsureTime;
    }

    public Integer getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(Integer passengerNum) {
        this.passengerNum = passengerNum;
    }

    public String getPassengerNote() {
        return passengerNote;
    }

    public void setPassengerNote(String passengerNote) {
        this.passengerNote = passengerNote == null ? null : passengerNote.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", address=").append(address);
        sb.append(", routeId=").append(routeId);
        sb.append(", orderId=").append(orderId);
        sb.append(", bookDepartTime=").append(bookDepartTime);
        sb.append(", departure=").append(departure);
        sb.append(", depLongitude=").append(depLongitude);
        sb.append(", depLatitude=").append(depLatitude);
        sb.append(", destination=").append(destination);
        sb.append(", destLongitude=").append(destLongitude);
        sb.append(", destLatitude=").append(destLatitude);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", orderEnsureTime=").append(orderEnsureTime);
        sb.append(", passengerNum=").append(passengerNum);
        sb.append(", passengerNote=").append(passengerNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}