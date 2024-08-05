package com.aurionpro.model;

public class AreaCalculator {

	public double areaOfCircle(int radius)
	{
		return 3.14*radius *radius;
	}
	
	public int areaOfRectangle(int length,int breadth)
	{
		return length* breadth;
	}
	
	public double areaOfTringle(int base , int height)
	{
		return 0.5*base*height;
	}
}
