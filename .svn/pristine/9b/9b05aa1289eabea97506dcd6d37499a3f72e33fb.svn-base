package com.IntimateCarCare;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.MyLocationConfiguration.LocationMode;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;
import com.tool.CircleImageView;
import com.tool.MyOrientationListener;
import com.tool.ToastUtil;

public class GPSActivity extends Activity {

	private ImageView img_tracffic;
	private CircleImageView img_back,img_location;
	private RelativeLayout Rel_carnav;
	
	
	// 地图参数
	private MapView mMapView = null;
	private BaiduMap mBaiduMap;
	private boolean iscar=true;
	

	// 定位参数
	private LocationClient mLocationClient = null;
	private BDLocationListener myListener = new MyLocationListener();
	private double mLatitude,carLatitude;
	private double mLongtitude,carLongtitude;
	private MyOrientationListener myOrientationListener;
	private float mcurrentX;
	private boolean isFirstLoc = true; // 是否首次定位
	
	//车辆位置参数
	
	private Marker marker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 在使用SDK各组件之前初始化context信息，传入ApplicationContext
		// 注意该方法要再setContentView方法之前实现
		SDKInitializer.initialize(getApplicationContext());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_gps);
		

		initLocation();
		initView();
		setListen();
		initData();

	}
	

	private void initData() {
		// TODO Auto-generated method stub
		
		carLatitude=29.917662;
		carLongtitude=121.625815;
		
		
		LatLng llA = new LatLng(carLatitude,carLongtitude);
		BitmapDescriptor bdA = BitmapDescriptorFactory
	            .fromResource(R.drawable.car);
		 MarkerOptions ooA = new MarkerOptions().position(llA).icon(bdA)
	                .zIndex(9).draggable(true);
		 mBaiduMap.clear();
		 marker = (Marker) (mBaiduMap.addOverlay(ooA));
		 //LatLng A = new LatLng(29.817662,121.625815);
		// marker.setPosition(A);
		 //角度
		 //marker.setRotate(200);
		 if (isFirstLoc) {
				isFirstLoc = false;
				ShowOnMap(carLatitude, carLongtitude);
				
			}
		
		
	}


	private void initView() {
		// TODO Auto-generated method stub
		// 获取地图控件引用
		mMapView = (MapView) findViewById(R.id.bmapView);
		mBaiduMap = mMapView.getMap();
		mBaiduMap.setMyLocationEnabled(true);
		
		
		img_tracffic=(ImageView) findViewById(R.id.img_tracffic);
		img_back=(CircleImageView) findViewById(R.id.img_back);
		img_location=(CircleImageView) findViewById(R.id.img_location);
		Rel_carnav=(RelativeLayout) findViewById(R.id.Rel_carnav);

	}

	private void initLocation() {
		mLocationClient = new LocationClient(getApplicationContext()); // 声明LocationClient类
		mLocationClient.registerLocationListener(myListener); // 注册监听函数

		LocationClientOption option = new LocationClientOption();
		option.setCoorType("bd09ll");// 可选，默认gcj02，设置返回的定位结果坐标系
		int span = 1000;
		option.setScanSpan(span);// 可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
		option.setIsNeedAddress(true);// 可选，设置是否需要地址信息，默认不需要
		option.setOpenGps(true);// 可选，默认false,设置是否使用gps
		option.setLocationNotify(true);// 可选，默认false，设置是否当GPS有效时按照1S/1次频率输出GPS结果
		option.setIsNeedLocationDescribe(true);// 可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
		option.setIsNeedLocationPoiList(true);// 可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
		option.setIgnoreKillProcess(false);// 可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
		option.SetIgnoreCacheException(false);// 可选，默认false，设置是否收集CRASH信息，默认收集
		option.setEnableSimulateGps(false);// 可选，默认false，设置是否需要过滤GPS仿真结果，默认需要
		mLocationClient.setLocOption(option);
		mLocationClient.start();
		mLocationClient.requestLocation();
		myOrientationListener = new MyOrientationListener(this);
		myOrientationListener
				.setOnOrientationListener(new MyOrientationListener.OnOrientationListener() {

					@Override
					public void onOrientationChanged(float x) {
						// TODO Auto-generated method stub
						mcurrentX = x;
					}
				});
		
	}

	private void setListen() {
		// TODO Auto-generated method stub
		img_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		img_tracffic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(mBaiduMap.isTrafficEnabled()){
					mBaiduMap.setTrafficEnabled(false);
					img_tracffic.setImageResource(R.drawable.traffic_off);
				}else{
					mBaiduMap.setTrafficEnabled(true);
					img_tracffic.setImageResource(R.drawable.traffic_on);
				}
			}
		});
		img_location.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  if(iscar){
					  iscar=false;
					  ShowOnMap(mLatitude, mLongtitude);
						img_location.setImageResource(R.drawable.car_orange);
				  }else{
					  iscar=true;
					  ShowOnMap(carLatitude, carLongtitude);
						img_location.setImageResource(R.drawable.people_orange);
				  }
			}
		});
		
		Rel_carnav.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(isAvilible(GPSActivity.this,"com.baidu.BaiduMap")){//传入指定应用包名
					Intent intent = new Intent();
					String url="baidumap://map/walknavi?origin="+mLatitude+","+mLongtitude+"&destination="+carLatitude+","+carLongtitude;
					// 步行导航
					intent.setData(Uri.parse(url));
					startActivity(intent);
				}else{
					ToastUtil.show(GPSActivity.this,"请先安装百度地图");
					Uri uri = Uri.parse("market://details?id=com.baidu.BaiduMap");  
	                Intent intent = new Intent(Intent.ACTION_VIEW, uri);   
	                startActivity(intent); 
				}
			}
		});
		
		
		
		
		
	}

	public class MyLocationListener implements BDLocationListener {

		@Override
		public void onReceiveLocation(BDLocation location) {
			// map view 销毁后不在处理新接收的位置
			if (location == null || mMapView == null) {
				return;
			}
			mLatitude = location.getLatitude();
			mLongtitude = location.getLongitude();

			MyLocationData locData = new MyLocationData.Builder()
					.accuracy(location.getRadius())
					// 此处设置开发者获取到的方向信息，顺时针0-360
					.direction(mcurrentX).latitude(mLatitude)
					.longitude(mLongtitude).build();
			mBaiduMap.setMyLocationData(locData);
			// 设置自定义图标
			MyLocationConfiguration config = new MyLocationConfiguration(
					LocationMode.NORMAL, true, null);
			mBaiduMap.setMyLocationConfigeration(config);
		}
	}
	
	private void ShowOnMap(double Latitude,double Longtitude){
		LatLng ll = new LatLng(Latitude,Longtitude);
		MapStatus.Builder builder = new MapStatus.Builder();
		builder.target(ll).zoom(18.0f);
		mBaiduMap.animateMapStatus(MapStatusUpdateFactory
				.newMapStatus(builder.build()));
	}
	
	//判断手机已安装某程序的方法
	private boolean isAvilible(Context context, String packageName){ 
	          final PackageManager packageManager = context.getPackageManager();//获取packagemanager 
	          List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);//获取所有已安装程序的包信息 
	          List<String> pName = new ArrayList<String>();//用于存储所有已安装程序的包名 
	         //从pinfo中将包名字逐一取出，压入pName list中 
	              if(pinfo != null){ 
	              for(int i = 0; i < pinfo.size(); i++){ 
	                  String pn = pinfo.get(i).packageName; 
	                  pName.add(pn); 
	              } 
	          } 
	          return pName.contains(packageName);//判断pName中是否有目标程序的包名，有TRUE，没有FALSE 
	    } 

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
		mMapView.onDestroy();
	}

	@Override
	protected void onResume() {
		super.onResume();
		// 在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
		mMapView.onResume();
		if (mLocationClient != null) {
			mLocationClient.start();
		}
		// 开启方向
		myOrientationListener.start();
		
	}

	@Override
	protected void onPause() {
		super.onPause();
		// 在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
		mMapView.onPause();
		if (mLocationClient != null) {
			mLocationClient.stop();
		}
		// 停止方向传感器
		myOrientationListener.stop();
	}
}
