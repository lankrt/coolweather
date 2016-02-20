package com.ran.coolweather.activity;


import java.util.List;

import com.ran.coolweather.R;
import com.ran.coolweather.model.City;
import com.ran.coolweather.model.CoolWeatherDB;
import com.ran.coolweather.model.County;
import com.ran.coolweather.model.Province;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = new Intent(MainActivity.this, ChooseAreaActivity.class);
		startActivity(intent);
	}
}
