package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class GmVehicleLicense implements Serializable {
    private Integer id;

    private Integer address;

    private String vehicleNo;

    private String plateColor;

    private String brand;

    private String model;

    private String engineId;

    private String vin;

    private String vehicleType;

    private String vehicleTypeCode;

    private Integer deliveryDate;

    private Integer certifyDatea;

    private String fuelType;

    private BigDecimal wheelbase;

    private BigDecimal commander;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal power;

    private Integer seats;

    private String gpsBrand;

    private String gpsModel;

    private Integer state;

    private String transArea;

    private String certificate;

    private String transAgency;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor == null ? null : plateColor.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId == null ? null : engineId.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode == null ? null : vehicleTypeCode.trim();
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Integer getCertifyDatea() {
        return certifyDatea;
    }

    public void setCertifyDatea(Integer certifyDatea) {
        this.certifyDatea = certifyDatea;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public BigDecimal getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(BigDecimal wheelbase) {
        this.wheelbase = wheelbase;
    }

    public BigDecimal getCommander() {
        return commander;
    }

    public void setCommander(BigDecimal commander) {
        this.commander = commander;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getGpsBrand() {
        return gpsBrand;
    }

    public void setGpsBrand(String gpsBrand) {
        this.gpsBrand = gpsBrand == null ? null : gpsBrand.trim();
    }

    public String getGpsModel() {
        return gpsModel;
    }

    public void setGpsModel(String gpsModel) {
        this.gpsModel = gpsModel == null ? null : gpsModel.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTransArea() {
        return transArea;
    }

    public void setTransArea(String transArea) {
        this.transArea = transArea == null ? null : transArea.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getTransAgency() {
        return transAgency;
    }

    public void setTransAgency(String transAgency) {
        this.transAgency = transAgency == null ? null : transAgency.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", plateColor=").append(plateColor);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", engineId=").append(engineId);
        sb.append(", vin=").append(vin);
        sb.append(", vehicleType=").append(vehicleType);
        sb.append(", vehicleTypeCode=").append(vehicleTypeCode);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", certifyDatea=").append(certifyDatea);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", wheelbase=").append(wheelbase);
        sb.append(", commander=").append(commander);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", power=").append(power);
        sb.append(", seats=").append(seats);
        sb.append(", gpsBrand=").append(gpsBrand);
        sb.append(", gpsModel=").append(gpsModel);
        sb.append(", state=").append(state);
        sb.append(", transArea=").append(transArea);
        sb.append(", certificate=").append(certificate);
        sb.append(", transAgency=").append(transAgency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}