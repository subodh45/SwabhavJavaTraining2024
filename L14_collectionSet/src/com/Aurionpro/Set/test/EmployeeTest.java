package com.Aurionpro.Set.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Aurionpro.Set.Model.*;

public class EmployeeTest {
public static void main(String[] args) {
	
	List<Employee>employees = new ArrayList<Employee>();
	
	employees.add(new Employee(1,"jateen",50000));
	employees.add(new Employee(5,"deep",55000));
	employees.add(new Employee(3,"suhas",60000));
	employees.add(new Employee(2,"Subodh",30000));
	
	System.out.println("Before Aorting ");
	printEmployee(employees);
	
	System.out.println("aftr sorting id wise");
	Collections.sort(employees,new EmployeeComparator.EmployeeIdComparator());
	printEmployee(employees);
	
	System.out.println("sorting name wise ");
	Collections.sort(employees,new EmployeeComparator.NameComparator());
	printEmployee(employees);
}

private static void printEmployee(List<Employee> employees) {
	// TODO Auto-generated method stub
	for(Employee employee:employees)
	{
		System.out.println(employee);
	}
}
}
