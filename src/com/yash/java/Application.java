package com.yash.java;

public class Application {

	int id;
	String application_name;
	public void Application(int id, String application_name) {
		this.id = id;
		this.application_name = application_name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getApplicationName() {
		return application_name;
	}
}
