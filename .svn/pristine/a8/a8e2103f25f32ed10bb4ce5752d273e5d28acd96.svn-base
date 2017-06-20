package com.Adapter;

import com.Entity.AnnualInspectionSet;
import com.IntimateCarCare.ChangeYearInspection;
import com.IntimateCarCare.R;
import com.tool.SPUtils;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 //年检记录适配器
public class ActivityYearInspectionAdapter extends BaseAdapter{
 
	private Context context;
	private AnnualInspectionSet list;
	
	public ActivityYearInspectionAdapter(Context c,AnnualInspectionSet l){
		super();
		this.context=c;
		this.list=l;
	}
	
   class ViewHolder{
	
		ImageView image_xiugai;
		TextView year_nowdata;
		TextView year_nextdata;
		TextView year_money;
		TextView year_beizhu;
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
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
   ViewHolder viewholder;
		
	if(convertView==null){
			
	convertView = LayoutInflater.from(context).inflate(R.layout.item_yearinspection, null);
	viewholder = new ViewHolder();
	
	viewholder.year_nowdata=(TextView)convertView.findViewById(R.id.tv_data);
	viewholder.image_xiugai=(ImageView)convertView.findViewById(R.id.xiugai);
	viewholder.year_nextdata=(TextView)convertView.findViewById(R.id.tv_nextdata);
	viewholder.year_money=(TextView)convertView.findViewById(R.id.tv_feiyong);
	viewholder.year_beizhu=(TextView)convertView.findViewById(R.id.tv_beizhu);
	
	convertView.setTag(viewholder);
		}
	
	else{
		viewholder = (ViewHolder) convertView.getTag();
	}
	
	viewholder.year_nowdata.setText(list.getItem(position).getCre_time());
	viewholder.year_nextdata.setText(list.getItem(position).getNext_time());
	viewholder.year_money.setText(list.getItem(position).getMoney()+"");
	viewholder.year_beizhu.setText(list.getItem(position).getRemark_c());
	
	viewholder.image_xiugai.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		Intent intent=new Intent(context,ChangeYearInspection.class);	
       SPUtils.put(context, "arecord_id", list.getItem(position).getArecord_id());
		((Activity) context).startActivityForResult(intent, 2);
	  
		}
	});
	return convertView;
		
	
	}


}
