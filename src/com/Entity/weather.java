package com.Entity;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.tool.SPUtils;

public class weather {

	private int num;					//序号
	private String timeer; //农历
	private String  week; //星期几
	private String date;//几月几号
	private int weatherimage;//天气图片
	private String weather_condion;//天气状况
	private String temperature;//温度
	private String car_wash_sug; //宜洗车
	
	
	public weather(String ti,String wk,String wc,String tt,String wr){
		date=ti;
		week=wk;
		weather_condion=wc;
		temperature=tt;
		car_wash_sug=wr;
	}
	public weather(JSONObject weather) {
		// TODO Auto-generated constructor stub
		try {
			this.week=weather.getString("week");
			this.date=weather.getString("date");
			this.temperature=weather.getString("temperature");
			this.weather_condion=weather.getString("weather_condion");
			this.car_wash_sug=weather.getString("car_wash_sug");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public weather() {}
   
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeather_condion() {
		return weather_condion;
	}

	public void setWeather_condion(String weather_condion) {
		this.weather_condion = weather_condion;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getCar_wash_sug() {
		return car_wash_sug;
	}

	public void setCar_wash_sug(String car_wash_sug) {
		this.car_wash_sug = car_wash_sug;
	}

	public String getTimeer() {
		return timeer;
	}
	public void setTimeer(String timeer) {
		this.timeer = timeer;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public int getWeatherimage() {
		return weatherimage;
	}
	public void setWeatherimage(int weatherimage) {
		this.weatherimage = weatherimage;
	}
	public String getWeathercondition() {
		return weather_condion;
	}
	public void setWeathercondition(String weathercondition) {
		this.weather_condion = weathercondition;
	}
	public String getTemperture() {
		return temperature;
	}
	public void setTemperture(String temperture) {
		this.temperature = temperture;
	}
	public String getWashcar() {
		return car_wash_sug;
	}
	public void setWashcar(String washcar) {
		this.car_wash_sug = washcar;
	}
	
	
}
