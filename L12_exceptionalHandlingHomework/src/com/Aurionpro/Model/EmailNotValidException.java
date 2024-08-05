package com.Aurionpro.Model;

public class EmailNotValidException extends RuntimeException {

	private String email;

	public EmailNotValidException(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMessage()
	{
		return "Enter valid email.Your Email is "+  this.getEmail();
	}
	
}
