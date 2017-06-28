package com.wangyueche.bean.vo;

import java.io.Serializable;

public class SpotVo implements Serializable {

	private static final long serialVersionUID = 7129153746826875594L;

	private Double lng;

	private Double lat;

	private  Integer bizStatus;

	private String driverName;

	private String tel;

	private Long positionTime;

	public Long getPositionTime() {
		return positionTime;
	}

	public void setPositionTime(Long positionTime) {
		this.positionTime = positionTime;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getBizStatus() {
		return bizStatus;
	}

	public void setBizStatus(Integer bizStatus) {
		this.bizStatus = bizStatus;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "SpotVo [lng=" + lng + ", lat=" + lat + "]";
	}

}
