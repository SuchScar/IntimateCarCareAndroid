package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class RemindSet {
private List<Remind> RemindList = new ArrayList<Remind>();
	
	public RemindSet(List<Remind> Remindlist){
		this.RemindList = Remindlist;
	}
	
	
	public RemindSet() {
	}

	public int getSize(){
		return RemindList.size();
	}

	public List<Remind> getRemindList() {
		return RemindList;
	}


	public void setRemindList(List<Remind> remindList) {
		RemindList = remindList;
	}


	public Remind getItem(int arg0){
		return RemindList.get(arg0);
	}
}
