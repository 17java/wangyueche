package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.PassengerInfo;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 16:27
 *
 * @author gaojl
 */
public class PassengerInfoVo implements Serializable {
    private static final long serialVersionUID = 3572699217929879992L;

    private Integer id;

    private String companyId;

    private Integer registerDate;

    private String passengerPhone;

    private String passengerName;

    private String passengerGender;

    private Integer state;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public PassengerInfoVo(PassengerInfo info) {
        this.id = info.getId();
        this.companyId = info.getCompanyId();
        this.registerDate = info.getRegisterDate();
        this.passengerPhone = info.getPassengerPhone();
        this.passengerName = info.getPassengerName();
        this.passengerGender = info.getPassengerGender();
        this.state = info.getState();
        this.flag = info.getFlag();
        this.updateTime = info.getUpdateTime();
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

    public Integer getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Integer registerDate) {
        this.registerDate = registerDate;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
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
