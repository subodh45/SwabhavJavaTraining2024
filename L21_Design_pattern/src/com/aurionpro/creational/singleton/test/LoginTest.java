package com.aurionpro.creational.singleton.test;
import com.aurionpro.creational.singleton.model.*;

public class LoginTest {
public static void main(String[] args) {
	
	Login login1 = Login.getLogin();
	login1.Status();
	System.out.println(login1.hashCode());
	
	Login login2 = Login.getLogin();
	login2.Status();
	System.out.println(login2.getLogin());
	
	
}
}
