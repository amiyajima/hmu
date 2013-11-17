package com.example.hackathonapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InviteGuests extends Activity {

	ListView listView;
	
	  @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_events_list);
          
          showDialogue(true);
          
          // Get ListView object from xml
          listView = (ListView) findViewById(R.id.list);
          
          // Examples for the app
          // Friends
          User[] friends = new User[5];
          friends[0] = new User("Bob");
          friends[1] = new User("John");
          friends[2] = new User("Anna");
          friends[3] = new User("Marie");
          
          String[] values = new String[] {"Bob","John", "Anna", 
        		  "Katherine", "Marie", "Andrew"};
        		 
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
                  
                /* // ListView Clicked item index
                 int itemPosition     = position;
                 */
              /*   // ListView Clicked item value
                 String  itemValue    = (String) listView.getItemAtPosition(position);                   
                  // Show Alert 
                  Toast.makeText(getApplicationContext(),
                    "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                    .show();*/
               
                 showDialogue(false);
                 
                 
                }
  
           }); 
      }
	  
	  public void showDialogue(boolean bool){
		  Builder display = new AlertDialog.Builder(this);
		  String message;
		  if (bool)
			  message = "Select friends to invite";
		  else{
			  message = "Event created :-)";
			  Intent intent = new Intent(this, EventShower.class);
			  startActivity(intent);
		  }
		  display.setTitle("Notification");
		  display.setMessage(message);		    		    
		  display.show();
	  }

  }
