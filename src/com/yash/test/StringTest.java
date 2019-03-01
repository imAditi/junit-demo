/**
 * Prog : Test cases for String methods
 * Author : Aditi Jain
 * Date : 07-09-2018
 * Desc : Create StringTest class having multiple test cases which will be testing all the String methods.
*/

package com.yash.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.yash.java.StringDemo;

public class StringTest {
	@Test
	public void evaluateLength() {
		StringDemo st = new StringDemo();
		String s = "Hello";
		int result = st.testStringLength(s);
		assertEquals(5,result);
	}
	
	@Test
	public void evaluateConcat() {
		StringDemo st = new StringDemo();
		String result = (String) st.testStringConcat();
		assertEquals("abcxyz", result);
	}
	
	@Test
	public void evaluateIndexOf() {
		StringDemo st = new StringDemo();
		int result = st.testStringIndexOf(); 
		assertEquals(4, result);	
		}
		
	@Test
	public void evaluateCharAt() {
		StringDemo st = new StringDemo();
		char result = (char)st.testStringCharAt(); 
		assertEquals('e', result);
		}
	
	@Test
	public void evaluateValueOf() {
		StringDemo st = new StringDemo();
		String result = st.testStringValueOf(678908);
		assertEquals("678908", result);
	}
	
	@Test
	public void evaluateEquals() {
		StringDemo st = new StringDemo();
		Boolean result = st.testStringEquals("ADITI", "ADITI");
		assertEquals(true, result);
	}
	
	@Test
	public void evaluateEqualsIgnoreCase() {
		StringDemo st = new StringDemo();
		Boolean result = st.testStringEqualsIgnoreCase("ADITI", "aditi");
		assertEquals(true, result);
	}
	
	@Test
	public void evaluateContains() {
		StringDemo st = new StringDemo();
		Boolean result = st.testStringContains("Aditi", 'd');
		assertEquals(true,result);
	}
	
	@Test
	public void evaluateEndsWith() {
		StringDemo st = new StringDemo();
		int result = st.testStringEndsWith("Juhi");
		assertEquals('i', result);
	}
	
	@Test
	public void evaluateLowerCaseString() {
	StringDemo st = new StringDemo();
	String strr = st.testLowerCaseString("DEVELOPER");
	assertEquals("developer",strr);
	}
	
	@Test
	public void evaluateUpperCaseString() {
	StringDemo st = new StringDemo();
	String strr = st.testUpperCaseString("developer");
	assertEquals("DEVELOPER",strr);
	}
	
	@Test
	public void evaluateSplit() {
	StringDemo st = new StringDemo();
	String result = st.testStringSplit("Explo@re", '@');
	assertEquals("Explo re", result);
	}
	}


