package com.aurionpro.test;

import com.aurionpro.model.IGreeting;

public class IGreetingTest {
public static void main(String[] args) {
	
//	IGreeting greet = new IGreeting() {
//	      public void say(String name)
//	     {
//	    	 System.out.println("Hello "+ name);
//	     }
//	};
//	greet.say("Subodh");
//	
	
	IGreeting greet = (name) -> {
		System.out.println("Hello "+name );
	};
	
	greet.say("Subodh");
	
	
}
}
