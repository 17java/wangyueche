package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.CompanyFare;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/4/18 13:58
 *
 * @author gaojl
 */
public class CompanyFareVo implements Serializable {
    private static final long serialVersionUID = -7507437742932289798L;

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

    private String companyName;

    public CompanyFareVo() {
    }

    public CompanyFareVo(CompanyFare companyFare) {
        this.id = companyFare.getId();
        this.companyId = companyFare.getCompanyId();
        this.address = companyFare.getAddress();
        this.fareType = companyFare.getFareType();
        this.fareTypeNote = companyFare.getFareTypeNote();
        this.fareValidOn = companyFare.getFareValidOn();
        this.fareValidOff = companyFare.getFareValidOff();
        this.startFare = companyFare.getStartFare();
        this.startMile = companyFare.getStartMile();
        this.unitPricePerMile = companyFare.getUnitPricePerMile();
        this.unitPricePerMinute = companyFare.getUnitPricePerMinute();
        this.upPrice = companyFare.getUpPrice();
        this.upPriceStartMile = companyFare.getUpPriceStartMile();
        this.morningPeakTimeOn = companyFare.getMorningPeakTimeOn();
        this.morningPeakTimeOff = companyFare.getMorningPeakTimeOff();
        this.eveningPeakTimeOn = companyFare.getEveningPeakTimeOn();
        this.eveningPeakTimeOff = companyFare.getEveningPeakTimeOff();
        this.otherPeakTimeOn = companyFare.getOtherPeakTimeOn();
        this.otherPeakTimeOff = companyFare.getOtherPeakTimeOff();
        this.peakUnitPrice = companyFare.getPeakUnitPrice();
        this.peakPriceStartMile = companyFare.getPeakPriceStartMile();
        this.lowSpeedPricePerMinute = companyFare.getLowSpeedPricePerMinute();
        this.nightPricePerMile = companyFare.getNightPricePerMile();
        this.nightPricePerMinute = companyFare.getNightPricePerMinute();
        this.otherPrice = companyFare.getOtherPrice();
        this.state = companyFare.getState();
        this.updateTime = companyFare.getUpdateTime();
        this.flag = companyFare.getFlag();
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

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getFareTypeNote() {
        return fareTypeNote;
    }

    public void setFareTypeNote(String fareTypeNote) {
        this.fareTypeNote = fareTypeNote;
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
        this.morningPeakTimeOn = morningPeakTimeOn;
    }

    public String getMorningPeakTimeOff() {
        return morningPeakTimeOff;
    }

    public void setMorningPeakTimeOff(String morningPeakTimeOff) {
        this.morningPeakTimeOff = morningPeakTimeOff;
    }

    public String getEveningPeakTimeOn() {
        return eveningPeakTimeOn;
    }

    public void setEveningPeakTimeOn(String eveningPeakTimeOn) {
        this.eveningPeakTimeOn = eveningPeakTimeOn;
    }

    public String getEveningPeakTimeOff() {
        return eveningPeakTimeOff;
    }

    public void setEveningPeakTimeOff(String eveningPeakTimeOff) {
        this.eveningPeakTimeOff = eveningPeakTimeOff;
    }

    public String getOtherPeakTimeOn() {
        return otherPeakTimeOn;
    }

    public void setOtherPeakTimeOn(String otherPeakTimeOn) {
        this.otherPeakTimeOn = otherPeakTimeOn;
    }

    public String getOtherPeakTimeOff() {
        return otherPeakTimeOff;
    }

    public void setOtherPeakTimeOff(String otherPeakTimeOff) {
        this.otherPeakTimeOff = otherPeakTimeOff;
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
        this.otherPrice = otherPrice;
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
}