package com.Aurionpro.Model;

public class CircleAreaFinder {

	private double radius;
	
	public CircleAreaFinder()
	{
		
	}
	
	public CircleAreaFinder(double radius)
	{
		this.radius =radius;
	}
	
	
    public double getRadius()
    {
    	return this.radius;
    }
    
    public void setRadius(double r)
    {
    	this.radius = r;
    }
	   
	
	public void area()
	{
		double area = 3.14 *this.radius *this.radius;
		System.out.println("Area is "+area);
	}
}
