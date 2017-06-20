package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

//数据流
public class DataFlow {

	private int dataflow_id;		//数据流id
	private String name;			//数据流名称
	private String normal_range;	//正常范围
	private String value;			//数值
	private String desc;			//解释
	private String maintain_sug;	//保养建议
	private String state;			//状态
	
	
	
	public DataFlow() {
		super();
	}
	
	public DataFlow(JSONObject json,int i) {
		// TODO Auto-generated constructor stub
		try {
			if(i==0){//报告里面的列表
				this.dataflow_id=json.getInt("dataflow_id");
				this.name=json.getString("name");
				this.value=json.getString("value");
				this.state=json.getString("state");
			}else if(i==1){
				this.dataflow_id=json.getInt("dataflow_id");
				this.maintain_sug=json.getString("maintain_sug");
				this.value=json.getString("value");
				this.desc=json.getString("desc");
				this.name=json.getString("name");
				
			}
			
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public int getDataflow_id() {
		return dataflow_id;
	}
	public void setDataflow_id(int dataflow_id) {
		this.dataflow_id = dataflow_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNormal_range() {
		return normal_range;
	}
	public void setNormal_range(String normal_range) {
		this.normal_range = normal_range;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMaintain_sug() {
		return maintain_sug;
	}
	public void setMaintain_sug(String maintain_sug) {
		this.maintain_sug = maintain_sug;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
