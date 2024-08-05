package com.Aurionpro.ObjectCasthelenics;

public class ConstructionChaining {

	private int height;
	private int width;
	private int length;
	
	public ConstructionChaining()
	{
		this.height = 10;
		this.width = 20;
		this.length = 30;
	}

	public ConstructionChaining(int height, int width) {
	    this();
		this.height = height;
		this.width = width;
		
	}
	
	public ConstructionChaining(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "ConstructionChaining [height=" + height + ", width=" + width + ", length=" + length + "]";
	}
	
	
}
