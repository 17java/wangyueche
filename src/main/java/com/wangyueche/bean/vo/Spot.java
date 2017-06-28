package com.wangyueche.bean.vo;

import java.io.Serializable;



/**
 * 位置 点
 */
public class Spot implements Serializable {

	private static final long serialVersionUID = -3261367063305632658L;

	private Long receive = 0L;

	private Long systime = 0L;

	private Double lng = 0D;

	private Double lat = 0D;

	// 停留时间 秒
	private Integer stayed;

	// 与上个点的里程
	private Double distance = 0D;

	// 速度
	private Double speed = 0D;

	// 方向
	private Float direction = 0F;
	
	// 海拔
	private Float altitude = 0F;

	// 定位方式,如:AGPS:V GPS:A
	private String mode;

	private String deviceSn;

	/**
	 * 备用字段----
	 */
	private String info;
	
	private String cell;
	
	private int accMode;
	
	private int mode433;
	
	private String name;//用户名或者物流锁开锁次数
	private int lock;//物流锁开关状态（1开，0关）
	private Integer steps;// 步数

	/** 电量 */
	private Integer battery = 0;
	// *******************************************

	public String getInfo() {
		return info;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Long getReceive() {
		return receive;
	}

	public void setReceive(Long receive) {
		this.receive = receive;
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

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Integer getStayed() {
		return stayed;
	}

	public void setStayed(Integer stayed) {
		this.stayed = stayed;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Float getDirection() {
		return direction;
	}

	public void setDirection(Float direction) {
		this.direction = direction;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Long getSystime() {
		return systime;
	}

	public void setSystime(Long systime) {
		this.systime = systime;
	}

	public int getAccMode() {
		return accMode;
	}

	public void setAccMode(int accMode) {
		this.accMode = accMode;
	}

	public int getMode433() {
		return mode433;
	}

	public void setMode433(int mode433) {
		this.mode433 = mode433;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLock() {
		return lock;
	}

	public void setLock(int lock) {
		this.lock = lock;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public Float getAltitude() {
		return altitude;
	}

	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}

	public Integer getBattery() {
		return battery;
	}

	public void setBattery(Integer battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Spot [receive=" + receive + ", systime=" + systime + ", lng="
				+ lng + ", lat=" + lat + ", stayed=" + stayed + ", distance="
				+ distance + ", speed=" + speed + ", direction=" + direction
				+ ", altitude=" + altitude + ", mode=" + mode + ", deviceSn="
				+ deviceSn + ", info=" + info + ", cell=" + cell + ", accMode="
				+ accMode + ", mode433=" + mode433 + ", name=" + name
				+ ", lock=" + lock + ", steps=" + steps + "]";
	}
}
