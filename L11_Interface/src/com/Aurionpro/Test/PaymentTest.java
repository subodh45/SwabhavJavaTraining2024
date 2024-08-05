package com.Aurionpro.Test;
import com.Aurionpro.Model.*;

public class PaymentTest {
 public static void main(String[] args) {
	
	 Payment payment;
	 payment =new CreditCardPayment();
	 payment.payBill();
	 payment.redeem();
	 payment.perimeter();
	 System.out.println();
	 
	 payment =new PayPalpayment();
	 payment.payBill();
	 payment.redeem();
	 System.out.println();
	 
	 payment =new BankTransferPayment();
	 payment.payBill();
	 payment.redeem();
}
}
