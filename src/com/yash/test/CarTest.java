/**
 * Prog : Total number of cars sold
 * Author : Aditi Jain
 * Date : 07-09-2018
 * Desc : Calculate the number of cars sold in a car shop.
*/

package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.yash.java.CarDemo;

public class CarTest {
	@Test

	public void testFindSumCompleOfDivisible_ShouldReturn_Sum() {
		
		CarDemo obj1 = new CarDemo("Hyundai Verna", 90, "Sedan");
		CarDemo obj2 = new CarDemo("Tata Tiago", 100, "Hatchback");
		CarDemo obj3 = new CarDemo("Honda City", 150, "Sedan");
		CarDemo obj4 = new CarDemo("XUV 5OO", 200, "SUV");
		
		//obj2.setCarOwner("ADITI");
		//obj3.setCarOwner("RAHUL");
		obj4.setCarOwner("AMAIRA");
		
		//System.out.println(obj1.getCarOwner());
		//System.out.println(obj2.getCarOwner());
		//System.out.println(obj3.getCarOwner());
		//System.out.println(obj4.getCarOwner());
		
		assertEquals(4, obj1.getNumberOfCars());
		assertEquals(3, obj1.getNumberOfCarsUnsold());
		assertEquals(1, obj1.getNumberOfCarsSold());
	}
}