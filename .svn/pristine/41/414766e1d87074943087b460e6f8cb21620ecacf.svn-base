package com.Entity;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.baidu.mapapi.model.LatLng;

/**
 * @author:LinHaiZhen
 * @date:2016年11月21日 下午7:59:08
 * @Description:行程报告详情
 */
public class TourReportDetail {

	private String ave_fuel;		//平均油耗
	private String ave_speed;		//平均速度
	private String tour_duration;	//行驶时长
	private String tour_nil;		//行驶里程
	private String fuel_wear;		//耗油量
	private List<LatLng> lat_lnglist;	//经纬度点集
	
	public TourReportDetail() {
		super();
	}

	public TourReportDetail(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		try {
			this.ave_fuel=jsonObject.getString("ave_fuel");
			this.ave_speed=jsonObject.getString("ave_speed");
			this.fuel_wear=jsonObject.getString("fuel_wear");
			this.tour_duration=jsonObject.getString("tour_duration");
			this.tour_nil=jsonObject.getString("tour_nil");
			List<LatLng>list=new ArrayList<LatLng>();
			String str=jsonObject.getString("lat_lng");
			String[] array=str.split(";");
			for (int i = 0; i < array.length; i++) {
				String ll=array[i];
				ll=ll.replace("\"", "");
				String[] string =ll.split(",");
				double lat=Double.parseDouble(string[0]);
				double lng=Double.parseDouble(string[1]);
				LatLng latlng=new LatLng(lat, lng);
				list.add(latlng);
			}
			this.lat_lnglist=list;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getAve_fuel() {
		return ave_fuel;
	}

	public void setAve_fuel(String ave_fuel) {
		this.ave_fuel = ave_fuel;
	}

	public String getAve_speed() {
		return ave_speed;
	}

	public void setAve_speed(String ave_speed) {
		this.ave_speed = ave_speed;
	}

	public String getTour_duration() {
		return tour_duration;
	}

	public void setTour_duration(String tour_duration) {
		this.tour_duration = tour_duration;
	}

	public String getTour_nil() {
		return tour_nil;
	}

	public void setTour_nil(String tour_nil) {
		this.tour_nil = tour_nil;
	}

	public String getFuel_wear() {
		return fuel_wear;
	}

	public void setFuel_wear(String fuel_wear) {
		this.fuel_wear = fuel_wear;
	}

	public List<LatLng> getLat_lnglist() {
		return lat_lnglist;
	}

	public void setLat_lnglist(List<LatLng> lat_lnglist) {
		this.lat_lnglist = lat_lnglist;
	}

	
	
	
	
	
}
