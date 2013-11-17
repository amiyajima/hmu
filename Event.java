package com.example.hackathonapp;

import android.location.Location;

public class Event {
	
//	Instance Variables
	private String eventTime;
	private String eventName;
	private User eventCreator;
	private Location location;
	
//	Constructor
	public Event(String time, String name, User creator, Location mlocation){
		eventTime = time;
		eventName = name;
		eventCreator = creator;
		location = mlocation;
	}
	
//	Methods
	public String getName(){
		return eventName;
	}
	
	public String getTime(){
		return eventTime;
	}
	
	public Location getLocation(){
		return location;
	}
	
	public User getCreator(){
		return eventCreator;
	}
	
	

}
