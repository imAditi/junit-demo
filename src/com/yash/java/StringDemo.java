package com.yash.java;

public class StringDemo {
	public int testStringLength(String str) {
	String s = "Hello";
	int count = 0;
	char[] strCharArray = s.toCharArray();
	for(char c : strCharArray) {
		count ++;
	}
	return count;
}

	public String testStringConcat() {
		String s1 = "abc";
		String s2 = "xyz";
		System.out.println(s1 + s2);
		return s1 + s2;
	}
	
	public int testStringIndexOf() {
		String str = "Hello";
		int index = 0;
		str = str +'\0';
		char[] charArray = str.toCharArray();
		for(int i = 0; charArray[i]!= '\0'; i++) {
			if(charArray[i] == 'o')
			{
				index = i;
			}
		}
		return index;
	}
	
	public char testStringCharAt() {
		String str = "Hello";
		int index = 1;
		char character = 0;
		str = str +'\0';
		char[] charArray = str.toCharArray();
		for(int i = 0; charArray[i]!= '\0'; i++) {
			if(i == index) {
				character = charArray[i];
			}
		}
		return character;
	}
	
	public String testStringValueOf(int x) {
		String str = Integer.toString(x);
		return str;
		}

	public Boolean testStringEquals(String s1, String s2) {
		if(s1.length()!= s2.length())
			return false;
		for(int i = 0;i < s1.length(); i++) {
			if(s1.charAt(i)!= s2.charAt(i))
				return false;
		}
		return true;
	}
	
	public Boolean testStringEqualsIgnoreCase(String s1, String s2) {
		if(s1.length()!= s2.length())
			return false;
		for(int i = 0;i < s1.length(); i++) {
			if(Math.abs((int)s1.charAt(i)-(int)s2.charAt(i))!=32)
				return false;
		}
		return true;
	}
	
	public Boolean testStringContains(String sample, char check) {
		for(int i = 0; i < sample.length(); i++) {
			if(sample.charAt(i) == check)
				return true;
		}
		return false;
	}
	
	public char testStringEndsWith(String sample) {
		return sample.charAt(sample.length() - 1);
	}

	public String testLowerCaseString(String str) {
		String strr="";
		char[] aChar=str.toCharArray();
		for (int i = 0; i< aChar.length; i++) {
			char word = str.charAt(i);
			if (65 <= word && word<=90) {
				word = (char)( (word + 32) ); 
				strr=strr+word;
			}
		}
		System.out.println(strr);
		return strr;
	}
	
	public String testUpperCaseString(String str) {
	String strr="";
	char[] aChar=str.toCharArray();
	for (int i = 0; i< aChar.length; i++) {
	char word = str.charAt(i);
	if (97 <= word && word<=122) {
	word = (char)( (word - 32) ); 
	strr=strr+word;
	}
	}
	System.out.println(strr);
	return strr;
	}
	
	public String testStringSplit(String sample, char c) {
		String s1 ="";
		for(int i=0;i<sample.length();i++) {
			if(sample.charAt(i) == c) {
				s1 = s1 + " ";
			}
			else {
				s1 = s1 + sample.charAt(i);
			}
		}
		return s1;
	}
}

	
	