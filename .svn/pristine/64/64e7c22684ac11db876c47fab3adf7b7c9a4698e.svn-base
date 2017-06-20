package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class HomeEntity {

	private int carid;            //默认车子id
	private boolean isboxbind;    //盒子是否绑定
	private boolean isboxonline;  //盒子是否在线
	private weather weaather;     //当天天气信息
	private String defaultcarnum; //默认车辆车牌号
	private String carimg;        //车辆图片
	private int safescore;        //驾驶安全分数
	private int remindnum;        //提醒数目
	
	
	
	
	
	public HomeEntity(JSONObject json) {
		// TODO Auto-generated constructor stub
		try {
			
			this.safescore=json.getInt("drive_score");
			this.remindnum=json.getInt("remind_num");
			JSONObject carjs=json.getJSONObject("car");
			this.carid=carjs.getInt("car_id");
			this.defaultcarnum=carjs.getString("car_num");
			this.carimg=carjs.getString("car_pic");
			this.isboxbind=carjs.getBoolean("bound_box");//盒子绑定状态
			this.isboxonline=carjs.getBoolean("box_state");
			this.carid=carjs.getInt("car_id");
			
			
			JSONObject weatherjs=json.getJSONObject("weather");
			weather weathwerentity=new weather(weatherjs);
			this.weaather=weathwerentity;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public boolean isIsboxbind() {
		return isboxbind;
	}
	public void setIsboxbind(boolean isboxbind) {
		this.isboxbind = isboxbind;
	}
	public boolean isIsboxonline() {
		return isboxonline;
	}
	public void setIsboxonline(boolean isboxonline) {
		this.isboxonline = isboxonline;
	}
	public weather getWeaather() {
		return weaather;
	}
	public void setWeaather(weather weaather) {
		this.weaather = weaather;
	}
	public String getDefaultcarnum() {
		return defaultcarnum;
	}
	public void setDefaultcarnum(String defaultcarnum) {
		this.defaultcarnum = defaultcarnum;
	}
	public String getCarimg() {
		return carimg;
	}
	public void setCarimg(String carimg) {
		this.carimg = carimg;
	}
	public int getSafescore() {
		return safescore;
	}
	public void setSafescore(int safescore) {
		this.safescore = safescore;
	}
	public int getRemindnum() {
		return remindnum;
	}
	public void setRemindnum(int remindnum) {
		this.remindnum = remindnum;
	}
	
	
	
	
	
}
