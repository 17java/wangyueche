package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.PassengerComplaint;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 16:34
 *
 * @author gaojl
 */
public class PassengerComplaintVo implements Serializable {
    private static final long serialVersionUID = -9133278351343861474L;

    private Integer id;

    private String companyId;

    private String orderId;

    private Long complaintTime;

    private String detail;

    private String result;

    private String companyName;

    public PassengerComplaintVo(PassengerComplaint complaint) {
        this.id = complaint.getId();
        this.companyId = complaint.getCompanyId();
        this.orderId = complaint.getOrderId();
        this.complaintTime = complaint.getComplaintTime();
        this.detail = complaint.getDetail();
        this.result = complaint.getResult();
    }

    public PassengerComplaintVo() {
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

    public Long getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Long complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
