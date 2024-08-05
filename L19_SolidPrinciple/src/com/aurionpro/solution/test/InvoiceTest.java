package com.aurionpro.solution.test;
import com.aurionpro.solution.model.*;

public class InvoiceTest {
public static void main(String[] args) {
	
	Invoice invoice = new Invoice("1","abcdef" ,12345,8.2);
	CalculateTax calculateTax = new CalculateTax(invoice);
	InvoicePrinter InvoicePrinter = new InvoicePrinter(invoice ,calculateTax);
	
	InvoicePrinter.printInvoice();
}
}
