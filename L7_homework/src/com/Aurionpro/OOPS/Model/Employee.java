package com.Aurionpro.OOPS.Model;

public class Employee {

	private int employeeId;
	private String empName;
	private int salary;
	
	public int getEmployeeId()
	{
	    return employeeId;	
	}
	
	public int getEmployeeSalary()
	{
	    return salary;	
	}
	
	public String getEmployeeName()
	{
	    return empName;	
	}
	
	public void setEmployeeId(int emp)
	{
	     employeeId =emp;	
	}
	
	public void setEmployeeName(String name)
	{
	     empName =name;	
	}
	
	public void setEmployeeSalary(int salary2)
	{
	     salary =salary2;	
	}
	
}
