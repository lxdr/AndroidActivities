/**
 * This is the ThirdActivity class. It builds an activity with a screen with "third screen"
 * as text output, and a button that allows navigation to the first screen.
 * 
 * @author alexdrawbond
 * @date 2/12/2013
 */
package edu.Drake.androidactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {
	private Button button; 
	private static final String TAG="Second Activity";
	
	/**
	 * Build the activity and its button.
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		button = (Button) findViewById(R.id.button1);  
        button.setOnClickListener(new OnClickListener() 
        {
        	/**
        	 * finish activity and confirm button has been pushed with output to LogCat
        	 * @param v
        	 */
        	@Override
        	public void onClick(View v)
        	{
        		finish();
        		
        		Log.e(TAG, "button pressed");
        		Intent intent = new Intent(v.getContext(), MainActivity.class);
        		startActivity(intent);
        	}
        });
	}

	/**
	 * May I should look up what this does...nah!
	 * @param menu
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
