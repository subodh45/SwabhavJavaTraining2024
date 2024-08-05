package com.Aurionpro.Model;

public class Demo {

	private int a=1;
	static private int b=1;
	private int c=1;
	
	public static void increment()
	{
		//a++;
		b++;
		//c++;
	}
	
	public void display()
	{
		System.out.println(a+" "+ b+" "+ c);
	}
	
    
	static{
		    System.out.println("Static inside normal");	
	}
	
	static {
		System.out.println("hello");
	}
}
