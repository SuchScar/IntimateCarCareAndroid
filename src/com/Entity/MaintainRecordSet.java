package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class MaintainRecordSet {
private List<MaintainRecord> MaintainRecordList = new ArrayList<MaintainRecord>();
	
	public MaintainRecordSet(List<MaintainRecord> MaintainRecordlist){
		this.MaintainRecordList = MaintainRecordlist;
	}
	
	
	public int getSize(){
		return MaintainRecordList.size();
	}


	public List<MaintainRecord> getMaintainRecordList() {
		return MaintainRecordList;
	}


	public void setMaintainRecordList(List<MaintainRecord> maintainRecordList) {
		MaintainRecordList = maintainRecordList;
	}


	public MaintainRecord getItem(int arg0){
		return MaintainRecordList.get(arg0);
	}
}
