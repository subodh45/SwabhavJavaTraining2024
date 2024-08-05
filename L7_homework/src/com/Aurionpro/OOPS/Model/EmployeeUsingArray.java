
package com.Aurionpro.OOPS.Model;

public class EmployeeUsingArray {

	private int employeeId;
	private String empName;
	private int salary;
	
	public EmployeeUsingArray(int employeeId ,String empName,int salary)
	{
		this.employeeId =employeeId;
		this.empName = empName;
		this.salary =salary;
	}
	
	public int getEmployeeId()
	{
	    return this.employeeId;	
	}
	
	public int getEmployeeSalary()
	{
	    return this.salary;	
	}
	
	public String getEmployeeName()
	{
	    return this.empName;	
	}
	
	public void setEmployeeId(int emp)
	{
	     this.employeeId = emp;	
	}
	
	public void setEmployeeName(String name)
	{
	     this.empName =name;	
	}
	
	public void setEmployeeSalary(int salary2)
	{
	     this.salary =salary2;	
	}
	
}