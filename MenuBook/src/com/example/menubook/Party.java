package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Party extends Activity{
	
	Button pF, pc;
	EditText etP1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.party);
		
		pF = (Button) findViewById(R.id.bPF);
		pc = (Button) findViewById(R.id.bPS);
		
		etP1 = (EditText) findViewById(R.id.etP1);
		
		pc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String P1 = etP1.getText().toString();
				
				Intent opF = new Intent(Party.this, Snks.class);
				startActivity(opF);
			}
		});
		
		pF.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String P1 = etP1.getText().toString();
				Intent opFP1 = new Intent(Party.this, Dish.class);
				opFP1.putExtra("PP1", P1);
				
				Intent opF = new Intent(Party.this, Full.class);
				startActivity(opF);
			}
		});
		
		
	}
		
}
