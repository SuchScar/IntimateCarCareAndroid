package com.Entity;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import com.tool.SPUtils;

import android.content.Context;


/**
 * @author ZL
 *
 */
public class UserEntity {

	/*---------------基本属性---------------*/
	private int user_id;        	//用户id
	private String user_account;    //手机号（账号）
	private String password;    	//密码
	private String nick;        	//昵称
	private String sex;        	 	//性别
	private String drive_time;  	//驾驶证注册日期
	private String drive_age;   	//驾龄
	private String signature;   	//个性签名
	private String contact;     	//联系方式
	private String age;         	//年龄
	private String head_pic;    	//头像
	private String area;            //地区
	
	
	/*--------------用户当前状态--------------*/
	private String tokens;      	//用户令牌
	
	public UserEntity(){}
	
	public UserEntity(JSONObject mUserJS,int i) {
		// TODO Auto-generated constructor stub
		try {
			if(i==0){//获取id与令牌
				this.user_id=mUserJS.getInt("user_id");
				this.tokens=mUserJS.getString("tokens");
			}else if(i==1){//获取用户详细信息
				this.sex=mUserJS.getString("sex");
				this.head_pic=mUserJS.getString("head_pic");
				this.contact=mUserJS.getString("contact");
				this.user_account=mUserJS.getString("user_account");
				this.nick=mUserJS.getString("nick");
				this.signature=mUserJS.getString("signature");
				this.age=mUserJS.getString("age");
				this.drive_time=mUserJS.getString("drive_time");
				this.drive_age=mUserJS.getString("drive_age");
				this.area=mUserJS.getString("area");
				
			}
			
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HashMap<String, String> toLoginJson(String user_account, String password) {
		// TODO Auto-generated method stub
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("user_account", user_account);
		map.put("password",password);
		return map;
	}
	
	public static HashMap<String, String> toRegisterJson(String account,
			String passward) {
		// TODO Auto-generated method stub
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("user_account", account);
		map.put("password",passward);
		return map;
	}
	
	
	public void saveUserLogin(Context context, UserEntity userEntity) {
		// TODO Auto-generated method stub
		SPUtils.put(context, "userId", userEntity.getUser_id());
		SPUtils.put(context, "userAccount", userEntity.getUser_account());
		SPUtils.put(context, "userPassword", userEntity.getPassword());
		SPUtils.put(context, "userTokens", userEntity.getTokens());
	}
	
	public void saveUserInfo(Context context, UserEntity userEntity) {
		
		SPUtils.put(context, "userNickname", userEntity.getNick());
		
		//SPUtils.put(context, "userIntegral", userEntity.getUserIntegral());
		SPUtils.put(context, "userPicture", userEntity.getHead_pic());

	}
	//获取id和taken
	public HashMap<String, String> getIdTaken(Context context){
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("user_id", SPUtils.get(context, "userId", -1).toString());
		map.put("tokens",SPUtils.get(context, "userTokens", "").toString());
		return map; 
	}
	
	//获取id和taken
	public HashMap<String, String> changepassword(String UserId,String Tokens,String UserPassword){
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("user_password",UserPassword); 
		return map; 
	}

	 //修改昵称
	public  HashMap<String, String>changenicheng(String UserId,String Tokens,String Name,int i){
		HashMap<String, String> map=new HashMap<String, String>();
			
	if(i==1){		  //修改昵称
			map.put("user_id", UserId);
			map.put("tokens",Tokens);
			map.put("nick",Name); 	
		}
	else if(i==2){  //修改性别
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("sex",Name); 
	}
	else if(i==3){ //修改签名
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("signature",Name); 
	}
	else if(i==4){ //修改手机号
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("contact",Name); 
	}
	else if(i==5){//驾龄
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("drive_age",Name); 
	}
	else if(i==6){//年龄
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("age",Name); 
	}
	else if(i==7){//驾驶证注册日期
		map.put("user_id", UserId);
		map.put("tokens",Tokens);
		map.put("drive_time",Name); 
	}
	return map; 
		}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDrive_time() {
		return drive_time;
	}

	public void setDrive_time(String drive_time) {
		this.drive_time = drive_time;
	}

	public String getDrive_age() {
		return drive_age;
	}

	public void setDrive_age(String drive_age) {
		this.drive_age = drive_age;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHead_pic() {
		return head_pic;
	}

	public void setHead_pic(String head_pic) {
		this.head_pic = head_pic;
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String tokens) {
		this.tokens = tokens;
	}

	

	

	
}
