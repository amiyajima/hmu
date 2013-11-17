package com.example.hackathonapp;

import android.location.Location;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventsList extends Activity {

	ListView listView;
	
	  @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_events_list);
          
          // Get ListView object from xml
          listView = (ListView) findViewById(R.id.list);
          
          // Examples for the app
          // Friends
          User[] friends = new User[5];
          friends[0] = new User("Bob");
          friends[1] = new User("John");
          friends[2] = new User("Anna");
          friends[3] = new User("Marie");
          
          // Locations
          Location elmo = new Location("Elmo");
          elmo.setLatitude(36.010328); elmo.setLongitude(-78.920631);
          
          Location perkins = new Location("Perkins");
          perkins.setLatitude(36.00206); perkins.setLongitude(-78.938398);
          
          Location shooters = new Location("Shooters");
          shooters.setLatitude(36.123434); shooters.setLatitude(-78.5003222);
          
          Location equad = new Location("E-quad");
          equad.setLatitude(36.003592); equad.setLongitude(-78.940233);
          
          Location centralCampus = new Location("CentralCampus");
          centralCampus.setLatitude(36.003938); centralCampus.setLongitude(-78.929488);
          
          Location edens = new Location("Edens");
          edens.setLatitude(35.998515); edens.setLongitude(-78.936971);
          
          // Defined Array values to show in ListView
          String[] values = new String[] { "Dinner at Elmo's", 
                                           "maths 333 study session @ perkins",
                                           "Edens pizza party",
                                           "Andrew's bday shooters", 
                                           "Touch football @ centralcourts", 
                                           "Hackathon!", 
                                          };
          
          final Event[] events = new Event[6];
          events[0] = new Event("12:00", values[0], friends[3], elmo);
          events[1] = new Event("4:00pm", values[1], friends[1], perkins);
          events[2] = new Event("20:00", values[2], friends[2], edens);
          events[3] = new Event("11:00pm", values[3], friends[1], shooters);
          events[4] = new Event("10:00am", values[4], friends[0], centralCampus);
          events[5] = new Event("00:00", values[5], friends[3], equad);
  
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
                 
              /*   // ListView Clicked item value
                 String  itemValue    = (String) listView.getItemAtPosition(position);                   
                  // Show Alert 
                  Toast.makeText(getApplicationContext(),
                    "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                    .show();*/
               
                 showDialogue(events[itemPosition]);
                 
                 
                }
  
           }); 
      }
	  
	  public void showDialogue(Event event){
		  Builder display = new AlertDialog.Builder(this);
		  display.setTitle(event.getName());
		  display.setMessage(" @ " + event.getTime() + ". Created by " + event.getCreator().userName);		    		    
		  display.show();
	  }

  }
