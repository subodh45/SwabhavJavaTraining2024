package com.aurionpro.structural.proxy.test;
import com.aurionpro.structural.proxy.model.*;

public class ProxyTest {
public static void main(String[] args) {
	
	Employee employee = new Employee("subodh",2);
	Employee employee2 = new Employee("subodh1",1);
	
	IEmployee employeeProxy = new IEmployeeProxy();
	
	employeeProxy.create("admin",employee );
	employeeProxy.create("user",employee2 );
	
	System.out.println(employeeProxy.get(2));
	
}
}
