package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dish extends Activity{

	Button frA, frS, sscA, sscS, bcA, bcS, ofrA, ofrS, sspA, sspS, mvA, mvS, od;
	TextView dtAdd1, dtAdd2, dtotal, dtAdd3, dtAdd4, dtAdd5, dtAdd6;
	int dct1 = 0, dct2 = 0, dct3 = 0, dct4 = 0, dct5 = 0, dct6 = 0, dttotal = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ful);
		
		frA = (Button) findViewById(R.id.bFRAdd1);
		frS = (Button) findViewById(R.id.bFRSub1);
		sscA = (Button) findViewById(R.id.bSSCAdd2);
		sscS = (Button) findViewById(R.id.bSSCSub2);
		bcA = (Button) findViewById(R.id.bCBBAdd2);
		bcS = (Button) findViewById(R.id.bCBBSub2);
		ofrA = (Button) findViewById(R.id.bOFRBAdd2);
		ofrS = (Button) findViewById(R.id.bOFRBSub2);
		sspA = (Button) findViewById(R.id.bSSPBAdd2);
		sspS = (Button) findViewById(R.id.bSSPBSub2);
		mvA = (Button) findViewById(R.id.bVBAdd2);
		mvS = (Button) findViewById(R.id.bVBSub2);
		od = (Button) findViewById(R.id.bDOrd);
		
		dtAdd1 = (TextView) findViewById(R.id.tvDAmm);
		dtAdd2 = (TextView) findViewById(R.id.tvDAmm2);
		dtAdd3 = (TextView) findViewById(R.id.tvDAmm3);
		dtAdd4 = (TextView) findViewById(R.id.tvDAmm4);
		dtAdd5 = (TextView) findViewById(R.id.tvDAmm5);
		dtAdd6 = (TextView) findViewById(R.id.tvDAmm6);
		dtotal = (TextView) findViewById(R.id.tvDTotal);
		
		frA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct1++;
				dtAdd1.setText("" + dct1);
				dttotal = dttotal + 120;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		frS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct1--;
				if(dct1<0){
					dct1 = 0;
					dttotal = dttotal - 0;
				} else {
					dct1 = dct1;
					dttotal = dttotal - 120;
				}
				dtAdd1.setText("" + dct1);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});

		sscA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct2++;
				dtAdd2.setText("" + dct2);
				dttotal = dttotal + 180;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		sscS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct2--;
				if(dct2<0){
					dct2 = 0;
					dttotal = dttotal - 0;
				} else {
					dct2 = dct2;
					dttotal = dttotal - 180;
				}
				dtAdd2.setText("" + dct2);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
	bcA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct3++;
				dtAdd3.setText("" + dct3);
				dttotal = dttotal + 200;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		bcS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct3--;
				if(dct3<0){
					dct3 = 0;
					dttotal = dttotal - 0;
				} else {
					dct3 = dct3;
					dttotal = dttotal - 200;
				}
				dtAdd3.setText("" + dct3);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});

		ofrA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct6++;
				dtAdd6.setText("" + dct6);
				dttotal = dttotal + 130;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		ofrS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct6--;
				if(dct6<0){
					dct6 = 0;
					dttotal = dttotal - 0;
				} else {
					dct6 = dct6;
					dttotal = dttotal - 130;
				}
				dtAdd6.setText("" + dct6);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});

		sspA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct5++;
				dtAdd5.setText("" + dct5);
				dttotal = dttotal + 200;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		sspS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct5--;
				if(dct5<0){
					dct5 = 0;
					dttotal = dttotal - 0;
				} else {
					dct5 = dct5;
					dttotal = dttotal - 200;
				}
				dtAdd5.setText("" + dct5);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});

		mvA.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct4++;
				dtAdd4.setText("" + dct4);
				dttotal = dttotal + 120;
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});
		
		mvS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dct4--;
				if(dct4<0){
					dct4 = 0;
					dttotal = dttotal - 0;
				} else {
					dct4 = dct4;
					dttotal = dttotal - 120;
				}
				dtAdd4.setText("" + dct4);
				dtotal.setText("Bill Scratch Pad : To Pay tk. " + dttotal);
			}
		});

		
		od.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent doopn = new Intent(Dish.this, Done.class);
				startActivity(doopn);
			}
		});
		
	}
		
}
