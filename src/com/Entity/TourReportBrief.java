package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author:LinHaiZhen
 * @date:2016年11月21日 下午7:59:24
 * @Description:行程报告列表
 */
public class TourReportBrief {

	private int treport_id;				//行程报告id
	private String date;				//行程日期
	private String start_time;			//开始时间
	private String end_time;			//结束时间
	private String start_place;			//开始地址
	private String end_place;			//终点地址
	private String tour_mileage;		//行程里程
	
	private String cre_time;			//创建日期

	
	
	public TourReportBrief() {
		super();
	}
	public TourReportBrief(String start_time,String end_time,String start_place,String end_place,String tour_mileage) {
		this.start_time=start_time;
		this.end_time=end_time;
		this.start_place=start_place;
		this.end_place=end_place;
		this.tour_mileage=tour_mileage;
		
		
	}

	public TourReportBrief(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		String str;
		try {
			this.treport_id=jsonObject.getInt("treport_id");
			this.start_place=jsonObject.getString("start_place");
			this.end_place=jsonObject.getString("end_place");
			str=jsonObject.getString("start_time");
			this.start_time=str.substring(11).toString();
			str=jsonObject.getString("end_time");
			this.end_time=str.substring(11);
			this.tour_mileage=jsonObject.getString("tour_mileage");
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getTreport_id() {
		return treport_id;
	}

	public void setTreport_id(int treport_id) {
		this.treport_id = treport_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getStart_place() {
		return start_place;
	}

	public void setStart_place(String start_place) {
		this.start_place = start_place;
	}

	public String getEnd_place() {
		return end_place;
	}

	public void setEnd_place(String end_place) {
		this.end_place = end_place;
	}

	public String getCre_time() {
		return cre_time;
	}

	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}

	public String getTour_mileage() {
		return tour_mileage;
	}

	public void setTour_mileage(String tour_mileage) {
		this.tour_mileage = tour_mileage;
	}
	
	
	
}
