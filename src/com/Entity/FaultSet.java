package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class FaultSet {
private List<Fault> FaultList = new ArrayList<Fault>();
	
	public FaultSet(List<Fault> List){
		this.FaultList = List;
	}
	
	public int getSize(){
		return FaultList.size();
	}


	public Fault getItem(int arg0){
		return FaultList.get(arg0);
	}

	public List<Fault> getFaultList() {
		return FaultList;
	}

	public void setFaultList(List<Fault> faultList) {
		FaultList = faultList;
	}
	
}
