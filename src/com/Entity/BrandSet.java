package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class BrandSet {
private List<Brand> BrandList = new ArrayList<Brand>();
	
	public BrandSet(List<Brand> Brandlist){
		this.BrandList = Brandlist;
	}
	
	
	public int getSize(){
		return BrandList.size();
	}
	

	public List<Brand> getBrandList() {
		return BrandList;
	}


	public void setBrandList(List<Brand> brandList) {
		BrandList = brandList;
	}


	public Brand getItem(int arg0){
		return BrandList.get(arg0);
	}
}
