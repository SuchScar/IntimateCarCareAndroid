package com.Entity;

public class MaintainItem {

	private int mitem_id;		//保养项目id
	private String item_name;	//项目名称
	private int item_type;		//项目类型（1-液体类，2-滤芯器，3-火花塞，4-皮带，5-清洗，6-轮胎，7-刹车片，8-其他）
	private String cycle_gap;	//保养里程间隔
	private String time_gap;	//保养时间间隔
	private String pre_cycle;	//上次保养里程
	private String pre_time;	//上次保养时间
	private String next_cycle;	//距离下次保养里程
	private int mitem_type;    //保养类型（大类 ）
	
	
	private int car_id;			//车子id

	
	public MaintainItem() {}

	public int getMitem_id() {
		return mitem_id;
	}

	public int getMitem_type() {
		return mitem_type;
	}

	public void setMitem_type(int mitem_type) {
		this.mitem_type = mitem_type;
	}

	public void setMitem_id(int mitem_id) {
		this.mitem_id = mitem_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_type() {
		return item_type;
	}

	public void setItem_type(int item_type) {
		this.item_type = item_type;
	}

	public String getCycle_gap() {
		return cycle_gap;
	}

	public void setCycle_gap(String cycle_gap) {
		this.cycle_gap = cycle_gap;
	}

	public String getTime_gap() {
		return time_gap;
	}

	public void setTime_gap(String time_gap) {
		this.time_gap = time_gap;
	}

	public String getPre_cycle() {
		return pre_cycle;
	}

	public void setPre_cycle(String pre_cycle) {
		this.pre_cycle = pre_cycle;
	}

	public String getPre_time() {
		return pre_time;
	}

	public void setPre_time(String pre_time) {
		this.pre_time = pre_time;
	}

	public String getNext_cycle() {
		return next_cycle;
	}

	public void setNext_cycle(String next_cycle) {
		this.next_cycle = next_cycle;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	
	
	
	
}
