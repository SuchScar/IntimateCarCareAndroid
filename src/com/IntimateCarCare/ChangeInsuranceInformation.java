package com.IntimateCarCare;

import java.util.Calendar;
import java.util.HashMap;

import org.json.JSONObject;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.Bll.CBLL;
import com.Entity.InsuranceRecord;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.SPUtils;
import com.tool.ToastUtil;

public class ChangeInsuranceInformation extends Activity{
 
	private EditText edt_danhao,edt_danwei,edt_feiyong,edt_beizhu;
	private RelativeLayout rel_data;
	private ImageView img_commit,img_back;
	private TextView tv_data;
	private String danhao,danwei,feiyong,beizhu,data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_changeinsurancerecords);
	
		findview();
		setListen();
	
	}

	

	private void setListen() {
		// TODO Auto-generated method stub
	img_commit.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				danhao=edt_danhao.getText().toString();
				danwei=edt_danwei.getText().toString();
				feiyong=edt_feiyong.getText().toString();
				beizhu=edt_beizhu.getText().toString();
				data=tv_data.getText().toString();
				
		HashMap<String, String>changeinsurance=new InsuranceRecord().changeinsurance
		(ChangeInsuranceInformation.this,danhao,danwei,data,Integer.parseInt(feiyong),beizhu);		
		new HttpTask(changeinsurancecallback, MyURL.CHANGEINSURANCERECORD,ChangeInsuranceInformation.this).execute(changeinsurance);
		   System.out.println( SPUtils.get(ChangeInsuranceInformation.this, "irecordid", -1).toString()+"PPPPPPPPPPPPPPPP");
			}
		});
	rel_data.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			final Calendar cal = Calendar.getInstance();
			final DatePickerDialog mDialog = new DatePickerDialog(
					ChangeInsuranceInformation.this, null, cal.get(Calendar.YEAR), cal
							.get(Calendar.MONTH), cal
							.get(Calendar.DAY_OF_MONTH));

			// 手动设置按钮
			mDialog.setButton(DialogInterface.BUTTON_POSITIVE, "完成",
					new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog,
								int which) {
							// 通过mDialog.getDatePicker()获得dialog上的DatePicker组件，然后可以获取日期信息
							DatePicker datePicker = mDialog.getDatePicker();
							cal.set(datePicker.getYear(),
									datePicker.getMonth(),
									datePicker.getDayOfMonth());
							tv_data.setText(DateFormat.format(
									"yyy-MM-dd", cal));
						}
					});
			// 取消按钮，如果不需要直接不设置即可
			mDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消",
					new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog,
								int which) {
							System.out.println("BUTTON_NEGATIVE~~");
						}
					});
			mDialog.show();
		
		
		}
	});
	}

	HttpCallback changeinsurancecallback=new HttpCallback() {
		
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub

			CBLL cbll =CBLL.getInstance();
			JSONEntity entity=cbll.json2addinsurance(json);
			if(entity.isFlag()){	
				
				Intent intent =new Intent();		
				ToastUtil.show(ChangeInsuranceInformation.this,"修改成功");
				setResult(2, intent);  				 
		        finish();
			}
			else{
				ToastUtil.show(ChangeInsuranceInformation.this,"修改失败");
				}
		
		}
	};
	private void findview() {
		// TODO Auto-generated method stub
		rel_data=(RelativeLayout)findViewById(R.id.rel_data);
		tv_data=(TextView)findViewById(R.id.tv_data);
		edt_danhao=(EditText)findViewById(R.id.edt_danhao);
		edt_danwei=(EditText)findViewById(R.id.edt_danwei);
		edt_feiyong=(EditText)findViewById(R.id.edt_feiyong);
		edt_beizhu=(EditText)findViewById(R.id.edt_beizhu);
		img_commit=(ImageView)findViewById(R.id.img_commit);
		img_back=(ImageView)findViewById(R.id.img_back);
		
	}
}
