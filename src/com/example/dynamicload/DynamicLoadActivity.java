package com.example.dynamicload;

import com.example.dynamicload.jni.DynamicLoadHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class DynamicLoadActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dynamic_load);
		
		init();
	}
	
	private void init(){
		
		System.loadLibrary("dynamicload_jni");
		
		DynamicLoadHelper helper = new DynamicLoadHelper();
		int s  = helper.plus(1, 2);
		TextView tv = (TextView)findViewById(R.id.result);
		tv.setText(String.valueOf(s));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dynamic_load, menu);
		return true;
	}

}
