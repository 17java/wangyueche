package com.wangyueche.bean.vo.share;

import com.wangyueche.bean.entity.ShareOrder;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/16 12:02 .
 */
public class ShareOrderVo implements Serializable {
    private static final long serialVersionUID = -2273432572827026548L;

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

    private String companyName;

    public ShareOrderVo() {
    }


    public ShareOrderVo(ShareOrder order) {
        this.id = order.getId();
        this.companyId = order.getCompanyId();
        this.address = order.getAddress();
        this.routeId = order.getRouteId();
        this.orderId = order.getOrderId();
        this.bookDepartTime = order.getBookDepartTime();
        this.departure = order.getDeparture();
        this.depLongitude = order.getDepLongitude();
        this.depLatitude = order.getDepLatitude();
        this.destination = order.getDestination();
        this.destLongitude = order.getDestLongitude();
        this.destLatitude = order.getDestLatitude();
        this.encrypt = order.getEncrypt();
        this.orderEnsureTime = order.getOrderEnsureTime();
        this.passengerNum = order.getPassengerNum();
        this.passengerNote = order.getPassengerNote();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

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
        this.companyId = companyId;
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
        this.routeId = routeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
        this.departure = departure;
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
        this.destination = destination;
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
        this.passengerNote = passengerNote;
    }
}
