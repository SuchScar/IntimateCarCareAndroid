package com.Entity;

/**
 * @author:LinHaiZhen
 * @date:2016年11月21日 下午7:40:18
 * @Description:车辆现状
 */
public class CarStatus {

	private float compass_info;		//罗盘信息
	private String latitude;		//经度
	private String longitude;		//纬度
	private String speed;			//车速
	private String remain_fuel;		//剩余油量
	private String battery_voltage;	//电瓶电压
	private String ave_fuel;		//平均油耗
	private String fuel_wear;		//耗油量
	private String mileage;			//总里程
	public float getCompass_info() {
		return compass_info;
	}
	public void setCompass_info(float compass_info) {
		this.compass_info = compass_info;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getRemain_fuel() {
		return remain_fuel;
	}
	public void setRemain_fuel(String remain_fuel) {
		this.remain_fuel = remain_fuel;
	}
	public String getBattery_voltage() {
		return battery_voltage;
	}
	public void setBattery_voltage(String battery_voltage) {
		this.battery_voltage = battery_voltage;
	}
	public String getAve_fuel() {
		return ave_fuel;
	}
	public void setAve_fuel(String ave_fuel) {
		this.ave_fuel = ave_fuel;
	}
	public String getFuel_wear() {
		return fuel_wear;
	}
	public void setFuel_wear(String fuel_wear) {
		this.fuel_wear = fuel_wear;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	
	
}
