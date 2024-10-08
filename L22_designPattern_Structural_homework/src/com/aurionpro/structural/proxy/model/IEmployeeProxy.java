package com.aurionpro.structural.proxy.model;

public class IEmployeeProxy implements IEmployee{

	IEmployee employeeTask;
	
	
	public IEmployeeProxy() {
		super();
		employeeTask = new EmployeeTask();
	}
	
	
	public void create(String role , Employee employee1) {
		
		if(role.equalsIgnoreCase("ADMIN")) {
		  employeeTask.create("admin", employee1);
		  return;
		}
		System.out.println("Access denied");
		
	}

	@Override
	public void delete(String role , int id) {
		if(role.equalsIgnoreCase("ADMIN")) {
			  employeeTask.delete("admin", id);
			  return;
			}
			System.out.println("Access denied");
	}

	@Override
	public Employee get( int empId) {
		return employeeTask.get(empId);		
	}

}
