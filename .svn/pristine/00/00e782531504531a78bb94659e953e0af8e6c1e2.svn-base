package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class MyRedInfo {

	private int rednum;//余额
	private int getnum;//已获得
	private int usenum;//已使用
	
	public MyRedInfo() {}

	public MyRedInfo(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		try {
			this.rednum=jsonObject.getInt("red_num");
			this.getnum=jsonObject.getInt("get_red");
			this.usenum=jsonObject.getInt("consume_red");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getRednum() {
		return rednum;
	}

	public void setRednum(int rednum) {
		this.rednum = rednum;
	}

	public int getGetnum() {
		return getnum;
	}

	public void setGetnum(int getnum) {
		this.getnum = getnum;
	}

	public int getUsenum() {
		return usenum;
	}

	public void setUsenum(int usenum) {
		this.usenum = usenum;
	}
	
	
}
