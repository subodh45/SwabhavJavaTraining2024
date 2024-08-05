package com.Aurionpro.Model;

public class CreditCardPayment implements Payment {

	public void payBill()
	{
		System.out.println("Bill payment using credit card.");
	}
	
	public  void redeem()
	{
		System.out.println("Redeem through credit card payment.");
	}
}
