package com.Adapter;

import com.Adapter.ActivityFaultListAdapter.ViewHolder;
import com.Entity.DataFlow;
import com.Entity.DataFlowSet;
import com.Entity.FaultSet;
import com.IntimateCarCare.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ActivityDataFlowsAdapter extends BaseAdapter{

	private Context context;	
	private DataFlowSet list;
	
	public ActivityDataFlowsAdapter(Context c,DataFlowSet l){
		super();
		this.context=c;
		this.list=l;
		}
	
	// 定义内部类作为占位符
		class ViewHolder {
			TextView tv_name;
			TextView tv_value;
			TextView tv_state;
			
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
					R.layout.item_dataflow, null);
			viewholder = new ViewHolder();
			// 获得视图中的对象控件
			viewholder.tv_name= (TextView) convertView
					.findViewById(R.id.tv_name);
			viewholder.tv_value = (TextView) convertView
					.findViewById(R.id.tv_value);
			viewholder.tv_state = (TextView) convertView
					.findViewById(R.id.tv_state);

			convertView.setTag(viewholder);
		} else {
			viewholder = (ViewHolder) convertView.getTag();
		}
		viewholder.tv_name.setText(list.getItem(position).getName());
		viewholder.tv_value.setText(list.getItem(position).getValue());
		viewholder.tv_state.setText(list.getItem(position).getState());
		return convertView;
	}

}
