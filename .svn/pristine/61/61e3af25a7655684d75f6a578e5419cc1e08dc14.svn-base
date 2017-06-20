package com.IntimateCarCare;

import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.Adapter.Activitymysettingadapter;
import com.Bll.CBLL;
import com.Entity.Car;
import com.Entity.CarSet;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.CustomDialog;
import com.tool.Dialogaddbox;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.SPUtils;
import com.tool.ToastUtil;

public class MyCarSetting extends Activity {

	private TextView tv_carnumber, tv_carnum, tv_carname, tv_boxnumber;
	private RelativeLayout rel_changenumber, rel_qichepeizhi, rel_buy_dangan,
			rel_zhinenghezi, rel_tiajanche;
	private Dialogaddbox dialog;
	private ImageView img_tianjia2, img_bac, img_delete;
	private Car car;
	private LinearLayout lin_back;
	private ImageView img_tianjia;

	private PopupWindow popupview;
	private CarSet carset;

	private Activitymysettingadapter activityadapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_mycarsetting);
		// Data();
		initview();
		ReastDate();
		setListen();

	}

	@SuppressWarnings("unchecked")
	private void ReastDate() {
		// TODO Auto-generated method stub
		HashMap<String, String> idtakjson = new UserEntity()
				.getIdTaken(MyCarSetting.this);
		// 获取车辆列表
		new HttpTask(carlistCallback, MyURL.CARLIST,MyCarSetting.this).execute(idtakjson);

		int carid = (Integer) SPUtils.get(MyCarSetting.this, "carId", -1);
		idtakjson.put("car_id", carid + "");
		// 获取汽车设置数据
		new HttpTask(carsettingcallback, MyURL.CARSETTINGDATA,MyCarSetting.this)
				.execute(idtakjson);

	}

	private HttpCallback carsettingcallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cBllUser = CBLL.getInstance();
			JSONEntity entity = cBllUser.json2carsetting(json);
			if (entity.isFlag()) {
				car = (Car) entity.getData();
				tv_carnumber.setText(car.getCar_num());
				tv_carnum.setText(car.getCar_num());

				tv_carname.setText(car.getBrand_name() + car.getArctic_name());

				tv_boxnumber.setText(car.getBox_sn());
				SPUtils.put(MyCarSetting.this, "carId", car.getCar_id());

				SPUtils.put(MyCarSetting.this, "carnumber", car.getCar_num());

			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyCarSetting.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyCarSetting.this);
				}
			}
		}
	};

	HttpCallback carlistCallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cBllUser = CBLL.getInstance();
			JSONEntity entity = cBllUser.json2carlistmy(json);
			if (entity.isFlag()) {
				carset = (CarSet) entity.getData();

			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyCarSetting.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyCarSetting.this);
				}
			}
		}
	};

	@SuppressWarnings("unchecked")
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		switch (requestCode) {
		case 2:
			if (resultCode == 2) {
				if (!data.getStringExtra("carnumber").isEmpty()) {
					tv_carnumber.setText(data.getStringExtra("str")
							+ data.getStringExtra("carnumber"));
					tv_carnum.setText(data.getStringExtra("str")
							+ data.getStringExtra("carnumber"));
				}
			}
		case 3:
			if (resultCode == RESULT_OK) {
				// 将返回来的值进行处理

				ReastDate();
				dialogredmain();
				/*
				 * String
				 * carnum=data.getStringExtra("city")+data.getStringExtra(
				 * "carnumber"); String
				 * carbrands=data.getStringExtra("carbrands"); String
				 * arctic_name=data.getStringExtra("carchexing"); String
				 * gearbox=data.getStringExtra("tag"); String
				 * displacement=data.getStringExtra("pailiang"); HashMap<String,
				 * String> getinsurancedate = new Car().addnewcar
				 * (MyCarSetting.this
				 * ,carnum,carbrands,arctic_name,gearbox,displacement);
				 * System.out.println("NNNNNNNNNN"+displacement); new
				 * HttpTask(addnewcarcallback
				 * ,MyURL.ADDARCTIC).execute(getinsurancedate);
				 */
			}
			break;
		default:
		}
	}

	private void dialogredmain() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(MyCarSetting.this);
		builder.setTitle("系统提示")
				.setMessage("添加新车后，只有绑定新的盒子才能查看汽车的信息，请问是否绑定新的盒子")
				// 设置显示的内容
				.setPositiveButton("绑定新盒子",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub

								// HashMap<String,String>changejialing=new
								// UserEntity().changenicheng(SPUtils.get(MyinfoActivity.this,
								// "userId",
								// -1).toString(),SPUtils.get(MyinfoActivity.this,
								// "userTokens", "").toString(),str,5);
								// new
								// HttpTask(sexcallback,MyURL.CHANGEINFOR).execute(changejialing);
								dialog();

							}

						}).setNegativeButton("不了谢谢", null).show();

	}

	private void dialogbox() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		CustomDialog.Builder builder = new CustomDialog.Builder(MyCarSetting.this);
		builder.setMessage("您还未绑定盒子，请问是否绑定")
				// 设置显示的内容
				.setPositiveButton("绑定新盒子",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								dialog.dismiss();
								// HashMap<String,String>changejialing=new
								// UserEntity().changenicheng(SPUtils.get(MyinfoActivity.this,
								// "userId",
								// -1).toString(),SPUtils.get(MyinfoActivity.this,
								// "userTokens", "").toString(),str,5);
								// new
								// HttpTask(sexcallback,MyURL.CHANGEINFOR).execute(changejialing);
								dialog();

							}

						}).setNegativeButton("不了谢谢", new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								dialog.dismiss();
							}
						}).create().show();

	}

	HttpCallback addnewcarcallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2addcar(json);
			if (entity.isFlag()) {
				Car list = (Car) entity.getData();
				List<Car> ll = carset.getCarList();
				tv_carnum.setText(list.getCar_num());
				tv_carnumber.setText(list.getCar_num());
				tv_carname.setText(list.getArctic_name());
				ll.add(list);
				carset = new CarSet(ll);
				// activityadapter.notifyDataSetChanged();

			}
		}
	};
	HttpCallback deletecallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL cbll = CBLL.getInstance();
			JSONEntity entity = cbll.json2addinsurance(json);
			if (entity.isFlag()) {
				ToastUtil.show(MyCarSetting.this, "删除成功");
				ReastDate();
				/*
				 * List<Car>list=carset.getCarList();
				 * list.remove(carset.getItem(0)); carset =new CarSet(list);
				 * activityadapter.notifyDataSetChanged();
				 */
			} else {
				if (entity.getMessage() == MyURL.MSG_OTHERS_ERROR) {
					ToastUtil.show(MyCarSetting.this, "获取失败");
				} else if (entity.getMessage() == MyURL.MSG_TOKENS_ERROR) {
					// 重启app
					MainActivity.restartApplication(MyCarSetting.this);
				}
			}
		}
	};

	/***
	 * 获取PopupWindow实例
	 */
	private void getPopupWindow() {
		if (null != popupview) {
			popupview.dismiss();
			popupview = null;
			return;
		} else {
			initPopuptWindow();

		}
	}

	// 初始化popupwindow
	protected void initPopuptWindow() {
		View view = getLayoutInflater().inflate(R.layout.popupview_shop, null,
				false);
		ListView listview = (ListView) view.findViewById(R.id.listview);
		activityadapter = new Activitymysettingadapter(MyCarSetting.this,
				carset);

		listview.setAdapter(activityadapter);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				tv_carnumber.setText(carset.getItem(position).getCar_num());

				String carid = carset.getItem(position).getCar_id() + "";
				HashMap<String, String> idtakjson = new UserEntity()
						.getIdTaken(MyCarSetting.this);
				idtakjson.put("car_id", carid);
				new HttpTask(carsettingcallback, MyURL.CARSETTINGCHANGECAR,MyCarSetting.this)
						.execute(idtakjson);
				setResult(1);
				// 用于消失弹窗
				getPopupWindow();
			}
		});

		popupview = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		// popupview.setBackgroundDrawable(getResources().getDrawable(R.drawable.popupgray));
		popupview.setAnimationStyle(android.R.style.Animation_InputMethod);
		// 点击外面，窗口消失
		popupview.setOutsideTouchable(true);
		popupview.setFocusable(true);
		popupview.setTouchable(true);
		// 防止软键盘被弹出菜单遮住
		popupview
				.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		view.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if (popupview != null && popupview.isShowing()) {
					// tv_changecar.setVisibility(View.VISIBLE);
					popupview.dismiss();
					popupview = null;

				}
				return false;
			}
		});

	}

	private void setListen() {
		// TODO Auto-generated method stub

		rel_tiajanche.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				getPopupWindow();
				// 这里是位置显示方式,
				popupview.showAsDropDown(rel_tiajanche);
			}
		});
		rel_zhinenghezi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_boxnumber.getText().toString().equals("")) {
					dialogbox();
				} else {
					Intent intent = new Intent(MyCarSetting.this,
							IntelligentBoxManage.class);
					startActivity(intent);
				}

			}
		});
		rel_qichepeizhi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyCarSetting.this,
						CarConfiguration.class);
				startActivity(intent);
			}
		});
		rel_changenumber.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(MyCarSetting.this,
						ChangeCarNumberActivity.class);
				startActivityForResult(intent, 2);
			}
		});
		rel_buy_dangan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyCarSetting.this,
						PurchaseRecordActivity.class);
				startActivity(intent);
			}
		});

		img_tianjia.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyCarSetting.this,
						AddLicenseplateActivity.class);
				intent.putExtra("build", 2);
				startActivityForResult(intent, 3);
			}
		});
		lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});

		img_delete.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 删除车子的请求
				HashMap<String, String> changejialing = new UserEntity()
						.getIdTaken(MyCarSetting.this);
				changejialing.put("car_id",
						SPUtils.get(MyCarSetting.this, "carId", -1).toString());
				new HttpTask(deletecallback, MyURL.DELETECAR,MyCarSetting.this)
						.execute(changejialing);

			}
		});

	}

	private void initview() {
		// TODO Auto-generated method stub
		tv_boxnumber = (TextView) findViewById(R.id.tv_boxnumber);
		tv_carname = (TextView) findViewById(R.id.tv_carname);
		tv_carnum = (TextView) findViewById(R.id.tv_carnum);
		rel_tiajanche = (RelativeLayout) findViewById(R.id.rel_tiajanche);// 上一活动的下拉菜单
		img_tianjia = (ImageView) findViewById(R.id.img_tianjia);
		rel_buy_dangan = (RelativeLayout) findViewById(R.id.rel_buy_dangan);
		rel_changenumber = (RelativeLayout) findViewById(R.id.rel_changenumber);
		tv_carnumber = (TextView) findViewById(R.id.tv_carnumber);
		rel_qichepeizhi = (RelativeLayout) findViewById(R.id.rel_qichepeizhi);
		rel_zhinenghezi = (RelativeLayout) findViewById(R.id.rel_zhinenghezi);
		lin_back = (LinearLayout) findViewById(R.id.lin_back);
		img_delete = (ImageView) findViewById(R.id.img_delete);

	}

	private void dialog() {
		// TODO Auto-generated method stub

		dialog = new Dialogaddbox(MyCarSetting.this);
		final EditText editText1 = (EditText) dialog.getEditText1();// 方法在CustomDialog中实现
		final EditText editText2 = (EditText) dialog.getEditText2();// 方法在CustomDialog中实现
		final String zhanghao = editText1.getText().toString();
		final String mima = editText2.getText().toString();

		dialog.setOnPositiveListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		dialog.setOnNegativeListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// HashMap<String, String>changebox=new
				// Car().changebox(IntelligentBoxManage.this,Integer.parseInt(zhanghao),Integer.parseInt(mima));
				// new HttpTask(changboxcallbac, MyURL.).execute(changebox);
			}
		});
		dialog.show();

	}
}
