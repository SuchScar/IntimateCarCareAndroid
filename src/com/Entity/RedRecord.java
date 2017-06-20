package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class RedRecord {

	private int rreport_id;			//红包id
	private int num;				//红包数目
	private int type;				//红包类型 (0-消费  1-获取)
	private String desc;			//红包描述
	
	private String cre_time;		//创建日期

	public RedRecord(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		try {
			this.rreport_id=jsonObject.getInt("rrecord_id");
			this.cre_time=jsonObject.getString("cre_time");
			this.desc=jsonObject.getString("desc");
			this.num=jsonObject.getInt("num")/100;
			this.type=jsonObject.getInt("type");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getRreport_id() {
		return rreport_id;
	}

	public void setRreport_id(int rreport_id) {
		this.rreport_id = rreport_id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCre_time() {
		return cre_time;
	}

	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}
	
	
	
	
}
