package com.IntimateCarCare;

import java.util.HashMap;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.Adapter.ActivityConsultListAdapter;
import com.Bll.CBLL;
import com.Entity.CustService;
import com.Entity.ProblemSet;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.ToastUtil;

public class ConsultActivity extends Activity {

	private LinearLayout lin_back;
	private ListView listview;
	private ImageView img_servicephone;
	private ActivityConsultListAdapter adapter;
	private ProblemSet list;
	private CustService service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_consult);

		initView();
		RequestData();
		setListen();

	}

	private void initView() {
		// TODO Auto-generated method stub
		lin_back = (LinearLayout) findViewById(R.id.lin_back);
		listview = (ListView) findViewById(R.id.listview);
		img_servicephone = (ImageView) findViewById(R.id.img_servicephone);
	}

	@SuppressWarnings("unchecked")
	private void RequestData() {
		// TODO Auto-generated method stub
		HashMap<String, String> idtakjson = new UserEntity()
				.getIdTaken(ConsultActivity.this);
		new HttpTask(consultCallback, MyURL.CONSULTLIST,ConsultActivity.this).execute(idtakjson);
	}

	private HttpCallback consultCallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cBllUser = CBLL.getInstance();
			JSONEntity entity = cBllUser.json2consultlist(json);
			if (entity.isFlag()) {
				list = (ProblemSet) entity.getData();
				service = (CustService) entity.getData1();

				adapter = new ActivityConsultListAdapter(ConsultActivity.this,
						list);
				listview.setAdapter(adapter);

			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(ConsultActivity.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(ConsultActivity.this);
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

		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ConsultActivity.this,
						ConsultDetailActivity.class);
				intent.putExtra("problemid", list.getItem(position)
						.getProblem_id());
				startActivity(intent);
			}
		});

		img_servicephone.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String phone_number = service.getTel().trim();
				if (phone_number != null && !phone_number.equals("")) {
					// 调用系统的拨号服务实现电话拨打功能
					// 封装一个拨打电话的intent，并且将电话号码包装成一个Uri对象传入
					Intent intent = new Intent(Intent.ACTION_DIAL, Uri
							.parse("tel:" + phone_number));
					startActivity(intent);
				}
			}
		});

	}
}
