package com.Aurionpro.OOPS.Test;
import com.Aurionpro.OOPS.Model.*;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Employee employee  = new Employee();
		
		System.out.println("Enter Employee ID :");
		int id = sc.nextInt();
		employee.setEmployeeId(id);
		
		sc.nextLine();

		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();
		employee.setEmployeeName(name);
		
		System.out.println("Enter Employee salary :");
		int salary = sc.nextInt();
		employee.setEmployeeSalary(salary);
		
		System.out.println("Employee id : "+ employee.getEmployeeId());
		System.out.println("Employee name :"+ employee.getEmployeeName());
		System.out.println("Employee salary : "+ employee.getEmployeeSalary());
		System.out.println();
		
		
        Employee employee2  = new Employee();
		
		System.out.println("Enter Employee ID :");
		id = sc.nextInt();
		employee2.setEmployeeId(id);

		
		System.out.println("Enter Employee salary :");
	    salary = sc.nextInt();
		employee2.setEmployeeSalary(salary);
		
		sc.nextLine();

		System.out.println("Enter Employee Name :");
		name = sc.nextLine();
		employee2.setEmployeeName(name);
		
		System.out.println("Employee id : "+ employee2.getEmployeeId());
		System.out.println("Employee name :"+ employee2.getEmployeeName());
		System.out.println("Employee salary : "+ employee2.getEmployeeSalary());
		
	}
}
