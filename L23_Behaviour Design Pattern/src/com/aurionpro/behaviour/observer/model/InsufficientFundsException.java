package com.aurionpro.behaviour.observer.model;

public class InsufficientFundsException extends RuntimeException {

	 public String getMessage()
	 {
		 return "Insufficient balance .";
	 }
}
