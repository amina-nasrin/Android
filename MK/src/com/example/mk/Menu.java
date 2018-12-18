package com.example.mk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity{

	Button abt, hlp, strt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		abt = (Button) findViewById(R.id.bA);
		hlp = (Button) findViewById(R.id.bH);
		strt = (Button) findViewById(R.id.bS);
		
		abt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent opnAbt = new Intent("com.example.mk.ABT"); 
				startActivity(opnAbt);
			}
		});
		
		hlp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent opnHlp = new Intent("com.example.mk.HLP");
				startActivity(opnHlp);
			}
		});
		
		strt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent opnStrt = new Intent("com.example.mk.START");
				startActivity(opnStrt);
			}
		});
	}
		
}
