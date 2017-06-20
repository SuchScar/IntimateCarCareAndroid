package com.Application;

import org.xutils.BuildConfig;
import org.xutils.x;

import android.app.Application;

public class MyApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		//初始化XUtils3
		x.Ext.init(this);
		//设置debug模式
		x.Ext.setDebug(BuildConfig.DEBUG);// 是否输出debug日志, 开启debug会影响性能.
	}

}
