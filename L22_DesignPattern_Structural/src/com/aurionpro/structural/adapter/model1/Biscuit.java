package com.aurionpro.structural.adapter.model1;

public class Biscuit implements IItems {

	String name;
	double mrp;
	
	
	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return mrp;
	}
	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", mrp=" + mrp + "]";
	}
	
	
	
}
