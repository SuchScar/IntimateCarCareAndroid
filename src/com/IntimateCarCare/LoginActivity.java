package com.IntimateCarCare;

import java.util.HashMap;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Bll.CBLL;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.LoadingDialog;
import com.tool.MyURL;
import com.tool.SPUtils;
import com.tool.ToastUtil;

public class LoginActivity extends Activity{

	private EditText et_useraccount,et_userpassword;
	private LinearLayout lin_login;
	private TextView tv_register,tv_findpassword;
	
	
	//账号和密码
	private String userAccount;
	private String userPwd;
	private LoadingDialog dialog;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        
        initView();
        setListen();
		
	}


	private void initView() {
		// TODO Auto-generated method stub
		et_useraccount=(EditText) findViewById(R.id.et_useraccount);
		et_userpassword=(EditText) findViewById(R.id.et_userpassword);
		lin_login=(LinearLayout) findViewById(R.id.lin_login);
		tv_register=(TextView) findViewById(R.id.tv_register);
		tv_findpassword=(TextView) findViewById(R.id.tv_findpassword);
		
	}
	
	private HttpCallback httpCallback = new HttpCallback() {
		
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			//dialog.dismiss();
			
			CBLL cBllUser = CBLL.getInstance();
			JSONEntity entity = cBllUser.json2login(json);
			
			if(entity.isFlag()){
				
				UserEntity UserEntity = (UserEntity) entity.getData();
				UserEntity.setUser_account(userAccount);
				UserEntity.setPassword(userPwd);
				//保存账号密码等信息，用于自动登录
				UserEntity.saveUserLogin(LoginActivity.this, UserEntity);
				//跳转到主页面
				Intent intent = new Intent(LoginActivity.this,MainActivity.class);
				startActivity(intent);
				SPUtils.put(LoginActivity.this,"logintag", true);
				finish();
				
			}else{
				int msg=entity.getMessage();
				if(msg==MyURL.MSG_OTHERS_ERROR){
					ToastUtil.show(LoginActivity.this, "登录失败");
				}else if(msg==MyURL.MSG_PWD_ERROR){
					ToastUtil.show(LoginActivity.this, "用户名或密码错误，请重新输入");
				}
			}
			
		}
	};
	


	private void setListen() {
		// TODO Auto-generated method 
		tv_register.setOnClickListener(new OnClickListener() {
			
			@Override 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		lin_login.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 userAccount = et_useraccount.getText().toString();
				 userPwd = et_userpassword.getText().toString();
				
				if(!userAccount.equals("") && !userPwd.equals("")){
					
					//if(network!=null){
					HashMap<String, String> loginjson=new UserEntity().toLoginJson(userAccount, userPwd);
						
						new HttpTask(httpCallback, MyURL.LOGIN,LoginActivity.this).execute(loginjson);
//					ProgressDialogUtil.ShowProgressBarDialog(LoginActivity.this, 
//							"正在登陆中");}
					
//					dialog = new LoadingDialog(LoginActivity.this, R.layout.view_tips_loading);
//					dialog.setCancelable(true);
//					dialog.setCanceledOnTouchOutside(false);
//					dialog.show();
			       // }
					
//					else{
//						ToastUtil.show(LoginActivity.this,"网络未连接，请检查您的网络");
//					}
				}
				else{
					ToastUtil.show(LoginActivity.this, "请输入用户名和密码");
				}
				
			
			}
		});
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
