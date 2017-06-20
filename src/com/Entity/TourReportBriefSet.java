package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class TourReportBriefSet {
private List<TourReportBrief> TourReportBriefList = new ArrayList<TourReportBrief>();
	
	public TourReportBriefSet(List<TourReportBrief> TourReportBrieflist){
		this.TourReportBriefList = TourReportBrieflist;
	}
	
	
	public TourReportBriefSet() {}


	public int getSize(){
		return TourReportBriefList.size();
	}


	public List<TourReportBrief> getTourReportBriefList() {
		return TourReportBriefList;
	}


	public void setTourReportBriefList(List<TourReportBrief> tourReportBriefList) {
		TourReportBriefList = tourReportBriefList;
	}


	public TourReportBrief getItem(int arg0){
		return TourReportBriefList.get(arg0);
	}
}
