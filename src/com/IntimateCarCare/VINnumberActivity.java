package com.IntimateCarCare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;

public class VINnumberActivity  extends Activity{

	private ImageView img_commitvin;
	private EditText ed_vin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_vinnumber);
		
		initview();
		setListen();
	}
	private void initview() {
		// TODO Auto-generated method stub
		ed_vin=(EditText)findViewById(R.id.ed_vin);
		img_commitvin=(ImageView)findViewById(R.id.img_commitvin);
	}
	private void setListen() {
		// TODO Auto-generated method stub
	
		img_commitvin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  Intent intent = new Intent();  
				  intent.putExtra("vinnum",ed_vin.getText().toString());
				 			
	              setResult(RESULT_OK, intent); 
				finish();
			}
		});
	}
}
