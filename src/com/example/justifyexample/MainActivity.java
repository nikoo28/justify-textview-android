/**
 * Author - Nikhil Lohia
 * Email - nikoo28@outlook.com
 */
package com.example.justifyexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView original;
	private TextViewEx changed;
	private Button justify;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		original = (TextView) findViewById(R.id.original);
		changed = (TextViewEx)findViewById(R.id.changed);
		changed.setText(getResources().getString(R.string.lorum_ipsum),true);
		justify = (Button)findViewById(R.id.justify_button);
		justify.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(original.getVisibility() == View.VISIBLE)
				{
					original.setVisibility(View.INVISIBLE);
					changed.setVisibility(View.VISIBLE);
				}
				else
				{
					original.setVisibility(View.VISIBLE);
					changed.setVisibility(View.INVISIBLE);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
