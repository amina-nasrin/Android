package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Full extends Activity{

	Button fl, com;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.full);
		
		fl = (Button) findViewById(R.id.bFull);
		com = (Button) findViewById(R.id.bCom);
		
		
		fl.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ofl = new Intent(Full.this, Dish.class);
				startActivity(ofl);
			}
		});
		
		com.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ocmb = new Intent(Full.this, Comb.class);
				startActivity(ocmb);
			}
		});
	}
		
}
