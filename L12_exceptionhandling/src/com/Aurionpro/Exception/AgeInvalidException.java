package com.Aurionpro.Exception;

public class AgeInvalidException extends RuntimeException {

	private int age;
	
	public AgeInvalidException(int age) {
		super();
		this.age = age;
	}



	public String getMessage()
	{
		return "Age is invalid. it must be greater than 18. your age is "+ age;
	}
}
