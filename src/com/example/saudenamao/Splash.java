package com.example.saudenamao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.splash);

		Thread espera = new Thread(){
			public void run(){
				try{
					sleep(5000);
					
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					startActivity(new Intent(getApplicationContext(),Principal.class));
					finish();
				}
			}
		};
		espera.start();
		
	}
}
