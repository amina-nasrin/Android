package com.example.menubook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Snks extends Activity{

	Button cA1, cS1, cA2, cS2, cA3, cS3, cA4, cS4, cA5, cS5, cA6, cS6, o;
	TextView tcA1, tcA2, tcA3, tcA4, tcA5, tcA6, ttotal;
	int ct = 0, ct2 = 0, ct3 =0, ct4 = 0, ct5 = 0, ct6 = 0;
	int total = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snks);
		
		cA1 = (Button) findViewById(R.id.bCBAdd1);
		cS1 = (Button) findViewById(R.id.bCBSub1);
		cA2 = (Button) findViewById(R.id.bCBAdd2);
		cS2 = (Button) findViewById(R.id.bCBSub2);
		cA3 = (Button) findViewById(R.id.bFFAdd2);
		cS3 = (Button) findViewById(R.id.bFFSub2);
		cA4 = (Button) findViewById(R.id.bCPAdd2);
		cS4 = (Button) findViewById(R.id.bCPSub2);
		cA5 = (Button) findViewById(R.id.bBPAdd2);
		cS5 = (Button) findViewById(R.id.bBPSub2);
		cA6 = (Button) findViewById(R.id.bSAdd2);
		cS6 = (Button) findViewById(R.id.bSSub2);
		o = (Button) findViewById(R.id.bOrd);
		
		tcA1 = (TextView) findViewById(R.id.tvAmm);
		tcA2 = (TextView) findViewById(R.id.tvAmm2);
		tcA3 = (TextView) findViewById(R.id.tvAmm3);
		tcA4 = (TextView) findViewById(R.id.tvAmm4);
		tcA5 = (TextView) findViewById(R.id.tvAmm5);
		tcA6 = (TextView) findViewById(R.id.tvAmm6);
		ttotal = (TextView) findViewById(R.id.tvTotal);
		
		cA1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct++;
				tcA1.setText("" + ct);
				total = total + 150;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct--;
				if(ct<0){
					ct = 0;
					tcA1.setText("" + ct);
					total = total - 0;
				} else{
					tcA1.setText("" + ct);
					total = total -150;
				}
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cA2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct2++;
				tcA2.setText("" + ct2);
				total = total + 100;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct2--;
				if(ct2<0){
					ct2 = 0;
					total = total - 0;
				}
				else {
					ct2 = ct2;
					total = total - 100;
				}
				tcA2.setText("" +ct2);
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cA3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct3++;
				tcA3.setText("" + ct3);
				total = total + 80;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct3--;
				if(ct3<0){
					ct3 = 0;
					total = total - 0;
				}
				else {
					ct3 = ct3;
					total = total - 80;
				}
				tcA3.setText("" +ct3);
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cA4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct4++;
				tcA4.setText("" + ct4);
				total = total + 150;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct4--;
				if(ct4<0){
					ct4 = 0;
					total = total - 0;
				}
				else {
					ct4 = ct4;
					total = total - 150;
				}
				tcA4.setText("" +ct4);
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cA5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct5++;
				tcA5.setText("" + ct5);
				total = total + 170;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct5--;
				if(ct5<0){
					ct5 = 0;
					total = total - 0;
				}
				else {
					ct5 = ct5;
					total = total - 170;
				}
				tcA5.setText("" +ct5);
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cA6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct6++;
				tcA6.setText("" + ct6);
				total = total + 100;
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		cS6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ct6--;
				if(ct6<0){
					ct6 = 0;
					total = total - 0;
				}
				else {
					ct6 = ct6;
					total = total - 100;
				}
				tcA6.setText("" +ct6);
				ttotal.setText("Bill Scratch Pad : To Pay tk. " + total);
			}
		});
		
		o.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent oopn = new Intent(Snks.this, Done.class);
				startActivity(oopn);
			}
		});
	}
		
}
