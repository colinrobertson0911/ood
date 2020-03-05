package com.fdmgroup.mockito;

import java.util.HashSet;
import java.util.Set;

public class LogInManager {
	
	private Set<String> LoggedInUsers = new HashSet<String>();
	
	public boolean logIn(User user) {
		if (user.isLoggedIn()) {
			return false;
		}
		
		user.setLoggedIn(true);
		return LoggedInUsers.add(user.getUsername());
		
	}
	public boolean logOut(User user) {
		if (!user.isLoggedIn()) {
			return false;
		}
		user.setLoggedIn(false);
		return LoggedInUsers.remove(user.getUsername());
	}

}
