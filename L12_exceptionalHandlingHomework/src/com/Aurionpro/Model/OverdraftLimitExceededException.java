package com.Aurionpro.Model;

public class OverdraftLimitExceededException extends RuntimeException{
	
	public String getMessage()
	{
		return "Withdrawal is greater than OverDraftLimit.";
	}

}
