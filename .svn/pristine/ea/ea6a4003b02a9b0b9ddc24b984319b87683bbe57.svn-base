package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class Fault {

	private int fault_id;		//故障码id
	private String name;		//故障码名称
	private String code;		//故障码
	private String system_name;	//系统名称
	private String desc;		//故障码解释
	private String repair_sug;	//维修建议
	private String state;		//状态
	//private int fault_num;		//错误码数量
	
	
	
	
	public Fault() {
		super();
	}
	public Fault(JSONObject json,int i) {
		// TODO Auto-generated constructor stub
		try {
			if(i==0){//获取报告里面的故障码列表
				this.code=json.getString("code");
				this.fault_id=json.getInt("fault_id");
				this.name=json.getString("name");
				this.state=json.getString("state");
			}else if(i==1){//故障码详情
				this.code=json.getString("code");
				this.fault_id=json.getInt("fault_id");
				this.name=json.getString("name");
				this.desc=json.getString("desc");
				this.repair_sug=json.getString("repair_sug");
			}
			
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	public int getFault_num() {
//		return fault_num;
//	}
//	public void setFault_num(int fault_num) {
//		this.fault_num = fault_num;
//	}
	public int getFault_id() {
		return fault_id;
	}
	public void setFault_id(int fault_id) {
		this.fault_id = fault_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSystem_name() {
		return system_name;
	}
	public void setSystem_name(String system_name) {
		this.system_name = system_name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRepair_sug() {
		return repair_sug;
	}
	public void setRepair_sug(String repair_sug) {
		this.repair_sug = repair_sug;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
