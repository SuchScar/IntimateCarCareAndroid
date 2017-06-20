package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class CarReportBrief {

	private int report_id;
	private String report_time;
	private int report_faultnum;
	private int report_score;
	
	
	
	
	public CarReportBrief(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		try {
			this.report_id=jsonObject.getInt("dreport_id");
			this.report_faultnum=jsonObject.getInt("fault_num");
			this.report_score=jsonObject.getInt("detect_score");
			this.report_time=jsonObject.getString("detect_time").substring(0,10);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getReport_time() {
		return report_time;
	}
	public void setReport_time(String report_time) {
		this.report_time = report_time;
	}
	public int getReport_faultnum() {
		return report_faultnum;
	}
	public void setReport_faultnum(int report_faultnum) {
		this.report_faultnum = report_faultnum;
	}
	public int getReport_score() {
		return report_score;
	}
	public void setReport_score(int report_score) {
		this.report_score = report_score;
	}
}
