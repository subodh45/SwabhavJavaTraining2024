package com.aurionpro.behaviour.observer.model;

public class NegativeAmountException extends RuntimeException {
	
	public String getMessage() {
		return "Please Enter Positive Amount.";
	}
}
