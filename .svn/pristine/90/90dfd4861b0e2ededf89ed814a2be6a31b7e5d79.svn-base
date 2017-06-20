package com.IntimateCarCare;

import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.Adapter.ActivityRedRecordAdapter;
import com.Bll.CBLL;
import com.Entity.MyRedInfo;
import com.Entity.RedRecord;
import com.Entity.RedRecordSet;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.ToastUtil;

public class MyRedPaprerActivity extends Activity {

	private LinearLayout lin_back;
	private TextView tv_rednum, tv_getnum, tv_usenum;
	private PullToRefreshListView refreshlistview;

	private ActivityRedRecordAdapter adapter;
	private HashMap<String, String> map;
	private RedRecordSet list;
	private int PAGE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_redpaper);

		initView();
		RequestData();
		setListen();

	}

	@SuppressWarnings("unchecked")
	private void RequestData() {
		// TODO Auto-generated method stub
		map = new UserEntity().getIdTaken(MyRedPaprerActivity.this);
		// 获取红包余额，已使用等
		new HttpTask(myredpaperinfoCallback, MyURL.REDINFO,MyRedPaprerActivity.this).execute(map);
		map.put("num", "10");
		map.put("page", "1");
		// 获取红包列表
		new HttpTask(myredpaperlistCallback, MyURL.REDLIST,MyRedPaprerActivity.this).execute(map);
	}

	// 获取更多分页数据
	@SuppressWarnings("unchecked")
	private void Requestmore(int i) {
		map.put("page", i + "");
		new HttpTask(requestmoreCallback, MyURL.REDLIST,MyRedPaprerActivity.this).execute(map);
	}

	private HttpCallback myredpaperinfoCallback = new HttpCallback() {
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2myredinfo(json);
			if (entity.isFlag()) {
				MyRedInfo info = (MyRedInfo) entity.getData();
				tv_rednum.setText(info.getRednum() + "");
				tv_getnum.setText(info.getGetnum() + "元");
				tv_usenum.setText(info.getUsenum() + "元");
			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyRedPaprerActivity.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyRedPaprerActivity.this);
				}
			}
		}
	};

	private HttpCallback myredpaperlistCallback = new HttpCallback() {
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2myredlist(json);
			if (entity.isFlag()) {
				list = (RedRecordSet) entity.getData();
				adapter = new ActivityRedRecordAdapter(
						MyRedPaprerActivity.this, list);
				refreshlistview.setAdapter(adapter);
				refreshlistview.onRefreshComplete();
				if (refreshlistview.getMode() == Mode.PULL_FROM_START) {
					refreshlistview.setMode(Mode.BOTH);// 可上拉下拉
				}

			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyRedPaprerActivity.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyRedPaprerActivity.this);
				}
			}
		}
	};

	private HttpCallback requestmoreCallback = new HttpCallback() {
		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2myredlist(json);
			if (entity.isFlag()) {
				RedRecordSet l = (RedRecordSet) entity.getData();
				if (PAGE > (Integer) entity.getData1()) {// 判断是否是最后一页
					refreshlistview.onRefreshComplete();
					ToastUtil.show(MyRedPaprerActivity.this, "没有更多");
					refreshlistview.setMode(Mode.PULL_FROM_START);// 只能下拉刷新
				} else {// 还有更多数据
					List<RedRecord> li = list.getRedRecordList();
					li.addAll(l.getRedRecordList());
					list = new RedRecordSet(li);
					adapter.notifyDataSetChanged();
					refreshlistview.onRefreshComplete();
				}
			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyRedPaprerActivity.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyRedPaprerActivity.this);
				}
			}
		}
	};

	private void initView() {
		// TODO Auto-generated method stub
		lin_back = (LinearLayout) findViewById(R.id.lin_back);
		tv_rednum = (TextView) findViewById(R.id.tv_rednum);
		tv_getnum = (TextView) findViewById(R.id.tv_getnum);
		tv_usenum = (TextView) findViewById(R.id.tv_usenum);
		refreshlistview = (PullToRefreshListView) findViewById(R.id.refreshlistview);
		refreshlistview.setMode(Mode.BOTH);

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

		refreshlistview
				.setOnRefreshListener(new OnRefreshListener2<ListView>() {

					@Override
					public void onPullDownToRefresh(
							PullToRefreshBase<ListView> refreshView) {
						// TODO Auto-generated method stub
						RequestData();
						PAGE = 1;
					}

					@Override
					public void onPullUpToRefresh(
							PullToRefreshBase<ListView> refreshView) {
						// TODO Auto-generated method stub
						PAGE++;
						Requestmore(PAGE);
					}

				});

	}

}
