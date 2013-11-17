package com.example.hackathonapp;

public class User implements Comparable<User>{
	
//	Instance Variables
	public String userName;
	private int ID;
	public int events;
	
	
//	Constructor
	public User(String name){
		userName = name;
		ID = name.hashCode();
	}
	
//	Methods
	public int getID(){
		return ID;
	}
	
	@Override
	public int compareTo(User tempUser) {
		if (this == tempUser)
			return 0;

		return (this.events - tempUser.events);
		
	}

}
