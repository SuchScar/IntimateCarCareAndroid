package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class CustService {

	private int service_id;			//客服id
	private String tel;				//客户联系电话
	private String business_scope;	//业务范围
	
	
	public CustService(JSONObject obj) {
		// TODO Auto-generated constructor stub
		try {
			this.service_id=obj.getInt("service_id");
			this.tel=obj.getString("tel");
			this.business_scope=obj.getString("business_scope");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBusiness_scope() {
		return business_scope;
	}
	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}
	
	
}
