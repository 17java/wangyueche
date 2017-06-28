package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CompanyFare implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String fareType;

    private String fareTypeNote;

    private Long fareValidOn;

    private Long fareValidOff;

    private BigDecimal startFare;

    private BigDecimal startMile;

    private BigDecimal unitPricePerMile;

    private BigDecimal unitPricePerMinute;

    private BigDecimal upPrice;

    private Integer upPriceStartMile;

    private String morningPeakTimeOn;

    private String morningPeakTimeOff;

    private String eveningPeakTimeOn;

    private String eveningPeakTimeOff;

    private String otherPeakTimeOn;

    private String otherPeakTimeOff;

    private BigDecimal peakUnitPrice;

    private BigDecimal peakPriceStartMile;

    private BigDecimal lowSpeedPricePerMinute;

    private BigDecimal nightPricePerMile;

    private BigDecimal nightPricePerMinute;

    private String otherPrice;

    private Integer state;

    private Long updateTime;

    private Integer flag;

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

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType == null ? null : fareType.trim();
    }

    public String getFareTypeNote() {
        return fareTypeNote;
    }

    public void setFareTypeNote(String fareTypeNote) {
        this.fareTypeNote = fareTypeNote == null ? null : fareTypeNote.trim();
    }

    public Long getFareValidOn() {
        return fareValidOn;
    }

    public void setFareValidOn(Long fareValidOn) {
        this.fareValidOn = fareValidOn;
    }

    public Long getFareValidOff() {
        return fareValidOff;
    }

    public void setFareValidOff(Long fareValidOff) {
        this.fareValidOff = fareValidOff;
    }

    public BigDecimal getStartFare() {
        return startFare;
    }

    public void setStartFare(BigDecimal startFare) {
        this.startFare = startFare;
    }

    public BigDecimal getStartMile() {
        return startMile;
    }

    public void setStartMile(BigDecimal startMile) {
        this.startMile = startMile;
    }

    public BigDecimal getUnitPricePerMile() {
        return unitPricePerMile;
    }

    public void setUnitPricePerMile(BigDecimal unitPricePerMile) {
        this.unitPricePerMile = unitPricePerMile;
    }

    public BigDecimal getUnitPricePerMinute() {
        return unitPricePerMinute;
    }

    public void setUnitPricePerMinute(BigDecimal unitPricePerMinute) {
        this.unitPricePerMinute = unitPricePerMinute;
    }

    public BigDecimal getUpPrice() {
        return upPrice;
    }

    public void setUpPrice(BigDecimal upPrice) {
        this.upPrice = upPrice;
    }

    public Integer getUpPriceStartMile() {
        return upPriceStartMile;
    }

    public void setUpPriceStartMile(Integer upPriceStartMile) {
        this.upPriceStartMile = upPriceStartMile;
    }

    public String getMorningPeakTimeOn() {
        return morningPeakTimeOn;
    }

    public void setMorningPeakTimeOn(String morningPeakTimeOn) {
        this.morningPeakTimeOn = morningPeakTimeOn == null ? null : morningPeakTimeOn.trim();
    }

    public String getMorningPeakTimeOff() {
        return morningPeakTimeOff;
    }

    public void setMorningPeakTimeOff(String morningPeakTimeOff) {
        this.morningPeakTimeOff = morningPeakTimeOff == null ? null : morningPeakTimeOff.trim();
    }

    public String getEveningPeakTimeOn() {
        return eveningPeakTimeOn;
    }

    public void setEveningPeakTimeOn(String eveningPeakTimeOn) {
        this.eveningPeakTimeOn = eveningPeakTimeOn == null ? null : eveningPeakTimeOn.trim();
    }

    public String getEveningPeakTimeOff() {
        return eveningPeakTimeOff;
    }

    public void setEveningPeakTimeOff(String eveningPeakTimeOff) {
        this.eveningPeakTimeOff = eveningPeakTimeOff == null ? null : eveningPeakTimeOff.trim();
    }

    public String getOtherPeakTimeOn() {
        return otherPeakTimeOn;
    }

    public void setOtherPeakTimeOn(String otherPeakTimeOn) {
        this.otherPeakTimeOn = otherPeakTimeOn == null ? null : otherPeakTimeOn.trim();
    }

    public String getOtherPeakTimeOff() {
        return otherPeakTimeOff;
    }

    public void setOtherPeakTimeOff(String otherPeakTimeOff) {
        this.otherPeakTimeOff = otherPeakTimeOff == null ? null : otherPeakTimeOff.trim();
    }

    public BigDecimal getPeakUnitPrice() {
        return peakUnitPrice;
    }

    public void setPeakUnitPrice(BigDecimal peakUnitPrice) {
        this.peakUnitPrice = peakUnitPrice;
    }

    public BigDecimal getPeakPriceStartMile() {
        return peakPriceStartMile;
    }

    public void setPeakPriceStartMile(BigDecimal peakPriceStartMile) {
        this.peakPriceStartMile = peakPriceStartMile;
    }

    public BigDecimal getLowSpeedPricePerMinute() {
        return lowSpeedPricePerMinute;
    }

    public void setLowSpeedPricePerMinute(BigDecimal lowSpeedPricePerMinute) {
        this.lowSpeedPricePerMinute = lowSpeedPricePerMinute;
    }

    public BigDecimal getNightPricePerMile() {
        return nightPricePerMile;
    }

    public void setNightPricePerMile(BigDecimal nightPricePerMile) {
        this.nightPricePerMile = nightPricePerMile;
    }

    public BigDecimal getNightPricePerMinute() {
        return nightPricePerMinute;
    }

    public void setNightPricePerMinute(BigDecimal nightPricePerMinute) {
        this.nightPricePerMinute = nightPricePerMinute;
    }

    public String getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(String otherPrice) {
        this.otherPrice = otherPrice == null ? null : otherPrice.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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
        sb.append(", fareType=").append(fareType);
        sb.append(", fareTypeNote=").append(fareTypeNote);
        sb.append(", fareValidOn=").append(fareValidOn);
        sb.append(", fareValidOff=").append(fareValidOff);
        sb.append(", startFare=").append(startFare);
        sb.append(", startMile=").append(startMile);
        sb.append(", unitPricePerMile=").append(unitPricePerMile);
        sb.append(", unitPricePerMinute=").append(unitPricePerMinute);
        sb.append(", upPrice=").append(upPrice);
        sb.append(", upPriceStartMile=").append(upPriceStartMile);
        sb.append(", morningPeakTimeOn=").append(morningPeakTimeOn);
        sb.append(", morningPeakTimeOff=").append(morningPeakTimeOff);
        sb.append(", eveningPeakTimeOn=").append(eveningPeakTimeOn);
        sb.append(", eveningPeakTimeOff=").append(eveningPeakTimeOff);
        sb.append(", otherPeakTimeOn=").append(otherPeakTimeOn);
        sb.append(", otherPeakTimeOff=").append(otherPeakTimeOff);
        sb.append(", peakUnitPrice=").append(peakUnitPrice);
        sb.append(", peakPriceStartMile=").append(peakPriceStartMile);
        sb.append(", lowSpeedPricePerMinute=").append(lowSpeedPricePerMinute);
        sb.append(", nightPricePerMile=").append(nightPricePerMile);
        sb.append(", nightPricePerMinute=").append(nightPricePerMinute);
        sb.append(", otherPrice=").append(otherPrice);
        sb.append(", state=").append(state);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}