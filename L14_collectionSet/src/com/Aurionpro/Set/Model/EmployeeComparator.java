package com.Aurionpro.Set.Model;
import java.util.Comparator;

public class EmployeeComparator {

	public static class EmployeeIdComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return  (employee1.getEmployeeId()-employee2.getEmployeeId());
		}
		
	}
	
	public static class NameComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return employee1.getName().compareToIgnoreCase(employee2.getName());
		}
		
	}
}
