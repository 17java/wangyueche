package com.wangyueche.bean.vo;

import java.io.Serializable;

public class TrackVo  implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 8581430891100078971L;
	//经度
    private double longitude;
    //纬度
    private double latitude;
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
    
    
    
	
}
