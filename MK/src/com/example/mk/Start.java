package com.example.mk;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends Activity{

	Button st;
	MediaPlayer trk;
	TextView sr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		st = (Button) findViewById(R.id.bSt);
		trk = MediaPlayer.create(Start.this, R.raw.a);
		sr = (TextView) findViewById(R.id.tvB);
		
		
		st.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(trk.isPlaying()){
					trk.pause();
				} else{
					trk.start();
				}
			}
		});
	
	}
	
		
}
