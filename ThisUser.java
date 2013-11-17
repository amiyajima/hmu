ackage com.example.hackathonapp;

import java.util.HashSet;

public class ThisUser extends User{

//	Instance Variables
	public HashSet<User> friendList;
	private int passwordCode;
	public boolean passwordSet = false;
	
	
//	Constructor
	public ThisUser(String name){
		super(name);
	}
	
//	Methods
	public void setPassword(String newPassword){
		passwordCode = newPassword.hashCode();
		passwordSet = true;
	}
	
	public boolean checkPassword(String check){
		if (!passwordSet){
			return false;
		}
		return (check.hashCode() == passwordCode);
	}
	
	public void addFriend(User friend){
		friendList.add(friend);
	}
	
	public HashSet<User> getEvents(){
		return friendList;
	}
	
}
ackage com.example.hackathonapp;

import java.util.HashSet;

public class ThisUser extends User{

//	Instance Variables
	public HashSet<User> friendList;
	private int passwordCode;
	public boolean passwordSet = false;
	
	
//	Constructor
	public ThisUser(String name){
		super(name);
	}
	
//	Methods
	public void setPassword(String newPassword){
		passwordCode = newPassword.hashCode();
		passwordSet = true;
	}
	
	public boolean checkPassword(String check){
		if (!passwordSet){
			return false;
		}
		return (check.hashCode() == passwordCode);
	}
	
	public void addFriend(User friend){
		friendList.add(friend);
	}
	
	public HashSet<User> getEvents(){
		return friendList;
	}
	
}
