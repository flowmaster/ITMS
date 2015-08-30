package com.flowmaster.dao;

public class LoginDao {

	public boolean isvalidLogin(String name, String password) {

		if (name.equalsIgnoreCase("admin") && password.equals("admin")) {
			return true;
		} else {
			return false;
		}

	}

}
