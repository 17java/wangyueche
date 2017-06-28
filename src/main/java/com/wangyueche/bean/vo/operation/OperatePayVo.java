package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.OperateDepartArrive;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/4/18 16:19
 *
 * @author gaojl
 */
public class OperatePayVo implements Serializable {
    private static final long serialVersionUID = -3243477747767213599L;

    private Integer id;

    private String companyId;

    private String orderId;

    private Integer onArea;

    private String driverName;

    private String licenseId;

    private String fareType;

    private String vehicleNo;

    private Long bookDepTime;

    private Long waitTime;

    private Double depLongitude;

    private Double depLatitude;

    private String depArea;

    private Long depTime;

    private Integer encrypt;

    private Double destLongitude;

    private Double destLatitude;

    private String destArea;

    private Long destTime;

    private String bookModel;

    private String model;

    private BigDecimal driveMile;

    private Integer driveTime;

    private BigDecimal waitMile;

    private BigDecimal factPrice;

    private BigDecimal price;

    private BigDecimal cashPrice;

    private String lineName;

    private BigDecimal linePrice;

    private String posName;

    private BigDecimal posPrice;

    private BigDecimal benfitPrice;

    private BigDecimal bookTip;

    private Integer passengerTip;

    private BigDecimal peakUpPrice;

    private BigDecimal nightUpPrice;

    private BigDecimal farUpPrice;

    private BigDecimal otherUpPrice;

    private String payState;

    private Long payTime;

    private Long orderMatchTime;

    private String invoiceStatus;

    private Integer beginBeyondOperate;

    private Integer endBeyondOperate;

    private String companyName;

    public OperatePayVo() {

    }

    public OperatePayVo(OperateDepartArrive pay) {
        this.companyId = pay.getCompanyId();
        this.orderId = pay.getOrderId();
        this.onArea = pay.getOnArea();
        this.driverName = pay.getDriverName();
        this.licenseId = pay.getLicenseId();
        this.fareType = pay.getFareType();
        this.vehicleNo = pay.getVehicleNo();
        this.bookDepTime = pay.getBookDepTime();
        this.waitTime = pay.getWaitTime();
        this.depLongitude = pay.getDepLongitude();
        this.depLatitude = pay.getDepLatitude();
        this.depArea = pay.getDepArea();
        this.depTime = pay.getDepTime();
        this.encrypt = pay.getEncrypt();
        this.destLongitude = pay.getDestLongitude();
        this.destLatitude = pay.getDestLatitude();
        this.destArea = pay.getDestArea();
        this.destTime = pay.getDestTime();
        this.bookModel = pay.getBookModel();
        this.model = pay.getModel();
        this.driveMile = pay.getDriveMile();
        this.driveTime = pay.getDriveTime();
        this.waitMile = pay.getWaitMile();
        this.factPrice = pay.getFactPrice();
        this.price = pay.getPrice();
        this.cashPrice = pay.getCashPrice();
        this.lineName = pay.getLineName();
        this.linePrice = pay.getLinePrice();
        this.posName = pay.getPosName();
        this.posPrice = pay.getPosPrice();
        this.benfitPrice = pay.getBenfitPrice();
        this.bookTip = pay.getBookTip();
        this.passengerTip = pay.getPassengerTip();
        this.peakUpPrice = pay.getPeakUpPrice();
        this.nightUpPrice = pay.getNightUpPrice();
        this.farUpPrice = pay.getFarUpPrice();
        this.otherUpPrice = pay.getOtherUpPrice();
        this.payState = pay.getPayState();
        this.payTime = pay.getPayTime();
        this.orderMatchTime = pay.getOrderMatchTime();
        this.invoiceStatus = pay.getInvoiceStatus();
        this.beginBeyondOperate = pay.getBeginBeyondOperate();
        this.endBeyondOperate = pay.getEndBeyondOperate();
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOnArea() {
        return onArea;
    }

    public void setOnArea(Integer onArea) {
        this.onArea = onArea;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Long getBookDepTime() {
        return bookDepTime;
    }

    public void setBookDepTime(Long bookDepTime) {
        this.bookDepTime = bookDepTime;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
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

    public String getDepArea() {
        return depArea;
    }

    public void setDepArea(String depArea) {
        this.depArea = depArea;
    }

    public Long getDepTime() {
        return depTime;
    }

    public void setDepTime(Long depTime) {
        this.depTime = depTime;
    }

    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
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

    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea;
    }

    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
    }

    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(BigDecimal driveMile) {
        this.driveMile = driveMile;
    }

    public Integer getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Integer driveTime) {
        this.driveTime = driveTime;
    }

    public BigDecimal getWaitMile() {
        return waitMile;
    }

    public void setWaitMile(BigDecimal waitMile) {
        this.waitMile = waitMile;
    }

    public BigDecimal getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public BigDecimal getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(BigDecimal linePrice) {
        this.linePrice = linePrice;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public BigDecimal getPosPrice() {
        return posPrice;
    }

    public void setPosPrice(BigDecimal posPrice) {
        this.posPrice = posPrice;
    }

    public BigDecimal getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(BigDecimal benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    public BigDecimal getBookTip() {
        return bookTip;
    }

    public void setBookTip(BigDecimal bookTip) {
        this.bookTip = bookTip;
    }

    public Integer getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(Integer passengerTip) {
        this.passengerTip = passengerTip;
    }

    public BigDecimal getPeakUpPrice() {
        return peakUpPrice;
    }

    public void setPeakUpPrice(BigDecimal peakUpPrice) {
        this.peakUpPrice = peakUpPrice;
    }

    public BigDecimal getNightUpPrice() {
        return nightUpPrice;
    }

    public void setNightUpPrice(BigDecimal nightUpPrice) {
        this.nightUpPrice = nightUpPrice;
    }

    public BigDecimal getFarUpPrice() {
        return farUpPrice;
    }

    public void setFarUpPrice(BigDecimal farUpPrice) {
        this.farUpPrice = farUpPrice;
    }

    public BigDecimal getOtherUpPrice() {
        return otherUpPrice;
    }

    public void setOtherUpPrice(BigDecimal otherUpPrice) {
        this.otherUpPrice = otherUpPrice;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getOrderMatchTime() {
        return orderMatchTime;
    }

    public void setOrderMatchTime(Long orderMatchTime) {
        this.orderMatchTime = orderMatchTime;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getBeginBeyondOperate() {
        return beginBeyondOperate;
    }

    public void setBeginBeyondOperate(Integer beginBeyondOperate) {
        this.beginBeyondOperate = beginBeyondOperate;
    }

    public Integer getEndBeyondOperate() {
        return endBeyondOperate;
    }

    public void setEndBeyondOperate(Integer endBeyondOperate) {
        this.endBeyondOperate = endBeyondOperate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
