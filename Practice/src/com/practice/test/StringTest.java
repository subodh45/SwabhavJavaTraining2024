package com.practice.test;

public class StringTest {
public static void main(String[] args) {
	
	String s1= "123";
	String s2 ="123";
	System.out.println(s1);
	//s1 = "12345";
	System.out.println(s1);
	System.out.println(s2);
	
	System.out.println(s1 == s2);
	
	String s3 = new String("123");
	String s4 = new String("123");
	
	System.out.println(s3 == s4);
	System.out.println(s1==s4);
	
	Integer num1 =10;
	Integer num2 =20;
	
	swap(num1,num2);
	
	System.out.println(num1 + " "+ num2);
}

private static void swap(Integer num1, Integer num2) {
	// TODO Auto-generated method stub
	num1=20;
	num2=10;
}
}
