package com.aurionpro.solution.test;
import com.aurionpro.solution.model.*;

public class TaxCalculatorTest {
public static void main(String[] args) {
	
	DBLogger dbloger = new DBLogger();
	Filelogger filelogger = new Filelogger();
	
	TaxCalculator taxCalculator = new  TaxCalculator(dbloger,filelogger);
	taxCalculator.CaluclateTax(10000, 0);

	TaxCalculator taxCalculator2 = new  TaxCalculator(dbloger,filelogger);
	System.out.println(taxCalculator2.CaluclateTax(10000, 10));
}
}
