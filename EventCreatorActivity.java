package com.example.hackathonapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class EventCreatorActivity extends Activity {

	ListView listView;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);
        
        // Defined Array values to show in ListView
        String[] values = new String[] { "study session", 
                                         "partaaay",
                                         "foooood",
                                         "dinner plz, i b lonely", 
                                         "shooters", 
                                         "need help for orgo", 
                                         "too many nerds #hackduke", 
                                         "this app is lame" 
                                        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter); 
        
        // ListView Item Click Listener
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
                
               // ListView Clicked item index
               int itemPosition     = position;
                  
               switch(itemPosition){
               case 0:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 1:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 2:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 3:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 4:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 5:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 6:
            	   showCreatorPage(listView.getItemAtPosition(itemPosition));
            	   break;
               case 7:
            	   showEndPage();
            	    	   
               }                                
             
              }

         }); 
    }
	
	
	public void showCreatorPage(Object object){
		Intent intent = new Intent(this, CreateEvent.class);
		String message = (String) object;
    	intent.addCategory(message);
    	startActivity(intent);
	}

	public void showEndPage(){
		Intent intent = new Intent(this, EndScreen.class);
		startActivity(intent);
	}
	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_creator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
