package com.Entity;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//车况检查
public class CarReport {

	private int dreport_id;				//车辆检测报告id
	private String detect_time;			//检测时间
	private	int detect_score;			//检测分数
	private String detect_conclusion;	//检测结论
	private List<Fault> faults;			//故障码集合
	private List<DataFlow> dataflows;	//数据流集合
	
	private int fault_num;				//错误码数量
	private Car car;
	
	private int box_id;				//盒子id

	public CarReport() {
		faults=new ArrayList<Fault>();
		dataflows=new ArrayList<DataFlow>();
	}

	
	public CarReport(JSONObject json) {
		// TODO Auto-generated constructor stub
		try {
			this.dreport_id=json.getInt("dreport_id");
			this.detect_score=json.getInt("detect_score");
			this.detect_conclusion=json.getString("detect_conclusion");
			this.detect_time=json.getString("detect_time").substring(0, 10);
			JSONArray faults=json.getJSONArray("faults");
			JSONArray dataflows=json.getJSONArray("dataflows");
			List<Fault>f=new ArrayList<Fault>();
			List<DataFlow>d=new ArrayList<DataFlow>();
			for (int i = 0; i < faults.length(); i++) {
				f.add(new Fault(faults.getJSONObject(i),0));
			}
			for (int i = 0; i < dataflows.length(); i++) {
				d.add(new DataFlow(dataflows.getJSONObject(i),0));
			}
			
			this.faults=f;
			this.dataflows=d;
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int getDreport_id() {
		return dreport_id;
	}

	public void setDreport_id(int dreport_id) {
		this.dreport_id = dreport_id;
	}

	public String getDetect_time() {
		return detect_time;
	}

	public void setDetect_time(String detect_time) {
		this.detect_time = detect_time;
	}

	public int getDetect_score() {
		return detect_score;
	}

	public void setDetect_score(int detect_score) {
		this.detect_score = detect_score;
	}

	public String getDetect_conclusion() {
		return detect_conclusion;
	}

	public void setDetect_conclusion(String detect_conclusion) {
		this.detect_conclusion = detect_conclusion;
	}

	public List<Fault> getFaults() {
		return faults;
	}

	public void setFaults(List<Fault> faults) {
		this.faults = faults;
	}

	public List<DataFlow> getDataflows() {
		return dataflows;
	}

	public void setDataflows(List<DataFlow> dataflows) {
		this.dataflows = dataflows;
	}

	public int getFault_num() {
		return fault_num;
	}

	public void setFault_num(int fault_num) {
		this.fault_num = fault_num;
	}

	public int getBox_id() {
		return box_id;
	}

	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "DetectReport [dreport_id=" + dreport_id + ", detect_time=" + detect_time + ", detect_score="
				+ detect_score + ", detect_conclusion=" + detect_conclusion + ", faults=" + faults + ", dataflows="
				+ dataflows + ", fault_num=" + fault_num + ", box_id=" + box_id + "]";
	}
	
	
	
	
}
