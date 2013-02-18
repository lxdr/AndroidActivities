/**
 * This is the Main Activity Class. It builds the Main activity for a simple
 * android application. This activity simply prints "first screen" to the screen
 * and provides a button to navigate to a second screen. 
 * 
 * @author alexdrawbond
 * @date 2/1/2013
 */

package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button button;
	private static final String TAG="MainActivity";
	
	/**
	 * Test
	 * Build the activity and its button. 
	 * @param savedInstanceState
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	System.out.println("hi");
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById(R.id.button1);  
        button.setOnClickListener(new OnClickListener() 
        {
        	/**
        	 * Confirm button has been pushed with output to LogCat
        	 * @param v
        	 */
        	@Override
        	public void onClick(View v)
        	{
        		Log.e(TAG, "button pressed");
        		Intent intent = new Intent(v.getContext(), SecondActivity.class);
        		startActivity(intent);
        	}
        });
    }

    /**
     * Does...something
     * @param menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    } 
}
