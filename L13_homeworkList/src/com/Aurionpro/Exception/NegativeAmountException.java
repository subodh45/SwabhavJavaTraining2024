package com.Aurionpro.Exception;

public class NegativeAmountException extends RuntimeException {

	public String getMessage() {
		return "Please Enter Positive Amount.";
	}
}
