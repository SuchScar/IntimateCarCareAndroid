package com.Adapter;

import java.util.List;
import com.Entity.Car;
import com.Entity.CarSet;
import com.IntimateCarCare.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

/**
 * @author J 适配器
 */
public class ActivityAllCarClassifyAdapter extends BaseAdapter implements SectionIndexer {
	private List<Car> list;
	private Context mContext;
	private boolean isNeedCheck;

	public boolean isNeedCheck() {
		return isNeedCheck;
	}

	public void setNeedCheck(boolean isNeedCheck) {
		this.isNeedCheck = isNeedCheck;
	}

	public ActivityAllCarClassifyAdapter(Context mContext, List<Car> list) {
		this.mContext = mContext;
		this.list = list;
	}

	public void updateListView(List<Car> list) {
		this.list = list;
		notifyDataSetChanged();
	}

	public int getCount() {
		return this.list.size();
	}

	public Object getItem(int position) {
		return list.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup arg2) {
		ViewHolder viewHolder = null;
	//	final SortModel mContent = list.get(position);
		if (view == null) {
			viewHolder = new ViewHolder();
			view = LayoutInflater.from(mContext).inflate(R.layout.item_allcarclassifyadapter, null);
			viewHolder.tvTitle = (TextView) view
					.findViewById(R.id.tv_user_item_name);
			viewHolder.tvLetter = (TextView) view.findViewById(R.id.catalog);
			
			view.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) view.getTag();
		}

		int section = getSectionForPosition(position);

		if (position == getPositionForSection(section)) {
			viewHolder.tvLetter.setVisibility(View.VISIBLE);
			viewHolder.tvLetter.setText(list.get(position).getSortLetters());
		} else {
			viewHolder.tvLetter.setVisibility(View.GONE);
		}
		
		viewHolder.tvTitle.setText(list.get(position).getBrand_name());

		return view;

	}

	final static class ViewHolder {
		TextView tvLetter;
		TextView tvTitle;
		
	}

	/**
	 * 得到首字母的ascii值
	 */
	public int getSectionForPosition(int position) {   
		return list.get(position).getSortLetters().charAt(0);
	}

	public int getPositionForSection(int section) {   //右侧的导航
		for (int i = 0; i < getCount(); i++) {
			String sortStr = list.get(i).getSortLetters();
			char firstChar = sortStr.toUpperCase().charAt(0);
			if (firstChar == section) {
				return i;
			}
		}

		return -1;
	}

	public String getAlpha(String str) {
		String sortStr = str.trim().substring(0, 1).toUpperCase();
		if (sortStr.matches("[A-Z]")) {
			return sortStr;
		} else {
			return "#";
		}
	}

	@Override
	public Object[] getSections() {
		return null;
	}
}