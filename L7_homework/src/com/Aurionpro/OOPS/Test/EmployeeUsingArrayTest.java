package com.Aurionpro.OOPS.Test;
import com.Aurionpro.OOPS.Model.*;
import java.util.*;

public class EmployeeUsingArrayTest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Student to be add :");
		int stuNum = sc.nextInt();
		
		EmployeeUsingArray employeeDetail[] = new EmployeeUsingArray[stuNum];
		
		for(int i=0;i<stuNum ;i++)
		{
			System.out.println("Enter Employee ID :");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Employee Name :");
			String name = sc.nextLine();
						
			System.out.println("Enter Employee salary :");
			int salary = sc.nextInt();
			
			employeeDetail[i]= new EmployeeUsingArray(id,name,salary);
			
			System.out.println("Employee Added Successfully.");
		
		}
		
		for(EmployeeUsingArray d: employeeDetail)
		{
			System.out.print("Name: "+ d.getEmployeeName() + " ,emp ID :"+ d.getEmployeeId() +" ,emp Salary:"+ d.getEmployeeSalary());
			System.out.println();
			
		}
		
		
	}
}