package com.aurionpro.solution.model;

public class CalculateTax {

	private Invoice invoice;
	
	public CalculateTax(Invoice invoice) {
		super();
		this.invoice = invoice;
	}



	public double taxCalculator()
	{
		return invoice.getAmount()* invoice.getTax() /100;
	}
}
