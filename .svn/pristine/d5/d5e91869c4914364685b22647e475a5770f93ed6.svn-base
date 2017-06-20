package com.IntimateCarCare;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class AboutSoftSetting extends Activity{
 private RelativeLayout rel_gongneng,rel_banben;
 private LinearLayout lin_back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_softsetting);
		findview();
		setlisten();
	}
	private void findview() {
		// TODO Auto-generated method stub
		lin_back=(LinearLayout) findViewById(R.id.lin_back);
		rel_gongneng=(RelativeLayout) findViewById(R.id.rel_gongneng);
		rel_banben=(RelativeLayout) findViewById(R.id.rel_banben);
	}
	private void setlisten() {
		// TODO Auto-generated method stub
		lin_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			finish();	
			}
		});
		rel_banben.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(AboutSoftSetting.this,EditionActivity.class);
				startActivity(intent);
			}
		});
		rel_gongneng.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent=new Intent(AboutSoftSetting.this,FunctionIntroduction.class);
			startActivity(intent);
			}
		});
	}
}
