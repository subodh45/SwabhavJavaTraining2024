package com.aurionpro.violation.test;
import com.aurionpro.violation.model.*;

public class TAxCalculatorTest {
public static void main(String[] args) {
	
	DBLoger dbloger = new DBLoger();
	
	TaxCalculator taxCalculator = new  TaxCalculator(dbloger);
	taxCalculator.CaluclateTax(10000, 0);

	TaxCalculator taxCalculator2 = new  TaxCalculator(dbloger);
	System.out.println(taxCalculator2.CaluclateTax(10000, 10));
}
}
