package com.IntimateCarCare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.Adapter.ActivityinsurancedateAdapter;
import com.Bll.CBLL;
import com.Entity.InsuranceRecord;
import com.Entity.InsuranceRecordSet;
import com.Entity.Merchant;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.SPUtils;

public class InsuranceDate extends Activity{
   
  private ImageView img_commit;
  private ActivityinsurancedateAdapter adapter;
  private InsuranceRecordSet list;
  private LinearLayout lin_back;
  private ListView listview;
  private String danhao,danwei,feiyong,beizhu,shijian;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_insurancedate);
		
		initview();
		setlisten();
		RequestData();
	}
	
	     @SuppressWarnings("unchecked")
		private void RequestData() {
		// TODO Auto-generated method stub
	    HashMap<String, String> getinsurancedate = new Merchant().getmerchant
	    (SPUtils.get(InsuranceDate.this, "userId", -1).toString(),SPUtils.get(InsuranceDate.this, "userTokens", "").toString());
		new HttpTask(myinsuranceCallback, MyURL.INSURANCERECORD,InsuranceDate.this).execute(getinsurancedate);
	}
   
	HttpCallback myinsuranceCallback  =new HttpCallback() {
		
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll= CBLL.getInstance();
			JSONEntity entity=cbll.json2Insurancedate(json);
			if(entity.isFlag()){
				InsuranceRecordSet insurancelist =(InsuranceRecordSet) entity.getData();
				List<InsuranceRecord>l=new ArrayList<InsuranceRecord>();
				for(int i=0;i<insurancelist.getSize();i++){
					InsuranceRecord insurlist=insurancelist.getItem(i);
					l.add(insurlist);
					list=new InsuranceRecordSet(l);
					adapter = new ActivityinsurancedateAdapter(InsuranceDate.this, list);
					listview.setAdapter(adapter);
				}
			}
		}
	};       
	
	
    HttpCallback changeCallback=new HttpCallback() {
		
		@Override
		public void getResult(JSONObject json) {
 			// TODO Auto-generated method stub
			CBLL cbll= CBLL.getInstance();
			JSONEntity entity=cbll.json2Insurancedate(json);
			if(entity.isFlag()){
				list=new InsuranceRecordSet();
				list =(InsuranceRecordSet) entity.getData();
				System.out.println("1111111111111111111111d"+list.getSize());
//				List<InsuranceRecord>l=new ArrayList<InsuranceRecord>();
//				for(int i=0;i<insurancelist.getSize();i++){
//					InsuranceRecord insurlist=insurancelist.getItem(i);
//					l.add(insurlist);
//					
//				}
			//	list=new InsuranceRecordSet(l);
				/*	adapter = new ActivityinsurancedateAdapter(InsuranceDate.this, list);
					listview.setAdapter(adapter);*/
					adapter.notifyDataSetChanged();
			}
		}
	};
		@SuppressWarnings("unchecked")
		@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			// TODO Auto-generated method stub
			switch (requestCode) {

			case 2:
				if(resultCode==2){	
					
		// HashMap<String, String> getinsurancedate = new Merchant().getmerchant
		//(SPUtils.get(InsuranceDate.this, "userId", -1).toString(),SPUtils.get(InsuranceDate.this, "userTokens", "").toString(),1,10);		
		//new HttpTask(changeCallback, MyURL.INSURANCERECORD).execute(getinsurancedate);		
			RequestData();
				}
				break;
	
			case 1:
				if(resultCode==RESULT_OK){
					danhao=data.getStringExtra("ch_danhao");
					danwei=data.getStringExtra("ch_danwei");
					feiyong=data.getStringExtra("ch_feiyong");
					beizhu=data.getStringExtra("ch_beizhu");
					shijian=data.getStringExtra("ch_shijian");
					System.out.println("LLLLLLLLL"+danwei);
					if(list==null){
						List<InsuranceRecord>l=new ArrayList<InsuranceRecord>();		
						l.add(new InsuranceRecord(danhao,danwei,shijian,Integer.parseInt(feiyong),beizhu));
						list=new InsuranceRecordSet(l);	
						adapter.notifyDataSetChanged();
					}else{
					  //获取之前的List数据
						List<InsuranceRecord>ll=list.getInsuranceRecordList();
						ll.add(new InsuranceRecord(danhao,danwei,shijian,Integer.parseInt(feiyong),beizhu));	
						list=new InsuranceRecordSet(ll);	
					//	adapter = new ActivityinsurancedateAdapter(InsuranceDate.this, list);
						adapter.notifyDataSetChanged();
					
					}
						
				}
				break;

			default:
				break;
			}
		}
	
	private void initview() {
		// TODO Auto-generated method stub
		listview=(ListView)findViewById(R.id.listview);
		img_commit=(ImageView)findViewById(R.id.img_commit);
		lin_back=(LinearLayout)findViewById(R.id.lin_back);
	}
	private void setlisten() {
		// TODO Auto-generated method stub
		img_commit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent =new Intent(InsuranceDate.this,AddInsuranceRecords.class);	
			startActivityForResult(intent, 1);
			}
		});
		lin_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		listview.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
			
		     System.out.println("IIIIIIIIIII"+list.getItem(arg2).getIrecord_id());   
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
