package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * This is the SecondActivity class. This activity has a screen with "second screen" as 
 * text output, and a button that allows navigation to a third activity. 
 * 
 * @author alexdrawbond
 * @date 2/13/2013
 */
public class SecondActivity extends Activity {
	private Button button; 
	private static final String TAG="Second Activity";
	
	/**
	 * Build the second activity and its button
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		button = (Button) findViewById(R.id.button1);  
        button.setOnClickListener(new OnClickListener() 
        {
        	/**
        	 * Finish activity and confirm button has been pushed with output to LogCat
        	 * @param v
        	 */
        	@Override
        	public void onClick(View v)
        	{
        		finish();
        		
        		Log.e(TAG, "button pressed");
        		Intent intent = new Intent(v.getContext(), ThirdActivity.class);
        		startActivity(intent);
        	}
        });
	}

}
