package com.Entity;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import com.tool.JSONEntity;

public class WeiZhang {

	private int weizhang_id;		//违章id
	private String item;			//违章项目
	private String time;			//违章时间
	private int score;				//违章分数
	private String address;			//违章地址
	private String desc;			//违章说明
	private String code;			//违章代码
	private String money;			//违章罚款
	
	private String check_time;		//查询时间

	
	public WeiZhang(JSONObject weizhang){
		try {
			this.address=weizhang.getString("address");
			this.item=weizhang.getString("item");
			this.time=weizhang.getString("time");
			this.score=weizhang.getInt("score");
			this.desc=weizhang.getString("desc");
			this.code=weizhang.getString("code");
			this.money=weizhang.getString("money");
			this.check_time=weizhang.getString("check_time");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//商家名称
	}
	
	public WeiZhang(String as,String my,int sc,String ti,String it,String cd ){
		this.address=as;
		this.money=my;
		this.score=sc;
		this.time=ti;
		this.item=it;
		this.code=cd;
	}

	public int getWeizhang_id() {
		return weizhang_id;
	}

	public void setWeizhang_id(int weizhang_id) {
		this.weizhang_id = weizhang_id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getCheck_time() {
		return check_time;
	}

	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	
	
}
