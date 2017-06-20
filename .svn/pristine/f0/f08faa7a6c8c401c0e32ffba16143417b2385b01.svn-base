package com.IntimateCarCare;

import java.util.HashMap;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Bll.CBLL;
import com.Entity.Problem;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.ToastUtil;

public class ConsultDetailActivity extends Activity{

	private LinearLayout lin_back;
	private TextView tv_title,tv_content,tv_answer,tv_suggestion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_consultdetail);
        
        initView();
        RequestData();
        setListen();
        
	}

	private void initView() {
		// TODO Auto-generated method stub
		lin_back=(LinearLayout) findViewById(R.id.lin_back);
		tv_title=(TextView) findViewById(R.id.tv_title);
		tv_content=(TextView) findViewById(R.id.tv_content);
		tv_answer=(TextView) findViewById(R.id.tv_answer);
		tv_suggestion=(TextView) findViewById(R.id.tv_suggestion);
	}

	@SuppressWarnings("unchecked")
	private void RequestData() {
		// TODO Auto-generated method stub
		Intent intent=getIntent();
		HashMap<String, String> idtakjson=new UserEntity().getIdTaken(ConsultDetailActivity.this);
		int i =intent.getIntExtra("problemid", -1);
		if(i!=-1){
			idtakjson.put("problem_id", i+"");
			new HttpTask(consultdetailCallback, MyURL.CONSULTDETAIL,ConsultDetailActivity.this).execute(idtakjson);
		}else{
			ToastUtil.show(ConsultDetailActivity.this,"出错啦");
		}
		
	}
	
	private HttpCallback consultdetailCallback = new HttpCallback() {
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cBllUser = CBLL.getInstance();
			JSONEntity entity = cBllUser.json2consultdetail(json);
			if(entity.isFlag()){
				Problem problem=(Problem) entity.getData();
				tv_title.setText(problem.getTitle());
				tv_content.setText(problem.getContent());
				tv_answer.setText(problem.getAnswer());
				tv_suggestion.setText(problem.getSuggestion());
				
			}else{
				if(entity.getMessage()==MyURL.MSG_OTHERS_ERROR){
					ToastUtil.show(ConsultDetailActivity.this, "获取失败");
				}else if(entity.getMessage()==MyURL.MSG_TOKENS_ERROR){
					//重启app
					MainActivity.restartApplication(ConsultDetailActivity.this);
				}
			}
		}
	};

	private void setListen() {
		// TODO Auto-generated method stub
		lin_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
	
}
