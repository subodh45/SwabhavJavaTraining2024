package com.aurionpro.creational.singleton.model;

public class Login {

	private static Login login;
	
	private Login()
	{
		System.out.println("Login created .");
	}
	
	public void Status()
	{
		System.out.println("login success .");
	}
	
	public static Login getLogin()
	{
		if(login == null)
			login = new Login();
		return login;
	}
}
