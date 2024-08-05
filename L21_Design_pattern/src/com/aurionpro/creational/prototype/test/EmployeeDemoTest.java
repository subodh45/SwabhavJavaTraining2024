package com.aurionpro.creational.prototype.test;
import com.aurionpro.creational.prototype.model.*;

import java.util.Scanner;

public class EmployeeDemoTest {
public static void main(String[] args) {
	
	Scanner scanner =  new Scanner(System.in);
	
	System.out.println("enter id : ");
	int id = scanner.nextInt();
	
	System.out.println("enter name ");
	String name = scanner.next();
	
	System.out.println("enter salary");
	double salary = scanner.nextDouble();
	
	System.out.println("enter designation ");
	String designation = scanner.next();
	
	EmployeeDemo employee1 = new EmployeeDemo(id,name,salary,designation);
	
	System.out.println(employee1);
	
	EmployeeDemo employee2 = (EmployeeDemo) employee1.clone(); 
	
	System.out.println(employee2);
}
}
