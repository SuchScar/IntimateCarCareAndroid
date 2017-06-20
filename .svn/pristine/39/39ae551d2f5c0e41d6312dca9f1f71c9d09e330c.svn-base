package com.IntimateCarCare;

import java.util.HashMap;
import org.json.JSONObject;
import com.Bll.CBLL;
import com.Entity.UserEntity;
import com.Http.HttpCallback;
import com.Http.HttpTask;
import com.tool.Dialogchangepassword;
import com.tool.JSONEntity;
import com.tool.MyURL;
import com.tool.SPUtils;
import com.tool.ToastUtil;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SoftSettingActivity extends Activity {

	private Dialogchangepassword dialog;
	private Button btu_exit;
	private RelativeLayout rel_changepassword, rel_aboutsoftwale;
	private LinearLayout lin_back;
	private String jiumima, xinmima, suremima;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_software_setting);

		initview();
		setListen();

	}

	private void setListen() {
		// TODO Auto-generated method stub
		rel_aboutsoftwale.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SoftSettingActivity.this,
						AboutSoftSetting.class);
				startActivity(intent);
			}
		});
		btu_exit.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				HashMap<String, String> idtakjson = new UserEntity()
						.getIdTaken(SoftSettingActivity.this);
				new HttpTask(exitCallback, MyURL.EXIT, SoftSettingActivity.this)
						.execute(idtakjson);

			}
		});
		lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		rel_changepassword.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog();
			}
		});
	}

	private HttpCallback exitCallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			SPUtils.remove(SoftSettingActivity.this, "userAccount");
			SPUtils.remove(SoftSettingActivity.this, "userPassword");
			SPUtils.remove(SoftSettingActivity.this, "userId");
			final Intent intent = getPackageManager()
					.getLaunchIntentForPackage(getPackageName());
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
		}
	};

	private void initview() {
		// TODO Auto-generated method stub
		rel_aboutsoftwale = (RelativeLayout) findViewById(R.id.rel_aboutsoftwale);
		btu_exit = (Button) findViewById(R.id.btu_exit);
		lin_back = (LinearLayout) findViewById(R.id.lin_back);
		rel_changepassword = (RelativeLayout) findViewById(R.id.rel_changepassword);
	}

	private void dialog() {
		dialog = new Dialogchangepassword(SoftSettingActivity.this);
		final EditText editText1 = (EditText) dialog.getEditText1();// 方法在CustomDialog中实现
		final EditText editText2 = (EditText) dialog.getEditText2();// 方法在CustomDialog中实现
		final EditText editText3 = (EditText) dialog.getEditText3();// 方法在CustomDialog中实现

		dialog.setOnPositiveListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		dialog.setOnNegativeListener(new OnClickListener() {
			@SuppressWarnings("unchecked")
			@Override
			public void onClick(View v) {
				// dosomething youself
				String jiumima = editText1.getText().toString();
				String xinmima = editText2.getText().toString();
				String suremima = editText3.getText().toString();
				if (xinmima.equals(suremima)) {
					if (jiumima.equals(SPUtils.get(SoftSettingActivity.this,
							"userPassword", ""))) {
						/** 如果确认密码一致 发送数据 **/
						HashMap<String, String> changpassword = new UserEntity()
								.changepassword(
										SPUtils.get(SoftSettingActivity.this,
												"userId", -1).toString(),
										SPUtils.get(SoftSettingActivity.this,
												"userTokens", "").toString(),
										suremima);
						new HttpTask(changepasswordcallback, MyURL.CHANGEPASS,
								SoftSettingActivity.this)
								.execute(changpassword);
					} else {
						ToastUtil.show(SoftSettingActivity.this, "您所输入的密码有误");

					}
				} else {
					ToastUtil.show(SoftSettingActivity.this, "您两次输入的密码不一致！");
				}
				dialog.dismiss();
			}
		});
		dialog.show();
	}

	HttpCallback changepasswordcallback = new HttpCallback() {

		@Override
		public void getResult(JSONObject json) {
			// TODO Auto-generated method stub
			CBLL changepasswordcbll = CBLL.getInstance();
			JSONEntity entity = changepasswordcbll.json2changpassword(json);
			if (entity.isFlag()) {
				ToastUtil.show(SoftSettingActivity.this, "修改密码成功,请重新登录");
				SPUtils.remove(SoftSettingActivity.this, "userAccount");
				SPUtils.remove(SoftSettingActivity.this, "userPassword");
				SPUtils.remove(SoftSettingActivity.this, "userId");
				final Intent intent = getPackageManager()
						.getLaunchIntentForPackage(getPackageName());
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			} else {
				if (entity.getMessage() == 1) {
					ToastUtil.show(SoftSettingActivity.this, "令牌错误");
				} else if (entity.getMessage() == 2) {
					ToastUtil.show(SoftSettingActivity.this, "已注册");
				} else {
					ToastUtil.show(SoftSettingActivity.this, "密码错误");
				}
			}
		}
	};
}
