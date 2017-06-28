package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.VehicleInfo;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 15:43
 *
 * @author gaojl
 */
public class VehicleInfoVo implements Serializable {
    private static final long serialVersionUID = -3964165852782156522L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String vehicleNo;

    private String plateColor;

    private Integer seats;

    private String brand;

    private String model;

    private String vehicleType;

    private String ownerName;

    private String vehicleColor;

    private String engineId;

    private String vin;

    private Integer certifyDateA;

    private String fuelType;

    private String engineDisplace;

    private String photoId;

    private String certificate;

    private String transAgency;

    private String transArea;

    private Integer transDateStart;

    private Integer transDateStop;

    private Integer certifyDateB;

    private String fixState;

    private Integer nextFixDate;

    private String checkState;

    private String feePrintId;

    private String gpsBrand;

    private String gpsModel;

    private String gpsimei;

    private Integer gpsInstallDate;

    private Integer registerDate;

    private Integer commercialType;

    private String fareType;

    private Integer state;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public VehicleInfoVo(VehicleInfo info) {
        this.id = info.getId();
        this.companyId = info.getCompanyId();
        this.address = info.getAddress();
        this.vehicleNo = info.getVehicleNo();
        this.plateColor = info.getPlateColor();
        this.seats = info.getSeats();
        this.brand = info.getBrand();
        this.model = info.getModel();
        this.vehicleType = info.getVehicleType();
        this.ownerName = info.getOwnerName();
        this.vehicleColor = info.getVehicleColor();
        this.engineId = info.getEngineId();
        this.vin = info.getVin();
        this.certifyDateA = info.getCertifyDateA();
        this.fuelType = info.getFuelType();
        this.engineDisplace = info.getEngineDisplace();
        this.photoId = info.getPhotoId();
        this.certificate = info.getCertificate();
        this.transAgency = info.getTransAgency();
        this.transArea = info.getTransArea();
        this.transDateStart = info.getTransDateStart();
        this.transDateStop = info.getTransDateStop();
        this.certifyDateB = info.getCertifyDateB();
        this.fixState = info.getFixState();
        this.nextFixDate = info.getNextFixDate();
        this.checkState = info.getCheckState();
        this.feePrintId = info.getFeePrintId();
        this.gpsBrand = info.getGpsBrand();
        this.gpsModel = info.getGpsModel();
        this.gpsimei = info.getGpsimei();
        this.gpsInstallDate = info.getGpsInstallDate();
        this.registerDate = info.getRegisterDate();
        this.commercialType = info.getCommercialType();
        this.fareType = info.getFareType();
        this.state = info.getState();
        this.flag = info.getFlag();
        this.updateTime = info.getUpdateTime();
    }

    public VehicleInfoVo() {
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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getCertifyDateA() {
        return certifyDateA;
    }

    public void setCertifyDateA(Integer certifyDateA) {
        this.certifyDateA = certifyDateA;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineDisplace() {
        return engineDisplace;
    }

    public void setEngineDisplace(String engineDisplace) {
        this.engineDisplace = engineDisplace;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getTransAgency() {
        return transAgency;
    }

    public void setTransAgency(String transAgency) {
        this.transAgency = transAgency;
    }

    public String getTransArea() {
        return transArea;
    }

    public void setTransArea(String transArea) {
        this.transArea = transArea;
    }

    public Integer getTransDateStart() {
        return transDateStart;
    }

    public void setTransDateStart(Integer transDateStart) {
        this.transDateStart = transDateStart;
    }

    public Integer getTransDateStop() {
        return transDateStop;
    }

    public void setTransDateStop(Integer transDateStop) {
        this.transDateStop = transDateStop;
    }

    public Integer getCertifyDateB() {
        return certifyDateB;
    }

    public void setCertifyDateB(Integer certifyDateB) {
        this.certifyDateB = certifyDateB;
    }

    public String getFixState() {
        return fixState;
    }

    public void setFixState(String fixState) {
        this.fixState = fixState;
    }

    public Integer getNextFixDate() {
        return nextFixDate;
    }

    public void setNextFixDate(Integer nextFixDate) {
        this.nextFixDate = nextFixDate;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getFeePrintId() {
        return feePrintId;
    }

    public void setFeePrintId(String feePrintId) {
        this.feePrintId = feePrintId;
    }

    public String getGpsBrand() {
        return gpsBrand;
    }

    public void setGpsBrand(String gpsBrand) {
        this.gpsBrand = gpsBrand;
    }

    public String getGpsModel() {
        return gpsModel;
    }

    public void setGpsModel(String gpsModel) {
        this.gpsModel = gpsModel;
    }

    public String getGpsimei() {
        return gpsimei;
    }

    public void setGpsimei(String gpsimei) {
        this.gpsimei = gpsimei;
    }

    public Integer getGpsInstallDate() {
        return gpsInstallDate;
    }

    public void setGpsInstallDate(Integer gpsInstallDate) {
        this.gpsInstallDate = gpsInstallDate;
    }

    public Integer getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Integer registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Integer commercialType) {
        this.commercialType = commercialType;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
