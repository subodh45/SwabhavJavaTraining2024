package com.aurionpro.violation.test;
import com.aurionpro.violation.model.*;

public class Invoicetest {
public static void main(String[] args) {
	
	Invoice invoice1 = new Invoice("1" , "abcdef", 12345.2 , 8.1);
	
	invoice1.calculateTax();
	invoice1.printInvoice();
	
}
}
