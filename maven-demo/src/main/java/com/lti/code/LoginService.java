package com.lti.code;

import java.util.HashMap;

public class LoginService {

	public HashMap<String, String> users= new HashMap<String, String>();
	public LoginService() {
		users.put("rituraj", "123");
		users.put("saurabh", "456");
		users.put("pradip", "789");
	}
	
	public boolean isValidUser(String username, String Password) {
		if(users.containsKey(username.toLowerCase()) && users.get(username.toLowerCase()).equals(Password)) {
			return true;
		}
		return false;
	}
}
