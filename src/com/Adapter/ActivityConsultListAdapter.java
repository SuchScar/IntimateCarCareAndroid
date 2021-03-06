package com.Adapter;

import com.Entity.ProblemSet;
import com.IntimateCarCare.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ActivityConsultListAdapter extends BaseAdapter{

	private Context context;	
	private  ProblemSet list;
	
	public ActivityConsultListAdapter(Context c,ProblemSet l){
		super();
		this.context=c;
		this.list=l;
		}
	
	// 定义内部类作为占位符
		class ViewHolder {
			TextView tv_title;
			TextView tv_answer;
			
			
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
					R.layout.item_consult, null);
			viewholder = new ViewHolder();
			// 获得视图中的对象控件
			viewholder.tv_title= (TextView) convertView
					.findViewById(R.id.tv_title);
			viewholder.tv_answer = (TextView) convertView
					.findViewById(R.id.tv_answer);
			convertView.setTag(viewholder);
		} else {
			viewholder = (ViewHolder) convertView.getTag();
		}
		viewholder.tv_title.setText(list.getItem(position).getTitle());
		viewholder.tv_answer.setText(list.getItem(position).getAnswer());
		return convertView;
	}

}
