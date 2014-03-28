package com.stop.and.clear;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	
		private static final String TAG = null;
		
		
		Intent intent;
		
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		    //Toast.makeText(getApplicationContext(), "Warning, Clear Data will delete your progress", Toast.LENGTH_LONG).show();
		    startActivity(new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:com.kutirtech.inmotion")));
		    Log.i("finish", "finish");


		    
	
		
		}
		
		@Override
		public void onPause() {
			super.onPause();
			Log.i("pause", "pause");
			finish();
		}
		
	}
