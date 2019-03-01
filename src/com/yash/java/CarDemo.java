package com.yash.java;

public class CarDemo {
	static int sold;
	static int numberOfCars;
	
	boolean status = false;
	int speed;
	String carType;String carOwner;
	String carName;
	
	public CarDemo() {}
	
	public CarDemo(String carName, int speed, String carType) {
		this.carName = carName;
		this.speed = speed;
		this.carType = carType;
		this.status = false;
		numberOfCars++;
	}
	
	public int  getSpeed() {
		return speed;
	}
	
	public String getCarType() {
		return carType;
	}
	
	public String getCarOwner() {
		return carOwner;
	}
	
	public void setCarOwner(String carOwner) {
		if(status==false) {
			this.carOwner = carOwner;
			sold++;
			status = true;
		}
	}
	
	public int getNumberOfCarsSold() {
		return sold;
	}
	
	public int getNumberOfCarsUnsold() {
		return numberOfCars - sold;
	}
	
	public int getNumberOfCars() {
		return numberOfCars;
	}
}
