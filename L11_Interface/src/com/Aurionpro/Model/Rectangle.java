package com.Aurionpro.Model;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
	
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	public void area()
	{
		System.out.println("Area of rectangle is "+ (length *breadth));
		
	}
}
