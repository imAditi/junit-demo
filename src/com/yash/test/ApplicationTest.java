/**
 * Prog : Application with multiple projects
 * Author : Aditi Jain
 * Date : 07-09-2018
 * Desc : Create an application class and add application using addApplication method of ApplicationService class. 
*/
package com.yash.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.yash.java.ApplicationService;

public class ApplicationTest {
	@Test
	public void createNew_Application_class_instance() {
		ApplicationService reference_of_ApplicationService = new ApplicationService();
		String details = reference_of_ApplicationService.addApplication( new Application(2,"Login System"));
		assertEquals("id = 2,Name Of Application = Login System", details);
		System.out.println(details);
	}
}

