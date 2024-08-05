package com.aurionpro.solution.model;

public class InvoicePrinter {

	private Invoice invoice;
	private CalculateTax calculatetax;
	public InvoicePrinter(Invoice invoice, CalculateTax calculatetax) {
		super();
		this.invoice = invoice;
		this.calculatetax = calculatetax;
	}
	
	public void printInvoice()
	{
		System.out.println("ID "+ invoice.getId()+ " description "+ invoice.getDescription() + " Amount "+invoice.getAmount() + " tax "+ invoice.getTax());
		System.out.println("Tax amount " + calculatetax.taxCalculator());
		System.out.println("total amount "+ (invoice.getAmount()+ calculatetax.taxCalculator()));
	}
}
