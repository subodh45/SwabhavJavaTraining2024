package com.Aurionpro.Exception;

public class InsufficientBalanceException extends RuntimeException {

	public String getMessage() {
		return "Insufficient balance to withdraw.";
	}
}