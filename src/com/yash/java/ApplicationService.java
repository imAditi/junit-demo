package com.yash.java;

public class ApplicationService {
	
	public String addApplication(Application reference_of_Application) {
	int id = reference_of_Application.getId();
	String application_name = reference_of_Application.getApplicationName();
	return "id=" +id+ ",Name Of Application=" +application_name;
	}
	
}
