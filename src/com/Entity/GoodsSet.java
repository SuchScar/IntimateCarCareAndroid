package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsSet {
private List<Goods> GoodsList = new ArrayList<Goods>();
	
	public GoodsSet(List<Goods> Goodslist){
		this.GoodsList = Goodslist;
	}
	
	
	public int getSize(){
		return GoodsList.size();
	}


	public List<Goods> getGoodsList() {
		return GoodsList;
	}


	public void setGoodsList(List<Goods> goodsList) {
		GoodsList = goodsList;
	}


	public Goods getItem(int arg0){
		return GoodsList.get(arg0);
	}
}
