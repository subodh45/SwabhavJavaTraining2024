package com.Aurionpro.Model;

public class PasswordNotValidException extends RuntimeException {

	private String password;

	public PasswordNotValidException(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getMessage()
	{
		return "invalid password. Password Must contain 1 Uppercase ,lowerCase and special Character , Atleast 1 number and It's Length must be 8-20.";
	}
}
