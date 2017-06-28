package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.PassengerEvaluation;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 16:32
 *
 * @author gaojl
 */
public class PassengerEvaluationVo implements Serializable {
    private static final long serialVersionUID = -2761610205185983083L;

    private Integer id;

    private String companyId;

    private String orderId;

    private Long evaluateTime;

    private Integer serviceScore;

    private Integer driverScore;

    private Integer vehicleScore;

    private String detail;

    private String companyName;

    private String vehicleNo;

    public PassengerEvaluationVo(PassengerEvaluation evaluation) {
        this.id = evaluation.getId();
        this.companyId = evaluation.getCompanyId();
        this.orderId = evaluation.getOrderId();
        this.evaluateTime = evaluation.getEvaluateTime();
        this.serviceScore = evaluation.getServiceScore();
        this.driverScore = evaluation.getDriverScore();
        this.vehicleScore = evaluation.getVehicleScore();
        this.detail = evaluation.getDetail();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
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

    public Long getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Long evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getDriverScore() {
        return driverScore;
    }

    public void setDriverScore(Integer driverScore) {
        this.driverScore = driverScore;
    }

    public Integer getVehicleScore() {
        return vehicleScore;
    }

    public void setVehicleScore(Integer vehicleScore) {
        this.vehicleScore = vehicleScore;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
