package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

//提醒
public class Remind {

	private int remind_id;			//提醒id
	private int bound_id;			//绑定id
	private int read;			//是否已读
	private int level;				//提醒等级
	private String content;			//提醒内容
	private int type;				//提醒类型
	private int car_id;				//车子id
	private int box_id;				//盒子id
	private int num;                //提醒数量
	
	private String cre_time;		//创建时间
	
	
	public Remind() {
		super();
	}
	
	
	public Remind(JSONObject json,int i) {
		// TODO Auto-generated constructor stub
		try {
			if(i==0){
				this.remind_id=json.getInt("remind_id");
				this.cre_time=json.getString("cre_time");
				this.content=json.getString("content");
				this.type=json.getInt("type");
				this.read=json.getInt("read");
			}else if(i==1){
				this.level=json.getInt("level");
				this.num=json.getInt("remind_num");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getRead() {
		return read;
	}


	public int getRemind_id() {
		return remind_id;
	}
	public void setRemind_id(int remind_id) {
		this.remind_id = remind_id;
	}
	public int getBound_id() {
		return bound_id;
	}
	public void setBound_id(int bound_id) {
		this.bound_id = bound_id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public String getCre_time() {
		return cre_time;
	}
	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}
}
