package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class RedRecordSet {
private List<RedRecord> RedRecordList = new ArrayList<RedRecord>();
	
	public RedRecordSet(List<RedRecord> RedRecordlist){
		this.RedRecordList = RedRecordlist;
	}
	
	
	public int getSize(){
		return RedRecordList.size();
	}

	public List<RedRecord> getRedRecordList() {
		return RedRecordList;
	}


	public void setRedRecordList(List<RedRecord> redRecordList) {
		RedRecordList = redRecordList;
	}


	public RedRecord getItem(int arg0){
		return RedRecordList.get(arg0);
	}
}
