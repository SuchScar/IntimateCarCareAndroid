package com.Adapter;

import java.util.ArrayList;
import java.util.List;
import com.Entity.Setweather;
import com.IntimateCarCare.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityMyWeatherAdapter extends BaseAdapter{

	private Context context;	
	private Setweather list;
	public ActivityMyWeatherAdapter(Context c,Setweather l){
		super();
		context=c;
		list=l;
	}
	
	class ViewHolder{
		TextView date;
		TextView week;
		ImageView weatherimage;
		TextView weathercondition;
		TextView temperture;
		TextView washcar;
	
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.getItem(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder viewholder;
		
		if(arg1 == null){
			arg1 = LayoutInflater.from(context).inflate(R.layout.item_weatheradapter, null);
			viewholder = new ViewHolder();
			viewholder.date = (TextView) arg1.findViewById(R.id.timmer);
			viewholder.week=(TextView)arg1.findViewById(R.id.week);
			viewholder.weatherimage=(ImageView)arg1.findViewById(R.id.weatherimage);
			viewholder.weathercondition=(TextView)arg1.findViewById(R.id.weathercondition);
			viewholder.temperture = (TextView) arg1.findViewById(R.id.temperture);
			viewholder.washcar = (TextView) arg1.findViewById(R.id.washcar);
			arg1.setTag(viewholder);
		}
		else{
			viewholder = (ViewHolder) arg1.getTag();
		}
		viewholder.date.setText(list.getItem(arg0).getDate());
		viewholder.week.setText((list.getItem(arg0).getWeek())+"");
		//viewholder.weatherimage.setImageResource(list.get(arg0).getWeatherimage());
		viewholder.weathercondition.setText(list.getItem(arg0).getWeathercondition());
		viewholder.temperture.setText((list.getItem(arg0).getTemperture())+"");
		viewholder.washcar.setText(list.getItem(arg0).getWashcar());
		
		if(list.getItem(arg0).getWeathercondition().equals("晴"))
		{
			viewholder.weatherimage.setImageResource(R.drawable.qing);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("阴"))
		{
			viewholder.weatherimage.setImageResource(R.drawable.qing);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("大雨"))			
		{
			viewholder.weatherimage.setImageResource(R.drawable.dayu);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("小雨"))			
		{
			viewholder.weatherimage.setImageResource(R.drawable.xiaoyu);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("小雪"))			
		{
			viewholder.weatherimage.setImageResource(R.drawable.xiaoxue);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("大雪"))			
		{
			viewholder.weatherimage.setImageResource(R.drawable.daxue);
		}
		else if(list.getItem(arg0).getWeathercondition().equals("多云"))			
		{
			viewholder.weatherimage.setImageResource(R.drawable.duoyun);
		}
		else {
			viewholder.weatherimage.setImageResource(R.drawable.yin);
		}
		
		return arg1;
		
	}

}
