package com.IntimateCarCare;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.tool.ToastUtil;

public class ChooseMaintenanceItem extends Activity{

	private CheckBox c11,c12,c13,c14,c15,
					c21,c22,c23,c24,
					c31,c32,c33,
					c41,c42,c43,c44,
					c51,c52,c53,
					c61,c62,c63,c64,c65,c66,c67,
					c71,c72,c73,
					c81,c82;
	private LinearLayout lin_back;
	private ImageView img_commit;
	
	private List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_choosemaintenanceitem);
		
		intView();
		setListen();
		
		
		
	}

	private void intView() {
		// TODO Auto-generated method stub
		lin_back=(LinearLayout) findViewById(R.id.lin_back);
		img_commit=(ImageView) findViewById(R.id.img_commit);
		c11=(CheckBox) findViewById(R.id.checkBox11);
		c12=(CheckBox) findViewById(R.id.checkBox12);
		c13=(CheckBox) findViewById(R.id.checkBox13);
		c14=(CheckBox) findViewById(R.id.checkBox14);
		c15=(CheckBox) findViewById(R.id.checkBox15);
		c21=(CheckBox) findViewById(R.id.checkBox21);
		c22=(CheckBox) findViewById(R.id.checkBox22);
		c23=(CheckBox) findViewById(R.id.checkBox23);
		c24=(CheckBox) findViewById(R.id.checkBox24);
		c31=(CheckBox) findViewById(R.id.checkBox31);
		c32=(CheckBox) findViewById(R.id.checkBox32);
		c33=(CheckBox) findViewById(R.id.checkBox33);
		c41=(CheckBox) findViewById(R.id.checkBox41);
		c42=(CheckBox) findViewById(R.id.checkBox42);
		c43=(CheckBox) findViewById(R.id.checkBox43);
		c44=(CheckBox) findViewById(R.id.checkBox44);
		c51=(CheckBox) findViewById(R.id.checkBox51);
		c52=(CheckBox) findViewById(R.id.checkBox52);
		c53=(CheckBox) findViewById(R.id.checkBox53);
		c61=(CheckBox) findViewById(R.id.checkBox61);
		c62=(CheckBox) findViewById(R.id.checkBox62);
		c63=(CheckBox) findViewById(R.id.checkBox63);
		c64=(CheckBox) findViewById(R.id.checkBox64);
		c65=(CheckBox) findViewById(R.id.checkBox65);
		c66=(CheckBox) findViewById(R.id.checkBox66);
		c67=(CheckBox) findViewById(R.id.checkBox67);
		c71=(CheckBox) findViewById(R.id.checkBox71);
		c72=(CheckBox) findViewById(R.id.checkBox72);
		c73=(CheckBox) findViewById(R.id.checkBox73);
		c81=(CheckBox) findViewById(R.id.checkBox81);
		c82=(CheckBox) findViewById(R.id.checkBox82);
		checkBoxList.add(c11);
		checkBoxList.add(c12);
		checkBoxList.add(c13);
		checkBoxList.add(c14);
		checkBoxList.add(c15);
		checkBoxList.add(c21);
		checkBoxList.add(c22);
		checkBoxList.add(c23);
		checkBoxList.add(c24);
		checkBoxList.add(c31);
		checkBoxList.add(c32);
		checkBoxList.add(c33);
		checkBoxList.add(c41);
		checkBoxList.add(c42);
		checkBoxList.add(c43);
		checkBoxList.add(c44);
		checkBoxList.add(c51);
		checkBoxList.add(c52);
		checkBoxList.add(c53);
		checkBoxList.add(c61);
		checkBoxList.add(c62);
		checkBoxList.add(c63);
		checkBoxList.add(c64);
		checkBoxList.add(c65);
		checkBoxList.add(c66);
		checkBoxList.add(c67);
		checkBoxList.add(c71);
		checkBoxList.add(c72);
		checkBoxList.add(c73);
		checkBoxList.add(c81);
		checkBoxList.add(c82);
		
		
	}


	private void setListen() {
		// TODO Auto-generated method stub
		lin_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		img_commit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				StringBuffer sb = new StringBuffer();
				for(CheckBox box:checkBoxList){
					if(box.isChecked()){
						sb.append(box.getText().toString() + "，");
					}
				}
				if (sb!=null && "".equals(sb.toString())){
					ToastUtil.show(ChooseMaintenanceItem.this,"请至少选择一个");
                }else{
                	String str=sb.toString();
    				str=str.substring(0, str.length()-1);
    				Intent intent=new Intent();
    				intent.putExtra("item",str);
    				setResult(1, intent);
    				finish();
                }
			}
		});
		
	}
	
	
}
