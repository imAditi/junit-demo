/**
 * Prog : Hello World
 * Author : Aditi Jain
 * Date : 06-09-2018
 * Desc : Print the string.
*/

package com.yash.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.HelloWorldDemo;
public class HelloWorldTest {
	@Test

	public void evaluateReturnedMessage() {

		HelloWorldDemo hwDemo = new HelloWorldDemo();
		String msg = hwDemo.sayHello();
		assertEquals("hello world",msg);	
	
	}
}