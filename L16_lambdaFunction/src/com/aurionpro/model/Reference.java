package com.aurionpro.model;

public class Reference {

	public Reference()
	{
	 System.out.println("inside Constructor. ");
	}
	
	public static void StaticPrint()
	{
		System.out.println("Inside sattic method.");
	}
	
	public void NonstaticPrint()
	{
		System.out.println("Inside Nonstatic methods");
	}
}
