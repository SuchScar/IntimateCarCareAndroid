package com.tool;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;

import com.IntimateCarCare.R;

public class Dialogaddbox extends Dialog{

	private EditText editText1 ,editText2, editText3;
	private TextView cancelButton, sureButton;
	public Dialogaddbox(Context context) {
		super(context,R.style.dialog);
		setCustomDialog();
		// TODO Auto-generated constructor stub
	}

	private void setCustomDialog() {
		View mView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_addbox, null);
		editText1 = (EditText) mView.findViewById(R.id.edt_one);
		editText2 = (EditText) mView.findViewById(R.id.edt_two);
		cancelButton = (TextView) mView.findViewById(R.id.cancelButton);
		sureButton= (TextView) mView.findViewById(R.id.sureButton);
		super.setContentView(mView);
	}
	
	public View getEditText1(){
		return editText1;
		
	}
	public View getEditText2(){
		return editText2;
		
	}
	
	 @Override
	public void setContentView(int layoutResID) {
	}

	@Override
	public void setContentView(View view, LayoutParams params) {
	}

	@Override
	public void setContentView(View view) {
	}

	/** 
     * 确定键监听器 
     * @param listener 
     */  
    public void setOnPositiveListener(View.OnClickListener listener){  
    	cancelButton.setOnClickListener(listener);  
    }  
    /** 
     * 取消键监听器 
     * @param listener 
     */  
    public void setOnNegativeListener(View.OnClickListener listener){  
    	sureButton.setOnClickListener(listener);  
    }




}
