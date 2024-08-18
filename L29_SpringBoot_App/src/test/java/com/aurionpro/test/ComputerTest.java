package com.aurionpro.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.Computer;
import com.aurionpro.model.Harddisk;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");	
		//Harddisk harddisk = new ClassPathXmlApplicationContext("config.xml");
		Computer computer = (Computer) context.getBean("computer" ,"Computer.class");
				
		System.out.println(computer);
	}

}
