package com.Adapter;

import com.Entity.TourReportBriefSet;
import com.IntimateCarCare.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ActivityTourReportAdapter extends BaseAdapter{
	private Context context;	
	private TourReportBriefSet list;
	
	public ActivityTourReportAdapter(Context c,TourReportBriefSet l){
		super();
		this.context=c;
		this.list=l;
		}
	
	// 定义内部类作为占位符
		class ViewHolder {
			TextView tv_starttime;
			TextView tv_endtime;
			TextView tv_startaddress;
			TextView tv_endaddress;
			TextView tv_distance;
		}
	
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.getItem(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewholder = null;
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(
					R.layout.item_tourreport, null);
			viewholder = new ViewHolder();
			// 获得视图中的对象控件
			viewholder.tv_starttime = (TextView) convertView
					.findViewById(R.id.tv_starttime);
			viewholder.tv_startaddress = (TextView) convertView
					.findViewById(R.id.tv_startaddress);
			viewholder.tv_endtime = (TextView) convertView
					.findViewById(R.id.tv_endtime);
			viewholder.tv_endaddress=(TextView) convertView
					.findViewById(R.id.tv_endaddress);
			viewholder.tv_distance=(TextView) convertView
					.findViewById(R.id.tv_distance);

			convertView.setTag(viewholder);
		} else {
			viewholder = (ViewHolder) convertView.getTag();
		}
		
		viewholder.tv_starttime.setText(list.getItem(position).getStart_time());
		viewholder.tv_startaddress.setText(list.getItem(position).getStart_place());
		viewholder.tv_endtime.setText(list.getItem(position).getEnd_time());
		viewholder.tv_endaddress.setText(list.getItem(position).getEnd_place());
		viewholder.tv_distance.setText(list.getItem(position).getTour_mileage());
		
		return convertView;
	}

}
