package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Comb extends Activity{
	
	Button cCA1, cCS1, cCA2, cCS2, cCA3, cCS3, COrd;
	TextView ctCAdd1, ctCAdd2, ctCAdd3, ctTotal;
	int Cct1 = 0, Cct2 = 0, Cct3 = 0, Ctotal = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comb);
		
		cCA1 = (Button) findViewById(R.id.bCom1Add1);
		cCS1 = (Button) findViewById(R.id.bComSub1);
		cCA2 = (Button) findViewById(R.id.bCom2Add2);
		cCS2 = (Button) findViewById(R.id.bCom2Sub2);
		cCA3 = (Button) findViewById(R.id.bCom3Add2);
		cCS3 = (Button) findViewById(R.id.bCom3Sub2);
		COrd = (Button) findViewById(R.id.bCOrd);
		
		ctCAdd1 = (TextView) findViewById(R.id.tvComAmm);
		ctCAdd2 = (TextView) findViewById(R.id.tvCom2Amm2);
		ctCAdd3 = (TextView) findViewById(R.id.tvComAmm3);
		ctTotal = (TextView) findViewById(R.id.tvComTotal);
		
		cCA1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct1++;
				ctCAdd1.setText("" + Cct1);
				Ctotal = Ctotal + 180;
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		cCS1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct1--;
				if(Cct1<0){
					Cct1 = 0;
					Ctotal = Ctotal - 0;
				} else {
					Cct1 = Cct1;
					Ctotal = Ctotal - 180;
				}
				ctCAdd1.setText("" + Cct1);
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		cCA2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct2++;
				ctCAdd2.setText("" + Cct2);
				Ctotal = Ctotal + 200;
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		cCS2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct2--;
				if(Cct2<0){
					Cct2 = 0;
					Ctotal = Ctotal - 0;
				} else {
					Cct2 = Cct2;
					Ctotal = Ctotal - 200;
				}
				ctCAdd2.setText("" + Cct2);
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		cCA3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct3++;
				ctCAdd3.setText("" + Cct3);
				Ctotal = Ctotal + 220;
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		cCS3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Cct3--;
				if(Cct3<0){
					Cct3 = 0;
					Ctotal = Ctotal - 0;
				} else {
					Cct3 = Cct3;
					Ctotal = Ctotal - 220;
				}
				ctCAdd3.setText("" + Cct3);
				ctTotal.setText("Bill Scratch Pad : To Pay tk. " + Ctotal);
			}
		});
		
		COrd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Comopn = new Intent(Comb.this, Done.class);
				startActivity(Comopn);
			}
		});
	}
		
}
