package com.Entity;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.tool.SPUtils;

/**
 * @author:LinHaiZhen
 * @date:2016年11月21日 下午8:44:23
 * @Description:年检记录
 */
public class AnnualInspection {

	private int arecord_id;			//年检记录id
	private String this_time;		//本次年检时间
	private String next_time;		//下次年检时间
	private int money;			//年检费用
	private String remark_c;		//备注文本
	
	private String cre_time;		//创建日期
	private int car_id;				//车子id
	
	public int getArecord_id() {
		return arecord_id;
	}
	public AnnualInspection(){}
	  public HashMap<String, String>addannual(Context context,String nowdata,String nextdata,int Money,String remark_c){
	    	HashMap<String, String>map=new HashMap<String, String>();
	    	map.put("this_time", nowdata);
	    	map.put("next_time", nextdata);
	    	map.put("money", Money+"");
	    	map.put("remark_c",remark_c);
	    	map.put("arecord_id", SPUtils.get(context, "arecord_id", -1)+"");
	    	map.put("user_id", SPUtils.get(context, "userId", -1).toString());
	    	map.put("tokens",SPUtils.get(context, "userTokens", "").toString());
			return map;  	
	    }
	  
		public AnnualInspection(String string1,String string2,int string3,String string4){
			
			this.this_time=string1;
			this.next_time=string2;
			this.money=string3;	
			this.remark_c=string4;
			
		}
	
	public AnnualInspection(JSONObject json){	
		try {
			this.arecord_id=json.getInt("arecord_id");
			this.cre_time=json.getString("cre_time");
			this.next_time=json.getString("next_time");
			this.remark_c=json.getString("remark_c");
			this.money=json.getInt("money");
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setArecord_id(int arecord_id) {
		this.arecord_id = arecord_id;
	}
	public String getThis_time() {
		return this_time;
	}
	public void setThis_time(String this_time) {
		this.this_time = this_time;
	}
	public String getNext_time() {
		return next_time;
	}
	public void setNext_time(String next_time) {
		this.next_time = next_time;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getRemark_c() {
		return remark_c;
	}
	public void setRemark_c(String remark_c) {
		this.remark_c = remark_c;
	}
	public String getCre_time() {
		return cre_time;
	}
	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	
	
	
	
}
