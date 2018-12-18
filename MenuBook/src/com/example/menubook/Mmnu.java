package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mmnu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Button c, f, p, s;
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		
		c = (Button) findViewById(R.id.bCC);
		f = (Button) findViewById(R.id.bFC);
		p = (Button) findViewById(R.id.bPT);
		s = (Button) findViewById(R.id.bSO);
		
		c.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent oc = new Intent(Mmnu.this, Snks.class);
				startActivity(oc);
			}
		});
		
		f.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent of = new Intent(Mmnu.this, Full.class);
				startActivity(of);
			}
		});
		
		p.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent op = new Intent(Mmnu.this, Party.class);
				startActivity(op);
			}
		});
		
		s.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent os = new Intent(Mmnu.this, Special.class);
				startActivity(os);
			}
		});
	}
		
}
