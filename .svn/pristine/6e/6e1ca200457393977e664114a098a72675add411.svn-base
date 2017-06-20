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
import com.Entity.DataFlow;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.ToastUtil;

public class DataFlowDetail extends Activity {

	private LinearLayout lin_back;
	private TextView tv_name, tv_value, tv_dataflowexplain, tv_maintainsug;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_dataflowdetail);

		initView();
		RequestData();
		setListen();

	}

	private void initView() {
		// TODO Auto-generated method stub
		lin_back = (LinearLayout) findViewById(R.id.lin_back);
		tv_name = (TextView) findViewById(R.id.tv_name);
		tv_value = (TextView) findViewById(R.id.tv_value);
		tv_dataflowexplain = (TextView) findViewById(R.id.tv_dataflowexplain);
		tv_maintainsug = (TextView) findViewById(R.id.tv_maintainsug);

	}

	@SuppressWarnings("unchecked")
	private void RequestData() {
		// TODO Auto-generated method stub
		Intent intent = getIntent();
		int dataflow_id = intent.getIntExtra("dataflowid", -1);
		HashMap<String, String> idtakjson = new UserEntity()
				.getIdTaken(DataFlowDetail.this);
		idtakjson.put("dataflow_id", dataflow_id + "");
		new HttpTask(datraflowdetailCallback, MyURL.DATAFLOWDETAIL,DataFlowDetail.this)
				.execute(idtakjson);
	}

	private HttpCallback datraflowdetailCallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2dataflowdetail(json);
			if (entity.isFlag()) {
				DataFlow dataflow = (DataFlow) entity.getData();
				tv_name.setText(dataflow.getName());
				tv_value.setText(dataflow.getValue());
				tv_dataflowexplain.setText(dataflow.getDesc());
				tv_maintainsug.setText(dataflow.getMaintain_sug());

			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(DataFlowDetail.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(DataFlowDetail.this);
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
