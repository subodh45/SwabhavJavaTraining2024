package com.aurionpro.structural.proxy.model;

import java.util.LinkedList;
import java.util.List;

public class EmployeeTask implements IEmployee {

	List<Employee> employeeList = new LinkedList();

	public void create(String role, Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee Created .");
		employeeList.add(employee);
	}

	@Override
	public void delete(String role, int empId) {
		// TODO Auto-generated method stub
		for (Employee employee : employeeList) {
			if (employee.getEmpId() == empId) {
				employeeList.remove(empId);
				System.out.println("Remove employee of id " + empId);
				break;	
			}
			System.out.println("employee not found.");
		}

	}
	
	public Employee get(int empId)
	{   Employee employee=null;
	    for(Employee employeeCheck : employeeList)
	    {
	    	if(employeeCheck.empId == empId)
	    	{
	    		employee = employeeCheck;
	    	}
	    }
		return employee;
	}

}
