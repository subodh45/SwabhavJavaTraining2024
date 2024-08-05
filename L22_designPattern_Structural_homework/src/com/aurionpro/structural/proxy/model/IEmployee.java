package com.aurionpro.structural.proxy.model;

public interface IEmployee {

	void create(String role,Employee employee);
	void delete(String role, int empId);
	Employee get(int empId);
}
